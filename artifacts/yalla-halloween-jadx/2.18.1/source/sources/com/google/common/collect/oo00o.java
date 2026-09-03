package com.google.common.collect;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class oo00o extends o0O0o000<Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f18679Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f18680Oooo0oO;

    public oo00o(Object obj) {
        this.f18680Oooo0oO = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f18679Oooo0o;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f18679Oooo0o) {
            throw new NoSuchElementException();
        }
        this.f18679Oooo0o = true;
        return this.f18680Oooo0oO;
    }
}
