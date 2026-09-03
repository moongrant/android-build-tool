package com.google.common.collect;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O00OO extends o000OO<Object> {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f19035OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Iterable f19036OooO0o0;

    public class OooO00o implements Iterator<Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f19037OooO0Oo = true;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Iterator f19038OooO0o0;

        public OooO00o(Iterator it) {
            this.f19038OooO0o0 = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f19038OooO0o0.hasNext();
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public final Object next() {
            Object next = this.f19038OooO0o0.next();
            this.f19037OooO0Oo = false;
            return next;
        }

        @Override // java.util.Iterator
        public final void remove() {
            oo000o.OooO0Oo(!this.f19037OooO0Oo);
            this.f19038OooO0o0.remove();
        }
    }

    public o00O00OO(Iterable iterable, int i) {
        this.f19036OooO0o0 = iterable;
        this.f19035OooO0o = i;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        Iterable iterable = this.f19036OooO0o0;
        boolean z = iterable instanceof List;
        int i = this.f19035OooO0o;
        if (z) {
            List list = (List) iterable;
            return list.subList(Math.min(list.size(), i), list.size()).iterator();
        }
        Iterator it = iterable.iterator();
        it.getClass();
        com.google.common.base.o0OoOo0.OooO0o0(i >= 0, "numberToAdvance must be nonnegative");
        for (int i2 = 0; i2 < i && it.hasNext(); i2++) {
            it.next();
        }
        return new OooO00o(it);
    }
}
