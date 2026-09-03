package p662o0oooO0O;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o0OOO0OO implements ooo0Oo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final OutputStream f59785OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final oO00000o f59786OooO0o0;

    public o0OOO0OO(@NotNull OutputStream out, @NotNull oO00000o timeout) {
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f59785OooO0Oo = out;
        this.f59786OooO0o0 = timeout;
    }

    @Override // p662o0oooO0O.ooo0Oo0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f59785OooO0Oo.close();
    }

    @Override // p662o0oooO0O.ooo0Oo0, java.io.Flushable
    public final void flush() throws IOException {
        this.f59785OooO0Oo.flush();
    }

    @Override // p662o0oooO0O.ooo0Oo0
    @NotNull
    public final oO00000o timeout() {
        return this.f59786OooO0o0;
    }

    @NotNull
    public final String toString() {
        return "sink(" + this.f59785OooO0Oo + ')';
    }

    @Override // p662o0oooO0O.ooo0Oo0
    public final void write(@NotNull oo0OOoo source, long j) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        oO000.OooO0O0(source.f59828OooO0o0, 0L, j);
        while (j > 0) {
            this.f59786OooO0o0.OooO0o();
            oO0Oo oo0oo = source.f59827OooO0Oo;
            Intrinsics.checkNotNull(oo0oo);
            int iMin = (int) Math.min(j, oo0oo.f59822OooO0OO - oo0oo.f59821OooO0O0);
            this.f59785OooO0Oo.write(oo0oo.f59820OooO00o, oo0oo.f59821OooO0O0, iMin);
            int i = oo0oo.f59821OooO0O0 + iMin;
            oo0oo.f59821OooO0O0 = i;
            long j2 = iMin;
            j -= j2;
            source.f59828OooO0o0 -= j2;
            if (i == oo0oo.f59822OooO0OO) {
                source.f59827OooO0Oo = oo0oo.OooO00o();
                o0oo0000.OooO00o(oo0oo);
            }
        }
    }
}
