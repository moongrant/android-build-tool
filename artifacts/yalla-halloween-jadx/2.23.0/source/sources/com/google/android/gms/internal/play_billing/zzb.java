package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.InAppMessageResult;
import com.android.billingclient.api.OooOo;
import com.android.billingclient.api.OooOo00;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import p003OooO0o0.o0O0O00;
import p267o00oooo0.o0oO0Ooo;

/* JADX INFO: loaded from: classes3.dex */
public final class zzb {
    public static final int zza = Runtime.getRuntime().availableProcessors();

    @Nullable
    public static Purchase OooO00o(String str, String str2) {
        if (str == null || str2 == null) {
            zzn("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e) {
            zzo("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e.toString()));
            return null;
        }
    }

    public static int zza(Intent intent, String str) {
        if (intent == null) {
            zzo("ProxyBillingActivity", "Got null intent!");
            return 0;
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            return extras.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
        }
        zzo("ProxyBillingActivity", "Unexpected null bundle received!");
        return 0;
    }

    public static int zzb(Bundle bundle, String str) {
        if (bundle == null) {
            zzo(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            zzn(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        zzo(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
        return 6;
    }

    public static Bundle zzc(com.android.billingclient.api.OooO0O0 oooO0O0, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        return bundle;
    }

    public static Bundle zzd(OooOo oooOo, boolean z, String str) {
        Bundle bundle = new Bundle();
        if (z) {
            bundle.putString("playBillingLibraryVersion", str);
        }
        return bundle;
    }

    public static Bundle zze(int i, boolean z, String str, @Nullable String str2, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        if (i >= 9) {
            bundle.putString("playBillingLibraryVersion", str);
        }
        if (i >= 9 && z) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (i >= 14) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            ArrayList<String> arrayList3 = new ArrayList<>();
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            boolean z2 = false;
            boolean z3 = false;
            for (int iOooO00o = 0; iOooO00o < size; iOooO00o = o0O0O00.OooO00o(0, arrayList4, iOooO00o, 1)) {
                arrayList2.add(null);
                z2 |= !TextUtils.isEmpty(null);
                arrayList3.add(null);
                z3 |= !TextUtils.isEmpty(null);
            }
            if (z2) {
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
            }
            if (z3) {
                bundle.putStringArrayList("SKU_OFFER_ID_LIST", arrayList3);
            }
        }
        return bundle;
    }

    public static Bundle zzf(BillingFlowParams billingFlowParams, boolean z, boolean z2, boolean z3, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        int i = billingFlowParams.f9606OooO0Oo.f9620OooO0O0;
        if (i != 0) {
            bundle.putInt("prorationMode", i);
        }
        if (!TextUtils.isEmpty(billingFlowParams.f9604OooO0O0)) {
            bundle.putString("accountId", billingFlowParams.f9604OooO0O0);
        }
        if (!TextUtils.isEmpty(billingFlowParams.f9605OooO0OO)) {
            bundle.putString("obfuscatedProfileId", billingFlowParams.f9605OooO0OO);
        }
        if (billingFlowParams.f9609OooO0oO) {
            bundle.putBoolean("isOfferPersonalizedByDeveloper", true);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
        }
        if (!TextUtils.isEmpty(billingFlowParams.f9606OooO0Oo.f9619OooO00o)) {
            bundle.putString("oldSkuPurchaseToken", billingFlowParams.f9606OooO0Oo.f9619OooO00o);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("oldSkuPurchaseId", null);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("originalExternalTransactionId", null);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("paymentsPurchaseParams", null);
        }
        if (z && z2) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (z3) {
            bundle.putBoolean("enableAlternativeBilling", true);
        }
        return bundle;
    }

    public static Bundle zzg(String str, ArrayList arrayList, @Nullable String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        bundle.putBoolean("enablePendingPurchases", true);
        bundle.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
            z |= !TextUtils.isEmpty(null);
        }
        if (z) {
            bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
        }
        return bundle;
    }

    public static Bundle zzh(boolean z, boolean z2, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (z && z2) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    public static OooOo00 zzi(Intent intent, String str) {
        if (intent != null) {
            OooOo00.OooO00o oooO00oOooO0O0 = OooOo00.OooO0O0();
            oooO00oOooO0O0.f9657OooO00o = zzb(intent.getExtras(), str);
            oooO00oOooO0O0.f9658OooO0O0 = zzk(intent.getExtras(), str);
            return oooO00oOooO0O0.OooO00o();
        }
        zzo("BillingHelper", "Got null intent!");
        OooOo00.OooO00o oooO00oOooO0O1 = OooOo00.OooO0O0();
        oooO00oOooO0O1.f9657OooO00o = 6;
        oooO00oOooO0O1.f9658OooO0O0 = "An internal error occurred.";
        return oooO00oOooO0O1.OooO00o();
    }

    public static InAppMessageResult zzj(Bundle bundle, String str) {
        if (bundle == null) {
            return new InAppMessageResult();
        }
        bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
        bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN");
        return new InAppMessageResult();
    }

    public static String zzk(Bundle bundle, String str) {
        if (bundle == null) {
            zzo(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            zzn(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        zzo(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return "";
    }

    public static String zzl(int i) {
        return o0oO0Ooo.OooO00o(i).toString();
    }

    @Nullable
    public static List zzm(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            Purchase purchaseOooO00o = OooO00o(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (purchaseOooO00o == null) {
                zzn("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(purchaseOooO00o);
        } else {
            zzn("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
            for (int i = 0; i < stringArrayList.size() && i < stringArrayList2.size(); i++) {
                Purchase purchaseOooO00o2 = OooO00o(stringArrayList.get(i), stringArrayList2.get(i));
                if (purchaseOooO00o2 != null) {
                    arrayList.add(purchaseOooO00o2);
                }
            }
        }
        return arrayList;
    }

    public static void zzn(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            if (str2.isEmpty()) {
                Log.v(str, str2);
                return;
            }
            int i = 40000;
            while (!str2.isEmpty() && i > 0) {
                int iMin = Math.min(str2.length(), Math.min(4000, i));
                Log.v(str, str2.substring(0, iMin));
                str2 = str2.substring(iMin);
                i -= iMin;
            }
        }
    }

    public static void zzo(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void zzp(String str, String str2, Throwable th) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2, th);
        }
    }
}
