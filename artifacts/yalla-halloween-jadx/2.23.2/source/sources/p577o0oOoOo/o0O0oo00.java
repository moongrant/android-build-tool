package p577o0oOoOo;

import android.location.Address;
import android.location.Geocoder;
import androidx.camera.core.impl.OooOOOO;
import com.facebook.internal.AnalyticsEvents;
import java.io.IOException;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p590o0oOooo0.oOOo0O00;
import p597o0oo00OO.o0000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0oo00 extends Lambda implements Function2<Double, Double, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0000 f56512OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0O f56513OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0oo00(o0000 o0000Var, o0O o0o) {
        super(2);
        this.f56512OooO0Oo = o0000Var;
        this.f56513OooO0o0 = o0o;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Double d, Double d2) {
        Address address;
        String strOooO00o;
        double dDoubleValue = d.doubleValue();
        double dDoubleValue2 = d2.doubleValue();
        o0000 o0000Var = this.f56512OooO0Oo;
        o0000Var.getClass();
        try {
            List<Address> fromLocation = new Geocoder(o0000Var.f57342OooO00o, oOOo0O00.OooO00o()).getFromLocation(dDoubleValue2, dDoubleValue, 1);
            address = ((fromLocation != null ? fromLocation.size() : 0) <= 0 || fromLocation == null) ? null : fromLocation.get(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (address != null) {
            strOooO00o = OooOOOO.OooO00o(address.getCountryName() + "(" + address.getCountryCode() + ")", "\n");
        } else {
            strOooO00o = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        }
        this.f56513OooO0o0.f56503OooO0oO = strOooO00o;
        return Unit.INSTANCE;
    }
}
