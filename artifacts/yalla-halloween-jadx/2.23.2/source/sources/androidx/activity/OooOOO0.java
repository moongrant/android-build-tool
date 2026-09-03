package androidx.activity;

import androidx.core.widget.ContentLoadingProgressBar;
import androidx.media3.session.o000OO0O;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.TraceMetric;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOOO0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f2181OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f2182OooO0o0;

    public /* synthetic */ OooOOO0(Object obj, int i) {
        this.f2181OooO0Oo = i;
        this.f2182OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2181OooO0Oo;
        Object obj = this.f2182OooO0o0;
        switch (i) {
            case 0:
                ComponentActivity.OooOO0 oooOO1 = (ComponentActivity.OooOO0) obj;
                Runnable runnable = oooOO1.f2149OooO0o0;
                if (runnable != null) {
                    runnable.run();
                    oooOO1.f2149OooO0o0 = null;
                }
                break;
            case 1:
                int i2 = ContentLoadingProgressBar.f5475OooO0o;
                ((ContentLoadingProgressBar) obj).setVisibility(8);
                break;
            case 2:
                o000OO0O o000oo0o2 = (o000OO0O) obj;
                if (!(o000oo0o2.f9314OooO00o.f2091OooO00o.f2097OooO0o0.OooO00o() != null)) {
                    o000oo0o2.OooO0OO();
                }
                break;
            default:
                AppStartTrace appStartTrace = (AppStartTrace) obj;
                if (appStartTrace.f19955OooOOo == null) {
                    appStartTrace.f19944OooO0o.getClass();
                    appStartTrace.f19955OooOOo = new Timer();
                    long j = appStartTrace.OooO0OO().f20004OooO0Oo;
                    TraceMetric.OooO0O0 oooO0O0 = appStartTrace.f19947OooO0oo;
                    oooO0O0.OooOO0O(j);
                    Timer timerOooO0OO = appStartTrace.OooO0OO();
                    Timer timer = appStartTrace.f19955OooOOo;
                    timerOooO0OO.getClass();
                    oooO0O0.OooOO0o(timer.f20005OooO0o0 - timerOooO0OO.f20005OooO0o0);
                    appStartTrace.OooO0o0(oooO0O0);
                    break;
                }
                break;
        }
    }
}
