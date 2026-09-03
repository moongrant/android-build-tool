package p036OoooOOO;

import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0OO00O<Key, Value> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public Object[] f3675OooO00o = new Object[16];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public Object[] f3676OooO0O0 = new Object[16];

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f3677OooO0OO;

    public final int OooO00o(Object obj) {
        int iIdentityHashCode = System.identityHashCode(obj);
        int i = 0;
        int i2 = this.f3677OooO0OO - 1;
        while (i <= i2) {
            int i3 = (i + i2) >>> 1;
            Object obj2 = this.f3675OooO00o[i3];
            int iIdentityHashCode2 = System.identityHashCode(obj2);
            if (iIdentityHashCode2 < iIdentityHashCode) {
                i = i3 + 1;
            } else {
                if (iIdentityHashCode2 <= iIdentityHashCode) {
                    if (obj == obj2) {
                        return i3;
                    }
                    for (int i4 = i3 - 1; -1 < i4; i4--) {
                        Object obj3 = this.f3675OooO00o[i4];
                        if (obj3 == obj) {
                            return i4;
                        }
                        if (System.identityHashCode(obj3) != iIdentityHashCode) {
                            break;
                        }
                    }
                    int i5 = i3 + 1;
                    int i6 = this.f3677OooO0OO;
                    while (i5 < i6) {
                        Object obj4 = this.f3675OooO00o[i5];
                        if (obj4 == obj) {
                            return i5;
                        }
                        if (System.identityHashCode(obj4) != iIdentityHashCode) {
                            return -(i5 + 1);
                        }
                        i5++;
                    }
                    i5 = this.f3677OooO0OO;
                    return -(i5 + 1);
                }
                i2 = i3 - 1;
            }
        }
        return -(i + 1);
    }

    public final void OooO0O0(@NotNull Key key, Value value) {
        Intrinsics.checkNotNullParameter(key, "key");
        int iOooO00o = OooO00o(key);
        if (iOooO00o >= 0) {
            this.f3676OooO0O0[iOooO00o] = value;
            return;
        }
        int i = -(iOooO00o + 1);
        int i2 = this.f3677OooO0OO;
        Object[] objArr = this.f3675OooO00o;
        boolean z = i2 == objArr.length;
        Object[] objArr2 = z ? new Object[i2 * 2] : objArr;
        int i3 = i + 1;
        ArraysKt.copyInto(objArr, objArr2, i3, i, i2);
        if (z) {
            ArraysKt.OooO0o0(this.f3675OooO00o, objArr2, 0, 0, i, 6);
        }
        objArr2[i] = key;
        this.f3675OooO00o = objArr2;
        Object[] objArr3 = z ? new Object[this.f3677OooO0OO * 2] : this.f3676OooO0O0;
        ArraysKt.copyInto(this.f3676OooO0O0, objArr3, i3, i, this.f3677OooO0OO);
        if (z) {
            ArraysKt.OooO0o0(this.f3676OooO0O0, objArr3, 0, 0, i, 6);
        }
        objArr3[i] = value;
        this.f3676OooO0O0 = objArr3;
        this.f3677OooO0OO++;
    }
}
