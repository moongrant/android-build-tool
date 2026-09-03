package p340o0OO0ooO;

import java.io.IOException;
import p662o0oooO0O.o0OOO0OO;
import p662o0oooO0O.oo0OOoo;
import p662o0oooO0O.oo0oO0;

/* JADX INFO: loaded from: classes3.dex */
public class o00Ooo extends oo0oO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f42571OooO0Oo;

    public o00Ooo(o0OOO0OO o0ooo0oo2) {
        super(o0ooo0oo2);
    }

    public void OooO00o() {
        throw null;
    }

    @Override // p662o0oooO0O.oo0oO0, p662o0oooO0O.ooo0Oo0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f42571OooO0Oo) {
            return;
        }
        try {
            super.close();
        } catch (IOException unused) {
            this.f42571OooO0Oo = true;
            OooO00o();
        }
    }

    @Override // p662o0oooO0O.oo0oO0, p662o0oooO0O.ooo0Oo0, java.io.Flushable
    public final void flush() throws IOException {
        if (this.f42571OooO0Oo) {
            return;
        }
        try {
            super.flush();
        } catch (IOException unused) {
            this.f42571OooO0Oo = true;
            OooO00o();
        }
    }

    @Override // p662o0oooO0O.oo0oO0, p662o0oooO0O.ooo0Oo0
    public final void write(oo0OOoo oo0oooo, long j) throws IOException {
        if (this.f42571OooO0Oo) {
            oo0oooo.skip(j);
            return;
        }
        try {
            super.write(oo0oooo, j);
        } catch (IOException unused) {
            this.f42571OooO0Oo = true;
            OooO00o();
        }
    }
}
