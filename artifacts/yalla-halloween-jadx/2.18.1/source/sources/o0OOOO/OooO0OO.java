package o0OOOO;

import java.util.concurrent.atomic.AtomicLong;
import o0OOOO0o.o0OoOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o0OoOo0<o0OOOO.OooO0O0> f38203OooO00o;

    public static class OooO00o implements o0OoOo0<o0OOOO.OooO0O0> {
        @Override // o0OOOO0o.o0OoOo0
        public final o0OOOO.OooO0O0 get() {
            return new OooO0o();
        }
    }

    public static class OooO0O0 implements o0OoOo0<o0OOOO.OooO0O0> {
        @Override // o0OOOO0o.o0OoOo0
        public final o0OOOO.OooO0O0 get() {
            return new C0376OooO0OO();
        }
    }

    /* JADX INFO: renamed from: o0OOOO.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public static final class C0376OooO0OO extends AtomicLong implements o0OOOO.OooO0O0 {
        @Override // o0OOOO.OooO0O0
        public final void OooO00o(long j) {
            getAndAdd(j);
        }
    }

    static {
        o0OoOo0<o0OOOO.OooO0O0> oooO0O0;
        try {
            new OooO0o();
            oooO0O0 = new OooO00o();
        } catch (Throwable unused) {
            oooO0O0 = new OooO0O0();
        }
        f38203OooO00o = oooO0O0;
    }
}
