package p662o0oooO0O;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public abstract class oo0ooO implements oO00000 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final oO00000 f59837OooO0Oo;

    public oo0ooO(@NotNull oO00000 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f59837OooO0Oo = delegate;
    }

    @Override // p662o0oooO0O.oO00000
    public long OooOO0O(@NotNull oo0OOoo sink, long j) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return this.f59837OooO0Oo.OooOO0O(sink, j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f59837OooO0Oo.close();
    }

    @Override // p662o0oooO0O.oO00000
    @NotNull
    public oO00000o timeout() {
        return this.f59837OooO0Oo.timeout();
    }

    @NotNull
    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f59837OooO0Oo + ')';
    }
}
