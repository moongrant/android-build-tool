package p039OoooOoO;

import java.util.Iterator;
import java.util.Map;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO<K, V> extends AbstractMutableSet<Map.Entry<Object, Object>> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final o0000O0<K, V> f3756Oooo0o;

    public o000OO(@NotNull o0000O0<K, V> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f3756Oooo0o = builder;
    }

    @Override // kotlin.collections.AbstractMutableSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Map.Entry element = (Map.Entry) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f3756Oooo0o.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry element = (Map.Entry) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        if (!((element instanceof Object ? element : null) instanceof Map.Entry)) {
            return false;
        }
        Intrinsics.checkNotNullParameter(element, "element");
        V v = this.f3756Oooo0o.get(element.getKey());
        if (v != null) {
            return Intrinsics.areEqual(v, element.getValue());
        }
        return element.getValue() == null && this.f3756Oooo0o.containsKey(element.getKey());
    }

    @Override // kotlin.collections.AbstractMutableSet
    public final int getSize() {
        return this.f3756Oooo0o.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new o0000O(this.f3756Oooo0o);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry element = (Map.Entry) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        if (!((element instanceof Object ? element : null) instanceof Map.Entry)) {
            return false;
        }
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f3756Oooo0o.remove(element.getKey(), element.getValue());
    }
}
