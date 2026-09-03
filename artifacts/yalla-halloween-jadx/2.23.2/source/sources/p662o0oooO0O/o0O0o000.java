package p662o0oooO0O;

import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o0O0o000 extends OutputStream {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo0OOoo f59761OooO0Oo;

    public o0O0o000(oo0OOoo oo0oooo) {
        this.f59761OooO0Oo = oo0oooo;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
    }

    @NotNull
    public final String toString() {
        return this.f59761OooO0Oo + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f59761OooO0Oo.o00o0O(i);
    }

    @Override // java.io.OutputStream
    public final void write(@NotNull byte[] data, int i, int i2) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f59761OooO0Oo.OoooooO(i, i2, data);
    }
}
