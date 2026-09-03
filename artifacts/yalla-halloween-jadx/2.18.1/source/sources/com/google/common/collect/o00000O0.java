package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.Immutable;
import java.lang.reflect.Array;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@Immutable(containerOf = {"R", "C", "V"})
@GwtCompatible
public final class o00000O0<R, C, V> extends o0OoOoOo<R, C, V> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final ImmutableMap<C, Integer> f18417Oooo;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final ImmutableMap<R, Integer> f18418Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final int[] f18419OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final ImmutableMap<C, ImmutableMap<R, V>> f18420OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final ImmutableMap<R, ImmutableMap<C, V>> f18421OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final int[] f18422OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final V[][] f18423OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final int[] f18424OoooOOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final int[] f18425o000oOoO;

    public final class OooO extends OooO0OO<R, ImmutableMap<C, V>> {
        public OooO() {
            super(o00000O0.this.f18422OoooO0O.length);
        }

        @Override // com.google.common.collect.ImmutableMap
        public final boolean OooO0oo() {
            return false;
        }

        @Override // com.google.common.collect.o00000O0.OooO0OO
        public final ImmutableMap<R, Integer> OooOOO() {
            return o00000O0.this.f18418Oooo0oo;
        }

        @Override // com.google.common.collect.o00000O0.OooO0OO
        public final Object OooOOO0(int i) {
            return new OooO0o(i);
        }
    }

    public final class OooO00o extends OooO0OO<R, V> {

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final int f18428OoooO00;

        public OooO00o(int i) {
            super(o00000O0.this.f18419OoooO[i]);
            this.f18428OoooO00 = i;
        }

        @Override // com.google.common.collect.ImmutableMap
        public final boolean OooO0oo() {
            return true;
        }

        @Override // com.google.common.collect.o00000O0.OooO0OO
        public final ImmutableMap<R, Integer> OooOOO() {
            return o00000O0.this.f18418Oooo0oo;
        }

        @Override // com.google.common.collect.o00000O0.OooO0OO
        public final V OooOOO0(int i) {
            return o00000O0.this.f18423OoooOO0[i][this.f18428OoooO00];
        }
    }

    public final class OooO0O0 extends OooO0OO<C, ImmutableMap<R, V>> {
        public OooO0O0() {
            super(o00000O0.this.f18419OoooO.length);
        }

        @Override // com.google.common.collect.ImmutableMap
        public final boolean OooO0oo() {
            return false;
        }

        @Override // com.google.common.collect.o00000O0.OooO0OO
        public final ImmutableMap<C, Integer> OooOOO() {
            return o00000O0.this.f18417Oooo;
        }

        @Override // com.google.common.collect.o00000O0.OooO0OO
        public final Object OooOOO0(int i) {
            return new OooO00o(i);
        }
    }

    public static abstract class OooO0OO<K, V> extends ImmutableMap.OooO0O0<K, V> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final int f18430Oooo;

        public class OooO00o extends com.google.common.collect.OooO0o<Map.Entry<K, V>> {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final int f18431Oooo;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public int f18432Oooo0oo = -1;

            public OooO00o() {
                this.f18431Oooo = OooO0OO.this.OooOOO().size();
            }

            @Override // com.google.common.collect.OooO0o
            public final Object OooO00o() {
                Object objOooOOO0;
                do {
                    int i = this.f18432Oooo0oo + 1;
                    this.f18432Oooo0oo = i;
                    if (i >= this.f18431Oooo) {
                        this.f18311Oooo0o = 3;
                        return null;
                    }
                    objOooOOO0 = OooO0OO.this.OooOOO0(i);
                } while (objOooOOO0 == null);
                OooO0OO oooO0OO = OooO0OO.this;
                return new o000OO0O(oooO0OO.OooOOO().keySet().OooO00o().get(this.f18432Oooo0oo), objOooOOO0);
            }
        }

        public OooO0OO(int i) {
            this.f18430Oooo = i;
        }

        @Override // com.google.common.collect.ImmutableMap.OooO0O0, com.google.common.collect.ImmutableMap
        public final ImmutableSet<K> OooO0Oo() {
            return this.f18430Oooo == OooOOO().size() ? OooOOO().keySet() : new o000OO00(this);
        }

        @Override // com.google.common.collect.ImmutableMap.OooO0O0
        public final o0O0o000<Map.Entry<K, V>> OooOO0o() {
            return new OooO00o();
        }

        public abstract ImmutableMap<K, Integer> OooOOO();

        @NullableDecl
        public abstract V OooOOO0(int i);

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public final V get(@NullableDecl Object obj) {
            Integer num = OooOOO().get(obj);
            if (num == null) {
                return null;
            }
            return OooOOO0(num.intValue());
        }

        @Override // java.util.Map
        public final int size() {
            return this.f18430Oooo;
        }
    }

    public final class OooO0o extends OooO0OO<C, V> {

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final int f18435OoooO00;

        public OooO0o(int i) {
            super(o00000O0.this.f18422OoooO0O[i]);
            this.f18435OoooO00 = i;
        }

        @Override // com.google.common.collect.ImmutableMap
        public final boolean OooO0oo() {
            return true;
        }

        @Override // com.google.common.collect.o00000O0.OooO0OO
        public final ImmutableMap<C, Integer> OooOOO() {
            return o00000O0.this.f18417Oooo;
        }

        @Override // com.google.common.collect.o00000O0.OooO0OO
        public final V OooOOO0(int i) {
            return o00000O0.this.f18423OoooOO0[this.f18435OoooO00][i];
        }
    }

    public o00000O0(ImmutableList<o0O0O0o0.OooO00o<R, C, V>> immutableList, ImmutableSet<R> immutableSet, ImmutableSet<C> immutableSet2) {
        this.f18423OoooOO0 = (V[][]) ((Object[][]) Array.newInstance((Class<?>) Object.class, immutableSet.size(), immutableSet2.size()));
        o0O00000 o0o00000 = (o0O00000) o00OO00O.OooO00o(immutableSet);
        this.f18418Oooo0oo = o0o00000;
        o0O00000 o0o00001 = (o0O00000) o00OO00O.OooO00o(immutableSet2);
        this.f18417Oooo = o0o00001;
        this.f18422OoooO0O = new int[o0o00000.f18581OoooO0];
        this.f18419OoooO = new int[o0o00001.f18581OoooO0];
        int[] iArr = new int[immutableList.size()];
        int[] iArr2 = new int[immutableList.size()];
        for (int i = 0; i < immutableList.size(); i++) {
            o0O0O0o0.OooO00o<R, C, V> oooO00o = immutableList.get(i);
            R rOooO0O0 = oooO00o.OooO0O0();
            C cOooO00o = oooO00o.OooO00o();
            int iIntValue = this.f18418Oooo0oo.get(rOooO0O0).intValue();
            int iIntValue2 = this.f18417Oooo.get(cOooO00o).intValue();
            OooOOOO(rOooO0O0, cOooO00o, this.f18423OoooOO0[iIntValue][iIntValue2], oooO00o.getValue());
            this.f18423OoooOO0[iIntValue][iIntValue2] = oooO00o.getValue();
            int[] iArr3 = this.f18422OoooO0O;
            iArr3[iIntValue] = iArr3[iIntValue] + 1;
            int[] iArr4 = this.f18419OoooO;
            iArr4[iIntValue2] = iArr4[iIntValue2] + 1;
            iArr[i] = iIntValue;
            iArr2[i] = iIntValue2;
        }
        this.f18425o000oOoO = iArr;
        this.f18424OoooOOO = iArr2;
        this.f18421OoooO00 = new OooO();
        this.f18420OoooO0 = new OooO0O0();
    }

    @Override // com.google.common.collect.ImmutableTable
    public final ImmutableMap<C, Map<R, V>> OooO() {
        return ImmutableMap.OooO0O0(this.f18420OoooO0);
    }

    @Override // com.google.common.collect.o0OoOo0
    public final V OooO0o0(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Integer num = this.f18418Oooo0oo.get(obj);
        Integer num2 = this.f18417Oooo.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return this.f18423OoooOO0[num.intValue()][num2.intValue()];
    }

    @Override // com.google.common.collect.ImmutableTable
    public final ImmutableTable.OooO00o OooOO0O() {
        return ImmutableTable.OooO00o.OooO00o(this, this.f18425o000oOoO, this.f18424OoooOOO);
    }

    @Override // com.google.common.collect.ImmutableTable
    /* JADX INFO: renamed from: OooOOO */
    public final ImmutableMap<R, Map<C, V>> OooO0O0() {
        return ImmutableMap.OooO0O0(this.f18421OoooO00);
    }

    @Override // com.google.common.collect.o0OoOoOo
    public final o0O0O0o0.OooO00o<R, C, V> OooOOOo(int i) {
        int i2 = this.f18425o000oOoO[i];
        int i3 = this.f18424OoooOOO[i];
        return ImmutableTable.OooO0o(OooO0O0().keySet().OooO00o().get(i2), OooO0oo().OooO00o().get(i3), this.f18423OoooOO0[i2][i3]);
    }

    @Override // com.google.common.collect.o0OoOoOo
    public final V OooOOo0(int i) {
        return this.f18423OoooOO0[this.f18425o000oOoO[i]][this.f18424OoooOOO[i]];
    }

    @Override // com.google.common.collect.o0O0O0o0
    public final int size() {
        return this.f18425o000oOoO.length;
    }
}
