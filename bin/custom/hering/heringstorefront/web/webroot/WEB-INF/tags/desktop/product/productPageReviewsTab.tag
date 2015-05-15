<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ attribute name="product" required="true"
    type="de.hybris.platform.commercefacades.product.data.ProductData"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="formElement" tagdir="/WEB-INF/tags/desktop/formElement"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/desktop/template"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:url value="${product.url}/reviewhtml/3" var="getPageOfReviewsUrl" />
<c:url value="${product.url}/reviewhtml/all" var="getAllReviewsUrl" />
<c:url value="${product.url}/review" var="productReviewActionUrl" />
<div class="tab reviews">
    <div id="reviews" data-reviews="${getPageOfReviewsUrl}" data-allreviews="${getAllReviewsUrl}"></div>
    <div id="modal-avaliacao">
        <form:form method="post" action="${productReviewActionUrl}" commandName="reviewForm">
            <div class="f-row">
                <formElement:formInputBox idKey="review.headline" labelKey="review.headline"
                    path="headline" inputCSS="text" mandatory="true" />
            </div>
            <div class="f-row">
                <formElement:formTextArea idKey="review.comment" labelKey="review.comment"
                    path="comment" areaCSS="textarea" mandatory="true" />
            </div>
            <div class="f-row">
                <label><spring:theme code="review.rating" /></label>
                <div class="stars">
                    <span class="star active"></span> <span class="star active"></span> <span
                        class="star active"></span> <span class="star active"></span> <span
                        class="star active"></span> <input type="hidden" name="rating" id="rating"
                        value="5">
                </div>
            </div>
            <div class="f-row">
                <formElement:formInputBox idKey="alias" labelKey="review.alias" path="alias"
                    inputCSS="text" mandatory="true" />
            </div>
            <button type="submit" onClick="submitAvaliacao();"
                class="btn btn-big submitReviewHandler" value="<spring:theme code="review.submit"/>">
                <spring:theme code="review.submit" />
            </button>
        </form:form>
        <div id="feed" style="display: none;">
            <h3 style="font-size: 18px; font-family: 'DIN-Bold', sans-serif;">Avalia��o</h3>
            <div class="feedback"
                style="color: #444; font-size: 16px; text-shadow: none; font: inherit; font-weight: bold;"></div>
        </div>
        <script type="text/javascript">
                                    function submitAvaliacao() {
                                        if (document.getElementById("review.headline").value.length == 0) {
                                            //
                                        } else {
                                            if (document.getElementById("review.comment").value.length == 0) {
                                                //		
                                            } else {
                                                if (document.getElementById("alias").value.length == 0) {
                                                    //
                                                } else {
                                                    //document.getElementById("feed").style.display = "block";
                                                    window.setTimeout(function() {
                                                        fancyBoxAvaliacao()
                                                    }, 1000);
                                                }
                                            }
                                        }
                                    }
                                    function fancyBoxAvaliacao() {
                                        $.fancybox({
                                            href : "#feed"
                                        });
                                    }
                                </script>
    </div>
</div>
