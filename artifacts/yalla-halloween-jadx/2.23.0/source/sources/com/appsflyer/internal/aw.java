package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.android.billingclient.api.OooOOOO;
import com.android.billingclient.api.OooOo00;
import com.android.billingclient.api.Purchase;
import com.appsflyer.AFLogger;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class aw implements OooOOOO {
    private /* synthetic */ av AFInAppEventType;

    public aw(av avVar) {
        this.AFInAppEventType = avVar;
    }

    @Override // com.android.billingclient.api.OooOOOO
    public final void onBillingServiceDisconnected() {
    }

    @Override // com.android.billingclient.api.OooOOOO
    public final void onBillingSetupFinished(@NonNull final OooOo00 oooOo00) {
        final av avVar = this.AFInAppEventType;
        avVar.values.submit(new Runnable() { // from class: com.appsflyer.internal.av.3
            private /* synthetic */ OooOo00 AFInAppEventType;

            public AnonymousClass3() {
                oooOo00 = oooOo00;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (oooOo00.OooO00o() == 0 && !av.this.AFInAppEventType.AFInAppEventType("ars_history_sent")) {
                        Purchase.PurchasesResult purchasesResultQueryPurchases = av.this.valueOf.queryPurchases("subs");
                        List purchasesList = purchasesResultQueryPurchases.getPurchasesList();
                        if (purchasesResultQueryPurchases.getResponseCode() == 0 && purchasesList != null && !purchasesList.isEmpty()) {
                            av.values(av.this, true, purchasesList);
                            return;
                        }
                        AFLogger.AppsFlyer2dXConversionCallback("Failed to query purchases history");
                    }
                } catch (Throwable th) {
                    if ((th instanceof NoSuchMethodError) || (th instanceof NoClassDefFoundError)) {
                        AFLogger.AppsFlyer2dXConversionCallback("It seems your app uses different Play Billing library version than the SDK. Please use v.3.0.3");
                    }
                    AFLogger.AFInAppEventType("Failed to log purchases history", th);
                }
            }
        });
    }
}
