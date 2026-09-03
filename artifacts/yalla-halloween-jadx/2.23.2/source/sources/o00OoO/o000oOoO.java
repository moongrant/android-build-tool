package o00OoO;

import androidx.annotation.VisibleForTesting;
import java.util.ArrayDeque;
import p174o00OooOo.o00OO0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000oOoO<A, B> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Oooo0 f37882OooO00o = new Oooo0();

    @VisibleForTesting
    public static final class OooO00o<A> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final ArrayDeque f37883OooO0Oo;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f37884OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f37885OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public A f37886OooO0OO;

        static {
            char[] cArr = o00OO0O0.f38351OooO00o;
            f37883OooO0Oo = new ArrayDeque(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static OooO00o OooO00o(Object obj) {
            OooO00o oooO00o;
            ArrayDeque arrayDeque = f37883OooO0Oo;
            synchronized (arrayDeque) {
                oooO00o = (OooO00o) arrayDeque.poll();
            }
            if (oooO00o == null) {
                oooO00o = new OooO00o();
            }
            oooO00o.f37886OooO0OO = obj;
            oooO00o.f37885OooO0O0 = 0;
            oooO00o.f37884OooO00o = 0;
            return oooO00o;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f37885OooO0O0 == oooO00o.f37885OooO0O0 && this.f37884OooO00o == oooO00o.f37884OooO00o && this.f37886OooO0OO.equals(oooO00o.f37886OooO0OO);
        }

        public final int hashCode() {
            return this.f37886OooO0OO.hashCode() + (((this.f37884OooO00o * 31) + this.f37885OooO0O0) * 31);
        }
    }
}
