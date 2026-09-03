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
    public final T f19437OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Comparator<? super T> f19438OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @CheckForNull
    public final T f19439OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f19440OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final BoundType f19441OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f19442OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final BoundType f19443OooOO0;

    /* JADX WARN: Multi-variable type inference failed */
    public o000O0Oo(Comparator<? super T> comparator, boolean z, @CheckForNull T t, BoundType boundType, boolean z2, @CheckForNull T t2, BoundType boundType2) {
        comparator.getClass();
        this.f19438OooO0Oo = comparator;
        this.f19440OooO0o0 = z;
        this.f19442OooO0oo = z2;
        this.f19439OooO0o = t;
        boundType.getClass();
        this.f19441OooO0oO = boundType;
        this.f19437OooO = t2;
        boundType2.getClass();
        this.f19443OooOO0 = boundType2;
        if (z) {
            comparator.compare(t, t);
        }
        if (z2) {
            comparator.compare(t2, t2);
        }
        if (z && z2) {
            int iCompare = comparator.compare(t, t2);
            boolean z3 = true;
            com.google.common.base.o000oOoO.OooO0oO(iCompare <= 0, "lowerEndpoint (%s) > upperEndpoint (%s)", t, t2);
            if (iCompare == 0) {
                BoundType boundType3 = BoundType.OPEN;
                if (boundType == boundType3 && boundType2 == boundType3) {
                    z3 = false;
                }
                com.google.common.base.o000oOoO.OooO0Oo(z3);
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
        Comparator<? super T> comparator = this.f19438OooO0Oo;
        com.google.common.base.o000oOoO.OooO0Oo(comparator.equals(o000o0oo2.f19438OooO0Oo));
        boolean z3 = o000o0oo2.f19440OooO0o0;
        BoundType boundType4 = o000o0oo2.f19441OooO0oO;
        Object obj3 = o000o0oo2.f19439OooO0o;
        boolean z4 = this.f19440OooO0o0;
        if (z4) {
            Object obj4 = this.f19439OooO0o;
            if (!z3 || ((iCompare = comparator.compare(obj4, obj3)) >= 0 && !(iCompare == 0 && boundType4 == BoundType.OPEN))) {
                boundType4 = this.f19441OooO0oO;
                z = z4;
                obj3 = obj4;
            } else {
                z = z4;
            }
        } else {
            z = z3;
        }
        boolean z5 = o000o0oo2.f19442OooO0oo;
        BoundType boundType5 = o000o0oo2.f19443OooOO0;
        Object obj5 = o000o0oo2.f19437OooO;
        boolean z6 = this.f19442OooO0oo;
        if (z6) {
            Object obj6 = this.f19437OooO;
            if (!z5 || ((iCompare2 = comparator.compare(obj6, obj5)) <= 0 && !(iCompare2 == 0 && boundType5 == BoundType.OPEN))) {
                boundType5 = this.f19443OooOO0;
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
        return new o000O0Oo<>(this.f19438OooO0Oo, z, obj2, boundType, z2, obj, boundType2);
    }

    public final boolean OooO0OO(@ParametricNullness T t) {
        if (!this.f19442OooO0oo) {
            return false;
        }
        int iCompare = this.f19438OooO0Oo.compare(t, this.f19437OooO);
        return ((iCompare == 0) & (this.f19443OooOO0 == BoundType.OPEN)) | (iCompare > 0);
    }

    public final boolean OooO0Oo(@ParametricNullness T t) {
        if (!this.f19440OooO0o0) {
            return false;
        }
        int iCompare = this.f19438OooO0Oo.compare(t, this.f19439OooO0o);
        return ((iCompare == 0) & (this.f19441OooO0oO == BoundType.OPEN)) | (iCompare < 0);
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof o000O0Oo)) {
            return false;
        }
        o000O0Oo o000o0oo2 = (o000O0Oo) obj;
        return this.f19438OooO0Oo.equals(o000o0oo2.f19438OooO0Oo) && this.f19440OooO0o0 == o000o0oo2.f19440OooO0o0 && this.f19442OooO0oo == o000o0oo2.f19442OooO0oo && this.f19441OooO0oO.equals(o000o0oo2.f19441OooO0oO) && this.f19443OooOO0.equals(o000o0oo2.f19443OooOO0) && com.google.common.base.Oooo000.OooO00o(this.f19439OooO0o, o000o0oo2.f19439OooO0o) && com.google.common.base.Oooo000.OooO00o(this.f19437OooO, o000o0oo2.f19437OooO);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19438OooO0Oo, this.f19439OooO0o, this.f19441OooO0oO, this.f19437OooO, this.f19443OooOO0});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f19438OooO0Oo);
        BoundType boundType = BoundType.CLOSED;
        char c = this.f19441OooO0oO == boundType ? '[' : '(';
        String strValueOf2 = String.valueOf(this.f19440OooO0o0 ? this.f19439OooO0o : "-∞");
        String strValueOf3 = String.valueOf(this.f19442OooO0oo ? this.f19437OooO : "∞");
        char c2 = this.f19443OooOO0 == boundType ? ']' : ')';
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
