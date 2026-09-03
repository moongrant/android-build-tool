package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class oo000o<T> extends Optional<T> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final T f19100OooO0Oo;

    public oo000o(T t) {
        this.f19100OooO0Oo = t;
    }

    @Override // com.google.common.base.Optional
    public final T OooO00o() {
        return this.f19100OooO0Oo;
    }

    @Override // com.google.common.base.Optional
    public final boolean OooO0O0() {
        return true;
    }

    @Override // com.google.common.base.Optional
    public final T OooO0OO(T t) {
        if (t != null) {
            return this.f19100OooO0Oo;
        }
        throw new NullPointerException("use Optional.orNull() instead of Optional.or(null)");
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof oo000o) {
            return this.f19100OooO0Oo.equals(((oo000o) obj).f19100OooO0Oo);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19100OooO0Oo.hashCode() + 1502476572;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f19100OooO0Oo);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }
}
