package com.squareup.okhttp;

import com.google.android.gms.internal.measurement.o0O0ooO;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Ooo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o00Ooo f21174OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00Oo0 f21175OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Protocol f21176OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f21177OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f21178OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Oooo0 f21179OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Oooo000 f21180OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final oo000o f21181OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o00Ooo f21182OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o00Ooo f21183OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public volatile OooO f21184OooOO0O;

    public o00Ooo(OooO00o oooO00o) {
        this.f21175OooO00o = oooO00o.f21186OooO00o;
        this.f21176OooO0O0 = oooO00o.f21187OooO0O0;
        this.f21177OooO0OO = oooO00o.f21188OooO0OO;
        this.f21178OooO0Oo = oooO00o.f21189OooO0Oo;
        this.f21180OooO0o0 = oooO00o.f21191OooO0o0;
        Oooo0.OooO00o oooO00o2 = oooO00o.f21190OooO0o;
        oooO00o2.getClass();
        this.f21179OooO0o = new Oooo0(oooO00o2);
        this.f21181OooO0oO = oooO00o.f21192OooO0oO;
        this.f21182OooO0oo = oooO00o.f21193OooO0oo;
        this.f21174OooO = oooO00o.f21185OooO;
        this.f21183OooOO0 = oooO00o.f21194OooOO0;
    }

    public final OooO OooO00o() {
        OooO oooO = this.f21184OooOO0O;
        if (oooO != null) {
            return oooO;
        }
        OooO oooOOooO00o = OooO.OooO00o(this.f21179OooO0o);
        this.f21184OooOO0O = oooOOooO00o;
        return oooOOooO00o;
    }

    public final List<OooOOO0> OooO0O0() {
        String str;
        int i = this.f21177OooO0OO;
        if (i == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i != 407) {
                return Collections.emptyList();
            }
            str = "Proxy-Authenticate";
        }
        o0OO.OooOOOO.OooO00o oooO00o = o0OO.OooOOOO.f42212OooO00o;
        ArrayList arrayList = new ArrayList();
        Oooo0 oooo0 = this.f21179OooO0o;
        int length = oooo0.f21113OooO00o.length / 2;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equalsIgnoreCase(oooo0.OooO0O0(i2))) {
                String strOooO0Oo = oooo0.OooO0Oo(i2);
                int iOooO0OO = 0;
                while (iOooO0OO < strOooO0Oo.length()) {
                    int iOooO0O0 = o0O0ooO.OooO0O0(iOooO0OO, strOooO0Oo, ZegoConstants.ZegoVideoDataAuxPublishingStream);
                    String strTrim = strOooO0Oo.substring(iOooO0OO, iOooO0O0).trim();
                    int iOooO0OO2 = o0O0ooO.OooO0OO(iOooO0O0, strOooO0Oo);
                    if (!strOooO0Oo.regionMatches(true, iOooO0OO2, "realm=\"", 0, 7)) {
                        break;
                    }
                    int i3 = iOooO0OO2 + 7;
                    int iOooO0O1 = o0O0ooO.OooO0O0(i3, strOooO0Oo, "\"");
                    String strSubstring = strOooO0Oo.substring(i3, iOooO0O1);
                    iOooO0OO = o0O0ooO.OooO0OO(o0O0ooO.OooO0O0(iOooO0O1 + 1, strOooO0Oo, ",") + 1, strOooO0Oo);
                    arrayList.add(new OooOOO0(strTrim, strSubstring));
                }
            }
        }
        return arrayList;
    }

    public final String OooO0OO(String str) {
        String strOooO00o = this.f21179OooO0o.OooO00o(str);
        if (strOooO00o != null) {
            return strOooO00o;
        }
        return null;
    }

    public final OooO00o OooO0Oo() {
        return new OooO00o(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response{protocol=");
        sb.append(this.f21176OooO0O0);
        sb.append(", code=");
        sb.append(this.f21177OooO0OO);
        sb.append(", message=");
        sb.append(this.f21178OooO0Oo);
        sb.append(", url=");
        return androidx.compose.foundation.layout.oo000o.OooO0O0(sb, this.f21175OooO00o.f21164OooO00o.f21128OooO0oo, '}');
    }

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public o00Ooo f21185OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public o00Oo0 f21186OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Protocol f21187OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f21188OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public String f21189OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Oooo0.OooO00o f21190OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Oooo000 f21191OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public oo000o f21192OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public o00Ooo f21193OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public o00Ooo f21194OooOO0;

        public OooO00o() {
            this.f21188OooO0OO = -1;
            this.f21190OooO0o = new Oooo0.OooO00o();
        }

        public static void OooO0O0(String str, o00Ooo o00ooo2) {
            if (o00ooo2.f21181OooO0oO != null) {
                throw new IllegalArgumentException(str.concat(".body != null"));
            }
            if (o00ooo2.f21182OooO0oo != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null"));
            }
            if (o00ooo2.f21174OooO != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null"));
            }
            if (o00ooo2.f21183OooOO0 != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null"));
            }
        }

        public final o00Ooo OooO00o() {
            if (this.f21186OooO00o == null) {
                throw new IllegalStateException("request == null");
            }
            if (this.f21187OooO0O0 == null) {
                throw new IllegalStateException("protocol == null");
            }
            if (this.f21188OooO0OO >= 0) {
                return new o00Ooo(this);
            }
            throw new IllegalStateException("code < 0: " + this.f21188OooO0OO);
        }

        public final void OooO0OO(o00Ooo o00ooo2) {
            if (o00ooo2 != null && o00ooo2.f21181OooO0oO != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
            this.f21194OooOO0 = o00ooo2;
        }

        public OooO00o(o00Ooo o00ooo2) {
            this.f21188OooO0OO = -1;
            this.f21186OooO00o = o00ooo2.f21175OooO00o;
            this.f21187OooO0O0 = o00ooo2.f21176OooO0O0;
            this.f21188OooO0OO = o00ooo2.f21177OooO0OO;
            this.f21189OooO0Oo = o00ooo2.f21178OooO0Oo;
            this.f21191OooO0o0 = o00ooo2.f21180OooO0o0;
            this.f21190OooO0o = o00ooo2.f21179OooO0o.OooO0OO();
            this.f21192OooO0oO = o00ooo2.f21181OooO0oO;
            this.f21193OooO0oo = o00ooo2.f21182OooO0oo;
            this.f21185OooO = o00ooo2.f21174OooO;
            this.f21194OooOO0 = o00ooo2.f21183OooOO0;
        }
    }
}
