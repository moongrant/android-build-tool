package p654o0ooo0o;

import java.io.Closeable;
import java.util.zip.Deflater;
import org.jetbrains.annotations.NotNull;
import p659o0oooO00.o00000O;
import p659o0oooO00.o0000O00;

/* JADX INFO: loaded from: classes5.dex */
public final class o0O0O00 implements Closeable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f60121OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Deflater f60122OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o00000O f60123OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final o0000O00 f60124OooO0oO;

    public o0O0O00(boolean z) {
        this.f60121OooO0Oo = z;
        o00000O o00000o = new o00000O();
        this.f60123OooO0o0 = o00000o;
        Deflater deflater = new Deflater(-1, true);
        this.f60122OooO0o = deflater;
        this.f60124OooO0oO = new o0000O00(o00000o, deflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.f60124OooO0oO.close();
    }
}
