package p043OooooO0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0ooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f3995OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final long[] f3996OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Object[] f3997OooO0OO;

    public o0O0ooO(int i, @NotNull long[] keys, @NotNull Object[] values) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(values, "values");
        this.f3995OooO00o = i;
        this.f3996OooO0O0 = keys;
        this.f3997OooO0OO = values;
    }

    public final int OooO00o(long j) {
        int i = this.f3995OooO00o - 1;
        if (i == -1) {
            return -1;
        }
        int i2 = 0;
        if (i == 0) {
            long[] jArr = this.f3996OooO0O0;
            if (jArr[0] == j) {
                return 0;
            }
            return jArr[0] > j ? -2 : -1;
        }
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            long j2 = this.f3996OooO0O0[i3] - j;
            if (j2 < 0) {
                i2 = i3 + 1;
            } else {
                if (j2 <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    @NotNull
    public final o0O0ooO OooO0O0(long j, @Nullable Object obj) {
        int i = this.f3995OooO00o;
        Object[] objArr = this.f3997OooO0OO;
        int length = objArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            }
            if (objArr[i3] != null) {
                i4++;
            }
            i3++;
        }
        int i5 = i4 + 1;
        long[] jArr = new long[i5];
        Object[] objArr2 = new Object[i5];
        if (i5 > 1) {
            int i6 = 0;
            while (i2 < i5 && i6 < i) {
                long j2 = this.f3996OooO0O0[i6];
                Object obj2 = this.f3997OooO0OO[i6];
                if (j2 > j) {
                    jArr[i2] = j;
                    objArr2[i2] = obj;
                    i2++;
                    break;
                }
                if (obj2 != null) {
                    jArr[i2] = j2;
                    objArr2[i2] = obj2;
                    i2++;
                }
                i6++;
            }
            if (i6 == i) {
                int i7 = i5 - 1;
                jArr[i7] = j;
                objArr2[i7] = obj;
            } else {
                while (i2 < i5) {
                    long j3 = this.f3996OooO0O0[i6];
                    Object obj3 = this.f3997OooO0OO[i6];
                    if (obj3 != null) {
                        jArr[i2] = j3;
                        objArr2[i2] = obj3;
                        i2++;
                    }
                    i6++;
                }
            }
        } else {
            jArr[0] = j;
            objArr2[0] = obj;
        }
        return new o0O0ooO(i5, jArr, objArr2);
    }
}
