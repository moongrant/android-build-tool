package p155o00OoO0;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;
import p174o00OooOo.o00OO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f37933OooO00o = new HashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0O0 f37934OooO0O0 = new OooO0O0();

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ReentrantLock f37935OooO00o = new ReentrantLock();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f37936OooO0O0;
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayDeque f37937OooO00o = new ArrayDeque();

        public final OooO00o OooO00o() {
            OooO00o oooO00o;
            synchronized (this.f37937OooO00o) {
                oooO00o = (OooO00o) this.f37937OooO00o.poll();
            }
            return oooO00o == null ? new OooO00o() : oooO00o;
        }

        public final void OooO0O0(OooO00o oooO00o) {
            synchronized (this.f37937OooO00o) {
                if (this.f37937OooO00o.size() < 10) {
                    this.f37937OooO00o.offer(oooO00o);
                }
            }
        }
    }

    public final void OooO00o(String str) {
        OooO00o oooO00o;
        synchronized (this) {
            Object obj = this.f37933OooO00o.get(str);
            o00OO00O.OooO0O0(obj);
            oooO00o = (OooO00o) obj;
            int i = oooO00o.f37936OooO0O0;
            if (i < 1) {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + oooO00o.f37936OooO0O0);
            }
            int i2 = i - 1;
            oooO00o.f37936OooO0O0 = i2;
            if (i2 == 0) {
                OooO00o oooO00o2 = (OooO00o) this.f37933OooO00o.remove(str);
                if (!oooO00o2.equals(oooO00o)) {
                    throw new IllegalStateException("Removed the wrong lock, expected to remove: " + oooO00o + ", but actually removed: " + oooO00o2 + ", safeKey: " + str);
                }
                this.f37934OooO0O0.OooO0O0(oooO00o2);
            }
        }
        oooO00o.f37935OooO00o.unlock();
    }
}
