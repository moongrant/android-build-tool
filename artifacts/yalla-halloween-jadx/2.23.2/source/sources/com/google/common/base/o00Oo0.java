package com.google.common.base;

import java.io.Serializable;
import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Oo0<T> implements o00O0O<T>, Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<? extends o00O0O<? super T>> f18609OooO0Oo;

    public o00Oo0() {
        throw null;
    }

    public o00Oo0(List list) {
        this.f18609OooO0Oo = list;
    }

    @Override // com.google.common.base.o00O0O
    public final boolean apply(@ParametricNullness T t) {
        int i = 0;
        while (true) {
            List<? extends o00O0O<? super T>> list = this.f18609OooO0Oo;
            if (i >= list.size()) {
                return true;
            }
            if (!list.get(i).apply(t)) {
                return false;
            }
            i++;
        }
    }

    @Override // com.google.common.base.o00O0O
    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof o00Oo0) {
            return this.f18609OooO0Oo.equals(((o00Oo0) obj).f18609OooO0Oo);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18609OooO0Oo.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (T t : this.f18609OooO0Oo) {
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
