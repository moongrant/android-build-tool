package p271o00ooooo;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzci;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzgd;
import com.google.android.gms.measurement.internal.zzhg;

/* JADX INFO: loaded from: classes3.dex */
public final class z0 implements zzhg {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final zzci f40872OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f40873OooO0O0;

    public z0(AppMeasurementDynamiteService appMeasurementDynamiteService, zzci zzciVar) {
        this.f40873OooO0O0 = appMeasurementDynamiteService;
        this.f40872OooO00o = zzciVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzhg
    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        try {
            this.f40872OooO00o.zze(str, str2, bundle, j);
        } catch (RemoteException e) {
            zzgd zzgdVar = this.f40873OooO0O0.f15394OooO0Oo;
            if (zzgdVar != null) {
                zzgdVar.zzaA().zzk().zzb("Event listener threw exception", e);
            }
        }
    }
}
