package p659o0oooO00;

import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o00000OO extends OutputStream {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00000O f60186OooO0Oo;

    public o00000OO(o00000O o00000o) {
        this.f60186OooO0Oo = o00000o;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
    }

    @NotNull
    public final String toString() {
        return this.f60186OooO0Oo + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f60186OooO0Oo.o00O0O(i);
    }

    @Override // java.io.OutputStream
    public final void write(@NotNull byte[] data, int i, int i2) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f60186OooO0Oo.Oooooo(i, i2, data);
    }
}
