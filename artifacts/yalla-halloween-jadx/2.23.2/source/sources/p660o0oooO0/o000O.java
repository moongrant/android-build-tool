package p660o0oooO0;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import org.jetbrains.annotations.NotNull;
import p662o0oooO0O.o0OO0;
import p662o0oooO0O.oo0OOoo;

/* JADX INFO: loaded from: classes5.dex */
public final class o000O implements Closeable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f59660OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Inflater f59661OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final oo0OOoo f59662OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final o0OO0 f59663OooO0oO;

    public o000O(boolean z) {
        this.f59660OooO0Oo = z;
        oo0OOoo oo0oooo = new oo0OOoo();
        this.f59662OooO0o0 = oo0oooo;
        Inflater inflater = new Inflater(true);
        this.f59661OooO0o = inflater;
        this.f59663OooO0oO = new o0OO0(oo0oooo, inflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f59663OooO0oO.close();
    }
}
