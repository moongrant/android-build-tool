package p039OoooOoO;

import kotlin.collections.ArraysKt;

/* JADX INFO: loaded from: classes.dex */
public final class o00 {
    public static final Object[] OooO00o(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        ArraysKt.OooO0o0(objArr, objArr2, 0, 0, i, 6);
        ArraysKt.copyInto(objArr, objArr2, i + 2, i, objArr.length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final Object[] OooO0O0(Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length - 2];
        ArraysKt.OooO0o0(objArr, objArr2, 0, 0, i, 6);
        ArraysKt.copyInto(objArr, objArr2, i, i + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] OooO0OO(Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length - 1];
        ArraysKt.OooO0o0(objArr, objArr2, 0, 0, i, 6);
        ArraysKt.copyInto(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }
}
