package androidx.activity;

import androidx.core.widget.ContentLoadingProgressBar;
import androidx.media3.session.o000O0Oo;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.TraceMetric;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOOO0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f2184OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f2185OooO0o0;

    public /* synthetic */ OooOOO0(Object obj, int i) {
        this.f2184OooO0Oo = i;
        this.f2185OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2184OooO0Oo;
        Object obj = this.f2185OooO0o0;
        switch (i) {
            case 0:
                ComponentActivity.OooOO0 oooOO1 = (ComponentActivity.OooOO0) obj;
                Runnable runnable = oooOO1.f2152OooO0o0;
                if (runnable != null) {
                    runnable.run();
                    oooOO1.f2152OooO0o0 = null;
                }
                break;
            case 1:
                int i2 = ContentLoadingProgressBar.f5479OooO0o;
                ((ContentLoadingProgressBar) obj).setVisibility(8);
                break;
            case 2:
                o000O0Oo o000o0oo2 = (o000O0Oo) obj;
                if (!(o000o0oo2.f9318OooO00o.f2094OooO00o.f2100OooO0o0.OooO00o() != null)) {
                    o000o0oo2.OooO0OO();
                }
                break;
            default:
                AppStartTrace appStartTrace = (AppStartTrace) obj;
                if (appStartTrace.f19960OooOOo == null) {
                    appStartTrace.f19949OooO0o.getClass();
                    appStartTrace.f19960OooOOo = new Timer();
                    long j = appStartTrace.OooO0OO().f20009OooO0Oo;
                    TraceMetric.OooO0O0 oooO0O0 = appStartTrace.f19952OooO0oo;
                    oooO0O0.OooOO0O(j);
                    Timer timerOooO0OO = appStartTrace.OooO0OO();
                    Timer timer = appStartTrace.f19960OooOOo;
                    timerOooO0OO.getClass();
                    oooO0O0.OooOO0o(timer.f20010OooO0o0 - timerOooO0OO.f20010OooO0o0);
                    appStartTrace.OooO0o0(oooO0O0);
                    break;
                }
                break;
        }
    }
}
