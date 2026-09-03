package p571o0oOoOO;

import android.location.Address;
import android.location.Geocoder;
import androidx.camera.core.impl.OooOOOO;
import com.facebook.internal.AnalyticsEvents;
import java.io.IOException;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p579o0oOoo.oO00o000;
import p593o0oo00O0.OooOO0;

/* JADX INFO: loaded from: classes5.dex */
public final class o0O0OOOo extends Lambda implements Function2<Double, Double, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f56245OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ oo0OOoo f56246OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OOOo(OooOO0 oooOO1, oo0OOoo oo0oooo) {
        super(2);
        this.f56245OooO0Oo = oooOO1;
        this.f56246OooO0o0 = oo0oooo;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Double d, Double d2) {
        Address address;
        String strOooO00o;
        double dDoubleValue = d.doubleValue();
        double dDoubleValue2 = d2.doubleValue();
        OooOO0 oooOO1 = this.f56245OooO0Oo;
        oooOO1.getClass();
        try {
            List<Address> fromLocation = new Geocoder(oooOO1.f56829OooO00o, oO00o000.OooO00o()).getFromLocation(dDoubleValue2, dDoubleValue, 1);
            address = ((fromLocation != null ? fromLocation.size() : 0) <= 0 || fromLocation == null) ? null : fromLocation.get(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (address != null) {
            strOooO00o = OooOOOO.OooO00o(address.getCountryName() + "(" + address.getCountryCode() + ")", "\n");
        } else {
            strOooO00o = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        }
        this.f56246OooO0o0.f56259OooO0oO = strOooO00o;
        return Unit.INSTANCE;
    }
}
