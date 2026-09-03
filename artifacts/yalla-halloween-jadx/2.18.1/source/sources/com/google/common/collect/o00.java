package com.google.common.collect;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class o00 extends o0O0o000<Map.Entry<Object, Object>> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Iterator<? extends Map.Entry<Object, ? extends ImmutableCollection<Object>>> f18402Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Object f18403Oooo0oO = null;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public Iterator<Object> f18404Oooo0oo = o00O0.OooO00o.f18465OoooO00;

    public o00(ImmutableMultimap immutableMultimap) {
        this.f18402Oooo0o = immutableMultimap.f18184Oooo.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18404Oooo0oo.hasNext() || this.f18402Oooo0o.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f18404Oooo0oo.hasNext()) {
            Map.Entry<Object, ? extends ImmutableCollection<Object>> next = this.f18402Oooo0o.next();
            this.f18403Oooo0oO = next.getKey();
            this.f18404Oooo0oo = next.getValue().iterator();
        }
        return new o000OO0O(this.f18403Oooo0oO, this.f18404Oooo0oo.next());
    }
}
