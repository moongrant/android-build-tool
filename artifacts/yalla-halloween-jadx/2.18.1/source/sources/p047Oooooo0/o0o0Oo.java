package p047Oooooo0;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableListIterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0o0Oo<T> implements ListIterator<T>, KMutableListIterator {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final o00OO0OO<T> f4146Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f4147Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f4148Oooo0oo;

    public o0o0Oo(@NotNull o00OO0OO<T> list, int i) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f4146Oooo0o = list;
        this.f4147Oooo0oO = i - 1;
        this.f4148Oooo0oo = list.OooO0O0();
    }

    public final void OooO00o() {
        if (this.f4146Oooo0o.OooO0O0() != this.f4148Oooo0oo) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(T t) {
        OooO00o();
        this.f4146Oooo0o.add(this.f4147Oooo0oO + 1, t);
        this.f4147Oooo0oO++;
        this.f4148Oooo0oo = this.f4146Oooo0o.OooO0O0();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f4147Oooo0oO < this.f4146Oooo0o.size() - 1;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f4147Oooo0oO >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        OooO00o();
        int i = this.f4147Oooo0oO + 1;
        oo0O.OooO0O0(i, this.f4146Oooo0o.size());
        T t = this.f4146Oooo0o.get(i);
        this.f4147Oooo0oO = i;
        return t;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f4147Oooo0oO + 1;
    }

    @Override // java.util.ListIterator
    public final T previous() {
        OooO00o();
        oo0O.OooO0O0(this.f4147Oooo0oO, this.f4146Oooo0o.size());
        T t = this.f4146Oooo0o.get(this.f4147Oooo0oO);
        this.f4147Oooo0oO--;
        return t;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f4147Oooo0oO;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        OooO00o();
        this.f4146Oooo0o.remove(this.f4147Oooo0oO);
        this.f4147Oooo0oO--;
        this.f4148Oooo0oo = this.f4146Oooo0o.OooO0O0();
    }

    @Override // java.util.ListIterator
    public final void set(T t) {
        OooO00o();
        this.f4146Oooo0o.set(this.f4147Oooo0oO, t);
        this.f4148Oooo0oo = this.f4146Oooo0o.OooO0O0();
    }
}
