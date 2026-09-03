package p039OoooOoO;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class o000O<K, V, T> implements Iterator<T>, KMappedMarker {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public Object[] f3742Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f3743Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f3744Oooo0oo;

    public o000O() {
        o000O0O0.OooO00o oooO00o = o000O0O0.f3748OooO0o0;
        this.f3742Oooo0o = o000O0O0.f3747OooO0o.f3752OooO0Oo;
    }

    public final boolean OooO00o() {
        return this.f3744Oooo0oo < this.f3743Oooo0oO;
    }

    public final boolean OooO0O0() {
        return this.f3744Oooo0oo < this.f3742Oooo0o.length;
    }

    public final void OooO0OO(@NotNull Object[] buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        OooO0Oo(buffer, i, 0);
    }

    public final void OooO0Oo(@NotNull Object[] buffer, int i, int i2) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.f3742Oooo0o = buffer;
        this.f3743Oooo0oO = i;
        this.f3744Oooo0oo = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return OooO00o();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
