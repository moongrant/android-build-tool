package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
public abstract class o000<K, V> extends o000O0o implements Map.Entry<K, V> {
    public abstract Map.Entry<K, V> OooO0O0();

    @Override // java.util.Map.Entry
    public boolean equals(@NullableDecl Object obj) {
        return OooO0O0().equals(obj);
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return OooO0O0().getKey();
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return OooO0O0().getValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return OooO0O0().hashCode();
    }

    public V setValue(V v) {
        return OooO0O0().setValue(v);
    }
}
