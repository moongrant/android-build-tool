package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.Immutable;
import java.lang.reflect.Array;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@Immutable(containerOf = {"R", "C", "V"})
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class o00000O<R, C, V> extends o0O00OOO<R, C, V> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooO0O0 f18928OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0OoO00O f18929OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o0OoO00O f18930OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooO f18931OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int[] f18932OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final int[] f18933OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final V[][] f18934OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final int[] f18935OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final int[] f18936OooOOO0;

    public final class OooO extends OooO0OO<R, ImmutableMap<C, V>> {
        public OooO() {
            super(o00000O.this.f18932OooOO0.length);
        }

        @Override // com.google.common.collect.ImmutableMap
        public final boolean OooO0oO() {
            return false;
        }

        @Override // com.google.common.collect.o00000O.OooO0OO
        public final ImmutableMap<R, Integer> OooOOO() {
            return o00000O.this.f18929OooO0o;
        }

        @Override // com.google.common.collect.o00000O.OooO0OO
        public final Object OooOOO0(int i) {
            return new OooO0o(i);
        }
    }

    public final class OooO00o extends OooO0OO<R, V> {

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final int f18939OooO0oo;

        public OooO00o(int i) {
            super(o00000O.this.f18933OooOO0O[i]);
            this.f18939OooO0oo = i;
        }

        @Override // com.google.common.collect.ImmutableMap
        public final boolean OooO0oO() {
            return true;
        }

        @Override // com.google.common.collect.o00000O.OooO0OO
        public final ImmutableMap<R, Integer> OooOOO() {
            return o00000O.this.f18929OooO0o;
        }

        @Override // com.google.common.collect.o00000O.OooO0OO
        @CheckForNull
        public final V OooOOO0(int i) {
            return o00000O.this.f18934OooOO0o[i][this.f18939OooO0oo];
        }
    }

    public final class OooO0O0 extends OooO0OO<C, ImmutableMap<R, V>> {
        public OooO0O0() {
            super(o00000O.this.f18933OooOO0O.length);
        }

        @Override // com.google.common.collect.ImmutableMap
        public final boolean OooO0oO() {
            return false;
        }

        @Override // com.google.common.collect.o00000O.OooO0OO
        public final ImmutableMap<C, Integer> OooOOO() {
            return o00000O.this.f18930OooO0oO;
        }

        @Override // com.google.common.collect.o00000O.OooO0OO
        public final Object OooOOO0(int i) {
            return new OooO00o(i);
        }
    }

    public static abstract class OooO0OO<K, V> extends ImmutableMap.OooO0O0<K, V> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final int f18941OooO0oO;

        public OooO0OO(int i) {
            this.f18941OooO0oO = i;
        }

        @Override // com.google.common.collect.ImmutableMap.OooO0O0, com.google.common.collect.ImmutableMap
        public final ImmutableSet<K> OooO0Oo() {
            return this.f18941OooO0oO == OooOOO().size() ? OooOOO().keySet() : new o000OOo0(this);
        }

        @Override // com.google.common.collect.ImmutableMap.OooO0O0
        public final o00000OO OooOO0O() {
            return new o00000OO(this);
        }

        public final K OooOO0o(int i) {
            return OooOOO().keySet().OooO00o().get(i);
        }

        public abstract ImmutableMap<K, Integer> OooOOO();

        @CheckForNull
        public abstract V OooOOO0(int i);

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        @CheckForNull
        public final V get(@CheckForNull Object obj) {
            Integer num = OooOOO().get(obj);
            if (num == null) {
                return null;
            }
            return OooOOO0(num.intValue());
        }

        @Override // java.util.Map
        public final int size() {
            return this.f18941OooO0oO;
        }
    }

    public final class OooO0o extends OooO0OO<C, V> {

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final int f18943OooO0oo;

        public OooO0o(int i) {
            super(o00000O.this.f18932OooOO0[i]);
            this.f18943OooO0oo = i;
        }

        @Override // com.google.common.collect.ImmutableMap
        public final boolean OooO0oO() {
            return true;
        }

        @Override // com.google.common.collect.o00000O.OooO0OO
        public final ImmutableMap<C, Integer> OooOOO() {
            return o00000O.this.f18930OooO0oO;
        }

        @Override // com.google.common.collect.o00000O.OooO0OO
        @CheckForNull
        public final V OooOOO0(int i) {
            return o00000O.this.f18934OooOO0o[this.f18943OooO0oo][i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o00000O(o0O00 o0o01, ImmutableSet immutableSet, ImmutableSet immutableSet2) {
        this.f18934OooOO0o = (V[][]) ((Object[][]) Array.newInstance((Class<?>) Object.class, immutableSet.size(), immutableSet2.size()));
        o0OoO00O o0ooo00oOooO00o = oo0O.OooO00o(immutableSet);
        this.f18929OooO0o = o0ooo00oOooO00o;
        o0OoO00O o0ooo00oOooO00o2 = oo0O.OooO00o(immutableSet2);
        this.f18930OooO0oO = o0ooo00oOooO00o2;
        this.f18932OooOO0 = new int[o0ooo00oOooO00o.size()];
        this.f18933OooOO0O = new int[o0ooo00oOooO00o2.size()];
        int[] iArr = new int[o0o01.size()];
        int[] iArr2 = new int[o0o01.size()];
        for (int i = 0; i < o0o01.size(); i++) {
            o0O.OooO00o oooO00o = (o0O.OooO00o) o0o01.get(i);
            Object objOooO00o = oooO00o.OooO00o();
            Object objOooO0O0 = oooO00o.OooO0O0();
            Integer num = (Integer) this.f18929OooO0o.get(objOooO00o);
            Objects.requireNonNull(num);
            int iIntValue = num.intValue();
            Integer num2 = (Integer) this.f18930OooO0oO.get(objOooO0O0);
            Objects.requireNonNull(num2);
            int iIntValue2 = num2.intValue();
            o0O00OOO.OooOOo0(objOooO00o, objOooO0O0, this.f18934OooOO0o[iIntValue][iIntValue2], oooO00o.getValue());
            ((V[][]) this.f18934OooOO0o)[iIntValue][iIntValue2] = oooO00o.getValue();
            int[] iArr3 = this.f18932OooOO0;
            iArr3[iIntValue] = iArr3[iIntValue] + 1;
            int[] iArr4 = this.f18933OooOO0O;
            iArr4[iIntValue2] = iArr4[iIntValue2] + 1;
            iArr[i] = iIntValue;
            iArr2[i] = iIntValue2;
        }
        this.f18936OooOOO0 = iArr;
        this.f18935OooOOO = iArr2;
        this.f18931OooO0oo = new OooO();
        this.f18928OooO = new OooO0O0();
    }

    @Override // com.google.common.collect.o0OoOo0
    @CheckForNull
    public final V OooO0o(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Integer num = (Integer) this.f18929OooO0o.get(obj);
        Integer num2 = (Integer) this.f18930OooO0oO.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return this.f18934OooOO0o[num.intValue()][num2.intValue()];
    }

    @Override // com.google.common.collect.ImmutableTable
    public final ImmutableMap<C, Map<R, V>> OooOO0() {
        return ImmutableMap.OooO0O0(this.f18928OooO);
    }

    @Override // com.google.common.collect.ImmutableTable
    public final ImmutableTable.OooO00o OooOO0o() {
        return ImmutableTable.OooO00o.OooO00o(this, this.f18936OooOOO0, this.f18935OooOOO);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.o0O
    /* JADX INFO: renamed from: OooOOOo */
    public final ImmutableMap<R, Map<C, V>> OooO0O0() {
        return ImmutableMap.OooO0O0(this.f18931OooO0oo);
    }

    @Override // com.google.common.collect.o0O00OOO
    public final o0O.OooO00o<R, C, V> OooOOo(int i) {
        int i2 = this.f18936OooOOO0[i];
        int i3 = this.f18935OooOOO[i];
        R r = OooOOOO().OooO00o().get(i2);
        C c = OooO().OooO00o().get(i3);
        V v = this.f18934OooOO0o[i2][i3];
        Objects.requireNonNull(v);
        return ImmutableTable.OooO0oO(r, c, v);
    }

    @Override // com.google.common.collect.o0O00OOO
    public final V OooOOoo(int i) {
        V v = this.f18934OooOO0o[this.f18936OooOOO0[i]][this.f18935OooOOO[i]];
        Objects.requireNonNull(v);
        return v;
    }

    @Override // com.google.common.collect.o0O
    public final int size() {
        return this.f18936OooOOO0.length;
    }
}
