package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
public abstract class o0000O<K, V> extends o0000OO0<K, V> implements ConcurrentMap<K, V> {
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    public final V putIfAbsent(K k, V v) {
        return ((o00O0OO.OooO0O0) this).f18497OoooO00.putIfAbsent(k, v);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    public final boolean remove(Object obj, Object obj2) {
        return ((o00O0OO.OooO0O0) this).f18497OoooO00.remove(obj, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    public final V replace(K k, V v) {
        return ((o00O0OO.OooO0O0) this).f18497OoooO00.replace(k, v);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    public final boolean replace(K k, V v, V v2) {
        return ((o00O0OO.OooO0O0) this).f18497OoooO00.replace(k, v, v2);
    }
}
