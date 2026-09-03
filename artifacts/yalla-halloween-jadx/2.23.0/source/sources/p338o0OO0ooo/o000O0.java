package p338o0OO0ooo;

import OooO0OO.OooO00o;
import java.io.IOException;
import java.net.ProtocolException;
import p336o0OO0oo0.o000oOoO;
import p659o0oooO00.o00000O;
import p659o0oooO00.o00O000;
import p659o0oooO00.o00O00O;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0 implements o00O000 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f43510OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o00000O f43511OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f43512OooO0o0;

    public o000O0(int i) {
        this.f43511OooO0o = new o00000O();
        this.f43512OooO0o0 = i;
    }

    @Override // p659o0oooO00.o00O000, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f43510OooO0Oo) {
            return;
        }
        this.f43510OooO0Oo = true;
        o00000O o00000o = this.f43511OooO0o;
        long j = o00000o.f60177OooO0o0;
        int i = this.f43512OooO0o0;
        if (j >= i) {
            return;
        }
        throw new ProtocolException("content-length promised " + i + " bytes, but received " + o00000o.f60177OooO0o0);
    }

    @Override // p659o0oooO00.o00O000, java.io.Flushable
    public final void flush() throws IOException {
    }

    @Override // p659o0oooO00.o00O000
    public final o00O00O timeout() {
        return o00O00O.f60237OooO0Oo;
    }

    @Override // p659o0oooO00.o00O000
    public final void write(o00000O o00000o, long j) throws IOException {
        if (this.f43510OooO0Oo) {
            throw new IllegalStateException("closed");
        }
        long j2 = o00000o.f60177OooO0o0;
        byte[] bArr = o000oOoO.f43328OooO00o;
        if ((j | 0) < 0 || 0 > j2 || j2 - 0 < j) {
            throw new ArrayIndexOutOfBoundsException();
        }
        o00000O o00000o2 = this.f43511OooO0o;
        int i = this.f43512OooO0o0;
        if (i != -1 && o00000o2.f60177OooO0o0 > ((long) i) - j) {
            throw new ProtocolException(OooO00o.OooO00o("exceeded content-length limit of ", i, " bytes"));
        }
        o00000o2.write(o00000o, j);
    }

    public o000O0() {
        this(-1);
    }
}
