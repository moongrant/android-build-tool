package com.google.common.collect;

import com.facebook.internal.security.CertificateUtil;
import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
public final class o000O0Oo<T> implements Serializable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @CheckForNull
    public final T f18961OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Comparator<? super T> f18962OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @CheckForNull
    public final T f18963OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f18964OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final BoundType f18965OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f18966OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final BoundType f18967OooOO0;

    /* JADX WARN: Multi-variable type inference failed */
    public o000O0Oo(Comparator<? super T> comparator, boolean z, @CheckForNull T t, BoundType boundType, boolean z2, @CheckForNull T t2, BoundType boundType2) {
        comparator.getClass();
        this.f18962OooO0Oo = comparator;
        this.f18964OooO0o0 = z;
        this.f18966OooO0oo = z2;
        this.f18963OooO0o = t;
        boundType.getClass();
        this.f18965OooO0oO = boundType;
        this.f18961OooO = t2;
        boundType2.getClass();
        this.f18967OooOO0 = boundType2;
        if (z) {
            comparator.compare(t, t);
        }
        if (z2) {
            comparator.compare(t2, t2);
        }
        if (z && z2) {
            int iCompare = comparator.compare(t, t2);
            boolean z3 = true;
            com.google.common.base.o0OoOo0.OooO0oO(iCompare <= 0, "lowerEndpoint (%s) > upperEndpoint (%s)", t, t2);
            if (iCompare == 0) {
                BoundType boundType3 = BoundType.OPEN;
                if (boundType == boundType3 && boundType2 == boundType3) {
                    z3 = false;
                }
                com.google.common.base.o0OoOo0.OooO0Oo(z3);
            }
        }
    }

    public final boolean OooO00o(@ParametricNullness T t) {
        return (OooO0Oo(t) || OooO0OO(t)) ? false : true;
    }

    public final o000O0Oo<T> OooO0O0(o000O0Oo<T> o000o0oo2) {
        boolean z;
        int iCompare;
        boolean z2;
        Object obj;
        int iCompare2;
        BoundType boundType;
        Object obj2;
        BoundType boundType2;
        int iCompare3;
        BoundType boundType3;
        Comparator<? super T> comparator = this.f18962OooO0Oo;
        com.google.common.base.o0OoOo0.OooO0Oo(comparator.equals(o000o0oo2.f18962OooO0Oo));
        boolean z3 = o000o0oo2.f18964OooO0o0;
        BoundType boundType4 = o000o0oo2.f18965OooO0oO;
        Object obj3 = o000o0oo2.f18963OooO0o;
        boolean z4 = this.f18964OooO0o0;
        if (z4) {
            Object obj4 = this.f18963OooO0o;
            if (!z3 || ((iCompare = comparator.compare(obj4, obj3)) >= 0 && !(iCompare == 0 && boundType4 == BoundType.OPEN))) {
                boundType4 = this.f18965OooO0oO;
                z = z4;
                obj3 = obj4;
            } else {
                z = z4;
            }
        } else {
            z = z3;
        }
        boolean z5 = o000o0oo2.f18966OooO0oo;
        BoundType boundType5 = o000o0oo2.f18967OooOO0;
        Object obj5 = o000o0oo2.f18961OooO;
        boolean z6 = this.f18966OooO0oo;
        if (z6) {
            Object obj6 = this.f18961OooO;
            if (!z5 || ((iCompare2 = comparator.compare(obj6, obj5)) <= 0 && !(iCompare2 == 0 && boundType5 == BoundType.OPEN))) {
                boundType5 = this.f18967OooOO0;
                z2 = z6;
                obj = obj6;
            } else {
                obj = obj5;
                z2 = z6;
            }
        } else {
            obj = obj5;
            z2 = z5;
        }
        if (z && z2 && ((iCompare3 = comparator.compare(obj3, obj)) > 0 || (iCompare3 == 0 && boundType4 == (boundType3 = BoundType.OPEN) && boundType5 == boundType3))) {
            boundType = BoundType.OPEN;
            boundType2 = BoundType.CLOSED;
            obj2 = obj;
        } else {
            boundType = boundType4;
            obj2 = obj3;
            boundType2 = boundType5;
        }
        return new o000O0Oo<>(this.f18962OooO0Oo, z, obj2, boundType, z2, obj, boundType2);
    }

    public final boolean OooO0OO(@ParametricNullness T t) {
        if (!this.f18966OooO0oo) {
            return false;
        }
        int iCompare = this.f18962OooO0Oo.compare(t, this.f18961OooO);
        return ((iCompare == 0) & (this.f18967OooOO0 == BoundType.OPEN)) | (iCompare > 0);
    }

    public final boolean OooO0Oo(@ParametricNullness T t) {
        if (!this.f18964OooO0o0) {
            return false;
        }
        int iCompare = this.f18962OooO0Oo.compare(t, this.f18963OooO0o);
        return ((iCompare == 0) & (this.f18965OooO0oO == BoundType.OPEN)) | (iCompare < 0);
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof o000O0Oo)) {
            return false;
        }
        o000O0Oo o000o0oo2 = (o000O0Oo) obj;
        return this.f18962OooO0Oo.equals(o000o0oo2.f18962OooO0Oo) && this.f18964OooO0o0 == o000o0oo2.f18964OooO0o0 && this.f18966OooO0oo == o000o0oo2.f18966OooO0oo && this.f18965OooO0oO.equals(o000o0oo2.f18965OooO0oO) && this.f18967OooOO0.equals(o000o0oo2.f18967OooOO0) && com.google.common.base.Oooo0.OooO00o(this.f18963OooO0o, o000o0oo2.f18963OooO0o) && com.google.common.base.Oooo0.OooO00o(this.f18961OooO, o000o0oo2.f18961OooO);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18962OooO0Oo, this.f18963OooO0o, this.f18965OooO0oO, this.f18961OooO, this.f18967OooOO0});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f18962OooO0Oo);
        BoundType boundType = BoundType.CLOSED;
        char c = this.f18965OooO0oO == boundType ? '[' : '(';
        String strValueOf2 = String.valueOf(this.f18964OooO0o0 ? this.f18963OooO0o : "-∞");
        String strValueOf3 = String.valueOf(this.f18966OooO0oo ? this.f18961OooO : "∞");
        char c2 = this.f18967OooOO0 == boundType ? ']' : ')';
        StringBuilder sb = new StringBuilder(strValueOf3.length() + strValueOf2.length() + strValueOf.length() + 4);
        sb.append(strValueOf);
        sb.append(CertificateUtil.DELIMITER);
        sb.append(c);
        sb.append(strValueOf2);
        sb.append(',');
        sb.append(strValueOf3);
        sb.append(c2);
        return sb.toString();
    }
}
