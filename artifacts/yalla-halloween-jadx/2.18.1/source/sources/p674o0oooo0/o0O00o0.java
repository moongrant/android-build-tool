package p674o0oooo0;

import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O00o0 extends OutputStream {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0oOO f52074Oooo0o;

    public o0O00o0(o0oOO o0ooo2) {
        this.f52074Oooo0o = o0ooo2;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
    }

    @NotNull
    public final String toString() {
        return this.f52074Oooo0o + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f52074Oooo0o.Ooooo0o(i);
    }

    @Override // java.io.OutputStream
    public final void write(@NotNull byte[] data, int i, int i2) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f52074Oooo0o.OoooOoO(data, i, i2);
    }
}
