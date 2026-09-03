package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(serializable = true)
public final class o000000<T> extends o0oOO<T> implements Serializable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Comparator<T> f18411Oooo0o;

    public o000000(Comparator<T> comparator) {
        Objects.requireNonNull(comparator);
        this.f18411Oooo0o = comparator;
    }

    @Override // com.google.common.collect.o0oOO, java.util.Comparator
    public final int compare(T t, T t2) {
        return this.f18411Oooo0o.compare(t, t2);
    }

    @Override // java.util.Comparator
    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o000000) {
            return this.f18411Oooo0o.equals(((o000000) obj).f18411Oooo0o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18411Oooo0o.hashCode();
    }

    public final String toString() {
        return this.f18411Oooo0o.toString();
    }
}
