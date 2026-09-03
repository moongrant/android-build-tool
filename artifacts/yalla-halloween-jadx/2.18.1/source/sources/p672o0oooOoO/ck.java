package p672o0oooOoO;

import java.io.Closeable;
import java.util.zip.Deflater;
import p674o0oooo0.o0O0o;
import p674o0oooo0.o0oOO;

/* JADX INFO: loaded from: classes3.dex */
public final class ck implements Closeable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final boolean f51949Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final o0oOO f51950Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final Deflater f51951Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final o0O0o f51952Oooo0oo;

    public ck(boolean z) {
        this.f51949Oooo = z;
        o0oOO o0ooo2 = new o0oOO();
        this.f51950Oooo0o = o0ooo2;
        Deflater deflater = new Deflater(-1, true);
        this.f51951Oooo0oO = deflater;
        this.f51952Oooo0oo = new o0O0o(o0ooo2, deflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.f51952Oooo0oo.close();
    }
}
