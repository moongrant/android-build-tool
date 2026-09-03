package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(serializable = true)
public class TreeBasedTable<R, C, V> extends o0oO0O0o<R, C, V> {

    public class OooO00o extends o0O0oo0o<R, C, V>.OooO0O0 implements SortedMap<C, V> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        @NullableDecl
        public final C f18372Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        @NullableDecl
        public transient SortedMap<C, V> f18373OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        @NullableDecl
        public final C f18374OoooO00;

        public OooO00o(@NullableDecl R r, @NullableDecl C c, C c2) {
            super(r);
            this.f18372Oooo = c;
            this.f18374OoooO00 = c2;
            if (c == null || c2 == null) {
                return;
            }
            comparator();
            throw null;
        }

        @Override // com.google.common.collect.o0O0oo0o.OooO0O0
        public final Map OooO0OO() {
            SortedMap<C, V> sortedMapOooO0oo = OooO0oo();
            if (sortedMapOooO0oo == null) {
                return null;
            }
            C c = this.f18372Oooo;
            if (c != null) {
                sortedMapOooO0oo = sortedMapOooO0oo.tailMap(c);
            }
            C c2 = this.f18374OoooO00;
            return c2 != null ? sortedMapOooO0oo.headMap(c2) : sortedMapOooO0oo;
        }

        @Override // com.google.common.collect.o0O0oo0o.OooO0O0
        public final void OooO0Oo() {
            if (OooO0oo() == null || !this.f18373OoooO0.isEmpty()) {
                return;
            }
            TreeBasedTable.this.f18633Oooo0oo.remove(this.f18638Oooo0o);
            this.f18373OoooO0 = null;
            this.f18639Oooo0oO = null;
        }

        @Override // com.google.common.collect.o0O0oo0o.OooO0O0
        /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
        public final SortedMap<C, V> OooO0O0() {
            return (SortedMap) super.OooO0O0();
        }

        public final boolean OooO0oO(@NullableDecl Object obj) {
            if (obj == null) {
                return false;
            }
            if (this.f18372Oooo != null) {
                comparator();
                throw null;
            }
            if (this.f18374OoooO00 == null) {
                return true;
            }
            comparator();
            throw null;
        }

        public final SortedMap<C, V> OooO0oo() {
            SortedMap<C, V> sortedMap = this.f18373OoooO0;
            if (sortedMap == null || (sortedMap.isEmpty() && TreeBasedTable.this.f18633Oooo0oo.containsKey(this.f18638Oooo0o))) {
                this.f18373OoooO0 = (SortedMap) TreeBasedTable.this.f18633Oooo0oo.get(this.f18638Oooo0o);
            }
            return this.f18373OoooO0;
        }

        @Override // java.util.SortedMap
        public final Comparator<? super C> comparator() {
            Objects.requireNonNull(TreeBasedTable.this);
            return null;
        }

        @Override // com.google.common.collect.o0O0oo0o.OooO0O0, java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            return OooO0oO(obj) && super.containsKey(obj);
        }

        @Override // java.util.SortedMap
        public final C firstKey() {
            if (OooO0O0() != null) {
                return OooO0O0().firstKey();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.SortedMap
        public final SortedMap<C, V> headMap(C c) {
            Objects.requireNonNull(c);
            o0OOOO0o.OooOOOO.OooO0O0(OooO0oO(c));
            return new OooO00o(this.f18638Oooo0o, this.f18372Oooo, c);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public final Set keySet() {
            return new o00OO00O.OooO(this);
        }

        @Override // java.util.SortedMap
        public final C lastKey() {
            if (OooO0O0() != null) {
                return OooO0O0().lastKey();
            }
            throw new NoSuchElementException();
        }

        @Override // com.google.common.collect.o0O0oo0o.OooO0O0, java.util.AbstractMap, java.util.Map
        public final V put(C c, V v) {
            Objects.requireNonNull(c);
            o0OOOO0o.OooOOOO.OooO0O0(OooO0oO(c));
            return (V) super.put(c, v);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        @Override // java.util.SortedMap
        public final SortedMap<C, V> subMap(C c, C c2) {
            boolean z;
            Objects.requireNonNull(c);
            if (OooO0oO(c)) {
                Objects.requireNonNull(c2);
                if (OooO0oO(c2)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            o0OOOO0o.OooOOOO.OooO0O0(z);
            return new OooO00o(this.f18638Oooo0o, c, c2);
        }

        @Override // java.util.SortedMap
        public final SortedMap<C, V> tailMap(C c) {
            Objects.requireNonNull(c);
            o0OOOO0o.OooOOOO.OooO0O0(OooO0oO(c));
            return new OooO00o(this.f18638Oooo0o, c, this.f18374OoooO00);
        }
    }

    @Override // com.google.common.collect.o0oO0O0o
    /* JADX INFO: renamed from: OooO */
    public final SortedMap<R, Map<C, V>> OooO0O0() {
        return super.OooO0O0();
    }

    @Override // com.google.common.collect.o0oO0O0o, com.google.common.collect.o0O0oo0o, com.google.common.collect.o0O0O0o0
    public final Map OooO0O0() {
        return super.OooO0O0();
    }

    @Override // com.google.common.collect.o0O0oo0o
    public final Map OooO0oo(Object obj) {
        return new OooO00o(obj, null, null);
    }
}
