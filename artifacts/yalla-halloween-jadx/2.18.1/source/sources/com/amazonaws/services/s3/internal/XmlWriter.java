package com.amazonaws.services.s3.internal;

import com.amazonaws.util.StringUtils;
import java.util.ArrayList;
import java.util.List;
import p023Oooo00O.o00O0;

/* JADX INFO: loaded from: classes.dex */
public class XmlWriter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public List<String> f10682OooO00o = new ArrayList();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public StringBuilder f10683OooO0O0 = new StringBuilder();

    public final void OooO00o(String str, StringBuilder sb) {
        String str2;
        if (str == null) {
            str = "";
        }
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\t') {
                str2 = "&#9;";
            } else if (cCharAt == '\n') {
                str2 = "&#10;";
            } else if (cCharAt == '\r') {
                str2 = "&#13;";
            } else if (cCharAt == '\"') {
                str2 = "&quot;";
            } else if (cCharAt == '&') {
                str2 = "&amp;";
            } else if (cCharAt != '<') {
                str2 = cCharAt != '>' ? null : "&gt;";
            } else {
                str2 = "&lt;";
            }
            if (str2 != null) {
                if (i2 < i) {
                    sb.append((CharSequence) str, i2, i);
                }
                this.f10683OooO0O0.append(str2);
                i2 = i + 1;
            }
            i++;
        }
        if (i2 < i) {
            this.f10683OooO0O0.append((CharSequence) str, i2, i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    public final XmlWriter OooO0O0() {
        ?? r0 = this.f10682OooO00o;
        o00O0.OooO0OO(this.f10683OooO0O0, "</", (String) r0.remove(r0.size() - 1), ">");
        return this;
    }

    public final byte[] OooO0OO() {
        return toString().getBytes(StringUtils.f11186OooO00o);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    public final XmlWriter OooO0Oo(String str) {
        o00O0.OooO0OO(this.f10683OooO0O0, "<", str, ">");
        this.f10682OooO00o.add(str);
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    public final XmlWriter OooO0o(String str) {
        StringBuilder sb = this.f10683OooO0O0;
        sb.append("<");
        sb.append(str);
        OooO0oo("xmlns", "http://s3.amazonaws.com/doc/2006-03-01/");
        this.f10683OooO0O0.append(">");
        this.f10682OooO00o.add(str);
        return this;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    public final XmlWriter OooO0o0(String[] strArr, String[] strArr2) {
        StringBuilder sb = this.f10683OooO0O0;
        sb.append("<");
        sb.append("Grantee");
        for (int i = 0; i < Math.min(strArr.length, strArr2.length); i++) {
            OooO0oo(strArr[i], strArr2[i]);
        }
        this.f10683OooO0O0.append(">");
        this.f10682OooO00o.add("Grantee");
        return this;
    }

    public final XmlWriter OooO0oO(String str) {
        OooO00o(str, this.f10683OooO0O0);
        return this;
    }

    public final void OooO0oo(String str, String str2) {
        StringBuilder sb = this.f10683OooO0O0;
        sb.append(' ');
        sb.append(str);
        sb.append("=\"");
        OooO00o(str2, this.f10683OooO0O0);
        this.f10683OooO0O0.append("\"");
    }

    public final String toString() {
        return this.f10683OooO0O0.toString();
    }
}
