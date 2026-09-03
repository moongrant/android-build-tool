package p038OoooOo0;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes.dex */
public abstract class o000<E> implements ListIterator<E>, KMappedMarker {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f3688Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f3689Oooo0oO;

    public o000(int i, int i2) {
        this.f3688Oooo0o = i;
        this.f3689Oooo0oO = i2;
    }

    public final void OooO00o() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public final void OooO0O0() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.ListIterator
    public void add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f3688Oooo0o < this.f3689Oooo0oO;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f3688Oooo0o > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f3688Oooo0o;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f3688Oooo0o - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
