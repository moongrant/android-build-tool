package p674o0oooo0;

import androidx.viewpager2.adapter.OooO00o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O00O0o implements o0O0O0O {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f52057Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final o0oOO f52058Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public o0O00OOO f52059Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f52060Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final o0oOOo f52061OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public long f52062OoooO00;

    public o0O00O0o(@NotNull o0oOOo upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        this.f52061OoooO0 = upstream;
        o0oOO o0oooOooO0o0 = upstream.OooO0o0();
        this.f52058Oooo0o = o0oooOooO0o0;
        o0O00OOO o0o00ooo2 = o0oooOooO0o0.f52098Oooo0o;
        this.f52059Oooo0oO = o0o00ooo2;
        this.f52060Oooo0oo = o0o00ooo2 != null ? o0o00ooo2.f52068OooO0O0 : -1;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    @Override // p674o0oooo0.o0O0O0O
    public final long Oooo0O0(@NotNull o0oOO sink, long j) {
        o0O00OOO o0o00ooo2;
        Intrinsics.checkNotNullParameter(sink, "sink");
        boolean z = false;
        if (!(j >= 0)) {
            throw new IllegalArgumentException(OooO00o.OooO00o("byteCount < 0: ", j).toString());
        }
        if (!(!this.f52057Oooo)) {
            throw new IllegalStateException("closed".toString());
        }
        o0O00OOO o0o00ooo3 = this.f52059Oooo0oO;
        if (o0o00ooo3 == null) {
            z = true;
        } else {
            o0O00OOO o0o00ooo4 = this.f52058Oooo0o.f52098Oooo0o;
            if (o0o00ooo3 == o0o00ooo4) {
                int i = this.f52060Oooo0oo;
                Intrinsics.checkNotNull(o0o00ooo4);
                if (i == o0o00ooo4.f52068OooO0O0) {
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
        if (!this.f52061OoooO0.request(this.f52062OoooO00 + 1)) {
            return -1L;
        }
        if (this.f52059Oooo0oO == null && (o0o00ooo2 = this.f52058Oooo0o.f52098Oooo0o) != null) {
            this.f52059Oooo0oO = o0o00ooo2;
            Intrinsics.checkNotNull(o0o00ooo2);
            this.f52060Oooo0oo = o0o00ooo2.f52068OooO0O0;
        }
        long jMin = Math.min(j, this.f52058Oooo0o.f52099Oooo0oO - this.f52062OoooO00);
        this.f52058Oooo0o.OooOOo(sink, this.f52062OoooO00, jMin);
        this.f52062OoooO00 += jMin;
        return jMin;
    }

    @Override // p674o0oooo0.o0O0O0O, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f52057Oooo = true;
    }

    @Override // p674o0oooo0.o0O0O0O
    @NotNull
    public final o0oO0O0o timeout() {
        return this.f52061OoooO0.timeout();
    }
}
