package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.ConcurrentMap;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class o0000OO0<K, V> extends o000<K, V> implements ConcurrentMap<K, V> {
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    @CheckForNull
    public final V putIfAbsent(K k, V v) {
        return ((o00O.OooO0O0) this).f19466OooO0oo.putIfAbsent(k, v);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    public final boolean remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return ((o00O.OooO0O0) this).f19466OooO0oo.remove(obj, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    @CheckForNull
    public final V replace(K k, V v) {
        return ((o00O.OooO0O0) this).f19466OooO0oo.replace(k, v);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    public final boolean replace(K k, V v, V v2) {
        return ((o00O.OooO0O0) this).f19466OooO0oo.replace(k, v, v2);
    }
}
