package p269o00ooooo;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzci;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzgd;
import com.google.android.gms.measurement.internal.zzhf;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements zzhf {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final zzci f41115OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f41116OooO0O0;

    public b(AppMeasurementDynamiteService appMeasurementDynamiteService, zzci zzciVar) {
        this.f41116OooO0O0 = appMeasurementDynamiteService;
        this.f41115OooO00o = zzciVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final void interceptEvent(String str, String str2, Bundle bundle, long j) {
        try {
            this.f41115OooO00o.zze(str, str2, bundle, j);
        } catch (RemoteException e) {
            zzgd zzgdVar = this.f41116OooO0O0.f15870OooO0Oo;
            if (zzgdVar != null) {
                zzgdVar.zzaA().zzk().zzb("Event interceptor threw exception", e);
            }
        }
    }
}
