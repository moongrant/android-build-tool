package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.j2objc.annotations.Weak;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public abstract class ImmutableMultimap<K, V> extends o00Oo0<K, V> implements Serializable {

    public class OooO00o extends o0OO0<Map.Entry<K, V>> {
        public OooO00o(ImmutableMultimap immutableMultimap) {
            immutableMultimap.getClass();
            throw null;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            throw null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw null;
        }
    }

    public static class OooO0O0<K, V> extends ImmutableCollection<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Weak
        public final ImmutableMultimap<K, V> f19176OooO0o0;

        public OooO0O0(ImmutableMultimap<K, V> immutableMultimap) {
            this.f19176OooO0o0 = immutableMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* JADX INFO: renamed from: OooO0oo */
        public final o0OO0<Map.Entry<K, V>> iterator() {
            this.f19176OooO0o0.OooOO0o();
            throw null;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f19176OooO0o0.OooO0OO(entry.getKey(), entry.getValue());
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final /* bridge */ /* synthetic */ Iterator iterator() {
            iterator();
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            this.f19176OooO0o0.getClass();
            return 0;
        }
    }

    @GwtIncompatible
    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final o0O00oO0.OooO00o<ImmutableMultimap> f19177OooO00o = o0O00oO0.OooO00o(ImmutableMultimap.class, "map");

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0O00oO0.OooO00o<ImmutableMultimap> f19178OooO0O0 = o0O00oO0.OooO00o(ImmutableMultimap.class, "size");
    }

    @Override // com.google.common.collect.OooOOO
    public final /* bridge */ /* synthetic */ Iterator OooO() {
        OooOO0o();
        throw null;
    }

    @Override // com.google.common.collect.o00OO
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public /* bridge */ /* synthetic */ Collection OooO00o(@CheckForNull Object obj) {
        return OooOOO();
    }

    @Override // com.google.common.collect.OooOOO, com.google.common.collect.o00OO
    public final /* bridge */ /* synthetic */ Map OooO0O0() {
        return null;
    }

    @Override // com.google.common.collect.OooOOO
    public final boolean OooO0Oo(@CheckForNull Object obj) {
        return obj != null && super.OooO0Oo(obj);
    }

    @Override // com.google.common.collect.OooOOO
    public final Collection OooO0o() {
        return new OooO0O0(this);
    }

    @Override // com.google.common.collect.OooOOO
    public final Map<K, Collection<V>> OooO0o0() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.OooOOO
    public final Set<K> OooO0oO() {
        throw new AssertionError("unreachable");
    }

    @Override // com.google.common.collect.OooOOO
    public final Iterator OooOO0() {
        new o00O0000(this);
        throw null;
    }

    @Override // com.google.common.collect.OooOOO
    /* JADX INFO: renamed from: OooOO0O, reason: merged with bridge method [inline-methods] */
    public ImmutableCollection<Map.Entry<K, V>> OooO0oo() {
        return (ImmutableCollection) super.OooO0oo();
    }

    public final o0OO0<Map.Entry<K, V>> OooOO0o() {
        new OooO00o(this);
        throw null;
    }

    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public ImmutableCollection OooOOO() {
        throw new UnsupportedOperationException();
    }

    public abstract ImmutableCollection OooOOO0();

    @Override // com.google.common.collect.o00OO
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.o00OO
    public final boolean containsKey(@CheckForNull Object obj) {
        throw null;
    }

    @Override // com.google.common.collect.o00OO
    public /* bridge */ /* synthetic */ Collection get(Object obj) {
        return OooOOO0();
    }

    @Override // com.google.common.collect.OooOOO, com.google.common.collect.o00OO
    public final Set keySet() {
        throw null;
    }

    @Override // com.google.common.collect.OooOOO, com.google.common.collect.o00OO
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.o00OO
    public final int size() {
        return 0;
    }
}
