package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.Arrays;
import o0OOOO0o.OooOOOO;
import o0OOOOO.OooO0O0;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@Immutable
@Beta
@GwtCompatible
public final class ImmutableDoubleArray implements Serializable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final ImmutableDoubleArray f18719Oooo = new ImmutableDoubleArray(new double[0]);

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final double[] f18720Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final transient int f18721Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final int f18722Oooo0oo;

    public ImmutableDoubleArray(double[] dArr) {
        int length = dArr.length;
        this.f18720Oooo0o = dArr;
        this.f18721Oooo0oO = 0;
        this.f18722Oooo0oo = length;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableDoubleArray)) {
            return false;
        }
        ImmutableDoubleArray immutableDoubleArray = (ImmutableDoubleArray) obj;
        if (this.f18722Oooo0oo - this.f18721Oooo0oO != immutableDoubleArray.f18722Oooo0oo - immutableDoubleArray.f18721Oooo0oO) {
            return false;
        }
        int i = 0;
        while (true) {
            int i2 = this.f18722Oooo0oo;
            int i3 = this.f18721Oooo0oO;
            if (i >= i2 - i3) {
                return true;
            }
            OooOOOO.OooO(i, i2 - i3);
            double d = this.f18720Oooo0o[this.f18721Oooo0oO + i];
            OooOOOO.OooO(i, immutableDoubleArray.f18722Oooo0oo - immutableDoubleArray.f18721Oooo0oO);
            if (!(Double.doubleToLongBits(d) == Double.doubleToLongBits(immutableDoubleArray.f18720Oooo0o[immutableDoubleArray.f18721Oooo0oO + i]))) {
                return false;
            }
            i++;
        }
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (int i = this.f18721Oooo0oO; i < this.f18722Oooo0oo; i++) {
            double d = this.f18720Oooo0o[i];
            int i2 = OooO0O0.f38249OooO00o;
            iHashCode = (iHashCode * 31) + Double.valueOf(d).hashCode();
        }
        return iHashCode;
    }

    public Object readResolve() {
        return this.f18722Oooo0oo == this.f18721Oooo0oO ? f18719Oooo : this;
    }

    public final String toString() {
        int i = this.f18722Oooo0oo;
        int i2 = this.f18721Oooo0oO;
        if (i == i2) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder((i - i2) * 5);
        sb.append('[');
        sb.append(this.f18720Oooo0o[this.f18721Oooo0oO]);
        for (int i3 = this.f18721Oooo0oO + 1; i3 < this.f18722Oooo0oo; i3++) {
            sb.append(", ");
            sb.append(this.f18720Oooo0o[i3]);
        }
        sb.append(']');
        return sb.toString();
    }

    public Object writeReplace() {
        int i = this.f18721Oooo0oO;
        return i > 0 || this.f18722Oooo0oo < this.f18720Oooo0o.length ? new ImmutableDoubleArray(Arrays.copyOfRange(this.f18720Oooo0o, i, this.f18722Oooo0oo)) : this;
    }
}
