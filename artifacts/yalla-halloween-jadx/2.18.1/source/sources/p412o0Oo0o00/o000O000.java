package p412o0Oo0o00;

import OooO0o.OooO0OO;
import com.qiniu.android.http.request.Request;
import java.io.IOException;
import java.net.URI;
import p016OooOoO0.OooOo00;
import p100o000oOoO.o0;
import p168o00Ooo0.OooOo;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0000O f39302OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f39303OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000OO f39304OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f39305OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile o00000O0 f39306OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public volatile URI f39307OooO0o0;

    public o000O000(OooO00o oooO00o) {
        this.f39302OooO00o = oooO00o.f39308OooO00o;
        this.f39303OooO0O0 = oooO00o.f39309OooO0O0;
        this.f39304OooO0OO = new o000OO(oooO00o.f39310OooO0OO);
        Object obj = oooO00o.f39311OooO0Oo;
        this.f39305OooO0Oo = obj == null ? this : obj;
    }

    public final o00000O0 OooO00o() {
        o00000O0 o00000o1 = this.f39306OooO0o;
        if (o00000o1 != null) {
            return o00000o1;
        }
        o00000O0 o00000o0OooO00o = o00000O0.OooO00o(this.f39304OooO0OO);
        this.f39306OooO0o = o00000o0OooO00o;
        return o00000o0OooO00o;
    }

    public final String OooO0O0(String str) {
        return this.f39304OooO0OO.OooO00o(str);
    }

    public final boolean OooO0OO() {
        return this.f39302OooO00o.f39259OooO00o.equals("https");
    }

    public final OooO00o OooO0Oo() {
        return new OooO00o(this);
    }

    public final URI OooO0o0() throws IOException {
        try {
            URI uri = this.f39307OooO0o0;
            if (uri != null) {
                return uri;
            }
            URI uriOooOO0O = this.f39302OooO00o.OooOO0O();
            this.f39307OooO0o0 = uriOooOO0O;
            return uriOooOO0O;
        } catch (IllegalStateException e) {
            throw new IOException(e.getMessage());
        }
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Request{method=");
        sbOooO0o0.append(this.f39303OooO0O0);
        sbOooO0o0.append(", url=");
        sbOooO0o0.append(this.f39302OooO00o);
        sbOooO0o0.append(", tag=");
        Object obj = this.f39305OooO0Oo;
        if (obj == this) {
            obj = null;
        }
        return o0.OooO00o(sbOooO0o0, obj, '}');
    }

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public o0000O f39308OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f39309OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public o000OO.OooO00o f39310OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Object f39311OooO0Oo;

        public OooO00o() {
            this.f39309OooO0O0 = Request.HttpMethodGet;
            this.f39310OooO0OO = new o000OO.OooO00o();
        }

        public final o000O000 OooO00o() {
            if (this.f39308OooO00o != null) {
                return new o000O000(this);
            }
            throw new IllegalStateException("url == null");
        }

        public final OooO00o OooO0O0(String str, String str2) {
            this.f39310OooO0OO.OooO0oO(str, str2);
            return this;
        }

        public final OooO00o OooO0OO(String str) {
            if (str == null || str.length() == 0) {
                throw new IllegalArgumentException("method == null || method.length() == 0");
            }
            if (OooOo.OooO0o(str)) {
                throw new IllegalArgumentException(OooO0OO.OooO00o("method ", str, " must have a request body."));
            }
            this.f39309OooO0O0 = str;
            return this;
        }

        public final OooO00o OooO0Oo(String str) {
            this.f39310OooO0OO.OooO0o(str);
            return this;
        }

        public final OooO00o OooO0o(o0000O o0000o2) {
            this.f39308OooO00o = o0000o2;
            return this;
        }

        public final OooO00o OooO0o0(String str) {
            if (str == null) {
                throw new IllegalArgumentException("url == null");
            }
            if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("http:");
                sbOooO0o0.append(str.substring(3));
                str = sbOooO0o0.toString();
            } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("https:");
                sbOooO0o1.append(str.substring(4));
                str = sbOooO0o1.toString();
            }
            o0000O o0000oOooO0OO = new o0000O.OooO00o().OooO0OO(null, str);
            if (o0000oOooO0OO == null) {
                throw new IllegalArgumentException(OooOo00.OooO0Oo("unexpected url: ", str));
            }
            OooO0o(o0000oOooO0OO);
            return this;
        }

        public OooO00o(o000O000 o000o001) {
            this.f39308OooO00o = o000o001.f39302OooO00o;
            this.f39309OooO0O0 = o000o001.f39303OooO0O0;
            this.f39311OooO0Oo = o000o001.f39305OooO0Oo;
            this.f39310OooO0OO = o000o001.f39304OooO0OO.OooO0OO();
        }
    }
}
