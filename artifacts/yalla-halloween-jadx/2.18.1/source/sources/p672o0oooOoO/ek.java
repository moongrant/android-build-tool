package p672o0oooOoO;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import p674o0oooo0.o0O000O;
import p674o0oooo0.o0O0O0O;
import p674o0oooo0.o0oOO;

/* JADX INFO: loaded from: classes3.dex */
public final class ek implements Closeable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final boolean f51954Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final o0oOO f51955Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final Inflater f51956Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final o0O000O f51957Oooo0oo;

    public ek(boolean z) {
        this.f51954Oooo = z;
        o0oOO o0ooo2 = new o0oOO();
        this.f51955Oooo0o = o0ooo2;
        Inflater inflater = new Inflater(true);
        this.f51956Oooo0oO = inflater;
        this.f51957Oooo0oo = new o0O000O((o0O0O0O) o0ooo2, inflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f51957Oooo0oo.close();
    }
}
