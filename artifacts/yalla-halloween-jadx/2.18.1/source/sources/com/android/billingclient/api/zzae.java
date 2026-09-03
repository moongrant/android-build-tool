package com.android.billingclient.api;

import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.play_billing.zzb;

/* JADX INFO: loaded from: classes.dex */
final class zzae extends ResultReceiver {
    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, @Nullable Bundle bundle) {
        zzb.zzi(bundle, "BillingClient");
        throw null;
    }
}
