package p662o0oooO0O;

import java.io.IOException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public abstract class oo0oO0 implements ooo0Oo0 {

    @NotNull
    private final ooo0Oo0 delegate;

    public oo0oO0(@NotNull ooo0Oo0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "delegate", imports = {}))
    @JvmName(name = "-deprecated_delegate")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name */
    public final ooo0Oo0 m5792deprecated_delegate() {
        return this.delegate;
    }

    @Override // p662o0oooO0O.ooo0Oo0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @JvmName(name = "delegate")
    @NotNull
    public final ooo0Oo0 delegate() {
        return this.delegate;
    }

    @Override // p662o0oooO0O.ooo0Oo0, java.io.Flushable
    public void flush() throws IOException {
        this.delegate.flush();
    }

    @Override // p662o0oooO0O.ooo0Oo0
    @NotNull
    public oO00000o timeout() {
        return this.delegate.timeout();
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // p662o0oooO0O.ooo0Oo0
    public void write(@NotNull oo0OOoo source, long j) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        this.delegate.write(source, j);
    }
}
