package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true)
public final class o00O0OO0 {
    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> OooO00o(int i) {
        oo000o.OooO0O0(i, "arraySize");
        return new ArrayList<>(o0OOOOO.OooO0OO.OooO00o(((long) i) + 5 + ((long) (i / 10))));
    }
}
