//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:21 DU CEST 
//


package com.sun.identity.wsfederation.jaxb.wsfederation.impl;

public class TokenKeyInfoTypeImpl implements com.sun.identity.wsfederation.jaxb.wsfederation.TokenKeyInfoType, com.sun.xml.bind.JAXBObject, com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.UnmarshallableObject, com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.XMLSerializable, com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.ValidatableObject
{

    protected com.sun.identity.wsfederation.jaxb.wsse.SecurityTokenReferenceType _SecurityTokenReference;
    public final static java.lang.Class version = (com.sun.identity.wsfederation.jaxb.wsfederation.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.wsfederation.jaxb.wsfederation.TokenKeyInfoType.class);
    }

    public com.sun.identity.wsfederation.jaxb.wsse.SecurityTokenReferenceType getSecurityTokenReference() {
        return _SecurityTokenReference;
    }

    public void setSecurityTokenReference(com.sun.identity.wsfederation.jaxb.wsse.SecurityTokenReferenceType value) {
        _SecurityTokenReference = value;
    }

    public com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.wsfederation.jaxb.wsfederation.impl.TokenKeyInfoTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (_SecurityTokenReference instanceof javax.xml.bind.Element) {
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _SecurityTokenReference), "SecurityTokenReference");
        } else {
            context.startElement("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "SecurityTokenReference");
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _SecurityTokenReference), "SecurityTokenReference");
            context.endNamespaceDecls();
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _SecurityTokenReference), "SecurityTokenReference");
            context.endAttributes();
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _SecurityTokenReference), "SecurityTokenReference");
            context.endElement();
        }
    }

    public void serializeAttributes(com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (_SecurityTokenReference instanceof javax.xml.bind.Element) {
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _SecurityTokenReference), "SecurityTokenReference");
        }
    }

    public void serializeURIs(com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (_SecurityTokenReference instanceof javax.xml.bind.Element) {
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _SecurityTokenReference), "SecurityTokenReference");
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.sun.identity.wsfederation.jaxb.wsfederation.TokenKeyInfoType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gramm"
+"ar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expression"
+"\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bex"
+"pandedExpq\u0000~\u0000\u0002xpppsr\u0000\'com.sun.msv.grammar.trex.ElementPatter"
+"n\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr"
+"\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclar"
+"edAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003pp\u0000sq\u0000~\u0000\u0000ppsr\u0000 com.sun"
+".msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar."
+"UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003sr\u0000\u0011java.lang.Boolean\u00cd r"
+"\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\u0007xq\u0000~\u0000\u0003q\u0000~\u0000\u000fpsr\u00002com.sun.m"
+"sv.grammar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq"
+"\u0000~\u0000\u000e\u0001q\u0000~\u0000\u0013sr\u0000 com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000"
+"\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.g"
+"rammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u0014q\u0000~"
+"\u0000\u0019sr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocal"
+"Namet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000\u001bxq\u0000~\u0000\u0016t\u0000Ecom.su"
+"n.identity.wsfederation.jaxb.wsse.SecurityTokenReferenceElem"
+"entt\u0000+http://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u0006pp\u0000sr"
+"\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsq\u0000~\u0000\u0006pp"
+"\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u000bq\u0000~\u0000\u000fpsq\u0000~\u0000\u0010q\u0000~\u0000\u000fpq\u0000~\u0000\u0013q\u0000~\u0000\u0017q\u0000~\u0000\u0019sq\u0000~\u0000\u001at\u0000Bcom"
+".sun.identity.wsfederation.jaxb.wsse.SecurityTokenReferenceT"
+"ypeq\u0000~\u0000\u001esq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0010q\u0000~\u0000\u000fpsr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000"
+"~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0003ppsr\u0000\"com.su"
+"n.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datat"
+"ype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype"
+".xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSD"
+"atatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000\u001bL\u0000\btypeNameq\u0000~\u0000\u001bL\u0000"
+"\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;"
+"xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv"
+".datatype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com"
+".sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000co"
+"m.sun.msv.grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000"
+"~\u0000\u0003q\u0000~\u0000\u000fpsr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalN"
+"ameq\u0000~\u0000\u001bL\u0000\fnamespaceURIq\u0000~\u0000\u001bxpq\u0000~\u00005q\u0000~\u00004sq\u0000~\u0000\u001at\u0000\u0004typet\u0000)http"
+"://www.w3.org/2001/XMLSchema-instanceq\u0000~\u0000\u0019sq\u0000~\u0000\u001at\u0000\u0016SecurityT"
+"okenReferencet\u0000Qhttp://docs.oasis-open.org/wss/2004/01/oasis"
+"-200401-wss-wssecurity-secext-1.0.xsdsr\u0000\"com.sun.msv.grammar"
+".ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar"
+"/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.Express"
+"ionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006pare"
+"ntt\u0000$Lcom/sun/msv/grammar/ExpressionPool;xp\u0000\u0000\u0000\u0007\u0001pq\u0000~\u0000(q\u0000~\u0000\rq"
+"\u0000~\u0000$q\u0000~\u0000!q\u0000~\u0000\nq\u0000~\u0000#q\u0000~\u0000\u0005x"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
            super(context, "----");
        }

        protected Unmarshaller(com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.sun.identity.wsfederation.jaxb.wsfederation.impl.TokenKeyInfoTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
                        attIdx = context.getAttribute("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Usage");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "Id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (true) {
                            _SecurityTokenReference = ((com.sun.identity.wsfederation.jaxb.wsse.impl.SecurityTokenReferenceTypeImpl) spawnChildFromEnterElement((com.sun.identity.wsfederation.jaxb.wsse.impl.SecurityTokenReferenceTypeImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        _SecurityTokenReference = ((com.sun.identity.wsfederation.jaxb.wsse.impl.SecurityTokenReferenceTypeImpl) spawnChildFromEnterElement((com.sun.identity.wsfederation.jaxb.wsse.impl.SecurityTokenReferenceTypeImpl.class), 2, ___uri, ___local, ___qname, __atts));
                        return ;
                    case  0 :
                        if (("SecurityTokenReference" == ___local)&&("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd" == ___uri)) {
                            _SecurityTokenReference = ((com.sun.identity.wsfederation.jaxb.wsse.impl.SecurityTokenReferenceElementImpl) spawnChildFromEnterElement((com.sun.identity.wsfederation.jaxb.wsse.impl.SecurityTokenReferenceElementImpl.class), 3, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("SecurityTokenReference" == ___local)&&("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                    case  3 :
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
                    case  1 :
                        attIdx = context.getAttribute("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Usage");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "Id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        _SecurityTokenReference = ((com.sun.identity.wsfederation.jaxb.wsse.impl.SecurityTokenReferenceTypeImpl) spawnChildFromLeaveElement((com.sun.identity.wsfederation.jaxb.wsse.impl.SecurityTokenReferenceTypeImpl.class), 2, ___uri, ___local, ___qname));
                        return ;
                    case  2 :
                        if (("SecurityTokenReference" == ___local)&&("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  3 :
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
                    case  1 :
                        if (("Usage" == ___local)&&("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd" == ___uri)) {
                            _SecurityTokenReference = ((com.sun.identity.wsfederation.jaxb.wsse.impl.SecurityTokenReferenceTypeImpl) spawnChildFromEnterAttribute((com.sun.identity.wsfederation.jaxb.wsse.impl.SecurityTokenReferenceTypeImpl.class), 2, ___uri, ___local, ___qname));
                            return ;
                        }
                        if (("Id" == ___local)&&("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd" == ___uri)) {
                            _SecurityTokenReference = ((com.sun.identity.wsfederation.jaxb.wsse.impl.SecurityTokenReferenceTypeImpl) spawnChildFromEnterAttribute((com.sun.identity.wsfederation.jaxb.wsse.impl.SecurityTokenReferenceTypeImpl.class), 2, ___uri, ___local, ___qname));
                            return ;
                        }
                        _SecurityTokenReference = ((com.sun.identity.wsfederation.jaxb.wsse.impl.SecurityTokenReferenceTypeImpl) spawnChildFromEnterAttribute((com.sun.identity.wsfederation.jaxb.wsse.impl.SecurityTokenReferenceTypeImpl.class), 2, ___uri, ___local, ___qname));
                        return ;
                    case  3 :
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
                    case  1 :
                        attIdx = context.getAttribute("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Usage");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "Id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        _SecurityTokenReference = ((com.sun.identity.wsfederation.jaxb.wsse.impl.SecurityTokenReferenceTypeImpl) spawnChildFromLeaveAttribute((com.sun.identity.wsfederation.jaxb.wsse.impl.SecurityTokenReferenceTypeImpl.class), 2, ___uri, ___local, ___qname));
                        return ;
                    case  3 :
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
                        case  1 :
                            attIdx = context.getAttribute("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Usage");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "Id");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            _SecurityTokenReference = ((com.sun.identity.wsfederation.jaxb.wsse.impl.SecurityTokenReferenceTypeImpl) spawnChildFromText((com.sun.identity.wsfederation.jaxb.wsse.impl.SecurityTokenReferenceTypeImpl.class), 2, value));
                            return ;
                        case  3 :
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