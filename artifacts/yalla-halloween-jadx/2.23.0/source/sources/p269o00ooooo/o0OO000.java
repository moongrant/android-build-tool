package p269o00ooooo;

import com.google.android.gms.measurement.internal.zzas;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OO000 implements Iterator {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Iterator f41188OooO0Oo;

    public o0OO000(zzas zzasVar) {
        this.f41188OooO0Oo = zzasVar.f15891OooO0Oo.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41188OooO0Oo.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f41188OooO0Oo.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
