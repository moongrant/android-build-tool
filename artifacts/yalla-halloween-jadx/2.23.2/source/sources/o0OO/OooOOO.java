package o0OO;

import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.o00Oo0;
import com.squareup.okhttp.o00Ooo;
import java.io.IOException;
import java.net.Proxy;
import o0OO.OooO.OooO0O0;
import o0OO.OooO.OooO0OO;
import o0OO.OooO.OooO0o;
import o0OO.OooO.OooOO0;
import p340o0OO0ooO.oo000o;
import p662o0oooO0O.o0OO;
import p662o0oooO0O.oO00000;
import p662o0oooO0O.oo0OOoo;
import p662o0oooO0O.ooo0Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO implements o0OoOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOO0O f42206OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO f42207OooO0O0;

    public OooOOO(OooO oooO, OooOO0O oooOO0O) {
        this.f42206OooO00o = oooOO0O;
        this.f42207OooO0O0 = oooO;
    }

    @Override // o0OO.o0OoOo0
    public final void OooO00o() throws IOException {
        this.f42207OooO0O0.f42154OooO0o0.flush();
    }

    @Override // o0OO.o0OoOo0
    public final ooo0Oo0 OooO0O0(o00Oo0 o00oo1, long j) throws IOException {
        boolean zEqualsIgnoreCase = "chunked".equalsIgnoreCase(o00oo1.OooO00o("Transfer-Encoding"));
        OooO oooO = this.f42207OooO0O0;
        if (zEqualsIgnoreCase) {
            if (oooO.f42153OooO0o == 1) {
                oooO.f42153OooO0o = 2;
                return oooO.new OooO0O0();
            }
            throw new IllegalStateException("state: " + oooO.f42153OooO0o);
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (oooO.f42153OooO0o == 1) {
            oooO.f42153OooO0o = 2;
            return oooO.new OooO0o(j);
        }
        throw new IllegalStateException("state: " + oooO.f42153OooO0o);
    }

    @Override // o0OO.o0OoOo0
    public final void OooO0OO(o00Oo0 o00oo1) throws IOException {
        OooOO0O oooOO0O = this.f42206OooO00o;
        if (oooOO0O.f42195OooO0oo != -1) {
            throw new IllegalStateException();
        }
        oooOO0O.f42195OooO0oo = System.currentTimeMillis();
        Proxy.Type type = oooOO0O.f42189OooO0O0.f21083OooO0O0.f21196OooO0O0.type();
        Protocol protocol = oooOO0O.f42189OooO0O0.f21088OooO0oO;
        StringBuilder sb = new StringBuilder();
        sb.append(o00oo1.f21165OooO0O0);
        sb.append(' ');
        com.squareup.okhttp.o000oOoO o000oooo2 = o00oo1.f21164OooO00o;
        if (!o000oooo2.f21121OooO00o.equals("https") && type == Proxy.Type.HTTP) {
            sb.append(o000oooo2);
        } else {
            sb.append(OooOo.OooO00o(o000oooo2));
        }
        sb.append(' ');
        sb.append(protocol == Protocol.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        this.f42207OooO0O0.OooO0o0(o00oo1.f21166OooO0OO, sb.toString());
    }

    @Override // o0OO.o0OoOo0
    public final o00Ooo.OooO00o OooO0Oo() throws IOException {
        return this.f42207OooO0O0.OooO0OO();
    }

    @Override // o0OO.o0OoOo0
    public final void OooO0o() throws IOException {
        boolean zOooO0oO = OooO0oO();
        OooO oooO = this.f42207OooO0O0;
        if (zOooO0oO) {
            oooO.f42155OooO0oO = 1;
            if (oooO.f42153OooO0o == 0) {
                oooO.f42155OooO0oO = 0;
                oo000o.f42599OooO0O0.OooO0O0(oooO.f42149OooO00o, oooO.f42150OooO0O0);
                return;
            }
            return;
        }
        oooO.f42155OooO0oO = 2;
        if (oooO.f42153OooO0o == 0) {
            oooO.f42153OooO0o = 6;
            oooO.f42150OooO0O0.f21084OooO0OO.close();
        }
    }

    @Override // o0OO.o0OoOo0
    public final OooOo00 OooO0o0(o00Ooo o00ooo2) throws IOException {
        oO00000 oooOO1;
        boolean zOooO0Oo = OooOO0O.OooO0Oo(o00ooo2);
        com.squareup.okhttp.Oooo0 oooo0 = o00ooo2.f21179OooO0o;
        OooO oooO = this.f42207OooO0O0;
        if (!zOooO0Oo) {
            oooOO1 = oooO.OooO0O0(0L);
        } else if (!"chunked".equalsIgnoreCase(o00ooo2.OooO0OO("Transfer-Encoding"))) {
            OooOOOO.OooO00o oooO00o = OooOOOO.f42212OooO00o;
            long jOooO00o = OooOOOO.OooO00o(oooo0);
            if (jOooO00o != -1) {
                oooOO1 = oooO.OooO0O0(jOooO00o);
            } else {
                if (oooO.f42153OooO0o != 4) {
                    throw new IllegalStateException("state: " + oooO.f42153OooO0o);
                }
                oooO.f42153OooO0o = 5;
                oooOO1 = oooO.new OooOO0();
            }
        } else {
            if (oooO.f42153OooO0o != 4) {
                throw new IllegalStateException("state: " + oooO.f42153OooO0o);
            }
            oooO.f42153OooO0o = 5;
            oooOO1 = oooO.new OooO0OO(this.f42206OooO00o);
        }
        return new OooOo00(oooo0, o0OO.OooO0O0(oooOO1));
    }

    @Override // o0OO.o0OoOo0
    public final boolean OooO0oO() {
        OooOO0O oooOO0O = this.f42206OooO00o;
        if ("close".equalsIgnoreCase(oooOO0O.f42197OooOO0O.OooO00o("Connection"))) {
            return false;
        }
        o00Ooo o00ooo2 = oooOO0O.f42199OooOOO;
        if (o00ooo2 == null) {
            throw new IllegalStateException();
        }
        if ("close".equalsIgnoreCase(o00ooo2.OooO0OO("Connection"))) {
            return false;
        }
        return !(this.f42207OooO0O0.f42153OooO0o == 6);
    }

    @Override // o0OO.o0OoOo0
    public final void OooO0oo(Oooo000 oooo000) throws IOException {
        OooO oooO = this.f42207OooO0O0;
        if (oooO.f42153OooO0o != 1) {
            throw new IllegalStateException("state: " + oooO.f42153OooO0o);
        }
        oooO.f42153OooO0o = 3;
        oooo000.getClass();
        oo0OOoo oo0oooo = new oo0OOoo();
        oo0OOoo oo0oooo2 = oooo000.f42229OooO0o;
        oo0oooo2.OooOo0(0L, oo0oooo2.f59828OooO0o0, oo0oooo);
        oooO.f42154OooO0o0.write(oo0oooo, oo0oooo.f59828OooO0o0);
    }
}
