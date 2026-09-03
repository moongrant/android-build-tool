package p659o0oooO00;

import java.io.IOException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public abstract class o0000O implements o00O000 {

    @NotNull
    private final o00O000 delegate;

    public o0000O(@NotNull o00O000 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "delegate", imports = {}))
    @JvmName(name = "-deprecated_delegate")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name */
    public final o00O000 m5790deprecated_delegate() {
        return this.delegate;
    }

    @Override // p659o0oooO00.o00O000, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @JvmName(name = "delegate")
    @NotNull
    public final o00O000 delegate() {
        return this.delegate;
    }

    @Override // p659o0oooO00.o00O000, java.io.Flushable
    public void flush() throws IOException {
        this.delegate.flush();
    }

    @Override // p659o0oooO00.o00O000
    @NotNull
    public o00O00O timeout() {
        return this.delegate.timeout();
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // p659o0oooO00.o00O000
    public void write(@NotNull o00000O source, long j) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        this.delegate.write(source, j);
    }
}
