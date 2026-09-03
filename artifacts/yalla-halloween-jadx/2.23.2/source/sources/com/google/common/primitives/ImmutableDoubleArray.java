package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.o0OoOo0;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@Immutable
@Beta
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class ImmutableDoubleArray implements Serializable {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final ImmutableDoubleArray f19259OooO0oO = new ImmutableDoubleArray(new double[0]);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final double[] f19260OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f19261OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final transient int f19262OooO0o0;

    public ImmutableDoubleArray(double[] dArr) {
        int length = dArr.length;
        this.f19260OooO0Oo = dArr;
        this.f19262OooO0o0 = 0;
        this.f19261OooO0o = length;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableDoubleArray)) {
            return false;
        }
        ImmutableDoubleArray immutableDoubleArray = (ImmutableDoubleArray) obj;
        int i = this.f19261OooO0o;
        int i2 = this.f19262OooO0o0;
        int i3 = i - i2;
        int i4 = immutableDoubleArray.f19261OooO0o;
        int i5 = immutableDoubleArray.f19262OooO0o0;
        if (i3 != i4 - i5) {
            return false;
        }
        for (int i6 = 0; i6 < i3; i6++) {
            o0OoOo0.OooO0oo(i6, i - i2);
            double d = this.f19260OooO0Oo[i2 + i6];
            o0OoOo0.OooO0oo(i6, immutableDoubleArray.f19261OooO0o - i5);
            if (!(Double.doubleToLongBits(d) == Double.doubleToLongBits(immutableDoubleArray.f19260OooO0Oo[i5 + i6]))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (int i = this.f19262OooO0o0; i < this.f19261OooO0o; i++) {
            double d = this.f19260OooO0Oo[i];
            int i2 = OooO00o.f19271OooO00o;
            iHashCode = (iHashCode * 31) + Double.valueOf(d).hashCode();
        }
        return iHashCode;
    }

    public Object readResolve() {
        return this.f19261OooO0o == this.f19262OooO0o0 ? f19259OooO0oO : this;
    }

    public final String toString() {
        int i = this.f19261OooO0o;
        int i2 = this.f19262OooO0o0;
        if (i == i2) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder((i - i2) * 5);
        sb.append('[');
        double[] dArr = this.f19260OooO0Oo;
        sb.append(dArr[i2]);
        while (true) {
            i2++;
            if (i2 >= i) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(dArr[i2]);
        }
    }

    public Object writeReplace() {
        int i = this.f19261OooO0o;
        double[] dArr = this.f19260OooO0Oo;
        int i2 = this.f19262OooO0o0;
        return i2 > 0 || i < dArr.length ? new ImmutableDoubleArray(Arrays.copyOfRange(dArr, i2, i)) : this;
    }
}
