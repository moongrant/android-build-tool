package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
public final class o0O000o0<K, V> extends ImmutableBiMap<K, V> {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final o0O000o0<Object, Object> f19553OooOO0o = new o0O000o0<>();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final transient int f19554OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @CheckForNull
    public final transient Object f19555OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @VisibleForTesting
    public final transient Object[] f19556OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final transient int f19557OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final transient o0O000o0<V, K> f19558OooOO0O;

    /* JADX WARN: Multi-variable type inference failed */
    public o0O000o0() {
        this.f19555OooO0oO = null;
        this.f19556OooO0oo = new Object[0];
        this.f19554OooO = 0;
        this.f19557OooOO0 = 0;
        this.f19558OooOO0O = this;
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet<Map.Entry<K, V>> OooO0OO() {
        return new o0OoO00O.OooO00o(this, this.f19556OooO0oo, this.f19554OooO, this.f19557OooOO0);
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet<K> OooO0Oo() {
        return new o0OoO00O.OooO0O0(this, new o0OoO00O.OooO0OO(this.f19556OooO0oo, this.f19554OooO, this.f19557OooOO0));
    }

    @Override // com.google.common.collect.ImmutableMap
    public final boolean OooO0oO() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableBiMap
    public final o0O000o0 OooOO0O() {
        return this.f19558OooOO0O;
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    @CheckForNull
    public final V get(@CheckForNull Object obj) {
        V v = (V) o0OoO00O.OooOOO0(this.f19556OooO0oo, this.f19557OooOO0, this.f19554OooO, this.f19555OooO0oO, obj);
        if (v == null) {
            return null;
        }
        return v;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f19557OooOO0;
    }

    public o0O000o0(Object[] objArr, int i) {
        this.f19556OooO0oo = objArr;
        this.f19557OooOO0 = i;
        this.f19554OooO = 0;
        int iOooO = i >= 2 ? ImmutableSet.OooO(i) : 0;
        Object objOooOO0o = o0OoO00O.OooOO0o(objArr, i, iOooO, 0);
        if (!(objOooOO0o instanceof Object[])) {
            this.f19555OooO0oO = objOooOO0o;
            Object objOooOO0o2 = o0OoO00O.OooOO0o(objArr, i, iOooO, 1);
            if (!(objOooOO0o2 instanceof Object[])) {
                this.f19558OooOO0O = new o0O000o0<>(objOooOO0o2, objArr, i, this);
                return;
            }
            throw ((ImmutableMap.OooO00o.C0229OooO00o) ((Object[]) objOooOO0o2)[2]).OooO00o();
        }
        throw ((ImmutableMap.OooO00o.C0229OooO00o) ((Object[]) objOooOO0o)[2]).OooO00o();
    }

    public o0O000o0(@CheckForNull Object obj, Object[] objArr, int i, o0O000o0<V, K> o0o000o1) {
        this.f19555OooO0oO = obj;
        this.f19556OooO0oo = objArr;
        this.f19554OooO = 1;
        this.f19557OooOO0 = i;
        this.f19558OooOO0O = o0o000o1;
    }
}
