package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OOO00 extends zzjb {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final Object[] f15497OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final o00OOO00 f15498OooOO0o;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final transient int f15499OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final transient Object[] f15500OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final transient int f15501OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final transient Object[] f15502OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final transient int f15503OooOO0;

    static {
        Object[] objArr = new Object[0];
        f15497OooOO0O = objArr;
        f15498OooOO0o = new o00OOO00(objArr, objArr, 0, 0, 0);
    }

    public o00OOO00(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        this.f15500OooO0o = objArr;
        this.f15501OooO0oO = i;
        this.f15502OooO0oo = objArr2;
        this.f15499OooO = i2;
        this.f15503OooOO0 = i3;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final void OooO00o(Object[] objArr) {
        System.arraycopy(this.f15500OooO0o, 0, objArr, 0, this.f15503OooOO0);
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int OooO0O0() {
        return this.f15503OooOO0;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int OooO0OO() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final Object[] OooO0Oo() {
        return this.f15500OooO0o;
    }

    @Override // com.google.android.gms.internal.measurement.zzjb
    public final o00OO OooO0o() {
        return zzja.OooO0o0(this.f15503OooOO0, this.f15500OooO0o);
    }

    @Override // com.google.android.gms.internal.measurement.zziw, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        if (obj != null) {
            Object[] objArr = this.f15502OooO0oo;
            if (objArr.length != 0) {
                int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) obj.hashCode()) * (-862048943)), 15)) * 461845907);
                while (true) {
                    int i = iRotateLeft & this.f15499OooO;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iRotateLeft = i + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzjb, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f15501OooO0oO;
    }

    @Override // com.google.android.gms.internal.measurement.zzjb, com.google.android.gms.internal.measurement.zziw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return zzg().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f15503OooOO0;
    }

    @Override // com.google.android.gms.internal.measurement.zzjb, com.google.android.gms.internal.measurement.zziw
    /* JADX INFO: renamed from: zzd */
    public final zzjh iterator() {
        return zzg().listIterator(0);
    }
}
