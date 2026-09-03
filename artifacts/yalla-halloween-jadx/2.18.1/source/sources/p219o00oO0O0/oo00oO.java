package p219o00oO0O0;

import java.util.ArrayDeque;
import java.util.Queue;
import p219o00oO0O0.o0O000Oo;
import p243o00oo00O.o000O000;

/* JADX INFO: loaded from: classes.dex */
public abstract class oo00oO<T extends o0O000Oo> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Queue<T> f33675OooO00o;

    public oo00oO() {
        char[] cArr = o000O000.f34177OooO00o;
        this.f33675OooO00o = new ArrayDeque(20);
    }

    public abstract T OooO00o();

    public final T OooO0O0() {
        T t = (T) this.f33675OooO00o.poll();
        return t == null ? (T) OooO00o() : t;
    }

    public final void OooO0OO(T t) {
        if (this.f33675OooO00o.size() < 20) {
            this.f33675OooO00o.offer(t);
        }
    }
}
