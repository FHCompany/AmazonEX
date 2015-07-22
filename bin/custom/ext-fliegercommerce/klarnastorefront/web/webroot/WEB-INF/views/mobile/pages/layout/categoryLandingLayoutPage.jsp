<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/mobile/template"%>
<%@ taglib prefix="cms" uri="/cms2lib/cmstags/cmstags.tld"%>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags/mobile/common"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<template:page pageTitle="${pageTitle}">
	<div id="globalMessages">
		<common:globalMessages />
	</div>
	<div id="top-banner" class="homebanner">
		<h6 class="descriptionHeadline"><spring:theme code="text.headline.homebanner" text="Top Banner"/></h6>
		<cms:slot var="feature" contentSlot="${slots.CategoryImageBanners}">
			<div id="categoryImageBanners" class="span-24 cms_banner_slot">
				<cms:component component="${feature}" />
			</div>
		</cms:slot>
	</div>
	<div class="mainNavigation" data-role="content" data-theme="e" data-content-theme="e">
		<h6 class="descriptionHeadline"><spring:theme code="text.headline.productcategories" text="Product categories"/></h6>
		<ul data-role="listview" data-inset="true" data-theme="e">
			<cms:slot var="component" contentSlot="${slots['NavigationBar']}">
				<cms:component component="${component}" />
			</cms:slot>
		</ul>
	</div>
</template:page>
