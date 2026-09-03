package p662o0oooO0O;

import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.Intrinsics;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o0oOo0O0 implements ooo0Oo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o0O0o00O f59803OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f59804OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Deflater f59805OooO0o0;

    public o0oOo0O0(@NotNull oo0OOoo sink, @NotNull Deflater deflater) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
        o0OOo000 sink2 = o0OO.OooO00o(sink);
        Intrinsics.checkNotNullParameter(sink2, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
        this.f59803OooO0Oo = sink2;
        this.f59805OooO0o0 = deflater;
    }

    @IgnoreJRERequirement
    public final void OooO00o(boolean z) throws IOException {
        oO0Oo oo0ooOooooo;
        int iDeflate;
        o0O0o00O o0o0o00o = this.f59803OooO0Oo;
        oo0OOoo oo0ooooOooO0O0 = o0o0o00o.OooO0O0();
        while (true) {
            oo0ooOooooo = oo0ooooOooO0O0.Oooooo(1);
            Deflater deflater = this.f59805OooO0o0;
            byte[] bArr = oo0ooOooooo.f59820OooO00o;
            if (z) {
                int i = oo0ooOooooo.f59822OooO0OO;
                iDeflate = deflater.deflate(bArr, i, 8192 - i, 2);
            } else {
                int i2 = oo0ooOooooo.f59822OooO0OO;
                iDeflate = deflater.deflate(bArr, i2, 8192 - i2);
            }
            if (iDeflate > 0) {
                oo0ooOooooo.f59822OooO0OO += iDeflate;
                oo0ooooOooO0O0.f59828OooO0o0 += (long) iDeflate;
                o0o0o00o.OooOoO();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (oo0ooOooooo.f59821OooO0O0 == oo0ooOooooo.f59822OooO0OO) {
            oo0ooooOooO0O0.f59827OooO0Oo = oo0ooOooooo.OooO00o();
            o0oo0000.OooO00o(oo0ooOooooo);
        }
    }

    @Override // p662o0oooO0O.ooo0Oo0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Deflater deflater = this.f59805OooO0o0;
        if (this.f59804OooO0o) {
            return;
        }
        deflater.finish();
        OooO00o(false);
        th = null;
        try {
            deflater.end();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        try {
            this.f59803OooO0Oo.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f59804OooO0o = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // p662o0oooO0O.ooo0Oo0, java.io.Flushable
    public final void flush() throws IOException {
        OooO00o(true);
        this.f59803OooO0Oo.flush();
    }

    @Override // p662o0oooO0O.ooo0Oo0
    @NotNull
    public final oO00000o timeout() {
        return this.f59803OooO0Oo.timeout();
    }

    @NotNull
    public final String toString() {
        return "DeflaterSink(" + this.f59803OooO0Oo + ')';
    }

    @Override // p662o0oooO0O.ooo0Oo0
    public final void write(@NotNull oo0OOoo source, long j) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        oO000.OooO0O0(source.f59828OooO0o0, 0L, j);
        while (j > 0) {
            oO0Oo oo0oo = source.f59827OooO0Oo;
            Intrinsics.checkNotNull(oo0oo);
            int iMin = (int) Math.min(j, oo0oo.f59822OooO0OO - oo0oo.f59821OooO0O0);
            this.f59805OooO0o0.setInput(oo0oo.f59820OooO00o, oo0oo.f59821OooO0O0, iMin);
            OooO00o(false);
            long j2 = iMin;
            source.f59828OooO0o0 -= j2;
            int i = oo0oo.f59821OooO0O0 + iMin;
            oo0oo.f59821OooO0O0 = i;
            if (i == oo0oo.f59822OooO0OO) {
                source.f59827OooO0Oo = oo0oo.OooO00o();
                o0oo0000.OooO00o(oo0oo);
            }
            j -= j2;
        }
    }
}
