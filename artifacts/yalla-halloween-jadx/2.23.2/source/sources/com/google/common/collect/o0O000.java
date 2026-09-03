package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class o0O000<T> implements Comparator<T> {
    @GwtCompatible(serializable = true)
    public static <T> o0O000<T> OooO00o(Comparator<T> comparator) {
        return comparator instanceof o0O000 ? (o0O000) comparator : new o000000O(comparator);
    }

    @GwtCompatible(serializable = true)
    public <S extends T> o0O000<S> OooO0O0() {
        return new o0O00o00(this);
    }
}
