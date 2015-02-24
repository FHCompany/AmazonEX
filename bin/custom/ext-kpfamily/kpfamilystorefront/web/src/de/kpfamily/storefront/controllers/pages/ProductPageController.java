/*
 * [y] hybris Platform
 * 
 * Copyright (c) 2000-2014 hybris AG
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 */
package de.kpfamily.storefront.controllers.pages;

import de.hybris.platform.acceleratorservices.controllers.page.PageType;
import de.hybris.platform.acceleratorstorefrontcommons.breadcrumb.impl.ProductBreadcrumbBuilder;
import de.hybris.platform.acceleratorstorefrontcommons.constants.WebConstants;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.acceleratorstorefrontcommons.forms.ReviewForm;
import de.hybris.platform.acceleratorstorefrontcommons.forms.validation.ReviewValidator;
import de.hybris.platform.acceleratorstorefrontcommons.util.XSSFilterUtil;
import de.hybris.platform.acceleratorstorefrontcommons.variants.VariantSortStrategy;
import de.hybris.platform.catalog.enums.ProductReferenceTypeEnum;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.AbstractPageModel;
import de.hybris.platform.cms2.servicelayer.services.CMSPageService;
import de.hybris.platform.commercefacades.product.ProductFacade;
import de.hybris.platform.commercefacades.product.ProductOption;
import de.hybris.platform.commercefacades.product.data.BaseOptionData;
import de.hybris.platform.commercefacades.product.data.ImageData;
import de.hybris.platform.commercefacades.product.data.ImageDataType;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commercefacades.product.data.ProductReferenceData;
import de.hybris.platform.commercefacades.product.data.ReviewData;
import de.hybris.platform.commerceservices.url.UrlResolver;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.product.ProductService;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import de.kpfamily.facades.KPProductFacade;
import de.kpfamily.storefront.controllers.ControllerConstants;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.util.GlobalMessages;
import de.kpfamily.storefront.util.MetaSanitizerUtil;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Controller for product details page
 */
@Controller
@Scope("tenant")
@RequestMapping(value = "/**/p")
public class ProductPageController extends AbstractPageController {

    @SuppressWarnings("unused")
    private static final Logger LOG = Logger.getLogger(ProductPageController.class);
    /**
     * We use this suffix pattern because of an issue with Spring 3.1 where a
     * Uri value is incorrectly extracted if it contains on or more '.'
     * characters. Please see https://jira.springsource.org/browse/SPR-6164 for
     * a discussion on the issue and future resolution.
     */
    private static final String PRODUCT_CODE_PATH_VARIABLE_PATTERN = "/{productCode:.*}";
    private static final String REVIEWS_PATH_VARIABLE_PATTERN = "{numberOfReviews:.*}";
    @Resource(name = "productModelUrlResolver")
    private UrlResolver<ProductModel> productModelUrlResolver;
    @Resource(name = "kpProductFacade")
    private KPProductFacade productFacade;
    @Resource(name = "productService")
    private ProductService productService;
    @Resource(name = "productBreadcrumbBuilder")
    private ProductBreadcrumbBuilder productBreadcrumbBuilder;
    @Resource(name = "cmsPageService")
    private CMSPageService cmsPageService;
    @Resource(name = "variantSortStrategy")
    private VariantSortStrategy variantSortStrategy;
    @Resource(name = "reviewValidator")
    private ReviewValidator reviewValidator;


    /**
     * 
     * @param productCode
     * @param model
     * @param request
     * @param response
     * @return
     * @throws CMSItemNotFoundException
     * @throws UnsupportedEncodingException
     *
     * @author jfelipe
     */
    @RequestMapping(value = PRODUCT_CODE_PATH_VARIABLE_PATTERN, method = RequestMethod.GET)
    public String productDetail(@PathVariable("productCode") final String productCode,
            final Model model, final HttpServletRequest request, final HttpServletResponse response)
            throws CMSItemNotFoundException, UnsupportedEncodingException {
        final ProductModel productModel = productService.getProductForCode(productCode);
        final String redirection = checkRequestUrl(request, response,
                productModelUrlResolver.resolve(productModel));
        if (StringUtils.isNotEmpty(redirection)) {
            return redirection;
        }
        updatePageTitle(productModel, model);
        // FIXME: Better call an populator/converter here?
        // populateProductDetailForDisplay(productModel, model, request);
        ProductData productData = productFacade.getProductForCode(productCode);
        model.addAttribute("product", productData);
        model.addAttribute("galleryImages", getGalleryImages(productData));
        // ---
        getRequestContextData(request).setProduct(productModel);
        storeCmsPageInModel(model, getPageForProduct(productModel));
        populateProductData(productData, model);
        model.addAttribute(WebConstants.BREADCRUMBS_KEY, 
                productBreadcrumbBuilder.getBreadcrumbs(productModel));
        // ---
        model.addAttribute(new ReviewForm());
        final List<ProductReferenceData> productReferences = productFacade
                .getProductReferencesForCode(productCode, Arrays.asList(
                        ProductReferenceTypeEnum.SIMILAR, ProductReferenceTypeEnum.ACCESSORIES),
                        Arrays.asList(ProductOption.BASIC, ProductOption.PRICE), null);
        model.addAttribute("productReferences", productReferences);
        model.addAttribute("pageType", PageType.PRODUCT.name());
        final String metaKeywords = MetaSanitizerUtil.sanitizeKeywords(productModel.getKeywords());
        final String metaDescription = MetaSanitizerUtil.sanitizeDescription(productModel
                .getDescription());
        setUpMetaData(model, metaKeywords, metaDescription);
        return getViewForPage(model);
    }


