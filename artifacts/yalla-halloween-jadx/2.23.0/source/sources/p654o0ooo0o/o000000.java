package p654o0ooo0o;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import org.jetbrains.annotations.NotNull;
import p659o0oooO00.o00000O;
import p659o0oooO00.o000O0o;

/* JADX INFO: loaded from: classes5.dex */
public final class o000000 implements Closeable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f60058OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Inflater f60059OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o00000O f60060OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final o000O0o f60061OooO0oO;

    public o000000(boolean z) {
        this.f60058OooO0Oo = z;
        o00000O o00000o = new o00000O();
        this.f60060OooO0o0 = o00000o;
        Inflater inflater = new Inflater(true);
        this.f60059OooO0o = inflater;
        this.f60061OooO0oO = new o000O0o(o00000o, inflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f60061OooO0oO.close();
    }
}
