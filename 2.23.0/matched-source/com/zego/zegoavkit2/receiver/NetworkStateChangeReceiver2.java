package com.zego.zegoavkit2.receiver;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import java.net.InetAddress;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public class NetworkStateChangeReceiver2 extends BroadcastReceiver {
    private Context mContext;
    private long mThis;

    @TargetApi(26)
    private String GetDnsSevers() {
        StringBuilder sb = new StringBuilder();
        Context context = this.mContext;
        if (context == null) {
            return sb.toString();
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetworkInfo != null && activeNetwork != null) {
                LinkProperties linkProperties = connectivityManager.getLinkProperties(activeNetwork);
                if (activeNetworkInfo.isConnected() && linkProperties != null) {
                    Iterator<InetAddress> it = linkProperties.getDnsServers().iterator();
                    while (it.hasNext()) {
                        sb.append(it.next().getHostAddress() + ";");
                    }
                }
            }
        }
        return sb.toString();
    }

    private int getNetType(NetworkInfo networkInfo) {
        int type = networkInfo.getType();
        if (type != 0) {
            if (type != 1) {
                return type != 9 ? 32 : 1;
            }
            return 2;
        }
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return 3;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
            case 18:
                return 5;
            case 19:
            default:
                return 32;
            case 20:
                return 6;
        }
    }

    public static native void onNetTypeChanged(long j, int i, String str);

    public void checkCurrentNetType() {
        onReceive(null, null);
    }

    public String getDnsSeverInfo() {
        return Build.VERSION.SDK_INT > 25 ? GetDnsSevers() : "getdnsC";
    }

    public int init(Context context) {
        this.mContext = context;
        if (context == null) {
            return -1;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        this.mContext.registerReceiver(this, intentFilter);
        onReceive(null, null);
        return 0;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int netType;
        String str;
        Context context2 = this.mContext;
        if (context2 == null) {
            return;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context2.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo == null) {
            str = "";
            netType = 0;
        } else {
            String string = activeNetworkInfo.toString();
            netType = getNetType(activeNetworkInfo);
            str = string;
        }
        onNetTypeChanged(this.mThis, netType, str);
    }

    public void setThis(long j) {
        this.mThis = j;
    }

    public int uninit() {
        Context context = this.mContext;
        if (context == null) {
            return -1;
        }
        context.unregisterReceiver(this);
        this.mContext = null;
        return 0;
    }
}
