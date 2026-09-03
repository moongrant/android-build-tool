package com.google.common.base;

import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Ooo implements o00O0O<Object>, Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f18610OooO0Oo = Object.class;

    @Override // com.google.common.base.o00O0O
    public final boolean apply(@CheckForNull Object obj) {
        return this.f18610OooO0Oo.equals(obj);
    }

    @Override // com.google.common.base.o00O0O
    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof o00Ooo) {
            return this.f18610OooO0Oo.equals(((o00Ooo) obj).f18610OooO0Oo);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18610OooO0Oo.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f18610OooO0Oo);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 20);
        sb.append("Predicates.equalTo(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }
}
