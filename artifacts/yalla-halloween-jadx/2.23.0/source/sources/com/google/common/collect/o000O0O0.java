package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
public class o000O0O0<K, V> extends OooOOO0<K, V> implements Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @ParametricNullness
    public final K f19435OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @ParametricNullness
    public final V f19436OooO0o0;

    public o000O0O0(@ParametricNullness K k, @ParametricNullness V v) {
        this.f19435OooO0Oo = k;
        this.f19436OooO0o0 = v;
    }

    @Override // java.util.Map.Entry
    @ParametricNullness
    public final K getKey() {
        return this.f19435OooO0Oo;
    }

    @Override // java.util.Map.Entry
    @ParametricNullness
    public final V getValue() {
        return this.f19436OooO0o0;
    }

    @Override // com.google.common.collect.OooOOO0, java.util.Map.Entry
    @ParametricNullness
    public final V setValue(@ParametricNullness V v) {
        throw new UnsupportedOperationException();
    }
}
