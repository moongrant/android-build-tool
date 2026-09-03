package p535o0o0OOoO;

import OooO0o.OooO0OO;
import android.location.Address;
import android.location.Geocoder;
import com.facebook.internal.AnalyticsEvents;
import com.yalla.yalla.ui.activity.main.NetworkTestActivity;
import com.yalla.yalla.ui.activity.main.NetworkTestActivity.OooO0OO;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import p615o0oo0OoO.oO0O000;
import p617o0oo0o.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class oO0OO00 implements Function2<Double, Double, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ NetworkTestActivity f43664Oooo0o;

    public oO0OO00(NetworkTestActivity networkTestActivity) {
        this.f43664Oooo0o = networkTestActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Double d, Double d2) {
        Address address;
        oO0O000 oo0o000 = this.f43664Oooo0o.f22023oo0o0Oo;
        double dDoubleValue = d.doubleValue();
        double dDoubleValue2 = d2.doubleValue();
        Objects.requireNonNull(oo0o000);
        try {
            List<Address> fromLocation = new Geocoder(oo0o000.f48386OooO00o, o00000O0.OooO00o()).getFromLocation(dDoubleValue2, dDoubleValue, 1);
            address = fromLocation.size() > 0 ? fromLocation.get(0) : null;
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (address != null) {
            String str = address.getCountryName() + "(" + address.getCountryCode() + ")";
            this.f43664Oooo0o.f21983Ooooo0o = OooO0OO.OooO00o("Country: ", str, "\n");
            this.f43664Oooo0o.f22005o0000oo.setCountry(str);
        } else {
            NetworkTestActivity networkTestActivity = this.f43664Oooo0o;
            networkTestActivity.f21983Ooooo0o = "Country: ()\n";
            networkTestActivity.f22005o0000oo.setCountry(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN);
        }
        NetworkTestActivity networkTestActivity2 = this.f43664Oooo0o;
        if (networkTestActivity2.f22017o0Oo0oo == 2) {
            networkTestActivity2.OooOooO(13.0f);
            NetworkTestActivity networkTestActivity3 = this.f43664Oooo0o;
            Objects.requireNonNull(networkTestActivity3);
            networkTestActivity3.new OooO0OO().execute(new Void[0]);
        }
        return null;
    }
}
