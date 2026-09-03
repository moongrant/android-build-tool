package p381o0OOoOOO;

import OooO00o.OooO00o;
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

/* JADX INFO: loaded from: classes2.dex */
public final class o00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final Bundle f38741OooO00o;

    public o00O(@NonNull Bundle bundle) {
        this.f38741OooO00o = new Bundle(bundle);
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
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Couldn't parse value of ");
            sbOooO0o0.append(OooO0oo(str));
            sbOooO0o0.append("(");
            sbOooO0o0.append(strOooO0o0);
            sbOooO0o0.append(") into an int");
            Log.w("NotificationParams", sbOooO0o0.toString());
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
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Malformed JSON for key ");
            sbOooO0o0.append(OooO0oo(str));
            sbOooO0o0.append(": ");
            sbOooO0o0.append(strOooO0o0);
            sbOooO0o0.append(", falling back to default");
            Log.w("NotificationParams", sbOooO0o0.toString());
            return null;
        }
    }

    public final String OooO0Oo(Resources resources, String str, String str2) {
        String[] strArr;
        String strOooO0o0 = OooO0o0(str2);
        if (!TextUtils.isEmpty(strOooO0o0)) {
            return strOooO0o0;
        }
        String strOooO0o1 = OooO0o0(str2 + "_loc_key");
        if (TextUtils.isEmpty(strOooO0o1)) {
            return null;
        }
        int identifier = resources.getIdentifier(strOooO0o1, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", OooO0oo(str2 + "_loc_key") + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray jSONArrayOooO0OO = OooO0OO(str2 + "_loc_args");
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
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Missing format argument for ");
            sbOooO0o0.append(OooO0oo(str2));
            sbOooO0o0.append(": ");
            sbOooO0o0.append(Arrays.toString(strArr));
            sbOooO0o0.append(" Default value will be used.");
            Log.w("NotificationParams", sbOooO0o0.toString(), e);
            return null;
        }
    }

    public final String OooO0o0(String str) {
        Bundle bundle = this.f38741OooO00o;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (this.f38741OooO00o.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    public final Bundle OooO0oO() {
        Bundle bundle = new Bundle(this.f38741OooO00o);
        for (String str : this.f38741OooO00o.keySet()) {
            if (!(str.startsWith("google.c.a.") || str.equals("from"))) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}
