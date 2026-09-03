package p047Oooooo0;

import java.util.Set;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableSet;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class o00OO000<K, V, E> implements Set<E>, KMutableSet {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final o00OO<K, V> f4105Oooo0o;

    public o00OO000(@NotNull o00OO<K, V> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f4105Oooo0o = map;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f4105Oooo0o.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f4105Oooo0o.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f4105Oooo0o.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.toArray(this, array);
    }
}
