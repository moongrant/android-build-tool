package p647o0ooOooo;

import androidx.appcompat.widget.o0000O0;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p634o0ooO0oO.o00OO00O;
import p634o0ooO0oO.o00OOO00;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.o0O0o;
import p634o0ooO0oO.o0oOOo;
import p634o0ooO0oO.oo00oO;
import p635o0ooO0oo.o0O000o0;
import p646o0ooOoo.oO000OOo;
import p646o0ooOoo.oO0Oo0oo;
import p646o0ooOoo.oO0o0o;
import p659o0oooO00.o00;
import p659o0oooO00.o000O0Oo;

/* JADX INFO: loaded from: classes5.dex */
public final class ic implements o00OOO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f59710OooO00o;

    public ic(boolean z) {
        this.f59710OooO00o = z;
    }

    @Override // p634o0ooO0oO.o00OOO00
    @NotNull
    public final o0oOOo intercept(@NotNull o00OOO00.OooO00o chain) throws Throwable {
        o0oOOo.OooO00o oooO00oOooO0Oo;
        o0oOOo o0ooooOooO00o;
        boolean z;
        Intrinsics.checkNotNullParameter(chain, "chain");
        nc ncVar = (nc) chain;
        oO0o0o oo0o0o = ncVar.f59718OooO0Oo;
        Intrinsics.checkNotNull(oo0o0o);
        o00OOOOo request = ncVar.f59720OooO0o0;
        oo00oO oo00oo = request.f57316OooO0Oo;
        long jCurrentTimeMillis = System.currentTimeMillis();
        oO0Oo0oo oo0oo0oo = oo0o0o.f59689OooO00o;
        kc kcVar = oo0o0o.f59692OooO0Oo;
        o00OO00O o00oo00o = oo0o0o.f59690OooO0O0;
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            o00oo00o.requestHeadersStart(oo0oo0oo);
            kcVar.OooO0Oo(request);
            o00oo00o.requestHeadersEnd(oo0oo0oo, request);
            boolean zOooO00o = mc.OooO00o(request.f57314OooO0O0);
            boolean z2 = true;
            oO0Oo0oo oo0oo0oo2 = oo0o0o.f59689OooO00o;
            oO000OOo oo000ooo = oo0o0o.f59693OooO0o;
            if (!zOooO00o || oo00oo == null) {
                oo0oo0oo2.OooO0oo(oo0o0o, true, false, null);
                oooO00oOooO0Oo = null;
            } else {
                if (StringsKt.OooOO0o("100-continue", request.OooO0O0("Expect"))) {
                    try {
                        kcVar.OooO0oO();
                        oooO00oOooO0Oo = oo0o0o.OooO0Oo(true);
                        o00oo00o.responseHeadersStart(oo0oo0oo2);
                        z = false;
                    } catch (IOException e) {
                        o00oo00o.requestFailed(oo0oo0oo2, e);
                        oo0o0o.OooO0o0(e);
                        throw e;
                    }
                } else {
                    oooO00oOooO0Oo = null;
                    z = true;
                }
                if (oooO00oOooO0Oo != null) {
                    oo0oo0oo2.OooO0oo(oo0o0o, true, false, null);
                    if (!(oo000ooo.f59622OooO0oO != null)) {
                        kcVar.getConnection().OooOO0o();
                    }
                } else if (oo00oo.isDuplex()) {
                    try {
                        kcVar.OooO0oO();
                        oo00oo.writeTo(o000O0Oo.OooO00o(oo0o0o.OooO0O0(true, request)));
                    } catch (IOException e2) {
                        o00oo00o.requestFailed(oo0oo0oo2, e2);
                        oo0o0o.OooO0o0(e2);
                        throw e2;
                    }
                } else {
                    o00 o00VarOooO00o = o000O0Oo.OooO00o(oo0o0o.OooO0O0(false, request));
                    oo00oo.writeTo(o00VarOooO00o);
                    o00VarOooO00o.close();
                }
                z2 = z;
            }
            if (oo00oo == null || !oo00oo.isDuplex()) {
                try {
                    kcVar.OooO00o();
                } catch (IOException e3) {
                    o00oo00o.requestFailed(oo0oo0oo2, e3);
                    oo0o0o.OooO0o0(e3);
                    throw e3;
                }
            }
            if (oooO00oOooO0Oo == null) {
                oooO00oOooO0Oo = oo0o0o.OooO0Oo(false);
                Intrinsics.checkNotNull(oooO00oOooO0Oo);
                if (z2) {
                    o00oo00o.responseHeadersStart(oo0oo0oo2);
                    z2 = false;
                }
            }
            oooO00oOooO0Oo.getClass();
            Intrinsics.checkNotNullParameter(request, "request");
            oooO00oOooO0Oo.f57356OooO00o = request;
            oooO00oOooO0Oo.f57361OooO0o0 = oo000ooo.f59621OooO0o0;
            oooO00oOooO0Oo.f57365OooOO0O = jCurrentTimeMillis;
            oooO00oOooO0Oo.f57366OooOO0o = System.currentTimeMillis();
            o0oOOo response = oooO00oOooO0Oo.OooO00o();
            int i = response.f57345OooO0oO;
            if (i == 100) {
                o0oOOo.OooO00o oooO00oOooO0Oo2 = oo0o0o.OooO0Oo(false);
                Intrinsics.checkNotNull(oooO00oOooO0Oo2);
                if (z2) {
                    o00oo00o.responseHeadersStart(oo0oo0oo2);
                }
                oooO00oOooO0Oo2.getClass();
                Intrinsics.checkNotNullParameter(request, "request");
                oooO00oOooO0Oo2.f57356OooO00o = request;
                oooO00oOooO0Oo2.f57361OooO0o0 = oo000ooo.f59621OooO0o0;
                oooO00oOooO0Oo2.f57365OooOO0O = jCurrentTimeMillis;
                oooO00oOooO0Oo2.f57366OooOO0o = System.currentTimeMillis();
                response = oooO00oOooO0Oo2.OooO00o();
                i = response.f57345OooO0oO;
            }
            Intrinsics.checkNotNullParameter(response, "response");
            o00oo00o.responseHeadersEnd(oo0oo0oo2, response);
            if (this.f59710OooO00o && i == 101) {
                o0oOOo.OooO00o oooO00o = new o0oOOo.OooO00o(response);
                oooO00o.f57362OooO0oO = o0O000o0.f57388OooO0OO;
                o0ooooOooO00o = oooO00o.OooO00o();
            } else {
                o0oOOo.OooO00o oooO00o2 = new o0oOOo.OooO00o(response);
                Intrinsics.checkNotNullParameter(response, "response");
                try {
                    String strOooO0OO = response.OooO0OO("Content-Type", null);
                    long jOooO0OO = kcVar.OooO0OO(response);
                    oooO00o2.f57362OooO0oO = new oc(strOooO0OO, jOooO0OO, o000O0Oo.OooO0O0(new oO0o0o.OooO0O0(oo0o0o, kcVar.OooO0o(response), jOooO0OO)));
                    o0ooooOooO00o = oooO00o2.OooO00o();
                } catch (IOException e4) {
                    o00oo00o.responseFailed(oo0oo0oo2, e4);
                    oo0o0o.OooO0o0(e4);
                    throw e4;
                }
            }
            if (StringsKt.OooOO0o("close", o0ooooOooO00o.f57342OooO0Oo.OooO0O0("Connection")) || StringsKt.OooOO0o("close", o0ooooOooO00o.OooO0OO("Connection", null))) {
                kcVar.getConnection().OooOO0o();
            }
            if (i == 204 || i == 205) {
                o0O0o o0o0o = o0ooooOooO00o.f57347OooOO0;
                if ((o0o0o == null ? -1L : o0o0o.OooO0OO()) > 0) {
                    StringBuilder sbOooO00o = o0000O0.OooO00o("HTTP ", i, " had non-zero Content-Length: ");
                    sbOooO00o.append(o0o0o != null ? Long.valueOf(o0o0o.OooO0OO()) : null);
                    throw new ProtocolException(sbOooO00o.toString());
                }
            }
            return o0ooooOooO00o;
        } catch (IOException e5) {
            o00oo00o.requestFailed(oo0oo0oo, e5);
            oo0o0o.OooO0o0(e5);
            throw e5;
        }
    }
}
