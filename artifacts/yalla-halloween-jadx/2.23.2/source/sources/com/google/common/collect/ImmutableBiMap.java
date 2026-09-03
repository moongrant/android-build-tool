package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
public abstract class ImmutableBiMap<K, V> extends ImmutableMap<K, V> {

    public static final class OooO00o<K, V> extends ImmutableMap.OooO00o<K, V> {
        @Override // com.google.common.collect.ImmutableMap.OooO00o
        public final ImmutableMap OooO0O0() {
            return this.f18692OooO0O0 == 0 ? o0O000o0.f19077OooOO0o : new o0O000o0(this.f18691OooO00o, this.f18692OooO0O0);
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
        public final void OooO0Oo(Map.Entry entry) {
            super.OooO0Oo(entry);
        }

        @Override // com.google.common.collect.ImmutableMap.OooO00o
        @CanIgnoreReturnValue
        @Beta
        public final ImmutableMap.OooO00o OooO0o0(Set set) {
            super.OooO0o0(set);
            return this;
        }
    }

    public static class OooO0O0<K, V> extends ImmutableMap.OooO0OO<K, V> {
        public OooO0O0(ImmutableBiMap<K, V> immutableBiMap) {
            super(immutableBiMap);
        }

        @Override // com.google.common.collect.ImmutableMap.OooO0OO
        public final ImmutableMap.OooO00o OooO00o(int i) {
            return new OooO00o(i);
        }
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableCollection OooO0o0() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.ImmutableMap
    /* JADX INFO: renamed from: OooOO0 */
    public final ImmutableCollection values() {
        return OooOO0O().keySet();
    }

    public abstract o0O000o0 OooOO0O();

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final Collection values() {
        return OooOO0O().keySet();
    }

    @Override // com.google.common.collect.ImmutableMap
    public Object writeReplace() {
        return new OooO0O0(this);
    }
}
