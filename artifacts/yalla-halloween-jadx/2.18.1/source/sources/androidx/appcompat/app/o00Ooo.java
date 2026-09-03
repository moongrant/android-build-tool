package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes.dex */
public final class o00Ooo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static o00Ooo f4560OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f4561OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final LocationManager f4562OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO00o f4563OooO0OO = new OooO00o();

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f4564OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public long f4565OooO0O0;
    }

    @VisibleForTesting
    public o00Ooo(@NonNull Context context, @NonNull LocationManager locationManager) {
        this.f4561OooO00o = context;
        this.f4562OooO0O0 = locationManager;
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public final Location OooO00o(String str) {
        try {
            if (this.f4562OooO0O0.isProviderEnabled(str)) {
                return this.f4562OooO0O0.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }
}
