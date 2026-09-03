package p039OoooOoO;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0000<K, V> extends o000O<K, V, Map.Entry<K, V>> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final o0000O<K, V> f3758Oooo;

    public o00O0000(@NotNull o0000O<K, V> parentIterator) {
        Intrinsics.checkNotNullParameter(parentIterator, "parentIterator");
        this.f3758Oooo = parentIterator;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f3744Oooo0oo + 2;
        this.f3744Oooo0oo = i;
        o0000O<K, V> o0000o2 = this.f3758Oooo;
        Object[] objArr = this.f3742Oooo0o;
        return new o0000(o0000o2, objArr[i - 2], objArr[i - 1]);
    }
}
