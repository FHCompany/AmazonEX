package de.kpfamily.facades.impl;

import java.util.Arrays;
import java.util.List;

import de.hybris.platform.commercefacades.product.ProductOption;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commercefacades.product.impl.DefaultProductFacade;
import de.hybris.platform.core.model.product.ProductModel;
import de.kpfamily.facades.KPProductFacade;

/**
 * 
 * @author jfelipe
 *
 */
public class DefaultKPProductFacade extends DefaultProductFacade<ProductModel>
        implements KPProductFacade {

    
    /**
     * 
     * @author jfelipe
     */
    @Override
    public ProductData getProductForCode(String code) {
        final List<ProductOption> options = Arrays.asList(ProductOption.BASIC, ProductOption.PRICE,
                ProductOption.SUMMARY, ProductOption.DESCRIPTION, ProductOption.CATEGORIES,
                ProductOption.PROMOTIONS, ProductOption.STOCK, ProductOption.REVIEW,
                ProductOption.VARIANT_FULL, ProductOption.DELIVERY_MODE_AVAILABILITY);
        ProductData productData = getProductForCodeAndOptions(code, options);
        return productData;
    }
    
    
    
    /**
     * 
     * @param source
     * @param model
     * @param request
     * @throws CMSItemNotFoundException
     *
     * @author jfelipe
     */
//    protected void populateProductDetailForDisplay(final ProductModel source,
//            final ProductData target) {
//        getRequestContextData(request).setProduct(source);
//        final ProductData productData = getProductForOptions(source, Arrays
//                .asList(ProductOption.BASIC, ProductOption.PRICE, ProductOption.SUMMARY,
//                        ProductOption.DESCRIPTION, ProductOption.GALLERY, ProductOption.CATEGORIES,
//                        ProductOption.REVIEW, ProductOption.PROMOTIONS,
//                        ProductOption.CLASSIFICATION, ProductOption.VARIANT_FULL,
//                        ProductOption.STOCK, ProductOption.VOLUME_PRICES,
//                        ProductOption.DELIVERY_MODE_AVAILABILITY));
//        sortVariantOptionData(productData);
//        storeCmsPageInModel(model, getPageForProduct(source));
//        populateProductData(productData, model);
//        model.addAttribute(WebConstants.BREADCRUMBS_KEY,
//                productBreadcrumbBuilder.getBreadcrumbs(source));
//    }

}