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
public final class ImmutableLongArray implements Serializable {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final ImmutableLongArray f19267OooO0oO = new ImmutableLongArray(new long[0], 0);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long[] f19268OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f19269OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final transient int f19270OooO0o0 = 0;

    public ImmutableLongArray(long[] jArr, int i) {
        this.f19268OooO0Oo = jArr;
        this.f19269OooO0o = i;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableLongArray)) {
            return false;
        }
        ImmutableLongArray immutableLongArray = (ImmutableLongArray) obj;
        int i = this.f19269OooO0o;
        int i2 = this.f19270OooO0o0;
        int i3 = i - i2;
        int i4 = immutableLongArray.f19269OooO0o;
        int i5 = immutableLongArray.f19270OooO0o0;
        if (i3 != i4 - i5) {
            return false;
        }
        for (int i6 = 0; i6 < i3; i6++) {
            o0OoOo0.OooO0oo(i6, i - i2);
            long j = this.f19268OooO0Oo[i2 + i6];
            o0OoOo0.OooO0oo(i6, immutableLongArray.f19269OooO0o - i5);
            if (j != immutableLongArray.f19268OooO0Oo[i5 + i6]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iOooO00o = 1;
        for (int i = this.f19270OooO0o0; i < this.f19269OooO0o; i++) {
            iOooO00o = (iOooO00o * 31) + OooO.OooO00o(this.f19268OooO0Oo[i]);
        }
        return iOooO00o;
    }

    public Object readResolve() {
        return this.f19269OooO0o == this.f19270OooO0o0 ? f19267OooO0oO : this;
    }

    public final String toString() {
        int i = this.f19269OooO0o;
        int i2 = this.f19270OooO0o0;
        if (i == i2) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder((i - i2) * 5);
        sb.append('[');
        long[] jArr = this.f19268OooO0Oo;
        sb.append(jArr[i2]);
        while (true) {
            i2++;
            if (i2 >= i) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(jArr[i2]);
        }
    }

    public Object writeReplace() {
        int i = this.f19269OooO0o;
        long[] jArr = this.f19268OooO0Oo;
        int i2 = this.f19270OooO0o0;
        if (!(i2 > 0 || i < jArr.length)) {
            return this;
        }
        long[] jArrCopyOfRange = Arrays.copyOfRange(jArr, i2, i);
        return new ImmutableLongArray(jArrCopyOfRange, jArrCopyOfRange.length);
    }
}
