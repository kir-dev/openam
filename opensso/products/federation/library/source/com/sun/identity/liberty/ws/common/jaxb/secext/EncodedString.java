//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:12 DU CEST 
//


package com.sun.identity.liberty.ws.common.jaxb.secext;


/**
 * This type is used for elements containing stringified binary data.
 * Java content class for EncodedString complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/home/aldaris/NetBeansProjects/openam/opensso/products/federation/library/xsd/liberty/secext.xsd line 56)
 * <p>
 * <pre>
 * &lt;complexType name="EncodedString">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://schemas.xmlsoap.org/ws/2003/06/secext>AttributedString">
 *       &lt;attribute name="EncodingType" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface EncodedString
    extends com.sun.identity.liberty.ws.common.jaxb.secext.AttributedString
{


    /**
     * Gets the value of the encodingType property.
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.namespace.QName}
     */
    javax.xml.namespace.QName getEncodingType();

    /**
     * Sets the value of the encodingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.namespace.QName}
     */
    void setEncodingType(javax.xml.namespace.QName value);

}