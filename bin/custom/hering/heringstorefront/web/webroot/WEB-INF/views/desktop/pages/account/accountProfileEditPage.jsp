<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/desktop/template"%>
<%@ taglib prefix="theme" tagdir="/WEB-INF/tags/shared/theme"%>
<%@ taglib prefix="nav" tagdir="/WEB-INF/tags/desktop/nav"%>
<%@ taglib prefix="newsletter" tagdir="/WEB-INF/tags/desktop/newsletter"%>
<%@ taglib prefix="formElement" tagdir="/WEB-INF/tags/desktop/formElement"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags/desktop/common"%>
<%@ taglib prefix="breadcrumb" tagdir="/WEB-INF/tags/desktop/nav/breadcrumb"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>
<c:url var="profileUrl" value="/my-account/profile" />
<template:page pageTitle="${pageTitle}">
    <div id="globalMessages">
        <common:globalMessages />
    </div>
    <div id="main-wrapper">
        <div class="container">
            <header id="page-header">
                <h1>
                    <spring:theme code="text.account.yourAccount" text="Your Account" />
                </h1>
                <div class="breadcrumb">
                    <breadcrumb:breadcrumb breadcrumbs="${breadcrumbs}" />
                </div>
            </header>
            <section class="orders page with-sidebar">
                <nav:accountNav />
                <div class="right">
                    <section id="acc-dados-form">
                        <header>
                            <h2>
                                <spring:theme code="text.account.profile.changePersonalData"
                                    text="Change Personal Data" />
                            </h2>
                        </header>
                        <form:form action="update-profile" method="post"
                            commandName="heringUpdateProfileForm">${profile.subscribeNewsletter }
									<div class="form-row">
                                <formElement:formInputBox idKey="profile.firstName"
                                    labelKey="${pf?'profile.firstName':'register.razaoSocial'}"
                                    path="firstName" inputCSS="text ${pf?'required-letters':''}"
                                    mandatory="true" />
                                <formElement:formInputBox idKey="profile.lastName"
                                    labelKey="${pf?'profile.lastName':'register.nomeFantasia'}"
                                    path="lastName" inputCSS="text ${pf?'required-letters':''}"
                                    mandatory="true" />
                            </div>
                            <div class="form-row">
                                <formElement:formInputBox idKey="profile.cpfcnpj"
                                    labelKey="register.${pf?'cpf':'cnpj'}" path="cpfcnpj"
                                    inputCSS="text" mandatory="true" />
                                <c:if test="${not pf}">
                                    <formElement:formInputBox idKey="profile.rgIe"
                                        labelKey="profile.rgIe" path="rgIe" />
                                    <formElement:formSelectBox idKey="progile.state"
                                        labelKey="profile.state" items="${regions}" path="ufIe"
                                        itemValue="${useShortRegionIso ? 'isocodeShort' : 'isocode'}"
                                        allowEmpty="true" />
                                </c:if>
                                <c:if test="${pf}">
                                    <label for="form-dados-sobrenome" class="no-min-width">Sexo
                                        *:</label>
                                    <div class="radio-group">
                                        <label for="form-dados-sexo-feminino"> <form:radiobutton
                                                idKey="register.gender" labelKey="register.gender"
                                                path="gender" value="FEMALE" /> <spring:theme
                                                code="profile.gender.FEMALE" text="Feminino" />
                                        </label> <label for="form-dados-sexo-masculino"> <form:radiobutton
                                                idKey="register.gender" labelKey="register.gender"
                                                path="gender" value="MALE" /> <spring:theme
                                                code="profile.gender.MALE" text="Masculino" />
                                        </label>
                                    </div>
                                </c:if>
                            </div>
                            <div class="form-row">
                                <formElement:formInputBox idKey="profile.birthday"
                                    labelKey="${pf?'profile.birthday':'register.dataFundacao'}"
                                    path="birthday" inputCSS="text" mandatory="true" />
                            </div>
                            <div class="form-row newsletters">
                                <label>Aceito receber novidades por e-mail das seguintes
                                    marcas:</label>
                                <div class="checkbox-group">
                                    <newsletter:newsletters bases="${basesCode}"
                                        basesChecked="${basesChecked}" />
                                </div>
                            </div>
                            <div class="required-info">
                                <spring:theme code="form.required"
                                    text="Fields marked * are required" />
                            </div>
                            <div class="btn-group">
                                <button type="button" class="btn"
                                    onclick="window.location='${profileUrl}'">
                                    <spring:theme code="text.account.profile.cancel" text="Cancel" />
                                </button>
                                <ycommerce:testId code="profilePage_SaveUpdatesButton">
                                    <button class="btn btn-confirmar" type="submit">
                                        <spring:theme code="text.account.profile.saveUpdates"
                                            text="Save Updates" />
                                    </button>
                                </ycommerce:testId>
                            </div>
                        </form:form>
                    </section>
                </div>
            </section>
        </div>
    </div>
</template:page>
