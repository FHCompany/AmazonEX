<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="formElement" tagdir="/WEB-INF/tags/desktop/formElement"%>
<%@ taglib prefix="theme" tagdir="/WEB-INF/tags/shared/theme"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags/desktop/common"%>
<link rel="stylesheet" href="${themeResourcePath}/assets/fonts/steelfish.css">
<link rel="stylesheet" type="text/css" media="all" href="${themeResourcePath}/assets/css/reset.css" />
<link rel="stylesheet" type="text/css" media="all" href="${themeResourcePath}/assets/css/base.css" />
<link rel="stylesheet" type="text/css" media="all"
    href="${themeResourcePath}/assets/css/pages/identificacao.css" />
<style>
html, body {
	background: transparent;
}

.modal {
	display: block;
}
</style>
<section id="modal-senha-recuperacao" class="modal">
    <header>
        <h1>
            <spring:theme code="forgottenPwd.titleHering" />
        </h1>
    </header>
    <div id="globalMessages">
        <common:globalMessages />
    </div>
    <p>
        <spring:theme code="forgottenPwd.descriptionHering" />
    </p>
    <form:form method="post" commandName="forgottenPwdForm">
        <div class="f-row">
            <formElement:formInputBox idKey="forgottenPwd.email" labelKey="forgottenPwd.email"
                path="email" inputCSS="text" mandatory="false" hideInputErrorOnField="true" />
        </div>
        <div class="f-row">
            <span class="skip"><form:errors path="email" /></span>
        </div>
        <div class="f-row">
            <button type="submit" class="btn btn-enviar">
                <spring:theme code="forgottenPwd.submitHering" />
            </button>
        </div>
    </form:form>
</section>
