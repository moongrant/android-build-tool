package p555o0oOOo;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class o000OOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Map<String, OooO00o> f44654OooO00o = new HashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0O0 f44655OooO0O0 = new OooO0O0();

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ReentrantLock f44656OooO00o = new ReentrantLock();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f44657OooO0O0;
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Queue<OooO00o> f44658OooO00o = new ArrayDeque();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, o0oOOo.o000OOo$OooO00o>] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.HashMap, java.util.Map<java.lang.String, o0oOOo.o000OOo$OooO00o>] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayDeque, java.util.Queue<o0oOOo.o000OOo$OooO00o>] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayDeque, java.util.Queue<o0oOOo.o000OOo$OooO00o>] */
    public final void OooO00o(String str) {
        OooO00o oooO00o;
        synchronized (this) {
            Object obj = this.f44654OooO00o.get(str);
            Objects.requireNonNull(obj, "Argument must not be null");
            oooO00o = (OooO00o) obj;
            int i = oooO00o.f44657OooO0O0;
            if (i < 1) {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + oooO00o.f44657OooO0O0);
            }
            int i2 = i - 1;
            oooO00o.f44657OooO0O0 = i2;
            if (i2 == 0) {
                OooO00o oooO00o2 = (OooO00o) this.f44654OooO00o.remove(str);
                if (!oooO00o2.equals(oooO00o)) {
                    throw new IllegalStateException("Removed the wrong lock, expected to remove: " + oooO00o + ", but actually removed: " + oooO00o2 + ", safeKey: " + str);
                }
                OooO0O0 oooO0O0 = this.f44655OooO0O0;
                synchronized (oooO0O0.f44658OooO00o) {
                    if (oooO0O0.f44658OooO00o.size() < 10) {
                        oooO0O0.f44658OooO00o.offer(oooO00o2);
                    }
                }
            }
        }
        oooO00o.f44656OooO00o.unlock();
    }
}
