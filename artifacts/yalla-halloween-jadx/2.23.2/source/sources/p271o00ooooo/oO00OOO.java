package p271o00ooooo;

import com.google.android.gms.measurement.internal.zzas;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class oO00OOO implements Iterator {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Iterator f40570OooO0Oo;

    public oO00OOO(zzas zzasVar) {
        this.f40570OooO0Oo = zzasVar.f15415OooO0Oo.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f40570OooO0Oo.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f40570OooO0Oo.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
