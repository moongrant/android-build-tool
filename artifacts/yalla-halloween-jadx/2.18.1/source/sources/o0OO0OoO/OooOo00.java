package o0OO0OoO;

import com.google.android.gms.measurement.internal.zzau;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 implements Iterator {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Iterator f37517Oooo0o;

    public OooOo00(zzau zzauVar) {
        this.f37517Oooo0o = zzauVar.f16095Oooo0o.keySet().iterator();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public final String next() {
        return (String) this.f37517Oooo0o.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f37517Oooo0o.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
