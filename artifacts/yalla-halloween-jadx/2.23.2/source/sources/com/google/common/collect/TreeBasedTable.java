package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
public class TreeBasedTable<R, C, V> extends o0O0o0<R, C, V> {

    public class OooO00o extends o0oOo0O0<R, C, V>.OooO0O0 implements SortedMap<C, V> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @CheckForNull
        public transient SortedMap<C, V> f18890OooO;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @CheckForNull
        public final C f18891OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @CheckForNull
        public final C f18892OooO0oo;

        public OooO00o(@CheckForNull R r, @CheckForNull C c, C c2) {
            super(r);
            this.f18891OooO0oO = c;
            this.f18892OooO0oo = c2;
            if (c == null || c2 == null) {
                return;
            }
            comparator();
            throw null;
        }

        @Override // com.google.common.collect.o0oOo0O0.OooO0O0
        @CheckForNull
        public final Map OooO0O0() {
            OooO0o();
            SortedMap<C, V> sortedMapTailMap = this.f18890OooO;
            if (sortedMapTailMap == null) {
                return null;
            }
            C c = this.f18891OooO0oO;
            if (c != null) {
                sortedMapTailMap = sortedMapTailMap.tailMap(c);
            }
            C c2 = this.f18892OooO0oo;
            return c2 != null ? sortedMapTailMap.headMap(c2) : sortedMapTailMap;
        }

        @Override // com.google.common.collect.o0oOo0O0.OooO0O0
        public final void OooO0OO() {
            OooO0o();
            SortedMap<C, V> sortedMap = this.f18890OooO;
            if (sortedMap == null || !sortedMap.isEmpty()) {
                return;
            }
            TreeBasedTable.this.f19173OooO0o.remove(this.f19179OooO0Oo);
            this.f18890OooO = null;
            this.f19181OooO0o0 = null;
        }

        public final void OooO0o() {
            SortedMap<C, V> sortedMap = this.f18890OooO;
            R r = this.f19179OooO0Oo;
            TreeBasedTable treeBasedTable = TreeBasedTable.this;
            if (sortedMap == null || (sortedMap.isEmpty() && treeBasedTable.f19173OooO0o.containsKey(r))) {
                this.f18890OooO = (SortedMap) treeBasedTable.f19173OooO0o.get(r);
            }
        }

        public final boolean OooO0o0(@CheckForNull Object obj) {
            if (obj == null) {
                return false;
            }
            if (this.f18891OooO0oO != null) {
                comparator();
                throw null;
            }
            if (this.f18892OooO0oo == null) {
                return true;
            }
            comparator();
            throw null;
        }

        @Override // java.util.SortedMap
        public final Comparator<? super C> comparator() {
            TreeBasedTable.this.getClass();
            return null;
        }

        @Override // com.google.common.collect.o0oOo0O0.OooO0O0, java.util.AbstractMap, java.util.Map
        public final boolean containsKey(@CheckForNull Object obj) {
            return OooO0o0(obj) && super.containsKey(obj);
        }

        @Override // java.util.SortedMap
        public final C firstKey() {
            OooO0Oo();
            Map<C, V> map = this.f19181OooO0o0;
            if (map != null) {
                return (C) ((SortedMap) map).firstKey();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.SortedMap
        public final SortedMap<C, V> headMap(C c) {
            c.getClass();
            com.google.common.base.o0OoOo0.OooO0Oo(OooO0o0(c));
            return new OooO00o(this.f19179OooO0Oo, this.f18891OooO0oO, c);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public final Set keySet() {
            return new oo0O.OooO(this);
        }

        @Override // java.util.SortedMap
        public final C lastKey() {
            OooO0Oo();
            Map<C, V> map = this.f19181OooO0o0;
            if (map != null) {
                return (C) ((SortedMap) map).lastKey();
            }
            throw new NoSuchElementException();
        }

        @Override // com.google.common.collect.o0oOo0O0.OooO0O0, java.util.AbstractMap, java.util.Map
        @CheckForNull
        public final V put(C c, V v) {
            c.getClass();
            com.google.common.base.o0OoOo0.OooO0Oo(OooO0o0(c));
            return (V) super.put(c, v);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        @Override // java.util.SortedMap
        public final SortedMap<C, V> subMap(C c, C c2) {
            boolean z;
            c.getClass();
            if (OooO0o0(c)) {
                c2.getClass();
                if (OooO0o0(c2)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            com.google.common.base.o0OoOo0.OooO0Oo(z);
            return new OooO00o(this.f19179OooO0Oo, c, c2);
        }

        @Override // java.util.SortedMap
        public final SortedMap<C, V> tailMap(C c) {
            c.getClass();
            com.google.common.base.o0OoOo0.OooO0Oo(OooO0o0(c));
            return new OooO00o(this.f19179OooO0Oo, c, this.f18892OooO0oo);
        }
    }

    @Override // com.google.common.collect.o0O0o0
    /* JADX INFO: renamed from: OooO */
    public final SortedMap<R, Map<C, V>> OooO0O0() {
        return super.OooO0O0();
    }

    @Override // com.google.common.collect.o0O0o0, com.google.common.collect.o0oOo0O0, com.google.common.collect.o0O
    public final Map OooO0O0() {
        return super.OooO0O0();
    }

    @Override // com.google.common.collect.o0oOo0O0
    public final Map OooO0oo(Object obj) {
        return new OooO00o(obj, null, null);
    }
}
