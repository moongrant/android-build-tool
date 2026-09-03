package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true)
public final class o00OOOO0 {
    @CanIgnoreReturnValue
    public static Object OooO00o(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(android.support.v4.media.OooO00o.OooO00o("at index ", i));
    }

    @CanIgnoreReturnValue
    public static Object[] OooO0O0(Object... objArr) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            OooO00o(objArr[i], i);
        }
        return objArr;
    }

    @CanIgnoreReturnValue
    public static Object[] OooO0OO(Iterable<?> iterable, Object[] objArr) {
        Iterator<?> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return objArr;
    }

    public static <T> T[] OooO0Oo(T[] tArr, int i) {
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
    }

    public static <T> T[] OooO0o0(Collection<?> collection, T[] tArr) {
        int size = collection.size();
        if (tArr.length < size) {
            tArr = (T[]) OooO0Oo(tArr, size);
        }
        OooO0OO(collection, tArr);
        if (tArr.length > size) {
            tArr[size] = null;
        }
        return tArr;
    }
}
