package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
@DoNotMock("Use ImmutableTable, HashBasedTable, or another implementation")
@ElementTypesAreNonnullByDefault
public interface o0O<R, C, V> {

    public interface OooO00o<R, C, V> {
        @ParametricNullness
        R OooO00o();

        @ParametricNullness
        C OooO0O0();

        @ParametricNullness
        V getValue();
    }

    Set<OooO00o<R, C, V>> OooO00o();

    Map<R, Map<C, V>> OooO0O0();

    int size();
}
