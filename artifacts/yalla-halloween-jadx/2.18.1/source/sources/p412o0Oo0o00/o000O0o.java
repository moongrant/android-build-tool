package p412o0Oo0o00;

import com.squareup.okhttp.Protocol;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p016OooOoO0.OooOo00;
import p416o0Oo0oO0.o00oO0o;
import p416o0Oo0oO0.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public o000O0o f39312OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000O000 f39313OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Protocol f39314OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f39315OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f39316OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o000OO f39317OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0000O0O f39318OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o000Oo0 f39319OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public o000O0o f39320OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o000O0o f39321OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public volatile o00000O0 f39322OooOO0O;

    public o000O0o(OooO00o oooO00o) {
        this.f39313OooO00o = oooO00o.f39324OooO00o;
        this.f39314OooO0O0 = oooO00o.f39325OooO0O0;
        this.f39315OooO0OO = oooO00o.f39326OooO0OO;
        this.f39316OooO0Oo = oooO00o.f39327OooO0Oo;
        this.f39318OooO0o0 = oooO00o.f39329OooO0o0;
        this.f39317OooO0o = new o000OO(oooO00o.f39328OooO0o);
        this.f39319OooO0oO = oooO00o.f39330OooO0oO;
        this.f39320OooO0oo = oooO00o.f39331OooO0oo;
        this.f39312OooO = oooO00o.f39323OooO;
        this.f39321OooOO0 = oooO00o.f39332OooOO0;
    }

    public final o00000O0 OooO00o() {
        o00000O0 o00000o1 = this.f39322OooOO0O;
        if (o00000o1 != null) {
            return o00000o1;
        }
        o00000O0 o00000o0OooO00o = o00000O0.OooO00o(this.f39317OooO0o);
        this.f39322OooOO0O = o00000o0OooO00o;
        return o00000o0OooO00o;
    }

    public final List<o0000Ooo> OooO0O0() {
        String str;
        int i = this.f39315OooO0OO;
        if (i == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i != 407) {
                return Collections.emptyList();
            }
            str = "Proxy-Authenticate";
        }
        o000OO o000oo2 = this.f39317OooO0o;
        Comparator<String> comparator = o0O0O00.f39585OooO00o;
        ArrayList arrayList = new ArrayList();
        int length = o000oo2.f39333OooO00o.length / 2;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equalsIgnoreCase(o000oo2.OooO0O0(i2))) {
                String strOooO0Oo = o000oo2.OooO0Oo(i2);
                int iOooO0oO = 0;
                while (iOooO0oO < strOooO0Oo.length()) {
                    int iOooO0o = o00oO0o.OooO0o(strOooO0Oo, iOooO0oO, ZegoConstants.ZegoVideoDataAuxPublishingStream);
                    String strTrim = strOooO0Oo.substring(iOooO0oO, iOooO0o).trim();
                    int iOooO0oO2 = o00oO0o.OooO0oO(strOooO0Oo, iOooO0o);
                    if (!strOooO0Oo.regionMatches(true, iOooO0oO2, "realm=\"", 0, 7)) {
                        break;
                    }
                    int i3 = iOooO0oO2 + 7;
                    int iOooO0o2 = o00oO0o.OooO0o(strOooO0Oo, i3, "\"");
                    String strSubstring = strOooO0Oo.substring(i3, iOooO0o2);
                    iOooO0oO = o00oO0o.OooO0oO(strOooO0Oo, o00oO0o.OooO0o(strOooO0Oo, iOooO0o2 + 1, ",") + 1);
                    arrayList.add(new o0000Ooo(strTrim, strSubstring));
                }
            }
        }
        return arrayList;
    }

    public final String OooO0OO(String str) {
        String strOooO00o = this.f39317OooO0o.OooO00o(str);
        if (strOooO00o != null) {
            return strOooO00o;
        }
        return null;
    }

    public final OooO00o OooO0Oo() {
        return new OooO00o(this);
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Response{protocol=");
        sbOooO0o0.append(this.f39314OooO0O0);
        sbOooO0o0.append(", code=");
        sbOooO0o0.append(this.f39315OooO0OO);
        sbOooO0o0.append(", message=");
        sbOooO0o0.append(this.f39316OooO0Oo);
        sbOooO0o0.append(", url=");
        return Oooo000.o00oO0o.OooO0O0(sbOooO0o0, this.f39313OooO00o.f39302OooO00o.f39266OooO0oo, '}');
    }

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public o000O0o f39323OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public o000O000 f39324OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Protocol f39325OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f39326OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public String f39327OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public o000OO.OooO00o f39328OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public o0000O0O f39329OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public o000Oo0 f39330OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public o000O0o f39331OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public o000O0o f39332OooOO0;

        public OooO00o() {
            this.f39326OooO0OO = -1;
            this.f39328OooO0o = new o000OO.OooO00o();
        }

        public final o000O0o OooO00o() {
            if (this.f39324OooO00o == null) {
                throw new IllegalStateException("request == null");
            }
            if (this.f39325OooO0O0 == null) {
                throw new IllegalStateException("protocol == null");
            }
            if (this.f39326OooO0OO >= 0) {
                return new o000O0o(this);
            }
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("code < 0: ");
            sbOooO0o0.append(this.f39326OooO0OO);
            throw new IllegalStateException(sbOooO0o0.toString());
        }

        public final OooO00o OooO0O0(o000O0o o000o0o2) {
            if (o000o0o2 != null) {
                OooO0OO("cacheResponse", o000o0o2);
            }
            this.f39323OooO = o000o0o2;
            return this;
        }

        public final void OooO0OO(String str, o000O0o o000o0o2) {
            if (o000o0o2.f39319OooO0oO != null) {
                throw new IllegalArgumentException(OooOo00.OooO0Oo(str, ".body != null"));
            }
            if (o000o0o2.f39320OooO0oo != null) {
                throw new IllegalArgumentException(OooOo00.OooO0Oo(str, ".networkResponse != null"));
            }
            if (o000o0o2.f39312OooO != null) {
                throw new IllegalArgumentException(OooOo00.OooO0Oo(str, ".cacheResponse != null"));
            }
            if (o000o0o2.f39321OooOO0 != null) {
                throw new IllegalArgumentException(OooOo00.OooO0Oo(str, ".priorResponse != null"));
            }
        }

        public final OooO00o OooO0Oo(o000OO o000oo2) {
            this.f39328OooO0o = o000oo2.OooO0OO();
            return this;
        }

        public final OooO00o OooO0o0(o000O0o o000o0o2) {
            if (o000o0o2 != null && o000o0o2.f39319OooO0oO != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
            this.f39332OooOO0 = o000o0o2;
            return this;
        }

        public OooO00o(o000O0o o000o0o2) {
            this.f39326OooO0OO = -1;
            this.f39324OooO00o = o000o0o2.f39313OooO00o;
            this.f39325OooO0O0 = o000o0o2.f39314OooO0O0;
            this.f39326OooO0OO = o000o0o2.f39315OooO0OO;
            this.f39327OooO0Oo = o000o0o2.f39316OooO0Oo;
            this.f39329OooO0o0 = o000o0o2.f39318OooO0o0;
            this.f39328OooO0o = o000o0o2.f39317OooO0o.OooO0OO();
            this.f39330OooO0oO = o000o0o2.f39319OooO0oO;
            this.f39331OooO0oo = o000o0o2.f39320OooO0oo;
            this.f39323OooO = o000o0o2.f39312OooO;
            this.f39332OooOO0 = o000o0o2.f39321OooOO0;
        }
    }
}
