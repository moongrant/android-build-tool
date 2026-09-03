package com.amazonaws.util;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: classes2.dex */
public class XpathUtils {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Log f9597OooO00o = LogFactory.OooO00o(XpathUtils.class);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final DocumentBuilderFactory f9598OooO0O0 = DocumentBuilderFactory.newInstance();

    public static String OooO00o(String str, Document document) throws XPathExpressionException {
        if (document == null) {
            return null;
        }
        if (!".".equals(str)) {
            if ((document == null ? null : (Node) XPathFactory.newInstance().newXPath().evaluate(str, document, XPathConstants.NODE)) == null) {
                return null;
            }
        }
        return XPathFactory.newInstance().newXPath().evaluate(str, document).trim();
    }

    public static Document OooO0O0(String str) throws ParserConfigurationException, SAXException, IOException {
        NamespaceRemovingInputStream namespaceRemovingInputStream = new NamespaceRemovingInputStream(new ByteArrayInputStream(str.getBytes(StringUtils.f9590OooO00o)));
        Document document = f9598OooO0O0.newDocumentBuilder().parse(namespaceRemovingInputStream);
        namespaceRemovingInputStream.close();
        return document;
    }
}
