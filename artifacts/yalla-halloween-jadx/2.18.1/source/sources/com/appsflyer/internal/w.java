package com.appsflyer.internal;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class w {

    public static final class e {
        public static final w valueOf = new w();
    }

    private static boolean AFInAppEventType(@NonNull Context context, @NonNull String[] strArr) {
        for (String str : strArr) {
            if (aa.values(context, str)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final Location AFInAppEventType(@NonNull Context context) {
        try {
            LocationManager locationManager = (LocationManager) context.getSystemService("location");
            Location lastKnownLocation = AFInAppEventType(context, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}) ? locationManager.getLastKnownLocation("network") : null;
            Location lastKnownLocation2 = AFInAppEventType(context, new String[]{"android.permission.ACCESS_FINE_LOCATION"}) ? locationManager.getLastKnownLocation("gps") : null;
            if (lastKnownLocation2 == null && lastKnownLocation == null) {
                lastKnownLocation = null;
            } else if ((lastKnownLocation2 != null || lastKnownLocation == null) && ((lastKnownLocation == null && lastKnownLocation2 != null) || 60000 >= lastKnownLocation.getTime() - lastKnownLocation2.getTime())) {
                lastKnownLocation = lastKnownLocation2;
            }
            if (lastKnownLocation != null) {
                return lastKnownLocation;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
