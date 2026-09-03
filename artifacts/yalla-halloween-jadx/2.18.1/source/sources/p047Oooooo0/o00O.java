package p047Oooooo0;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p037OoooOOo.o00000;
import p037OoooOOo.o00000O;

/* JADX INFO: loaded from: classes.dex */
public final class o00O<K, V> extends o00OO000<K, V, K> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O(@NotNull o00OO<K, V> map) {
        super(map);
        Intrinsics.checkNotNullParameter(map, "map");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
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
        return this.f4105Oooo0o.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!this.f4105Oooo0o.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        o00OO<K, V> o00oo2 = this.f4105Oooo0o;
        return new o0oOO(o00oo2, ((o00000) o00oo2.OooO0OO().f4103OooO0OO.entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f4105Oooo0o.remove(obj) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<T> it = elements.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (this.f4105Oooo0o.remove(it.next()) != null || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(@NotNull Collection<? extends Object> elements) {
        o00000O<K, ? extends V> o00000o;
        int i;
        boolean z;
        oo00o oo00oVarOooO;
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set set = CollectionsKt.toSet(elements);
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
            Iterator<Map.Entry<K, V>> it = o00oo2.f4101Oooo0oO.iterator();
            z = true;
            while (((o00Oo00) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((o00OOOOo) it).next();
                if (!set.contains(entry.getKey())) {
                    oooO00oOooO0o.remove(entry.getKey());
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
