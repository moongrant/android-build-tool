package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.OooOOO0;
import com.android.billingclient.api.Oooo0;
import com.android.billingclient.api.Oooo000;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.o000oOoO;
import com.appsflyer.AFLogger;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class ax implements Oooo000 {
    private /* synthetic */ av values;

    public ax(av avVar) {
        this.values = avVar;
    }

    @Override // com.android.billingclient.api.Oooo000
    public final void onPurchasesUpdated(@NonNull OooOOO0 oooOOO0, @Nullable final List<Purchase> list) {
        final av avVar = this.values;
        try {
            if (oooOOO0.f11236OooO00o == 0 && list != null) {
                if (avVar.valueOf == null) {
                    AFLogger.AppsFlyer2dXConversionCallback("Got Ars billing callback but billing client is missing!");
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator<Purchase> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getSku());
                }
                ArrayList arrayList2 = new ArrayList(arrayList);
                Oooo0 oooo0 = new Oooo0();
                oooo0.f11242OooO00o = BillingClient.SkuType.SUBS;
                oooo0.f11243OooO0O0 = arrayList2;
                avVar.valueOf.OooO0O0(oooo0, new o000oOoO() { // from class: com.appsflyer.internal.av.1
                    private /* synthetic */ List valueOf;

                    public AnonymousClass1() {
                        list = list;
                    }

                    @Override // com.android.billingclient.api.o000oOoO
                    public final void onSkuDetailsResponse(@NonNull OooOOO0 oooOOO1, @Nullable List<SkuDetails> list2) {
                        try {
                            if (oooOOO1.f11236OooO00o == 0 && list2 != null) {
                                ArrayList arrayList3 = new ArrayList();
                                Iterator<SkuDetails> it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    arrayList3.add(it2.next().OooO0O0());
                                }
                                ArrayList arrayList4 = new ArrayList();
                                for (Purchase purchase : list) {
                                    if (arrayList3.contains(purchase.getSku())) {
                                        arrayList4.add(purchase);
                                    }
                                }
                                if (arrayList4.isEmpty()) {
                                    return;
                                }
                                av.values(av.this, false, arrayList4);
                            }
                        } catch (Throwable th) {
                            if ((th instanceof NoSuchMethodError) || (th instanceof NoClassDefFoundError)) {
                                AFLogger.AppsFlyer2dXConversionCallback("It seems your app uses different Play Billing library version than the SDK. Please use v.3.0.3");
                            }
                            AFLogger.AFInAppEventType("Failed to log new purchase", th);
                        }
                    }
                });
                return;
            }
            StringBuilder sb = new StringBuilder("Failed to setup Ars Play billing service: ");
            sb.append(oooOOO0.f11236OooO00o);
            sb.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
            sb.append(oooOOO0.f11237OooO0O0);
            AFLogger.AppsFlyer2dXConversionCallback(sb.toString());
        } catch (Throwable th) {
            if ((th instanceof NoSuchMethodError) || (th instanceof NoClassDefFoundError)) {
                AFLogger.AppsFlyer2dXConversionCallback("It seems your app uses different Play Billing library version than the SDK. Please use v.3.0.3");
            }
            AFLogger.AFInAppEventType("Failed to query new purchase details", th);
        }
    }
}
