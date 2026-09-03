package o0O0OO;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashSet f41984OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0O0OO0O.OooO00o.InterfaceC0451OooO00o f41985OooO0O0;

    public OooO0o(AppMeasurementSdk appMeasurementSdk, o0O0OOO.OooO0O0 oooO0O0) {
        this.f41985OooO0O0 = oooO0O0;
        appMeasurementSdk.registerOnMeasurementEventListener(new OooO0OO(this));
        this.f41984OooO00o = new HashSet();
    }
}