    /**
     * 
     * @param productCode
     * @param galleryPosition
     * @param model
     * @return
     *
     * @author jfelipe
     */
    @RequestMapping(value = PRODUCT_CODE_PATH_VARIABLE_PATTERN + "/zoomImages", method = RequestMethod.GET)
    public String showZoomImages(
            @PathVariable("productCode") final String productCode,
            @RequestParam(value = "galleryPosition", required = false) final String galleryPosition,
            final Model model) {
        final ProductModel productModel = productService.getProductForCode(productCode);
        final ProductData productData = productFacade.getProductForOptions(productModel,
                Collections.singleton(ProductOption.GALLERY));
        final List<Map<String, ImageData>> images = getGalleryImages(productData);
        populateProductData(productData, model);
        if (galleryPosition != null) {
            try {
                model.addAttribute("zoomImageUrl", images.get(Integer.parseInt(galleryPosition))
                        .get("zoom").getUrl());
            } catch (final IndexOutOfBoundsException | NumberFormatException ioebe) {
                model.addAttribute("zoomImageUrl", "");
            }
        }
        return ControllerConstants.Views.Fragments.Product.ZoomImagesPopup;
    }


    /**
     * 
     * @param productCode
     * @param model
     * @param request
     * @return
     *
     * @author jfelipe
     */
    @RequestMapping(value = PRODUCT_CODE_PATH_VARIABLE_PATTERN + "/quickView", method = RequestMethod.GET)
    public String showQuickView(@PathVariable("productCode") final String productCode,
            final Model model, final HttpServletRequest request) {
        final ProductModel productModel = productService.getProductForCode(productCode);
        final ProductData productData = productFacade.getProductForOptions(productModel, Arrays
                .asList(ProductOption.BASIC, ProductOption.PRICE, ProductOption.SUMMARY,
                        ProductOption.DESCRIPTION, ProductOption.CATEGORIES,
                        ProductOption.PROMOTIONS, ProductOption.STOCK, ProductOption.REVIEW,
                        ProductOption.VARIANT_FULL, ProductOption.DELIVERY_MODE_AVAILABILITY));
        sortVariantOptionData(productData);
        populateProductData(productData, model);
        getRequestContextData(request).setProduct(productModel);
        return ControllerConstants.Views.Fragments.Product.QuickViewPopup;
    }


    /**
     * 
     * @param productCode
     * @param form
     * @param result
     * @param model
     * @param request
     * @param redirectAttrs
     * @return
     * @throws CMSItemNotFoundException
     *
     * @author jfelipe
     */
    @RequestMapping(value = PRODUCT_CODE_PATH_VARIABLE_PATTERN + "/review", method = {
            RequestMethod.GET, RequestMethod.POST })
    public String postReview(@PathVariable final String productCode, final ReviewForm form,
            final BindingResult result, final Model model, final HttpServletRequest request,
            final RedirectAttributes redirectAttrs) throws CMSItemNotFoundException {
        getReviewValidator().validate(form, result);
        final ProductModel productModel = productService.getProductForCode(productCode);
        if (result.hasErrors()) {
            updatePageTitle(productModel, model);
            GlobalMessages.addErrorMessage(model, "review.general.error");
            model.addAttribute("showReviewForm", Boolean.TRUE);
            // populateProductDetailForDisplay(productModel, model, request);
            storeCmsPageInModel(model, getPageForProduct(productModel));
            return getViewForPage(model);
        }
        final ReviewData review = new ReviewData();
        review.setHeadline(XSSFilterUtil.filter(form.getHeadline()));
        review.setComment(XSSFilterUtil.filter(form.getComment()));
        review.setRating(form.getRating());
        review.setAlias(XSSFilterUtil.filter(form.getAlias()));
        productFacade.postReview(productCode, review);
        GlobalMessages.addFlashMessage(redirectAttrs, GlobalMessages.CONF_MESSAGES_HOLDER,
                "review.confirmation.thank.you.title");
        return REDIRECT_PREFIX + productModelUrlResolver.resolve(productModel);
    }


