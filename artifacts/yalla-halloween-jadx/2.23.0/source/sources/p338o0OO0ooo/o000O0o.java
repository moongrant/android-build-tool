package p338o0OO0ooo;

import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.o000oOoO;
import com.squareup.okhttp.o00Ooo;
import com.squareup.okhttp.o0OoOo0;
import com.squareup.okhttp.oo000o;
import java.io.IOException;
import java.net.Proxy;
import o0OO0ooo.o000OO.OooO0O0;
import o0OO0ooo.o000OO.OooO0OO;
import o0OO0ooo.o000OO.OooO0o;
import o0OO0ooo.o000OO.OooOO0;
import p336o0OO0oo0.OooOO0O;
import p659o0oooO00.o00000O;
import p659o0oooO00.o000O0Oo;
import p659o0oooO00.o00O00;
import p659o0oooO00.o00O000;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0o implements o000O0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0000OO0 f43525OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000OO f43526OooO0O0;

    public o000O0o(o000OO o000oo2, o0000OO0 o0000oo1) {
        this.f43525OooO00o = o0000oo1;
        this.f43526OooO0O0 = o000oo2;
    }

    @Override // p338o0OO0ooo.o000O0O0
    public final void OooO00o() throws IOException {
        this.f43526OooO0O0.f43532OooO0o0.flush();
    }

    @Override // p338o0OO0ooo.o000O0O0
    public final o00O000 OooO0O0(o00Ooo o00ooo2, long j) throws IOException {
        boolean zEqualsIgnoreCase = "chunked".equalsIgnoreCase(o00ooo2.OooO00o("Transfer-Encoding"));
        o000OO o000oo2 = this.f43526OooO0O0;
        if (zEqualsIgnoreCase) {
            if (o000oo2.f43531OooO0o == 1) {
                o000oo2.f43531OooO0o = 2;
                return o000oo2.new OooO0O0();
            }
            throw new IllegalStateException("state: " + o000oo2.f43531OooO0o);
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (o000oo2.f43531OooO0o == 1) {
            o000oo2.f43531OooO0o = 2;
            return o000oo2.new OooO0o(j);
        }
        throw new IllegalStateException("state: " + o000oo2.f43531OooO0o);
    }

    @Override // p338o0OO0ooo.o000O0O0
    public final void OooO0OO(o00Ooo o00ooo2) throws IOException {
        o0000OO0 o0000oo1 = this.f43525OooO00o;
        if (o0000oo1.f43497OooO0oo != -1) {
            throw new IllegalStateException();
        }
        o0000oo1.f43497OooO0oo = System.currentTimeMillis();
        Proxy.Type type = o0000oo1.f43491OooO0O0.f21556OooO0O0.f21648OooO0O0.type();
        Protocol protocol = o0000oo1.f43491OooO0O0.f21561OooO0oO;
        StringBuilder sb = new StringBuilder();
        sb.append(o00ooo2.f21621OooO0O0);
        sb.append(' ');
        o0OoOo0 o0oooo0 = o00ooo2.f21620OooO00o;
        if (!o0oooo0.f21631OooO00o.equals("https") && type == Proxy.Type.HTTP) {
            sb.append(o0oooo0);
        } else {
            sb.append(o000O00O.OooO00o(o0oooo0));
        }
        sb.append(' ');
        sb.append(protocol == Protocol.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        this.f43526OooO0O0.OooO0o0(o00ooo2.f21622OooO0OO, sb.toString());
    }

    @Override // p338o0OO0ooo.o000O0O0
    public final oo000o.OooO00o OooO0Oo() throws IOException {
        return this.f43526OooO0O0.OooO0OO();
    }

    @Override // p338o0OO0ooo.o000O0O0
    public final void OooO0o() throws IOException {
        boolean zOooO0oO = OooO0oO();
        o000OO o000oo2 = this.f43526OooO0O0;
        if (zOooO0oO) {
            o000oo2.f43533OooO0oO = 1;
            if (o000oo2.f43531OooO0o == 0) {
                o000oo2.f43533OooO0oO = 0;
                OooOO0O.f43304OooO0O0.OooO0O0(o000oo2.f43527OooO00o, o000oo2.f43528OooO0O0);
                return;
            }
            return;
        }
        o000oo2.f43533OooO0oO = 2;
        if (o000oo2.f43531OooO0o == 0) {
            o000oo2.f43531OooO0o = 6;
            o000oo2.f43528OooO0O0.f21557OooO0OO.close();
        }
    }

    @Override // p338o0OO0ooo.o000O0O0
    public final o000O00 OooO0o0(oo000o oo000oVar) throws IOException {
        o00O00 oooOO1;
        boolean zOooO0Oo = o0000OO0.OooO0Oo(oo000oVar);
        o000oOoO o000oooo2 = oo000oVar.f21655OooO0o;
        o000OO o000oo2 = this.f43526OooO0O0;
        if (!zOooO0Oo) {
            oooOO1 = o000oo2.OooO0O0(0L);
        } else if (!"chunked".equalsIgnoreCase(oo000oVar.OooO0OO("Transfer-Encoding"))) {
            o000Oo0.OooO00o oooO00o = o000Oo0.f43555OooO00o;
            long jOooO00o = o000Oo0.OooO00o(o000oooo2);
            if (jOooO00o != -1) {
                oooOO1 = o000oo2.OooO0O0(jOooO00o);
            } else {
                if (o000oo2.f43531OooO0o != 4) {
                    throw new IllegalStateException("state: " + o000oo2.f43531OooO0o);
                }
                o000oo2.f43531OooO0o = 5;
                oooOO1 = o000oo2.new OooOO0();
            }
        } else {
            if (o000oo2.f43531OooO0o != 4) {
                throw new IllegalStateException("state: " + o000oo2.f43531OooO0o);
            }
            o000oo2.f43531OooO0o = 5;
            oooOO1 = o000oo2.new OooO0OO(this.f43525OooO00o);
        }
        return new o000O00(o000oooo2, o000O0Oo.OooO0O0(oooOO1));
    }

    @Override // p338o0OO0ooo.o000O0O0
    public final boolean OooO0oO() {
        o0000OO0 o0000oo1 = this.f43525OooO00o;
        if ("close".equalsIgnoreCase(o0000oo1.f43499OooOO0O.OooO00o("Connection"))) {
            return false;
        }
        oo000o oo000oVar = o0000oo1.f43501OooOOO;
        if (oo000oVar == null) {
            throw new IllegalStateException();
        }
        if ("close".equalsIgnoreCase(oo000oVar.OooO0OO("Connection"))) {
            return false;
        }
        return !(this.f43526OooO0O0.f43531OooO0o == 6);
    }

    @Override // p338o0OO0ooo.o000O0O0
    public final void OooO0oo(o000O0 o000o0) throws IOException {
        o000OO o000oo2 = this.f43526OooO0O0;
        if (o000oo2.f43531OooO0o != 1) {
            throw new IllegalStateException("state: " + o000oo2.f43531OooO0o);
        }
        o000oo2.f43531OooO0o = 3;
        o000o0.getClass();
        o00000O o00000o = new o00000O();
        o00000O o00000o2 = o000o0.f43511OooO0o;
        o00000o2.OooOo0(0L, o00000o2.f60177OooO0o0, o00000o);
        o000oo2.f43532OooO0o0.write(o00000o, o00000o.f60177OooO0o0);
    }
}
