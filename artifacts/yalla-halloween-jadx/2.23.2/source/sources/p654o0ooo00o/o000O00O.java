package p654o0ooo00o;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import p641o0ooOO0o.o0;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0O00oO0;
import p641o0ooOO0o.o0OoOoOo;
import p641o0ooOO0o.o0oO0Ooo;
import p648o0ooOoo.oO000o00;
import p653o0ooo00O.o0000O0;
import p653o0ooo00O.o0000O00;
import p653o0ooo00O.o0000O0O;
import p662o0oooO0O.o0OO;
import p662o0oooO0O.o0OOo000;

/* JADX INFO: loaded from: classes5.dex */
public final class o000O00O implements o0OoOoOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f59408OooO00o;

    public o000O00O(boolean z) {
        this.f59408OooO00o = z;
    }

    @Override // p641o0ooOO0o.o0OoOoOo
    @NotNull
    public final o0O00o00 intercept(@NotNull o0OoOoOo.OooO00o chain) throws Throwable {
        o0O00o00.OooO00o oooO00oOooO0Oo;
        o0O00o00 o0o00o00OooO00o;
        boolean z;
        Intrinsics.checkNotNullParameter(chain, "chain");
        o000O o000o = (o000O) chain;
        o0000O00 o0000o00 = o000o.f59399OooO0Oo;
        Intrinsics.checkNotNull(o0000o00);
        o0O00O0o request = o000o.f59401OooO0o0;
        o0oO0Ooo o0oo0ooo2 = request.f57831OooO0Oo;
        long jCurrentTimeMillis = System.currentTimeMillis();
        o0000O0 o0000o1 = o0000o00.f59327OooO00o;
        o000O0Oo o000o0oo2 = o0000o00.f59330OooO0Oo;
        o0 o0Var = o0000o00.f59328OooO0O0;
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            o0Var.requestHeadersStart(o0000o1);
            o000o0oo2.OooO0Oo(request);
            o0Var.requestHeadersEnd(o0000o1, request);
            boolean zOooO00o = o000O0O0.OooO00o(request.f57829OooO0O0);
            boolean z2 = true;
            o0000O0 o0000o2 = o0000o00.f59327OooO00o;
            o0000O0O o0000o0o2 = o0000o00.f59331OooO0o;
            if (!zOooO00o || o0oo0ooo2 == null) {
                o0000o2.OooO0oo(o0000o00, true, false, null);
                oooO00oOooO0Oo = null;
            } else {
                if (StringsKt__StringsJVMKt.equals("100-continue", request.OooO0O0("Expect"), true)) {
                    try {
                        o000o0oo2.OooO0oO();
                        oooO00oOooO0Oo = o0000o00.OooO0Oo(true);
                        o0Var.responseHeadersStart(o0000o2);
                        z = false;
                    } catch (IOException e) {
                        o0Var.requestFailed(o0000o2, e);
                        o0000o00.OooO0o0(e);
                        throw e;
                    }
                } else {
                    oooO00oOooO0Oo = null;
                    z = true;
                }
                if (oooO00oOooO0Oo != null) {
                    o0000o2.OooO0oo(o0000o00, true, false, null);
                    if (!(o0000o0o2.f59350OooO0oO != null)) {
                        o000o0oo2.getConnection().OooOO0o();
                    }
                } else if (o0oo0ooo2.isDuplex()) {
                    try {
                        o000o0oo2.OooO0oO();
                        o0oo0ooo2.writeTo(o0OO.OooO00o(o0000o00.OooO0O0(true, request)));
                    } catch (IOException e2) {
                        o0Var.requestFailed(o0000o2, e2);
                        o0000o00.OooO0o0(e2);
                        throw e2;
                    }
                } else {
                    o0OOo000 o0ooo000OooO00o = o0OO.OooO00o(o0000o00.OooO0O0(false, request));
                    o0oo0ooo2.writeTo(o0ooo000OooO00o);
                    o0ooo000OooO00o.close();
                }
                z2 = z;
            }
            if (o0oo0ooo2 == null || !o0oo0ooo2.isDuplex()) {
                try {
                    o000o0oo2.OooO00o();
                } catch (IOException e3) {
                    o0Var.requestFailed(o0000o2, e3);
                    o0000o00.OooO0o0(e3);
                    throw e3;
                }
            }
            if (oooO00oOooO0Oo == null) {
                oooO00oOooO0Oo = o0000o00.OooO0Oo(false);
                Intrinsics.checkNotNull(oooO00oOooO0Oo);
                if (z2) {
                    o0Var.responseHeadersStart(o0000o2);
                    z2 = false;
                }
            }
            oooO00oOooO0Oo.getClass();
            Intrinsics.checkNotNullParameter(request, "request");
            oooO00oOooO0Oo.f57861OooO00o = request;
            oooO00oOooO0Oo.f57866OooO0o0 = o0000o0o2.f59349OooO0o0;
            oooO00oOooO0Oo.f57870OooOO0O = jCurrentTimeMillis;
            oooO00oOooO0Oo.f57871OooOO0o = System.currentTimeMillis();
            o0O00o00 response = oooO00oOooO0Oo.OooO00o();
            int i = response.f57850OooO0oO;
            if (i == 100) {
                o0O00o00.OooO00o oooO00oOooO0Oo2 = o0000o00.OooO0Oo(false);
                Intrinsics.checkNotNull(oooO00oOooO0Oo2);
                if (z2) {
                    o0Var.responseHeadersStart(o0000o2);
                }
                oooO00oOooO0Oo2.getClass();
                Intrinsics.checkNotNullParameter(request, "request");
                oooO00oOooO0Oo2.f57861OooO00o = request;
                oooO00oOooO0Oo2.f57866OooO0o0 = o0000o0o2.f59349OooO0o0;
                oooO00oOooO0Oo2.f57870OooOO0O = jCurrentTimeMillis;
                oooO00oOooO0Oo2.f57871OooOO0o = System.currentTimeMillis();
                response = oooO00oOooO0Oo2.OooO00o();
                i = response.f57850OooO0oO;
            }
            Intrinsics.checkNotNullParameter(response, "response");
            o0Var.responseHeadersEnd(o0000o2, response);
            if (this.f59408OooO00o && i == 101) {
                o0O00o00.OooO00o oooO00o = new o0O00o00.OooO00o(response);
                oooO00o.f57867OooO0oO = oO000o00.f58126OooO0OO;
                o0o00o00OooO00o = oooO00o.OooO00o();
            } else {
                o0O00o00.OooO00o oooO00o2 = new o0O00o00.OooO00o(response);
                Intrinsics.checkNotNullParameter(response, "response");
                try {
                    String strOooO0OO = response.OooO0OO("Content-Type", null);
                    long jOooO0o = o000o0oo2.OooO0o(response);
                    oooO00o2.f57867OooO0oO = new o000OO00(strOooO0OO, jOooO0o, o0OO.OooO0O0(new o0000O00.OooO0O0(o0000o00, o000o0oo2.OooO0O0(response), jOooO0o)));
                    o0o00o00OooO00o = oooO00o2.OooO00o();
                } catch (IOException e4) {
                    o0Var.responseFailed(o0000o2, e4);
                    o0000o00.OooO0o0(e4);
                    throw e4;
                }
            }
            if (StringsKt__StringsJVMKt.equals("close", o0o00o00OooO00o.f57847OooO0Oo.OooO0O0("Connection"), true) || StringsKt__StringsJVMKt.equals("close", o0o00o00OooO00o.OooO0OO("Connection", null), true)) {
                o000o0oo2.getConnection().OooOO0o();
            }
            if (i == 204 || i == 205) {
                o0O00oO0 o0o00oo1 = o0o00o00OooO00o.f57852OooOO0;
                if ((o0o00oo1 == null ? -1L : o0o00oo1.OooO0OO()) > 0) {
                    StringBuilder sbOooO0O0 = androidx.appcompat.widget.o0000O0.OooO0O0("HTTP ", i, " had non-zero Content-Length: ");
                    sbOooO0O0.append(o0o00oo1 != null ? Long.valueOf(o0o00oo1.OooO0OO()) : null);
                    throw new ProtocolException(sbOooO0O0.toString());
                }
            }
            return o0o00o00OooO00o;
        } catch (IOException e5) {
            o0Var.requestFailed(o0000o1, e5);
            o0000o00.OooO0o0(e5);
            throw e5;
        }
    }
}
