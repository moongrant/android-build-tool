package com.amazonaws.regions;

import com.facebook.internal.ServerProtocol;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class RegionMetadataParser {
    @Deprecated
    public RegionMetadataParser() {
    }

    public static String OooO00o(String str, Element element) {
        Node nodeItem = element.getElementsByTagName(str).item(0);
        if (nodeItem == null) {
            return null;
        }
        return nodeItem.getChildNodes().item(0).getNodeValue();
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Boolean>] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Boolean>] */
    @Deprecated
    public final List<Region> OooO0O0(InputStream inputStream) throws IOException {
        try {
            try {
                try {
                    Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputStream);
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                    NodeList elementsByTagName = document.getElementsByTagName("Region");
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < elementsByTagName.getLength(); i++) {
                        Node nodeItem = elementsByTagName.item(i);
                        if (nodeItem.getNodeType() == 1) {
                            Element element = (Element) nodeItem;
                            Region region = new Region(OooO00o("Name", element), OooO00o("Domain", element));
                            NodeList elementsByTagName2 = element.getElementsByTagName("Endpoint");
                            for (int i2 = 0; i2 < elementsByTagName2.getLength(); i2++) {
                                Element element2 = (Element) elementsByTagName2.item(i2);
                                String strOooO00o = OooO00o("ServiceName", element2);
                                String strOooO00o2 = OooO00o("Hostname", element2);
                                String strOooO00o3 = OooO00o("Http", element2);
                                String strOooO00o4 = OooO00o("Https", element2);
                                region.f10556OooO0OO.put(strOooO00o, strOooO00o2);
                                region.f10557OooO0Oo.put(strOooO00o, Boolean.valueOf(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equals(strOooO00o3)));
                                region.f10558OooO0o0.put(strOooO00o, Boolean.valueOf(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equals(strOooO00o4)));
                            }
                            arrayList.add(region);
                        }
                    }
                    return arrayList;
                } catch (IOException e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw new IOException("Unable to parse region metadata file: " + e2.getMessage(), e2);
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }
}
