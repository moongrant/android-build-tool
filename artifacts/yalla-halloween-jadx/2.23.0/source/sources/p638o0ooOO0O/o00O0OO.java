package p638o0ooOO0O;

import com.facebook.share.internal.ShareConstants;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Protocol;
import org.jetbrains.annotations.NotNull;
import p634o0ooO0oO.o00OO00O;
import p634o0ooO0oO.o00OOO00;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.o0O0o;
import p634o0ooO0oO.o0oOOo;
import p634o0ooO0oO.oo0O;
import p635o0ooO0oo.o0O000o0;
import p646o0ooOoo.oO0Oo0oo;
import p647o0ooOooo.nc;

/* JADX INFO: loaded from: classes5.dex */
public final class o00O0OO implements o00OOO00 {

    public static final class OooO00o {
        public static final o0oOOo OooO00o(o0oOOo o0oooo) {
            if ((o0oooo == null ? null : o0oooo.f57347OooOO0) == null) {
                return o0oooo;
            }
            o0oooo.getClass();
            o0oOOo.OooO00o oooO00o = new o0oOOo.OooO00o(o0oooo);
            oooO00o.f57362OooO0oO = null;
            return oooO00o.OooO00o();
        }

        public static boolean OooO0O0(String str) {
            return (StringsKt.OooOO0o("Connection", str) || StringsKt.OooOO0o("Keep-Alive", str) || StringsKt.OooOO0o("Proxy-Authenticate", str) || StringsKt.OooOO0o("Proxy-Authorization", str) || StringsKt.OooOO0o("TE", str) || StringsKt.OooOO0o("Trailers", str) || StringsKt.OooOO0o("Transfer-Encoding", str) || StringsKt.OooOO0o("Upgrade", str)) ? false : true;
        }
    }

    static {
        new OooO00o();
    }

