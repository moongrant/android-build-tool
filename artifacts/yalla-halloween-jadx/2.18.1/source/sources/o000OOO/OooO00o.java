package o000OOO;

import android.os.SystemClock;
import android.view.Choreographer;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import p021OooOooo.o00oO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final ThreadLocal<OooO00o> f28249OooO0oO = new ThreadLocal<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO0o f28253OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00oO0o<OooO0O0, Long> f28250OooO00o = new o00oO0o<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList<OooO0O0> f28251OooO0O0 = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C0298OooO00o f28252OooO0OO = new C0298OooO00o();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f28255OooO0o0 = 0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f28254OooO0o = false;

    /* JADX INFO: renamed from: o000OOO.OooO00o$OooO00o, reason: collision with other inner class name */
    public class C0298OooO00o {
        public C0298OooO00o() {
        }

        public final void OooO00o() {
            boolean z;
            OooO00o.this.f28255OooO0o0 = SystemClock.uptimeMillis();
            OooO00o oooO00o = OooO00o.this;
            long j = oooO00o.f28255OooO0o0;
            long jUptimeMillis = SystemClock.uptimeMillis();
            for (int i = 0; i < oooO00o.f28251OooO0O0.size(); i++) {
                OooO0O0 oooO0O0 = oooO00o.f28251OooO0O0.get(i);
                if (oooO0O0 != null) {
                    Long orDefault = oooO00o.f28250OooO00o.getOrDefault(oooO0O0, null);
                    if (orDefault == null) {
                        z = true;
                    } else if (orDefault.longValue() < jUptimeMillis) {
                        oooO00o.f28250OooO00o.remove(oooO0O0);
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        oooO0O0.OooO00o(j);
                    }
                }
            }
            if (oooO00o.f28254OooO0o) {
                int size = oooO00o.f28251OooO0O0.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else if (oooO00o.f28251OooO0O0.get(size) == null) {
                        oooO00o.f28251OooO0O0.remove(size);
                    }
                }
                oooO00o.f28254OooO0o = false;
            }
            if (OooO00o.this.f28251OooO0O0.size() > 0) {
                OooO00o oooO00o2 = OooO00o.this;
                if (oooO00o2.f28253OooO0Oo == null) {
                    oooO00o2.f28253OooO0Oo = new OooO0o(oooO00o2.f28252OooO0OO);
                }
                OooO0o oooO0o = oooO00o2.f28253OooO0Oo;
                oooO0o.f28258OooO0O0.postFrameCallback(oooO0o.f28259OooO0OO);
            }
        }
    }

    public interface OooO0O0 {
        boolean OooO00o(long j);
    }

    public static abstract class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C0298OooO00o f28257OooO00o;

        public OooO0OO(C0298OooO00o c0298OooO00o) {
            this.f28257OooO00o = c0298OooO00o;
        }
    }

    @RequiresApi(16)
    public static class OooO0o extends OooO0OO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Choreographer f28258OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ChoreographerFrameCallbackC0299OooO00o f28259OooO0OO;

        /* JADX INFO: renamed from: o000OOO.OooO00o$OooO0o$OooO00o, reason: collision with other inner class name */
        public class ChoreographerFrameCallbackC0299OooO00o implements Choreographer.FrameCallback {
            public ChoreographerFrameCallbackC0299OooO00o() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                OooO0o.this.f28257OooO00o.OooO00o();
            }
        }

        public OooO0o(C0298OooO00o c0298OooO00o) {
            super(c0298OooO00o);
            this.f28258OooO0O0 = Choreographer.getInstance();
            this.f28259OooO0OO = new ChoreographerFrameCallbackC0299OooO00o();
        }
    }

    public static OooO00o OooO00o() {
        ThreadLocal<OooO00o> threadLocal = f28249OooO0oO;
        if (threadLocal.get() == null) {
            threadLocal.set(new OooO00o());
        }
        return threadLocal.get();
    }
}
