package p037OoooOo0;

import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.TraceMetric;
import com.yalla.yalla.ui.view.GiftView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0000O0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1510OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1511OooO0o0;

    public /* synthetic */ o0000O0(Object obj, int i) {
        this.f1510OooO0Oo = i;
        this.f1511OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1510OooO0Oo;
        Object obj = this.f1511OooO0o0;
        switch (i) {
            case 0:
                o000O000 o000o001 = (o000O000) obj;
                o000o001.f1555OooOOO0 = true;
                o000o001.OooO0oo();
                break;
            case 1:
                AppStartTrace appStartTrace = (AppStartTrace) obj;
                if (appStartTrace.f20429OooOOoo == null) {
                    appStartTrace.f20416OooO0o.getClass();
                    appStartTrace.f20429OooOOoo = new Timer();
                    TraceMetric.OooO0O0 oooO0O0NewBuilder = TraceMetric.newBuilder();
                    oooO0O0NewBuilder.OooOOO0("_experiment_preDrawFoQ");
                    oooO0O0NewBuilder.OooOO0O(appStartTrace.OooO0OO().f20477OooO0Oo);
                    Timer timerOooO0OO = appStartTrace.OooO0OO();
                    Timer timer = appStartTrace.f20429OooOOoo;
                    timerOooO0OO.getClass();
                    oooO0O0NewBuilder.OooOO0o(timer.f20478OooO0o0 - timerOooO0OO.f20478OooO0o0);
                    TraceMetric traceMetricBuild = oooO0O0NewBuilder.build();
                    TraceMetric.OooO0O0 oooO0O0 = appStartTrace.f20419OooO0oo;
                    oooO0O0.OooO0o(traceMetricBuild);
                    appStartTrace.OooO0o0(oooO0O0);
                    break;
                }
                break;
            default:
                GiftView.setNewGift$lambda$0((GiftView) obj);
                break;
        }
    }
}
