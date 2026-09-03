package o0OO0OoO;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzci;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzgy;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO0 implements zzgy {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final zzci f37811OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f37812OooO0O0;

    public o0OO0(AppMeasurementDynamiteService appMeasurementDynamiteService, zzci zzciVar) {
        this.f37812OooO0O0 = appMeasurementDynamiteService;
        this.f37811OooO00o = zzciVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    public final void interceptEvent(String str, String str2, Bundle bundle, long j) {
        try {
            this.f37811OooO00o.zze(str, str2, bundle, j);
        } catch (RemoteException e) {
            zzfy zzfyVar = this.f37812OooO0O0.f16073OooO00o;
            if (zzfyVar != null) {
                zzfyVar.zzay().zzk().zzb("Event interceptor threw exception", e);
            }
        }
    }
}
