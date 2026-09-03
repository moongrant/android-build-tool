package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(serializable = true)
public final class o0O000o0<T> extends o0oOO<T> implements Serializable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final o0oOO<? super T> f18602Oooo0o;

    public o0O000o0(o0oOO<? super T> o0ooo2) {
        Objects.requireNonNull(o0ooo2);
        this.f18602Oooo0o = o0ooo2;
    }

    @Override // com.google.common.collect.o0oOO
    public final <S extends T> o0oOO<S> OooO0O0() {
        return this.f18602Oooo0o;
    }

    @Override // com.google.common.collect.o0oOO, java.util.Comparator
    public final int compare(T t, T t2) {
        return this.f18602Oooo0o.compare(t2, t);
    }

    @Override // java.util.Comparator
    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o0O000o0) {
            return this.f18602Oooo0o.equals(((o0O000o0) obj).f18602Oooo0o);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f18602Oooo0o.hashCode();
    }

    public final String toString() {
        return this.f18602Oooo0o + ".reverse()";
    }
}
