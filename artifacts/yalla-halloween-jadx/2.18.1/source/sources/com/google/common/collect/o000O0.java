package com.google.common.collect;

import com.facebook.internal.security.CertificateUtil;
import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(serializable = true)
public final class o000O0<T> implements Serializable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final BoundType f18444Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Comparator<? super T> f18445Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final boolean f18446Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NullableDecl
    public final T f18447Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NullableDecl
    public final T f18448OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final boolean f18449OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final BoundType f18450OoooO0O;

    /* JADX WARN: Multi-variable type inference failed */
    public o000O0(Comparator<? super T> comparator, boolean z, @NullableDecl T t, BoundType boundType, boolean z2, @NullableDecl T t2, BoundType boundType2) {
        Objects.requireNonNull(comparator);
        this.f18445Oooo0o = comparator;
        this.f18446Oooo0oO = z;
        this.f18449OoooO00 = z2;
        this.f18447Oooo0oo = t;
        Objects.requireNonNull(boundType);
        this.f18444Oooo = boundType;
        this.f18448OoooO0 = t2;
        Objects.requireNonNull(boundType2);
        this.f18450OoooO0O = boundType2;
        if (z) {
            comparator.compare(t, t);
        }
        if (z2) {
            comparator.compare(t2, t2);
        }
        if (z && z2) {
            int iCompare = comparator.compare(t, t2);
            o0OOOO0o.OooOOOO.OooO0oo(iCompare <= 0, "lowerEndpoint (%s) > upperEndpoint (%s)", t, t2);
            if (iCompare == 0) {
                BoundType boundType3 = BoundType.OPEN;
                o0OOOO0o.OooOOOO.OooO0O0((boundType != boundType3) | (boundType2 != boundType3));
            }
        }
    }

    public final boolean OooO00o(@NullableDecl T t) {
        return (OooO0Oo(t) || OooO0OO(t)) ? false : true;
    }

    public final o000O0<T> OooO0O0(o000O0<T> o000o0) {
        int iCompare;
        int iCompare2;
        T t;
        BoundType boundType;
        BoundType boundType2;
        int iCompare3;
        BoundType boundType3;
        o0OOOO0o.OooOOOO.OooO0O0(this.f18445Oooo0o.equals(o000o0.f18445Oooo0o));
        boolean z = this.f18446Oooo0oO;
        T t2 = this.f18447Oooo0oo;
        BoundType boundType4 = this.f18444Oooo;
        if (!z) {
            z = o000o0.f18446Oooo0oO;
            t2 = o000o0.f18447Oooo0oo;
            boundType4 = o000o0.f18444Oooo;
        } else if (o000o0.f18446Oooo0oO && ((iCompare = this.f18445Oooo0o.compare(t2, o000o0.f18447Oooo0oo)) < 0 || (iCompare == 0 && o000o0.f18444Oooo == BoundType.OPEN))) {
            t2 = o000o0.f18447Oooo0oo;
            boundType4 = o000o0.f18444Oooo;
        }
        boolean z2 = z;
        boolean z3 = this.f18449OoooO00;
        T t3 = this.f18448OoooO0;
        BoundType boundType5 = this.f18450OoooO0O;
        if (!z3) {
            z3 = o000o0.f18449OoooO00;
            t3 = o000o0.f18448OoooO0;
            boundType5 = o000o0.f18450OoooO0O;
        } else if (o000o0.f18449OoooO00 && ((iCompare2 = this.f18445Oooo0o.compare(t3, o000o0.f18448OoooO0)) > 0 || (iCompare2 == 0 && o000o0.f18450OoooO0O == BoundType.OPEN))) {
            t3 = o000o0.f18448OoooO0;
            boundType5 = o000o0.f18450OoooO0O;
        }
        boolean z4 = z3;
        T t4 = t3;
        if (z2 && z4 && ((iCompare3 = this.f18445Oooo0o.compare(t2, t4)) > 0 || (iCompare3 == 0 && boundType4 == (boundType3 = BoundType.OPEN) && boundType5 == boundType3))) {
            boundType = BoundType.OPEN;
            boundType2 = BoundType.CLOSED;
            t = t4;
        } else {
            t = t2;
            boundType = boundType4;
            boundType2 = boundType5;
        }
        return new o000O0<>(this.f18445Oooo0o, z2, t, boundType, z4, t4, boundType2);
    }

    public final boolean OooO0OO(@NullableDecl T t) {
        if (!this.f18449OoooO00) {
            return false;
        }
        int iCompare = this.f18445Oooo0o.compare(t, this.f18448OoooO0);
        return ((iCompare == 0) & (this.f18450OoooO0O == BoundType.OPEN)) | (iCompare > 0);
    }

    public final boolean OooO0Oo(@NullableDecl T t) {
        if (!this.f18446Oooo0oO) {
            return false;
        }
        int iCompare = this.f18445Oooo0o.compare(t, this.f18447Oooo0oo);
        return ((iCompare == 0) & (this.f18444Oooo == BoundType.OPEN)) | (iCompare < 0);
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof o000O0)) {
            return false;
        }
        o000O0 o000o0 = (o000O0) obj;
        return this.f18445Oooo0o.equals(o000o0.f18445Oooo0o) && this.f18446Oooo0oO == o000o0.f18446Oooo0oO && this.f18449OoooO00 == o000o0.f18449OoooO00 && this.f18444Oooo.equals(o000o0.f18444Oooo) && this.f18450OoooO0O.equals(o000o0.f18450OoooO0O) && o0OOOO0o.OooOOO.OooO00o(this.f18447Oooo0oo, o000o0.f18447Oooo0oo) && o0OOOO0o.OooOOO.OooO00o(this.f18448OoooO0, o000o0.f18448OoooO0);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18445Oooo0o, this.f18447Oooo0oo, this.f18444Oooo, this.f18448OoooO0, this.f18450OoooO0O});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f18445Oooo0o);
        sb.append(CertificateUtil.DELIMITER);
        BoundType boundType = this.f18444Oooo;
        BoundType boundType2 = BoundType.CLOSED;
        sb.append(boundType == boundType2 ? '[' : '(');
        sb.append(this.f18446Oooo0oO ? this.f18447Oooo0oo : "-∞");
        sb.append(',');
        sb.append(this.f18449OoooO00 ? this.f18448OoooO0 : "∞");
        sb.append(this.f18450OoooO0O == boundType2 ? ']' : ')');
        return sb.toString();
    }
}
