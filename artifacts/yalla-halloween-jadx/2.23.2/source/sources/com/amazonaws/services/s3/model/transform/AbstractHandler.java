package com.amazonaws.services.s3.model.transform;

import java.util.LinkedList;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractHandler extends DefaultHandler {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final StringBuilder f12548OooO0Oo = new StringBuilder();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final LinkedList<String> f12549OooO0o0 = new LinkedList<>();

    public final boolean OooO0OO() {
        return this.f12549OooO0o0.isEmpty();
    }

    public abstract void OooO0oo(String str);

    public abstract void OooOO0(String str, Attributes attributes);

    public final String OooOO0O() {
        return this.f12548OooO0Oo.toString();
    }

    public final boolean OooOO0o(String... strArr) {
        int length = strArr.length;
        LinkedList<String> linkedList = this.f12549OooO0o0;
        if (length != linkedList.size()) {
            return false;
        }
        int i = 0;
        for (String str : linkedList) {
            String str2 = strArr[i];
            if (!str2.equals("*") && !str2.equals(str)) {
                return false;
            }
            i++;
        }
        return true;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i, int i2) {
        this.f12548OooO0Oo.append(cArr, i, i2);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        this.f12549OooO0o0.removeLast();
        OooO0oo(str2);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        this.f12548OooO0Oo.setLength(0);
        OooOO0(str2, attributes);
        this.f12549OooO0o0.add(str2);
    }
}
