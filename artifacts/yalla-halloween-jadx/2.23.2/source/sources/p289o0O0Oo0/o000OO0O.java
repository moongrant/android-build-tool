package p289o0O0Oo0;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.GaugeMetric;
import com.google.firebase.perf.v1.PerfMetric;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p311o0O0oO0o.o0O0O00;
import p316o0O0oOo0.o0OO00O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000OO0O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f41526OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f41527OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f41528OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Object f41529OooO0oO;

    public /* synthetic */ o000OO0O(int i, Object obj, Object obj2, Object obj3) {
        this.f41526OooO0Oo = i;
        this.f41528OooO0o0 = obj;
        this.f41527OooO0o = obj2;
        this.f41529OooO0oO = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f41526OooO0Oo;
        Object obj = this.f41529OooO0oO;
        Object obj2 = this.f41527OooO0o;
        Object obj3 = this.f41528OooO0o0;
        switch (i) {
            case 0:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
                try {
                    ((Task) ((Callable) obj3).call()).continueWith((Executor) obj2, new o000O0O0(taskCompletionSource));
                } catch (Exception e) {
                    taskCompletionSource.setException(e);
                }
                break;
            default:
                o0OO00O o0oo00o2 = (o0OO00O) obj3;
                o0O0O00 o0o0o00 = o0OO00O.f41913OooOo0;
                o0oo00o2.getClass();
                PerfMetric.OooO0O0 oooO0O0NewBuilder = PerfMetric.newBuilder();
                oooO0O0NewBuilder.OooO0Oo((GaugeMetric) obj2);
                o0oo00o2.OooO0Oo(oooO0O0NewBuilder, (ApplicationProcessState) obj);
                break;
        }
    }
}
