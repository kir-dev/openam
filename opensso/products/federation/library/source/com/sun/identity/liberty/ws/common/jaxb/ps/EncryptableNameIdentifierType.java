//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:12 DU CEST 
//


package com.sun.identity.liberty.ws.common.jaxb.ps;


/**
 * Java content class for EncryptableNameIdentifierType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/home/aldaris/NetBeansProjects/openam/opensso/products/federation/library/xsd/liberty/lib-arch-protocols-schema.xsd line 159)
 * <p>
 * <pre>
 * &lt;complexType name="EncryptableNameIdentifierType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:oasis:names:tc:SAML:1.0:assertion>NameIdentifierType">
 *       &lt;attribute name="IssueInstant" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Nonce" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface EncryptableNameIdentifierType
    extends com.sun.identity.liberty.ws.common.jaxb.assertion.NameIdentifierType
{


    /**
     * Gets the value of the nonce property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getNonce();

    /**
     * Sets the value of the nonce property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setNonce(java.lang.String value);

    /**
     * Gets the value of the issueInstant property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Calendar}
     */
    java.util.Calendar getIssueInstant();

    /**
     * Sets the value of the issueInstant property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Calendar}
     */
    void setIssueInstant(java.util.Calendar value);

}