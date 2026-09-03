package p036OoooOOO;

import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0O00<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public int[] f3671OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public Object[] f3672OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public oo0o0Oo<T>[] f3673OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f3674OooO0Oo;

    public o0O0O00() {
        int[] iArr = new int[50];
        for (int i = 0; i < 50; i++) {
            iArr[i] = i;
        }
        this.f3671OooO00o = iArr;
        this.f3672OooO0O0 = new Object[50];
        this.f3673OooO0OO = new oo0o0Oo[50];
    }

    public static final oo0o0Oo OooO00o(o0O0O00 o0o0o00, int i) {
        oo0o0Oo<T> oo0o0oo = o0o0o00.f3673OooO0OO[o0o0o00.f3671OooO00o[i]];
        Intrinsics.checkNotNull(oo0o0oo);
        return oo0o0oo;
    }

    public final boolean OooO0O0(@NotNull Object value, @NotNull T scope) {
        int iOooO0Oo;
        oo0o0Oo<T> oo0o0oo;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(scope, "scope");
        if (this.f3674OooO0Oo > 0) {
            iOooO0Oo = OooO0Oo(value);
            if (iOooO0Oo >= 0) {
                oo0o0oo = this.f3673OooO0OO[this.f3671OooO00o[iOooO0Oo]];
                Intrinsics.checkNotNull(oo0o0oo);
            }
            return oo0o0oo.add(scope);
        }
        iOooO0Oo = -1;
        int i = -(iOooO0Oo + 1);
        int i2 = this.f3674OooO0Oo;
        int[] iArr = this.f3671OooO00o;
        if (i2 < iArr.length) {
            int i3 = iArr[i2];
            this.f3672OooO0O0[i3] = value;
            oo0o0Oo<T>[] oo0o0ooArr = this.f3673OooO0OO;
            oo0o0Oo<T> oo0o0oo2 = oo0o0ooArr[i3];
            if (oo0o0oo2 == null) {
                oo0o0oo2 = new oo0o0Oo<>();
                oo0o0ooArr[i3] = oo0o0oo2;
            }
            oo0o0oo = oo0o0oo2;
            if (i < i2) {
                ArraysKt.copyInto(iArr, iArr, i + 1, i, i2);
            }
            this.f3671OooO00o[i] = i3;
            this.f3674OooO0Oo++;
        } else {
            int length = iArr.length * 2;
            Object[] objArrCopyOf = Arrays.copyOf(this.f3673OooO0OO, length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            oo0o0Oo<T>[] oo0o0ooArr2 = (oo0o0Oo[]) objArrCopyOf;
            this.f3673OooO0OO = oo0o0ooArr2;
            oo0o0Oo<T> oo0o0oo3 = new oo0o0Oo<>();
            oo0o0ooArr2[i2] = oo0o0oo3;
            Object[] objArrCopyOf2 = Arrays.copyOf(this.f3672OooO0O0, length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(this, newSize)");
            this.f3672OooO0O0 = objArrCopyOf2;
            objArrCopyOf2[i2] = value;
            int[] iArr2 = new int[length];
            int i4 = this.f3674OooO0Oo;
            while (true) {
                i4++;
                if (i4 >= length) {
                    break;
                }
                iArr2[i4] = i4;
            }
            int i5 = this.f3674OooO0Oo;
            if (i < i5) {
                ArraysKt.copyInto(this.f3671OooO00o, iArr2, i + 1, i, i5);
            }
            iArr2[i] = i2;
            if (i > 0) {
                ArraysKt___ArraysJvmKt.copyInto$default(this.f3671OooO00o, iArr2, 0, 0, i, 6, (Object) null);
            }
            this.f3671OooO00o = iArr2;
            this.f3674OooO0Oo++;
            oo0o0oo = oo0o0oo3;
        }
        return oo0o0oo.add(scope);
    }

    public final boolean OooO0OO(@NotNull Object element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return OooO0Oo(element) >= 0;
    }

    public final int OooO0Oo(Object obj) {
        int iIdentityHashCode = System.identityHashCode(obj);
        int i = 0;
        int i2 = this.f3674OooO0Oo - 1;
        while (i <= i2) {
            int i3 = (i + i2) >>> 1;
            Object obj2 = this.f3672OooO0O0[this.f3671OooO00o[i3]];
            Intrinsics.checkNotNull(obj2);
            int iIdentityHashCode2 = System.identityHashCode(obj2);
            if (iIdentityHashCode2 < iIdentityHashCode) {
                i = i3 + 1;
            } else {
                if (iIdentityHashCode2 <= iIdentityHashCode) {
                    if (obj == obj2) {
                        return i3;
                    }
                    for (int i4 = i3 - 1; -1 < i4; i4--) {
                        Object obj3 = this.f3672OooO0O0[this.f3671OooO00o[i4]];
                        Intrinsics.checkNotNull(obj3);
                        if (obj3 == obj) {
                            return i4;
                        }
                        if (System.identityHashCode(obj3) != iIdentityHashCode) {
                            break;
                        }
                    }
                    int i5 = i3 + 1;
                    int i6 = this.f3674OooO0Oo;
                    while (i5 < i6) {
                        Object obj4 = this.f3672OooO0O0[this.f3671OooO00o[i5]];
                        Intrinsics.checkNotNull(obj4);
                        if (obj4 == obj) {
                            return i5;
                        }
                        if (System.identityHashCode(obj4) != iIdentityHashCode) {
                            return -(i5 + 1);
                        }
                        i5++;
                    }
                    i5 = this.f3674OooO0Oo;
                    return -(i5 + 1);
                }
                i2 = i3 - 1;
            }
        }
        return -(i + 1);
    }

    public final void OooO0o(@NotNull T scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        int i = this.f3674OooO0Oo;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = this.f3671OooO00o[i3];
            oo0o0Oo<T> oo0o0oo = this.f3673OooO0OO[i4];
            Intrinsics.checkNotNull(oo0o0oo);
            oo0o0oo.remove(scope);
            if (oo0o0oo.f3681Oooo0o > 0) {
                if (i2 != i3) {
                    int[] iArr = this.f3671OooO00o;
                    int i5 = iArr[i2];
                    iArr[i2] = i4;
                    iArr[i3] = i5;
                }
                i2++;
            }
        }
        int i6 = this.f3674OooO0Oo;
        for (int i7 = i2; i7 < i6; i7++) {
            this.f3672OooO0O0[this.f3671OooO00o[i7]] = null;
        }
        this.f3674OooO0Oo = i2;
    }

    public final boolean OooO0o0(@NotNull Object value, @NotNull T scope) {
        int i;
        oo0o0Oo<T> oo0o0oo;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(scope, "scope");
        int iOooO0Oo = OooO0Oo(value);
        if (iOooO0Oo < 0 || (oo0o0oo = this.f3673OooO0OO[(i = this.f3671OooO00o[iOooO0Oo])]) == null) {
            return false;
        }
        boolean zRemove = oo0o0oo.remove(scope);
        if (oo0o0oo.f3681Oooo0o == 0) {
            int i2 = iOooO0Oo + 1;
            int i3 = this.f3674OooO0Oo;
            if (i2 < i3) {
                int[] iArr = this.f3671OooO00o;
                ArraysKt.copyInto(iArr, iArr, iOooO0Oo, i2, i3);
            }
            int[] iArr2 = this.f3671OooO00o;
            int i4 = this.f3674OooO0Oo - 1;
            iArr2[i4] = i;
            this.f3672OooO0O0[i] = null;
            this.f3674OooO0Oo = i4;
        }
        return zRemove;
    }
}
