package p666o0oooO0o;

import androidx.appcompat.widget.o00000O0;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p660o0ooo0o0.o00OO00O;
import p660o0ooo0o0.o00OOO00;
import p660o0ooo0o0.o00OOOO0;
import p660o0ooo0o0.o00OOOOo;
import p660o0ooo0o0.o0o0Oo;
import p663o0oooO0.o00O0OO0;
import p674o0oooo0.o0O000Oo;
import p674o0oooo0.o0O00O;
import p674o0oooo0.oo00oO;

/* JADX INFO: loaded from: classes3.dex */
public final class oO00o000 implements o00OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f51869OooO00o;

    public oO00o000(boolean z) {
        this.f51869OooO00o = z;
    }

    @Override // p660o0ooo0o0.o00OO00O
    @NotNull
    public final o00OOOO0 intercept(@NotNull o00OO00O.OooO00o chain) throws IOException {
        o00OOOO0.OooO00o oooO00oOooO0Oo;
        o00OOOO0 o00oooo0OooO00o;
        boolean z;
        Intrinsics.checkNotNullParameter(chain, "chain");
        oOo00o0o ooo00o0o = (oOo00o0o) chain;
        o00O0OO0 o00o0oo1 = ooo00o0o.f51884OooO0o0;
        Intrinsics.checkNotNull(o00o0oo1);
        o00OOO00 request = ooo00o0o.f51883OooO0o;
        o0o0Oo o0o0oo = request.f51429OooO0o0;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Objects.requireNonNull(o00o0oo1);
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            o00o0oo1.f51752OooO0Oo.requestHeadersStart(o00o0oo1.f51751OooO0OO);
            o00o0oo1.f51753OooO0o.OooO0oO(request);
            o00o0oo1.f51752OooO0Oo.requestHeadersEnd(o00o0oo1.f51751OooO0OO, request);
            boolean z2 = true;
            if (!oO00o0.OooO00o(request.f51426OooO0OO) || o0o0oo == null) {
                o00o0oo1.f51751OooO0OO.OooO(o00o0oo1, true, false, null);
                oooO00oOooO0Oo = null;
            } else {
                if (StringsKt.OooO("100-continue", request.OooO0O0("Expect"))) {
                    try {
                        o00o0oo1.f51753OooO0o.OooO0Oo();
                        oooO00oOooO0Oo = o00o0oo1.OooO0Oo(true);
                        o00o0oo1.OooO0o0();
                        z = false;
                    } catch (IOException e) {
                        o00o0oo1.f51752OooO0Oo.requestFailed(o00o0oo1.f51751OooO0OO, e);
                        o00o0oo1.OooO0o(e);
                        throw e;
                    }
                } else {
                    z = true;
                    oooO00oOooO0Oo = null;
                }
                if (oooO00oOooO0Oo != null) {
                    o00o0oo1.f51751OooO0OO.OooO(o00o0oo1, true, false, null);
                    if (!o00o0oo1.f51750OooO0O0.OooOO0O()) {
                        o00o0oo1.f51753OooO0o.OooO0O0().OooOOO0();
                    }
                } else if (o0o0oo.isDuplex()) {
                    try {
                        o00o0oo1.f51753OooO0o.OooO0Oo();
                        o0o0oo.writeTo(o0O000Oo.OooO0O0(o00o0oo1.OooO0O0(request, true)));
                    } catch (IOException e2) {
                        o00o0oo1.f51752OooO0Oo.requestFailed(o00o0oo1.f51751OooO0OO, e2);
                        o00o0oo1.OooO0o(e2);
                        throw e2;
                    }
                } else {
                    oo00oO oo00ooOooO0O0 = o0O000Oo.OooO0O0(o00o0oo1.OooO0O0(request, false));
                    o0o0oo.writeTo(oo00ooOooO0O0);
                    ((o0O00O) oo00ooOooO0O0).close();
                }
                z2 = z;
            }
            if (o0o0oo == null || !o0o0oo.isDuplex()) {
                try {
                    o00o0oo1.f51753OooO0o.OooO00o();
                } catch (IOException e3) {
                    o00o0oo1.f51752OooO0Oo.requestFailed(o00o0oo1.f51751OooO0OO, e3);
                    o00o0oo1.OooO0o(e3);
                    throw e3;
                }
            }
            if (oooO00oOooO0Oo == null) {
                oooO00oOooO0Oo = o00o0oo1.OooO0Oo(false);
                Intrinsics.checkNotNull(oooO00oOooO0Oo);
                if (z2) {
                    o00o0oo1.OooO0o0();
                    z2 = false;
                }
            }
            Objects.requireNonNull(oooO00oOooO0Oo);
            Intrinsics.checkNotNullParameter(request, "request");
            oooO00oOooO0Oo.f51452OooO00o = request;
            oooO00oOooO0Oo.f51457OooO0o0 = o00o0oo1.f51750OooO0O0.f51782OooO0Oo;
            oooO00oOooO0Oo.f51461OooOO0O = jCurrentTimeMillis;
            oooO00oOooO0Oo.f51462OooOO0o = System.currentTimeMillis();
            o00OOOO0 response = oooO00oOooO0Oo.OooO00o();
            int i = response.f51443OoooO00;
            if (i == 100) {
                o00OOOO0.OooO00o oooO00oOooO0Oo2 = o00o0oo1.OooO0Oo(false);
                Intrinsics.checkNotNull(oooO00oOooO0Oo2);
                if (z2) {
                    o00o0oo1.OooO0o0();
                }
                Objects.requireNonNull(oooO00oOooO0Oo2);
                Intrinsics.checkNotNullParameter(request, "request");
                oooO00oOooO0Oo2.f51452OooO00o = request;
                oooO00oOooO0Oo2.f51457OooO0o0 = o00o0oo1.f51750OooO0O0.f51782OooO0Oo;
                oooO00oOooO0Oo2.f51461OooOO0O = jCurrentTimeMillis;
                oooO00oOooO0Oo2.f51462OooOO0o = System.currentTimeMillis();
                response = oooO00oOooO0Oo2.OooO00o();
                i = response.f51443OoooO00;
            }
            Intrinsics.checkNotNullParameter(response, "response");
            o00o0oo1.f51752OooO0Oo.responseHeadersEnd(o00o0oo1.f51751OooO0OO, response);
            if (this.f51869OooO00o && i == 101) {
                o00OOOO0.OooO00o oooO00o = new o00OOOO0.OooO00o(response);
                oooO00o.f51458OooO0oO = p659o0ooo0o.o00OOO00.f51185OooO0OO;
                o00oooo0OooO00o = oooO00o.OooO00o();
            } else {
                o00OOOO0.OooO00o oooO00o2 = new o00OOOO0.OooO00o(response);
                Intrinsics.checkNotNullParameter(response, "response");
                try {
                    String strOooO0O0 = response.OooO0O0("Content-Type", null);
                    long jOooO0o = o00o0oo1.f51753OooO0o.OooO0o(response);
                    oooO00o2.f51458OooO0oO = new oOo00ooO(strOooO0O0, jOooO0o, o0O000Oo.OooO0OO(new o00O0OO0.OooO0O0(o00o0oo1, o00o0oo1.f51753OooO0o.OooO0oo(response), jOooO0o)));
                    o00oooo0OooO00o = oooO00o2.OooO00o();
                } catch (IOException e4) {
                    o00o0oo1.f51752OooO0Oo.responseFailed(o00o0oo1.f51751OooO0OO, e4);
                    o00o0oo1.OooO0o(e4);
                    throw e4;
                }
            }
            if (StringsKt.OooO("close", o00oooo0OooO00o.f51439Oooo0oO.OooO0O0("Connection")) || StringsKt.OooO("close", o00oooo0OooO00o.OooO0O0("Connection", null))) {
                o00o0oo1.f51753OooO0o.OooO0O0().OooOOO0();
            }
            if (i == 204 || i == 205) {
                o00OOOOo o00ooooo2 = o00oooo0OooO00o.f51441OoooO;
                if ((o00ooooo2 != null ? o00ooooo2.OooO0Oo() : -1L) > 0) {
                    StringBuilder sbOooO00o = o00000O0.OooO00o("HTTP ", i, " had non-zero Content-Length: ");
                    o00OOOOo o00ooooo3 = o00oooo0OooO00o.f51441OoooO;
                    sbOooO00o.append(o00ooooo3 != null ? Long.valueOf(o00ooooo3.OooO0Oo()) : null);
                    throw new ProtocolException(sbOooO00o.toString());
                }
            }
            return o00oooo0OooO00o;
        } catch (IOException e5) {
            o00o0oo1.f51752OooO0Oo.requestFailed(o00o0oo1.f51751OooO0OO, e5);
            o00o0oo1.OooO0o(e5);
            throw e5;
        }
    }
}
