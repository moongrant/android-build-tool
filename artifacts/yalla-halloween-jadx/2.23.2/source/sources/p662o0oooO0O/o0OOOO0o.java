package p662o0oooO0O;

import androidx.compose.ui.input.key.OooO00o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class o0OOOO0o implements oO00000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public long f59789OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o0O0o0 f59790OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public oO0Oo f59791OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final oo0OOoo f59792OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f59793OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f59794OooO0oo;

    public o0OOOO0o(@NotNull o0O0o0 upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        this.f59790OooO0Oo = upstream;
        oo0OOoo oo0ooooOooO0O0 = upstream.OooO0O0();
        this.f59792OooO0o0 = oo0ooooOooO0O0;
        oO0Oo oo0oo = oo0ooooOooO0O0.f59827OooO0Oo;
        this.f59791OooO0o = oo0oo;
        this.f59793OooO0oO = oo0oo != null ? oo0oo.f59821OooO0O0 : -1;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    @Override // p662o0oooO0O.oO00000
    public final long OooOO0O(@NotNull oo0OOoo sink, long j) {
        oO0Oo oo0oo;
        Intrinsics.checkNotNullParameter(sink, "sink");
        boolean z = false;
        if (!(j >= 0)) {
            throw new IllegalArgumentException(OooO00o.OooO00o("byteCount < 0: ", j).toString());
        }
        if (!(!this.f59794OooO0oo)) {
            throw new IllegalStateException("closed".toString());
        }
        oO0Oo oo0oo2 = this.f59791OooO0o;
        oo0OOoo oo0oooo = this.f59792OooO0o0;
        if (oo0oo2 == null) {
            z = true;
        } else {
            oO0Oo oo0oo3 = oo0oooo.f59827OooO0Oo;
            if (oo0oo2 == oo0oo3) {
                int i = this.f59793OooO0oO;
                Intrinsics.checkNotNull(oo0oo3);
                if (i == oo0oo3.f59821OooO0O0) {
                    z = true;
                }
            }
        }
        if (!z) {
            throw new IllegalStateException("Peek source is invalid because upstream source was used".toString());
        }
        if (j == 0) {
            return 0L;
        }
        if (!this.f59790OooO0Oo.request(this.f59789OooO + 1)) {
            return -1L;
        }
        if (this.f59791OooO0o == null && (oo0oo = oo0oooo.f59827OooO0Oo) != null) {
            this.f59791OooO0o = oo0oo;
            Intrinsics.checkNotNull(oo0oo);
            this.f59793OooO0oO = oo0oo.f59821OooO0O0;
        }
        long jMin = Math.min(j, oo0oooo.f59828OooO0o0 - this.f59789OooO);
        this.f59792OooO0o0.OooOo0(this.f59789OooO, jMin, sink);
        this.f59789OooO += jMin;
        return jMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f59794OooO0oo = true;
    }

    @Override // p662o0oooO0O.oO00000
    @NotNull
    public final oO00000o timeout() {
        return this.f59790OooO0Oo.timeout();
    }
}
