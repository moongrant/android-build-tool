package com.amazonaws.services.s3.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class XmlWriter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f12432OooO00o = new ArrayList();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final StringBuilder f12433OooO0O0 = new StringBuilder();

    public final void OooO00o() {
        ArrayList arrayList = this.f12432OooO00o;
        String str = (String) arrayList.remove(arrayList.size() - 1);
        StringBuilder sb = this.f12433OooO0O0;
        sb.append("</");
        sb.append(str);
        sb.append(">");
    }

    public final void OooO0O0(String str) {
        StringBuilder sb = this.f12433OooO0O0;
        sb.append("<");
        sb.append(str);
        sb.append(">");
        this.f12432OooO00o.add(str);
    }

    public final void OooO0OO(String str) {
        StringBuilder sb;
        String str2;
        if (str == null) {
            str = "";
        }
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (true) {
            sb = this.f12433OooO0O0;
            if (i >= length) {
                break;
            }
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
                sb.append(str2);
                i2 = i + 1;
            }
            i++;
        }
        if (i2 < i) {
            sb.append((CharSequence) str, i2, i);
        }
    }

    public final String toString() {
        return this.f12433OooO0O0.toString();
    }
}
