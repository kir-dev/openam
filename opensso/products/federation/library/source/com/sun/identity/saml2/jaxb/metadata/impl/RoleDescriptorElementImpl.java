//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:17 DU CEST 
//


package com.sun.identity.saml2.jaxb.metadata.impl;

public class RoleDescriptorElementImpl
    extends com.sun.identity.saml2.jaxb.metadata.impl.RoleDescriptorTypeImpl
    implements com.sun.identity.saml2.jaxb.metadata.RoleDescriptorElement, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallableObject, com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializable, com.sun.identity.saml2.jaxb.assertion.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (com.sun.identity.saml2.jaxb.metadata.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.saml2.jaxb.metadata.RoleDescriptorElement.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "urn:oasis:names:tc:SAML:2.0:metadata";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "RoleDescriptor";
    }

    public com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.saml2.jaxb.metadata.impl.RoleDescriptorElementImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("urn:oasis:names:tc:SAML:2.0:metadata", "RoleDescriptor");
        super.serializeURIs(context);
        context.endNamespaceDecls();
        super.serializeAttributes(context);
        context.endAttributes();
        super.serializeBody(context);
        context.endElement();
    }

    public void serializeAttributes(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeURIs(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.sun.identity.saml2.jaxb.metadata.RoleDescriptorElement.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Lj"
+"ava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xppp\u0000sr\u0000\u001fcom.sun.msv.gra"
+"mmar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.BinaryExp"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~\u0000\u0004ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007pps"
+"q\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsr\u0000\u001dc"
+"om.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\bppsq\u0000~\u0000\u0013sr\u0000\u0011jav"
+"a.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psq\u0000~\u0000\u0000q\u0000~\u0000\u0017p\u0000sq\u0000~\u0000\u0013ppsr"
+"\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv"
+".grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004q\u0000~\u0000\u0017psr\u0000 com.s"
+"un.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tnameClas"
+"sq\u0000~\u0000\u0001xq\u0000~\u0000\u0004q\u0000~\u0000\u0017psr\u00002com.sun.msv.grammar.Expression$AnyStri"
+"ngExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004sq\u0000~\u0000\u0016\u0001q\u0000~\u0000 sr\u0000 com.sun.msv.gra"
+"mmar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClas"
+"s\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExpr"
+"ession\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000!q\u0000~\u0000&sr\u0000#com.sun.msv.grammar.Sim"
+"pleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fn"
+"amespaceURIq\u0000~\u0000(xq\u0000~\u0000#t\u00003com.sun.identity.saml2.jaxb.xmlsig."
+"SignatureElementt\u0000+http://java.sun.com/jaxb/xjc/dummy-elemen"
+"tssq\u0000~\u0000\u0000q\u0000~\u0000\u0017p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0013ppsq\u0000~\u0000\u001aq\u0000~\u0000\u0017psq\u0000~\u0000\u001dq\u0000"
+"~\u0000\u0017pq\u0000~\u0000 q\u0000~\u0000$q\u0000~\u0000&sq\u0000~\u0000\'t\u00000com.sun.identity.saml2.jaxb.xmls"
+"ig.SignatureTypeq\u0000~\u0000+sq\u0000~\u0000\u0013ppsq\u0000~\u0000\u001dq\u0000~\u0000\u0017psr\u0000\u001bcom.sun.msv.gra"
+"mmar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatyp"
+"e;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000"
+"\u0004ppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com."
+"sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun"
+".msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.dat"
+"atype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000(L\u0000\bty"
+"peNameq\u0000~\u0000(L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSp"
+"aceProcessor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0005QNamesr"
+"\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$NullSetExpression\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000\u0017psr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d"
+"\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000(L\u0000\fnamespaceURIq\u0000~\u0000(xpq\u0000~\u0000Aq\u0000~\u0000@sq\u0000~\u0000\'t"
+"\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-instanceq\u0000~\u0000&sq\u0000~\u0000"
+"\'t\u0000\tSignaturet\u0000\"http://www.w3.org/2000/09/xmldsig#q\u0000~\u0000&sq\u0000~\u0000"
+"\u0013ppsq\u0000~\u0000\u0013q\u0000~\u0000\u0017psq\u0000~\u0000\u0000q\u0000~\u0000\u0017p\u0000sq\u0000~\u0000\u0013ppsq\u0000~\u0000\u001aq\u0000~\u0000\u0017psq\u0000~\u0000\u001dq\u0000~\u0000\u0017p"
+"q\u0000~\u0000 q\u0000~\u0000$q\u0000~\u0000&sq\u0000~\u0000\'t\u00006com.sun.identity.saml2.jaxb.metadata"
+".ExtensionsElementq\u0000~\u0000+sq\u0000~\u0000\u0000q\u0000~\u0000\u0017p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0013p"
+"psq\u0000~\u0000\u001aq\u0000~\u0000\u0017psq\u0000~\u0000\u001dq\u0000~\u0000\u0017pq\u0000~\u0000 q\u0000~\u0000$q\u0000~\u0000&sq\u0000~\u0000\'t\u00003com.sun.ide"
+"ntity.saml2.jaxb.metadata.ExtensionsTypeq\u0000~\u0000+sq\u0000~\u0000\u0013ppsq\u0000~\u0000\u001dq"
+"\u0000~\u0000\u0017pq\u0000~\u00009q\u0000~\u0000Iq\u0000~\u0000&sq\u0000~\u0000\'t\u0000\nExtensionst\u0000$urn:oasis:names:tc"
+":SAML:2.0:metadataq\u0000~\u0000&sq\u0000~\u0000\u0013ppsq\u0000~\u0000\u001aq\u0000~\u0000\u0017psq\u0000~\u0000\u0013q\u0000~\u0000\u0017psq\u0000~\u0000"
+"\u0000q\u0000~\u0000\u0017p\u0000sq\u0000~\u0000\u0013ppsq\u0000~\u0000\u001aq\u0000~\u0000\u0017psq\u0000~\u0000\u001dq\u0000~\u0000\u0017pq\u0000~\u0000 q\u0000~\u0000$q\u0000~\u0000&sq\u0000~\u0000"
+"\'t\u00009com.sun.identity.saml2.jaxb.metadata.KeyDescriptorElemen"
+"tq\u0000~\u0000+sq\u0000~\u0000\u0000q\u0000~\u0000\u0017p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0013ppsq\u0000~\u0000\u001aq\u0000~\u0000\u0017psq\u0000~"
+"\u0000\u001dq\u0000~\u0000\u0017pq\u0000~\u0000 q\u0000~\u0000$q\u0000~\u0000&sq\u0000~\u0000\'t\u00006com.sun.identity.saml2.jaxb."
+"metadata.KeyDescriptorTypeq\u0000~\u0000+sq\u0000~\u0000\u0013ppsq\u0000~\u0000\u001dq\u0000~\u0000\u0017pq\u0000~\u00009q\u0000~\u0000"
+"Iq\u0000~\u0000&sq\u0000~\u0000\'t\u0000\rKeyDescriptorq\u0000~\u0000cq\u0000~\u0000&sq\u0000~\u0000\u0013ppsq\u0000~\u0000\u0013q\u0000~\u0000\u0017psq"
+"\u0000~\u0000\u0000q\u0000~\u0000\u0017p\u0000sq\u0000~\u0000\u0013ppsq\u0000~\u0000\u001aq\u0000~\u0000\u0017psq\u0000~\u0000\u001dq\u0000~\u0000\u0017pq\u0000~\u0000 q\u0000~\u0000$q\u0000~\u0000&sq"
+"\u0000~\u0000\'t\u00008com.sun.identity.saml2.jaxb.metadata.OrganizationElem"
+"entq\u0000~\u0000+sq\u0000~\u0000\u0000q\u0000~\u0000\u0017p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0013ppsq\u0000~\u0000\u001aq\u0000~\u0000\u0017psq"
+"\u0000~\u0000\u001dq\u0000~\u0000\u0017pq\u0000~\u0000 q\u0000~\u0000$q\u0000~\u0000&sq\u0000~\u0000\'t\u00005com.sun.identity.saml2.jax"
+"b.metadata.OrganizationTypeq\u0000~\u0000+sq\u0000~\u0000\u0013ppsq\u0000~\u0000\u001dq\u0000~\u0000\u0017pq\u0000~\u00009q\u0000~"
+"\u0000Iq\u0000~\u0000&sq\u0000~\u0000\'t\u0000\fOrganizationq\u0000~\u0000cq\u0000~\u0000&sq\u0000~\u0000\u0013ppsq\u0000~\u0000\u001aq\u0000~\u0000\u0017psq"
+"\u0000~\u0000\u0013q\u0000~\u0000\u0017psq\u0000~\u0000\u0000q\u0000~\u0000\u0017p\u0000sq\u0000~\u0000\u0013ppsq\u0000~\u0000\u001aq\u0000~\u0000\u0017psq\u0000~\u0000\u001dq\u0000~\u0000\u0017pq\u0000~\u0000 "
+"q\u0000~\u0000$q\u0000~\u0000&sq\u0000~\u0000\'t\u00009com.sun.identity.saml2.jaxb.metadata.Cont"
+"actPersonElementq\u0000~\u0000+sq\u0000~\u0000\u0000q\u0000~\u0000\u0017p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0013pps"
+"q\u0000~\u0000\u001aq\u0000~\u0000\u0017psq\u0000~\u0000\u001dq\u0000~\u0000\u0017pq\u0000~\u0000 q\u0000~\u0000$q\u0000~\u0000&sq\u0000~\u0000\'t\u00000com.sun.ident"
+"ity.saml2.jaxb.metadata.ContactTypeq\u0000~\u0000+sq\u0000~\u0000\u0013ppsq\u0000~\u0000\u001dq\u0000~\u0000\u0017p"
+"q\u0000~\u00009q\u0000~\u0000Iq\u0000~\u0000&sq\u0000~\u0000\'t\u0000\rContactPersonq\u0000~\u0000cq\u0000~\u0000&sq\u0000~\u0000\u0013ppsq\u0000~\u0000"
+"\u001dq\u0000~\u0000\u0017psq\u0000~\u00006ppsr\u0000\u001fcom.sun.msv.datatype.xsd.IDType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0000xr\u0000#com.sun.msv.datatype.xsd.NcnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\"com.s"
+"un.msv.datatype.xsd.TokenType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv.data"
+"type.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxq\u0000~\u0000;q\u0000~\u0000@t\u0000\u0002"
+"IDq\u0000~\u0000D\u0000q\u0000~\u0000Fsq\u0000~\u0000Gq\u0000~\u0000\u00aaq\u0000~\u0000@sq\u0000~\u0000\'t\u0000\u0002IDt\u0000\u0000q\u0000~\u0000&sq\u0000~\u0000\u0013ppsq\u0000~"
+"\u0000\u001dq\u0000~\u0000\u0017psq\u0000~\u00006ppsr\u0000%com.sun.msv.datatype.xsd.DurationType\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000;q\u0000~\u0000@t\u0000\bdurationq\u0000~\u0000Dq\u0000~\u0000Fsq\u0000~\u0000Gq\u0000~\u0000\u00b4q\u0000~\u0000@sq\u0000~"
+"\u0000\'t\u0000\rcacheDurationq\u0000~\u0000\u00aeq\u0000~\u0000&sq\u0000~\u0000\u0013ppsq\u0000~\u0000\u001dq\u0000~\u0000\u0017psq\u0000~\u00006q\u0000~\u0000\u0017p"
+"sr\u0000#com.sun.msv.datatype.xsd.AnyURIType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000;q\u0000~\u0000"
+"@t\u0000\u0006anyURIq\u0000~\u0000Dq\u0000~\u0000Fsq\u0000~\u0000Gq\u0000~\u0000\u00bdq\u0000~\u0000@sq\u0000~\u0000\'t\u0000\berrorURLq\u0000~\u0000\u00aeq\u0000"
+"~\u0000&sq\u0000~\u0000\u001dppsq\u0000~\u00006ppsr\u0000!com.sun.msv.datatype.xsd.ListType\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bitemTypet\u0000)Lcom/sun/msv/datatype/xsd/XSDatatypeImp"
+"l;xq\u0000~\u0000<q\u0000~\u0000ct\u0000\u000eanyURIListTypeq\u0000~\u0000Dq\u0000~\u0000\u00bcq\u0000~\u0000Fpsq\u0000~\u0000\'t\u0000\u001aproto"
+"colSupportEnumerationq\u0000~\u0000\u00aesq\u0000~\u0000\u0013ppsq\u0000~\u0000\u001dq\u0000~\u0000\u0017psq\u0000~\u00006ppsr\u0000%co"
+"m.sun.msv.datatype.xsd.DateTimeType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000)com.sun.ms"
+"v.datatype.xsd.DateTimeBaseType\u0014W\u001a@3\u00a5\u00b4\u00e5\u0002\u0000\u0000xq\u0000~\u0000;q\u0000~\u0000@t\u0000\bdate"
+"Timeq\u0000~\u0000Dq\u0000~\u0000Fsq\u0000~\u0000Gq\u0000~\u0000\u00cfq\u0000~\u0000@sq\u0000~\u0000\'t\u0000\nvalidUntilq\u0000~\u0000\u00aeq\u0000~\u0000&s"
+"q\u0000~\u0000\u0013ppsq\u0000~\u0000\u001dq\u0000~\u0000\u0017pq\u0000~\u00009q\u0000~\u0000Iq\u0000~\u0000&sq\u0000~\u0000\'t\u0000\u000eRoleDescriptorq\u0000~"
+"\u0000csr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTab"
+"let\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-co"
+"m.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005cou"
+"ntB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/Expressio"
+"nPool;xp\u0000\u0000\u00009\u0001pq\u0000~\u0000hq\u0000~\u0000qq\u0000~\u0000pq\u0000~\u0000dq\u0000~\u0000}q\u0000~\u0000|q\u0000~\u0000\u0085q\u0000~\u0000\u0084q\u0000~\u0000\u0092q"
+"\u0000~\u0000\u0091q\u0000~\u0000\u009aq\u0000~\u0000\u0099q\u0000~\u0000\u008dq\u0000~\u0000\u0011q\u0000~\u0000\u0015q\u0000~\u0000Pq\u0000~\u0000fq\u0000~\u0000zq\u0000~\u0000\u008fq\u0000~\u0000\rq\u0000~\u00004q"
+"\u0000~\u0000_q\u0000~\u0000uq\u0000~\u0000\u0089q\u0000~\u0000\u009eq\u0000~\u0000\u00d3q\u0000~\u0000\fq\u0000~\u0000\u0010q\u0000~\u0000\u00afq\u0000~\u0000eq\u0000~\u0000\u008eq\u0000~\u0000\u000fq\u0000~\u0000\u00c9q"
+"\u0000~\u0000\nq\u0000~\u0000\u000bq\u0000~\u0000\u000eq\u0000~\u0000\tq\u0000~\u0000\u00a2q\u0000~\u0000\u0014q\u0000~\u0000Oq\u0000~\u0000yq\u0000~\u0000\u0012q\u0000~\u0000\u00b8q\u0000~\u0000-q\u0000~\u0000Xq"
+"\u0000~\u0000nq\u0000~\u0000\u0082q\u0000~\u0000\u0097q\u0000~\u0000\u001cq\u0000~\u00000q\u0000~\u0000Sq\u0000~\u0000\u0019q\u0000~\u0000/q\u0000~\u0000Rq\u0000~\u0000[q\u0000~\u0000Zq\u0000~\u0000ix"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.identity.saml2.jaxb.assertion.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context) {
            super(context, "----");
        }

        protected Unmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.sun.identity.saml2.jaxb.metadata.impl.RoleDescriptorElementImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  1 :
                        attIdx = context.getAttribute("", "ID");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("", "cacheDuration");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("", "errorURL");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("", "protocolSupportEnumeration");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  0 :
                        if (("RoleDescriptor" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("RoleDescriptor" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  1 :
                        attIdx = context.getAttribute("", "ID");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "cacheDuration");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "errorURL");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "protocolSupportEnumeration");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        if (("ID" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.saml2.jaxb.metadata.impl.RoleDescriptorTypeImpl)com.sun.identity.saml2.jaxb.metadata.impl.RoleDescriptorElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("cacheDuration" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.saml2.jaxb.metadata.impl.RoleDescriptorTypeImpl)com.sun.identity.saml2.jaxb.metadata.impl.RoleDescriptorElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("errorURL" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.saml2.jaxb.metadata.impl.RoleDescriptorTypeImpl)com.sun.identity.saml2.jaxb.metadata.impl.RoleDescriptorElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("protocolSupportEnumeration" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.saml2.jaxb.metadata.impl.RoleDescriptorTypeImpl)com.sun.identity.saml2.jaxb.metadata.impl.RoleDescriptorElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        attIdx = context.getAttribute("", "ID");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "cacheDuration");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "errorURL");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "protocolSupportEnumeration");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  3 :
                            revertToParentFromText(value);
                            return ;
                        case  1 :
                            attIdx = context.getAttribute("", "ID");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("", "cacheDuration");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("", "errorURL");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("", "protocolSupportEnumeration");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}
