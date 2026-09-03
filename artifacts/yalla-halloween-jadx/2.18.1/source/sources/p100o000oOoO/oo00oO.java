package p100o000oOoO;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class oo00oO implements Iterator<Object>, KMappedMarker {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final int f29693Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final o0OO0O0 f29694Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final int f29695Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f29696Oooo0oo;

    public oo00oO(@NotNull o0OO0O0 table, int i, int i2) {
        Intrinsics.checkNotNullParameter(table, "table");
        this.f29694Oooo0o = table;
        this.f29695Oooo0oO = i2;
        this.f29696Oooo0oo = i;
        this.f29693Oooo = table.f29607OoooO0O;
        if (table.f29605OoooO0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f29696Oooo0oo < this.f29695Oooo0oO;
    }

    @Override // java.util.Iterator
    public final Object next() {
        o0OO0O0 o0oo0o1 = this.f29694Oooo0o;
        if (o0oo0o1.f29607OoooO0O != this.f29693Oooo) {
            throw new ConcurrentModificationException();
        }
        int i = this.f29696Oooo0oo;
        this.f29696Oooo0oo = o0OOooO0.OooO0Oo(o0oo0o1.f29601Oooo0o, i) + i;
        return new o0O00o0(this, i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
