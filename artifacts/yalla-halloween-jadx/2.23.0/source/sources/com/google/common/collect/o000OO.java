package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Optional;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public abstract class o000OO<E> implements Iterable<E> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Optional<Iterable<E>> f19444OooO0Oo;

    public o000OO() {
        this.f19444OooO0Oo = com.google.common.base.OooO00o.f19063OooO0Oo;
    }

    public final String toString() {
        Iterator<E> it = this.f19444OooO0Oo.OooO0OO(this).iterator();
        StringBuilder sb = new StringBuilder("[");
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(it.next());
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }

    public o000OO(Iterable<E> iterable) {
        iterable.getClass();
        this.f19444OooO0Oo = new com.google.common.base.oo000o(iterable);
    }
}
