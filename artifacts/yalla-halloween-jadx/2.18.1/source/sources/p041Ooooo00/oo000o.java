package p041Ooooo00;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class oo000o<E> implements Iterator<E>, KMappedMarker {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @Nullable
    public Object f3769Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final Map<E, o00Oo0> f3770Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f3771Oooo0oo;

    public oo000o(@Nullable Object obj, @NotNull Map<E, o00Oo0> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f3769Oooo0o = obj;
        this.f3770Oooo0oO = map;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3771Oooo0oo < this.f3770Oooo0oO.size();
    }

    @Override // java.util.Iterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E e = (E) this.f3769Oooo0o;
        this.f3771Oooo0oo++;
        o00Oo0 o00oo1 = this.f3770Oooo0oO.get(e);
        if (o00oo1 != null) {
            this.f3769Oooo0o = o00oo1.f3763OooO0O0;
            return e;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + e + ") has changed after it was added to the persistent set.");
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
