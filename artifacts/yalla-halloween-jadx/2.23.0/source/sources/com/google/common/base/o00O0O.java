package com.google.common.base;

import java.io.Serializable;
import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O<T> implements o0OoOo0<T>, Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<? extends o0OoOo0<? super T>> f19085OooO0Oo;

    public o00O0O() {
        throw null;
    }

    public o00O0O(List list) {
        this.f19085OooO0Oo = list;
    }

    @Override // com.google.common.base.o0OoOo0
    public final boolean apply(@ParametricNullness T t) {
        int i = 0;
        while (true) {
            List<? extends o0OoOo0<? super T>> list = this.f19085OooO0Oo;
            if (i >= list.size()) {
                return true;
            }
            if (!list.get(i).apply(t)) {
                return false;
            }
            i++;
        }
    }

    @Override // com.google.common.base.o0OoOo0
    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof o00O0O) {
            return this.f19085OooO0Oo.equals(((o00O0O) obj).f19085OooO0Oo);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19085OooO0Oo.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (T t : this.f19085OooO0Oo) {
            if (!z) {
                sb.append(',');
            }
            sb.append(t);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
