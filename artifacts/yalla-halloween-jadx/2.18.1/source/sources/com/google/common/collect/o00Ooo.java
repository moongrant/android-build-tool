package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(serializable = true)
public final class o00Ooo<F, T> extends o0oOO<F> implements Serializable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final o0OOOO0o.OooO<F, ? extends T> f18570Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final o0oOO<T> f18571Oooo0oO;

    public o00Ooo(o0OOOO0o.OooO oooO) {
        o0oOO<T> o0ooo2 = (o0oOO<T>) Range.OooO00o.f18371Oooo0o;
        Objects.requireNonNull(oooO);
        this.f18570Oooo0o = oooO;
        this.f18571Oooo0oO = o0ooo2;
    }

    @Override // com.google.common.collect.o0oOO, java.util.Comparator
    public final int compare(F f, F f2) {
        return this.f18571Oooo0oO.compare(this.f18570Oooo0o.apply(f), this.f18570Oooo0o.apply(f2));
    }

    @Override // java.util.Comparator
    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o00Ooo)) {
            return false;
        }
        o00Ooo o00ooo2 = (o00Ooo) obj;
        return this.f18570Oooo0o.equals(o00ooo2.f18570Oooo0o) && this.f18571Oooo0oO.equals(o00ooo2.f18571Oooo0oO);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18570Oooo0o, this.f18571Oooo0oO});
    }

    public final String toString() {
        return this.f18571Oooo0oO + ".onResultOf(" + this.f18570Oooo0o + ")";
    }
}
