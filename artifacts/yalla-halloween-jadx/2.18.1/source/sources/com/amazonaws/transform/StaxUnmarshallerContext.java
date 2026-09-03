package com.amazonaws.transform;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class StaxUnmarshallerContext {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f11158OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final XmlPullParser f11159OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Deque<String> f11160OooO0OO = new LinkedList();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f11161OooO0Oo = "";

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Map<String, String> f11163OooO0o0 = new HashMap();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public List<MetadataExpression> f11162OooO0o = new ArrayList();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Map<String, String> f11164OooO0oO = null;

    public static class MetadataExpression {
    }

    public StaxUnmarshallerContext(XmlPullParser xmlPullParser) {
        this.f11159OooO0O0 = xmlPullParser;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Deque<java.lang.String>, java.util.LinkedList] */
    public final int OooO00o() {
        return this.f11160OooO0OO.size();
    }

    public final boolean OooO0O0() {
        return this.f11158OooO00o == 0;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<com.amazonaws.transform.StaxUnmarshallerContext$MetadataExpression>] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public final int OooO0OO() throws XmlPullParserException, IOException {
        int next = this.f11159OooO0O0.next();
        this.f11158OooO00o = next;
        if (next == 4) {
            this.f11158OooO00o = this.f11159OooO0O0.next();
        }
        OooO0o();
        if (this.f11158OooO00o == 2) {
            Iterator it = this.f11162OooO0o.iterator();
            while (it.hasNext()) {
                Objects.requireNonNull((MetadataExpression) it.next());
                if (OooO0o0(null, 0)) {
                    this.f11163OooO0o0.put(null, OooO0Oo());
                    break;
                }
            }
        }
        return this.f11158OooO00o;
    }

    public final String OooO0Oo() throws XmlPullParserException, IOException {
        String strNextText = this.f11159OooO0O0.nextText();
        if (this.f11159OooO0O0.getEventType() != 3) {
            this.f11159OooO0O0.next();
        }
        this.f11158OooO00o = this.f11159OooO0O0.getEventType();
        OooO0o();
        return strNextText;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Deque<java.lang.String>, java.util.LinkedList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.Deque<java.lang.String>, java.util.LinkedList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.Deque<java.lang.String>, java.util.LinkedList] */
    public final void OooO0o() {
        int i = this.f11158OooO00o;
        if (i != 2) {
            if (i == 3) {
                this.f11160OooO0OO.pop();
                this.f11161OooO0Oo = this.f11160OooO0OO.isEmpty() ? "" : (String) this.f11160OooO0OO.peek();
                return;
            }
            return;
        }
        String str = this.f11161OooO0Oo + "/" + this.f11159OooO0O0.getName();
        this.f11161OooO0Oo = str;
        this.f11160OooO0OO.push(str);
    }

    public final boolean OooO0o0(String str, int i) {
        if (".".equals(str)) {
            return true;
        }
        int iIndexOf = -1;
        while (true) {
            iIndexOf = str.indexOf("/", iIndexOf + 1);
            if (iIndexOf <= -1) {
                break;
            }
            if (str.charAt(iIndexOf + 1) != '@') {
                i++;
            }
        }
        if (OooO00o() == i) {
            if (this.f11161OooO0Oo.endsWith("/" + str)) {
                return true;
            }
        }
        return false;
    }
}
