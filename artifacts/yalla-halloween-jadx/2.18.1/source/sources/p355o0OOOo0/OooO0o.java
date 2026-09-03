package p355o0OOOo0;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashSet;
import p356o0OOOo00.OooO0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashSet f38311OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0O0.InterfaceC0381OooO0O0 f38312OooO0O0;

    public OooO0o(AppMeasurementSdk appMeasurementSdk, OooO0O0.InterfaceC0381OooO0O0 interfaceC0381OooO0O0) {
        this.f38312OooO0O0 = interfaceC0381OooO0O0;
        appMeasurementSdk.registerOnMeasurementEventListener(new OooO0OO(this));
        this.f38311OooO00o = new HashSet();
    }
}
