package p162o00OoOOo;

import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.ui.activity.main.NetworkTestActivity;
import com.yalla.yalla.ui.activity.main.WebActivity;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p535o0o0OOoO.oO0OO00;
import p615o0oo0OoO.oO0O000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0O00000 implements Function1 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f32497Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f32498Oooo0oO;

    public /* synthetic */ o0O00000(Object obj, int i) {
        this.f32497Oooo0o = i;
        this.f32498Oooo0oO = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f32497Oooo0o) {
            case 0:
                o0OoOoOo o0oooooo2 = (o0OoOoOo) this.f32498Oooo0oO;
                Objects.requireNonNull(o0oooooo2);
                WebActivity.f22108OoooooO.OooO00o(o0oooooo2.f32506OooO00o, (WebPageInfo) obj);
                return null;
            default:
                NetworkTestActivity networkTestActivity = (NetworkTestActivity) this.f32498Oooo0oO;
                String str = NetworkTestActivity.f21978o0000oO;
                Objects.requireNonNull(networkTestActivity);
                if (((Boolean) obj).booleanValue()) {
                    networkTestActivity.f22014o0O0O00 = false;
                    oO0O000 oo0o000 = new oO0O000(networkTestActivity);
                    networkTestActivity.f22023oo0o0Oo = oo0o000;
                    oO0OO00 listener = new oO0OO00(networkTestActivity);
                    Intrinsics.checkNotNullParameter(listener, "listener");
                    oo0o000.f48389OooO0Oo = true;
                    oo0o000.f48387OooO0O0 = listener;
                    LocationManager locationManager = oo0o000.f48390OooO0o0;
                    Criteria criteria = new Criteria();
                    criteria.setAccuracy(2);
                    criteria.setSpeedRequired(false);
                    criteria.setCostAllowed(true);
                    criteria.setBearingRequired(false);
                    criteria.setAltitudeRequired(false);
                    criteria.setPowerRequirement(1);
                    String bestProvider = locationManager.getBestProvider(criteria, true);
                    if (bestProvider == null) {
                        Function2<? super Double, ? super Double, Unit> function2 = oo0o000.f48387OooO0O0;
                        if (function2 != null) {
                            function2.invoke(Double.valueOf(-1.0d), Double.valueOf(-1.0d));
                        }
                    } else {
                        Location lastKnownLocation = oo0o000.f48390OooO0o0.getLastKnownLocation(bestProvider);
                        if (lastKnownLocation != null) {
                            Function2<? super Double, ? super Double, Unit> function3 = oo0o000.f48387OooO0O0;
                            if (function3 != null) {
                                function3.invoke(Double.valueOf(lastKnownLocation.getLongitude()), Double.valueOf(lastKnownLocation.getLatitude()));
                            }
                            if (oo0o000.f48389OooO0Oo) {
                                oo0o000.f48387OooO0O0 = null;
                            }
                        } else {
                            oo0o000.f48390OooO0o0.requestLocationUpdates(bestProvider, 1000L, 0.1f, oo0o000.f48388OooO0OO);
                        }
                    }
                } else {
                    networkTestActivity.f22014o0O0O00 = false;
                }
                return Unit.INSTANCE;
        }
    }
}
