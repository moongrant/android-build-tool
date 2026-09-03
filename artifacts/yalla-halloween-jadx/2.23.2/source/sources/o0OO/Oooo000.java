package o0OO;

import java.io.IOException;
import java.net.ProtocolException;
import p340o0OO0ooO.o000OOo;
import p662o0oooO0O.oO00000o;
import p662o0oooO0O.oo0OOoo;
import p662o0oooO0O.ooo0Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class Oooo000 implements ooo0Oo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f42228OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final oo0OOoo f42229OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f42230OooO0o0;

    public Oooo000(int i) {
        this.f42229OooO0o = new oo0OOoo();
        this.f42230OooO0o0 = i;
    }

    @Override // p662o0oooO0O.ooo0Oo0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f42228OooO0Oo) {
            return;
        }
        this.f42228OooO0Oo = true;
        oo0OOoo oo0oooo = this.f42229OooO0o;
        long j = oo0oooo.f59828OooO0o0;
        int i = this.f42230OooO0o0;
        if (j >= i) {
            return;
        }
        throw new ProtocolException("content-length promised " + i + " bytes, but received " + oo0oooo.f59828OooO0o0);
    }

    @Override // p662o0oooO0O.ooo0Oo0, java.io.Flushable
    public final void flush() throws IOException {
    }

    @Override // p662o0oooO0O.ooo0Oo0
    public final oO00000o timeout() {
        return oO00000o.f59811OooO0Oo;
    }

    @Override // p662o0oooO0O.ooo0Oo0
    public final void write(oo0OOoo oo0oooo, long j) throws IOException {
        if (this.f42228OooO0Oo) {
            throw new IllegalStateException("closed");
        }
        long j2 = oo0oooo.f59828OooO0o0;
        byte[] bArr = o000OOo.f42529OooO00o;
        if ((j | 0) < 0 || 0 > j2 || j2 - 0 < j) {
            throw new ArrayIndexOutOfBoundsException();
        }
        oo0OOoo oo0oooo2 = this.f42229OooO0o;
        int i = this.f42230OooO0o0;
        if (i != -1 && oo0oooo2.f59828OooO0o0 > ((long) i) - j) {
            throw new ProtocolException(OooO0OO.OooO00o.OooO00o("exceeded content-length limit of ", i, " bytes"));
        }
        oo0oooo2.write(oo0oooo, j);
    }

    public Oooo000() {
        this(-1);
    }
}
