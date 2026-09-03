package p188o00o0O;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes.dex */
public final class o000oOoO implements Iterator<Object>, KMappedMarker {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f38818OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Oooo0<Object> f38819OooO0o0;

    public o000oOoO(Oooo0<Object> oooo0) {
        this.f38819OooO0o0 = oooo0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f38818OooO0Oo < this.f38819OooO0o0.OooO();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f38818OooO0Oo;
        this.f38818OooO0Oo = i + 1;
        return this.f38819OooO0o0.OooOO0(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
