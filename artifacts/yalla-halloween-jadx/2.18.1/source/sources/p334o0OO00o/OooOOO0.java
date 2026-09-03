package p334o0OO00o;

import com.google.android.gms.internal.measurement.zzat;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 implements Iterator {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f37223Oooo0o = 0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ zzat f37224Oooo0oO;

    public OooOOO0(zzat zzatVar) {
        this.f37224Oooo0oO = zzatVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f37223Oooo0o < this.f37224Oooo0oO.f15898Oooo0o.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.f37223Oooo0o;
        zzat zzatVar = this.f37224Oooo0oO;
        if (i >= zzatVar.f15898Oooo0o.length()) {
            throw new NoSuchElementException();
        }
        String str = zzatVar.f15898Oooo0o;
        this.f37223Oooo0o = i + 1;
        return new zzat(String.valueOf(str.charAt(i)));
    }
}
