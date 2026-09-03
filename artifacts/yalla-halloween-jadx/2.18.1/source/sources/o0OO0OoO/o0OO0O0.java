package o0OO0OoO;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzci;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzgz;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO0O0 implements zzgz {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final zzci f37827OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f37828OooO0O0;

    public o0OO0O0(AppMeasurementDynamiteService appMeasurementDynamiteService, zzci zzciVar) {
        this.f37828OooO0O0 = appMeasurementDynamiteService;
        this.f37827OooO00o = zzciVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgz
    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        try {
            this.f37827OooO00o.zze(str, str2, bundle, j);
        } catch (RemoteException e) {
            zzfy zzfyVar = this.f37828OooO0O0.f16073OooO00o;
            if (zzfyVar != null) {
                zzfyVar.zzay().zzk().zzb("Event listener threw exception", e);
            }
        }
    }
}
