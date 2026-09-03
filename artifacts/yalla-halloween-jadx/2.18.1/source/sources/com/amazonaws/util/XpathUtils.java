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

/* JADX INFO: loaded from: classes.dex */
public class XpathUtils {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static Log f11193OooO00o = LogFactory.OooO00o(XpathUtils.class);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static DocumentBuilderFactory f11194OooO0O0 = DocumentBuilderFactory.newInstance();

    public static String OooO00o(String str, Node node) throws XPathExpressionException {
        if (node == null) {
            return null;
        }
        if (!".".equals(str)) {
            if ((node == null ? null : (Node) XPathFactory.newInstance().newXPath().evaluate(str, node, XPathConstants.NODE)) == null) {
                return null;
            }
        }
        return XPathFactory.newInstance().newXPath().evaluate(str, node).trim();
    }

    public static Document OooO0O0(String str) throws ParserConfigurationException, SAXException, IOException {
        NamespaceRemovingInputStream namespaceRemovingInputStream = new NamespaceRemovingInputStream(new ByteArrayInputStream(str.getBytes(StringUtils.f11186OooO00o)));
        Document document = f11194OooO0O0.newDocumentBuilder().parse(namespaceRemovingInputStream);
        namespaceRemovingInputStream.close();
        return document;
    }
}
