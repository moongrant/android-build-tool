package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.AnyThread;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzu;
import com.google.android.gms.internal.play_billing.zzz;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o extends BillingClient {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f12719OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public volatile int f12720OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f12721OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Handler f12722OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile o0000OO0 f12723OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile zze f12724OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Context f12725OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public volatile o00000OO f12726OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f12727OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f12728OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f12729OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f12730OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f12731OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f12732OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f12733OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f12734OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f12735OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f12736OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f12737OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public boolean f12738OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public boolean f12739OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public ExecutorService f12740OooOo0O;

    @AnyThread
    public OooO0o(boolean z, Context context, o00Ooo o00ooo2) {
        String str;
        try {
            str = (String) o00OOOO.OooO00o.class.getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            str = "5.0.0";
        }
        this.f12720OooO00o = 0;
        this.f12722OooO0OO = new Handler(Looper.getMainLooper());
        this.f12728OooOO0 = 0;
        this.f12721OooO0O0 = str;
        Context applicationContext = context.getApplicationContext();
        this.f12725OooO0o0 = applicationContext;
        this.f12723OooO0Oo = new o0000OO0(applicationContext, o00ooo2);
        this.f12739OooOo00 = z;
        this.f12738OooOo0 = false;
    }

    public final OooOo00 OooO() {
        return (this.f12720OooO00o == 0 || this.f12720OooO00o == 3) ? o0000.f12790OooOO0o : o0000.f12788OooOO0;
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void OooO00o(o0ooOOo o0ooooo, final o0OOO0o o0ooo0o2) {
        if (!OooO0Oo()) {
            o0ooo0o2.onSkuDetailsResponse(o0000.f12790OooOO0o, null);
            return;
        }
        final String str = o0ooooo.f12853OooO00o;
        List<String> list = o0ooooo.f12854OooO0O0;
        if (TextUtils.isEmpty(str)) {
            zzb.zzo("BillingClient", "Please fix the input params. SKU type can't be empty.");
            o0ooo0o2.onSkuDetailsResponse(o0000.f12784OooO0o, null);
            return;
        }
        if (list == null) {
            zzb.zzo("BillingClient", "Please fix the input params. The list of SKUs can't be empty - set SKU list or SkuWithOffer list.");
            o0ooo0o2.onSkuDetailsResponse(o0000.f12785OooO0o0, null);
            return;
        }
        final ArrayList arrayList = new ArrayList();
        for (String str2 : list) {
            if (TextUtils.isEmpty(str2)) {
                throw new IllegalArgumentException("SKU must be set.");
            }
            arrayList.add(new o000OO(str2));
        }
        if (OooOO0(new Callable() { // from class: com.android.billingclient.api.o000
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String strZzk;
                int iZzb;
                OooO0o oooO0o = this.f12775OooO00o;
                String str3 = str;
                List list2 = arrayList;
                o0OOO0o o0ooo0o3 = o0ooo0o2;
                oooO0o.getClass();
                ArrayList arrayList2 = new ArrayList();
                int size = list2.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        strZzk = "";
                        iZzb = 0;
                    } else {
                        int i2 = i + 20;
                        ArrayList arrayList3 = new ArrayList(list2.subList(i, i2 > size ? size : i2));
                        ArrayList<String> arrayList4 = new ArrayList<>();
                        int size2 = arrayList3.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList4.add(((o000OO) arrayList3.get(i3)).f12834OooO00o);
                        }
                        Bundle bundle = new Bundle();
                        bundle.putStringArrayList("ITEM_ID_LIST", arrayList4);
                        bundle.putString("playBillingLibraryVersion", oooO0o.f12721OooO0O0);
                        try {
                            Bundle bundleZzl = oooO0o.f12731OooOOO ? oooO0o.f12724OooO0o.zzl(10, oooO0o.f12725OooO0o0.getPackageName(), str3, bundle, zzb.zze(oooO0o.f12728OooOO0, oooO0o.f12739OooOo00, oooO0o.f12721OooO0O0, null, arrayList3)) : oooO0o.f12724OooO0o.zzk(3, oooO0o.f12725OooO0o0.getPackageName(), str3, bundle);
                            if (bundleZzl == null) {
                                zzb.zzo("BillingClient", "querySkuDetailsAsync got null sku details list");
                            } else {
                                if (bundleZzl.containsKey("DETAILS_LIST")) {
                                    ArrayList<String> stringArrayList = bundleZzl.getStringArrayList("DETAILS_LIST");
                                    if (stringArrayList == null) {
                                        zzb.zzo("BillingClient", "querySkuDetailsAsync got null response list");
                                    } else {
                                        for (int i4 = 0; i4 < stringArrayList.size(); i4++) {
                                            try {
                                                SkuDetails skuDetails = new SkuDetails(stringArrayList.get(i4));
                                                zzb.zzn("BillingClient", "Got sku details: ".concat(skuDetails.toString()));
                                                arrayList2.add(skuDetails);
                                            } catch (JSONException e) {
                                                zzb.zzp("BillingClient", "Got a JSON exception trying to decode SkuDetails.", e);
                                                strZzk = "Error trying to decode SkuDetails.";
                                                arrayList2 = null;
                                            }
                                        }
                                        i = i2;
                                    }
                                } else {
                                    iZzb = zzb.zzb(bundleZzl, "BillingClient");
                                    strZzk = zzb.zzk(bundleZzl, "BillingClient");
                                    if (iZzb != 0) {
                                        zzb.zzo("BillingClient", "getSkuDetails() failed. Response code: " + iZzb);
                                    } else {
                                        zzb.zzo("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a detail list.");
                                    }
                                }
                                iZzb = 6;
                            }
                            iZzb = 4;
                            strZzk = "Item is unavailable for purchase.";
                        } catch (Exception e2) {
                            zzb.zzp("BillingClient", "querySkuDetailsAsync got a remote exception (try to reconnect).", e2);
                            strZzk = "Service connection is disconnected.";
                            iZzb = -1;
                        }
                        arrayList2 = null;
                    }
                    OooOo00.OooO00o oooO00oOooO0O0 = OooOo00.OooO0O0();
                    oooO00oOooO0O0.f12748OooO00o = iZzb;
                    oooO00oOooO0O0.f12749OooO0O0 = strZzk;
                    o0ooo0o3.onSkuDetailsResponse(oooO00oOooO0O0.OooO00o(), arrayList2);
                    return null;
                }
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.o0Oo0oo
            @Override // java.lang.Runnable
            public final void run() {
                o0ooo0o2.onSkuDetailsResponse(o0000.f12792OooOOO0, null);
            }
        }, OooO0oO()) == null) {
            o0ooo0o2.onSkuDetailsResponse(OooO(), null);
        }
    }

    public final void OooO0O0(final OooO0O0 oooO0O0, final OooO0OO oooO0OO) {
        if (!OooO0Oo()) {
            oooO0OO.OooO00o(o0000.f12790OooOO0o);
            return;
        }
        if (TextUtils.isEmpty(oooO0O0.f12718OooO00o)) {
            zzb.zzo("BillingClient", "Please provide a valid purchase token.");
            oooO0OO.OooO00o(o0000.f12779OooO);
        } else if (!this.f12732OooOOO0) {
            oooO0OO.OooO00o(o0000.f12781OooO0O0);
        } else if (OooOO0(new Callable() { // from class: com.android.billingclient.api.o000O00O
            @Override // java.util.concurrent.Callable
            public final Object call() {
                OooO0o oooO0o = this.f12829OooO00o;
                OooO0O0 oooO0O1 = oooO0O0;
                OooO0OO oooO0OO2 = oooO0OO;
                oooO0o.getClass();
                try {
                    Bundle bundleZzd = oooO0o.f12724OooO0o.zzd(9, oooO0o.f12725OooO0o0.getPackageName(), oooO0O1.f12718OooO00o, zzb.zzc(oooO0O1, oooO0o.f12721OooO0O0));
                    int iZzb = zzb.zzb(bundleZzd, "BillingClient");
                    String strZzk = zzb.zzk(bundleZzd, "BillingClient");
                    OooOo00.OooO00o oooO00oOooO0O0 = OooOo00.OooO0O0();
                    oooO00oOooO0O0.f12748OooO00o = iZzb;
                    oooO00oOooO0O0.f12749OooO0O0 = strZzk;
                    oooO0OO2.OooO00o(oooO00oOooO0O0.OooO00o());
                    return null;
                } catch (Exception e) {
                    zzb.zzp("BillingClient", "Error acknowledge purchase!", e);
                    oooO0OO2.OooO00o(o0000.f12790OooOO0o);
                    return null;
                }
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.o000O0
            @Override // java.lang.Runnable
            public final void run() {
                oooO0OO.OooO00o(o0000.f12792OooOOO0);
            }
        }, OooO0oO()) == null) {
            oooO0OO.OooO00o(OooO());
        }
    }

    public final void OooO0OO(final OooOo oooOo, final Oooo000 oooo000) {
        if (!OooO0Oo()) {
            oooo000.OooO00o(o0000.f12790OooOO0o, oooOo.f12745OooO00o);
        } else if (OooOO0(new Callable() { // from class: com.android.billingclient.api.o000Oo0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int iZza;
                String strZzk;
                OooO0o oooO0o = this.f12837OooO00o;
                OooOo oooOo2 = oooOo;
                Oooo000 oooo001 = oooo000;
                oooO0o.getClass();
                String str = oooOo2.f12745OooO00o;
                try {
                    zzb.zzn("BillingClient", "Consuming purchase with token: " + str);
                    if (oooO0o.f12732OooOOO0) {
                        Bundle bundleZze = oooO0o.f12724OooO0o.zze(9, oooO0o.f12725OooO0o0.getPackageName(), str, zzb.zzd(oooOo2, oooO0o.f12732OooOOO0, oooO0o.f12721OooO0O0));
                        iZza = bundleZze.getInt("RESPONSE_CODE");
                        strZzk = zzb.zzk(bundleZze, "BillingClient");
                    } else {
                        iZza = oooO0o.f12724OooO0o.zza(3, oooO0o.f12725OooO0o0.getPackageName(), str);
                        strZzk = "";
                    }
                    OooOo00.OooO00o oooO00oOooO0O0 = OooOo00.OooO0O0();
                    oooO00oOooO0O0.f12748OooO00o = iZza;
                    oooO00oOooO0O0.f12749OooO0O0 = strZzk;
                    OooOo00 oooOo00OooO00o = oooO00oOooO0O0.OooO00o();
                    if (iZza == 0) {
                        zzb.zzn("BillingClient", "Successfully consumed purchase.");
                        oooo001.OooO00o(oooOo00OooO00o, str);
                        return null;
                    }
                    zzb.zzo("BillingClient", "Error consuming purchase with token. Response code: " + iZza);
                    oooo001.OooO00o(oooOo00OooO00o, str);
                    return null;
                } catch (Exception e) {
                    zzb.zzp("BillingClient", "Error consuming purchase!", e);
                    oooo001.OooO00o(o0000.f12790OooOO0o, str);
                    return null;
                }
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.o000O00
            @Override // java.lang.Runnable
            public final void run() {
                oooo000.OooO00o(o0000.f12792OooOOO0, oooOo.f12745OooO00o);
            }
        }, OooO0oO()) == null) {
            oooo000.OooO00o(OooO(), oooOo.f12745OooO00o);
        }
    }

    public final boolean OooO0Oo() {
        return (this.f12720OooO00o != 2 || this.f12724OooO0o == null || this.f12726OooO0oO == null) ? false : true;
    }

    public final void OooO0o(OooOOOO oooOOOO) {
        ServiceInfo serviceInfo;
        if (OooO0Oo()) {
            zzb.zzn("BillingClient", "Service connection is valid. No need to re-initialize.");
            oooOOOO.onBillingSetupFinished(o0000.f12789OooOO0O);
            return;
        }
        if (this.f12720OooO00o == 1) {
            zzb.zzo("BillingClient", "Client is already in the process of connecting to billing service.");
            oooOOOO.onBillingSetupFinished(o0000.f12783OooO0Oo);
            return;
        }
        if (this.f12720OooO00o == 3) {
            zzb.zzo("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            oooOOOO.onBillingSetupFinished(o0000.f12790OooOO0o);
            return;
        }
        this.f12720OooO00o = 1;
        o0000OO0 o0000oo1 = this.f12723OooO0Oo;
        o0000oo1.getClass();
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        intentFilter.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        o0000O o0000o2 = o0000oo1.f12820OooO0O0;
        if (!o0000o2.f12815OooO0O0) {
            o0000oo1.f12819OooO00o.registerReceiver(o0000o2.f12816OooO0OO.f12820OooO0O0, intentFilter);
            o0000o2.f12815OooO0O0 = true;
        }
        zzb.zzn("BillingClient", "Starting in-app billing setup.");
        this.f12726OooO0oO = new o00000OO(this, oooOOOO);
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        List<ResolveInfo> listQueryIntentServices = this.f12725OooO0o0.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty() && (serviceInfo = listQueryIntentServices.get(0).serviceInfo) != null) {
            String str = serviceInfo.packageName;
            String str2 = serviceInfo.name;
            if (!"com.android.vending".equals(str) || str2 == null) {
                zzb.zzo("BillingClient", "The device doesn't have valid Play Store.");
            } else {
                ComponentName componentName = new ComponentName(str, str2);
                Intent intent2 = new Intent(intent);
                intent2.setComponent(componentName);
                intent2.putExtra("playBillingLibraryVersion", this.f12721OooO0O0);
                if (this.f12725OooO0o0.bindService(intent2, this.f12726OooO0oO, 1)) {
                    zzb.zzn("BillingClient", "Service was bonded successfully.");
                    return;
                }
                zzb.zzo("BillingClient", "Connection to Billing service is blocked.");
            }
        }
        this.f12720OooO00o = 0;
        zzb.zzn("BillingClient", "Billing service unavailable on device.");
        oooOOOO.onBillingSetupFinished(o0000.f12782OooO0OO);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x02d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:118:0x02e5  */
    public final OooOo00 OooO0o0(Activity activity, final BillingFlowParams billingFlowParams) {
        final String strOooO0OO;
        String strOptString;
        String str;
        Future futureOooOO0;
        String str2;
        SkuDetails skuDetails;
        BillingFlowParams.OooO0O0 oooO0O0;
        String str3;
        String str4;
        String str5;
        boolean z;
        zzu zzuVar;
        String str6;
        boolean z2;
        ProductDetails productDetails;
        String str7;
        int i;
        final OooO0o oooO0o = this;
        if (!OooO0Oo()) {
            OooOo00 oooOo00 = o0000.f12790OooOO0o;
            oooO0o.OooO0oo(oooOo00);
            return oooOo00;
        }
        ArrayList<SkuDetails> arrayList = new ArrayList();
        arrayList.addAll(billingFlowParams.f12698OooO0o);
        zzu zzuVar2 = billingFlowParams.f12699OooO0o0;
        SkuDetails skuDetails2 = (SkuDetails) zzz.zza(arrayList, null);
        BillingFlowParams.OooO0O0 oooO0O1 = (BillingFlowParams.OooO0O0) zzz.zza(zzuVar2, null);
        if (skuDetails2 != null) {
            strOptString = skuDetails2.f12774OooO0O0.optString("productId");
            strOooO0OO = skuDetails2.OooO0OO();
        } else {
            ProductDetails productDetails2 = oooO0O1.f12706OooO00o;
            String str8 = productDetails2.f12754OooO0OO;
            strOooO0OO = productDetails2.f12755OooO0Oo;
            strOptString = str8;
        }
        if (strOooO0OO.equals("subs") && !oooO0o.f12727OooO0oo) {
            zzb.zzo("BillingClient", "Current client doesn't support subscriptions.");
            OooOo00 oooOo01 = o0000.f12791OooOOO;
            oooO0o.OooO0oo(oooOo01);
            return oooOo01;
        }
        if (((billingFlowParams.f12695OooO0O0 == null && billingFlowParams.f12696OooO0OO == null && billingFlowParams.f12697OooO0Oo.f12711OooO0O0 == 0 && !billingFlowParams.f12694OooO00o && !billingFlowParams.f12700OooO0oO) ? false : true) && !oooO0o.f12729OooOO0O) {
            zzb.zzo("BillingClient", "Current client doesn't support extra params for buy intent.");
            OooOo00 oooOo02 = o0000.f12787OooO0oo;
            oooO0o.OooO0oo(oooOo02);
            return oooOo02;
        }
        if (arrayList.size() > 1 && !oooO0o.f12735OooOOo) {
            zzb.zzo("BillingClient", "Current client doesn't support multi-item purchases.");
            OooOo00 oooOo03 = o0000.f12795OooOOo;
            oooO0o.OooO0oo(oooOo03);
            return oooOo03;
        }
        if (!zzuVar2.isEmpty() && !oooO0o.f12737OooOOoo) {
            zzb.zzo("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            OooOo00 oooOo04 = o0000.f12799OooOo00;
            oooO0o.OooO0oo(oooOo04);
            return oooOo04;
        }
        boolean z3 = oooO0o.f12729OooOO0O;
        Handler handler = oooO0o.f12722OooO0OO;
        if (z3) {
            final Bundle bundleZzf = zzb.zzf(billingFlowParams, oooO0o.f12732OooOOO0, oooO0o.f12739OooOo00, oooO0o.f12738OooOo0, oooO0o.f12721OooO0O0);
            String str9 = "additionalSkuTypes";
            if (arrayList.isEmpty()) {
                str2 = "proxyPackageVersion";
                zzu zzuVar3 = zzuVar2;
                skuDetails = skuDetails2;
                oooO0O0 = oooO0O1;
                str3 = strOptString;
                str4 = strOooO0OO;
                str5 = "BillingClient";
                z = true;
                ArrayList<String> arrayList2 = new ArrayList<>(zzuVar3.size() - 1);
                ArrayList<String> arrayList3 = new ArrayList<>(zzuVar3.size() - 1);
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                int i2 = 0;
                while (i2 < zzuVar3.size()) {
                    zzu zzuVar4 = zzuVar3;
                    BillingFlowParams.OooO0O0 oooO0O2 = (BillingFlowParams.OooO0O0) zzuVar4.get(i2);
                    ProductDetails productDetails3 = oooO0O2.f12706OooO00o;
                    if (!productDetails3.f12756OooO0o.isEmpty()) {
                        arrayList4.add(productDetails3.f12756OooO0o);
                    }
                    arrayList5.add(oooO0O2.f12707OooO0O0);
                    if (i2 > 0) {
                        arrayList2.add(((BillingFlowParams.OooO0O0) zzuVar4.get(i2)).f12706OooO00o.f12754OooO0OO);
                        arrayList3.add(((BillingFlowParams.OooO0O0) zzuVar4.get(i2)).f12706OooO00o.f12755OooO0Oo);
                    }
                    i2++;
                    zzuVar3 = zzuVar4;
                }
                zzuVar = zzuVar3;
                bundleZzf.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList5);
                if (!arrayList4.isEmpty()) {
                    bundleZzf.putStringArrayList("skuDetailsTokens", arrayList4);
                }
                if (!arrayList2.isEmpty()) {
                    bundleZzf.putStringArrayList("additionalSkus", arrayList2);
                    bundleZzf.putStringArrayList("additionalSkuTypes", arrayList3);
                }
            } else {
                ArrayList<String> arrayList6 = new ArrayList<>();
                str4 = strOooO0OO;
                ArrayList<String> arrayList7 = new ArrayList<>();
                str3 = strOptString;
                ArrayList<String> arrayList8 = new ArrayList<>();
                str2 = "proxyPackageVersion";
                ArrayList<Integer> arrayList9 = new ArrayList<>();
                str5 = "BillingClient";
                ArrayList<String> arrayList10 = new ArrayList<>();
                boolean z4 = false;
                boolean z5 = false;
                boolean z6 = false;
                boolean z7 = false;
                for (SkuDetails skuDetails3 : arrayList) {
                    BillingFlowParams.OooO0O0 oooO0O3 = oooO0O1;
                    SkuDetails skuDetails4 = skuDetails2;
                    boolean zIsEmpty = skuDetails3.f12774OooO0O0.optString("skuDetailsToken").isEmpty();
                    JSONObject jSONObject = skuDetails3.f12774OooO0O0;
                    if (!zIsEmpty) {
                        arrayList6.add(jSONObject.optString("skuDetailsToken"));
                    }
                    String strOptString2 = jSONObject.optString("offerIdToken");
                    if (strOptString2.isEmpty()) {
                        strOptString2 = jSONObject.optString("offer_id_token");
                    }
                    String strOptString3 = jSONObject.optString("offer_id");
                    zzu zzuVar5 = zzuVar2;
                    int iOptInt = jSONObject.optInt("offer_type");
                    String str10 = str9;
                    String strOptString4 = jSONObject.optString("serializedDocid");
                    arrayList7.add(strOptString2);
                    z4 |= !TextUtils.isEmpty(strOptString2);
                    arrayList8.add(strOptString3);
                    z5 |= !TextUtils.isEmpty(strOptString3);
                    arrayList9.add(Integer.valueOf(iOptInt));
                    z6 |= iOptInt != 0;
                    z7 |= !TextUtils.isEmpty(strOptString4);
                    arrayList10.add(strOptString4);
                    skuDetails2 = skuDetails4;
                    oooO0O1 = oooO0O3;
                    zzuVar2 = zzuVar5;
                    str9 = str10;
                }
                zzu zzuVar6 = zzuVar2;
                skuDetails = skuDetails2;
                oooO0O0 = oooO0O1;
                String str11 = str9;
                if (!arrayList6.isEmpty()) {
                    bundleZzf.putStringArrayList("skuDetailsTokens", arrayList6);
                }
                if (z4) {
                    bundleZzf.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList7);
                }
                if (z5) {
                    bundleZzf.putStringArrayList("SKU_OFFER_ID_LIST", arrayList8);
                }
                if (z6) {
                    bundleZzf.putIntegerArrayList("SKU_OFFER_TYPE_LIST", arrayList9);
                }
                if (z7) {
                    bundleZzf.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList10);
                }
                z = true;
                if (arrayList.size() > 1) {
                    ArrayList<String> arrayList11 = new ArrayList<>(arrayList.size() - 1);
                    ArrayList<String> arrayList12 = new ArrayList<>(arrayList.size() - 1);
                    for (int i3 = 1; i3 < arrayList.size(); i3++) {
                        arrayList11.add(((SkuDetails) arrayList.get(i3)).f12774OooO0O0.optString("productId"));
                        arrayList12.add(((SkuDetails) arrayList.get(i3)).OooO0OO());
                    }
                    bundleZzf.putStringArrayList("additionalSkus", arrayList11);
                    bundleZzf.putStringArrayList(str11, arrayList12);
                }
                zzuVar = zzuVar6;
            }
            oooO0o = this;
            if (bundleZzf.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !oooO0o.f12734OooOOOo) {
                OooOo00 oooOo05 = o0000.f12797OooOOoo;
                oooO0o.OooO0oo(oooOo05);
                return oooOo05;
            }
            if (skuDetails != null) {
                JSONObject jSONObject2 = skuDetails.f12774OooO0O0;
                if (TextUtils.isEmpty(jSONObject2.optString(RemoteConfigConstants$RequestFieldKey.PACKAGE_NAME))) {
                    if (oooO0O0 != null) {
                        productDetails = oooO0O0.f12706OooO00o;
                        if (!TextUtils.isEmpty(productDetails.f12753OooO0O0.optString(RemoteConfigConstants$RequestFieldKey.PACKAGE_NAME))) {
                            bundleZzf.putString("skuPackageName", productDetails.f12753OooO0O0.optString(RemoteConfigConstants$RequestFieldKey.PACKAGE_NAME));
                        }
                    }
                    str6 = null;
                    z2 = false;
                } else {
                    bundleZzf.putString("skuPackageName", jSONObject2.optString(RemoteConfigConstants$RequestFieldKey.PACKAGE_NAME));
                }
                z2 = z;
                str6 = null;
            } else {
                if (oooO0O0 != null) {
                    productDetails = oooO0O0.f12706OooO00o;
                    if (!TextUtils.isEmpty(productDetails.f12753OooO0O0.optString(RemoteConfigConstants$RequestFieldKey.PACKAGE_NAME))) {
                        bundleZzf.putString("skuPackageName", productDetails.f12753OooO0O0.optString(RemoteConfigConstants$RequestFieldKey.PACKAGE_NAME));
                        z2 = z;
                        str6 = null;
                    }
                }
                str6 = null;
                z2 = false;
            }
            if (!TextUtils.isEmpty(str6)) {
                bundleZzf.putString("accountName", str6);
            }
            Intent intent = activity.getIntent();
            if (intent == null) {
                str = str5;
                zzb.zzo(str, "Activity's intent is null.");
            } else {
                str = str5;
                if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                    String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                    bundleZzf.putString("proxyPackage", stringExtra);
                    try {
                        str7 = str2;
                        try {
                            bundleZzf.putString(str7, oooO0o.f12725OooO0o0.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                        } catch (PackageManager.NameNotFoundException unused) {
                            bundleZzf.putString(str7, "package not found");
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
                        str7 = str2;
                    }
                }
            }
            if (oooO0o.f12737OooOOoo && !zzuVar.isEmpty()) {
                i = 17;
            } else if (oooO0o.f12736OooOOo0 && z2) {
                i = 15;
            } else {
                i = oooO0o.f12732OooOOO0 ? 9 : 6;
            }
            final int i4 = i;
            final String str12 = str3;
            final String str13 = str4;
            futureOooOO0 = OooOO0(new Callable(i4, str12, str13, billingFlowParams, bundleZzf) { // from class: com.android.billingclient.api.o0OO00O

                /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
                public final /* synthetic */ int f12846OooO0O0;

                /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
                public final /* synthetic */ String f12847OooO0OO;

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public final /* synthetic */ String f12848OooO0Oo;

                /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                public final /* synthetic */ Bundle f12849OooO0o0;

                {
                    this.f12849OooO0o0 = bundleZzf;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    OooO0o oooO0o2 = this.f12845OooO00o;
                    return oooO0o2.f12724OooO0o.zzg(this.f12846OooO0O0, oooO0o2.f12725OooO0o0.getPackageName(), this.f12847OooO0OO, this.f12848OooO0Oo, null, this.f12849OooO0o0);
                }
            }, 5000L, null, handler);
        } else {
            final String str14 = strOptString;
            str = "BillingClient";
            futureOooOO0 = OooOO0(new Callable() { // from class: com.android.billingclient.api.oo0o0Oo
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    OooO0o oooO0o2 = this.f12863OooO00o;
                    return oooO0o2.f12724OooO0o.zzf(3, oooO0o2.f12725OooO0o0.getPackageName(), str14, strOooO0OO, null);
                }
            }, 5000L, null, handler);
        }
        try {
            Bundle bundle = (Bundle) futureOooOO0.get(5000L, TimeUnit.MILLISECONDS);
            int iZzb = zzb.zzb(bundle, str);
            String strZzk = zzb.zzk(bundle, str);
            if (iZzb == 0) {
                Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                intent2.putExtra("BUY_INTENT", (PendingIntent) bundle.getParcelable("BUY_INTENT"));
                activity.startActivity(intent2);
                return o0000.f12789OooOO0O;
            }
            zzb.zzo(str, "Unable to buy item, Error response code: " + iZzb);
            OooOo00 oooOo06 = new OooOo00();
            oooOo06.f12746OooO00o = iZzb;
            oooOo06.f12747OooO0O0 = strZzk;
            oooO0o.OooO0oo(oooOo06);
            return oooOo06;
        } catch (CancellationException e) {
            e = e;
            zzb.zzp(str, "Time out while launching billing flow. Try to reconnect", e);
            OooOo00 oooOo07 = o0000.f12792OooOOO0;
            oooO0o.OooO0oo(oooOo07);
            return oooOo07;
        } catch (TimeoutException e2) {
            e = e2;
            zzb.zzp(str, "Time out while launching billing flow. Try to reconnect", e);
            OooOo00 oooOo08 = o0000.f12792OooOOO0;
            oooO0o.OooO0oo(oooOo08);
            return oooOo08;
        } catch (Exception e3) {
            zzb.zzp(str, "Exception while launching billing flow. Try to reconnect", e3);
            OooOo00 oooOo09 = o0000.f12790OooOO0o;
            oooO0o.OooO0oo(oooOo09);
            return oooOo09;
        }
    }

    public final Handler OooO0oO() {
        return Looper.myLooper() == null ? this.f12722OooO0OO : new Handler(Looper.myLooper());
    }

    public final void OooO0oo(final OooOo00 oooOo00) {
        if (Thread.interrupted()) {
            return;
        }
        this.f12722OooO0OO.post(new Runnable() { // from class: com.android.billingclient.api.o000000
            @Override // java.lang.Runnable
            public final void run() {
                OooO0o oooO0o = this.f12803OooO0Oo;
                OooOo00 oooOo01 = oooOo00;
                if (oooO0o.f12723OooO0Oo.f12820OooO0O0.f12814OooO00o != null) {
                    oooO0o.f12723OooO0Oo.f12820OooO0O0.f12814OooO00o.onPurchasesUpdated(oooOo01, null);
                    return;
                }
                o0000OO0 o0000oo1 = oooO0o.f12723OooO0Oo;
                o0000oo1.getClass();
                int i = o0000O.f12813OooO0Oo;
                o0000oo1.f12820OooO0O0.getClass();
                zzb.zzo("BillingClient", "No valid listener is set in BroadcastManager");
            }
        });
    }

    @Nullable
    public final Future OooOO0(Callable callable, long j, @Nullable final Runnable runnable, Handler handler) {
        long j2 = (long) (j * 0.95d);
        if (this.f12740OooOo0O == null) {
            this.f12740OooOo0O = Executors.newFixedThreadPool(zzb.zza, new o00000());
        }
        try {
            final Future futureSubmit = this.f12740OooOo0O.submit(callable);
            handler.postDelayed(new Runnable() { // from class: com.android.billingclient.api.o000OOo
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = futureSubmit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    future.cancel(true);
                    zzb.zzo("BillingClient", "Async task is taking too long, cancel it!");
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, j2);
            return futureSubmit;
        } catch (Exception e) {
            zzb.zzp("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    public final void OooOO0O(String str, final o00O0O o00o0o2) {
        if (!OooO0Oo()) {
            o00o0o2.OooO00o(o0000.f12790OooOO0o, zzu.zzl());
            return;
        }
        if (TextUtils.isEmpty(str)) {
            zzb.zzo("BillingClient", "Please provide a valid product type.");
            o00o0o2.OooO00o(o0000.f12786OooO0oO, zzu.zzl());
        } else if (OooOO0(new o000000O(this, str, o00o0o2), 30000L, new Runnable() { // from class: com.android.billingclient.api.o0O0O00
            @Override // java.lang.Runnable
            public final void run() {
                o00o0o2.OooO00o(o0000.f12792OooOOO0, zzu.zzl());
            }
        }, OooO0oO()) == null) {
            o00o0o2.OooO00o(OooO(), zzu.zzl());
        }
    }
}
