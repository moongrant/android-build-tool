package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class o0O00OOO<R, C, V> extends ImmutableTable<R, C, V> {

    public final class OooO00o extends o00O00<o0O.OooO00o<R, C, V>> {
        public OooO00o() {
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean OooO0o() {
            return false;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof o0O.OooO00o)) {
                return false;
            }
            o0O.OooO00o oooO00o = (o0O.OooO00o) obj;
            V vOooO0o = o0O00OOO.this.OooO0o(oooO00o.OooO00o(), oooO00o.OooO0O0());
            return vOooO0o != null && vOooO0o.equals(oooO00o.getValue());
        }

        @Override // com.google.common.collect.o00O00
        public final Object get(int i) {
            return o0O00OOO.this.OooOOo(i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return o0O00OOO.this.size();
        }
    }

    public final class OooO0O0 extends ImmutableList<V> {
        public OooO0O0() {
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean OooO0o() {
            return true;
        }

        @Override // java.util.List
        public final V get(int i) {
            return (V) o0O00OOO.this.OooOOoo(i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return o0O00OOO.this.size();
        }
    }

    public static void OooOOo0(Object obj, Object obj2, @CheckForNull Object obj3, Object obj4) {
        if (!(obj3 == null)) {
            throw new IllegalArgumentException(com.google.common.base.oo0o0Oo.OooO00o("Duplicate key: (row=%s, column=%s), values: [%s, %s].", obj, obj2, obj4, obj3));
        }
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.o0OoOo0
    /* JADX INFO: renamed from: OooOO0O */
    public final ImmutableSet<o0O.OooO00o<R, C, V>> OooO0o0() {
        if (!(size() == 0)) {
            return new OooO00o();
        }
        int i = ImmutableSet.f19194OooO0o;
        return o0O00O0o.f19566OooOOO0;
    }

    @Override // com.google.common.collect.ImmutableTable
    /* JADX INFO: renamed from: OooOOO0 */
    public final ImmutableCollection<V> OooOOO() {
        if (!(size() == 0)) {
            return new OooO0O0();
        }
        ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f19157OooO0o0;
        return o0O00.f19536OooO0oo;
    }

    public abstract o0O.OooO00o<R, C, V> OooOOo(int i);

    public abstract V OooOOoo(int i);
}
