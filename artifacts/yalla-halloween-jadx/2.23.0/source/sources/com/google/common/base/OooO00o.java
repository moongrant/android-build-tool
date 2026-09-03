package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class OooO00o<T> extends Optional<T> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO00o<Object> f19063OooO0Oo = new OooO00o<>();

    private Object readResolve() {
        return f19063OooO0Oo;
    }

    @Override // com.google.common.base.Optional
    public final T OooO00o() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.common.base.Optional
    public final boolean OooO0O0() {
        return false;
    }

    @Override // com.google.common.base.Optional
    public final T OooO0OO(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("use Optional.orNull() instead of Optional.or(null)");
    }

    public final boolean equals(@CheckForNull Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
