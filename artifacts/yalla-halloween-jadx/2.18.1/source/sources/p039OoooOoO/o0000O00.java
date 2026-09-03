package p039OoooOoO;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.PublishedApi;
import kotlin.collections.AbstractMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p037OoooOOo.o00000O;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O00<K, V> extends AbstractMap<K, V> implements o00000O<K, V> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public static final o0000O00 f3728Oooo;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public static final OooO00o f3729Oooo0oo = new OooO00o();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final o000O0O0<K, V> f3730Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final int f3731Oooo0oO;

    public static final class OooO00o {
    }

    static {
        o000O0O0.OooO00o oooO00o = o000O0O0.f3748OooO0o0;
        f3728Oooo = new o0000O00(o000O0O0.f3747OooO0o, 0);
    }

    public o0000O00(@NotNull o000O0O0<K, V> node, int i) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.f3730Oooo0o = node;
        this.f3731Oooo0oO = i;
    }

    @NotNull
    public final o0000O00<K, V> OooO00o(K k, V v) {
        o000O0O0.OooO0O0<K, V> oooO0O0OooOo0o = this.f3730Oooo0o.OooOo0o(k != null ? k.hashCode() : 0, k, v, 0);
        return oooO0O0OooOo0o == null ? this : new o0000O00<>(oooO0O0OooOo0o.f3753OooO00o, size() + oooO0O0OooOo0o.f3754OooO0O0);
    }

    @Override // p037OoooOOo.o00000O
    public final o00000O.OooO00o OooO0o() {
        return new o0000O0(this);
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f3730Oooo0o.OooO0o0(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    @Nullable
    public final V get(Object obj) {
        return this.f3730Oooo0o.OooO(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // kotlin.collections.AbstractMap
    @PublishedApi
    @NotNull
    public final Set<Map.Entry<K, V>> getEntries() {
        return new o000Oo0(this);
    }

    @Override // kotlin.collections.AbstractMap
    public final Set getKeys() {
        return new o000O00O(this);
    }

    @Override // kotlin.collections.AbstractMap
    public final int getSize() {
        return this.f3731Oooo0oO;
    }

    @Override // kotlin.collections.AbstractMap
    public final Collection getValues() {
        return new o000O0Oo(this);
    }
}
