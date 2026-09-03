package p425o0OoO0oo;

import java.io.IOException;
import p420o0OoO0OO.o000000;
import p634o0ooO0oO.o00OOO0;
import p634o0ooO0oO.oo00oO;
import p659o0oooO00.o00;
import p659o0oooO00.o00000O;
import p659o0oooO00.o0000O;
import p659o0oooO00.o0000Ooo;
import p659o0oooO00.o000O0Oo;
import p659o0oooO00.o00O000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000OO0 extends oo00oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oo00oO f45577OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0O0 f45578OooO0O0;

    public final class OooO00o extends o0000O {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f45579OooO0Oo;

        public OooO00o(o00O000 o00o001) {
            super(o00o001);
            this.f45579OooO0Oo = 0L;
        }

        @Override // p659o0oooO00.o0000O, p659o0oooO00.o00O000
        public final void write(o00000O o00000o, long j) throws IOException {
            super.write(o00000o, j);
            long j2 = this.f45579OooO0Oo + j;
            this.f45579OooO0Oo = j2;
            o0000OO0 o0000oo1 = o0000OO0.this;
            OooO0O0 oooO0O0 = o0000oo1.f45578OooO0O0;
            long jContentLength = o0000oo1.contentLength();
            o000Oo0 o000oo1 = (o000Oo0) oooO0O0;
            o000oo1.getClass();
            o000000.OooO0O0().f45543OooO0O0.OooO00o().execute(new o000O0o(o000oo1, j2, jContentLength));
        }
    }

    public interface OooO0O0 {
    }

    public o0000OO0(oo00oO oo00oo, o000Oo0 o000oo1) {
        this.f45577OooO00o = oo00oo;
        this.f45578OooO0O0 = o000oo1;
    }

    @Override // p634o0ooO0oO.oo00oO
    public final long contentLength() {
        try {
            return this.f45577OooO00o.contentLength();
        } catch (IOException e) {
            e.printStackTrace();
            return -1L;
        }
    }

    @Override // p634o0ooO0oO.oo00oO
    public final o00OOO0 contentType() {
        return this.f45577OooO00o.contentType();
    }

    @Override // p634o0ooO0oO.oo00oO
    public final void writeTo(o0000Ooo o0000ooo) throws IOException {
        o00 o00VarOooO00o = o000O0Oo.OooO00o(new OooO00o(o0000ooo));
        this.f45577OooO00o.writeTo(o00VarOooO00o);
        o00VarOooO00o.flush();
    }
}
