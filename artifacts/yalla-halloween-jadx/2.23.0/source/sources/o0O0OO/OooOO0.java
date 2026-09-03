package o0O0OO;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0O0OO0O.OooO00o.InterfaceC0451OooO00o f41986OooO00o;

    public OooOO0(AppMeasurementSdk appMeasurementSdk, o0O0OOO.OooO0O0 oooO0O0) {
        this.f41986OooO00o = oooO0O0;
        appMeasurementSdk.registerOnMeasurementEventListener(new OooO(this));
    }
}
