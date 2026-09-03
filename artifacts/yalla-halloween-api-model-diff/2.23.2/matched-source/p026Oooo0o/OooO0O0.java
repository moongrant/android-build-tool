package p026Oooo0o;

import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.CpuMetricReading;
import p311o0O0oO0o.o0O0O00;
import p314o0O0oOOO.o000O000;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0O0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1062OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1063OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1064OooO0o0;

    public /* synthetic */ OooO0O0(int i, Object obj, Object obj2) {
        this.f1062OooO0Oo = i;
        this.f1064OooO0o0 = obj;
        this.f1063OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.f1062OooO0Oo;
        Object obj = this.f1063OooO0o;
        Object obj2 = this.f1064OooO0o0;
        switch (i) {
            case 0:
                ((OooOOO0) obj2).OooO0O0((o000Oo0.OooO00o) obj);
                break;
            default:
                o000O000 o000o001 = (o000O000) obj2;
                o0O0O00 o0o0o00 = o000O000.f41865OooO0oO;
                CpuMetricReading cpuMetricReadingOooO0O0 = o000o001.OooO0O0((Timer) obj);
                if (cpuMetricReadingOooO0O0 != null) {
                    o000o001.f41867OooO00o.add(cpuMetricReadingOooO0O0);
                }
                break;
        }
    }
}
