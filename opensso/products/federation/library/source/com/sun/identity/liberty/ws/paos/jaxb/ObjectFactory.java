//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:12 DU CEST 
//


package com.sun.identity.liberty.ws.paos.jaxb;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sun.identity.liberty.ws.paos.jaxb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
public class ObjectFactory
    extends com.sun.identity.federation.jaxb.entityconfig.impl.runtime.DefaultJAXBContextImpl
{

    private static java.util.HashMap defaultImplementations = new java.util.HashMap(16, 0.75F);
    private static java.util.HashMap rootTagMap = new java.util.HashMap();
    public final static com.sun.identity.federation.jaxb.entityconfig.impl.runtime.GrammarInfo grammarInfo = new com.sun.identity.federation.jaxb.entityconfig.impl.runtime.GrammarInfoImpl(rootTagMap, defaultImplementations, (com.sun.identity.liberty.ws.paos.jaxb.ObjectFactory.class));
    public final static java.lang.Class version = (com.sun.identity.liberty.ws.paos.jaxb.impl.JAXBVersion.class);

    static {
        defaultImplementations.put((com.sun.identity.liberty.ws.paos.jaxb.ExtensionElement.class), "com.sun.identity.liberty.ws.paos.jaxb.impl.ExtensionElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.paos.jaxb.StatusElement.class), "com.sun.identity.liberty.ws.paos.jaxb.impl.StatusElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.paos.jaxb.ExtensionType.class), "com.sun.identity.liberty.ws.paos.jaxb.impl.ExtensionTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.paos.jaxb.StatusType.class), "com.sun.identity.liberty.ws.paos.jaxb.impl.StatusTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.paos.jaxb.ResponseElement.class), "com.sun.identity.liberty.ws.paos.jaxb.impl.ResponseElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.paos.jaxb.ResponseType.class), "com.sun.identity.liberty.ws.paos.jaxb.impl.ResponseTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.paos.jaxb.RequestElement.class), "com.sun.identity.liberty.ws.paos.jaxb.impl.RequestElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.paos.jaxb.EmptyType.class), "com.sun.identity.liberty.ws.paos.jaxb.impl.EmptyTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.paos.jaxb.RequestType.class), "com.sun.identity.liberty.ws.paos.jaxb.impl.RequestTypeImpl");
        rootTagMap.put(new javax.xml.namespace.QName("urn:liberty:paos:2003-08", "Status"), (com.sun.identity.liberty.ws.paos.jaxb.StatusElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:liberty:paos:2003-08", "Extension"), (com.sun.identity.liberty.ws.paos.jaxb.ExtensionElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:liberty:paos:2003-08", "Response"), (com.sun.identity.liberty.ws.paos.jaxb.ResponseElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:liberty:paos:2003-08", "Request"), (com.sun.identity.liberty.ws.paos.jaxb.RequestElement.class));
    }

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sun.identity.liberty.ws.paos.jaxb
     * 
     */
    public ObjectFactory() {
        super(grammarInfo);
    }

    /**
     * Create an instance of the specified Java content interface.
     * 
     * @param javaContentInterface
     *     the Class object of the javacontent interface to instantiate
     * @return
     *     a new instance
     * @throws JAXBException
     *     if an error occurs
     */
    public java.lang.Object newInstance(java.lang.Class javaContentInterface)
        throws javax.xml.bind.JAXBException
    {
        return super.newInstance(javaContentInterface);
    }

    /**
     * Get the specified property. This method can only be
     * used to get provider specific properties.
     * Attempting to get an undefined property will result
     * in a PropertyException being thrown.
     * 
     * @param name
     *     the name of the property to retrieve
     * @return
     *     the value of the requested property
     * @throws PropertyException
     *     when there is an error retrieving the given property or value
     */
    public java.lang.Object getProperty(java.lang.String name)
        throws javax.xml.bind.PropertyException
    {
        return super.getProperty(name);
    }

    /**
     * Set the specified property. This method can only be
     * used to set provider specific properties.
     * Attempting to set an undefined property will result
     * in a PropertyException being thrown.
     * 
     * @param name
     *     the name of the property to retrieve
     * @param value
     *     the value of the property to be set
     * @throws PropertyException
     *     when there is an error processing the given property or value
     */
    public void setProperty(java.lang.String name, java.lang.Object value)
        throws javax.xml.bind.PropertyException
    {
        super.setProperty(name, value);
    }

    /**
     * Create an instance of ExtensionElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.paos.jaxb.ExtensionElement createExtensionElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.paos.jaxb.impl.ExtensionElementImpl();
    }

    /**
     * Create an instance of StatusElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.paos.jaxb.StatusElement createStatusElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.paos.jaxb.impl.StatusElementImpl();
    }

    /**
     * Create an instance of ExtensionType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.paos.jaxb.ExtensionType createExtensionType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.paos.jaxb.impl.ExtensionTypeImpl();
    }

    /**
     * Create an instance of StatusType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.paos.jaxb.StatusType createStatusType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.paos.jaxb.impl.StatusTypeImpl();
    }

    /**
     * Create an instance of ResponseElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.paos.jaxb.ResponseElement createResponseElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.paos.jaxb.impl.ResponseElementImpl();
    }

    /**
     * Create an instance of ResponseType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.paos.jaxb.ResponseType createResponseType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.paos.jaxb.impl.ResponseTypeImpl();
    }

    /**
     * Create an instance of RequestElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.paos.jaxb.RequestElement createRequestElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.paos.jaxb.impl.RequestElementImpl();
    }

    /**
     * Create an instance of EmptyType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.paos.jaxb.EmptyType createEmptyType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.paos.jaxb.impl.EmptyTypeImpl();
    }

    /**
     * Create an instance of RequestType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.paos.jaxb.RequestType createRequestType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.paos.jaxb.impl.RequestTypeImpl();
    }

}