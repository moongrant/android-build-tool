package p516o0o0O000;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Document f42112OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Element f42113OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public NodeList f42114OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Node f42115OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f42116OooO0o0 = 0;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String OooO00o(String str) {
        String nodeValue;
        Element element = (Element) this.f42115OooO0Oo;
        try {
            if (str.equals(".")) {
                nodeValue = this.f42115OooO0Oo.getFirstChild().getNodeValue();
            } else {
                NodeList elementsByTagName = element.getElementsByTagName(str);
                nodeValue = elementsByTagName != null ? elementsByTagName.item(0).getFirstChild().getNodeValue() : null;
            }
        } catch (Exception unused) {
        }
        return nodeValue;
    }
}
