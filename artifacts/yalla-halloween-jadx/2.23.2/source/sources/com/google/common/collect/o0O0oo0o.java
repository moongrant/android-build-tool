package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0oo0o extends o0O0O0Oo.OooO0o<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Set f19118OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Set f19119OooO0o0;

    public o0O0oo0o(ImmutableSet immutableSet, ImmutableSet immutableSet2) {
        this.f19118OooO0Oo = immutableSet;
        this.f19119OooO0o0 = immutableSet2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return this.f19118OooO0Oo.contains(obj) && this.f19119OooO0o0.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        return this.f19118OooO0Oo.containsAll(collection) && this.f19119OooO0o0.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.f19119OooO0o0, this.f19118OooO0Oo);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new o0oO0O0o(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f19118OooO0Oo.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.f19119OooO0o0.contains(it.next())) {
                i++;
            }
        }
        return i;
    }
}
