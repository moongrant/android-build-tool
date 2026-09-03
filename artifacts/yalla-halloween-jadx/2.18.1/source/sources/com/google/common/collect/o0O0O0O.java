package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.Immutable;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@Immutable(containerOf = {"R", "C", "V"})
@GwtCompatible
public final class o0O0O0O<R, C, V> extends o0OoOoOo<R, C, V> {

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static final ImmutableTable<Object, Object, Object> f18616OoooO0O;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final ImmutableMap<C, ImmutableMap<R, V>> f18617Oooo;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final ImmutableMap<R, ImmutableMap<C, V>> f18618Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final int[] f18619OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final int[] f18620OoooO00;

    static {
        OooO0OO oooO0OO = ImmutableList.f18169Oooo0oO;
        ImmutableList<Object> immutableList = o0.f18399OoooO00;
        int i = ImmutableSet.f18204Oooo0oo;
        o0O0000O<Object> o0o0000o2 = o0O0000O.f18593OoooOO0;
        f18616OoooO0O = new o0O0O0O(immutableList, o0o0000o2, o0o0000o2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o0O0O0O(ImmutableList<o0O0O0o0.OooO00o<R, C, V>> immutableList, ImmutableSet<R> immutableSet, ImmutableSet<C> immutableSet2) {
        ImmutableMap immutableMapOooO00o = o00OO00O.OooO00o(immutableSet);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        o0O0o000<R> it = immutableSet.iterator();
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), new LinkedHashMap());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        o0O0o000<C> it2 = immutableSet2.iterator();
        while (it2.hasNext()) {
            linkedHashMap2.put(it2.next(), new LinkedHashMap());
        }
        int[] iArr = new int[immutableList.size()];
        int[] iArr2 = new int[immutableList.size()];
        int i = 0;
        for (int i2 = 0; i2 < immutableList.size(); i2++) {
            o0O0O0o0.OooO00o<R, C, V> oooO00o = immutableList.get(i2);
            R rOooO0O0 = oooO00o.OooO0O0();
            C cOooO00o = oooO00o.OooO00o();
            V value = oooO00o.getValue();
            iArr[i2] = ((Integer) ((o0O00000) immutableMapOooO00o).get(rOooO0O0)).intValue();
            Map map = (Map) linkedHashMap.get(rOooO0O0);
            iArr2[i2] = map.size();
            OooOOOO(rOooO0O0, cOooO00o, map.put(cOooO00o, value), value);
            ((Map) linkedHashMap2.get(cOooO00o)).put(rOooO0O0, value);
        }
        this.f18620OoooO00 = iArr;
        this.f18619OoooO0 = iArr2;
        Object[] objArrCopyOf = new Object[linkedHashMap.size() * 2];
        int i3 = 0;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            ImmutableMap immutableMapOooO0O0 = ImmutableMap.OooO0O0((Map) entry.getValue());
            int i4 = i3 + 1;
            int i5 = i4 * 2;
            if (i5 > objArrCopyOf.length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, ImmutableCollection.OooO0O0.OooO00o(objArrCopyOf.length, i5));
            }
            oo000o.OooO00o(key, immutableMapOooO0O0);
            int i6 = i3 * 2;
            objArrCopyOf[i6] = key;
            objArrCopyOf[i6 + 1] = immutableMapOooO0O0;
            i3 = i4;
        }
        this.f18618Oooo0oo = o0O00000.OooOO0o(i3, objArrCopyOf);
        Object[] objArrCopyOf2 = new Object[linkedHashMap2.size() * 2];
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            Object key2 = entry2.getKey();
            ImmutableMap immutableMapOooO0O1 = ImmutableMap.OooO0O0((Map) entry2.getValue());
            int i7 = i + 1;
            int i8 = i7 * 2;
            if (i8 > objArrCopyOf2.length) {
                objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, ImmutableCollection.OooO0O0.OooO00o(objArrCopyOf2.length, i8));
            }
            oo000o.OooO00o(key2, immutableMapOooO0O1);
            int i9 = i * 2;
            objArrCopyOf2[i9] = key2;
            objArrCopyOf2[i9 + 1] = immutableMapOooO0O1;
            i = i7;
        }
        this.f18617Oooo = o0O00000.OooOO0o(i, objArrCopyOf2);
    }

    @Override // com.google.common.collect.ImmutableTable
    public final ImmutableMap<C, Map<R, V>> OooO() {
        return ImmutableMap.OooO0O0(this.f18617Oooo);
    }

    @Override // com.google.common.collect.ImmutableTable
    public final ImmutableTable.OooO00o OooOO0O() {
        ImmutableMap immutableMapOooO00o = o00OO00O.OooO00o(OooO0oo());
        int[] iArr = new int[OooO00o().size()];
        o0O0o000<o0O0O0o0.OooO00o<R, C, V>> it = OooO00o().iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Integer) ((o0O00000) immutableMapOooO00o).get(it.next().OooO00o())).intValue();
            i++;
        }
        return ImmutableTable.OooO00o.OooO00o(this, this.f18620OoooO00, iArr);
    }

    @Override // com.google.common.collect.ImmutableTable
    /* JADX INFO: renamed from: OooOOO */
    public final ImmutableMap<R, Map<C, V>> OooO0O0() {
        return ImmutableMap.OooO0O0(this.f18618Oooo0oo);
    }

    @Override // com.google.common.collect.o0OoOoOo
    public final o0O0O0o0.OooO00o<R, C, V> OooOOOo(int i) {
        Map.Entry<R, ImmutableMap<C, V>> entry = this.f18618Oooo0oo.entrySet().OooO00o().get(this.f18620OoooO00[i]);
        ImmutableMap<C, V> value = entry.getValue();
        Map.Entry<C, V> entry2 = value.entrySet().OooO00o().get(this.f18619OoooO0[i]);
        return ImmutableTable.OooO0o(entry.getKey(), entry2.getKey(), entry2.getValue());
    }

    @Override // com.google.common.collect.o0OoOoOo
    public final V OooOOo0(int i) {
        ImmutableMap<C, V> immutableMap = this.f18618Oooo0oo.values().OooO00o().get(this.f18620OoooO00[i]);
        return immutableMap.values().OooO00o().get(this.f18619OoooO0[i]);
    }

    @Override // com.google.common.collect.o0O0O0o0
    public final int size() {
        return this.f18620OoooO00.length;
    }
}
