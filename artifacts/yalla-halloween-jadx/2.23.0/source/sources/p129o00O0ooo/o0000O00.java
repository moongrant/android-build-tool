package p129o00O0ooo;

import java.util.ArrayDeque;
import p129o00O0ooo.o000O0o;
import p532o0o0Oo.o0000oo;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o0000O00<T extends o000O0o> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayDeque f36963OooO00o;

    public o0000O00() {
        char[] cArr = o0000oo.f54571OooO00o;
        this.f36963OooO00o = new ArrayDeque(20);
    }

    public abstract T OooO00o();

    public final T OooO0O0() {
        T t = (T) this.f36963OooO00o.poll();
        return t == null ? (T) OooO00o() : t;
    }

    public final void OooO0OO(T t) {
        ArrayDeque arrayDeque = this.f36963OooO00o;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(t);
        }
    }
}
