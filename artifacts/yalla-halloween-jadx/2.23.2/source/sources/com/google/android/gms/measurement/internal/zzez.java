package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import p271o00ooooo.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class zzez extends j0 {
    public zzez(zzlh zzlhVar) {
        super(zzlhVar);
    }

    @Override // p271o00ooooo.j0
    public final void OooO0O0() {
    }

    public final boolean zza() {
        OooO00o();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f40788OooO00o.zzaw().getSystemService("connectivity");
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
