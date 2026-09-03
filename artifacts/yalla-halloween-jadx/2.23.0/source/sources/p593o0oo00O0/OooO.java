package p593o0oo00O0;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO implements LocationListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f56817OooO00o;

    public OooO(OooOO0 oooOO1) {
        this.f56817OooO00o = oooOO1;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(@NotNull Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        OooOO0 oooOO1 = this.f56817OooO00o;
        Function2<? super Double, ? super Double, Unit> function2 = oooOO1.f56830OooO0O0;
        if (function2 != null) {
            function2.invoke(Double.valueOf(location.getLongitude()), Double.valueOf(location.getLatitude()));
        }
        if (oooOO1.f56832OooO0Oo) {
            oooOO1.f56830OooO0O0 = null;
            oooOO1.f56833OooO0o0.removeUpdates(oooOO1.f56831OooO0OO);
        }
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(@Nullable String str, int i, @Nullable Bundle bundle) {
    }
}
