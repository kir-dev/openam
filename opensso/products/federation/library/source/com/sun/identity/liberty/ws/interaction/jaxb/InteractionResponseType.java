//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:12 DU CEST 
//


package com.sun.identity.liberty.ws.interaction.jaxb;


/**
 * Java content class for InteractionResponseType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/home/aldaris/NetBeansProjects/openam/opensso/products/federation/library/xsd/liberty/lib-arch-interact-svc.xsd line 145)
 * <p>
 * <pre>
 * &lt;complexType name="InteractionResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:liberty:is:2003-08}Status"/>
 *         &lt;choice>
 *           &lt;element name="InteractionStatement" type="{urn:liberty:is:2003-08}InteractionStatementType" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="Parameter" type="{urn:liberty:is:2003-08}ParameterType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface InteractionResponseType {


    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.liberty.ws.interaction.jaxb.StatusElement}
     *     {@link com.sun.identity.liberty.ws.interaction.jaxb.StatusType}
     */
    com.sun.identity.liberty.ws.interaction.jaxb.StatusType getStatus();

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.liberty.ws.interaction.jaxb.StatusElement}
     *     {@link com.sun.identity.liberty.ws.interaction.jaxb.StatusType}
     */
    void setStatus(com.sun.identity.liberty.ws.interaction.jaxb.StatusType value);

    /**
     * Gets the value of the InteractionStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the InteractionStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInteractionStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.sun.identity.liberty.ws.interaction.jaxb.InteractionStatementType}
     * 
     */
    java.util.List getInteractionStatement();

    /**
     * Gets the value of the Parameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Parameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.sun.identity.liberty.ws.interaction.jaxb.ParameterType}
     * 
     */
    java.util.List getParameter();

}