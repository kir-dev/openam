//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:21 DU CEST 
//


package com.sun.identity.wsfederation.jaxb.wspolicy;


/**
 * Java content class for anonymous complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/home/aldaris/NetBeansProjects/openam/opensso/products/federation/library/xsd/wsfederation/ws-policy.xsd line 66)
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Digest" type="{http://www.w3.org/2001/XMLSchema}base64Binary" />
 *       &lt;attribute name="DigestAlgorithm" type="{http://www.w3.org/2001/XMLSchema}anyURI" default="http://schemas.xmlsoap.org/ws/2004/09/policy/Sha1Exc" />
 *       &lt;attribute name="URI" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface PolicyReferenceType {


    /**
     * Gets the value of the digest property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    byte[] getDigest();

    /**
     * Sets the value of the digest property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    void setDigest(byte[] value);

    /**
     * Gets the value of the digestAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getDigestAlgorithm();

    /**
     * Sets the value of the digestAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setDigestAlgorithm(java.lang.String value);

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getURI();

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setURI(java.lang.String value);

}
