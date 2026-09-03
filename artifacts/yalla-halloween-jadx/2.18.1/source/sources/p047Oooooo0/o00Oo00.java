package p047Oooooo0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class o00Oo00<K, V> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public Map.Entry<? extends K, ? extends V> f4130Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final o00OO<K, V> f4131Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final Iterator<Map.Entry<K, V>> f4132Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f4133Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public Map.Entry<? extends K, ? extends V> f4134OoooO00;

    /* JADX WARN: Multi-variable type inference failed */
    public o00Oo00(@NotNull o00OO<K, V> map, @NotNull Iterator<? extends Map.Entry<? extends K, ? extends V>> iterator) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        this.f4131Oooo0o = map;
        this.f4132Oooo0oO = iterator;
        this.f4133Oooo0oo = map.OooO0O0();
        OooO00o();
    }

    public final void OooO00o() {
        this.f4130Oooo = this.f4134OoooO00;
        this.f4134OoooO00 = this.f4132Oooo0oO.hasNext() ? this.f4132Oooo0oO.next() : null;
    }

    public final boolean hasNext() {
        return this.f4134OoooO00 != null;
    }

    public final void remove() {
        if (this.f4131Oooo0o.OooO0O0() != this.f4133Oooo0oo) {
            throw new ConcurrentModificationException();
        }
        Map.Entry<? extends K, ? extends V> entry = this.f4130Oooo;
        if (entry == null) {
            throw new IllegalStateException();
        }
        this.f4131Oooo0o.remove(entry.getKey());
        this.f4130Oooo = null;
        Unit unit = Unit.INSTANCE;
        this.f4133Oooo0oo = this.f4131Oooo0o.OooO0O0();
    }
}
