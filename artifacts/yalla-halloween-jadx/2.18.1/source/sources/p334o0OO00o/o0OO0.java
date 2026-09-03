package p334o0OO00o;

import com.google.android.gms.internal.measurement.zzms;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO0 implements Iterator {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Iterator f37411Oooo0o;

    public o0OO0(zzms zzmsVar) {
        this.f37411Oooo0o = zzmsVar.f15994Oooo0o.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f37411Oooo0o.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f37411Oooo0o.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
