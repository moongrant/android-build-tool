package p038OoooOo0;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO0O<E> extends o000<E> {

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final E f3717Oooo0oo;

    public o000OO0O(E e, int i) {
        super(i, 1);
        this.f3717Oooo0oo = e;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final E next() {
        OooO00o();
        this.f3688Oooo0o++;
        return this.f3717Oooo0oo;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        OooO0O0();
        this.f3688Oooo0o--;
        return this.f3717Oooo0oo;
    }
}
