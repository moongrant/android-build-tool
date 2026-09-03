package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public interface o0OoOo0<T> {
    @CanIgnoreReturnValue
    boolean apply(@ParametricNullness T t);

    boolean equals(@CheckForNull Object obj);
}
