package com.squareup.okhttp;

import com.google.android.gms.internal.measurement.o00oOoo;
import java.net.URI;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000oOoO f21164OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f21165OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Oooo0 f21166OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f21167OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile OooO f21168OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public volatile URI f21169OooO0o0;

    public o00Oo0(OooO00o oooO00o) {
        this.f21164OooO00o = oooO00o.f21170OooO00o;
        this.f21165OooO0O0 = oooO00o.f21171OooO0O0;
        Oooo0.OooO00o oooO00o2 = oooO00o.f21172OooO0OO;
        oooO00o2.getClass();
        this.f21166OooO0OO = new Oooo0(oooO00o2);
        Object obj = oooO00o.f21173OooO0Oo;
        this.f21167OooO0Oo = obj == null ? this : obj;
    }

    public final String OooO00o(String str) {
        return this.f21166OooO0OO.OooO00o(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.f21165OooO0O0);
        sb.append(", url=");
        sb.append(this.f21164OooO00o);
        sb.append(", tag=");
        Object obj = this.f21167OooO0Oo;
        if (obj == this) {
            obj = null;
        }
        return androidx.compose.runtime.OooOOO0.OooO00o(sb, obj, '}');
    }

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public o000oOoO f21170OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f21171OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Oooo0.OooO00o f21172OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Object f21173OooO0Oo;

        public OooO00o() {
            this.f21171OooO0O0 = "GET";
            this.f21172OooO0OO = new Oooo0.OooO00o();
        }

        public final o00Oo0 OooO00o() {
            if (this.f21170OooO00o != null) {
                return new o00Oo0(this);
            }
            throw new IllegalStateException("url == null");
        }

        public final void OooO0O0(String str, String str2) {
            this.f21172OooO0OO.OooO0o(str, str2);
        }

        public final void OooO0OO(String str) {
            if (str == null || str.length() == 0) {
                throw new IllegalArgumentException("method == null || method.length() == 0");
            }
            if (o00oOoo.OooO0O0(str)) {
                throw new IllegalArgumentException(p004OooO0oO.o000oOoO.OooO0O0("method ", str, " must have a request body."));
            }
            this.f21171OooO0O0 = str;
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
            o000oOoO o000ooooOooO0OO = new o000oOoO.OooO00o().OooO0OO(null, str);
            if (o000ooooOooO0OO == null) {
                throw new IllegalArgumentException("unexpected url: ".concat(str));
            }
            this.f21170OooO00o = o000ooooOooO0OO;
        }

        public OooO00o(o00Oo0 o00oo1) {
            this.f21170OooO00o = o00oo1.f21164OooO00o;
            this.f21171OooO0O0 = o00oo1.f21165OooO0O0;
            this.f21173OooO0Oo = o00oo1.f21167OooO0Oo;
            this.f21172OooO0OO = o00oo1.f21166OooO0OO.OooO0OO();
        }
    }
}
