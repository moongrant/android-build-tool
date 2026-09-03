package p190o00o0O;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo0 implements Iterator<Object>, KMappedMarker {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f38578OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Oooo000<Object> f38579OooO0o0;

    public Oooo0(Oooo000<Object> oooo000) {
        this.f38579OooO0o0 = oooo000;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f38578OooO0Oo < this.f38579OooO0o0.OooO();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f38578OooO0Oo;
        this.f38578OooO0Oo = i + 1;
        return this.f38579OooO0o0.OooOO0(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
