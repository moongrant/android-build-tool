package com.bumptech.glide.manager;

import android.util.Log;
import p532o0o0Oo.o0000oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0Oo0oo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00oO0o.OooO f10065OooO0Oo;

    public o0Oo0oo(o00oO0o.OooO oooO) {
        this.f10065OooO0Oo = oooO;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.f10065OooO0Oo.f10047OooO0Oo;
        o00oO0o.OooO oooO = this.f10065OooO0Oo;
        oooO.f10047OooO0Oo = oooO.OooO0O0();
        if (z != this.f10065OooO0Oo.f10047OooO0Oo) {
            if (Log.isLoggable("ConnectivityMonitor", 3)) {
                Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + this.f10065OooO0Oo.f10047OooO0Oo);
            }
            o00oO0o.OooO oooO2 = this.f10065OooO0Oo;
            o0000oo.OooO0o0().post(new o0OO00O(oooO2, oooO2.f10047OooO0Oo));
        }
    }
}
