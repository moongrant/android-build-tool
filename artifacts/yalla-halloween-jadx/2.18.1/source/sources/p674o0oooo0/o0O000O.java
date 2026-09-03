package p674o0oooo0;

import androidx.viewpager2.adapter.OooO00o;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O000O implements o0O0O0O {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final Inflater f52049Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f52050Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f52051Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final o0oOOo f52052Oooo0oo;

    public o0O000O(@NotNull o0oOOo source, @NotNull Inflater inflater) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f52052Oooo0oo = source;
        this.f52049Oooo = inflater;
    }

    public final long OooO00o(@NotNull o0oOO sink, long j) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(OooO00o.OooO00o("byteCount < 0: ", j).toString());
        }
        if (!(!this.f52051Oooo0oO)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j == 0) {
            return 0L;
        }
        try {
            o0O00OOO o0o00oooO000oOoO = sink.o000oOoO(1);
            int iMin = (int) Math.min(j, 8192 - o0o00oooO000oOoO.f52069OooO0OO);
            OooO0O0();
            int iInflate = this.f52049Oooo.inflate(o0o00oooO000oOoO.f52067OooO00o, o0o00oooO000oOoO.f52069OooO0OO, iMin);
            int i = this.f52050Oooo0o;
            if (i != 0) {
                int remaining = i - this.f52049Oooo.getRemaining();
                this.f52050Oooo0o -= remaining;
                this.f52052Oooo0oo.skip(remaining);
            }
            if (iInflate > 0) {
                o0o00oooO000oOoO.f52069OooO0OO += iInflate;
                long j2 = iInflate;
                sink.f52099Oooo0oO += j2;
                return j2;
            }
            if (o0o00oooO000oOoO.f52068OooO0O0 == o0o00oooO000oOoO.f52069OooO0OO) {
                sink.f52098Oooo0o = o0o00oooO000oOoO.OooO00o();
                o0oO0Ooo.OooO0O0(o0o00oooO000oOoO);
            }
            return 0L;
        } catch (DataFormatException e) {
            throw new IOException(e);
        }
    }

    public final boolean OooO0O0() throws IOException {
        if (!this.f52049Oooo.needsInput()) {
            return false;
        }
        if (this.f52052Oooo0oo.OooOooo()) {
            return true;
        }
        o0O00OOO o0o00ooo2 = this.f52052Oooo0oo.OooO0o0().f52098Oooo0o;
        Intrinsics.checkNotNull(o0o00ooo2);
        int i = o0o00ooo2.f52069OooO0OO;
        int i2 = o0o00ooo2.f52068OooO0O0;
        int i3 = i - i2;
        this.f52050Oooo0o = i3;
        this.f52049Oooo.setInput(o0o00ooo2.f52067OooO00o, i2, i3);
        return false;
    }

    @Override // p674o0oooo0.o0O0O0O
    public final long Oooo0O0(@NotNull o0oOO sink, long j) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        do {
            long jOooO00o = OooO00o(sink, j);
            if (jOooO00o > 0) {
                return jOooO00o;
            }
            if (this.f52049Oooo.finished() || this.f52049Oooo.needsDictionary()) {
                return -1L;
            }
        } while (!this.f52052Oooo0oo.OooOooo());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // p674o0oooo0.o0O0O0O, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f52051Oooo0oO) {
            return;
        }
        this.f52049Oooo.end();
        this.f52051Oooo0oO = true;
        this.f52052Oooo0oo.close();
    }

    @Override // p674o0oooo0.o0O0O0O
    @NotNull
    public final o0oO0O0o timeout() {
        return this.f52052Oooo0oo.timeout();
    }

    public o0O000O(@NotNull o0O0O0O source, @NotNull Inflater inflater) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        o0oOOo source2 = o0O000Oo.OooO0OO(source);
        Intrinsics.checkNotNullParameter(source2, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f52052Oooo0oo = source2;
        this.f52049Oooo = inflater;
    }
}
