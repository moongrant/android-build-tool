package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.share.internal.ShareConstants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@zzj
public final class ProductDetails {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f9661OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final JSONObject f9662OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f9663OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f9664OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f9665OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f9666OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final ArrayList f9667OooO0oO;

    @zzg
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f9668OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f9669OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final String f9670OooO0OO;

        public OooO00o(JSONObject jSONObject) {
            jSONObject.optString("formattedPrice");
            this.f9668OooO00o = jSONObject.optLong("priceAmountMicros");
            this.f9669OooO0O0 = jSONObject.optString("priceCurrencyCode");
            this.f9670OooO0OO = jSONObject.optString("offerIdToken");
            jSONObject.optString("offerId");
            jSONObject.optInt("offerType");
        }
    }

    @zzj
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f9671OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f9672OooO0O0;

        public OooO0O0(JSONObject jSONObject) {
            jSONObject.optString("billingPeriod");
            this.f9672OooO0O0 = jSONObject.optString("priceCurrencyCode");
            jSONObject.optString("formattedPrice");
            this.f9671OooO00o = jSONObject.optLong("priceAmountMicros");
            jSONObject.optInt("recurrenceMode");
            jSONObject.optInt("billingCycleCount");
        }
    }

    @zzj
    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList f9673OooO00o;

        public OooO0OO(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        arrayList.add(new OooO0O0(jSONObjectOptJSONObject));
                    }
                }
            }
            this.f9673OooO00o = arrayList;
        }
    }

    @zzj
    public static final class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f9674OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooO0OO f9675OooO0O0;

        public OooO0o(JSONObject jSONObject) throws JSONException {
            this.f9674OooO00o = jSONObject.getString("offerIdToken");
            this.f9675OooO0O0 = new OooO0OO(jSONObject.getJSONArray("pricingPhases"));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            if (jSONObjectOptJSONObject != null) {
                jSONObjectOptJSONObject.getInt("commitmentPaymentsCount");
                jSONObjectOptJSONObject.optInt("subsequentCommitmentPaymentsCount");
            }
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i));
                }
            }
        }
    }

    @zzj
    @Retention(RetentionPolicy.SOURCE)
    public @interface RecurrenceMode {

        @zzj
        public static final int FINITE_RECURRING = 2;

        @zzj
        public static final int INFINITE_RECURRING = 1;

        @zzj
        public static final int NON_RECURRING = 3;
    }

    public ProductDetails(String str) throws JSONException {
        this.f9661OooO00o = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f9662OooO0O0 = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.f9663OooO0OO = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.f9664OooO0Oo = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f9666OooO0o0 = jSONObject.optString(ShareConstants.WEB_DIALOG_PARAM_TITLE);
        jSONObject.optString("name");
        jSONObject.optString("description");
        this.f9665OooO0o = jSONObject.optString("skuDetailsToken");
        if (strOptString2.equals("inapp")) {
            this.f9667OooO0oO = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(new OooO0o(jSONArrayOptJSONArray.getJSONObject(i)));
            }
        }
        this.f9667OooO0oO = arrayList;
    }

    @Nullable
    @zzg
    public final OooO00o OooO00o() {
        JSONObject jSONObjectOptJSONObject = this.f9662OooO0O0.optJSONObject("oneTimePurchaseOfferDetails");
        if (jSONObjectOptJSONObject != null) {
            return new OooO00o(jSONObjectOptJSONObject);
        }
        return null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProductDetails) {
            return TextUtils.equals(this.f9661OooO00o, ((ProductDetails) obj).f9661OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9661OooO00o.hashCode();
    }

    @NonNull
    public final String toString() {
        String string = this.f9662OooO0O0.toString();
        String strValueOf = String.valueOf(this.f9667OooO0oO);
        StringBuilder sb = new StringBuilder("ProductDetails{jsonString='");
        OooO0OO.OooO0O0.OooO00o(sb, this.f9661OooO00o, "', parsedJson=", string, ", productId='");
        sb.append(this.f9663OooO0OO);
        sb.append("', productType='");
        sb.append(this.f9664OooO0Oo);
        sb.append("', title='");
        sb.append(this.f9666OooO0o0);
        sb.append("', productDetailsToken='");
        return androidx.compose.material.OooO00o.OooO0O0(sb, this.f9665OooO0o, "', subscriptionOfferDetails=", strValueOf, "}");
    }
}
