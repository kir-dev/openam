//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:21 DU CEST 
//


package com.sun.identity.wsfederation.jaxb.wsaddr.impl;

public class EndpointReferenceTypeImpl implements com.sun.identity.wsfederation.jaxb.wsaddr.EndpointReferenceType, com.sun.xml.bind.JAXBObject, com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.UnmarshallableObject, com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.XMLSerializable, com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.ValidatableObject
{

    protected com.sun.xml.bind.util.ListImpl _Any;
    protected com.sun.identity.wsfederation.jaxb.wsaddr.AttributedURIType _Address;
    protected com.sun.identity.wsfederation.jaxb.wsaddr.MetadataType _Metadata;
    protected com.sun.identity.wsfederation.jaxb.wsaddr.ReferenceParametersType _ReferenceParameters;
    public final static java.lang.Class version = (com.sun.identity.wsfederation.jaxb.wsaddr.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.wsfederation.jaxb.wsaddr.EndpointReferenceType.class);
    }

    protected com.sun.xml.bind.util.ListImpl _getAny() {
        if (_Any == null) {
            _Any = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
        }
        return _Any;
    }

    public java.util.List getAny() {
        return _getAny();
    }

    public com.sun.identity.wsfederation.jaxb.wsaddr.AttributedURIType getAddress() {
        return _Address;
    }

    public void setAddress(com.sun.identity.wsfederation.jaxb.wsaddr.AttributedURIType value) {
        _Address = value;
    }

    public com.sun.identity.wsfederation.jaxb.wsaddr.MetadataType getMetadata() {
        return _Metadata;
    }

    public void setMetadata(com.sun.identity.wsfederation.jaxb.wsaddr.MetadataType value) {
        _Metadata = value;
    }

    public com.sun.identity.wsfederation.jaxb.wsaddr.ReferenceParametersType getReferenceParameters() {
        return _ReferenceParameters;
    }

    public void setReferenceParameters(com.sun.identity.wsfederation.jaxb.wsaddr.ReferenceParametersType value) {
        _ReferenceParameters = value;
    }

    public com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.wsfederation.jaxb.wsaddr.impl.EndpointReferenceTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_Any == null)? 0 :_Any.size());
        context.startElement("http://www.w3.org/2005/08/addressing", "Address");
        context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Address), "Address");
        context.endNamespaceDecls();
        context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Address), "Address");
        context.endAttributes();
        context.childAsBody(((com.sun.xml.bind.JAXBObject) _Address), "Address");
        context.endElement();
        if (_ReferenceParameters!= null) {
            if (_ReferenceParameters instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _ReferenceParameters), "ReferenceParameters");
            } else {
                context.startElement("http://www.w3.org/2005/08/addressing", "ReferenceParameters");
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _ReferenceParameters), "ReferenceParameters");
                context.endNamespaceDecls();
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _ReferenceParameters), "ReferenceParameters");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _ReferenceParameters), "ReferenceParameters");
                context.endElement();
            }
        }
        if (_Metadata!= null) {
            if (_Metadata instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Metadata), "Metadata");
            } else {
                context.startElement("http://www.w3.org/2005/08/addressing", "Metadata");
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Metadata), "Metadata");
                context.endNamespaceDecls();
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Metadata), "Metadata");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Metadata), "Metadata");
                context.endElement();
            }
        }
        while (idx1 != len1) {
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _Any.get(idx1 ++)), "Any");
        }
    }

    public void serializeAttributes(com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_Any == null)? 0 :_Any.size());
        if (_ReferenceParameters!= null) {
            if (_ReferenceParameters instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _ReferenceParameters), "ReferenceParameters");
            }
        }
        if (_Metadata!= null) {
            if (_Metadata instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Metadata), "Metadata");
            }
        }
        while (idx1 != len1) {
            idx1 += 1;
        }
    }

    public void serializeURIs(com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_Any == null)? 0 :_Any.size());
        if (_ReferenceParameters!= null) {
            if (_ReferenceParameters instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _ReferenceParameters), "ReferenceParameters");
            }
        }
        if (_Metadata!= null) {
            if (_Metadata instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Metadata), "Metadata");
            }
        }
        while (idx1 != len1) {
            idx1 += 1;
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.sun.identity.wsfederation.jaxb.wsaddr.EndpointReferenceType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsr\u0000\'com.sun.msv.grammar."
+"trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/gr"
+"ammar/NameClass;xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003pp\u0000s"
+"q\u0000~\u0000\u0000ppsq\u0000~\u0000\bpp\u0000sr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000"
+"xq\u0000~\u0000\u0001ppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001cc"
+"om.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003sr\u0000\u0011j"
+"ava.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000 com.sun.msv.gramm"
+"ar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\txq\u0000~\u0000\u0003"
+"q\u0000~\u0000\u0014psr\u00002com.sun.msv.grammar.Expression$AnyStringExpression"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000\u0013\u0001q\u0000~\u0000\u0018sr\u0000 com.sun.msv.grammar.AnyName"
+"Class\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000"
+"xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u0019q\u0000~\u0000\u001esr\u0000#com.sun.msv.grammar.SimpleNameClass"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq"
+"\u0000~\u0000 xq\u0000~\u0000\u001bt\u0000;com.sun.identity.wsfederation.jaxb.wsaddr.Attri"
+"butedURITypet\u0000+http://java.sun.com/jaxb/xjc/dummy-elementssq"
+"\u0000~\u0000\u000eppsq\u0000~\u0000\u0015q\u0000~\u0000\u0014psr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003"
+"L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004name"
+"t\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0003ppsr\u0000\"com.sun.msv.data"
+"type.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.Bu"
+"iltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.Concr"
+"eteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImp"
+"l\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000 L\u0000\btypeNameq\u0000~\u0000 L\u0000\nwhiteSpac"
+"et\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http:"
+"//www.w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.datatype."
+"xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.d"
+"atatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv."
+"grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u0014ps"
+"r\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000 L\u0000"
+"\fnamespaceURIq\u0000~\u0000 xpq\u0000~\u00001q\u0000~\u00000sq\u0000~\u0000\u001ft\u0000\u0004typet\u0000)http://www.w3."
+"org/2001/XMLSchema-instanceq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\u0007Addresst\u0000$http://ww"
+"w.w3.org/2005/08/addressingsq\u0000~\u0000\u000eppsq\u0000~\u0000\u000eq\u0000~\u0000\u0014psq\u0000~\u0000\bq\u0000~\u0000\u0014p\u0000"
+"sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000Dcom."
+"sun.identity.wsfederation.jaxb.wsaddr.ReferenceParametersEle"
+"mentq\u0000~\u0000#sq\u0000~\u0000\bq\u0000~\u0000\u0014p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\bpp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014ps"
+"q\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000Acom.sun.identity.wsfedera"
+"tion.jaxb.wsaddr.ReferenceParametersTypeq\u0000~\u0000#sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0015q"
+"\u0000~\u0000\u0014pq\u0000~\u0000)q\u0000~\u00009q\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\u0013ReferenceParametersq\u0000~\u0000>q\u0000~\u0000\u001esq"
+"\u0000~\u0000\u000eppsq\u0000~\u0000\u000eq\u0000~\u0000\u0014psq\u0000~\u0000\bq\u0000~\u0000\u0014p\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~"
+"\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00009com.sun.identity.wsfederation.jax"
+"b.wsaddr.MetadataElementq\u0000~\u0000#sq\u0000~\u0000\bq\u0000~\u0000\u0014p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\bpp\u0000s"
+"q\u0000~\u0000\u000eppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00006com.s"
+"un.identity.wsfederation.jaxb.wsaddr.MetadataTypeq\u0000~\u0000#sq\u0000~\u0000\u000e"
+"ppsq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000)q\u0000~\u00009q\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\bMetadataq\u0000~\u0000>q\u0000~\u0000\u001esq\u0000~"
+"\u0000\u000eppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\bq\u0000~\u0000\u0014p\u0000sq\u0000~\u0000\u0015ppq\u0000~\u0000\u0018sr\u0000\'com.sun.msv.gr"
+"ammar.DifferenceNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003nc1q\u0000~\u0000\tL\u0000\u0003nc2q\u0000~\u0000\txq"
+"\u0000~\u0000\u001bq\u0000~\u0000\u001csr\u0000#com.sun.msv.grammar.ChoiceNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L"
+"\u0000\u0003nc1q\u0000~\u0000\tL\u0000\u0003nc2q\u0000~\u0000\txq\u0000~\u0000\u001bsr\u0000&com.sun.msv.grammar.Namespace"
+"NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\fnamespaceURIq\u0000~\u0000 xq\u0000~\u0000\u001bt\u0000\u0000sq\u0000~\u0000oq\u0000~\u0000>"
+"sq\u0000~\u0000oq\u0000~\u0000#q\u0000~\u0000\u001esr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$Close"
+"dHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0"
+"N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/gra"
+"mmar/ExpressionPool;xp\u0000\u0000\u0000\u0019\u0001pq\u0000~\u0000\u0006q\u0000~\u0000$q\u0000~\u0000Oq\u0000~\u0000cq\u0000~\u0000\u0012q\u0000~\u0000Cq\u0000"
+"~\u0000Kq\u0000~\u0000Wq\u0000~\u0000_q\u0000~\u0000?q\u0000~\u0000Sq\u0000~\u0000\fq\u0000~\u0000Hq\u0000~\u0000\\q\u0000~\u0000hq\u0000~\u0000gq\u0000~\u0000\u000fq\u0000~\u0000Bq\u0000"
+"~\u0000Jq\u0000~\u0000Vq\u0000~\u0000^q\u0000~\u0000\u0007q\u0000~\u0000\u0005q\u0000~\u0000@q\u0000~\u0000Tx"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
            super(context, "-----------");
        }

        protected Unmarshaller(com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.sun.identity.wsfederation.jaxb.wsaddr.impl.EndpointReferenceTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  5 :
                        if (!(("" == ___uri)||("http://www.w3.org/2005/08/addressing" == ___uri))) {
                            java.lang.Object co = spawnWildcard(6, ___uri, ___local, ___qname, __atts);
                            if (co!= null) {
                                _getAny().add(co);
                            }
                            return ;
                        }
                        state = 6;
                        continue outer;
                    case  3 :
                        if (("ReferenceParameters" == ___local)&&("http://www.w3.org/2005/08/addressing" == ___uri)) {
                            _ReferenceParameters = ((com.sun.identity.wsfederation.jaxb.wsaddr.impl.ReferenceParametersElementImpl) spawnChildFromEnterElement((com.sun.identity.wsfederation.jaxb.wsaddr.impl.ReferenceParametersElementImpl.class), 4, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ReferenceParameters" == ___local)&&("http://www.w3.org/2005/08/addressing" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 9;
                            return ;
                        }
                        state = 4;
                        continue outer;
                    case  7 :
                        if (true) {
                            _Metadata = ((com.sun.identity.wsfederation.jaxb.wsaddr.impl.MetadataTypeImpl) spawnChildFromEnterElement((com.sun.identity.wsfederation.jaxb.wsaddr.impl.MetadataTypeImpl.class), 8, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        _Metadata = ((com.sun.identity.wsfederation.jaxb.wsaddr.impl.MetadataTypeImpl) spawnChildFromEnterElement((com.sun.identity.wsfederation.jaxb.wsaddr.impl.MetadataTypeImpl.class), 8, ___uri, ___local, ___qname, __atts));
                        return ;
                    case  0 :
                        if (("Address" == ___local)&&("http://www.w3.org/2005/08/addressing" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 1;
                            return ;
                        }
                        break;
                    case  4 :
                        if (("Metadata" == ___local)&&("http://www.w3.org/2005/08/addressing" == ___uri)) {
                            _Metadata = ((com.sun.identity.wsfederation.jaxb.wsaddr.impl.MetadataElementImpl) spawnChildFromEnterElement((com.sun.identity.wsfederation.jaxb.wsaddr.impl.MetadataElementImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Metadata" == ___local)&&("http://www.w3.org/2005/08/addressing" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 7;
                            return ;
                        }
                        state = 5;
                        continue outer;
                    case  9 :
                        if (true) {
                            _ReferenceParameters = ((com.sun.identity.wsfederation.jaxb.wsaddr.impl.ReferenceParametersTypeImpl) spawnChildFromEnterElement((com.sun.identity.wsfederation.jaxb.wsaddr.impl.ReferenceParametersTypeImpl.class), 10, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        _ReferenceParameters = ((com.sun.identity.wsfederation.jaxb.wsaddr.impl.ReferenceParametersTypeImpl) spawnChildFromEnterElement((com.sun.identity.wsfederation.jaxb.wsaddr.impl.ReferenceParametersTypeImpl.class), 10, ___uri, ___local, ___qname, __atts));
                        return ;
                    case  6 :
                        if (!(("" == ___uri)||("http://www.w3.org/2005/08/addressing" == ___uri))) {
                            java.lang.Object co = spawnWildcard(6, ___uri, ___local, ___qname, __atts);
                            if (co!= null) {
                                _getAny().add(co);
                            }
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
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
                    case  5 :
                        state = 6;
                        continue outer;
                    case  3 :
                        state = 4;
                        continue outer;
                    case  7 :
                        _Metadata = ((com.sun.identity.wsfederation.jaxb.wsaddr.impl.MetadataTypeImpl) spawnChildFromLeaveElement((com.sun.identity.wsfederation.jaxb.wsaddr.impl.MetadataTypeImpl.class), 8, ___uri, ___local, ___qname));
                        return ;
                    case  4 :
                        state = 5;
                        continue outer;
                    case  10 :
                        if (("ReferenceParameters" == ___local)&&("http://www.w3.org/2005/08/addressing" == ___uri)) {
                            context.popAttributes();
                            state = 4;
                            return ;
                        }
                        break;
                    case  9 :
                        _ReferenceParameters = ((com.sun.identity.wsfederation.jaxb.wsaddr.impl.ReferenceParametersTypeImpl) spawnChildFromLeaveElement((com.sun.identity.wsfederation.jaxb.wsaddr.impl.ReferenceParametersTypeImpl.class), 10, ___uri, ___local, ___qname));
                        return ;
                    case  8 :
                        if (("Metadata" == ___local)&&("http://www.w3.org/2005/08/addressing" == ___uri)) {
                            context.popAttributes();
                            state = 5;
                            return ;
                        }
                        break;
                    case  2 :
                        if (("Address" == ___local)&&("http://www.w3.org/2005/08/addressing" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  6 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
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
                    case  5 :
                        state = 6;
                        continue outer;
                    case  3 :
                        state = 4;
                        continue outer;
                    case  7 :
                        _Metadata = ((com.sun.identity.wsfederation.jaxb.wsaddr.impl.MetadataTypeImpl) spawnChildFromEnterAttribute((com.sun.identity.wsfederation.jaxb.wsaddr.impl.MetadataTypeImpl.class), 8, ___uri, ___local, ___qname));
                        return ;
                    case  4 :
                        state = 5;
                        continue outer;
                    case  9 :
                        _ReferenceParameters = ((com.sun.identity.wsfederation.jaxb.wsaddr.impl.ReferenceParametersTypeImpl) spawnChildFromEnterAttribute((com.sun.identity.wsfederation.jaxb.wsaddr.impl.ReferenceParametersTypeImpl.class), 10, ___uri, ___local, ___qname));
                        return ;
                    case  6 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
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
                    case  5 :
                        state = 6;
                        continue outer;
                    case  3 :
                        state = 4;
                        continue outer;
                    case  7 :
                        _Metadata = ((com.sun.identity.wsfederation.jaxb.wsaddr.impl.MetadataTypeImpl) spawnChildFromLeaveAttribute((com.sun.identity.wsfederation.jaxb.wsaddr.impl.MetadataTypeImpl.class), 8, ___uri, ___local, ___qname));
                        return ;
                    case  4 :
                        state = 5;
                        continue outer;
                    case  9 :
                        _ReferenceParameters = ((com.sun.identity.wsfederation.jaxb.wsaddr.impl.ReferenceParametersTypeImpl) spawnChildFromLeaveAttribute((com.sun.identity.wsfederation.jaxb.wsaddr.impl.ReferenceParametersTypeImpl.class), 10, ___uri, ___local, ___qname));
                        return ;
                    case  6 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
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
                        case  5 :
                            state = 6;
                            continue outer;
                        case  3 :
                            state = 4;
                            continue outer;
                        case  7 :
                            _Metadata = ((com.sun.identity.wsfederation.jaxb.wsaddr.impl.MetadataTypeImpl) spawnChildFromText((com.sun.identity.wsfederation.jaxb.wsaddr.impl.MetadataTypeImpl.class), 8, value));
                            return ;
                        case  4 :
                            state = 5;
                            continue outer;
                        case  1 :
                            _Address = ((com.sun.identity.wsfederation.jaxb.wsaddr.impl.AttributedURITypeImpl) spawnChildFromText((com.sun.identity.wsfederation.jaxb.wsaddr.impl.AttributedURITypeImpl.class), 2, value));
                            return ;
                        case  9 :
                            _ReferenceParameters = ((com.sun.identity.wsfederation.jaxb.wsaddr.impl.ReferenceParametersTypeImpl) spawnChildFromText((com.sun.identity.wsfederation.jaxb.wsaddr.impl.ReferenceParametersTypeImpl.class), 10, value));
                            return ;
                        case  6 :
                            revertToParentFromText(value);
                            return ;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}