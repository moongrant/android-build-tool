package o0OO0OoO;

import com.google.android.gms.internal.measurement.zzbn;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzq;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O00O implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f37612Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f37613Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ zzbn f37614Oooo0oo;

    public /* synthetic */ o000O00O(zzbn zzbnVar, Object obj, int i) {
        this.f37612Oooo0o = i;
        this.f37614Oooo0oo = zzbnVar;
        this.f37613Oooo0oO = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f37612Oooo0o) {
            case 0:
                ((zzgq) this.f37614Oooo0oo).f16225OooO00o.OooO00o();
                ((zzgq) this.f37614Oooo0oo).f16225OooO00o.OooO((zzq) this.f37613Oooo0oO);
                break;
            default:
                ((AppMeasurementDynamiteService) this.f37614Oooo0oo).f16073OooO00o.zzv().zzP((zzcf) this.f37613Oooo0oO, ((AppMeasurementDynamiteService) this.f37614Oooo0oo).f16073OooO00o.zzI());
                break;
        }
    }
}
