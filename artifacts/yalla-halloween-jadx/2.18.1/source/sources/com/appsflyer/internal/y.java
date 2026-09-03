package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;

/* JADX INFO: loaded from: classes.dex */
final class y {

    public static final class c {
        public static final y values = new y();
    }

    public static final class e {
        public final String AFInAppEventType;
        public final String valueOf;
        public final String values;

        public e(@NonNull String str, @Nullable String str2, @Nullable String str3) {
            this.values = str;
            this.AFInAppEventType = str2;
            this.valueOf = str3;
        }
    }

    public static e AFInAppEventParameterName(@NonNull Context context) {
        String str;
        String simOperatorName;
        String str2 = "unknown";
        String networkOperatorName = null;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                for (Network network : connectivityManager.getAllNetworks()) {
                    NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
                    if (AFInAppEventType(networkInfo)) {
                        if (1 != networkInfo.getType()) {
                            if (networkInfo.getType() != 0) {
                                break;
                            }
                            str2 = "MOBILE";
                            break;
                        }
                        str2 = "WIFI";
                        break;
                    }
                }
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            simOperatorName = telephonyManager.getSimOperatorName();
            try {
                networkOperatorName = telephonyManager.getNetworkOperatorName();
                if ((networkOperatorName == null || networkOperatorName.isEmpty()) && 2 == telephonyManager.getPhoneType()) {
                    networkOperatorName = "CDMA";
                }
            } catch (Throwable th) {
                th = th;
                str = networkOperatorName;
                networkOperatorName = simOperatorName;
                AFLogger.AFKeystoreWrapper("Exception while collecting network info. ", th);
                String str3 = str;
                simOperatorName = networkOperatorName;
                networkOperatorName = str3;
            }
        } catch (Throwable th2) {
            th = th2;
            str = null;
        }
        return new e(str2, networkOperatorName, simOperatorName);
    }

    private static boolean AFInAppEventType(NetworkInfo networkInfo) {
        return networkInfo != null && networkInfo.isConnectedOrConnecting();
    }
}
