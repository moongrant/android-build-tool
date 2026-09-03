package p039OoooOoO;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O<K, V> implements Iterator<Map.Entry<K, V>>, KMutableIterator {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final o0000O0O<K, V, Map.Entry<K, V>> f3721Oooo0o;

    public o0000O(@NotNull o0000O0<K, V> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        o000O[] o000oArr = new o000O[8];
        for (int i = 0; i < 8; i++) {
            o000oArr[i] = new o00O0000(this);
        }
        this.f3721Oooo0o = new o0000O0O<>(builder, o000oArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3721Oooo0o.f3741Oooo0oo;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f3721Oooo0o.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f3721Oooo0o.remove();
    }
}
