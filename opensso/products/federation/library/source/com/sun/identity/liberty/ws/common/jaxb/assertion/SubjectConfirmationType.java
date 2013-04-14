//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:12 DU CEST 
//


package com.sun.identity.liberty.ws.common.jaxb.assertion;


/**
 * Java content class for SubjectConfirmationType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/home/aldaris/NetBeansProjects/openam/opensso/products/federation/library/xsd/liberty/cs-sstc-schema-assertion-01.xsd line 143)
 * <p>
 * <pre>
 * &lt;complexType name="SubjectConfirmationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:1.0:assertion}ConfirmationMethod" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:1.0:assertion}SubjectConfirmationData" minOccurs="0"/>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}KeyInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface SubjectConfirmationType {


    /**
     * Gets the value of the keyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.liberty.ws.common.jaxb.xmlsig.KeyInfoType}
     *     {@link com.sun.identity.liberty.ws.common.jaxb.xmlsig.KeyInfoElement}
     */
    com.sun.identity.liberty.ws.common.jaxb.xmlsig.KeyInfoType getKeyInfo();

    /**
     * Sets the value of the keyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.liberty.ws.common.jaxb.xmlsig.KeyInfoType}
     *     {@link com.sun.identity.liberty.ws.common.jaxb.xmlsig.KeyInfoElement}
     */
    void setKeyInfo(com.sun.identity.liberty.ws.common.jaxb.xmlsig.KeyInfoType value);

    /**
     * Gets the value of the subjectConfirmationData property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.liberty.ws.common.jaxb.assertion.SubjectConfirmationDataElement}
     *     {@link org.w3._2001.xmlschema.AnyType}
     */
    org.w3._2001.xmlschema.AnyType getSubjectConfirmationData();

    /**
     * Sets the value of the subjectConfirmationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.liberty.ws.common.jaxb.assertion.SubjectConfirmationDataElement}
     *     {@link org.w3._2001.xmlschema.AnyType}
     */
    void setSubjectConfirmationData(org.w3._2001.xmlschema.AnyType value);

    /**
     * Gets the value of the ConfirmationMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ConfirmationMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfirmationMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String}
     * 
     */
    java.util.List getConfirmationMethod();

}