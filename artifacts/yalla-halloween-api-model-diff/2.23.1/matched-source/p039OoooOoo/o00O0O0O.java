package p039OoooOoo;

import android.view.View;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.video.OooOO0O;
import com.facebook.internal.ServerProtocol;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.TraceMetric;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00O0O0O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1659OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1660OooO0o0;

    public /* synthetic */ o00O0O0O(Object obj, int i) {
        this.f1659OooO0Oo = i;
        this.f1660OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1659OooO0Oo;
        Object obj = this.f1660OooO0o0;
        switch (i) {
            case 0:
                OooOO0O oooOO0O = (OooOO0O) obj;
                SurfaceRequest surfaceRequest = oooOO0O.f3943OooOo0O;
                if (surfaceRequest == null) {
                    throw new AssertionError("surface request is required to retry initialization.");
                }
                oooOO0O.OooO0o(surfaceRequest, oooOO0O.f3944OooOo0o);
                return;
            case 1:
                int i2 = BottomAppBar.f15901o0ooOOo;
                ((View) obj).requestLayout();
                return;
            default:
                AppStartTrace appStartTrace = (AppStartTrace) obj;
                if (appStartTrace.f19965OooOo00 != null) {
                    return;
                }
                appStartTrace.f19949OooO0o.getClass();
                appStartTrace.f19965OooOo00 = new Timer();
                TraceMetric.OooO0O0 oooO0O0NewBuilder = TraceMetric.newBuilder();
                oooO0O0NewBuilder.OooOOO0("_experiment_onDrawFoQ");
                oooO0O0NewBuilder.OooOO0O(appStartTrace.OooO0OO().f20009OooO0Oo);
                Timer timerOooO0OO = appStartTrace.OooO0OO();
                Timer timer = appStartTrace.f19965OooOo00;
                timerOooO0OO.getClass();
                oooO0O0NewBuilder.OooOO0o(timer.f20010OooO0o0 - timerOooO0OO.f20010OooO0o0);
                TraceMetric traceMetricBuild = oooO0O0NewBuilder.build();
                TraceMetric.OooO0O0 oooO0O0 = appStartTrace.f19952OooO0oo;
                oooO0O0.OooO0o(traceMetricBuild);
                if (appStartTrace.f19954OooOO0O != null) {
                    TraceMetric.OooO0O0 oooO0O0NewBuilder2 = TraceMetric.newBuilder();
                    oooO0O0NewBuilder2.OooOOO0("_experiment_procStart_to_classLoad");
                    oooO0O0NewBuilder2.OooOO0O(appStartTrace.OooO0OO().f20009OooO0Oo);
                    Timer timerOooO0OO2 = appStartTrace.OooO0OO();
                    Timer timerOooO00o = appStartTrace.OooO00o();
                    timerOooO0OO2.getClass();
                    oooO0O0NewBuilder2.OooOO0o(timerOooO00o.f20010OooO0o0 - timerOooO0OO2.f20010OooO0o0);
                    oooO0O0.OooO0o(oooO0O0NewBuilder2.build());
                }
                oooO0O0.OooOO0(appStartTrace.f19968OooOoO0 ? ServerProtocol.DIALOG_RETURN_SCOPES_TRUE : "false");
                oooO0O0.OooO(appStartTrace.f19967OooOo0o, "onDrawCount");
                oooO0O0.OooO0o0(appStartTrace.f19964OooOo0.OooO00o());
                appStartTrace.OooO0o0(oooO0O0);
                return;
        }
    }
}
