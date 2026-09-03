package p659o0oooO00;

import androidx.compose.ui.input.key.OooO00o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class o000OOo0 implements o00O00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public long f60224OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o0000 f60225OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public o0O0ooO f60226OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o00000O f60227OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f60228OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f60229OooO0oo;

    public o000OOo0(@NotNull o0000 upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        this.f60225OooO0Oo = upstream;
        o00000O o00000oOooO0O0 = upstream.OooO0O0();
        this.f60227OooO0o0 = o00000oOooO0O0;
        o0O0ooO o0o0ooo = o00000oOooO0O0.f60176OooO0Oo;
        this.f60226OooO0o = o0o0ooo;
        this.f60228OooO0oO = o0o0ooo != null ? o0o0ooo.f60250OooO0O0 : -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f60229OooO0oo = true;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    @Override // p659o0oooO00.o00O00
    public final long o0000OO0(@NotNull o00000O sink, long j) {
        o0O0ooO o0o0ooo;
        Intrinsics.checkNotNullParameter(sink, "sink");
        boolean z = false;
        if (!(j >= 0)) {
            throw new IllegalArgumentException(OooO00o.OooO00o("byteCount < 0: ", j).toString());
        }
        if (!(!this.f60229OooO0oo)) {
            throw new IllegalStateException("closed".toString());
        }
        o0O0ooO o0o0ooo2 = this.f60226OooO0o;
        o00000O o00000o = this.f60227OooO0o0;
        if (o0o0ooo2 == null) {
            z = true;
        } else {
            o0O0ooO o0o0ooo3 = o00000o.f60176OooO0Oo;
            if (o0o0ooo2 == o0o0ooo3) {
                int i = this.f60228OooO0oO;
                Intrinsics.checkNotNull(o0o0ooo3);
                if (i == o0o0ooo3.f60250OooO0O0) {
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
        if (!this.f60225OooO0Oo.request(this.f60224OooO + 1)) {
            return -1L;
        }
        if (this.f60226OooO0o == null && (o0o0ooo = o00000o.f60176OooO0Oo) != null) {
            this.f60226OooO0o = o0o0ooo;
            Intrinsics.checkNotNull(o0o0ooo);
            this.f60228OooO0oO = o0o0ooo.f60250OooO0O0;
        }
        long jMin = Math.min(j, o00000o.f60177OooO0o0 - this.f60224OooO);
        this.f60227OooO0o0.OooOo0(this.f60224OooO, jMin, sink);
        this.f60224OooO += jMin;
        return jMin;
    }

    @Override // p659o0oooO00.o00O00
    @NotNull
    public final o00O00O timeout() {
        return this.f60225OooO0Oo.timeout();
    }
}
