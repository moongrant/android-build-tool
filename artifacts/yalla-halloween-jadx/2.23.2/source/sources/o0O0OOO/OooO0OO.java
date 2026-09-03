package o0O0OOO;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzjb;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzhc;
import p285o0O0OOo.OooOOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO implements AppMeasurementSdk.OnEventListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooO0o f41351OooO00o;

    public OooO0OO(OooO0o oooO0o) {
        this.f41351OooO00o = oooO0o;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzhg
    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        OooO0o oooO0o = this.f41351OooO00o;
        if (oooO0o.f41352OooO00o.contains(str2)) {
            Bundle bundle2 = new Bundle();
            zzjb zzjbVar = OooO0O0.f41345OooO00o;
            String strZza = zzhc.zza(str2);
            if (strZza != null) {
                str2 = strZza;
            }
            bundle2.putString("events", str2);
            ((OooOOO0) oooO0o.f41353OooO0O0).OooO00o(2, bundle2);
        }
    }
}
