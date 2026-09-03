package o00OO00O;

import androidx.annotation.VisibleForTesting;
import java.util.ArrayDeque;
import p532o0o0Oo.o0000oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o000oOoO<A, B> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Oooo0 f37120OooO00o = new Oooo0();

    @VisibleForTesting
    public static final class OooO00o<A> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final ArrayDeque f37121OooO0Oo;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f37122OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f37123OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public A f37124OooO0OO;

        static {
            char[] cArr = o0000oo.f54571OooO00o;
            f37121OooO0Oo = new ArrayDeque(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static OooO00o OooO00o(Object obj) {
            OooO00o oooO00o;
            ArrayDeque arrayDeque = f37121OooO0Oo;
            synchronized (arrayDeque) {
                oooO00o = (OooO00o) arrayDeque.poll();
            }
            if (oooO00o == null) {
                oooO00o = new OooO00o();
            }
            oooO00o.f37124OooO0OO = obj;
            oooO00o.f37123OooO0O0 = 0;
            oooO00o.f37122OooO00o = 0;
            return oooO00o;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f37123OooO0O0 == oooO00o.f37123OooO0O0 && this.f37122OooO00o == oooO00o.f37122OooO00o && this.f37124OooO0OO.equals(oooO00o.f37124OooO0OO);
        }

        public final int hashCode() {
            return this.f37124OooO0OO.hashCode() + (((this.f37122OooO00o * 31) + this.f37123OooO0O0) * 31);
        }
    }
}
