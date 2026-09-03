package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true, serializable = true)
public abstract class ImmutableBiMap<K, V> extends ImmutableMap<K, V> {

    public static final class OooO00o<K, V> extends ImmutableMap.OooO00o<K, V> {
        public OooO00o() {
            super(4);
        }

        @Override // com.google.common.collect.ImmutableMap.OooO00o
        public final ImmutableMap OooO00o() {
            return this.f18180OooO0O0 == 0 ? o0O0o.f18626OoooOO0 : new o0O0o(this.f18179OooO00o, this.f18180OooO0O0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableMap.OooO00o
        @CanIgnoreReturnValue
        public final ImmutableMap.OooO00o OooO0OO(Object obj, Object obj2) {
            super.OooO0OO(obj, obj2);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.OooO00o
        @CanIgnoreReturnValue
        public final ImmutableMap.OooO00o OooO0Oo(Map.Entry entry) {
            super.OooO0Oo(entry);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.OooO00o
        @CanIgnoreReturnValue
        public final ImmutableMap.OooO00o OooO0o(Map map) {
            OooO0o0(map.entrySet());
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.OooO00o
        @CanIgnoreReturnValue
        @Beta
        public final ImmutableMap.OooO00o OooO0o0(Iterable iterable) {
            super.OooO0o0(iterable);
            return this;
        }
    }

    public static class OooO0O0 extends ImmutableMap.OooO0OO {
        public OooO0O0(ImmutableBiMap<?, ?> immutableBiMap) {
            super(immutableBiMap);
        }

        @Override // com.google.common.collect.ImmutableMap.OooO0OO
        public Object readResolve() {
            return OooO00o(new OooO00o());
        }
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableCollection OooO0o0() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.ImmutableMap
    /* JADX INFO: renamed from: OooOO0O */
    public final ImmutableCollection values() {
        return OooOO0o().keySet();
    }

    public abstract ImmutableBiMap<V, K> OooOO0o();

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final Collection values() {
        return OooOO0o().keySet();
    }

    @Override // com.google.common.collect.ImmutableMap
    public Object writeReplace() {
        return new OooO0O0(this);
    }
}
