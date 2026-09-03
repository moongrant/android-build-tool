package com.google.common.base;

import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Ooo<T> implements o0OoOo0<T>, Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0OoOo0<T> f19087OooO0Oo;

    public o00Ooo(o00Oo0 o00oo1) {
        this.f19087OooO0Oo = o00oo1;
    }

    @Override // com.google.common.base.o0OoOo0
    public final boolean apply(@ParametricNullness T t) {
        return !this.f19087OooO0Oo.apply(t);
    }

    @Override // com.google.common.base.o0OoOo0
    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof o00Ooo) {
            return this.f19087OooO0Oo.equals(((o00Ooo) obj).f19087OooO0Oo);
        }
        return false;
    }

    public final int hashCode() {
        return ~this.f19087OooO0Oo.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f19087OooO0Oo);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 16);
        sb.append("Predicates.not(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }
}
