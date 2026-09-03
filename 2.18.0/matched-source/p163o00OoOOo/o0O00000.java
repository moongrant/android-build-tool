package p163o00OoOOo;

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
import p537o0o0OOoO.ooo0o;
import p617o0oo0OoO.oO0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0O00000 implements Function1 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f32519Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f32520OoooO00;

    public /* synthetic */ o0O00000(Object obj, int i) {
        this.f32519Oooo = i;
        this.f32520OoooO00 = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f32519Oooo) {
            case 0:
                o0OoOoOo o0oooooo2 = (o0OoOoOo) this.f32520OoooO00;
                Objects.requireNonNull(o0oooooo2);
                WebActivity.f22127ooOO.OooO00o(o0oooooo2.f32528OooO00o, (WebPageInfo) obj);
                return null;
            default:
                NetworkTestActivity networkTestActivity = (NetworkTestActivity) this.f32520OoooO00;
                String str = NetworkTestActivity.f21997o000OO;
                Objects.requireNonNull(networkTestActivity);
                if (((Boolean) obj).booleanValue()) {
                    networkTestActivity.f22010o000000O = false;
                    oO0 oo0 = new oO0(networkTestActivity);
                    networkTestActivity.f22009o000000 = oo0;
                    ooo0o listener = new ooo0o(networkTestActivity);
                    Intrinsics.checkNotNullParameter(listener, "listener");
                    oo0.f48399OooO0Oo = true;
                    oo0.f48397OooO0O0 = listener;
                    LocationManager locationManager = oo0.f48400OooO0o0;
                    Criteria criteria = new Criteria();
                    criteria.setAccuracy(2);
                    criteria.setSpeedRequired(false);
                    criteria.setCostAllowed(true);
                    criteria.setBearingRequired(false);
                    criteria.setAltitudeRequired(false);
                    criteria.setPowerRequirement(1);
                    String bestProvider = locationManager.getBestProvider(criteria, true);
                    if (bestProvider == null) {
                        Function2<? super Double, ? super Double, Unit> function2 = oo0.f48397OooO0O0;
                        if (function2 != null) {
                            function2.invoke(Double.valueOf(-1.0d), Double.valueOf(-1.0d));
                        }
                    } else {
                        Location lastKnownLocation = oo0.f48400OooO0o0.getLastKnownLocation(bestProvider);
                        if (lastKnownLocation != null) {
                            Function2<? super Double, ? super Double, Unit> function3 = oo0.f48397OooO0O0;
                            if (function3 != null) {
                                function3.invoke(Double.valueOf(lastKnownLocation.getLongitude()), Double.valueOf(lastKnownLocation.getLatitude()));
                            }
                            if (oo0.f48399OooO0Oo) {
                                oo0.f48397OooO0O0 = null;
                            }
                        } else {
                            oo0.f48400OooO0o0.requestLocationUpdates(bestProvider, 1000L, 0.1f, oo0.f48398OooO0OO);
                        }
                    }
                } else {
                    networkTestActivity.f22010o000000O = false;
                }
                return Unit.INSTANCE;
        }
    }
}
