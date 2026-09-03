package p674o0oooo0;

import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Oo00 implements o0O00o00 {
    @Override // p674o0oooo0.o0O00o00, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // p674o0oooo0.o0O00o00, java.io.Flushable
    public final void flush() {
    }

    @Override // p674o0oooo0.o0O00o00
    @NotNull
    public final o0oO0O0o timeout() {
        return o0oO0O0o.f52090OooO0Oo;
    }

    @Override // p674o0oooo0.o0O00o00
    public final void write(@NotNull o0oOO source, long j) throws EOFException {
        Intrinsics.checkNotNullParameter(source, "source");
        source.skip(j);
    }
}
