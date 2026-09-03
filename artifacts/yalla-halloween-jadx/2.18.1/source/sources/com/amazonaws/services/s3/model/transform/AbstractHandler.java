package com.amazonaws.services.s3.model.transform;

import java.util.LinkedList;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

/* JADX INFO: loaded from: classes.dex */
abstract class AbstractHandler extends DefaultHandler {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final StringBuilder f11005Oooo0o = new StringBuilder();

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final LinkedList<String> f11006Oooo0oO = new LinkedList<>();

    public final boolean OooO0O0() {
        return this.f11006Oooo0oO.isEmpty();
    }

    public abstract void OooO0o0(String str);

    public abstract void OooO0oo(String str, Attributes attributes);

    public final String OooOO0O() {
        return this.f11005Oooo0o.toString();
    }

    public final boolean OooOOOO(String... strArr) {
        if (strArr.length != this.f11006Oooo0oO.size()) {
            return false;
        }
        int i = 0;
        for (String str : this.f11006Oooo0oO) {
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
        this.f11005Oooo0o.append(cArr, i, i2);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        this.f11006Oooo0oO.removeLast();
        OooO0o0(str2);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        this.f11005Oooo0o.setLength(0);
        OooO0oo(str2, attributes);
        this.f11006Oooo0oO.add(str2);
    }
}
