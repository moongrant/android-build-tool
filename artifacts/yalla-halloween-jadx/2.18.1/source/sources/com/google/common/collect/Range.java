package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
public final class Range<C extends Comparable> extends o0O00o0 implements o0OOOO0o.OooOo00<C> {

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static final Range<Comparable> f18368Oooo0oo = new Range<>(o00000.OooO0O0.f18410Oooo0oO, o00000.OooO00o.f18409Oooo0oO);

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final o00000<C> f18369Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final o00000<C> f18370Oooo0oO;

    public static class OooO00o extends o0oOO<Range<?>> implements Serializable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final o0oOO<Range<?>> f18371Oooo0o = new OooO00o();

        @Override // com.google.common.collect.o0oOO, java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Range range = (Range) obj;
            Range range2 = (Range) obj2;
            return o000000O.f18412OooO00o.OooO0oO(range.f18369Oooo0o.compareTo(range2.f18369Oooo0o)).OooO0O0(range.f18370Oooo0oO, range2.f18370Oooo0oO).OooO0o();
        }
    }

    public Range(o00000<C> o00000Var, o00000<C> o00000Var2) {
        Objects.requireNonNull(o00000Var);
        this.f18369Oooo0o = o00000Var;
        Objects.requireNonNull(o00000Var2);
        this.f18370Oooo0oO = o00000Var2;
        if (o00000Var.compareTo(o00000Var2) > 0 || o00000Var == o00000.OooO00o.f18409Oooo0oO || o00000Var2 == o00000.OooO0O0.f18410Oooo0oO) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Invalid range: ");
            sbOooO0o0.append(OooO00o(o00000Var, o00000Var2));
            throw new IllegalArgumentException(sbOooO0o0.toString());
        }
    }

    public static String OooO00o(o00000<?> o00000Var, o00000<?> o00000Var2) {
        StringBuilder sb = new StringBuilder(16);
        o00000Var.OooO0O0(sb);
        sb.append("..");
        o00000Var2.OooO0Oo(sb);
        return sb.toString();
    }

    @Override // o0OOOO0o.OooOo00
    @Deprecated
    public final boolean apply(Object obj) {
        Objects.requireNonNull((Comparable) obj);
        return this.f18369Oooo0o.OooO0o0() && !this.f18370Oooo0oO.OooO0o0();
    }

    @Override // o0OOOO0o.OooOo00
    public final boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof Range)) {
            return false;
        }
        Range range = (Range) obj;
        return this.f18369Oooo0o.equals(range.f18369Oooo0o) && this.f18370Oooo0oO.equals(range.f18370Oooo0oO);
    }

    public final int hashCode() {
        return this.f18370Oooo0oO.hashCode() + (this.f18369Oooo0o.hashCode() * 31);
    }

    public Object readResolve() {
        Range<Comparable> range = f18368Oooo0oo;
        return equals(range) ? range : this;
    }

    public final String toString() {
        return OooO00o(this.f18369Oooo0o, this.f18370Oooo0oO);
    }
}
