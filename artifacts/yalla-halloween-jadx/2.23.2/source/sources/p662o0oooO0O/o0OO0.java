package p662o0oooO0O;

import androidx.compose.ui.input.key.OooO00o;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o0OO0 implements oO00000 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o0O0o0 f59767OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f59768OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Inflater f59769OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f59770OooO0oO;

    public o0OO0(@NotNull o0o0000 source, @NotNull Inflater inflater) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f59767OooO0Oo = source;
        this.f59769OooO0o0 = inflater;
    }

    public final long OooO00o(@NotNull oo0OOoo sink, long j) throws IOException {
        Inflater inflater = this.f59769OooO0o0;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(OooO00o.OooO00o("byteCount < 0: ", j).toString());
        }
        if (!(!this.f59770OooO0oO)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j == 0) {
            return 0L;
        }
        try {
            oO0Oo oo0ooOooooo = sink.Oooooo(1);
            int iMin = (int) Math.min(j, 8192 - oo0ooOooooo.f59822OooO0OO);
            OooO0OO();
            int iInflate = inflater.inflate(oo0ooOooooo.f59820OooO00o, oo0ooOooooo.f59822OooO0OO, iMin);
            int i = this.f59768OooO0o;
            if (i != 0) {
                int remaining = i - inflater.getRemaining();
                this.f59768OooO0o -= remaining;
                this.f59767OooO0Oo.skip(remaining);
            }
            if (iInflate > 0) {
                oo0ooOooooo.f59822OooO0OO += iInflate;
                long j2 = iInflate;
                sink.f59828OooO0o0 += j2;
                return j2;
            }
            if (oo0ooOooooo.f59821OooO0O0 == oo0ooOooooo.f59822OooO0OO) {
                sink.f59827OooO0Oo = oo0ooOooooo.OooO00o();
                o0oo0000.OooO00o(oo0ooOooooo);
            }
            return 0L;
        } catch (DataFormatException e) {
            throw new IOException(e);
        }
    }

    public final void OooO0OO() throws IOException {
        Inflater inflater = this.f59769OooO0o0;
        if (inflater.needsInput()) {
            o0O0o0 o0o0o0 = this.f59767OooO0Oo;
            if (o0o0o0.o00oO0O()) {
                return;
            }
            oO0Oo oo0oo = o0o0o0.OooO0O0().f59827OooO0Oo;
            Intrinsics.checkNotNull(oo0oo);
            int i = oo0oo.f59822OooO0OO;
            int i2 = oo0oo.f59821OooO0O0;
            int i3 = i - i2;
            this.f59768OooO0o = i3;
            inflater.setInput(oo0oo.f59820OooO00o, i2, i3);
        }
    }

    @Override // p662o0oooO0O.oO00000
    public final long OooOO0O(@NotNull oo0OOoo sink, long j) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        do {
            long jOooO00o = OooO00o(sink, j);
            if (jOooO00o > 0) {
                return jOooO00o;
            }
            Inflater inflater = this.f59769OooO0o0;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.f59767OooO0Oo.o00oO0O());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f59770OooO0oO) {
            return;
        }
        this.f59769OooO0o0.end();
        this.f59770OooO0oO = true;
        this.f59767OooO0Oo.close();
    }

    @Override // p662o0oooO0O.oO00000
    @NotNull
    public final oO00000o timeout() {
        return this.f59767OooO0Oo.timeout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o0OO0(@NotNull oO00000 source, @NotNull Inflater inflater) {
        this(o0OO.OooO0O0(source), inflater);
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
    }
}
