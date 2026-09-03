package p334o0OO00o;

import com.google.android.gms.internal.measurement.zzat;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 implements Iterator {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Iterator f37218Oooo0o;

    public OooOO0(Iterator it) {
        this.f37218Oooo0o = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f37218Oooo0o.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new zzat((String) this.f37218Oooo0o.next());
    }
}
