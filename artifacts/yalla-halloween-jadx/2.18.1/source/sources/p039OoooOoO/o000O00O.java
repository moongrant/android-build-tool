package p039OoooOoO;

import java.util.Iterator;
import kotlin.collections.AbstractSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p037OoooOOo.o00000;

/* JADX INFO: loaded from: classes.dex */
public final class o000O00O<K, V> extends AbstractSet<K> implements o00000<K> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final o0000O00<K, V> f3746Oooo0o;

    public o000O00O(@NotNull o0000O00<K, V> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f3746Oooo0o = map;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f3746Oooo0o.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: getSize */
    public final int get_size() {
        return this.f3746Oooo0o.size();
    }

    @Override // kotlin.collections.AbstractSet, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public final Iterator<K> iterator() {
        return new o000O0(this.f3746Oooo0o.f3730Oooo0o);
    }
}
