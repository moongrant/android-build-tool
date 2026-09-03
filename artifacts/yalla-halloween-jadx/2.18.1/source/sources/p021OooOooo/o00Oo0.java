package p021OooOooo;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class o00Oo0<T> implements Iterator<T> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f407Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f408Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f409Oooo0oo;

    public o00Oo0(int i) {
        this.f407Oooo0o = i;
    }

    public abstract T OooO00o(int i);

    public abstract void OooO0O0(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f408Oooo0oO < this.f407Oooo0o;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T tOooO00o = OooO00o(this.f408Oooo0oO);
        this.f408Oooo0oO++;
        this.f409Oooo0oo = true;
        return tOooO00o;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f409Oooo0oo) {
            throw new IllegalStateException();
        }
        int i = this.f408Oooo0oO - 1;
        this.f408Oooo0oO = i;
        OooO0O0(i);
        this.f407Oooo0o--;
        this.f409Oooo0oo = false;
    }
}
