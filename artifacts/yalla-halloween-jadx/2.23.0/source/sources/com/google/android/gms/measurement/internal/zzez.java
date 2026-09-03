package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import p269o00ooooo.oOOO0O0o;

/* JADX INFO: loaded from: classes3.dex */
public final class zzez extends oOOO0O0o {
    public zzez(zzlh zzlhVar) {
        super(zzlhVar);
    }

    @Override // p269o00ooooo.oOOO0O0o
    public final void OooO0O0() {
    }

    public final boolean zza() {
        OooO00o();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f41276OooO00o.zzaw().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
