package p037OoooOo0;

import androidx.camera.core.processing.SurfaceProcessorNode;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.GaugeMetric;
import com.google.firebase.perf.v1.PerfMetric;
import java.util.Map;
import o0O0oo00.OooOOO;
import p307o0O0oO0.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00O00O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1608OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1609OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1610OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Object f1611OooO0oO;

    public /* synthetic */ o00O00O(int i, Object obj, Object obj2, Object obj3) {
        this.f1608OooO0Oo = i;
        this.f1610OooO0o0 = obj;
        this.f1609OooO0o = obj2;
        this.f1611OooO0oO = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1608OooO0Oo;
        Object obj = this.f1611OooO0oO;
        Object obj2 = this.f1609OooO0o;
        Object obj3 = this.f1610OooO0o0;
        switch (i) {
            case 0:
                ((SurfaceProcessorNode) obj3).OooO00o((o00O0000) obj2, (Map.Entry) obj);
                break;
            default:
                OooOOO oooOOO = (OooOOO) obj3;
                OooOOO0 oooOOO0 = OooOOO.f42634OooOo0;
                oooOOO.getClass();
                PerfMetric.OooO0O0 oooO0O0NewBuilder = PerfMetric.newBuilder();
                oooO0O0NewBuilder.OooO0Oo((GaugeMetric) obj2);
                oooOOO.OooO0Oo(oooO0O0NewBuilder, (ApplicationProcessState) obj);
                break;
        }
    }
}
