package com.squareup.okhttp;

import java.net.URI;
import p338o0OO0ooo.o000O000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OoOo0 f21620OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f21621OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000oOoO f21622OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f21623OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile OooO f21624OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public volatile URI f21625OooO0o0;

    public o00Ooo(OooO00o oooO00o) {
        this.f21620OooO00o = oooO00o.f21626OooO00o;
        this.f21621OooO0O0 = oooO00o.f21627OooO0O0;
        o000oOoO.OooO00o oooO00o2 = oooO00o.f21628OooO0OO;
        oooO00o2.getClass();
        this.f21622OooO0OO = new o000oOoO(oooO00o2);
        Object obj = oooO00o.f21629OooO0Oo;
        this.f21623OooO0Oo = obj == null ? this : obj;
    }

    public final String OooO00o(String str) {
        return this.f21622OooO0OO.OooO00o(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.f21621OooO0O0);
        sb.append(", url=");
        sb.append(this.f21620OooO00o);
        sb.append(", tag=");
        Object obj = this.f21623OooO0Oo;
        if (obj == this) {
            obj = null;
        }
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public o0OoOo0 f21626OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f21627OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public o000oOoO.OooO00o f21628OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Object f21629OooO0Oo;

        public OooO00o() {
            this.f21627OooO0O0 = "GET";
            this.f21628OooO0OO = new o000oOoO.OooO00o();
        }

        public final o00Ooo OooO00o() {
            if (this.f21626OooO00o != null) {
                return new o00Ooo(this);
            }
            throw new IllegalStateException("url == null");
        }

        public final void OooO0O0(String str, String str2) {
            this.f21628OooO0OO.OooO0o(str, str2);
        }

        public final void OooO0OO(String str) {
            if (str == null || str.length() == 0) {
                throw new IllegalArgumentException("method == null || method.length() == 0");
            }
            if (o000O000.OooO0O0(str)) {
                throw new IllegalArgumentException(p004OooO0oO.o000oOoO.OooO00o("method ", str, " must have a request body."));
            }
            this.f21627OooO0O0 = str;
        }

        public final void OooO0Oo(String str) {
            if (str == null) {
                throw new IllegalArgumentException("url == null");
            }
            if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                str = "http:" + str.substring(3);
            } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                str = "https:" + str.substring(4);
            }
            o0OoOo0 o0oooo0OooO0OO = new o0OoOo0.OooO00o().OooO0OO(null, str);
            if (o0oooo0OooO0OO == null) {
                throw new IllegalArgumentException("unexpected url: ".concat(str));
            }
            this.f21626OooO00o = o0oooo0OooO0OO;
        }

        public OooO00o(o00Ooo o00ooo2) {
            this.f21626OooO00o = o00ooo2.f21620OooO00o;
            this.f21627OooO0O0 = o00ooo2.f21621OooO0O0;
            this.f21629OooO0Oo = o00ooo2.f21623OooO0Oo;
            this.f21628OooO0OO = o00ooo2.f21622OooO0OO.OooO0OO();
        }
    }
}
