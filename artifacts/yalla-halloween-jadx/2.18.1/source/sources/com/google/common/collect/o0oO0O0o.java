package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
public class o0oO0O0o<R, C, V> extends o0O0oo0o<R, C, V> {

    public class OooO00o extends o0O0oo0o<R, C, V>.OooO0OO implements SortedMap<R, Map<C, V>> {
        public OooO00o() {
            super();
        }

        @Override // com.google.common.collect.o00OO00O.OooOO0O
        public final Set OooO0O0() {
            return new o00OO00O.OooO(this);
        }

        @Override // java.util.SortedMap
        public final Comparator<? super R> comparator() {
            return ((SortedMap) o0oO0O0o.this.f18633Oooo0oo).comparator();
        }

        @Override // java.util.SortedMap
        public final R firstKey() {
            return (R) ((SortedMap) o0oO0O0o.this.f18633Oooo0oo).firstKey();
        }

        @Override // java.util.SortedMap
        public final SortedMap<R, Map<C, V>> headMap(R r) {
            Objects.requireNonNull(r);
            return new o0oO0O0o(((SortedMap) o0oO0O0o.this.f18633Oooo0oo).headMap(r), o0oO0O0o.this.f18632Oooo).OooO0O0();
        }

        @Override // com.google.common.collect.o00OO00O.OooOO0O, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public final Set keySet() {
            return (SortedSet) super.keySet();
        }

        @Override // java.util.SortedMap
        public final R lastKey() {
            return (R) ((SortedMap) o0oO0O0o.this.f18633Oooo0oo).lastKey();
        }

        @Override // java.util.SortedMap
        public final SortedMap<R, Map<C, V>> subMap(R r, R r2) {
            Objects.requireNonNull(r);
            Objects.requireNonNull(r2);
            return new o0oO0O0o(((SortedMap) o0oO0O0o.this.f18633Oooo0oo).subMap(r, r2), o0oO0O0o.this.f18632Oooo).OooO0O0();
        }

        @Override // java.util.SortedMap
        public final SortedMap<R, Map<C, V>> tailMap(R r) {
            Objects.requireNonNull(r);
            return new o0oO0O0o(((SortedMap) o0oO0O0o.this.f18633Oooo0oo).tailMap(r), o0oO0O0o.this.f18632Oooo).OooO0O0();
        }
    }

    public o0oO0O0o(SortedMap<R, Map<C, V>> sortedMap, o0OOOO0o.o0OoOo0<? extends Map<C, V>> o0oooo1) {
        super(sortedMap, o0oooo1);
    }

    @Override // com.google.common.collect.o0O0oo0o, com.google.common.collect.o0O0O0o0
    /* JADX INFO: renamed from: OooO, reason: merged with bridge method [inline-methods] */
    public SortedMap<R, Map<C, V>> OooO0O0() {
        return (SortedMap) super.OooO0O0();
    }

    @Override // com.google.common.collect.o0O0oo0o
    public final Map OooO0oO() {
        return new OooO00o();
    }
}