    @Override // p634o0ooO0oO.o00OOO00
    @NotNull
    public final o0oOOo intercept(@NotNull o00OOO00.OooO00o chain) throws IOException {
        oo0O oo0o;
        Intrinsics.checkNotNullParameter(chain, "chain");
        nc ncVar = (nc) chain;
        System.currentTimeMillis();
        o00OOOOo request = ncVar.f59720OooO0o0;
        Intrinsics.checkNotNullParameter(request, "request");
        o00O0OOO o00o0ooo2 = new o00O0OOO(request, null);
        if (request != null && request.OooO00o().f57166OooOO0) {
            o00o0ooo2 = new o00O0OOO(null, null);
        }
        oO0Oo0oo oo0oo0oo = ncVar.f59715OooO00o;
        oO0Oo0oo oo0oo0oo2 = oo0oo0oo instanceof oO0Oo0oo ? oo0oo0oo : null;
        o00OO00O o00oo00o = oo0oo0oo2 == null ? null : oo0oo0oo2.f59657OooO0oo;
        if (o00oo00o == null) {
            o00oo00o = o00OO00O.NONE;
        }
        o00OOOOo o00ooooo2 = o00o0ooo2.f57431OooO00o;
        o0oOOo o0oooo = o00o0ooo2.f57432OooO0O0;
        if (o00ooooo2 == null && o0oooo == null) {
            o0oOOo.OooO00o oooO00o = new o0oOOo.OooO00o();
            Intrinsics.checkNotNullParameter(request, "request");
            oooO00o.f57356OooO00o = request;
            Protocol protocol = Protocol.HTTP_1_1;
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            oooO00o.f57357OooO0O0 = protocol;
            oooO00o.f57358OooO0OO = 504;
            Intrinsics.checkNotNullParameter("Unsatisfiable Request (only-if-cached)", ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
            oooO00o.f57359OooO0Oo = "Unsatisfiable Request (only-if-cached)";
            oooO00o.f57362OooO0oO = o0O000o0.f57388OooO0OO;
            oooO00o.f57365OooOO0O = -1L;
            oooO00o.f57366OooOO0o = System.currentTimeMillis();
            o0oOOo o0ooooOooO00o = oooO00o.OooO00o();
            o00oo00o.satisfactionFailure(oo0oo0oo, o0ooooOooO00o);
            return o0ooooOooO00o;
        }
        if (o00ooooo2 == null) {
            Intrinsics.checkNotNull(o0oooo);
            o0oooo.getClass();
            o0oOOo.OooO00o oooO00o2 = new o0oOOo.OooO00o(o0oooo);
            o0oOOo o0ooooOooO00o2 = OooO00o.OooO00o(o0oooo);
            o0oOOo.OooO00o.OooO0O0(o0ooooOooO00o2, "cacheResponse");
            oooO00o2.f57355OooO = o0ooooOooO00o2;
            o0oOOo o0ooooOooO00o3 = oooO00o2.OooO00o();
            o00oo00o.cacheHit(oo0oo0oo, o0ooooOooO00o3);
            return o0ooooOooO00o3;
        }
        if (o0oooo != null) {
            o00oo00o.cacheConditionalHit(oo0oo0oo, o0oooo);
        }
        o0oOOo o0ooooOooO0O0 = ncVar.OooO0O0(o00ooooo2);
        if (o0oooo != null) {
            if (o0ooooOooO0O0.f57345OooO0oO == 304) {
                o0oOOo.OooO00o oooO00o3 = new o0oOOo.OooO00o(o0oooo);
                oo0O.OooO00o oooO00o4 = new oo0O.OooO00o();
                oo0O oo0o2 = o0oooo.f57341OooO;
                int length = oo0o2.f57369OooO0Oo.length / 2;
                int i = 0;
                while (true) {
                    oo0o = o0ooooOooO0O0.f57341OooO;
                    if (i >= length) {
                        break;
                    }
                    int i2 = i + 1;
                    String strOooO0OO = oo0o2.OooO0OO(i);
                    String strOooO0o0 = oo0o2.OooO0o0(i);
                    if (!StringsKt.OooOO0o("Warning", strOooO0OO) || !StringsKt.Oooo00o(strOooO0o0, "1")) {
                        if ((StringsKt.OooOO0o("Content-Length", strOooO0OO) || StringsKt.OooOO0o("Content-Encoding", strOooO0OO) || StringsKt.OooOO0o("Content-Type", strOooO0OO)) || !OooO00o.OooO0O0(strOooO0OO) || oo0o.OooO00o(strOooO0OO) == null) {
                            oooO00o4.OooO0O0(strOooO0OO, strOooO0o0);
                        }
                    }
                    i = i2;
                }
                int length2 = oo0o.f57369OooO0Oo.length / 2;
                int i3 = 0;
                while (i3 < length2) {
                    int i4 = i3 + 1;
                    String strOooO0OO2 = oo0o.OooO0OO(i3);
                    if (!(StringsKt.OooOO0o("Content-Length", strOooO0OO2) || StringsKt.OooOO0o("Content-Encoding", strOooO0OO2) || StringsKt.OooOO0o("Content-Type", strOooO0OO2)) && OooO00o.OooO0O0(strOooO0OO2)) {
                        oooO00o4.OooO0O0(strOooO0OO2, oo0o.OooO0o0(i3));
                    }
                    i3 = i4;
                }
                oooO00o3.OooO0OO(oooO00o4.OooO0OO());
                oooO00o3.f57365OooOO0O = o0ooooOooO0O0.f57350OooOOO;
                oooO00o3.f57366OooOO0o = o0ooooOooO0O0.f57352OooOOOO;
                o0oOOo o0ooooOooO00o4 = OooO00o.OooO00o(o0oooo);
                o0oOOo.OooO00o.OooO0O0(o0ooooOooO00o4, "cacheResponse");
                oooO00o3.f57355OooO = o0ooooOooO00o4;
                o0oOOo o0ooooOooO00o5 = OooO00o.OooO00o(o0ooooOooO0O0);
                o0oOOo.OooO00o.OooO0O0(o0ooooOooO00o5, "networkResponse");
                oooO00o3.f57363OooO0oo = o0ooooOooO00o5;
                oooO00o3.OooO00o();
                o0O0o o0o0o = o0ooooOooO0O0.f57347OooOO0;
                Intrinsics.checkNotNull(o0o0o);
                o0o0o.close();
                Intrinsics.checkNotNull(null);
                throw null;
            }
            o0O0o o0o0o2 = o0oooo.f57347OooOO0;
            if (o0o0o2 != null) {
                o0O000o0.OooO0OO(o0o0o2);
            }
        }
        Intrinsics.checkNotNull(o0ooooOooO0O0);
        o0oOOo.OooO00o oooO00o5 = new o0oOOo.OooO00o(o0ooooOooO0O0);
        o0oOOo o0ooooOooO00o6 = OooO00o.OooO00o(o0oooo);
        o0oOOo.OooO00o.OooO0O0(o0ooooOooO00o6, "cacheResponse");
        oooO00o5.f57355OooO = o0ooooOooO00o6;
        o0oOOo o0ooooOooO00o7 = OooO00o.OooO00o(o0ooooOooO0O0);
        o0oOOo.OooO00o.OooO0O0(o0ooooOooO00o7, "networkResponse");
        oooO00o5.f57363OooO0oo = o0ooooOooO00o7;
        return oooO00o5.OooO00o();
    }
}
