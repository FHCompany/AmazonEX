<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="details" tagdir="/WEB-INF/tags/desktop/showcaseproductdetail" %>
<%@ attribute name="className" required="true" type="java.lang.String" %>
<%@ attribute name="products" required="true" type="java.util.ArrayList" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="bazaarvoice" tagdir="/WEB-INF/tags/addons/bazaarvoice/desktop/bazaarvoice"%>

<c:forEach items="${products}" var="product" varStatus="status">
	<c:url var="productUrl" value="${product.url}"></c:url>
	<div class="box150102 ${className}">
		<div class="thumbnail photo">
			<a href="${productUrl}" class="productMainLink">
				<details:image images="${product.previewImages}" format="store"/>
			</a>
		</div> 	
		<div class="info">
			<details:title productName="${product.name}" productUrl="${productUrl}"/>
			<%--<details:colors colors="${product.colors}"/>	
			<details:sizes sizes="${product.sizes}"/>--%>	
			<details:prices product="${product}"/>
			<span class="glyphicon stars">
				<bazaarvoice:inlineRatings product="${product}"/>
			</span>
			<details:stamps product="${product}"/>
			<%--<details:addtocart/>
			<details:viewmore productUrl="${productUrl}"/>--%>	
	    </div>
	</div>
	<c:if test="${searchPageData.pagination.currentPage eq 0 and status.count eq 6}">
		<c:url var="productUrl" value="${product.url}"></c:url>
		<div class="box150102 ${className}">
			<cms:pageSlot position="Section3A" var="component">
	        	<cms:component component="${component}" />
	    	</cms:pageSlot>
		</div>
	</c:if>
	<c:if test="${searchPageData.pagination.currentPage eq 0 and status.count eq 13}">
		<c:url var="productUrl" value="${product.url}"></c:url>
		<div class="box150102 ${className}">
			<cms:pageSlot position="Section3B" var="component">
	        	<cms:component component="${component}" />
	    	</cms:pageSlot>
		</div>
	</c:if>
	<c:if test="${searchPageData.pagination.currentPage eq 0 and status.count eq 21}">
		<c:url var="productUrl" value="${product.url}"></c:url>
		<div class="box150102 ${className}">
			<cms:pageSlot position="Section3C" var="component">
	        	<cms:component component="${component}" />
	    	</cms:pageSlot>
		</div>
	</c:if>
</c:forEach>


<%-- code original
<c:forEach items="${products}" var="product" varStatus="status">
	<c:url var="productUrl" value="${product.url}"></c:url>
	<div class="product ${className}">
		<div class="photo">
			<a href="${productUrl}" class="productMainLink">
				<details:image images="${product.previewImages}" format="store"/>
			</a>
		</div> 	
		<div class="info">
			<details:title productName="${product.name}" productUrl="${productUrl}"/>
			<details:stamps product="${product}"/>
			<details:colors colors="${product.colors}"/>	
			<details:sizes sizes="${product.sizes}"/>
			<details:prices product="${product}"/> 
			<details:addtocart/>
			<details:viewmore productUrl="${productUrl}"/>	
	    </div>
	</div>
</c:forEach>
--%>