package p430o0OoOO00;

import java.io.IOException;
import p424o0OoO0Oo.o00OOO00;
import p641o0ooOO0o.o0O000Oo;
import p641o0ooOO0o.o0oO0Ooo;
import p662o0oooO0O.o0O0o00O;
import p662o0oooO0O.o0OO;
import p662o0oooO0O.o0OOo000;
import p662o0oooO0O.oo0OOoo;
import p662o0oooO0O.oo0oO0;
import p662o0oooO0O.ooo0Oo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Ooo extends o0oO0Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0oO0Ooo f46828OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0O0 f46829OooO0O0;

    public final class OooO00o extends oo0oO0 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f46830OooO0Oo;

        public OooO00o(ooo0Oo0 ooo0oo0) {
            super(ooo0oo0);
            this.f46830OooO0Oo = 0L;
        }

        @Override // p662o0oooO0O.oo0oO0, p662o0oooO0O.ooo0Oo0
        public final void write(oo0OOoo oo0oooo, long j) throws IOException {
            super.write(oo0oooo, j);
            long j2 = this.f46830OooO0Oo + j;
            this.f46830OooO0Oo = j2;
            o00Ooo o00ooo2 = o00Ooo.this;
            OooO0O0 oooO0O0 = o00ooo2.f46829OooO0O0;
            long jContentLength = o00ooo2.contentLength();
            o0OOO0o o0ooo0o2 = (o0OOO0o) oooO0O0;
            o0ooo0o2.getClass();
            o00OOO00.OooO0O0().f46737OooO0O0.OooO00o().execute(new o0ooOOo(o0ooo0o2, j2, jContentLength));
        }
    }

    public interface OooO0O0 {
    }

    public o00Ooo(o0oO0Ooo o0oo0ooo2, o0OOO0o o0ooo0o2) {
        this.f46828OooO00o = o0oo0ooo2;
        this.f46829OooO0O0 = o0ooo0o2;
    }

    @Override // p641o0ooOO0o.o0oO0Ooo
    public final long contentLength() {
        try {
            return this.f46828OooO00o.contentLength();
        } catch (IOException e) {
            e.printStackTrace();
            return -1L;
        }
    }

    @Override // p641o0ooOO0o.o0oO0Ooo
    public final o0O000Oo contentType() {
        return this.f46828OooO00o.contentType();
    }

    @Override // p641o0ooOO0o.o0oO0Ooo
    public final void writeTo(o0O0o00O o0o0o00o) throws IOException {
        o0OOo000 o0ooo000OooO00o = o0OO.OooO00o(new OooO00o(o0o0o00o));
        this.f46828OooO00o.writeTo(o0ooo000OooO00o);
        o0ooo000OooO00o.flush();
    }
}
