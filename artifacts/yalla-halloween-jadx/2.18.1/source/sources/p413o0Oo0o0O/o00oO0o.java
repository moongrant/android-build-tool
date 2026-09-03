package p413o0Oo0o0O;

import java.io.IOException;
import p674o0oooo0.o0;
import p674o0oooo0.o0O00o00;
import p674o0oooo0.o0oOO;

/* JADX INFO: loaded from: classes2.dex */
public class o00oO0o extends o0 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f39355Oooo0o;

    public o00oO0o(o0O00o00 o0o00o01) {
        super(o0o00o01);
    }

    public void OooO00o() {
        throw null;
    }

    @Override // p674o0oooo0.o0, p674o0oooo0.o0O00o00, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f39355Oooo0o) {
            return;
        }
        try {
            super.close();
        } catch (IOException unused) {
            this.f39355Oooo0o = true;
            OooO00o();
        }
    }

    @Override // p674o0oooo0.o0, p674o0oooo0.o0O00o00, java.io.Flushable
    public final void flush() throws IOException {
        if (this.f39355Oooo0o) {
            return;
        }
        try {
            super.flush();
        } catch (IOException unused) {
            this.f39355Oooo0o = true;
            OooO00o();
        }
    }

    @Override // p674o0oooo0.o0, p674o0oooo0.o0O00o00
    public final void write(o0oOO o0ooo2, long j) throws IOException {
        if (this.f39355Oooo0o) {
            o0ooo2.skip(j);
            return;
        }
        try {
            super.write(o0ooo2, j);
        } catch (IOException unused) {
            this.f39355Oooo0o = true;
            OooO00o();
        }
    }
}
