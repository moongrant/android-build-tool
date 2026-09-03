package p674o0oooo0;

import OooO00o.OooO00o;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.Intrinsics;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0o implements o0O00o00 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f52076Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final oo00oO f52077Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final Deflater f52078Oooo0oo;

    public o0O0o(@NotNull o0O00o00 sink, @NotNull Deflater deflater) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
        oo00oO sink2 = o0O000Oo.OooO0O0(sink);
        Intrinsics.checkNotNullParameter(sink2, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
        this.f52077Oooo0oO = sink2;
        this.f52078Oooo0oo = deflater;
    }

    @IgnoreJRERequirement
    public final void OooO00o(boolean z) throws IOException {
        o0O00OOO o0o00oooO000oOoO;
        int iDeflate;
        o0oOO o0oooOooO0o0 = this.f52077Oooo0oO.OooO0o0();
        while (true) {
            o0o00oooO000oOoO = o0oooOooO0o0.o000oOoO(1);
            if (z) {
                Deflater deflater = this.f52078Oooo0oo;
                byte[] bArr = o0o00oooO000oOoO.f52067OooO00o;
                int i = o0o00oooO000oOoO.f52069OooO0OO;
                iDeflate = deflater.deflate(bArr, i, 8192 - i, 2);
            } else {
                Deflater deflater2 = this.f52078Oooo0oo;
                byte[] bArr2 = o0o00oooO000oOoO.f52067OooO00o;
                int i2 = o0o00oooO000oOoO.f52069OooO0OO;
                iDeflate = deflater2.deflate(bArr2, i2, 8192 - i2);
            }
            if (iDeflate > 0) {
                o0o00oooO000oOoO.f52069OooO0OO += iDeflate;
                o0oooOooO0o0.f52099Oooo0oO += (long) iDeflate;
                this.f52077Oooo0oO.Oooo0oo();
            } else if (this.f52078Oooo0oo.needsInput()) {
                break;
            }
        }
        if (o0o00oooO000oOoO.f52068OooO0O0 == o0o00oooO000oOoO.f52069OooO0OO) {
            o0oooOooO0o0.f52098Oooo0o = o0o00oooO000oOoO.OooO00o();
            o0oO0Ooo.OooO0O0(o0o00oooO000oOoO);
        }
    }

    @Override // p674o0oooo0.o0O00o00, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        if (this.f52076Oooo0o) {
            return;
        }
        Throwable th = null;
        try {
            this.f52078Oooo0oo.finish();
            OooO00o(false);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f52078Oooo0oo.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            this.f52077Oooo0oO.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.f52076Oooo0o = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // p674o0oooo0.o0O00o00, java.io.Flushable
    public final void flush() throws IOException {
        OooO00o(true);
        this.f52077Oooo0oO.flush();
    }

    @Override // p674o0oooo0.o0O00o00
    @NotNull
    public final o0oO0O0o timeout() {
        return this.f52077Oooo0oO.timeout();
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("DeflaterSink(");
        sbOooO0o0.append(this.f52077Oooo0oO);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }

    @Override // p674o0oooo0.o0O00o00
    public final void write(@NotNull o0oOO source, long j) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        o00OOO0O.OooO0O0(source.f52099Oooo0oO, 0L, j);
        while (j > 0) {
            o0O00OOO o0o00ooo2 = source.f52098Oooo0o;
            Intrinsics.checkNotNull(o0o00ooo2);
            int iMin = (int) Math.min(j, o0o00ooo2.f52069OooO0OO - o0o00ooo2.f52068OooO0O0);
            this.f52078Oooo0oo.setInput(o0o00ooo2.f52067OooO00o, o0o00ooo2.f52068OooO0O0, iMin);
            OooO00o(false);
            long j2 = iMin;
            source.f52099Oooo0oO -= j2;
            int i = o0o00ooo2.f52068OooO0O0 + iMin;
            o0o00ooo2.f52068OooO0O0 = i;
            if (i == o0o00ooo2.f52069OooO0OO) {
                source.f52098Oooo0o = o0o00ooo2.OooO00o();
                o0oO0Ooo.OooO0O0(o0o00ooo2);
            }
            j -= j2;
        }
    }
}
