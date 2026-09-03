package com.google.common.collect;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O00O extends o0000O0O<Object> {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Iterable f18471Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f18472Oooo0oo;

    public class OooO00o implements Iterator<Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public boolean f18473Oooo0o = true;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Iterator f18474Oooo0oO;

        public OooO00o(Iterator it) {
            this.f18474Oooo0oO = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f18474Oooo0oO.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Object next = this.f18474Oooo0oO.next();
            this.f18473Oooo0o = false;
            return next;
        }

        @Override // java.util.Iterator
        public final void remove() {
            oo000o.OooO0Oo(!this.f18473Oooo0o);
            this.f18474Oooo0oO.remove();
        }
    }

    public o00O00O(Iterable iterable, int i) {
        this.f18471Oooo0oO = iterable;
        this.f18472Oooo0oo = i;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        Iterable iterable = this.f18471Oooo0oO;
        if (iterable instanceof List) {
            List list = (List) iterable;
            return list.subList(Math.min(list.size(), this.f18472Oooo0oo), list.size()).iterator();
        }
        Iterator it = iterable.iterator();
        int i = this.f18472Oooo0oo;
        Objects.requireNonNull(it);
        o0OOOO0o.OooOOOO.OooO0Oo(i >= 0, "numberToAdvance must be nonnegative");
        for (int i2 = 0; i2 < i && it.hasNext(); i2++) {
            it.next();
        }
        return new OooO00o(it);
    }
}
