package com.bumptech.glide.manager;

import android.util.Log;
import p174o00OooOo.o00OO0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class oo000o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00O0O.OooO f13157OooO0Oo;

    public oo000o(o00O0O.OooO oooO) {
        this.f13157OooO0Oo = oooO;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.f13157OooO0Oo.f13136OooO0Oo;
        o00O0O.OooO oooO = this.f13157OooO0Oo;
        oooO.f13136OooO0Oo = oooO.OooO0O0();
        if (z != this.f13157OooO0Oo.f13136OooO0Oo) {
            if (Log.isLoggable("ConnectivityMonitor", 3)) {
                Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + this.f13157OooO0Oo.f13136OooO0Oo);
            }
            o00O0O.OooO oooO2 = this.f13157OooO0Oo;
            o00OO0O0.OooO0o0().post(new o00oO0o(oooO2, oooO2.f13136OooO0Oo));
        }
    }
}
