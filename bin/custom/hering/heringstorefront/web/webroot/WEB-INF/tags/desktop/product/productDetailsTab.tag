<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ attribute name="product" required="true"
    type="de.hybris.platform.commercefacades.product.data.ProductData"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/desktop/template"%>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/desktop/product"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>
<div class="tab">
    <ycommerce:testId code="productDetails_content_label">
        <div class="desc">${product.description}</div>
    </ycommerce:testId>
    <h3>
        <spring:theme code="product.product.caracteristicas" />
    </h3>
    <product:productDetailsClassifications product="${product}" />
</div>
