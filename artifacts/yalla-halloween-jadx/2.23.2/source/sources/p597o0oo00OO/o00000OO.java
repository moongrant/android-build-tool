package p597o0oo00OO;

import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o0000;
import com.yalla.yalla.util.location.LocationModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nLocationGetAsync.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocationGetAsync.kt\ncom/yalla/yalla/util/location/LocationGetAsync\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,180:1\n1855#2,2:181\n*S KotlinDebug\n*F\n+ 1 LocationGetAsync.kt\ncom/yalla/yalla/util/location/LocationGetAsync\n*L\n156#1:181,2\n*E\n"})
public final class o00000OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f57353OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String f57354OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f57355OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f57356OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f57357OooO0o0;

    public o00000OO(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f57353OooO00o = activity;
        this.f57354OooO0O0 = "LocationGet";
        this.f57355OooO0OO = 10L;
        this.f57356OooO0Oo = 60000L;
        this.f57357OooO0o0 = true;
    }

    public static final void OooO00o(o00000OO o00000oo2, LocationModel locationModel, Location location) {
        o00000oo2.getClass();
        String strOooO0OO = o0000.OooO0OO(o000000.Null_Location_Info);
        Geocoder geocoder = new Geocoder(o00000oo2.f57353OooO00o);
        boolean z = false;
        if (location != null) {
            try {
                List<Address> fromLocation = geocoder.getFromLocation(location.getLatitude(), location.getLongitude(), 5);
                if (!(fromLocation == null || fromLocation.isEmpty())) {
                    String locality = fromLocation.get(0).getLocality();
                    Intrinsics.checkNotNullExpressionValue(locality, "getLocality(...)");
                    try {
                        Intrinsics.checkNotNullExpressionValue(fromLocation.get(0).getCountryCode(), "getCountryCode(...)");
                        z = true;
                        strOooO0OO = locality;
                    } catch (Exception e) {
                        e = e;
                        strOooO0OO = locality;
                        e.printStackTrace();
                    }
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
        if (TextUtils.isEmpty(strOooO0OO)) {
            strOooO0OO = o0000.OooO0OO(o000000.Null_Location_Info);
        }
        locationModel.f32318OooO0o = z;
        locationModel.f32319OooO0o0 = strOooO0OO;
    }
}
