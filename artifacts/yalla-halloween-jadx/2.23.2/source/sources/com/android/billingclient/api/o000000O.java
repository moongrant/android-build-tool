package com.android.billingclient.api;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzu;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final class o000000O implements Callable {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ String f12805OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o00O0O f12806OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ OooO0o f12807OooO0OO;

    public o000000O(OooO0o oooO0o, String str, o00O0O o00o0o2) {
        this.f12807OooO0OO = oooO0o;
        this.f12805OooO00o = str;
        this.f12806OooO0O0 = o00o0o2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Exception {
        o0000oo o0000ooVar;
        OooO0o oooO0o = this.f12807OooO0OO;
        String str = this.f12805OooO00o;
        zzb.zzn("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle bundleZzh = zzb.zzh(oooO0o.f12732OooOOO0, oooO0o.f12739OooOo00, oooO0o.f12721OooO0O0);
        String string = null;
        while (true) {
            try {
                Bundle bundleZzj = oooO0o.f12732OooOOO0 ? oooO0o.f12724OooO0o.zzj(9, oooO0o.f12725OooO0o0.getPackageName(), str, string, bundleZzh) : oooO0o.f12724OooO0o.zzi(3, oooO0o.f12725OooO0o0.getPackageName(), str, string);
                OooOo00 oooOo00 = o0000.f12788OooOO0;
                if (bundleZzj == null) {
                    zzb.zzo("BillingClient", String.format("%s got null owned items list", "getPurchase()"));
                } else {
                    int iZzb = zzb.zzb(bundleZzj, "BillingClient");
                    String strZzk = zzb.zzk(bundleZzj, "BillingClient");
                    OooOo00 oooOo01 = new OooOo00();
                    oooOo01.f12746OooO00o = iZzb;
                    oooOo01.f12747OooO0O0 = strZzk;
                    if (iZzb != 0) {
                        zzb.zzo("BillingClient", String.format("%s failed. Response code: %s", "getPurchase()", Integer.valueOf(iZzb)));
                        oooOo00 = oooOo01;
                    } else if (bundleZzj.containsKey("INAPP_PURCHASE_ITEM_LIST") && bundleZzj.containsKey("INAPP_PURCHASE_DATA_LIST") && bundleZzj.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                        ArrayList<String> stringArrayList = bundleZzj.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                        ArrayList<String> stringArrayList2 = bundleZzj.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        ArrayList<String> stringArrayList3 = bundleZzj.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                        if (stringArrayList == null) {
                            zzb.zzo("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", "getPurchase()"));
                        } else if (stringArrayList2 == null) {
                            zzb.zzo("BillingClient", String.format("Bundle returned from %s contains null purchases list.", "getPurchase()"));
                        } else if (stringArrayList3 == null) {
                            zzb.zzo("BillingClient", String.format("Bundle returned from %s contains null signatures list.", "getPurchase()"));
                        } else {
                            oooOo00 = o0000.f12789OooOO0O;
                        }
                    } else {
                        zzb.zzo("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", "getPurchase()"));
                    }
                }
                if (oooOo00 != o0000.f12789OooOO0O) {
                    o0000ooVar = new o0000oo(oooOo00, null);
                    break;
                }
                ArrayList<String> stringArrayList4 = bundleZzj.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList5 = bundleZzj.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList6 = bundleZzj.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                for (int i = 0; i < stringArrayList5.size(); i++) {
                    String str2 = stringArrayList5.get(i);
                    String str3 = stringArrayList6.get(i);
                    zzb.zzn("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList4.get(i))));
                    try {
                        Purchase purchase = new Purchase(str2, str3);
                        if (TextUtils.isEmpty(purchase.OooO0OO())) {
                            zzb.zzo("BillingClient", "BUG: empty/null token!");
                        }
                        arrayList.add(purchase);
                    } catch (JSONException e) {
                        zzb.zzp("BillingClient", "Got an exception trying to decode the purchase!", e);
                        o0000ooVar = new o0000oo(o0000.f12788OooOO0, null);
                    }
                }
                string = bundleZzj.getString("INAPP_CONTINUATION_TOKEN");
                zzb.zzn("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
                if (TextUtils.isEmpty(string)) {
                    o0000ooVar = new o0000oo(o0000.f12789OooOO0O, arrayList);
                    break;
                }
            } catch (Exception e2) {
                zzb.zzp("BillingClient", "Got exception trying to get purchasesm try to reconnect", e2);
                o0000ooVar = new o0000oo(o0000.f12790OooOO0o, null);
            }
        }
        List<Purchase> list = o0000ooVar.f12821OooO00o;
        if (list != null) {
            this.f12806OooO0O0.OooO00o(o0000ooVar.f12822OooO0O0, list);
            return null;
        }
        this.f12806OooO0O0.OooO00o(o0000ooVar.f12822OooO0O0, zzu.zzl());
        return null;
    }
}
