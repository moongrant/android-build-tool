package p100o000oOoO;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o0OO0o implements Iterator<Object>, KMappedMarker {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f29608Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f29609Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o0OO0o00 f29610Oooo0oo;

    public o0OO0o(int i, int i2, o0OO0o00 o0oo0o01) {
        this.f29609Oooo0oO = i2;
        this.f29610Oooo0oo = o0oo0o01;
        this.f29608Oooo0o = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f29608Oooo0o < this.f29609Oooo0oO;
    }

    @Override // java.util.Iterator
    @Nullable
    public final Object next() {
        if (!hasNext()) {
            return null;
        }
        o0OO0o00 o0oo0o01 = this.f29610Oooo0oo;
        Object[] objArr = o0oo0o01.f29615OooO0OO;
        int i = this.f29608Oooo0o;
        this.f29608Oooo0o = i + 1;
        return objArr[o0oo0o01.OooO0oo(i)];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
