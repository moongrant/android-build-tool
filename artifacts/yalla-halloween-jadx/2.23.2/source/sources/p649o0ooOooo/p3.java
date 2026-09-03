package p649o0ooOooo;

import com.facebook.share.internal.ShareConstants;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.Protocol;
import org.jetbrains.annotations.NotNull;
import p641o0ooOO0o.o0;
import p641o0ooOO0o.o0O000;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0O00oO0;
import p641o0ooOO0o.o0OoOoOo;
import p648o0ooOoo.oO000o00;
import p653o0ooo00O.o0000O0;
import p654o0ooo00o.o000O;

/* JADX INFO: loaded from: classes5.dex */
public final class p3 implements o0OoOoOo {

    public static final class OooO00o {
        public static final o0O00o00 OooO00o(o0O00o00 o0o00o01) {
            if ((o0o00o01 == null ? null : o0o00o01.f57852OooOO0) == null) {
                return o0o00o01;
            }
            o0o00o01.getClass();
            o0O00o00.OooO00o oooO00o = new o0O00o00.OooO00o(o0o00o01);
            oooO00o.f57867OooO0oO = null;
            return oooO00o.OooO00o();
        }

        public static boolean OooO0O0(String str) {
            return (StringsKt__StringsJVMKt.equals("Connection", str, true) || StringsKt__StringsJVMKt.equals("Keep-Alive", str, true) || StringsKt__StringsJVMKt.equals("Proxy-Authenticate", str, true) || StringsKt__StringsJVMKt.equals("Proxy-Authorization", str, true) || StringsKt__StringsJVMKt.equals("TE", str, true) || StringsKt__StringsJVMKt.equals("Trailers", str, true) || StringsKt__StringsJVMKt.equals("Transfer-Encoding", str, true) || StringsKt__StringsJVMKt.equals("Upgrade", str, true)) ? false : true;
        }
    }

    static {
        new OooO00o();
    }

