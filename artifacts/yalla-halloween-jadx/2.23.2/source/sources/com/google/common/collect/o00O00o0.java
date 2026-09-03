package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class o00O00o0 {
    public static <T> void OooO00o(List<T> list, com.google.common.base.o00O0O<? super T> o00o0o2, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (o00o0o2.apply(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            } else {
                list.remove(i2);
            }
        }
    }
}
