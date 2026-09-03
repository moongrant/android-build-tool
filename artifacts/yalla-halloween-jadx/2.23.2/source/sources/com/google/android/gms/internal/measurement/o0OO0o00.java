package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OO0o00 implements Iterator {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f15110OooO0Oo = -1;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Iterator f15111OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f15112OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o0OO0oO0 f15113OooO0oO;

    public final Iterator OooO00o() {
        if (this.f15111OooO0o == null) {
            this.f15111OooO0o = this.f15113OooO0oO.f15117OooO0o.entrySet().iterator();
        }
        return this.f15111OooO0o;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f15110OooO0Oo + 1;
        o0OO0oO0 o0oo0oo1 = this.f15113OooO0oO;
        if (i >= o0oo0oo1.f15118OooO0o0.size()) {
            return !o0oo0oo1.f15117OooO0o.isEmpty() && OooO00o().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f15112OooO0o0 = true;
        int i = this.f15110OooO0Oo + 1;
        this.f15110OooO0Oo = i;
        o0OO0oO0 o0oo0oo1 = this.f15113OooO0oO;
        return i < o0oo0oo1.f15118OooO0o0.size() ? (Map.Entry) o0oo0oo1.f15118OooO0o0.get(this.f15110OooO0Oo) : (Map.Entry) OooO00o().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f15112OooO0o0) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f15112OooO0o0 = false;
        int i = o0OO0oO0.f15114OooOO0;
        o0OO0oO0 o0oo0oo1 = this.f15113OooO0oO;
        o0oo0oo1.OooO0oO();
        if (this.f15110OooO0Oo >= o0oo0oo1.f15118OooO0o0.size()) {
            OooO00o().remove();
            return;
        }
        int i2 = this.f15110OooO0Oo;
        this.f15110OooO0Oo = i2 - 1;
        o0oo0oo1.OooO0o0(i2);
    }
}
