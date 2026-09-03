package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class SkuDetails {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f9682OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final JSONObject f9683OooO0O0;

    public SkuDetails(@NonNull String str) throws JSONException {
        this.f9682OooO00o = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f9683OooO0O0 = jSONObject;
        if (TextUtils.isEmpty(jSONObject.optString("productId"))) {
            throw new IllegalArgumentException("SKU cannot be empty.");
        }
        if (TextUtils.isEmpty(jSONObject.optString("type"))) {
            throw new IllegalArgumentException("SkuType cannot be empty.");
        }
    }

    public final long OooO00o() {
        return this.f9683OooO0O0.optLong("price_amount_micros");
    }

    @NonNull
    public final String OooO0O0() {
        return this.f9683OooO0O0.optString("price_currency_code");
    }

    @NonNull
    public final String OooO0OO() {
        return this.f9683OooO0O0.optString("type");
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SkuDetails) {
            return TextUtils.equals(this.f9682OooO00o, ((SkuDetails) obj).f9682OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9682OooO00o.hashCode();
    }

    @NonNull
    public final String toString() {
        return "SkuDetails: ".concat(String.valueOf(this.f9682OooO00o));
    }
}
