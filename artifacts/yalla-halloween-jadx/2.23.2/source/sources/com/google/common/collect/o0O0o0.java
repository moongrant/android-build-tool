package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public class o0O0o0<R, C, V> extends o0oOo0O0<R, C, V> {

    public class OooO00o extends o0oOo0O0<R, C, V>.OooO0OO implements SortedMap<R, Map<C, V>> {
        public OooO00o() {
            super();
        }

        @Override // com.google.common.collect.oo0O.OooOO0O
        public final Set OooO0O0() {
            return new oo0O.OooO(this);
        }

        @Override // java.util.SortedMap
        @CheckForNull
        public final Comparator<? super R> comparator() {
            return ((SortedMap) o0O0o0.this.f19173OooO0o).comparator();
        }

        @Override // java.util.SortedMap
        public final R firstKey() {
            return (R) ((SortedMap) o0O0o0.this.f19173OooO0o).firstKey();
        }

        @Override // java.util.SortedMap
        public final SortedMap<R, Map<C, V>> headMap(R r) {
            r.getClass();
            o0O0o0 o0o0o0 = o0O0o0.this;
            return new o0O0o0(((SortedMap) o0o0o0.f19173OooO0o).headMap(r), o0o0o0.f19174OooO0oO).OooO0O0();
        }

        @Override // com.google.common.collect.oo0O.OooOO0O, java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            return (SortedSet) super.keySet();
        }

        @Override // java.util.SortedMap
        public final R lastKey() {
            return (R) ((SortedMap) o0O0o0.this.f19173OooO0o).lastKey();
        }

        @Override // java.util.SortedMap
        public final SortedMap<R, Map<C, V>> subMap(R r, R r2) {
            r.getClass();
            r2.getClass();
            o0O0o0 o0o0o0 = o0O0o0.this;
            return new o0O0o0(((SortedMap) o0o0o0.f19173OooO0o).subMap(r, r2), o0o0o0.f19174OooO0oO).OooO0O0();
        }

        @Override // java.util.SortedMap
        public final SortedMap<R, Map<C, V>> tailMap(R r) {
            r.getClass();
            o0O0o0 o0o0o0 = o0O0o0.this;
            return new o0O0o0(((SortedMap) o0o0o0.f19173OooO0o).tailMap(r), o0o0o0.f19174OooO0oO).OooO0O0();
        }
    }

    public o0O0o0(SortedMap<R, Map<C, V>> sortedMap, com.google.common.base.o000OOo<? extends Map<C, V>> o000ooo2) {
        super(sortedMap, o000ooo2);
    }

    @Override // com.google.common.collect.o0oOo0O0, com.google.common.collect.o0O
    /* JADX INFO: renamed from: OooO, reason: merged with bridge method [inline-methods] */
    public SortedMap<R, Map<C, V>> OooO0O0() {
        return (SortedMap) super.OooO0O0();
    }

    @Override // com.google.common.collect.o0oOo0O0
    public final Map OooO0oO() {
        return new OooO00o();
    }
}
