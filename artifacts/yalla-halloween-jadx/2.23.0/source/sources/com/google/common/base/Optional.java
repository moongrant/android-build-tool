package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@DoNotMock("Use Optional.of(value) or Optional.absent()")
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
public abstract class Optional<T> implements Serializable {
    public abstract T OooO00o();

    public abstract boolean OooO0O0();

    public abstract T OooO0OO(T t);
}
