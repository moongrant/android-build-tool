package com.yalla.yalla.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class NetWork {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    public static Context f26259OooO00o;

    public enum NetWorkState {
        WIFI,
        MOBILE,
        NONE
    }

    public static NetWorkState OooO00o() {
        NetworkInfo.State state;
        NetworkInfo.State state2;
        ConnectivityManager connectivityManager = (ConnectivityManager) f26259OooO00o.getSystemService("connectivity");
        connectivityManager.getActiveNetworkInfo();
        NetworkInfo.State state3 = connectivityManager.getNetworkInfo(1).getState();
        NetworkInfo.State state4 = connectivityManager.getNetworkInfo(0).getState();
        if (state3 != null && state4 != null && (state2 = NetworkInfo.State.CONNECTED) != state3 && state2 == state4) {
            return NetWorkState.MOBILE;
        }
        if (state3 == null || state4 == null || (state = NetworkInfo.State.CONNECTED) == state3 || state == state4) {
            return (state3 == null || NetworkInfo.State.CONNECTED != state3) ? NetWorkState.NONE : NetWorkState.WIFI;
        }
        return NetWorkState.NONE;
    }
}
