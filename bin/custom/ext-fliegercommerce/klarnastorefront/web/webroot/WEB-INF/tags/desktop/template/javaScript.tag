<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://granule.com/tags" prefix="g" %>

<c:url value="/" var="siteRootUrl"/>

<c:choose>
	<c:when test="${cssCompression}"><g:compress>
		<%@ include file="compressables/js.tag" %>
	</g:compress></c:when>
	<c:otherwise>
		<%@ include file="compressables/js.tag" %>
	</c:otherwise>
</c:choose>

<%-- Custom ACC JS --%>
<script type="text/javascript" src="${commonResourcePath}/js/acc.common.js"></script>
<script type="text/javascript">
	/*<![CDATA[*/
	<%-- Define a javascript variable to hold the content path --%>
	ACC.common.contextPath = "${request.contextPath}";
	ACC.common.commonResourcePath = "${commonResourcePath}";
	ACC.common.themeResourcePath = "${themeResourcePath}";
	ACC.common.siteResourcePath = "${siteResourcePath}";
	ACC.common.rootPath = "${siteRootUrl}";
	/*]]>*/
</script>

<script src="https://cdn.klarna.com/public/kitt/core/v1.0/js/klarna.min.js" ></script>  
<script src="https://cdn.klarna.com/public/kitt/toc/v1.1/js/klarna.terms.min.js" ></script>


<script type="text/javascript" src="${commonResourcePath}/js/acc.cms.js"></script>
<script type="text/javascript" src="${commonResourcePath}/js/acc.product.js"></script>
<script type="text/javascript" src="${commonResourcePath}/js/acc.refinements.js"></script>


<%-- Google maps API --%>
<c:if test="${!empty googleApiVersion}">
	<script type="text/javascript" src="http://maps.googleapis.com/maps/api/js?v=${googleApiVersion}&key=${googleApiKey}&sensor=false"></script>
</c:if>

<script type="text/javascript">
	/*<![CDATA[*/
	jQuery(document).ready(function()
	{
		jQuery('.span-4 .jcarousel-skin').jcarousel({
			// Configuration goes here
			vertical: true
		});

		jQuery('.span-10 .jcarousel-skin').jcarousel({
			// Configuration goes here

		});

		jQuery('.span-24 .jcarousel-skin').jcarousel({
			// Configuration goes here

		});
	});
	/*]]>*/
</script>

<%-- Fire Add This sharing button on Click not Hover --%>
<script type="text/javascript">
	/*<![CDATA[*/
	var addthis_config = {
		ui_click: true
	};
	/*]]>*/
</script>

<c:if test="${currentLanguage.isocode eq 'en'}">

	<script type="text/javascript" src="${commonResourcePath}/js/jquery.pstrength-1.2.min.js"></script>

	<script type="text/javascript">
		/*<![CDATA[*/
		$(function() {
			$('.strength').pstrength();
		});
		/*]]>*/
	</script>

</c:if>

<script type="text/javascript">
	/*<![CDATA[*/
	$(window).load(function() {
		$(".modal").colorbox({
			onComplete: function() {
			    ACC.common.refreshScreenReaderBuffer();
			},
			onClosed: function() {
				ACC.common.refreshScreenReaderBuffer();
			}
		});
		$("div#homepage_slider").slideView({toolTip: true, ttOpacity: 0.6, autoPlay: true, autoPlayTime: 8000})
	});
	/*]]>*/
</script>
