package p334o0OO00o;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O implements Iterator {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o0OO000o f37350Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f37351Oooo0o = -1;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f37352Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public Iterator f37353Oooo0oo;

    public final Iterator OooO00o() {
        if (this.f37353Oooo0oo == null) {
            this.f37353Oooo0oo = this.f37350Oooo.f37417Oooo0oo.entrySet().iterator();
        }
        return this.f37353Oooo0oo;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f37351Oooo0o + 1 >= this.f37350Oooo.f37416Oooo0oO.size()) {
            return !this.f37350Oooo.f37417Oooo0oo.isEmpty() && OooO00o().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f37352Oooo0oO = true;
        int i = this.f37351Oooo0o + 1;
        this.f37351Oooo0o = i;
        return i < this.f37350Oooo.f37416Oooo0oO.size() ? (Map.Entry) this.f37350Oooo.f37416Oooo0oO.get(this.f37351Oooo0o) : (Map.Entry) OooO00o().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f37352Oooo0oO) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f37352Oooo0oO = false;
        o0OO000o o0oo000o = this.f37350Oooo;
        int i = o0OO000o.f37413OoooO0O;
        o0oo000o.OooO();
        if (this.f37351Oooo0o >= this.f37350Oooo.f37416Oooo0oO.size()) {
            OooO00o().remove();
            return;
        }
        o0OO000o o0oo000o2 = this.f37350Oooo;
        int i2 = this.f37351Oooo0o;
        this.f37351Oooo0o = i2 - 1;
        o0oo000o2.OooO0oO(i2);
    }
}
