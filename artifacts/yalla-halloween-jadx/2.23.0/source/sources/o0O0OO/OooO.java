package o0O0OO;

import android.os.Bundle;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO implements AppMeasurementSdk.OnEventListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f41975OooO00o;

    public OooO(OooOO0 oooOO1) {
        this.f41975OooO00o = oooOO1;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzhg
    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        if (str == null || !(!OooO0O0.f41977OooO00o.contains(str2))) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j);
        bundle2.putBundle(NativeProtocol.WEB_DIALOG_PARAMS, bundle);
        ((o0O0OOO.OooO0O0) this.f41975OooO00o.f41986OooO00o).OooO00o(3, bundle2);
    }
}
