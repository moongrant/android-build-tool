package p659o0oooO00;

import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o00000O0 implements o00O000 {
    @Override // p659o0oooO00.o00O000, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // p659o0oooO00.o00O000, java.io.Flushable
    public final void flush() {
    }

    @Override // p659o0oooO00.o00O000
    @NotNull
    public final o00O00O timeout() {
        return o00O00O.f60237OooO0Oo;
    }

    @Override // p659o0oooO00.o00O000
    public final void write(@NotNull o00000O source, long j) throws EOFException {
        Intrinsics.checkNotNullParameter(source, "source");
        source.skip(j);
    }
}
