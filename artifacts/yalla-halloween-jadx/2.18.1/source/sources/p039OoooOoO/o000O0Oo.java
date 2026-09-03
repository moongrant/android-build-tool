package p039OoooOoO;

import java.util.Iterator;
import kotlin.collections.AbstractCollection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0Oo<K, V> extends AbstractCollection<V> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final o0000O00<K, V> f3755Oooo0o;

    public o000O0Oo(@NotNull o0000O00<K, V> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f3755Oooo0o = map;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f3755Oooo0o.containsValue(obj);
    }

    @Override // kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: getSize */
    public final int get_size() {
        return this.f3755Oooo0o.size();
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public final Iterator<V> iterator() {
        return new o000OO0O(this.f3755Oooo0o.f3730Oooo0o);
    }
}
