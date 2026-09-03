package p047Oooooo0;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import p037OoooOOo.o00000;
import p037OoooOOo.o00000O;

/* JADX INFO: loaded from: classes.dex */
public final class oo0oOO0<K, V> extends o00OO000<K, V, Map.Entry<K, V>> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0oOO0(@NotNull o00OO<K, V> map) {
        super(map);
        Intrinsics.checkNotNullParameter(map, "map");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        Map.Entry element = (Map.Entry) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        o00OOO00.OooO00o();
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        o00OOO00.OooO00o();
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        if (!TypeIntrinsics.isMutableMapEntry(obj)) {
            return false;
        }
        Map.Entry element = (Map.Entry) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        return Intrinsics.areEqual(this.f4105Oooo0o.get(element.getKey()), element.getValue());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @NotNull
    public final Iterator<Map.Entry<K, V>> iterator() {
        o00OO<K, V> o00oo2 = this.f4105Oooo0o;
        return new o00OOOOo(o00oo2, ((o00000) o00oo2.OooO0OO().f4103OooO0OO.entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        if (!TypeIntrinsics.isMutableMapEntry(obj)) {
            return false;
        }
        Map.Entry element = (Map.Entry) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f4105Oooo0o.remove(element.getKey()) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (this.f4105Oooo0o.remove(((Map.Entry) it.next()).getKey()) != null || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(@NotNull Collection<? extends Object> elements) {
        o00000O<K, ? extends V> o00000o;
        int i;
        boolean z;
        oo00o oo00oVarOooO;
        Intrinsics.checkNotNullParameter(elements, "elements");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(elements, 10)), 16));
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair pair = TuplesKt.to(entry.getKey(), entry.getValue());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        o00OO<K, V> o00oo2 = this.f4105Oooo0o;
        boolean z2 = false;
        do {
            Object obj = o00OOO00.f4125OooO00o;
            synchronized (o00OOO00.f4125OooO00o) {
                o00OO.OooO00o oooO00o = (o00OO.OooO00o) oo0o0O0.OooO0oo(o00oo2.f4100Oooo0o, oo0o0O0.OooO());
                o00000o = oooO00o.f4103OooO0OO;
                i = oooO00o.f4104OooO0Oo;
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(o00000o);
            o00000O.OooO00o<K, ? extends V> oooO00oOooO0o = o00000o.OooO0o();
            Iterator<Map.Entry<K, V>> it2 = o00oo2.f4101Oooo0oO.iterator();
            z = true;
            while (((o00Oo00) it2).hasNext()) {
                Map.Entry entry2 = (Map.Entry) ((o00OOOOo) it2).next();
                if ((linkedHashMap.containsKey(entry2.getKey()) && Intrinsics.areEqual(linkedHashMap.get(entry2.getKey()), entry2.getValue())) ? false : true) {
                    oooO00oOooO0o.remove(entry2.getKey());
                    z2 = true;
                }
            }
            Unit unit2 = Unit.INSTANCE;
            o00000O<K, ? extends V> o00000oBuild = oooO00oOooO0o.build();
            if (Intrinsics.areEqual(o00000oBuild, o00000o)) {
                break;
            }
            Object obj2 = o00OOO00.f4125OooO00o;
            synchronized (o00OOO00.f4125OooO00o) {
                o00OO.OooO00o oooO00o2 = o00oo2.f4100Oooo0o;
                Function1<o00O0O0, Unit> function1 = oo0o0O0.f4156OooO00o;
                synchronized (oo0o0O0.f4158OooO0OO) {
                    oo00oVarOooO = oo0o0O0.OooO();
                    o00OO.OooO00o oooO00o3 = (o00OO.OooO00o) oo0o0O0.OooOo0(oooO00o2, o00oo2, oo00oVarOooO);
                    if (oooO00o3.f4104OooO0Oo == i) {
                        oooO00o3.OooO0OO(o00000oBuild);
                        oooO00o3.f4104OooO0Oo++;
                    } else {
                        z = false;
                    }
                }
                oo0o0O0.OooOOO0(oo00oVarOooO, o00oo2);
            }
        } while (!z);
        return z2;
    }
}
