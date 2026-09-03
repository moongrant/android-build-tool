package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@Beta
@GwtCompatible(emulated = true)
public final class ArrayTable<R, C, V> extends o0OoOo0<R, C, V> implements Serializable {

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @MonotonicNonNullDecl
    public transient ArrayTable<R, C, V>.OooO0OO f18115Oooo0oo;

    public static abstract class OooO00o<K, V> extends o00OO00O.OooO0OO<K, V> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final ImmutableMap<K, Integer> f18116Oooo0o = null;

        /* JADX INFO: renamed from: com.google.common.collect.ArrayTable$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C0117OooO00o extends com.google.common.collect.OooO0OO<Map.Entry<K, V>> {
            public C0117OooO00o(int i) {
                super(i, 0);
            }

            @Override // com.google.common.collect.OooO0OO
            public final Object OooO00o(int i) {
                OooO00o oooO00o = OooO00o.this;
                o0OOOO0o.OooOOOO.OooO(i, oooO00o.size());
                return new o00O0O(oooO00o, i);
            }
        }

        @Override // com.google.common.collect.o00OO00O.OooO0OO
        public final Iterator<Map.Entry<K, V>> OooO00o() {
            return new C0117OooO00o(size());
        }

        public abstract String OooO0O0();

        @NullableDecl
        public abstract V OooO0OO(int i);

        @NullableDecl
        public abstract Object OooO0Oo(Object obj);

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(@NullableDecl Object obj) {
            return this.f18116Oooo0o.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final V get(@NullableDecl Object obj) {
            Integer num = this.f18116Oooo0o.get(obj);
            if (num == null) {
                return null;
            }
            return OooO0OO(num.intValue());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean isEmpty() {
            return this.f18116Oooo0o.isEmpty();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Set<K> keySet() {
            return this.f18116Oooo0o.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k, V v) {
            Integer num = this.f18116Oooo0o.get(k);
            if (num != null) {
                num.intValue();
                return (V) OooO0Oo(v);
            }
            throw new IllegalArgumentException(OooO0O0() + ZegoConstants.ZegoVideoDataAuxPublishingStream + k + " not in " + this.f18116Oooo0o.keySet());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final V remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return this.f18116Oooo0o.size();
        }
    }

    public class OooO0O0 extends OooO00o<C, V> {
        public OooO0O0(int i) {
            Objects.requireNonNull(ArrayTable.this);
        }

        @Override // com.google.common.collect.ArrayTable.OooO00o
        public final String OooO0O0() {
            return "Column";
        }

        @Override // com.google.common.collect.ArrayTable.OooO00o
        public final V OooO0OO(int i) {
            Objects.requireNonNull(ArrayTable.this);
            throw null;
        }

        @Override // com.google.common.collect.ArrayTable.OooO00o
        public final Object OooO0Oo(Object obj) {
            Objects.requireNonNull(ArrayTable.this);
            throw null;
        }
    }

    public class OooO0OO extends OooO00o<R, Map<C, V>> {
        public OooO0OO() {
            Objects.requireNonNull(ArrayTable.this);
        }

        @Override // com.google.common.collect.ArrayTable.OooO00o
        public final String OooO0O0() {
            return "Row";
        }

        @Override // com.google.common.collect.ArrayTable.OooO00o
        public final Object OooO0OO(int i) {
            return new OooO0O0(i);
        }

        @Override // com.google.common.collect.ArrayTable.OooO00o
        public final Object OooO0Oo(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ArrayTable.OooO00o, java.util.AbstractMap, java.util.Map
        public final Object put(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.common.collect.o0OoOo0, com.google.common.collect.o0O0O0o0
    public final Set<o0O0O0o0.OooO00o<R, C, V>> OooO00o() {
        return super.OooO00o();
    }

    @Override // com.google.common.collect.o0O0O0o0
    public final Map<R, Map<C, V>> OooO0O0() {
        ArrayTable<R, C, V>.OooO0OO oooO0OO = this.f18115Oooo0oo;
        if (oooO0OO != null) {
            return oooO0OO;
        }
        ArrayTable<R, C, V>.OooO0OO oooO0OO2 = new OooO0OO();
        this.f18115Oooo0oo = oooO0OO2;
        return oooO0OO2;
    }

    @Override // com.google.common.collect.o0OoOo0
    public final Iterator<o0O0O0o0.OooO00o<R, C, V>> OooO0OO() {
        throw null;
    }

    @Override // com.google.common.collect.o0OoOo0
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.o0O0O0o0
    public final int size() {
        throw null;
    }
}
