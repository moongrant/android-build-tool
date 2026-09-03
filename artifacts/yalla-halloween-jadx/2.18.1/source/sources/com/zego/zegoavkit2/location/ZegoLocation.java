package com.zego.zegoavkit2.location;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ZegoLocation {

    public static class ZegoLocationInfo {
        public double longitude = 0.0d;
        public double latitude = 0.0d;
    }

    @TargetApi(23)
    private static boolean checkLocationPermission(Context context) {
        return context.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0 || context.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    @SuppressLint({"MissingPermission"})
    public static ZegoLocationInfo getLastLocation(Context context) {
        LocationManager locationManager;
        if (context == null) {
            return null;
        }
        if ((Build.VERSION.SDK_INT >= 23 && !checkLocationPermission(context)) || (locationManager = (LocationManager) context.getSystemService("location")) == null) {
            return null;
        }
        Iterator<String> it = locationManager.getProviders(true).iterator();
        Location location = null;
        while (it.hasNext()) {
            Location lastKnownLocation = locationManager.getLastKnownLocation(it.next());
            if (lastKnownLocation != null && (location == null || lastKnownLocation.getAccuracy() < location.getAccuracy())) {
                location = lastKnownLocation;
            }
        }
        if (location == null) {
            return null;
        }
        ZegoLocationInfo zegoLocationInfo = new ZegoLocationInfo();
        zegoLocationInfo.longitude = location.getLongitude();
        zegoLocationInfo.latitude = location.getLatitude();
        return zegoLocationInfo;
    }
}
