package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.play_billing.zzb;

/* JADX INFO: loaded from: classes.dex */
public final class o00000OO extends BroadcastReceiver {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Oooo000 f11265OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f11266OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ o0000Ooo f11267OooO0OO;

    public /* synthetic */ o00000OO(o0000Ooo o0000ooo, Oooo000 oooo000) {
        this.f11267OooO0OO = o0000ooo;
        this.f11265OooO00o = oooo000;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f11265OooO00o.onPurchasesUpdated(zzb.zzh(intent, "BillingBroadcastManager"), zzb.zzl(intent.getExtras()));
    }
}
