package p660o0oooO0;

import java.io.Closeable;
import java.util.zip.Deflater;
import org.jetbrains.annotations.NotNull;
import p662o0oooO0O.o0oOo0O0;
import p662o0oooO0O.oo0OOoo;

/* JADX INFO: loaded from: classes5.dex */
public final class o000OO0O implements Closeable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f59699OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Deflater f59700OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final oo0OOoo f59701OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final o0oOo0O0 f59702OooO0oO;

    public o000OO0O(boolean z) {
        this.f59699OooO0Oo = z;
        oo0OOoo oo0oooo = new oo0OOoo();
        this.f59701OooO0o0 = oo0oooo;
        Deflater deflater = new Deflater(-1, true);
        this.f59700OooO0o = deflater;
        this.f59702OooO0oO = new o0oOo0O0(oo0oooo, deflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.f59702OooO0oO.close();
    }
}