    /**
     * 
     * @param productCode
     * @param numberOfReviews
     * @param model
     * @param request
     * @return
     *
     * @author jfelipe
     */
    @RequestMapping(value = PRODUCT_CODE_PATH_VARIABLE_PATTERN + "/reviewhtml/"
            + REVIEWS_PATH_VARIABLE_PATTERN, method = RequestMethod.GET)
    public String reviewHtml(@PathVariable("productCode") final String productCode,
            @PathVariable("numberOfReviews") final String numberOfReviews, final Model model,
            final HttpServletRequest request) {
        final ProductModel productModel = productService.getProductForCode(productCode);
        final List<ReviewData> reviews;
        final ProductData productData = productFacade.getProductForOptions(productModel,
                Arrays.asList(ProductOption.BASIC, ProductOption.REVIEW));
        if ("all".equals(numberOfReviews)) {
            reviews = productFacade.getReviews(productCode);
        } else {
            final int reviewCount = Math.min(Integer.parseInt(numberOfReviews),
                    (productData.getNumberOfReviews() == null ? 0 : productData
                            .getNumberOfReviews().intValue()));
            reviews = productFacade.getReviews(productCode, Integer.valueOf(reviewCount));
        }
        getRequestContextData(request).setProduct(productModel);
        model.addAttribute("reviews", reviews);
        model.addAttribute("reviewsTotal", productData.getNumberOfReviews());
        model.addAttribute(new ReviewForm());
        return ControllerConstants.Views.Fragments.Product.ReviewsTab;
    }


    /**
     * 
     * @param productCode
     * @param model
     * @return
     * @throws CMSItemNotFoundException
     *
     * @author jfelipe
     */
    @RequestMapping(value = PRODUCT_CODE_PATH_VARIABLE_PATTERN + "/writeReview", method = RequestMethod.GET)
    public String writeReview(@PathVariable final String productCode, final Model model)
            throws CMSItemNotFoundException {
        final ProductModel productModel = productService.getProductForCode(productCode);
        model.addAttribute(new ReviewForm());
        setUpReviewPage(model, productModel);
        return ControllerConstants.Views.Pages.Product.WriteReview;
    }


    /**
     * 
     * @param model
     * @param productModel
     * @throws CMSItemNotFoundException
     *
     * @author jfelipe
     */
    protected void setUpReviewPage(final Model model, final ProductModel productModel)
            throws CMSItemNotFoundException {
        final String metaKeywords = MetaSanitizerUtil.sanitizeKeywords(productModel.getKeywords());
        final String metaDescription = MetaSanitizerUtil.sanitizeDescription(productModel
                .getDescription());
        setUpMetaData(model, metaKeywords, metaDescription);
        storeCmsPageInModel(model, getPageForProduct(productModel));
        model.addAttribute("product", productFacade.getProductForOptions(productModel,
                Arrays.asList(ProductOption.BASIC)));
        updatePageTitle(productModel, model);
    }


    /**
     * 
     * @param productCode
     * @param form
     * @param result
     * @param model
     * @param request
     * @param redirectAttrs
     * @return
     * @throws CMSItemNotFoundException
     *
     * @author jfelipe
     */
    @RequestMapping(value = PRODUCT_CODE_PATH_VARIABLE_PATTERN + "/writeReview", method = RequestMethod.POST)
    public String writeReview(@PathVariable final String productCode, final ReviewForm form,
            final BindingResult result, final Model model, final HttpServletRequest request,
            final RedirectAttributes redirectAttrs) throws CMSItemNotFoundException {
        getReviewValidator().validate(form, result);
        final ProductModel productModel = productService.getProductForCode(productCode);
        if (result.hasErrors()) {
            GlobalMessages.addErrorMessage(model, "review.general.error");
            // populateProductDetailForDisplay(productModel, model, request);
            setUpReviewPage(model, productModel);
            return ControllerConstants.Views.Pages.Product.WriteReview;
        }
        final ReviewData review = new ReviewData();
        review.setHeadline(XSSFilterUtil.filter(form.getHeadline()));
        review.setComment(XSSFilterUtil.filter(form.getComment()));
        review.setRating(form.getRating());
        review.setAlias(XSSFilterUtil.filter(form.getAlias()));
        productFacade.postReview(productCode, review);
        GlobalMessages.addFlashMessage(redirectAttrs, GlobalMessages.CONF_MESSAGES_HOLDER,
                "review.confirmation.thank.you.title");
        return REDIRECT_PREFIX + productModelUrlResolver.resolve(productModel);
    }


