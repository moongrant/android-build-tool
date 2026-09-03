package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Purchase {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f12770OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f12771OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final JSONObject f12772OooO0OO;

    @Retention(RetentionPolicy.SOURCE)
    public @interface PurchaseState {
        public static final int PENDING = 2;
        public static final int PURCHASED = 1;
        public static final int UNSPECIFIED_STATE = 0;
    }

    public Purchase(@NonNull String str, @NonNull String str2) throws JSONException {
        this.f12770OooO00o = str;
        this.f12771OooO0O0 = str2;
        this.f12772OooO0OO = new JSONObject(str);
    }

    @Nullable
    public final OooO00o OooO00o() {
        JSONObject jSONObject = this.f12772OooO0OO;
        String strOptString = jSONObject.optString("obfuscatedAccountId");
        String strOptString2 = jSONObject.optString("obfuscatedProfileId");
        if (strOptString == null && strOptString2 == null) {
            return null;
        }
        return new OooO00o(strOptString, strOptString2);
    }

    public final int OooO0O0() {
        return this.f12772OooO0OO.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    @NonNull
    public final String OooO0OO() {
        JSONObject jSONObject = this.f12772OooO0OO;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public final ArrayList OooO0Oo() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.f12772OooO0OO;
        if (jSONObject.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i));
                }
            }
        } else if (jSONObject.has("productId")) {
            arrayList.add(jSONObject.optString("productId"));
        }
        return arrayList;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f12770OooO00o, purchase.f12770OooO00o) && TextUtils.equals(this.f12771OooO0O0, purchase.f12771OooO0O0);
    }

    public final int hashCode() {
        return this.f12770OooO00o.hashCode();
    }

    @NonNull
    public final String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f12770OooO00o));
    }
}