    @Override // p641o0ooOO0o.o0OoOoOo
    @NotNull
    public final o0O00o00 intercept(@NotNull o0OoOoOo.OooO00o chain) throws IOException {
        o0O000 o0o001;
        Intrinsics.checkNotNullParameter(chain, "chain");
        o000O o000o = (o000O) chain;
        System.currentTimeMillis();
        o0O00O0o request = o000o.f59401OooO0o0;
        Intrinsics.checkNotNullParameter(request, "request");
        q3 q3Var = new q3(request, null);
        if (request != null && request.OooO00o().f57980OooOO0) {
            q3Var = new q3(null, null);
        }
        o0000O0 o0000o1 = o000o.f59396OooO00o;
        o0000O0 o0000o2 = o0000o1 instanceof o0000O0 ? o0000o1 : null;
        o0 o0Var = o0000o2 == null ? null : o0000o2.f59309OooO0oo;
        if (o0Var == null) {
            o0Var = o0.NONE;
        }
        o0O00O0o o0o00o0o = q3Var.f58131OooO00o;
        o0O00o00 o0o00o01 = q3Var.f58132OooO0O0;
        if (o0o00o0o == null && o0o00o01 == null) {
            o0O00o00.OooO00o oooO00o = new o0O00o00.OooO00o();
            Intrinsics.checkNotNullParameter(request, "request");
            oooO00o.f57861OooO00o = request;
            Protocol protocol = Protocol.HTTP_1_1;
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            oooO00o.f57862OooO0O0 = protocol;
            oooO00o.f57863OooO0OO = 504;
            Intrinsics.checkNotNullParameter("Unsatisfiable Request (only-if-cached)", ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
            oooO00o.f57864OooO0Oo = "Unsatisfiable Request (only-if-cached)";
            oooO00o.f57867OooO0oO = oO000o00.f58126OooO0OO;
            oooO00o.f57870OooOO0O = -1L;
            oooO00o.f57871OooOO0o = System.currentTimeMillis();
            o0O00o00 o0o00o00OooO00o = oooO00o.OooO00o();
            o0Var.satisfactionFailure(o0000o1, o0o00o00OooO00o);
            return o0o00o00OooO00o;
        }
        if (o0o00o0o == null) {
            Intrinsics.checkNotNull(o0o00o01);
            o0o00o01.getClass();
            o0O00o00.OooO00o oooO00o2 = new o0O00o00.OooO00o(o0o00o01);
            o0O00o00 o0o00o00OooO00o2 = OooO00o.OooO00o(o0o00o01);
            o0O00o00.OooO00o.OooO0O0(o0o00o00OooO00o2, "cacheResponse");
            oooO00o2.f57860OooO = o0o00o00OooO00o2;
            o0O00o00 o0o00o00OooO00o3 = oooO00o2.OooO00o();
            o0Var.cacheHit(o0000o1, o0o00o00OooO00o3);
            return o0o00o00OooO00o3;
        }
        if (o0o00o01 != null) {
            o0Var.cacheConditionalHit(o0000o1, o0o00o01);
        }
        o0O00o00 o0o00o00OooO0OO = o000o.OooO0OO(o0o00o0o);
        if (o0o00o01 != null) {
            if (o0o00o00OooO0OO.f57850OooO0oO == 304) {
                o0O00o00.OooO00o oooO00o3 = new o0O00o00.OooO00o(o0o00o01);
                o0O000.OooO00o oooO00o4 = new o0O000.OooO00o();
                o0O000 o0o002 = o0o00o01.f57846OooO;
                int length = o0o002.f57773OooO0Oo.length / 2;
                int i = 0;
                while (true) {
                    o0o001 = o0o00o00OooO0OO.f57846OooO;
                    if (i >= length) {
                        break;
                    }
                    int i2 = i + 1;
                    String strOooO0OO = o0o002.OooO0OO(i);
                    String strOooO0o0 = o0o002.OooO0o0(i);
                    if (!StringsKt__StringsJVMKt.equals("Warning", strOooO0OO, true) || !StringsKt__StringsJVMKt.startsWith$default(strOooO0o0, "1", false, 2, null)) {
                        if ((StringsKt__StringsJVMKt.equals("Content-Length", strOooO0OO, true) || StringsKt__StringsJVMKt.equals("Content-Encoding", strOooO0OO, true) || StringsKt__StringsJVMKt.equals("Content-Type", strOooO0OO, true)) || !OooO00o.OooO0O0(strOooO0OO) || o0o001.OooO00o(strOooO0OO) == null) {
                            oooO00o4.OooO0O0(strOooO0OO, strOooO0o0);
                        }
                    }
                    i = i2;
                }
                int length2 = o0o001.f57773OooO0Oo.length / 2;
                int i3 = 0;
                while (i3 < length2) {
                    int i4 = i3 + 1;
                    String strOooO0OO2 = o0o001.OooO0OO(i3);
                    if (!(StringsKt__StringsJVMKt.equals("Content-Length", strOooO0OO2, true) || StringsKt__StringsJVMKt.equals("Content-Encoding", strOooO0OO2, true) || StringsKt__StringsJVMKt.equals("Content-Type", strOooO0OO2, true)) && OooO00o.OooO0O0(strOooO0OO2)) {
                        oooO00o4.OooO0O0(strOooO0OO2, o0o001.OooO0o0(i3));
                    }
                    i3 = i4;
                }
                oooO00o3.OooO0OO(oooO00o4.OooO0OO());
                oooO00o3.f57870OooOO0O = o0o00o00OooO0OO.f57855OooOOO;
                oooO00o3.f57871OooOO0o = o0o00o00OooO0OO.f57857OooOOOO;
                o0O00o00 o0o00o00OooO00o4 = OooO00o.OooO00o(o0o00o01);
                o0O00o00.OooO00o.OooO0O0(o0o00o00OooO00o4, "cacheResponse");
                oooO00o3.f57860OooO = o0o00o00OooO00o4;
                o0O00o00 o0o00o00OooO00o5 = OooO00o.OooO00o(o0o00o00OooO0OO);
                o0O00o00.OooO00o.OooO0O0(o0o00o00OooO00o5, "networkResponse");
                oooO00o3.f57868OooO0oo = o0o00o00OooO00o5;
                oooO00o3.OooO00o();
                o0O00oO0 o0o00oo1 = o0o00o00OooO0OO.f57852OooOO0;
                Intrinsics.checkNotNull(o0o00oo1);
                o0o00oo1.close();
                Intrinsics.checkNotNull(null);
                throw null;
            }
            o0O00oO0 o0o00oo2 = o0o00o01.f57852OooOO0;
            if (o0o00oo2 != null) {
                oO000o00.OooO0OO(o0o00oo2);
            }
        }
        Intrinsics.checkNotNull(o0o00o00OooO0OO);
        o0O00o00.OooO00o oooO00o5 = new o0O00o00.OooO00o(o0o00o00OooO0OO);
        o0O00o00 o0o00o00OooO00o6 = OooO00o.OooO00o(o0o00o01);
        o0O00o00.OooO00o.OooO0O0(o0o00o00OooO00o6, "cacheResponse");
        oooO00o5.f57860OooO = o0o00o00OooO00o6;
        o0O00o00 o0o00o00OooO00o7 = OooO00o.OooO00o(o0o00o00OooO0OO);
        o0O00o00.OooO00o.OooO0O0(o0o00o00OooO00o7, "networkResponse");
        oooO00o5.f57868OooO0oo = o0o00o00OooO00o7;
        return oooO00o5.OooO00o();
    }
}
