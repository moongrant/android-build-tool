package p659o0oooO00;

import androidx.compose.ui.input.key.OooO00o;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o000O0o implements o00O00 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o0000 f60216OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f60217OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Inflater f60218OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f60219OooO0oO;

    public o000O0o(@NotNull o00O0000 source, @NotNull Inflater inflater) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f60216OooO0Oo = source;
        this.f60218OooO0o0 = inflater;
    }

    public final long OooO00o(@NotNull o00000O sink, long j) throws IOException {
        Inflater inflater = this.f60218OooO0o0;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(OooO00o.OooO00o("byteCount < 0: ", j).toString());
        }
        if (!(!this.f60219OooO0oO)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j == 0) {
            return 0L;
        }
        try {
            o0O0ooO o0o0oooOooooOo = sink.OooooOo(1);
            int iMin = (int) Math.min(j, 8192 - o0o0oooOooooOo.f60251OooO0OO);
            OooO0OO();
            int iInflate = inflater.inflate(o0o0oooOooooOo.f60249OooO00o, o0o0oooOooooOo.f60251OooO0OO, iMin);
            int i = this.f60217OooO0o;
            if (i != 0) {
                int remaining = i - inflater.getRemaining();
                this.f60217OooO0o -= remaining;
                this.f60216OooO0Oo.skip(remaining);
            }
            if (iInflate > 0) {
                o0o0oooOooooOo.f60251OooO0OO += iInflate;
                long j2 = iInflate;
                sink.f60177OooO0o0 += j2;
                return j2;
            }
            if (o0o0oooOooooOo.f60250OooO0O0 == o0o0oooOooooOo.f60251OooO0OO) {
                sink.f60176OooO0Oo = o0o0oooOooooOo.OooO00o();
                o00oOoo.OooO00o(o0o0oooOooooOo);
            }
            return 0L;
        } catch (DataFormatException e) {
            throw new IOException(e);
        }
    }

    public final void OooO0OO() throws IOException {
        Inflater inflater = this.f60218OooO0o0;
        if (inflater.needsInput()) {
            o0000 o0000Var = this.f60216OooO0Oo;
            if (o0000Var.oo000o()) {
                return;
            }
            o0O0ooO o0o0ooo = o0000Var.OooO0O0().f60176OooO0Oo;
            Intrinsics.checkNotNull(o0o0ooo);
            int i = o0o0ooo.f60251OooO0OO;
            int i2 = o0o0ooo.f60250OooO0O0;
            int i3 = i - i2;
            this.f60217OooO0o = i3;
            inflater.setInput(o0o0ooo.f60249OooO00o, i2, i3);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f60219OooO0oO) {
            return;
        }
        this.f60218OooO0o0.end();
        this.f60219OooO0oO = true;
        this.f60216OooO0Oo.close();
    }

    @Override // p659o0oooO00.o00O00
    public final long o0000OO0(@NotNull o00000O sink, long j) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        do {
            long jOooO00o = OooO00o(sink, j);
            if (jOooO00o > 0) {
                return jOooO00o;
            }
            Inflater inflater = this.f60218OooO0o0;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.f60216OooO0Oo.oo000o());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // p659o0oooO00.o00O00
    @NotNull
    public final o00O00O timeout() {
        return this.f60216OooO0Oo.timeout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o000O0o(@NotNull o00O00 source, @NotNull Inflater inflater) {
        this(o000O0Oo.OooO0O0(source), inflater);
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
    }
}
