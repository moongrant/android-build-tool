package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.o000oOoO;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@Immutable
@Beta
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class ImmutableIntArray implements Serializable {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final ImmutableIntArray f19741OooO0oO = new ImmutableIntArray(new int[0]);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int[] f19742OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f19743OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final transient int f19744OooO0o0;

    public ImmutableIntArray(int[] iArr) {
        int length = iArr.length;
        this.f19742OooO0Oo = iArr;
        this.f19744OooO0o0 = 0;
        this.f19743OooO0o = length;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableIntArray)) {
            return false;
        }
        ImmutableIntArray immutableIntArray = (ImmutableIntArray) obj;
        int i = this.f19743OooO0o;
        int i2 = this.f19744OooO0o0;
        int i3 = i - i2;
        int i4 = immutableIntArray.f19743OooO0o;
        int i5 = immutableIntArray.f19744OooO0o0;
        if (i3 != i4 - i5) {
            return false;
        }
        for (int i6 = 0; i6 < i3; i6++) {
            o000oOoO.OooO0oo(i6, i - i2);
            int i7 = this.f19742OooO0Oo[i2 + i6];
            o000oOoO.OooO0oo(i6, immutableIntArray.f19743OooO0o - i5);
            if (i7 != immutableIntArray.f19742OooO0Oo[i5 + i6]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = this.f19744OooO0o0; i2 < this.f19743OooO0o; i2++) {
            i = (i * 31) + this.f19742OooO0Oo[i2];
        }
        return i;
    }

    public Object readResolve() {
        return this.f19743OooO0o == this.f19744OooO0o0 ? f19741OooO0oO : this;
    }

    public final String toString() {
        int i = this.f19743OooO0o;
        int i2 = this.f19744OooO0o0;
        if (i == i2) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder((i - i2) * 5);
        sb.append('[');
        int[] iArr = this.f19742OooO0Oo;
        sb.append(iArr[i2]);
        while (true) {
            i2++;
            if (i2 >= i) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i2]);
        }
    }

    public Object writeReplace() {
        int i = this.f19743OooO0o;
        int[] iArr = this.f19742OooO0Oo;
        int i2 = this.f19744OooO0o0;
        return i2 > 0 || i < iArr.length ? new ImmutableIntArray(Arrays.copyOfRange(iArr, i2, i)) : this;
    }
}
