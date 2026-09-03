package p057o0000OoO;

import android.os.SystemClock;
import android.view.Choreographer;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import p190o00o0O.OooOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final ThreadLocal<OooOOO0> f33689OooO0o = new ThreadLocal<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO0o f33693OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOo<OooO0O0, Long> f33690OooO00o = new OooOo<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList<OooO0O0> f33691OooO0O0 = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO00o f33692OooO0OO = new OooO00o();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f33694OooO0o0 = false;

    public class OooO00o {
        public OooO00o() {
        }
    }

    public interface OooO0O0 {
        boolean OooO00o(long j);
    }

    public static abstract class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO00o f33696OooO00o;

        public OooO0OO(OooO00o oooO00o) {
            this.f33696OooO00o = oooO00o;
        }
    }

    @RequiresApi(16)
    public static class OooO0o extends OooO0OO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Choreographer f33697OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooO00o f33698OooO0OO;

        public class OooO00o implements Choreographer.FrameCallback {
            public OooO00o() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                ArrayList<OooO0O0> arrayList;
                boolean z;
                OooO00o oooO00o = OooO0o.this.f33696OooO00o;
                oooO00o.getClass();
                long jUptimeMillis = SystemClock.uptimeMillis();
                OooOOO0 oooOOO0 = OooOOO0.this;
                oooOOO0.getClass();
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                int i = 0;
                while (true) {
                    arrayList = oooOOO0.f33691OooO0O0;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    OooO0O0 oooO0O0 = arrayList.get(i);
                    if (oooO0O0 != null) {
                        OooOo<OooO0O0, Long> oooOo = oooOOO0.f33690OooO00o;
                        Long orDefault = oooOo.getOrDefault(oooO0O0, null);
                        if (orDefault == null) {
                            z = true;
                        } else if (orDefault.longValue() < jUptimeMillis2) {
                            oooOo.remove(oooO0O0);
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            oooO0O0.OooO00o(jUptimeMillis);
                        }
                    }
                    i++;
                }
                if (oooOOO0.f33694OooO0o0) {
                    int size = arrayList.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        } else if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    oooOOO0.f33694OooO0o0 = false;
                }
                if (arrayList.size() > 0) {
                    if (oooOOO0.f33693OooO0Oo == null) {
                        oooOOO0.f33693OooO0Oo = new OooO0o(oooOOO0.f33692OooO0OO);
                    }
                    OooO0o oooO0o = oooOOO0.f33693OooO0Oo;
                    oooO0o.f33697OooO0O0.postFrameCallback(oooO0o.f33698OooO0OO);
                }
            }
        }

        public OooO0o(OooO00o oooO00o) {
            super(oooO00o);
            this.f33697OooO0O0 = Choreographer.getInstance();
            this.f33698OooO0OO = new OooO00o();
        }
    }
}
