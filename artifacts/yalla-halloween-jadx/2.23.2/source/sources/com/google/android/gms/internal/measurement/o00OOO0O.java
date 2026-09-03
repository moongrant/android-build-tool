package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OOO0O extends zzjb {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final transient Object f15030OooO0o;

    public o00OOO0O(Object obj) {
        this.f15030OooO0o = obj;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final void OooO00o(Object[] objArr) {
        objArr[0] = this.f15030OooO0o;
    }

    @Override // com.google.android.gms.internal.measurement.zziw, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return this.f15030OooO0o.equals(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzjb, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f15030OooO0o.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.zzjb, com.google.android.gms.internal.measurement.zziw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new o00OO(this.f15030OooO0o);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return p004OooO0oO.o000oOoO.OooO0O0("[", this.f15030OooO0o.toString(), "]");
    }

    @Override // com.google.android.gms.internal.measurement.zzjb, com.google.android.gms.internal.measurement.zziw
    /* JADX INFO: renamed from: zzd */
    public final zzjh iterator() {
        return new o00OO(this.f15030OooO0o);
    }
}
