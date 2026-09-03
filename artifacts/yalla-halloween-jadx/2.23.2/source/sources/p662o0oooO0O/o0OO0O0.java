package p662o0oooO0O;

import androidx.compose.ui.input.key.OooO00o;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o0OO0O0 implements oO00000 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final InputStream f59779OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final oO00000o f59780OooO0o0;

    public o0OO0O0(@NotNull InputStream input, @NotNull oO00000o timeout) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f59779OooO0Oo = input;
        this.f59780OooO0o0 = timeout;
    }

    @Override // p662o0oooO0O.oO00000
    public final long OooOO0O(@NotNull oo0OOoo sink, long j) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j == 0) {
            return 0L;
        }
        if (!(j >= 0)) {
            throw new IllegalArgumentException(OooO00o.OooO00o("byteCount < 0: ", j).toString());
        }
        try {
            this.f59780OooO0o0.OooO0o();
            oO0Oo oo0ooOooooo = sink.Oooooo(1);
            int i = this.f59779OooO0Oo.read(oo0ooOooooo.f59820OooO00o, oo0ooOooooo.f59822OooO0OO, (int) Math.min(j, 8192 - oo0ooOooooo.f59822OooO0OO));
            if (i != -1) {
                oo0ooOooooo.f59822OooO0OO += i;
                long j2 = i;
                sink.f59828OooO0o0 += j2;
                return j2;
            }
            if (oo0ooOooooo.f59821OooO0O0 != oo0ooOooooo.f59822OooO0OO) {
                return -1L;
            }
            sink.f59827OooO0Oo = oo0ooOooooo.OooO00o();
            o0oo0000.OooO00o(oo0ooOooooo);
            return -1L;
        } catch (AssertionError e) {
            if (o0OO.OooO0OO(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f59779OooO0Oo.close();
    }

    @Override // p662o0oooO0O.oO00000
    @NotNull
    public final oO00000o timeout() {
        return this.f59780OooO0o0;
    }

    @NotNull
    public final String toString() {
        return "source(" + this.f59779OooO0Oo + ')';
    }
}
