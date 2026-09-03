package o0OO0OoO;

import com.google.android.gms.internal.measurement.zzbn;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzq;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O00 implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f37592Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ zzbn f37593OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f37594OoooO00;

    public /* synthetic */ o000O00(zzbn zzbnVar, Object obj, int i) {
        this.f37592Oooo = i;
        this.f37593OoooO0 = zzbnVar;
        this.f37594OoooO00 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f37592Oooo) {
            case 0:
                ((zzgq) this.f37593OoooO0).f16243OooO00o.OooO00o();
                ((zzgq) this.f37593OoooO0).f16243OooO00o.OooO((zzq) this.f37594OoooO00);
                break;
            default:
                ((AppMeasurementDynamiteService) this.f37593OoooO0).f16091OooO00o.zzv().zzP((zzcf) this.f37594OoooO00, ((AppMeasurementDynamiteService) this.f37593OoooO0).f16091OooO00o.zzI());
                break;
        }
    }
}
