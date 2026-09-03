package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.billingclient.api.OooOo00;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.o00Ooo;
import com.android.billingclient.api.o0OOO0o;
import com.android.billingclient.api.o0ooOOo;
import com.appsflyer.AFLogger;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class ax implements o00Ooo {
    private /* synthetic */ av values;

    public ax(av avVar) {
        this.values = avVar;
    }

    @Override // com.android.billingclient.api.o00Ooo
    public final void onPurchasesUpdated(@NonNull OooOo00 oooOo00, @Nullable final List<Purchase> list) {
        final av avVar = this.values;
        try {
            if (oooOo00.f12746OooO00o == 0 && list != null) {
                if (avVar.valueOf == null) {
                    AFLogger.AppsFlyer2dXConversionCallback("Got Ars billing callback but billing client is missing!");
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator<Purchase> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getSku());
                }
                o0ooOOo.OooO00o oooO00o = new o0ooOOo.OooO00o(0);
                oooO00o.f12855OooO00o = "subs";
                oooO00o.f12856OooO0O0 = new ArrayList(arrayList);
                avVar.valueOf.OooO00o(oooO00o.OooO00o(), new o0OOO0o() { // from class: com.appsflyer.internal.av.1
                    private /* synthetic */ List valueOf;

                    public AnonymousClass1() {
                        list = list;
                    }

                    @Override // com.android.billingclient.api.o0OOO0o
                    public final void onSkuDetailsResponse(@NonNull OooOo00 oooOo01, @Nullable List<SkuDetails> list2) {
                        try {
                            if (oooOo01.f12746OooO00o == 0 && list2 != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Iterator<SkuDetails> it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    arrayList2.add(it2.next().f12774OooO0O0.optString("productId"));
                                }
                                ArrayList arrayList3 = new ArrayList();
                                for (Purchase purchase : list) {
                                    if (arrayList2.contains(purchase.getSku())) {
                                        arrayList3.add(purchase);
                                    }
                                }
                                if (arrayList3.isEmpty()) {
                                    return;
                                }
                                av.values(av.this, false, arrayList3);
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
            sb.append(oooOo00.f12746OooO00o);
            sb.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
            sb.append(oooOo00.f12747OooO0O0);
            AFLogger.AppsFlyer2dXConversionCallback(sb.toString());
        } catch (Throwable th) {
            if ((th instanceof NoSuchMethodError) || (th instanceof NoClassDefFoundError)) {
                AFLogger.AppsFlyer2dXConversionCallback("It seems your app uses different Play Billing library version than the SDK. Please use v.3.0.3");
            }
            AFLogger.AFInAppEventType("Failed to query new purchase details", th);
        }
    }
}
