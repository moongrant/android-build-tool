package p526o0o0OOO0;

import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p571o0oOoOO.o0O0OOOo;
import p571o0oOoOO.oo0OOoo;
import p593o0oo00O0.OooOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo0OOoo f53597OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00(oo0OOoo oo0oooo) {
        super(1);
        this.f53597OooO0Oo = oo0oooo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            oo0OOoo oo0oooo = this.f53597OooO0Oo;
            OooOO0 oooOO1 = new OooOO0(oo0oooo.getApplication());
            o0O0OOOo listener = new o0O0OOOo(oooOO1, oo0oooo);
            Intrinsics.checkNotNullParameter(listener, "listener");
            oooOO1.f56832OooO0Oo = true;
            oooOO1.f56830OooO0O0 = listener;
            Criteria criteria = new Criteria();
            criteria.setAccuracy(2);
            criteria.setSpeedRequired(false);
            criteria.setCostAllowed(true);
            criteria.setBearingRequired(false);
            criteria.setAltitudeRequired(false);
            criteria.setPowerRequirement(1);
            LocationManager locationManager = oooOO1.f56833OooO0o0;
            String bestProvider = locationManager.getBestProvider(criteria, true);
            if (bestProvider == null) {
                Function2<? super Double, ? super Double, Unit> function2 = oooOO1.f56830OooO0O0;
                if (function2 != null) {
                    function2.invoke(Double.valueOf(-1.0d), Double.valueOf(-1.0d));
                }
            } else {
                Location lastKnownLocation = locationManager.getLastKnownLocation(bestProvider);
                if (lastKnownLocation != null) {
                    Function2<? super Double, ? super Double, Unit> function3 = oooOO1.f56830OooO0O0;
                    if (function3 != null) {
                        function3.invoke(Double.valueOf(lastKnownLocation.getLongitude()), Double.valueOf(lastKnownLocation.getLatitude()));
                    }
                    if (oooOO1.f56832OooO0Oo) {
                        oooOO1.f56830OooO0O0 = null;
                    }
                } else {
                    oooOO1.f56833OooO0o0.requestLocationUpdates(bestProvider, 1000L, 0.1f, oooOO1.f56831OooO0OO);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
