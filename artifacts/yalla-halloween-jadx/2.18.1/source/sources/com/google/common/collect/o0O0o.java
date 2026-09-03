package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true, serializable = true)
public final class o0O0o<K, V> extends ImmutableBiMap<K, V> {

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public static final o0O0o<Object, Object> f18626OoooOO0 = new o0O0o<>();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final transient int[] f18627Oooo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final transient o0O0o<V, K> f18628OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final transient int f18629OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @VisibleForTesting
    public final transient Object[] f18630OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final transient int f18631OoooO0O;

    /* JADX WARN: Multi-variable type inference failed */
    public o0O0o() {
        this.f18627Oooo = null;
        this.f18630OoooO00 = new Object[0];
        this.f18629OoooO0 = 0;
        this.f18631OoooO0O = 0;
        this.f18628OoooO = this;
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet<Map.Entry<K, V>> OooO0OO() {
        return new o0O00000.OooO00o(this, this.f18630OoooO00, this.f18629OoooO0, this.f18631OoooO0O);
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet<K> OooO0Oo() {
        return new o0O00000.OooO0O0(this, new o0O00000.OooO0OO(this.f18630OoooO00, this.f18629OoooO0, this.f18631OoooO0O));
    }

    @Override // com.google.common.collect.ImmutableMap
    public final boolean OooO0oo() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableBiMap
    public final ImmutableBiMap<V, K> OooOO0o() {
        return this.f18628OoooO;
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final V get(@NullableDecl Object obj) {
        return (V) o0O00000.OooOOO(this.f18627Oooo, this.f18630OoooO00, this.f18631OoooO0O, this.f18629OoooO0, obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f18631OoooO0O;
    }

    public o0O0o(Object[] objArr, int i) {
        this.f18630OoooO00 = objArr;
        this.f18631OoooO0O = i;
        this.f18629OoooO0 = 0;
        int iOooOO0 = i >= 2 ? ImmutableSet.OooOO0(i) : 0;
        this.f18627Oooo = o0O00000.OooOOO0(objArr, i, iOooOO0, 0);
        this.f18628OoooO = new o0O0o<>(o0O00000.OooOOO0(objArr, i, iOooOO0, 1), objArr, i, this);
    }

    public o0O0o(int[] iArr, Object[] objArr, int i, o0O0o<V, K> o0o0o) {
        this.f18627Oooo = iArr;
        this.f18630OoooO00 = objArr;
        this.f18629OoooO0 = 1;
        this.f18631OoooO0O = i;
        this.f18628OoooO = o0o0o;
    }
}
