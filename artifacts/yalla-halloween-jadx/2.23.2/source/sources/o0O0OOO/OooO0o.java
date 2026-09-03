package o0O0OOO;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashSet;
import p285o0O0OOo.OooOOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashSet f41352OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0O0OOO0.OooO00o.InterfaceC0443OooO00o f41353OooO0O0;

    public OooO0o(AppMeasurementSdk appMeasurementSdk, OooOOO0 oooOOO0) {
        this.f41353OooO0O0 = oooOOO0;
        appMeasurementSdk.registerOnMeasurementEventListener(new OooO0OO(this));
        this.f41352OooO00o = new HashSet();
    }
}
