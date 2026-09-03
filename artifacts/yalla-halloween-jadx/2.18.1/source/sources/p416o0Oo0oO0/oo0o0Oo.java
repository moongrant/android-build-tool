package p416o0Oo0oO0;

import OooO00o.OooO00o;
import com.squareup.okhttp.Protocol;
import java.io.IOException;
import java.net.Proxy;
import java.util.Comparator;
import o0Oo0oO0.o0ooOOo.OooO0O0;
import o0Oo0oO0.o0ooOOo.OooO0OO;
import o0Oo0oO0.o0ooOOo.OooO0o;
import o0Oo0oO0.o0ooOOo.OooOO0;
import p412o0Oo0o00.o000O000;
import p412o0Oo0o00.o000O0o;
import p412o0Oo0o00.o000Oo0;
import p413o0Oo0o0O.o0ooOOo;
import p674o0oooo0.o0O000Oo;
import p674o0oooo0.o0O00o00;
import p674o0oooo0.o0O0O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0o0Oo implements o00000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0Oo0oo f39650OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0ooOOo f39651OooO0O0;

    public oo0o0Oo(o0Oo0oo o0oo0oo2, o0ooOOo o0ooooo2) {
        this.f39650OooO00o = o0oo0oo2;
        this.f39651OooO0O0 = o0ooooo2;
    }

    @Override // p416o0Oo0oO0.o00000O
    public final void OooO00o() throws IOException {
        this.f39651OooO0O0.f39625OooO0o0.flush();
    }

    @Override // p416o0Oo0oO0.o00000O
    public final void OooO0O0() throws IOException {
        if (OooO0oo()) {
            o0ooOOo o0ooooo2 = this.f39651OooO0O0;
            o0ooooo2.f39626OooO0oO = 1;
            if (o0ooooo2.f39624OooO0o == 0) {
                o0ooooo2.f39626OooO0oO = 0;
                o0ooOOo.f39374OooO0O0.OooO00o(o0ooooo2.f39620OooO00o, o0ooooo2.f39621OooO0O0);
                return;
            }
            return;
        }
        o0ooOOo o0ooooo3 = this.f39651OooO0O0;
        o0ooooo3.f39626OooO0oO = 2;
        if (o0ooooo3.f39624OooO0o == 0) {
            o0ooooo3.f39624OooO0o = 6;
            o0ooooo3.f39621OooO0O0.f39204OooO0OO.close();
        }
    }

    @Override // p416o0Oo0oO0.o00000O
    public final o0O00o00 OooO0OO(o000O000 o000o001, long j) throws IOException {
        if ("chunked".equalsIgnoreCase(o000o001.OooO0O0("Transfer-Encoding"))) {
            o0ooOOo o0ooooo2 = this.f39651OooO0O0;
            if (o0ooooo2.f39624OooO0o == 1) {
                o0ooooo2.f39624OooO0o = 2;
                return o0ooooo2.new OooO0O0();
            }
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("state: ");
            sbOooO0o0.append(o0ooooo2.f39624OooO0o);
            throw new IllegalStateException(sbOooO0o0.toString());
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        o0ooOOo o0ooooo3 = this.f39651OooO0O0;
        if (o0ooooo3.f39624OooO0o == 1) {
            o0ooooo3.f39624OooO0o = 2;
            return o0ooooo3.new OooO0o(j);
        }
        StringBuilder sbOooO0o1 = OooO00o.OooO0o0("state: ");
        sbOooO0o1.append(o0ooooo3.f39624OooO0o);
        throw new IllegalStateException(sbOooO0o1.toString());
    }

    @Override // p416o0Oo0oO0.o00000O
    public final void OooO0Oo(o000000O o000000o2) throws IOException {
        o0ooOOo o0ooooo2 = this.f39651OooO0O0;
        if (o0ooooo2.f39624OooO0o == 1) {
            o0ooooo2.f39624OooO0o = 3;
            o000000o2.OooO00o(o0ooooo2.f39625OooO0o0);
        } else {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("state: ");
            sbOooO0o0.append(o0ooooo2.f39624OooO0o);
            throw new IllegalStateException(sbOooO0o0.toString());
        }
    }

    @Override // p416o0Oo0oO0.o00000O
    public final o000Oo0 OooO0o(o000O0o o000o0o2) throws IOException {
        o0O0O0O oooOO1;
        o0O0O0O o0o0o0oOooO0O0;
        if (o0Oo0oo.OooO0Oo(o000o0o2)) {
            if ("chunked".equalsIgnoreCase(o000o0o2.OooO0OO("Transfer-Encoding"))) {
                o0ooOOo o0ooooo2 = this.f39651OooO0O0;
                o0Oo0oo o0oo0oo2 = this.f39650OooO00o;
                if (o0ooooo2.f39624OooO0o != 4) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO0o0("state: ");
                    sbOooO0o0.append(o0ooooo2.f39624OooO0o);
                    throw new IllegalStateException(sbOooO0o0.toString());
                }
                o0ooooo2.f39624OooO0o = 5;
                oooOO1 = o0ooooo2.new OooO0OO(o0oo0oo2);
            } else {
                Comparator<String> comparator = o0O0O00.f39585OooO00o;
                long jOooO00o = o0O0O00.OooO00o(o000o0o2.f39317OooO0o);
                if (jOooO00o != -1) {
                    o0o0o0oOooO0O0 = this.f39651OooO0O0.OooO0O0(jOooO00o);
                } else {
                    o0ooOOo o0ooooo3 = this.f39651OooO0O0;
                    if (o0ooooo3.f39624OooO0o != 4) {
                        StringBuilder sbOooO0o1 = OooO00o.OooO0o0("state: ");
                        sbOooO0o1.append(o0ooooo3.f39624OooO0o);
                        throw new IllegalStateException(sbOooO0o1.toString());
                    }
                    o0ooooo3.f39624OooO0o = 5;
                    oooOO1 = o0ooooo3.new OooOO0();
                }
            }
            o0o0o0oOooO0O0 = oooOO1;
        } else {
            o0o0o0oOooO0O0 = this.f39651OooO0O0.OooO0O0(0L);
        }
        return new o000OOo(o000o0o2.f39317OooO0o, o0O000Oo.OooO0OO(o0o0o0oOooO0O0));
    }

    @Override // p416o0Oo0oO0.o00000O
    public final void OooO0o0(o000O000 o000o001) throws IOException {
        this.f39650OooO00o.OooOOO();
        Proxy.Type type = this.f39650OooO00o.f39600OooO0O0.f39203OooO0O0.f39300OooO0O0.type();
        Protocol protocol = this.f39650OooO00o.f39600OooO0O0.f39208OooO0oO;
        StringBuilder sb = new StringBuilder();
        sb.append(o000o001.f39303OooO0O0);
        sb.append(' ');
        if (!o000o001.OooO0OO() && type == Proxy.Type.HTTP) {
            sb.append(o000o001.f39302OooO00o);
        } else {
            sb.append(o000000.OooO00o(o000o001.f39302OooO00o));
        }
        sb.append(' ');
        sb.append(protocol == Protocol.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        this.f39651OooO0O0.OooO0o(o000o001.f39304OooO0OO, sb.toString());
    }

    @Override // p416o0Oo0oO0.o00000O
    public final o000O0o.OooO00o OooO0oO() throws IOException {
        return this.f39651OooO0O0.OooO0Oo();
    }

    @Override // p416o0Oo0oO0.o00000O
    public final boolean OooO0oo() {
        if ("close".equalsIgnoreCase(this.f39650OooO00o.f39608OooOO0O.OooO0O0("Connection"))) {
            return false;
        }
        o000O0o o000o0o2 = this.f39650OooO00o.f39610OooOOO;
        if (o000o0o2 == null) {
            throw new IllegalStateException();
        }
        if ("close".equalsIgnoreCase(o000o0o2.OooO0OO("Connection"))) {
            return false;
        }
        return !(this.f39651OooO0O0.f39624OooO0o == 6);
    }
}
