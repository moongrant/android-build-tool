package p590o0oOooo0;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: classes4.dex */
public final class z {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Document f57308OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Element f57309OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public NodeList f57310OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Node f57311OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f57312OooO0o0 = 0;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String OooO00o(String str) {
        String nodeValue;
        Element element = (Element) this.f57311OooO0Oo;
        try {
            if (str.equals(".")) {
                nodeValue = this.f57311OooO0Oo.getFirstChild().getNodeValue();
            } else {
                NodeList elementsByTagName = element.getElementsByTagName(str);
                nodeValue = elementsByTagName != null ? elementsByTagName.item(0).getFirstChild().getNodeValue() : null;
            }
        } catch (Exception unused) {
        }
        return nodeValue;
    }
}
