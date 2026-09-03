package p334o0OO00o;

import com.google.android.gms.internal.measurement.zzat;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o implements Iterator {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Iterator f37216Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Iterator f37217Oooo0oO;

    public OooO0o(Iterator it, Iterator it2) {
        this.f37216Oooo0o = it;
        this.f37217Oooo0oO = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f37216Oooo0o.hasNext()) {
            return true;
        }
        return this.f37217Oooo0oO.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f37216Oooo0o.hasNext()) {
            return new zzat(((Integer) this.f37216Oooo0o.next()).toString());
        }
        if (this.f37217Oooo0oO.hasNext()) {
            return new zzat((String) this.f37217Oooo0oO.next());
        }
        throw new NoSuchElementException();
    }
}
