package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.DoNotCall;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@Beta
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class ArrayTable<R, C, V> extends o0OoOo0<R, C, V> implements Serializable {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @CheckForNull
    public transient ArrayTable<R, C, V>.OooO0OO f19102OooO0o;

    public static abstract class OooO00o<K, V> extends oo0O.OooO0OO<K, V> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final ImmutableMap<K, Integer> f19103OooO0Oo = null;

        /* JADX INFO: renamed from: com.google.common.collect.ArrayTable$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C0228OooO00o extends com.google.common.collect.OooO0OO<Map.Entry<K, V>> {
            public C0228OooO00o(int i) {
                super(i, 0);
            }

            @Override // com.google.common.collect.OooO0OO
            public final Object OooO0O0(int i) {
                OooO00o oooO00o = OooO00o.this;
                com.google.common.base.o000oOoO.OooO0oo(i, oooO00o.size());
                return new o00O0O(oooO00o, i);
            }
        }

        public OooO00o(int i) {
        }

        @Override // com.google.common.collect.oo0O.OooO0OO
        public final Iterator<Map.Entry<K, V>> OooO00o() {
            return new C0228OooO00o(size());
        }

        public final K OooO0O0(int i) {
            return this.f19103OooO0Oo.keySet().OooO00o().get(i);
        }

        public abstract String OooO0OO();

        @ParametricNullness
        public abstract V OooO0Oo(int i);

        @ParametricNullness
        public abstract Object OooO0o0(@ParametricNullness Object obj);

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(@CheckForNull Object obj) {
            return this.f19103OooO0Oo.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public final V get(@CheckForNull Object obj) {
            Integer num = this.f19103OooO0Oo.get(obj);
            if (num == null) {
                return null;
            }
            return OooO0Oo(num.intValue());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean isEmpty() {
            return this.f19103OooO0Oo.isEmpty();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Set<K> keySet() {
            return this.f19103OooO0Oo.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V put(K k, @ParametricNullness V v) {
            ImmutableMap<K, Integer> immutableMap = this.f19103OooO0Oo;
            Integer num = immutableMap.get(k);
            if (num != null) {
                num.intValue();
                return (V) OooO0o0(v);
            }
            String strOooO0OO = OooO0OO();
            String strValueOf = String.valueOf(k);
            String strValueOf2 = String.valueOf(immutableMap.keySet());
            StringBuilder sb = new StringBuilder(strValueOf2.length() + strValueOf.length() + String.valueOf(strOooO0OO).length() + 9);
            sb.append(strOooO0OO);
            sb.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
            sb.append(strValueOf);
            sb.append(" not in ");
            sb.append(strValueOf2);
            throw new IllegalArgumentException(sb.toString());
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public final V remove(@CheckForNull Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return this.f19103OooO0Oo.size();
        }
    }

    public class OooO0O0 extends OooO00o<C, V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i) {
            super(0);
            ArrayTable.this.getClass();
        }

        @Override // com.google.common.collect.ArrayTable.OooO00o
        public final String OooO0OO() {
            return "Column";
        }

        @Override // com.google.common.collect.ArrayTable.OooO00o
        @CheckForNull
        public final V OooO0Oo(int i) {
            ArrayTable.this.getClass();
            throw null;
        }

        @Override // com.google.common.collect.ArrayTable.OooO00o
        @CheckForNull
        public final Object OooO0o0(@CheckForNull Object obj) {
            ArrayTable.this.getClass();
            throw null;
        }
    }

    public class OooO0OO extends OooO00o<R, Map<C, V>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO() {
            super(0);
            ArrayTable.this.getClass();
        }

        @Override // com.google.common.collect.ArrayTable.OooO00o
        public final String OooO0OO() {
            return "Row";
        }

        @Override // com.google.common.collect.ArrayTable.OooO00o
        public final Object OooO0Oo(int i) {
            return new OooO0O0(i);
        }

        @Override // com.google.common.collect.ArrayTable.OooO00o
        public final Object OooO0o0(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ArrayTable.OooO00o, java.util.AbstractMap, java.util.Map
        @CheckForNull
        public final Object put(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.common.collect.o0OoOo0, com.google.common.collect.o0O
    public final Set<o0O.OooO00o<R, C, V>> OooO00o() {
        return super.OooO00o();
    }

    @Override // com.google.common.collect.o0O
    public final Map<R, Map<C, V>> OooO0O0() {
        ArrayTable<R, C, V>.OooO0OO oooO0OO = this.f19102OooO0o;
        if (oooO0OO != null) {
            return oooO0OO;
        }
        ArrayTable<R, C, V>.OooO0OO oooO0OO2 = new OooO0OO();
        this.f19102OooO0o = oooO0OO2;
        return oooO0OO2;
    }

    @Override // com.google.common.collect.o0OoOo0
    public final Iterator<o0O.OooO00o<R, C, V>> OooO0OO() {
        throw null;
    }

    @Override // com.google.common.collect.o0OoOo0
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void OooO0Oo() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.o0O
    public final int size() {
        throw null;
    }
}
