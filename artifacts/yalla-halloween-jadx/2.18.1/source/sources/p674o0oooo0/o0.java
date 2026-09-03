package p674o0oooo0;

import java.io.IOException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o0 implements o0O00o00 {

    @NotNull
    private final o0O00o00 delegate;

    public o0(@NotNull o0O00o00 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "delegate", imports = {}))
    @JvmName(name = "-deprecated_delegate")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name */
    public final o0O00o00 m2075deprecated_delegate() {
        return this.delegate;
    }

    @Override // p674o0oooo0.o0O00o00, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @JvmName(name = "delegate")
    @NotNull
    public final o0O00o00 delegate() {
        return this.delegate;
    }

    @Override // p674o0oooo0.o0O00o00, java.io.Flushable
    public void flush() throws IOException {
        this.delegate.flush();
    }

    @Override // p674o0oooo0.o0O00o00
    @NotNull
    public o0oO0O0o timeout() {
        return this.delegate.timeout();
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // p674o0oooo0.o0O00o00
    public void write(@NotNull o0oOO source, long j) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        this.delegate.write(source, j);
    }
}
