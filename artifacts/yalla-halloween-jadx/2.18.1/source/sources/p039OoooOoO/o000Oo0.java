package p039OoooOoO;

import java.util.Iterator;
import java.util.Map;
import kotlin.collections.AbstractSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p037OoooOOo.o00000;

/* JADX INFO: loaded from: classes.dex */
public final class o000Oo0<K, V> extends AbstractSet<Map.Entry<? extends K, ? extends V>> implements o00000<Map.Entry<? extends K, ? extends V>> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final o0000O00<K, V> f3757Oooo0o;

    public o000Oo0(@NotNull o0000O00<K, V> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f3757Oooo0o = map;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry element = (Map.Entry) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        V v = this.f3757Oooo0o.get(element.getKey());
        if (v != null) {
            return Intrinsics.areEqual(v, element.getValue());
        }
        return element.getValue() == null && this.f3757Oooo0o.containsKey(element.getKey());
    }

    @Override // kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: getSize */
    public final int get_size() {
        return this.f3757Oooo0o.size();
    }

    @Override // kotlin.collections.AbstractSet, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new o000O00(this.f3757Oooo0o.f3730Oooo0o);
    }
}
