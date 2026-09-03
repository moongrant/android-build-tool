package p047Oooooo0;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o00OOOOo<K, V> extends o00Oo00<K, V> implements Iterator<Map.Entry<K, V>>, KMutableIterator {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOOOo(@NotNull o00OO<K, V> map, @NotNull Iterator<? extends Map.Entry<? extends K, ? extends V>> iterator) {
        super(map, iterator);
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(iterator, "iterator");
    }

    @Override // java.util.Iterator
    public final Object next() {
        OooO00o();
        if (this.f4130Oooo != null) {
            return new o00OOOO0(this);
        }
        throw new IllegalStateException();
    }
}
