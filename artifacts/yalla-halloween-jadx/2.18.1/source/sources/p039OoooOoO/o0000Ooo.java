package p039OoooOoO;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class o0000Ooo<K, V> implements Map.Entry<K, V>, KMappedMarker {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final K f3737Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final V f3738Oooo0oO;

    public o0000Ooo(K k, V v) {
        this.f3737Oooo0o = k;
        this.f3738Oooo0oO = v;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(@Nullable Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && Intrinsics.areEqual(entry.getKey(), this.f3737Oooo0o) && Intrinsics.areEqual(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f3737Oooo0o;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.f3738Oooo0oO;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        K k = this.f3737Oooo0o;
        int iHashCode = k != null ? k.hashCode() : 0;
        V value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3737Oooo0o);
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
