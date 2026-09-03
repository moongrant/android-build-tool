package p221o00oOO;

import androidx.annotation.VisibleForTesting;
import java.util.ArrayDeque;
import java.util.Queue;
import p243o00oo00O.o000O000;
import p243o00oo00O.o000OO;

/* JADX INFO: loaded from: classes.dex */
public final class o00000<A, B> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000OO<OooO00o<A>, B> f33691OooO00o = new o000000O();

    @VisibleForTesting
    public static final class OooO00o<A> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final Queue<OooO00o<?>> f33692OooO0Oo;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f33693OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f33694OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public A f33695OooO0OO;

        static {
            char[] cArr = o000O000.f34177OooO00o;
            f33692OooO0Oo = new ArrayDeque(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayDeque, java.util.Queue<o00oOO.o00000$OooO00o<?>>] */
        public static OooO00o OooO00o(Object obj) {
            OooO00o oooO00o;
            ?? r0 = f33692OooO0Oo;
            synchronized (r0) {
                oooO00o = (OooO00o) r0.poll();
            }
            if (oooO00o == null) {
                oooO00o = new OooO00o();
            }
            oooO00o.f33695OooO0OO = obj;
            oooO00o.f33694OooO0O0 = 0;
            oooO00o.f33693OooO00o = 0;
            return oooO00o;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f33694OooO0O0 == oooO00o.f33694OooO0O0 && this.f33693OooO00o == oooO00o.f33693OooO00o && this.f33695OooO0OO.equals(oooO00o.f33695OooO0OO);
        }

        public final int hashCode() {
            return this.f33695OooO0OO.hashCode() + (((this.f33693OooO00o * 31) + this.f33694OooO0O0) * 31);
        }
    }
}
