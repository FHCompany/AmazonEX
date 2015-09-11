<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ attribute name="order" required="true"
    type="de.hybris.platform.commercefacades.order.data.OrderData"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/desktop/product"%>
<%@ taglib prefix="theme" tagdir="/WEB-INF/tags/shared/theme"%>
<%@ taglib prefix="format" tagdir="/WEB-INF/tags/shared/format"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<section id="shipping-method" class="section-block">
    <header>
        <h2><spring:theme code="text.fliegercommerce.texto114"/>:</h2>
    </header>
    <dl>
        <dt><spring:theme code="text.fliegercommerce.texto115"/>:</dt>
        <c:if test="${order.deliveryMode.name == 'TFA' && order.trackingID != '' }">
            <dd>
                <a class=""
                    href="http://www.transfolha.com.br/outros/pesquisahttpentrega.asp?scliente=000539&schave=6b7e676029&spesquisa=generico&sdado=${order.trackingID}"
                    target="_blank"> ${order.deliveryMode.name} </a>
            </dd>
        </c:if>
        <c:if test="${order.deliveryMode.name == 'CORREIOS'}">
            <dd>
                <a class=""
                    href="http://websro.correios.com.br/sro_bin/txect01$.querylist?p_lingua=001&p_tipo=001&p_cod_uni=${order.trackingID}"
                    target="_blank">
            </dd>
				${order.trackingID}
				</a>
        </c:if>
        <c:if test="${order.deliveryMode.name == 'JTT'}">
            <dd>
                <a class="" href="http://www.jttlog.com.br/consulta_nf.php?nf=${order.trackingID}"
                    target="_blank">
            </dd>
				${order.trackingID}
				</a>
        </c:if>
        <c:if test="${order.trackingID eq ''}">
            <dd>${order.deliveryMode.name}</dd>
        </c:if>
    </dl>
</section>
