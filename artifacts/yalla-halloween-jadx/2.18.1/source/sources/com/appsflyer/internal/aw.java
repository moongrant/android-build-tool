package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.android.billingclient.api.OooOO0;
import com.android.billingclient.api.OooOOO0;
import com.android.billingclient.api.Purchase;
import com.appsflyer.AFLogger;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class aw implements OooOO0 {
    private /* synthetic */ av AFInAppEventType;

    public aw(av avVar) {
        this.AFInAppEventType = avVar;
    }

    @Override // com.android.billingclient.api.OooOO0
    public final void onBillingServiceDisconnected() {
    }

    @Override // com.android.billingclient.api.OooOO0
    public final void onBillingSetupFinished(@NonNull final OooOOO0 oooOOO0) {
        final av avVar = this.AFInAppEventType;
        avVar.values.submit(new Runnable() { // from class: com.appsflyer.internal.av.3
            private /* synthetic */ OooOOO0 AFInAppEventType;

            public AnonymousClass3() {
                oooOOO0 = oooOOO0;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (oooOOO0.f11236OooO00o == 0 && !av.this.AFInAppEventType.AFInAppEventType("ars_history_sent")) {
                        Purchase.OooO00o OooO00o2 = av.this.valueOf.OooO00o();
                        List list = OooO00o2.f11252OooO00o;
                        if (OooO00o2.f11253OooO0O0.f11236OooO00o == 0 && list != null && !list.isEmpty()) {
                            av.values(av.this, true, list);
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
