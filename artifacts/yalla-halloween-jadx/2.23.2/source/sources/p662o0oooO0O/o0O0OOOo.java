package p662o0oooO0O;

import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o0O0OOOo implements ooo0Oo0 {
    @Override // p662o0oooO0O.ooo0Oo0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // p662o0oooO0O.ooo0Oo0, java.io.Flushable
    public final void flush() {
    }

    @Override // p662o0oooO0O.ooo0Oo0
    @NotNull
    public final oO00000o timeout() {
        return oO00000o.f59811OooO0Oo;
    }

    @Override // p662o0oooO0O.ooo0Oo0
    public final void write(@NotNull oo0OOoo source, long j) throws EOFException {
        Intrinsics.checkNotNullParameter(source, "source");
        source.skip(j);
    }
}
