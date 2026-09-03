package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.AnyThread;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.play_billing.zzb;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o extends BillingClient {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f11216OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public volatile int f11217OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f11218OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Handler f11219OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile o0000Ooo f11220OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile com.google.android.gms.internal.play_billing.zze f11221OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Context f11222OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public volatile o0OOO0o f11223OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f11224OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f11225OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f11226OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f11227OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f11228OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f11229OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f11230OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f11231OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f11232OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f11233OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public ExecutorService f11234OooOOoo;

    @AnyThread
    public OooO0o(boolean z, Context context, Oooo000 oooo000) {
        String str;
        try {
            str = (String) o00OO000.OooO00o.class.getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            str = "4.1.0";
        }
        this.f11217OooO00o = 0;
        this.f11219OooO0OO = new Handler(Looper.getMainLooper());
        this.f11216OooO = 0;
        this.f11218OooO0O0 = str;
        Context applicationContext = context.getApplicationContext();
        this.f11222OooO0o0 = applicationContext;
        this.f11220OooO0Oo = new o0000Ooo(applicationContext, oooo000);
        this.f11233OooOOo0 = z;
        this.f11232OooOOo = false;
    }

    public static Purchase.OooO00o OooO(OooO0o oooO0o, String str) {
        String strValueOf = String.valueOf(str);
        zzb.zzm("BillingClient", strValueOf.length() != 0 ? "Querying owned items, item type: ".concat(strValueOf) : new String("Querying owned items, item type: "));
        ArrayList arrayList = new ArrayList();
        Bundle bundleZzg = zzb.zzg(oooO0o.f11226OooOO0O, oooO0o.f11233OooOOo0, oooO0o.f11218OooO0O0);
        String string = null;
        do {
            try {
                Bundle bundleZzj = oooO0o.f11226OooOO0O ? oooO0o.f11221OooO0o.zzj(9, oooO0o.f11222OooO0o0.getPackageName(), str, string, bundleZzg) : oooO0o.f11221OooO0o.zzi(3, oooO0o.f11222OooO0o0.getPackageName(), str, string);
                OooOOO0 oooOOO0 = o000OOo.f11303OooOO0;
                if (bundleZzj == null) {
                    zzb.zzn("BillingClient", String.format("%s got null owned items list", "getPurchase()"));
                } else {
                    int iZzb = zzb.zzb(bundleZzj, "BillingClient");
                    String strZzj = zzb.zzj(bundleZzj, "BillingClient");
                    OooOOO0.OooO00o OooO00o2 = OooOOO0.OooO00o();
                    OooO00o2.f11238OooO00o = iZzb;
                    OooO00o2.f11239OooO0O0 = strZzj;
                    OooOOO0 oooOOO0OooO00o = OooO00o2.OooO00o();
                    if (iZzb != 0) {
                        zzb.zzn("BillingClient", String.format("%s failed. Response code: %s", "getPurchase()", Integer.valueOf(iZzb)));
                        oooOOO0 = oooOOO0OooO00o;
                    } else if (bundleZzj.containsKey("INAPP_PURCHASE_ITEM_LIST") && bundleZzj.containsKey("INAPP_PURCHASE_DATA_LIST") && bundleZzj.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                        ArrayList<String> stringArrayList = bundleZzj.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                        ArrayList<String> stringArrayList2 = bundleZzj.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        ArrayList<String> stringArrayList3 = bundleZzj.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                        if (stringArrayList == null) {
                            zzb.zzn("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", "getPurchase()"));
                        } else if (stringArrayList2 == null) {
                            zzb.zzn("BillingClient", String.format("Bundle returned from %s contains null purchases list.", "getPurchase()"));
                        } else if (stringArrayList3 == null) {
                            zzb.zzn("BillingClient", String.format("Bundle returned from %s contains null signatures list.", "getPurchase()"));
                        } else {
                            oooOOO0 = o000OOo.f11304OooOO0O;
                        }
                    } else {
                        zzb.zzn("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", "getPurchase()"));
                    }
                }
                if (oooOOO0 != o000OOo.f11304OooOO0O) {
                    return new Purchase.OooO00o(oooOOO0, null);
                }
                ArrayList<String> stringArrayList4 = bundleZzj.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList5 = bundleZzj.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList6 = bundleZzj.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                for (int i = 0; i < stringArrayList5.size(); i++) {
                    String str2 = stringArrayList5.get(i);
                    String str3 = stringArrayList6.get(i);
                    String strValueOf2 = String.valueOf(stringArrayList4.get(i));
                    zzb.zzm("BillingClient", strValueOf2.length() != 0 ? "Sku is owned: ".concat(strValueOf2) : new String("Sku is owned: "));
                    try {
                        Purchase purchase = new Purchase(str2, str3);
                        if (TextUtils.isEmpty(purchase.OooO0O0())) {
                            zzb.zzn("BillingClient", "BUG: empty/null token!");
                        }
                        arrayList.add(purchase);
                    } catch (JSONException e) {
                        zzb.zzo("BillingClient", "Got an exception trying to decode the purchase!", e);
                        return new Purchase.OooO00o(o000OOo.f11303OooOO0, null);
                    }
                }
                string = bundleZzj.getString("INAPP_CONTINUATION_TOKEN");
                String strValueOf3 = String.valueOf(string);
                zzb.zzm("BillingClient", strValueOf3.length() != 0 ? "Continuation token: ".concat(strValueOf3) : new String("Continuation token: "));
            } catch (Exception e2) {
                zzb.zzo("BillingClient", "Got exception trying to get purchasesm try to reconnect", e2);
                return new Purchase.OooO00o(o000OOo.f11305OooOO0o, null);
            }
        } while (!TextUtils.isEmpty(string));
        return new Purchase.OooO00o(o000OOo.f11304OooOO0O, arrayList);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final Purchase.OooO00o OooO00o() {
        if (!OooO0Oo()) {
            return new Purchase.OooO00o(o000OOo.f11305OooOO0o, null);
        }
        if (TextUtils.isEmpty(BillingClient.SkuType.SUBS)) {
            zzb.zzn("BillingClient", "Please provide a valid SKU type.");
            return new Purchase.OooO00o(o000OOo.f11299OooO0o, null);
        }
        try {
            return (Purchase.OooO00o) OooO0oo(new o00O0O(this), 5000L, null, this.f11219OooO0OO).get(5000L, TimeUnit.MILLISECONDS);
        } catch (CancellationException | TimeoutException unused) {
            return new Purchase.OooO00o(o000OOo.f11307OooOOO0, null);
        } catch (Exception unused2) {
            return new Purchase.OooO00o(o000OOo.f11303OooOO0, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void OooO0O0(Oooo0 oooo0, final o000oOoO o000oooo2) {
        if (!OooO0Oo()) {
            o000oooo2.onSkuDetailsResponse(o000OOo.f11305OooOO0o, null);
            return;
        }
        final String str = oooo0.f11242OooO00o;
        List<String> list = oooo0.f11243OooO0O0;
        if (TextUtils.isEmpty(str)) {
            zzb.zzn("BillingClient", "Please fix the input params. SKU type can't be empty.");
            o000oooo2.onSkuDetailsResponse(o000OOo.f11299OooO0o, null);
            return;
        }
        if (list == null) {
            zzb.zzn("BillingClient", "Please fix the input params. The list of SKUs can't be empty - set SKU list or SkuWithOffer list.");
            o000oooo2.onSkuDetailsResponse(o000OOo.f11300OooO0o0, null);
            return;
        }
        final ArrayList arrayList = new ArrayList();
        for (String str2 : list) {
            if (TextUtils.isEmpty(str2)) {
                throw new IllegalArgumentException("SKU must be set.");
            }
            arrayList.add(new o00000O0(str2));
        }
        if (OooO0oo(new Callable() { // from class: com.android.billingclient.api.o0000OO0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String strZzj;
                int iZzb;
                OooO0o oooO0o = this.f11277OooO00o;
                String str3 = str;
                List list2 = arrayList;
                o000oOoO o000oooo3 = o000oooo2;
                Objects.requireNonNull(oooO0o);
                ArrayList arrayList2 = new ArrayList();
                int size = list2.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        strZzj = "";
                        iZzb = 0;
                    } else {
                        int i2 = i + 20;
                        ArrayList arrayList3 = new ArrayList(list2.subList(i, i2 > size ? size : i2));
                        ArrayList<String> arrayList4 = new ArrayList<>();
                        int size2 = arrayList3.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList4.add(((o00000O0) arrayList3.get(i3)).f11264OooO00o);
                        }
                        Bundle bundle = new Bundle();
                        bundle.putStringArrayList("ITEM_ID_LIST", arrayList4);
                        bundle.putString("playBillingLibraryVersion", oooO0o.f11218OooO0O0);
                        try {
                            Bundle bundleZzl = oooO0o.f11227OooOO0o ? oooO0o.f11221OooO0o.zzl(10, oooO0o.f11222OooO0o0.getPackageName(), str3, bundle, zzb.zze(oooO0o.f11216OooO, oooO0o.f11233OooOOo0, oooO0o.f11218OooO0O0, null, arrayList3)) : oooO0o.f11221OooO0o.zzk(3, oooO0o.f11222OooO0o0.getPackageName(), str3, bundle);
                            if (bundleZzl == null) {
                                zzb.zzn("BillingClient", "querySkuDetailsAsync got null sku details list");
                            } else {
                                if (bundleZzl.containsKey("DETAILS_LIST")) {
                                    ArrayList<String> stringArrayList = bundleZzl.getStringArrayList("DETAILS_LIST");
                                    if (stringArrayList == null) {
                                        zzb.zzn("BillingClient", "querySkuDetailsAsync got null response list");
                                    } else {
                                        for (int i4 = 0; i4 < stringArrayList.size(); i4++) {
                                            try {
                                                SkuDetails skuDetails = new SkuDetails(stringArrayList.get(i4));
                                                zzb.zzm("BillingClient", "Got sku details: ".concat(skuDetails.toString()));
                                                arrayList2.add(skuDetails);
                                            } catch (JSONException e) {
                                                zzb.zzo("BillingClient", "Got a JSON exception trying to decode SkuDetails.", e);
                                                strZzj = "Error trying to decode SkuDetails.";
                                                arrayList2 = null;
                                            }
                                        }
                                        i = i2;
                                    }
                                } else {
                                    iZzb = zzb.zzb(bundleZzl, "BillingClient");
                                    strZzj = zzb.zzj(bundleZzl, "BillingClient");
                                    if (iZzb != 0) {
                                        StringBuilder sb = new StringBuilder(50);
                                        sb.append("getSkuDetails() failed. Response code: ");
                                        sb.append(iZzb);
                                        zzb.zzn("BillingClient", sb.toString());
                                    } else {
                                        zzb.zzn("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a detail list.");
                                    }
                                }
                                iZzb = 6;
                            }
                            iZzb = 4;
                            strZzj = "Item is unavailable for purchase.";
                        } catch (Exception e2) {
                            zzb.zzo("BillingClient", "querySkuDetailsAsync got a remote exception (try to reconnect).", e2);
                            iZzb = -1;
                            strZzj = "Service connection is disconnected.";
                        }
                        arrayList2 = null;
                    }
                    OooOOO0.OooO00o OooO00o2 = OooOOO0.OooO00o();
                    OooO00o2.f11238OooO00o = iZzb;
                    OooO00o2.f11239OooO0O0 = strZzj;
                    o000oooo3.onSkuDetailsResponse(OooO00o2.OooO00o(), arrayList2);
                    return null;
                }
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.o000O0o
            @Override // java.lang.Runnable
            public final void run() {
                o000oooo2.onSkuDetailsResponse(o000OOo.f11307OooOOO0, null);
            }
        }, OooO0o0()) == null) {
            o000oooo2.onSkuDetailsResponse(OooO0oO(), null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void OooO0OO(OooOO0 oooOO1) {
        ServiceInfo serviceInfo;
        if (OooO0Oo()) {
            zzb.zzm("BillingClient", "Service connection is valid. No need to re-initialize.");
            oooOO1.onBillingSetupFinished(o000OOo.f11304OooOO0O);
            return;
        }
        if (this.f11217OooO00o == 1) {
            zzb.zzn("BillingClient", "Client is already in the process of connecting to billing service.");
            oooOO1.onBillingSetupFinished(o000OOo.f11298OooO0Oo);
            return;
        }
        if (this.f11217OooO00o == 3) {
            zzb.zzn("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            oooOO1.onBillingSetupFinished(o000OOo.f11305OooOO0o);
            return;
        }
        this.f11217OooO00o = 1;
        o0000Ooo o0000ooo = this.f11220OooO0Oo;
        o00000OO o00000oo2 = o0000ooo.f11282OooO0O0;
        Context context = o0000ooo.f11281OooO00o;
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        if (!o00000oo2.f11266OooO0O0) {
            context.registerReceiver(o00000oo2.f11267OooO0OO.f11282OooO0O0, intentFilter);
            o00000oo2.f11266OooO0O0 = true;
        }
        zzb.zzm("BillingClient", "Starting in-app billing setup.");
        this.f11223OooO0oO = new o0OOO0o(this, oooOO1);
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        List<ResolveInfo> listQueryIntentServices = this.f11222OooO0o0.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty() && (serviceInfo = listQueryIntentServices.get(0).serviceInfo) != null) {
            String str = serviceInfo.packageName;
            String str2 = serviceInfo.name;
            if (!"com.android.vending".equals(str) || str2 == null) {
                zzb.zzn("BillingClient", "The device doesn't have valid Play Store.");
            } else {
                ComponentName componentName = new ComponentName(str, str2);
                Intent intent2 = new Intent(intent);
                intent2.setComponent(componentName);
                intent2.putExtra("playBillingLibraryVersion", this.f11218OooO0O0);
                if (this.f11222OooO0o0.bindService(intent2, this.f11223OooO0oO, 1)) {
                    zzb.zzm("BillingClient", "Service was bonded successfully.");
                    return;
                }
                zzb.zzn("BillingClient", "Connection to Billing service is blocked.");
            }
        }
        this.f11217OooO00o = 0;
        zzb.zzm("BillingClient", "Billing service unavailable on device.");
        oooOO1.onBillingSetupFinished(o000OOo.f11297OooO0OO);
    }

    public final boolean OooO0Oo() {
        return (this.f11217OooO00o != 2 || this.f11221OooO0o == null || this.f11223OooO0oO == null) ? false : true;
    }

    public final OooOOO0 OooO0o(final OooOOO0 oooOOO0) {
        if (Thread.interrupted()) {
            return oooOOO0;
        }
        this.f11219OooO0OO.post(new Runnable() { // from class: com.android.billingclient.api.o0000O
            @Override // java.lang.Runnable
            public final void run() {
                OooO0o oooO0o = this.f11268Oooo0o;
                OooOOO0 oooOOO1 = oooOOO0;
                if (oooO0o.f11220OooO0Oo.f11282OooO0O0.f11265OooO00o != null) {
                    oooO0o.f11220OooO0Oo.f11282OooO0O0.f11265OooO00o.onPurchasesUpdated(oooOOO1, null);
                } else {
                    Objects.requireNonNull(oooO0o.f11220OooO0Oo.f11282OooO0O0);
                    zzb.zzn("BillingClient", "No valid listener is set in BroadcastManager");
                }
            }
        });
        return oooOOO0;
    }

    public final Handler OooO0o0() {
        return Looper.myLooper() == null ? this.f11219OooO0OO : new Handler(Looper.myLooper());
    }

    public final OooOOO0 OooO0oO() {
        return (this.f11217OooO00o == 0 || this.f11217OooO00o == 3) ? o000OOo.f11305OooOO0o : o000OOo.f11303OooOO0;
    }

    @Nullable
    public final Future OooO0oo(Callable callable, long j, @Nullable final Runnable runnable, Handler handler) {
        long j2 = (long) (j * 0.95d);
        if (this.f11234OooOOoo == null) {
            this.f11234OooOOoo = Executors.newFixedThreadPool(zzb.zza, new o00Ooo());
        }
        try {
            final Future futureSubmit = this.f11234OooOOoo.submit(callable);
            handler.postDelayed(new Runnable() { // from class: com.android.billingclient.api.o000Oo0
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = futureSubmit;
                    Runnable runnable2 = runnable;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    future.cancel(true);
                    zzb.zzn("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, j2);
            return futureSubmit;
        } catch (Exception e) {
            zzb.zzo("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }
}
