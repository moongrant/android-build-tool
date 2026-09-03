package p334o0OO00o;

import com.google.android.gms.internal.measurement.zziy;
import com.google.android.gms.internal.measurement.zzjd;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OO implements zziy {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f37324Oooo0o = 0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final int f37325Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ zzjd f37326Oooo0oo;

    public o00OO(zzjd zzjdVar) {
        this.f37326Oooo0oo = zzjdVar;
        this.f37325Oooo0oO = zzjdVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f37324Oooo0o < this.f37325Oooo0oO;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return Byte.valueOf(zza());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.measurement.zziy
    public final byte zza() {
        int i = this.f37324Oooo0o;
        if (i >= this.f37325Oooo0oO) {
            throw new NoSuchElementException();
        }
        this.f37324Oooo0o = i + 1;
        return this.f37326Oooo0oo.OooO00o(i);
    }
}