    /**
     * 
     * @param exception
     * @param request
     * @return
     *
     * @author jfelipe
     */
    @ExceptionHandler(UnknownIdentifierException.class)
    public String handleUnknownIdentifierException(final UnknownIdentifierException exception,
            final HttpServletRequest request) {
        request.setAttribute("message", exception.getMessage());
        return FORWARD_PREFIX + "/404";
    }


    /**
     * 
     * @param productModel
     * @param model
     *
     * @author jfelipe
     */
    protected void updatePageTitle(final ProductModel productModel, final Model model) {
        storeContentPageTitleInModel(model,
                getPageTitleResolver().resolveProductPageTitle(productModel));
    }


    // /**
    // *
    // * @param productModel
    // * @param model
    // * @param request
    // * @throws CMSItemNotFoundException
    // *
    // * @author jfelipe
    // */
    // protected void populateProductDetailForDisplay(final ProductModel productModel,
    // final Model model, final HttpServletRequest request) throws
    // CMSItemNotFoundException {
    // getRequestContextData(request).setProduct(productModel);
    // final ProductData productData = productFacade.getProductForOptions(productModel,
    // Arrays
    // .asList(ProductOption.BASIC, ProductOption.PRICE, ProductOption.SUMMARY,
    // ProductOption.DESCRIPTION, ProductOption.GALLERY, ProductOption.CATEGORIES,
    // ProductOption.REVIEW, ProductOption.PROMOTIONS,
    // ProductOption.CLASSIFICATION, ProductOption.VARIANT_FULL,
    // ProductOption.STOCK, ProductOption.VOLUME_PRICES,
    // ProductOption.DELIVERY_MODE_AVAILABILITY));
    // sortVariantOptionData(productData);
    // storeCmsPageInModel(model, getPageForProduct(productModel));
    // populateProductData(productData, model);
    // model.addAttribute(WebConstants.BREADCRUMBS_KEY,
    // productBreadcrumbBuilder.getBreadcrumbs(productModel));
    // }
    /**
     * 
     * @param productData
     * @param model
     *
     * @author jfelipe
     */
    protected void populateProductData(final ProductData productData, final Model model) {
        model.addAttribute("product", productData);
    }


    /**
     * 
     * @param productData
     *
     * @author jfelipe
     */
    protected void sortVariantOptionData(final ProductData productData) {
        if (CollectionUtils.isNotEmpty(productData.getBaseOptions())) {
            for (final BaseOptionData baseOptionData : productData.getBaseOptions()) {
                if (CollectionUtils.isNotEmpty(baseOptionData.getOptions())) {
                    Collections.sort(baseOptionData.getOptions(), variantSortStrategy);
                }
            }
        }
        if (CollectionUtils.isNotEmpty(productData.getVariantOptions())) {
            Collections.sort(productData.getVariantOptions(), variantSortStrategy);
        }
    }


    /**
     * 
     * @param productData
     * @return
     *
     * @author jfelipe
     */
    protected List<Map<String, ImageData>> getGalleryImages(final ProductData productData) {
        final List<Map<String, ImageData>> galleryImages = new ArrayList<>();
        if (CollectionUtils.isNotEmpty(productData.getImages())) {
            final List<ImageData> images = new ArrayList<>();
            for (final ImageData image : productData.getImages()) {
                if (ImageDataType.GALLERY.equals(image.getImageType())) {
                    images.add(image);
                }
            }
            Collections.sort(images, new Comparator<ImageData>() {

                @Override
                public int compare(final ImageData image1, final ImageData image2) {
                    return image1.getGalleryIndex().compareTo(image2.getGalleryIndex());
                }
            });
            if (CollectionUtils.isNotEmpty(images)) {
                int currentIndex = images.get(0).getGalleryIndex().intValue();
                Map<String, ImageData> formats = new HashMap<String, ImageData>();
                for (final ImageData image : images) {
                    if (currentIndex != image.getGalleryIndex().intValue()) {
                        galleryImages.add(formats);
                        formats = new HashMap<>();
                        currentIndex = image.getGalleryIndex().intValue();
                    }
                    formats.put(image.getFormat(), image);
                }
                if (!formats.isEmpty()) {
                    galleryImages.add(formats);
                }
            }
        }
        return galleryImages;
    }


    /**
     * 
     * @return
     *
     * @author jfelipe
     */
    protected ReviewValidator getReviewValidator() {
        return reviewValidator;
    }


    /**
     * 
     * @param product
     * @return
     * @throws CMSItemNotFoundException
     *
     * @author jfelipe
     */
    protected AbstractPageModel getPageForProduct(final ProductModel product)
            throws CMSItemNotFoundException {
        return cmsPageService.getPageForProduct(product);
    }
}
