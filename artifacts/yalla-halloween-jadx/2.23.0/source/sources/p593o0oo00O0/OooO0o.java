package p593o0oo00O0;

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
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nLocationGetAsync.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocationGetAsync.kt\ncom/yalla/yalla/util/location/LocationGetAsync\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,180:1\n1855#2,2:181\n*S KotlinDebug\n*F\n+ 1 LocationGetAsync.kt\ncom/yalla/yalla/util/location/LocationGetAsync\n*L\n156#1:181,2\n*E\n"})
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f56824OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String f56825OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f56826OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f56827OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f56828OooO0o0;

    public OooO0o(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f56824OooO00o = activity;
        this.f56825OooO0O0 = "LocationGet";
        this.f56826OooO0OO = 10L;
        this.f56827OooO0Oo = 60000L;
        this.f56828OooO0o0 = true;
    }

    public static final void OooO00o(OooO0o oooO0o, LocationModel locationModel, Location location) {
        oooO0o.getClass();
        String strOooO0OO = o0000.OooO0OO(oO00OOo0.Null_Location_Info);
        Geocoder geocoder = new Geocoder(oooO0o.f56824OooO00o);
        boolean z = false;
        if (location != null) {
            try {
                List<Address> fromLocation = geocoder.getFromLocation(location.getLatitude(), location.getLongitude(), 5);
                if (!(fromLocation == null || fromLocation.isEmpty())) {
                    String locality = fromLocation.get(0).getLocality();
                    Intrinsics.checkNotNullExpressionValue(locality, "list[0].locality");
                    try {
                        Intrinsics.checkNotNullExpressionValue(fromLocation.get(0).getCountryCode(), "list[0].countryCode");
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
            strOooO0OO = o0000.OooO0OO(oO00OOo0.Null_Location_Info);
        }
        locationModel.f32862OooO0o = z;
        locationModel.f32863OooO0o0 = strOooO0OO;
    }
}
