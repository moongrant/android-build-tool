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
public final class ImmutableIntArray implements Serializable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final ImmutableIntArray f18723Oooo = new ImmutableIntArray(new int[0]);

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final int[] f18724Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final transient int f18725Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final int f18726Oooo0oo;

    public ImmutableIntArray(int[] iArr) {
        int length = iArr.length;
        this.f18724Oooo0o = iArr;
        this.f18725Oooo0oO = 0;
        this.f18726Oooo0oo = length;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableIntArray)) {
            return false;
        }
        ImmutableIntArray immutableIntArray = (ImmutableIntArray) obj;
        if (this.f18726Oooo0oo - this.f18725Oooo0oO != immutableIntArray.f18726Oooo0oo - immutableIntArray.f18725Oooo0oO) {
            return false;
        }
        int i = 0;
        while (true) {
            int i2 = this.f18726Oooo0oo;
            int i3 = this.f18725Oooo0oO;
            if (i >= i2 - i3) {
                return true;
            }
            OooOOOO.OooO(i, i2 - i3);
            int i4 = this.f18724Oooo0o[this.f18725Oooo0oO + i];
            OooOOOO.OooO(i, immutableIntArray.f18726Oooo0oo - immutableIntArray.f18725Oooo0oO);
            if (i4 != immutableIntArray.f18724Oooo0o[immutableIntArray.f18725Oooo0oO + i]) {
                return false;
            }
            i++;
        }
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = this.f18725Oooo0oO; i2 < this.f18726Oooo0oo; i2++) {
            i = (i * 31) + this.f18724Oooo0o[i2];
        }
        return i;
    }

    public Object readResolve() {
        return this.f18726Oooo0oo == this.f18725Oooo0oO ? f18723Oooo : this;
    }

    public final String toString() {
        int i = this.f18726Oooo0oo;
        int i2 = this.f18725Oooo0oO;
        if (i == i2) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder((i - i2) * 5);
        sb.append('[');
        sb.append(this.f18724Oooo0o[this.f18725Oooo0oO]);
        for (int i3 = this.f18725Oooo0oO + 1; i3 < this.f18726Oooo0oo; i3++) {
            sb.append(", ");
            sb.append(this.f18724Oooo0o[i3]);
        }
        sb.append(']');
        return sb.toString();
    }

    public Object writeReplace() {
        int i = this.f18725Oooo0oO;
        return i > 0 || this.f18726Oooo0oo < this.f18724Oooo0o.length ? new ImmutableIntArray(Arrays.copyOfRange(this.f18724Oooo0o, i, this.f18726Oooo0oo)) : this;
    }
}
