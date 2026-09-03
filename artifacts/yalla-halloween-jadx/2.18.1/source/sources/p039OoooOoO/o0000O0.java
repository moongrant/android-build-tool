package p039OoooOoO;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractMutableMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p037OoooOOo.o00000O;
import p042Ooooo0o.o000O00O;
import p042Ooooo0o.o000O0O0;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O0<K, V> extends AbstractMutableMap<K, V> implements o00000O.OooO00o<K, V> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public V f3722Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public o0000O00<K, V> f3723Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public o000O0O0 f3724Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public o000O0O0<K, V> f3725Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f3726OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f3727OoooO00;

    public o0000O0(@NotNull o0000O00<K, V> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f3723Oooo0o = map;
        this.f3724Oooo0oO = new o000O0O0();
        this.f3725Oooo0oo = map.f3730Oooo0o;
        this.f3726OoooO0 = map.size();
    }

    @Override // OoooOOo.o00000O.OooO00o
    @NotNull
    /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public final o0000O00<K, V> build() {
        o000O0O0<K, V> o000o0o1 = this.f3725Oooo0oo;
        o0000O00<K, V> o0000o00 = this.f3723Oooo0o;
        if (o000o0o1 != o0000o00.f3730Oooo0o) {
            this.f3724Oooo0oO = new o000O0O0();
            o0000o00 = new o0000O00<>(this.f3725Oooo0oo, size());
        }
        this.f3723Oooo0o = o0000o00;
        return o0000o00;
    }

    public final void OooO0O0(int i) {
        this.f3726OoooO0 = i;
        this.f3727OoooO00++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        o000O0O0.OooO00o oooO00o = o000O0O0.f3748OooO0o0;
        this.f3725Oooo0oo = o000O0O0.f3747OooO0o;
        OooO0O0(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f3725Oooo0oo.OooO0o0(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public final V get(Object obj) {
        return this.f3725Oooo0oo.OooO(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // kotlin.collections.AbstractMutableMap
    @NotNull
    public final Set<Map.Entry<K, V>> getEntries() {
        return new o000OO(this);
    }

    @Override // kotlin.collections.AbstractMutableMap
    @NotNull
    public final Set<K> getKeys() {
        return new o0000OO0(this);
    }

    @Override // kotlin.collections.AbstractMutableMap
    public final int getSize() {
        return this.f3726OoooO0;
    }

    @Override // kotlin.collections.AbstractMutableMap
    @NotNull
    public final Collection<V> getValues() {
        return new o000O000(this);
    }

    @Override // kotlin.collections.AbstractMutableMap, java.util.AbstractMap, java.util.Map
    @Nullable
    public final V put(K k, V v) {
        this.f3722Oooo = null;
        this.f3725Oooo0oo = this.f3725Oooo0oo.OooOOO(k != null ? k.hashCode() : 0, k, v, 0, this);
        return this.f3722Oooo;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(@NotNull Map<? extends K, ? extends V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        o0000O00<K, V> o0000o00Build = from instanceof o0000O00 ? (o0000O00) from : null;
        if (o0000o00Build == null) {
            o0000O0 o0000o1 = from instanceof o0000O0 ? (o0000O0) from : null;
            o0000o00Build = o0000o1 != null ? o0000o1.build() : null;
        }
        if (o0000o00Build == null) {
            super.putAll(from);
            return;
        }
        o000O00O o000o00o2 = new o000O00O(0, 1, null);
        int size = size();
        this.f3725Oooo0oo = this.f3725Oooo0oo.OooOOOO(o0000o00Build.f3730Oooo0o, 0, o000o00o2, this);
        int size2 = (o0000o00Build.size() + size) - o000o00o2.f3773OooO00o;
        if (size != size2) {
            OooO0O0(size2);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public final V remove(Object obj) {
        this.f3722Oooo = null;
        o000O0O0<K, V> o000o0o0OooOOOo = this.f3725Oooo0oo.OooOOOo(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (o000o0o0OooOOOo == null) {
            o000O0O0.OooO00o oooO00o = o000O0O0.f3748OooO0o0;
            o000o0o0OooOOOo = o000O0O0.f3747OooO0o;
        }
        this.f3725Oooo0oo = o000o0o0OooOOOo;
        return this.f3722Oooo;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        o000O0O0<K, V> o000o0o0OooOOo0 = this.f3725Oooo0oo.OooOOo0(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (o000o0o0OooOOo0 == null) {
            o000O0O0.OooO00o oooO00o = o000O0O0.f3748OooO0o0;
            o000o0o0OooOOo0 = o000O0O0.f3747OooO0o;
        }
        this.f3725Oooo0oo = o000o0o0OooOOo0;
        return size != size();
    }
}
