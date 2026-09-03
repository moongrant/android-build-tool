package com.squareup.okhttp;

import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p338o0OO0ooo.o0000O0O;
import p338o0OO0ooo.o000Oo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oo000o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final oo000o f21650OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00Ooo f21651OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Protocol f21652OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f21653OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f21654OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o000oOoO f21655OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Oooo0 f21656OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o00oO0o f21657OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final oo000o f21658OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final oo000o f21659OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public volatile OooO f21660OooOO0O;

    public oo000o(OooO00o oooO00o) {
        this.f21651OooO00o = oooO00o.f21662OooO00o;
        this.f21652OooO0O0 = oooO00o.f21663OooO0O0;
        this.f21653OooO0OO = oooO00o.f21664OooO0OO;
        this.f21654OooO0Oo = oooO00o.f21665OooO0Oo;
        this.f21656OooO0o0 = oooO00o.f21667OooO0o0;
        o000oOoO.OooO00o oooO00o2 = oooO00o.f21666OooO0o;
        oooO00o2.getClass();
        this.f21655OooO0o = new o000oOoO(oooO00o2);
        this.f21657OooO0oO = oooO00o.f21668OooO0oO;
        this.f21658OooO0oo = oooO00o.f21669OooO0oo;
        this.f21650OooO = oooO00o.f21661OooO;
        this.f21659OooOO0 = oooO00o.f21670OooOO0;
    }

    public final OooO OooO00o() {
        OooO oooO = this.f21660OooOO0O;
        if (oooO != null) {
            return oooO;
        }
        OooO oooOOooO00o = OooO.OooO00o(this.f21655OooO0o);
        this.f21660OooOO0O = oooOOooO00o;
        return oooOOooO00o;
    }

    public final List<OooOOO0> OooO0O0() {
        String str;
        int i = this.f21653OooO0OO;
        if (i == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i != 407) {
                return Collections.emptyList();
            }
            str = "Proxy-Authenticate";
        }
        o000Oo0.OooO00o oooO00o = o000Oo0.f43555OooO00o;
        ArrayList arrayList = new ArrayList();
        o000oOoO o000oooo2 = this.f21655OooO0o;
        int length = o000oooo2.f21591OooO00o.length / 2;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equalsIgnoreCase(o000oooo2.OooO0O0(i2))) {
                String strOooO0Oo = o000oooo2.OooO0Oo(i2);
                int iOooO0OO = 0;
                while (iOooO0OO < strOooO0Oo.length()) {
                    int iOooO0O0 = o0000O0O.OooO0O0(iOooO0OO, strOooO0Oo, ZegoConstants.ZegoVideoDataAuxPublishingStream);
                    String strTrim = strOooO0Oo.substring(iOooO0OO, iOooO0O0).trim();
                    int iOooO0OO2 = o0000O0O.OooO0OO(iOooO0O0, strOooO0Oo);
                    if (!strOooO0Oo.regionMatches(true, iOooO0OO2, "realm=\"", 0, 7)) {
                        break;
                    }
                    int i3 = iOooO0OO2 + 7;
                    int iOooO0O1 = o0000O0O.OooO0O0(i3, strOooO0Oo, "\"");
                    String strSubstring = strOooO0Oo.substring(i3, iOooO0O1);
                    iOooO0OO = o0000O0O.OooO0OO(o0000O0O.OooO0O0(iOooO0O1 + 1, strOooO0Oo, ",") + 1, strOooO0Oo);
                    arrayList.add(new OooOOO0(strTrim, strSubstring));
                }
            }
        }
        return arrayList;
    }

    public final String OooO0OO(String str) {
        String strOooO00o = this.f21655OooO0o.OooO00o(str);
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
        sb.append(this.f21652OooO0O0);
        sb.append(", code=");
        sb.append(this.f21653OooO0OO);
        sb.append(", message=");
        sb.append(this.f21654OooO0Oo);
        sb.append(", url=");
        return androidx.compose.foundation.layout.oo000o.OooO00o(sb, this.f21651OooO00o.f21620OooO00o.f21638OooO0oo, '}');
    }

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public oo000o f21661OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public o00Ooo f21662OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Protocol f21663OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f21664OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public String f21665OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public o000oOoO.OooO00o f21666OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Oooo0 f21667OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public o00oO0o f21668OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public oo000o f21669OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public oo000o f21670OooOO0;

        public OooO00o() {
            this.f21664OooO0OO = -1;
            this.f21666OooO0o = new o000oOoO.OooO00o();
        }

        public static void OooO0O0(String str, oo000o oo000oVar) {
            if (oo000oVar.f21657OooO0oO != null) {
                throw new IllegalArgumentException(str.concat(".body != null"));
            }
            if (oo000oVar.f21658OooO0oo != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null"));
            }
            if (oo000oVar.f21650OooO != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null"));
            }
            if (oo000oVar.f21659OooOO0 != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null"));
            }
        }

        public final oo000o OooO00o() {
            if (this.f21662OooO00o == null) {
                throw new IllegalStateException("request == null");
            }
            if (this.f21663OooO0O0 == null) {
                throw new IllegalStateException("protocol == null");
            }
            if (this.f21664OooO0OO >= 0) {
                return new oo000o(this);
            }
            throw new IllegalStateException("code < 0: " + this.f21664OooO0OO);
        }

        public final void OooO0OO(oo000o oo000oVar) {
            if (oo000oVar != null && oo000oVar.f21657OooO0oO != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
            this.f21670OooOO0 = oo000oVar;
        }

        public OooO00o(oo000o oo000oVar) {
            this.f21664OooO0OO = -1;
            this.f21662OooO00o = oo000oVar.f21651OooO00o;
            this.f21663OooO0O0 = oo000oVar.f21652OooO0O0;
            this.f21664OooO0OO = oo000oVar.f21653OooO0OO;
            this.f21665OooO0Oo = oo000oVar.f21654OooO0Oo;
            this.f21667OooO0o0 = oo000oVar.f21656OooO0o0;
            this.f21666OooO0o = oo000oVar.f21655OooO0o.OooO0OO();
            this.f21668OooO0oO = oo000oVar.f21657OooO0oO;
            this.f21669OooO0oo = oo000oVar.f21658OooO0oo;
            this.f21661OooO = oo000oVar.f21650OooO;
            this.f21670OooOO0 = oo000oVar.f21659OooOO0;
        }
    }
}
