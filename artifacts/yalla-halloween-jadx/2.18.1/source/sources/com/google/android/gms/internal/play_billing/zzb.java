package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.InAppMessageResult;
import com.android.billingclient.api.OooOOO;
import com.android.billingclient.api.OooOOO0;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzb {
    public static final int zza = Runtime.getRuntime().availableProcessors();

    @Nullable
    public static Purchase OooO00o(String str, String str2) {
        if (str == null || str2 == null) {
            zzm("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e) {
            zzn("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e.toString()));
            return null;
        }
    }

    public static int zza(Intent intent, String str) {
        if (intent == null) {
            zzn("ProxyBillingActivity", "Got null intent!");
            return 0;
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            return extras.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
        }
        zzn("ProxyBillingActivity", "Unexpected null bundle received!");
        return 0;
    }

    public static int zzb(Bundle bundle, String str) {
        if (bundle == null) {
            zzn(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            zzm(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        String name = obj.getClass().getName();
        zzn(str, name.length() != 0 ? "Unexpected type for bundle response code: ".concat(name) : new String("Unexpected type for bundle response code: "));
        return 6;
    }

    public static Bundle zzc(com.android.billingclient.api.OooO0O0 oooO0O0, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        return bundle;
    }

    public static Bundle zzd(OooOOO oooOOO, boolean z, String str) {
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
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add(null);
                z2 |= !TextUtils.isEmpty(null);
                arrayList3.add(null);
                z3 |= !TextUtils.isEmpty(null);
                arrayList4.add(0);
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
        int i = billingFlowParams.f11204OooO0o0;
        if (i != 0) {
            bundle.putInt("prorationMode", i);
        }
        if (!TextUtils.isEmpty(billingFlowParams.f11200OooO0O0)) {
            bundle.putString("accountId", billingFlowParams.f11200OooO0O0);
        }
        if (!TextUtils.isEmpty(billingFlowParams.f11202OooO0Oo)) {
            bundle.putString("obfuscatedProfileId", billingFlowParams.f11202OooO0Oo);
        }
        if (billingFlowParams.f11206OooO0oo) {
            bundle.putBoolean("vr", true);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
        }
        if (!TextUtils.isEmpty(billingFlowParams.f11201OooO0OO)) {
            bundle.putString("oldSkuPurchaseToken", billingFlowParams.f11201OooO0OO);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("oldSkuPurchaseId", null);
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

    public static Bundle zzg(boolean z, boolean z2, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (z && z2) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    public static OooOOO0 zzh(Intent intent, String str) {
        if (intent != null) {
            OooOOO0.OooO00o OooO00o2 = OooOOO0.OooO00o();
            OooO00o2.f11238OooO00o = zzb(intent.getExtras(), str);
            OooO00o2.f11239OooO0O0 = zzj(intent.getExtras(), str);
            return OooO00o2.OooO00o();
        }
        zzn("BillingHelper", "Got null intent!");
        OooOOO0.OooO00o OooO00o3 = OooOOO0.OooO00o();
        OooO00o3.f11238OooO00o = 6;
        OooO00o3.f11239OooO0O0 = "An internal error occurred.";
        return OooO00o3.OooO00o();
    }

    public static InAppMessageResult zzi(Bundle bundle, String str) {
        if (bundle == null) {
            return new InAppMessageResult();
        }
        bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
        bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN");
        return new InAppMessageResult();
    }

    public static String zzj(Bundle bundle, String str) {
        if (bundle == null) {
            zzn(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            zzm(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        String name = obj.getClass().getName();
        zzn(str, name.length() != 0 ? "Unexpected type for debug message: ".concat(name) : new String("Unexpected type for debug message: "));
        return "";
    }

    public static String zzk(int i) {
        return o0OO0.OooO00o.OooO00o(i).toString();
    }

    @Nullable
    public static List zzl(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            Purchase purchaseOooO00o = OooO00o(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (purchaseOooO00o == null) {
                zzm("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(purchaseOooO00o);
        } else {
            int size = stringArrayList.size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Found purchase list of ");
            sb.append(size);
            sb.append(" items");
            zzm("BillingHelper", sb.toString());
            for (int i = 0; i < stringArrayList.size() && i < stringArrayList2.size(); i++) {
                Purchase purchaseOooO00o2 = OooO00o(stringArrayList.get(i), stringArrayList2.get(i));
                if (purchaseOooO00o2 != null) {
                    arrayList.add(purchaseOooO00o2);
                }
            }
        }
        return arrayList;
    }

    public static void zzm(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            Log.v(str, str2);
        }
    }

    public static void zzn(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void zzo(String str, String str2, Throwable th) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2, th);
        }
    }
}
