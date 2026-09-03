package p659o0oooO00;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public abstract class o0000OO0 implements o00O00 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o00O00 f60199OooO0Oo;

    public o0000OO0(@NotNull o00O00 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f60199OooO0Oo = delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f60199OooO0Oo.close();
    }

    @Override // p659o0oooO00.o00O00
    public long o0000OO0(@NotNull o00000O sink, long j) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return this.f60199OooO0Oo.o0000OO0(sink, j);
    }

    @Override // p659o0oooO00.o00O00
    @NotNull
    public o00O00O timeout() {
        return this.f60199OooO0Oo.timeout();
    }

    @NotNull
    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f60199OooO0Oo + ')';
    }
}
