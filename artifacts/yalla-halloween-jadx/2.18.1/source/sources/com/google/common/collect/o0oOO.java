package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
public abstract class o0oOO<T> implements Comparator<T> {
    @GwtCompatible(serializable = true)
    public static <T> o0oOO<T> OooO00o(Comparator<T> comparator) {
        return comparator instanceof o0oOO ? (o0oOO) comparator : new o000000(comparator);
    }

    @GwtCompatible(serializable = true)
    public <S extends T> o0oOO<S> OooO0O0() {
        return new o0O000o0(this);
    }

    @Override // java.util.Comparator
    @CanIgnoreReturnValue
    public abstract int compare(@NullableDecl T t, @NullableDecl T t2);
}
