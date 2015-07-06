﻿<?xml version="1.0" encoding="utf-8" ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="xml" encoding="utf-8" standalone="yes"/>
	<xsl:template match="/">
		<Loja>
			<xsl:attribute name="nome">
				 <xsl:value-of select="products/storeName" />
				 <xsl:text>webstore</xsl:text>
			</xsl:attribute>
			<xsl:apply-templates select="products/product" />
		</Loja>
	</xsl:template>
	<xsl:template match="product">
		<xsl:if test="not(contains(code,'_'))">
		<!-- <xsl:if test="productTotalStock > 0 and firstVariantPrice > 0"> -->
			<curproduto>
				<idproduto><xsl:value-of select="code"/></idproduto>
				<link><xsl:value-of select="url"/></link>
				<imagem><xsl:value-of select="image"/></imagem>
				<categoria>
					<xsl:choose>
						<xsl:when test="gender = 'MALE'">Masculino</xsl:when>				
						<xsl:when test="gender = 'FEMALE'">Feminino</xsl:when>
						<xsl:otherwise>Unissex</xsl:otherwise>
					</xsl:choose>;<xsl:value-of select="category"/>
				</categoria>
				<nomeproduto><xsl:value-of select="name"/> [<xsl:value-of select="availableVariantColors"/>] [<xsl:value-of select="availableVariantSizes"/>]</nomeproduto>
				<descproduto><xsl:value-of select="description"/></descproduto>
				<valor>
					<xsl:choose>
						<xsl:when test="firstVariantPrice &gt; 0">
							<xsl:value-of select="firstVariantPrice"/>
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="price"/>
						</xsl:otherwise>
					</xsl:choose>
				</valor>
				<cor><xsl:value-of select="availableVariantColors"/></cor>
				<tamanho><xsl:value-of select="availableVariantSizes"/></tamanho>
			</curproduto>
		<!-- </xsl:if> -->
		</xsl:if>
	</xsl:template>
</xsl:stylesheet>
