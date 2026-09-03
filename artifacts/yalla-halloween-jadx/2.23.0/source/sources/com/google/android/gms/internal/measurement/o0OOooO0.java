package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OOooO0 implements Iterator {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f15584OooO0Oo = -1;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Iterator f15585OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f15586OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o0OO0o f15587OooO0oO;

    public final Iterator OooO00o() {
        if (this.f15585OooO0o == null) {
            this.f15585OooO0o = this.f15587OooO0oO.f15572OooO0o.entrySet().iterator();
        }
        return this.f15585OooO0o;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f15584OooO0Oo + 1;
        o0OO0o o0oo0o2 = this.f15587OooO0oO;
        if (i >= o0oo0o2.f15573OooO0o0.size()) {
            return !o0oo0o2.f15572OooO0o.isEmpty() && OooO00o().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f15586OooO0o0 = true;
        int i = this.f15584OooO0Oo + 1;
        this.f15584OooO0Oo = i;
        o0OO0o o0oo0o2 = this.f15587OooO0oO;
        return i < o0oo0o2.f15573OooO0o0.size() ? (Map.Entry) o0oo0o2.f15573OooO0o0.get(this.f15584OooO0Oo) : (Map.Entry) OooO00o().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f15586OooO0o0) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f15586OooO0o0 = false;
        int i = o0OO0o.f15569OooOO0;
        o0OO0o o0oo0o2 = this.f15587OooO0oO;
        o0oo0o2.OooO0oO();
        if (this.f15584OooO0Oo >= o0oo0o2.f15573OooO0o0.size()) {
            OooO00o().remove();
            return;
        }
        int i2 = this.f15584OooO0Oo;
        this.f15584OooO0Oo = i2 - 1;
        o0oo0o2.OooO0o0(i2);
    }
}
