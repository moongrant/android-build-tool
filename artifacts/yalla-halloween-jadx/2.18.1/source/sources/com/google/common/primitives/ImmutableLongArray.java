package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.Arrays;
import o0OOOO0o.OooOOOO;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@Immutable
@Beta
@GwtCompatible
public final class ImmutableLongArray implements Serializable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final ImmutableLongArray f18727Oooo = new ImmutableLongArray(new long[0]);

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final long[] f18728Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final transient int f18729Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final int f18730Oooo0oo;

    public ImmutableLongArray(long[] jArr) {
        int length = jArr.length;
        this.f18728Oooo0o = jArr;
        this.f18729Oooo0oO = 0;
        this.f18730Oooo0oo = length;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableLongArray)) {
            return false;
        }
        ImmutableLongArray immutableLongArray = (ImmutableLongArray) obj;
        if (this.f18730Oooo0oo - this.f18729Oooo0oO != immutableLongArray.f18730Oooo0oo - immutableLongArray.f18729Oooo0oO) {
            return false;
        }
        int i = 0;
        while (true) {
            int i2 = this.f18730Oooo0oo;
            int i3 = this.f18729Oooo0oO;
            if (i >= i2 - i3) {
                return true;
            }
            OooOOOO.OooO(i, i2 - i3);
            long j = this.f18728Oooo0o[this.f18729Oooo0oO + i];
            OooOOOO.OooO(i, immutableLongArray.f18730Oooo0oo - immutableLongArray.f18729Oooo0oO);
            if (j != immutableLongArray.f18728Oooo0o[immutableLongArray.f18729Oooo0oO + i]) {
                return false;
            }
            i++;
        }
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = this.f18729Oooo0oO; i2 < this.f18730Oooo0oo; i2++) {
            long j = this.f18728Oooo0o[i2];
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    public Object readResolve() {
        return this.f18730Oooo0oo == this.f18729Oooo0oO ? f18727Oooo : this;
    }

    public final String toString() {
        int i = this.f18730Oooo0oo;
        int i2 = this.f18729Oooo0oO;
        if (i == i2) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder((i - i2) * 5);
        sb.append('[');
        sb.append(this.f18728Oooo0o[this.f18729Oooo0oO]);
        for (int i3 = this.f18729Oooo0oO + 1; i3 < this.f18730Oooo0oo; i3++) {
            sb.append(", ");
            sb.append(this.f18728Oooo0o[i3]);
        }
        sb.append(']');
        return sb.toString();
    }

    public Object writeReplace() {
        int i = this.f18729Oooo0oO;
        return i > 0 || this.f18730Oooo0oo < this.f18728Oooo0o.length ? new ImmutableLongArray(Arrays.copyOfRange(this.f18728Oooo0o, i, this.f18730Oooo0oo)) : this;
    }

    public ImmutableLongArray(long[] jArr, int i) {
        this.f18728Oooo0o = jArr;
        this.f18729Oooo0oO = 0;
        this.f18730Oooo0oo = i;
    }
}
