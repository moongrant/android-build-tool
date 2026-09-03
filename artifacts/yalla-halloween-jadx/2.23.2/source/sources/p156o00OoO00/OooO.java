package p156o00OoO00;

import java.util.ArrayDeque;
import p156o00OoO00.Oooo0;
import p174o00OooOo.o00OO0O0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooO<T extends Oooo0> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayDeque f37961OooO00o;

    public OooO() {
        char[] cArr = o00OO0O0.f38351OooO00o;
        this.f37961OooO00o = new ArrayDeque(20);
    }

    public abstract T OooO00o();

    public final T OooO0O0() {
        T t = (T) this.f37961OooO00o.poll();
        return t == null ? (T) OooO00o() : t;
    }

    public final void OooO0OO(T t) {
        ArrayDeque arrayDeque = this.f37961OooO00o;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(t);
        }
    }
}
