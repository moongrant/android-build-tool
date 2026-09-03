package p674o0oooo0;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o0O00000 implements o0O0O0O {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final o0O0O0O f52047Oooo0o;

    public o0O00000(@NotNull o0O0O0O delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f52047Oooo0o = delegate;
    }

    @Override // p674o0oooo0.o0O0O0O
    public long Oooo0O0(@NotNull o0oOO sink, long j) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return this.f52047Oooo0o.Oooo0O0(sink, j);
    }

    @Override // p674o0oooo0.o0O0O0O, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f52047Oooo0o.close();
    }

    @Override // p674o0oooo0.o0O0O0O
    @NotNull
    public o0oO0O0o timeout() {
        return this.f52047Oooo0o.timeout();
    }

    @NotNull
    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f52047Oooo0o + ')';
    }
}
