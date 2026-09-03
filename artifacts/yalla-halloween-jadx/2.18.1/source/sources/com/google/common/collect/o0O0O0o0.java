package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
public interface o0O0O0o0<R, C, V> {

    public interface OooO00o<R, C, V> {
        @NullableDecl
        C OooO00o();

        @NullableDecl
        R OooO0O0();

        @NullableDecl
        V getValue();
    }

    Set<OooO00o<R, C, V>> OooO00o();

    Map<R, Map<C, V>> OooO0O0();

    int size();
}
