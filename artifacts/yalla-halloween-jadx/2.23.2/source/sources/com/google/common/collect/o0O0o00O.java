package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.Immutable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@Immutable(containerOf = {"R", "C", "V"})
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class o0O0o00O<R, C, V> extends o0O00OOO<R, C, V> {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final o0O0o00O f19112OooOO0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int[] f19113OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0OoO00O f19114OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o0OoO00O f19115OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int[] f19116OooO0oo;

    static {
        ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f18681OooO0o0;
        o0O00 o0o01 = o0O00.f19060OooO0oo;
        int i = ImmutableSet.f18718OooO0o;
        o0O00O0o<Object> o0o00o0o = o0O00O0o.f19090OooOOO0;
        f19112OooOO0 = new o0O0o00O(o0o01, o0o00o0o, o0o00o0o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o0O0o00O(o0O00 o0o01, ImmutableSet immutableSet, ImmutableSet immutableSet2) {
        o0OoO00O o0ooo00oOooO00o = oo0O.OooO00o(immutableSet);
        LinkedHashMap linkedHashMapOooO0O0 = oo0O.OooO0O0();
        Iterator it = immutableSet.iterator();
        while (it.hasNext()) {
            linkedHashMapOooO0O0.put(it.next(), new LinkedHashMap());
        }
        LinkedHashMap linkedHashMapOooO0O1 = oo0O.OooO0O0();
        Iterator it2 = immutableSet2.iterator();
        while (it2.hasNext()) {
            linkedHashMapOooO0O1.put(it2.next(), new LinkedHashMap());
        }
        int[] iArr = new int[o0o01.size()];
        int[] iArr2 = new int[o0o01.size()];
        for (int i = 0; i < o0o01.size(); i++) {
            o0O.OooO00o oooO00o = (o0O.OooO00o) o0o01.get(i);
            Object objOooO00o = oooO00o.OooO00o();
            Object objOooO0O0 = oooO00o.OooO0O0();
            Object value = oooO00o.getValue();
            Integer num = (Integer) o0ooo00oOooO00o.get(objOooO00o);
            Objects.requireNonNull(num);
            iArr[i] = num.intValue();
            Map map = (Map) linkedHashMapOooO0O0.get(objOooO00o);
            Objects.requireNonNull(map);
            Map map2 = map;
            iArr2[i] = map2.size();
            o0O00OOO.OooOOo0(objOooO00o, objOooO0O0, map2.put(objOooO0O0, value), value);
            Map map3 = (Map) linkedHashMapOooO0O1.get(objOooO0O0);
            Objects.requireNonNull(map3);
            map3.put(objOooO00o, value);
        }
        this.f19116OooO0oo = iArr;
        this.f19113OooO = iArr2;
        ImmutableMap.OooO00o oooO00o2 = new ImmutableMap.OooO00o(linkedHashMapOooO0O0.size());
        for (Map.Entry entry : linkedHashMapOooO0O0.entrySet()) {
            oooO00o2.OooO0OO(entry.getKey(), ImmutableMap.OooO0O0((Map) entry.getValue()));
        }
        this.f19114OooO0o = (o0OoO00O) oooO00o2.OooO0O0();
        ImmutableMap.OooO00o oooO00o3 = new ImmutableMap.OooO00o(linkedHashMapOooO0O1.size());
        for (Map.Entry entry2 : linkedHashMapOooO0O1.entrySet()) {
            oooO00o3.OooO0OO(entry2.getKey(), ImmutableMap.OooO0O0((Map) entry2.getValue()));
        }
        this.f19115OooO0oO = (o0OoO00O) oooO00o3.OooO0O0();
    }

    @Override // com.google.common.collect.ImmutableTable
    public final ImmutableMap<C, Map<R, V>> OooOO0() {
        return ImmutableMap.OooO0O0(this.f19115OooO0oO);
    }

    @Override // com.google.common.collect.ImmutableTable
    public final ImmutableTable.OooO00o OooOO0o() {
        o0OoO00O o0ooo00oOooO00o = oo0O.OooO00o(OooO());
        int[] iArr = new int[OooO00o().size()];
        o0OO0<o0O.OooO00o<R, C, V>> it = OooO00o().iterator();
        int i = 0;
        while (it.hasNext()) {
            Integer num = (Integer) o0ooo00oOooO00o.get(it.next().OooO0O0());
            Objects.requireNonNull(num);
            iArr[i] = num.intValue();
            i++;
        }
        return ImmutableTable.OooO00o.OooO00o(this, this.f19116OooO0oo, iArr);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.o0O
    /* JADX INFO: renamed from: OooOOOo */
    public final ImmutableMap<R, Map<C, V>> OooO0O0() {
        return ImmutableMap.OooO0O0(this.f19114OooO0o);
    }

    @Override // com.google.common.collect.o0O00OOO
    public final o0O.OooO00o<R, C, V> OooOOo(int i) {
        Map.Entry entry = (Map.Entry) this.f19114OooO0o.entrySet().OooO00o().get(this.f19116OooO0oo[i]);
        ImmutableMap immutableMap = (ImmutableMap) entry.getValue();
        Map.Entry entry2 = (Map.Entry) immutableMap.entrySet().OooO00o().get(this.f19113OooO[i]);
        return ImmutableTable.OooO0oO(entry.getKey(), entry2.getKey(), entry2.getValue());
    }

    @Override // com.google.common.collect.o0O00OOO
    public final V OooOOoo(int i) {
        ImmutableMap immutableMap = (ImmutableMap) this.f19114OooO0o.values().OooO00o().get(this.f19116OooO0oo[i]);
        return immutableMap.values().OooO00o().get(this.f19113OooO[i]);
    }

    @Override // com.google.common.collect.o0O
    public final int size() {
        return this.f19116OooO0oo.length;
    }
}
