package p026Oooo0o;

import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.CpuMetricReading;
import p312o0O0oO0o.oo0o0Oo;
import p315o0O0oOOO.o000O000;
import p642o0ooOO0.o000O0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0OO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1068OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1069OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1070OooO0o0;

    public /* synthetic */ OooO0OO(int i, Object obj, Object obj2) {
        this.f1068OooO0Oo = i;
        this.f1070OooO0o0 = obj;
        this.f1069OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1068OooO0Oo;
        Object obj = this.f1069OooO0o;
        Object obj2 = this.f1070OooO0o0;
        switch (i) {
            case 0:
                ((OooOOO0) obj2).OooO0O0((o000O0.OooO00o) obj);
                break;
            default:
                o000O000 o000o001 = (o000O000) obj2;
                oo0o0Oo oo0o0oo = o000O000.f41859OooO0oO;
                CpuMetricReading cpuMetricReadingOooO0O0 = o000o001.OooO0O0((Timer) obj);
                if (cpuMetricReadingOooO0O0 != null) {
                    o000o001.f41861OooO00o.add(cpuMetricReadingOooO0O0);
                }
                break;
        }
    }
}
