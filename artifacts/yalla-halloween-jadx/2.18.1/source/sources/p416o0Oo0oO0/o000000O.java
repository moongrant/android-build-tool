package p416o0Oo0oO0;

import OooO00o.OooO00o;
import java.io.IOException;
import java.net.ProtocolException;
import o0O0O00.o0ooOOo;
import p413o0Oo0o0O.o000000;
import p674o0oooo0.o0O00o00;
import p674o0oooo0.o0oO0O0o;
import p674o0oooo0.o0oOO;

/* JADX INFO: loaded from: classes2.dex */
public final class o000000O implements o0O00o00 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f39572Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final int f39573Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final o0oOO f39574Oooo0oo;

    public o000000O() {
        this.f39574Oooo0oo = new o0oOO();
        this.f39573Oooo0oO = -1;
    }

    public final void OooO00o(o0O00o00 o0o00o01) throws IOException {
        o0oOO o0ooo2 = new o0oOO();
        o0oOO o0ooo3 = this.f39574Oooo0oo;
        o0ooo3.OooOOo(o0ooo2, 0L, o0ooo3.f52099Oooo0oO);
        o0o00o01.write(o0ooo2, o0ooo2.f52099Oooo0oO);
    }

    @Override // p674o0oooo0.o0O00o00, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f39572Oooo0o) {
            return;
        }
        this.f39572Oooo0o = true;
        if (this.f39574Oooo0oo.f52099Oooo0oO >= this.f39573Oooo0oO) {
            return;
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("content-length promised ");
        sbOooO0o0.append(this.f39573Oooo0oO);
        sbOooO0o0.append(" bytes, but received ");
        sbOooO0o0.append(this.f39574Oooo0oo.f52099Oooo0oO);
        throw new ProtocolException(sbOooO0o0.toString());
    }

    @Override // p674o0oooo0.o0O00o00, java.io.Flushable
    public final void flush() throws IOException {
    }

    @Override // p674o0oooo0.o0O00o00
    public final o0oO0O0o timeout() {
        return o0oO0O0o.f52090OooO0Oo;
    }

    @Override // p674o0oooo0.o0O00o00
    public final void write(o0oOO o0ooo2, long j) throws IOException {
        if (this.f39572Oooo0o) {
            throw new IllegalStateException("closed");
        }
        o000000.OooO00o(o0ooo2.f52099Oooo0oO, j);
        int i = this.f39573Oooo0oO;
        if (i != -1 && this.f39574Oooo0oo.f52099Oooo0oO > ((long) i) - j) {
            throw new ProtocolException(o0ooOOo.OooO00o(OooO00o.OooO0o0("exceeded content-length limit of "), this.f39573Oooo0oO, " bytes"));
        }
        this.f39574Oooo0oo.write(o0ooo2, j);
    }

    public o000000O(int i) {
        this.f39574Oooo0oo = new o0oOO();
        this.f39573Oooo0oO = i;
    }
}
