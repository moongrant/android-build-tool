package p037OoooOo0;

import androidx.camera.core.SurfaceRequest;
import com.facebook.appevents.suggestedevents.ViewObserver;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.TraceMetric;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0000oo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1520OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1521OooO0o0;

    public /* synthetic */ o0000oo(Object obj, int i) {
        this.f1520OooO0Oo = i;
        this.f1521OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1520OooO0Oo;
        Object obj = this.f1521OooO0o0;
        switch (i) {
            case 0:
                ((SurfaceRequest) obj).OooO0Oo();
                break;
            case 1:
                ViewObserver.m4103process$lambda0((ViewObserver) obj);
                break;
            default:
                AppStartTrace appStartTrace = (AppStartTrace) obj;
                if (appStartTrace.f20427OooOOo == null) {
                    appStartTrace.f20416OooO0o.getClass();
                    appStartTrace.f20427OooOOo = new Timer();
                    long j = appStartTrace.OooO0OO().f20477OooO0Oo;
                    TraceMetric.OooO0O0 oooO0O0 = appStartTrace.f20419OooO0oo;
                    oooO0O0.OooOO0O(j);
                    Timer timerOooO0OO = appStartTrace.OooO0OO();
                    Timer timer = appStartTrace.f20427OooOOo;
                    timerOooO0OO.getClass();
                    oooO0O0.OooOO0o(timer.f20478OooO0o0 - timerOooO0OO.f20478OooO0o0);
                    appStartTrace.OooO0o0(oooO0O0);
                    break;
                }
                break;
        }
    }
}
