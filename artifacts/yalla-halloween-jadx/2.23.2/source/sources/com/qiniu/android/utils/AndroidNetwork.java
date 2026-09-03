package com.qiniu.android.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Process;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.TelephonyManager;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class AndroidNetwork {
    public static String getHostIP() {
        String hostAddress = null;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces != null) {
                while (networkInterfaces.hasMoreElements()) {
                    Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress inetAddressNextElement = inetAddresses.nextElement();
                        if (!inetAddressNextElement.isLinkLocalAddress() && !inetAddressNextElement.isLoopbackAddress()) {
                            hostAddress = inetAddressNextElement.getHostAddress();
                            break;
                        }
                    }
                }
            } else {
                return null;
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
        return hostAddress;
    }

    public static int getMobileDbm() {
        List<CellInfo> allCellInfo;
        Context contextApplicationContext = ContextGetter.applicationContext();
        if (contextApplicationContext == null) {
            return -1;
        }
        TelephonyManager telephonyManager = (TelephonyManager) contextApplicationContext.getSystemService("phone");
        if (contextApplicationContext.checkPermission("android.permission.ACCESS_COARSE_LOCATION", Process.myPid(), Process.myUid()) != 0 || contextApplicationContext.checkPermission("android.permission.ACCESS_FINE_LOCATION", Process.myPid(), Process.myUid()) != 0 || (allCellInfo = telephonyManager.getAllCellInfo()) == null) {
            return -1;
        }
        for (CellInfo cellInfo : allCellInfo) {
            if (cellInfo instanceof CellInfoGsm) {
                return ((CellInfoGsm) cellInfo).getCellSignalStrength().getDbm();
            }
            if (cellInfo instanceof CellInfoCdma) {
                return ((CellInfoCdma) cellInfo).getCellSignalStrength().getDbm();
            }
            if (cellInfo instanceof CellInfoLte) {
                return ((CellInfoLte) cellInfo).getCellSignalStrength().getDbm();
            }
            if (cellInfo instanceof CellInfoWcdma) {
                return ((CellInfoWcdma) cellInfo).getCellSignalStrength().getDbm();
            }
        }
        return -1;
    }

    private static String getNetWorkClass(Context context) {
        TelephonyManager telephonyManager;
        if (context.checkPermission("android.permission.READ_PHONE_STATE", Process.myPid(), Process.myUid()) != 0 || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
            return "none";
        }
        switch (telephonyManager.getNetworkType()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return Constants.NETWORK_CLASS_2_G;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return Constants.NETWORK_CLASS_3_G;
            case 13:
                return Constants.NETWORK_CLASS_4_G;
            default:
                return "none";
        }
    }

    public static boolean isNetWorkReady() {
        Context contextApplicationContext = ContextGetter.applicationContext();
        if (contextApplicationContext == null) {
            return true;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) contextApplicationContext.getSystemService("connectivity")).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (Exception unused) {
            return true;
        }
    }

    public static String networkType(Context context) {
        try {
            return networkTypeWithException(context);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String networkTypeWithException(Context context) throws Exception {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (context != null && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) {
            int type = activeNetworkInfo.getType();
            if (type == 1) {
                return Constants.NETWORK_WIFI;
            }
            if (type == 0) {
                return getNetWorkClass(context);
            }
        }
        return "none";
    }
}
