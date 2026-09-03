package p334o0OO00o;

import com.google.android.gms.internal.measurement.zzms;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO00o0 implements ListIterator {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final ListIterator f37423Oooo0o;

    public o0OO00o0(zzms zzmsVar, int i) {
        this.f37423Oooo0o = zzmsVar.f15994Oooo0o.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f37423Oooo0o.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f37423Oooo0o.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f37423Oooo0o.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f37423Oooo0o.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f37423Oooo0o.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f37423Oooo0o.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
