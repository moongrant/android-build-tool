package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class SkuDetails {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f11254OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final JSONObject f11255OooO0O0;

    public SkuDetails(@NonNull String str) throws JSONException {
        this.f11254OooO00o = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f11255OooO0O0 = jSONObject;
        if (TextUtils.isEmpty(jSONObject.optString("productId"))) {
            throw new IllegalArgumentException("SKU cannot be empty.");
        }
        if (TextUtils.isEmpty(jSONObject.optString("type"))) {
            throw new IllegalArgumentException("SkuType cannot be empty.");
        }
    }

    @NonNull
    public final String OooO00o() {
        return this.f11255OooO0O0.optString("price_currency_code");
    }

    @NonNull
    public final String OooO0O0() {
        return this.f11255OooO0O0.optString("productId");
    }

    @NonNull
    public final String OooO0OO() {
        return this.f11255OooO0O0.optString("type");
    }

    @NonNull
    public final String OooO0Oo() {
        return this.f11255OooO0O0.optString("packageName");
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SkuDetails) {
            return TextUtils.equals(this.f11254OooO00o, ((SkuDetails) obj).f11254OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11254OooO00o.hashCode();
    }

    @NonNull
    public final String toString() {
        String strValueOf = String.valueOf(this.f11254OooO00o);
        return strValueOf.length() != 0 ? "SkuDetails: ".concat(strValueOf) : new String("SkuDetails: ");
    }
}
