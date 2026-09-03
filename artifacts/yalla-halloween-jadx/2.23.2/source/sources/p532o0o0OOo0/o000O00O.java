package p532o0o0OOo0;

import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p577o0oOoOo.o0O;
import p577o0oOoOo.o0O0oo00;
import p597o0oo00OO.o0000;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O00O extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O f53485OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00O(o0O o0o) {
        super(1);
        this.f53485OooO0Oo = o0o;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            o0O o0o = this.f53485OooO0Oo;
            o0000 o0000Var = new o0000(o0o.getApplication());
            o0O0oo00 listener = new o0O0oo00(o0000Var, o0o);
            Intrinsics.checkNotNullParameter(listener, "listener");
            o0000Var.f57345OooO0Oo = true;
            o0000Var.f57343OooO0O0 = listener;
            Criteria criteria = new Criteria();
            criteria.setAccuracy(2);
            criteria.setSpeedRequired(false);
            criteria.setCostAllowed(true);
            criteria.setBearingRequired(false);
            criteria.setAltitudeRequired(false);
            criteria.setPowerRequirement(1);
            LocationManager locationManager = o0000Var.f57346OooO0o0;
            String bestProvider = locationManager.getBestProvider(criteria, true);
            if (bestProvider == null) {
                Function2<? super Double, ? super Double, Unit> function2 = o0000Var.f57343OooO0O0;
                if (function2 != null) {
                    function2.invoke(Double.valueOf(-1.0d), Double.valueOf(-1.0d));
                }
            } else {
                Location lastKnownLocation = locationManager.getLastKnownLocation(bestProvider);
                if (lastKnownLocation != null) {
                    Function2<? super Double, ? super Double, Unit> function3 = o0000Var.f57343OooO0O0;
                    if (function3 != null) {
                        function3.invoke(Double.valueOf(lastKnownLocation.getLongitude()), Double.valueOf(lastKnownLocation.getLatitude()));
                    }
                    if (o0000Var.f57345OooO0Oo) {
                        o0000Var.f57343OooO0O0 = null;
                    }
                } else {
                    o0000Var.f57346OooO0o0.requestLocationUpdates(bestProvider, 1000L, 0.1f, o0000Var.f57344OooO0OO);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
