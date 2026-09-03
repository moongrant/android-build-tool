package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import o0OO0OoO.oo0OOoo;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeu extends oo0OOoo {
    public zzeu(zzkz zzkzVar) {
        super(zzkzVar);
    }

    @Override // o0OO0OoO.oo0OOoo
    public final void OooO0O0() {
    }

    public final boolean zza() {
        OooO00o();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f37615OooO00o.zzau().getSystemService("connectivity");
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
