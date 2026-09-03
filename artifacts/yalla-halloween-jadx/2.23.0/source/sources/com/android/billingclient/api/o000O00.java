package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzu;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O00 extends BroadcastReceiver {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ int f9728OooO0Oo = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00Ooo f9729OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f9730OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ o000O00O f9731OooO0OO;

    public /* synthetic */ o000O00(o000O00O o000o00o2, o00Ooo o00ooo2) {
        this.f9731OooO0OO = o000o00o2;
        this.f9729OooO00o = o00ooo2;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        OooOo00 oooOo00Zzi = zzb.zzi(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        boolean zEquals = action.equals("com.android.vending.billing.PURCHASES_UPDATED");
        o00Ooo o00ooo2 = this.f9729OooO00o;
        if (zEquals) {
            o00ooo2.onPurchasesUpdated(oooOo00Zzi, zzb.zzm(intent.getExtras()));
            return;
        }
        if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
            intent.getExtras();
            if (oooOo00Zzi.f9655OooO00o != 0) {
                o00ooo2.onPurchasesUpdated(oooOo00Zzi, zzu.zzl());
            } else {
                zzb.zzo("BillingBroadcastManager", "AlternativeBillingListener is null.");
                o00ooo2.onPurchasesUpdated(o0000O0O.f9708OooOO0, zzu.zzl());
            }
        }
    }
}
