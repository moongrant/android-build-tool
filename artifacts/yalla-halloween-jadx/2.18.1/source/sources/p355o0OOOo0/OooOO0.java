package p355o0OOOo0;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import p356o0OOOo00.OooO0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0O0.InterfaceC0381OooO0O0 f38313OooO00o;

    public OooOO0(AppMeasurementSdk appMeasurementSdk, OooO0O0.InterfaceC0381OooO0O0 interfaceC0381OooO0O0) {
        this.f38313OooO00o = interfaceC0381OooO0O0;
        appMeasurementSdk.registerOnMeasurementEventListener(new OooO(this));
    }
}
