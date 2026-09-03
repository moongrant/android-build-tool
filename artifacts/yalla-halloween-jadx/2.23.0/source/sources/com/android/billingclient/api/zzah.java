package com.android.billingclient.api;

import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.zzb;

/* JADX INFO: loaded from: classes2.dex */
final class zzah extends ResultReceiver {
    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        OooOo00.OooO00o oooO00oOooO0O0 = OooOo00.OooO0O0();
        oooO00oOooO0O0.f9657OooO00o = i;
        oooO00oOooO0O0.f9658OooO0O0 = zzb.zzk(bundle, "BillingClient");
        oooO00oOooO0O0.OooO00o();
        throw null;
    }
}
