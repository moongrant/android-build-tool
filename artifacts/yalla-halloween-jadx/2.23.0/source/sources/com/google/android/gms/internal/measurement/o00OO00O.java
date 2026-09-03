package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o00OO00O extends zzji {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f15490OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f15491OooO0o0;

    public o00OO00O(int i, int i2) {
        zzij.zzb(i2, i, "index");
        this.f15490OooO0Oo = i;
        this.f15491OooO0o0 = i2;
    }

    public abstract Object OooO00o(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f15491OooO0o0 < this.f15490OooO0Oo;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f15491OooO0o0 > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f15491OooO0o0;
        this.f15491OooO0o0 = i + 1;
        return OooO00o(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f15491OooO0o0;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f15491OooO0o0 - 1;
        this.f15491OooO0o0 = i;
        return OooO00o(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f15491OooO0o0 - 1;
    }
}
