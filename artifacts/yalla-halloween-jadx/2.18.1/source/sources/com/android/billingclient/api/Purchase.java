package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Purchase {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f11249OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f11250OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final JSONObject f11251OooO0OO;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public final List f11252OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooOOO0 f11253OooO0O0;

        public OooO00o(@NonNull OooOOO0 oooOOO0, @Nullable List<Purchase> list) {
            this.f11252OooO00o = list;
            this.f11253OooO0O0 = oooOOO0;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface PurchaseState {
        public static final int PENDING = 2;
        public static final int PURCHASED = 1;
        public static final int UNSPECIFIED_STATE = 0;
    }

    public Purchase(@NonNull String str, @NonNull String str2) throws JSONException {
        this.f11249OooO00o = str;
        this.f11250OooO0O0 = str2;
        this.f11251OooO0OO = new JSONObject(str);
    }

    @Nullable
    public final com.android.billingclient.api.OooO00o OooO00o() {
        String strOptString = this.f11251OooO0OO.optString("obfuscatedAccountId");
        String strOptString2 = this.f11251OooO0OO.optString("obfuscatedProfileId");
        if (strOptString == null && strOptString2 == null) {
            return null;
        }
        return new com.android.billingclient.api.OooO00o(strOptString, strOptString2);
    }

    @NonNull
    public final String OooO0O0() {
        JSONObject jSONObject = this.f11251OooO0OO;
        return jSONObject.optString(FirebaseMessagingService.EXTRA_TOKEN, jSONObject.optString("purchaseToken"));
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f11249OooO00o, purchase.f11249OooO00o) && TextUtils.equals(this.f11250OooO0O0, purchase.f11250OooO0O0);
    }

    public final int hashCode() {
        return this.f11249OooO00o.hashCode();
    }

    @NonNull
    public final String toString() {
        String strValueOf = String.valueOf(this.f11249OooO00o);
        return strValueOf.length() != 0 ? "Purchase. Json: ".concat(strValueOf) : new String("Purchase. Json: ");
    }
}
