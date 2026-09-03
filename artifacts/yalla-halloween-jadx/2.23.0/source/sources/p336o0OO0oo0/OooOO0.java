package p336o0OO0oo0;

import java.io.IOException;
import p659o0oooO00.o00000O;
import p659o0oooO00.o0000O;
import p659o0oooO00.o000O;

/* JADX INFO: loaded from: classes4.dex */
public class OooOO0 extends o0000O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f43302OooO0Oo;

    public OooOO0(o000O o000o) {
        super(o000o);
    }

    public void OooO00o() {
        throw null;
    }

    @Override // p659o0oooO00.o0000O, p659o0oooO00.o00O000, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f43302OooO0Oo) {
            return;
        }
        try {
            super.close();
        } catch (IOException unused) {
            this.f43302OooO0Oo = true;
            OooO00o();
        }
    }

    @Override // p659o0oooO00.o0000O, p659o0oooO00.o00O000, java.io.Flushable
    public final void flush() throws IOException {
        if (this.f43302OooO0Oo) {
            return;
        }
        try {
            super.flush();
        } catch (IOException unused) {
            this.f43302OooO0Oo = true;
            OooO00o();
        }
    }

    @Override // p659o0oooO00.o0000O, p659o0oooO00.o00O000
    public final void write(o00000O o00000o, long j) throws IOException {
        if (this.f43302OooO0Oo) {
            o00000o.skip(j);
            return;
        }
        try {
            super.write(o00000o, j);
        } catch (IOException unused) {
            this.f43302OooO0Oo = true;
            OooO00o();
        }
    }
}
