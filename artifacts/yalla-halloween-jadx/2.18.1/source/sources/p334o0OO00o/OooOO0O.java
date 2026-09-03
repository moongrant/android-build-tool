package p334o0OO00o;

import com.google.android.gms.internal.measurement.zzat;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O implements Iterator {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f37219Oooo0o = 0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ zzat f37220Oooo0oO;

    public OooOO0O(zzat zzatVar) {
        this.f37220Oooo0oO = zzatVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f37219Oooo0o < this.f37220Oooo0oO.f15898Oooo0o.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.f37219Oooo0o;
        if (i >= this.f37220Oooo0oO.f15898Oooo0o.length()) {
            throw new NoSuchElementException();
        }
        this.f37219Oooo0o = i + 1;
        return new zzat(String.valueOf(i));
    }
}
