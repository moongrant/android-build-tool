package p659o0oooO00;

import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.Intrinsics;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o0000O00 implements o00O000 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o0000Ooo f60195OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f60196OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Deflater f60197OooO0o0;

    public o0000O00(@NotNull o00000O sink, @NotNull Deflater deflater) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
        o00 sink2 = o000O0Oo.OooO00o(sink);
        Intrinsics.checkNotNullParameter(sink2, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
        this.f60195OooO0Oo = sink2;
        this.f60197OooO0o0 = deflater;
    }

    @IgnoreJRERequirement
    public final void OooO00o(boolean z) throws IOException {
        o0O0ooO o0o0oooOooooOo;
        int iDeflate;
        o0000Ooo o0000ooo = this.f60195OooO0Oo;
        o00000O o00000oOooO0O0 = o0000ooo.OooO0O0();
        while (true) {
            o0o0oooOooooOo = o00000oOooO0O0.OooooOo(1);
            Deflater deflater = this.f60197OooO0o0;
            byte[] bArr = o0o0oooOooooOo.f60249OooO00o;
            if (z) {
                int i = o0o0oooOooooOo.f60251OooO0OO;
                iDeflate = deflater.deflate(bArr, i, 8192 - i, 2);
            } else {
                int i2 = o0o0oooOooooOo.f60251OooO0OO;
                iDeflate = deflater.deflate(bArr, i2, 8192 - i2);
            }
            if (iDeflate > 0) {
                o0o0oooOooooOo.f60251OooO0OO += iDeflate;
                o00000oOooO0O0.f60177OooO0o0 += (long) iDeflate;
                o0000ooo.OooOoO();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (o0o0oooOooooOo.f60250OooO0O0 == o0o0oooOooooOo.f60251OooO0OO) {
            o00000oOooO0O0.f60176OooO0Oo = o0o0oooOooooOo.OooO00o();
            o00oOoo.OooO00o(o0o0oooOooooOo);
        }
    }

    @Override // p659o0oooO00.o00O000, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Deflater deflater = this.f60197OooO0o0;
        if (this.f60196OooO0o) {
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
            this.f60195OooO0Oo.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f60196OooO0o = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // p659o0oooO00.o00O000, java.io.Flushable
    public final void flush() throws IOException {
        OooO00o(true);
        this.f60195OooO0Oo.flush();
    }

    @Override // p659o0oooO00.o00O000
    @NotNull
    public final o00O00O timeout() {
        return this.f60195OooO0Oo.timeout();
    }

    @NotNull
    public final String toString() {
        return "DeflaterSink(" + this.f60195OooO0Oo + ')';
    }

    @Override // p659o0oooO00.o00O000
    public final void write(@NotNull o00000O source, long j) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        oo00o.OooO0O0(source.f60177OooO0o0, 0L, j);
        while (j > 0) {
            o0O0ooO o0o0ooo = source.f60176OooO0Oo;
            Intrinsics.checkNotNull(o0o0ooo);
            int iMin = (int) Math.min(j, o0o0ooo.f60251OooO0OO - o0o0ooo.f60250OooO0O0);
            this.f60197OooO0o0.setInput(o0o0ooo.f60249OooO00o, o0o0ooo.f60250OooO0O0, iMin);
            OooO00o(false);
            long j2 = iMin;
            source.f60177OooO0o0 -= j2;
            int i = o0o0ooo.f60250OooO0O0 + iMin;
            o0o0ooo.f60250OooO0O0 = i;
            if (i == o0o0ooo.f60251OooO0OO) {
                source.f60176OooO0Oo = o0o0ooo.OooO00o();
                o00oOoo.OooO00o(o0o0ooo);
            }
            j -= j2;
        }
    }
}
