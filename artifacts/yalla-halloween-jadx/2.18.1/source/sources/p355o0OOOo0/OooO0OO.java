package p355o0OOOo0;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzgv;
import com.umeng.analytics.pro.d;
import java.util.HashSet;
import p358o0OOOo0o.o0000O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO implements AppMeasurementSdk.OnEventListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooO0o f38310OooO00o;

    public OooO0OO(OooO0o oooO0o) {
        this.f38310OooO00o = oooO0o;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzgz
    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        if (this.f38310OooO00o.f38311OooO00o.contains(str2)) {
            Bundle bundle2 = new Bundle();
            HashSet hashSet = OooO0O0.f38304OooO00o;
            String strZza = zzgv.zza(str2);
            if (strZza != null) {
                str2 = strZza;
            }
            bundle2.putString(d.ar, str2);
            ((o0000O) this.f38310OooO00o.f38312OooO0O0).OooO00o(2, bundle2);
        }
    }
}
