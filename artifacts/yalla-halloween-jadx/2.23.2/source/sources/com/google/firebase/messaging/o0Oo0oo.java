package com.google.firebase.messaging;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public final class o0Oo0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final Bundle f19912OooO00o;

    public o0Oo0oo(@NonNull Bundle bundle) {
        this.f19912OooO00o = new Bundle(bundle);
    }

    public static boolean OooO0o(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String OooO0oo(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public final boolean OooO00o(String str) {
        String strOooO0o0 = OooO0o0(str);
        return "1".equals(strOooO0o0) || Boolean.parseBoolean(strOooO0o0);
    }

    public final Integer OooO0O0(String str) {
        String strOooO0o0 = OooO0o0(str);
        if (TextUtils.isEmpty(strOooO0o0)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strOooO0o0));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + OooO0oo(str) + "(" + strOooO0o0 + ") into an int");
            return null;
        }
    }

    @Nullable
    public final JSONArray OooO0OO(String str) {
        String strOooO0o0 = OooO0o0(str);
        if (TextUtils.isEmpty(strOooO0o0)) {
            return null;
        }
        try {
            return new JSONArray(strOooO0o0);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + OooO0oo(str) + ": " + strOooO0o0 + ", falling back to default");
            return null;
        }
    }

    public final String OooO0Oo(String str, Resources resources, String str2) {
        String[] strArr;
        String strOooO0o0 = OooO0o0(str2);
        if (!TextUtils.isEmpty(strOooO0o0)) {
            return strOooO0o0;
        }
        String strOooO0o1 = OooO0o0(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(strOooO0o1)) {
            return null;
        }
        int identifier = resources.getIdentifier(strOooO0o1, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", OooO0oo(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray jSONArrayOooO0OO = OooO0OO(str2.concat("_loc_args"));
        if (jSONArrayOooO0OO == null) {
            strArr = null;
        } else {
            int length = jSONArrayOooO0OO.length();
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = jSONArrayOooO0OO.optString(i);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + OooO0oo(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e);
            return null;
        }
    }

    public final String OooO0o0(String str) {
        Bundle bundle = this.f19912OooO00o;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    public final Bundle OooO0oO() {
        Bundle bundle = this.f19912OooO00o;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!(str.startsWith("google.c.a.") || str.equals("from"))) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }
}
