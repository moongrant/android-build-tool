package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true)
public abstract class ImmutableMultimap<K, V> extends o00Oo0<K, V> implements Serializable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final transient ImmutableMap<K, ? extends ImmutableCollection<V>> f18184Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final transient int f18185OoooO00;

    public static class OooO00o<K, V> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Map<K, Collection<V>> f18186OooO00o = new o0OO00O();
    }

    @GwtIncompatible
    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final o0O00.OooO00o<ImmutableMultimap> f18187OooO00o = o0O00.OooO00o(ImmutableMultimap.class, "map");

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0O00.OooO00o<ImmutableMultimap> f18188OooO0O0 = o0O00.OooO00o(ImmutableMultimap.class, "size");
    }

    public ImmutableMultimap(ImmutableMap<K, ? extends ImmutableCollection<V>> immutableMap, int i) {
        this.f18184Oooo = immutableMap;
        this.f18185OoooO00 = i;
    }

    @Override // com.google.common.collect.o00OO0O0
    @CanIgnoreReturnValue
    @Deprecated
    public /* bridge */ /* synthetic */ Collection OooO00o(Object obj) {
        return OooO0oo();
    }

    @Override // com.google.common.collect.OooOOO, com.google.common.collect.o00OO0O0
    public final Map OooO0O0() {
        return this.f18184Oooo;
    }

    @Override // com.google.common.collect.OooOOO
    public final Map<K, Collection<V>> OooO0Oo() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.OooOOO
    public final Iterator OooO0o() {
        return new o00(this);
    }

    @Override // com.google.common.collect.OooOOO
    public final Set<K> OooO0o0() {
        throw new AssertionError("unreachable");
    }

    @Override // com.google.common.collect.o00OO0O0
    /* JADX INFO: renamed from: OooO0oO, reason: merged with bridge method [inline-methods] */
    public abstract ImmutableCollection<V> get(K k);

    @CanIgnoreReturnValue
    @Deprecated
    public ImmutableCollection OooO0oo() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.o00OO0O0
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.o00OO0O0
    public final boolean containsKey(@NullableDecl Object obj) {
        return this.f18184Oooo.containsKey(obj);
    }

    @Override // com.google.common.collect.OooOOO, com.google.common.collect.o00OO0O0
    public final Set keySet() {
        return this.f18184Oooo.keySet();
    }

    @Override // com.google.common.collect.OooOOO, com.google.common.collect.o00OO0O0
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.o00OO0O0
    public final int size() {
        return this.f18185OoooO00;
    }
}
