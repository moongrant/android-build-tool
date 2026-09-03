package com.google.android.gms.internal.measurement;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OOooO0 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Comparable f15128OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0OO0oO0 f15129OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Object f15130OooO0o0;

    public o0OOooO0(o0OO0oO0 o0oo0oo1, Comparable comparable, Object obj) {
        this.f15129OooO0o = o0oo0oo1;
        this.f15128OooO0Oo = comparable;
        this.f15130OooO0o0 = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f15128OooO0Oo.compareTo(((o0OOooO0) obj).f15128OooO0Oo);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Comparable comparable = this.f15128OooO0Oo;
        if (comparable == null) {
            zEquals = key == null;
        } else {
            zEquals = comparable.equals(key);
        }
        if (zEquals) {
            Object obj2 = this.f15130OooO0o0;
            Object value = entry.getValue();
            if (obj2 == null) {
                zEquals2 = value == null;
            } else {
                zEquals2 = obj2.equals(value);
            }
            if (zEquals2) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f15128OooO0Oo;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f15130OooO0o0;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f15128OooO0Oo;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f15130OooO0o0;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i = o0OO0oO0.f15114OooOO0;
        this.f15129OooO0o.OooO0oO();
        Object obj2 = this.f15130OooO0o0;
        this.f15130OooO0o0 = obj;
        return obj2;
    }

    public final String toString() {
        return p031OoooO0.o0OoOo0.OooO0O0(String.valueOf(this.f15128OooO0Oo), "=", String.valueOf(this.f15130OooO0o0));
    }
}
