package com.android.billingclient.api;

import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.play_billing.zzb;

/* JADX INFO: loaded from: classes2.dex */
final class zzak extends ResultReceiver {
    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, @Nullable Bundle bundle) {
        zzb.zzj(bundle, "BillingClient");
        throw null;
    }
}
