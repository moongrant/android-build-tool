package com.android.billingclient.api;

import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.zzb;

/* JADX INFO: loaded from: classes.dex */
final class zzaa extends ResultReceiver {
    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        OooOOO0.OooO00o OooO00o2 = OooOOO0.OooO00o();
        OooO00o2.f11238OooO00o = i;
        OooO00o2.f11239OooO0O0 = zzb.zzj(bundle, "BillingClient");
        OooO00o2.OooO00o();
        throw null;
    }
}
