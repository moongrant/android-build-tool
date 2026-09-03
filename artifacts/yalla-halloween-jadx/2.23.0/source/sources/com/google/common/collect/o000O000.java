package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class o000O000<K, V> extends o000Oo0 implements Map.Entry<K, V> {
    public abstract Map.Entry<K, V> OooO0O0();

    @Override // java.util.Map.Entry
    public boolean equals(@CheckForNull Object obj) {
        return OooO0O0().equals(obj);
    }

    @Override // java.util.Map.Entry
    @ParametricNullness
    public final K getKey() {
        return OooO0O0().getKey();
    }

    @Override // java.util.Map.Entry
    @ParametricNullness
    public final V getValue() {
        return OooO0O0().getValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return OooO0O0().hashCode();
    }

    @ParametricNullness
    public V setValue(@ParametricNullness V v) {
        return OooO0O0().setValue(v);
    }
}
