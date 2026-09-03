package p334o0OO00o;

import android.support.v4.media.OooO00o;
import com.google.android.gms.internal.measurement.zzae;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO implements Iterator {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f37214Oooo0o = 0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ zzae f37215Oooo0oO;

    public OooO(zzae zzaeVar) {
        this.f37215Oooo0oO = zzaeVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f37214Oooo0o < this.f37215Oooo0oO.zzc();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f37214Oooo0o >= this.f37215Oooo0oO.zzc()) {
            throw new NoSuchElementException(OooO00o.OooO00o("Out of bounds index: ", this.f37214Oooo0o));
        }
        zzae zzaeVar = this.f37215Oooo0oO;
        int i = this.f37214Oooo0o;
        this.f37214Oooo0o = i + 1;
        return zzaeVar.zze(i);
    }
}
