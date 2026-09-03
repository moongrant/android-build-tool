package com.google.common.base;

import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class oo000o<T> implements o00O0O<T>, Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00O0O<T> f18616OooO0Oo;

    public oo000o(o00Ooo o00ooo2) {
        this.f18616OooO0Oo = o00ooo2;
    }

    @Override // com.google.common.base.o00O0O
    public final boolean apply(@ParametricNullness T t) {
        return !this.f18616OooO0Oo.apply(t);
    }

    @Override // com.google.common.base.o00O0O
    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof oo000o) {
            return this.f18616OooO0Oo.equals(((oo000o) obj).f18616OooO0Oo);
        }
        return false;
    }

    public final int hashCode() {
        return ~this.f18616OooO0Oo.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f18616OooO0Oo);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 16);
        sb.append("Predicates.not(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }
}
