package p190o00o0O;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooOOO<T> implements Iterator<T> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f38552OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f38553OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f38554OooO0o0;

    public OooOOO(int i) {
        this.f38552OooO0Oo = i;
    }

    public abstract T OooO00o(int i);

    public abstract void OooO0O0(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f38554OooO0o0 < this.f38552OooO0Oo;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T tOooO00o = OooO00o(this.f38554OooO0o0);
        this.f38554OooO0o0++;
        this.f38553OooO0o = true;
        return tOooO00o;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f38553OooO0o) {
            throw new IllegalStateException();
        }
        int i = this.f38554OooO0o0 - 1;
        this.f38554OooO0o0 = i;
        OooO0O0(i);
        this.f38552OooO0Oo--;
        this.f38553OooO0o = false;
    }
}
