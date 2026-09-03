package p366o0OOo00O;

import android.support.v4.media.OooO00o;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.widget.o00000O0;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p335o0OO00oo.OooOOO;
import p361o0OOOoOo.o000OO;
import p365o0OOOooo.o000O0Oo;
import p365o0OOOooo.o000OO0O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f38632OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOOO f38633OooO0O0;

    public OooO0o(String str, OooOOO oooOOO) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f38633OooO0O0 = oooOOO;
        this.f38632OooO00o = str;
    }

    public final o000O0Oo OooO00o(o000O0Oo o000o0oo2, OooOo00 oooOo00) {
        OooO0O0(o000o0oo2, "X-CRASHLYTICS-GOOGLE-APP-ID", oooOo00.f38646OooO00o);
        OooO0O0(o000o0oo2, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        OooO0O0(o000o0oo2, "X-CRASHLYTICS-API-CLIENT-VERSION", "18.2.13");
        OooO0O0(o000o0oo2, "Accept", "application/json");
        OooO0O0(o000o0oo2, "X-CRASHLYTICS-DEVICE-MODEL", oooOo00.f38647OooO0O0);
        OooO0O0(o000o0oo2, "X-CRASHLYTICS-OS-BUILD-VERSION", oooOo00.f38648OooO0OO);
        OooO0O0(o000o0oo2, "X-CRASHLYTICS-OS-DISPLAY-VERSION", oooOo00.f38649OooO0Oo);
        OooO0O0(o000o0oo2, "X-CRASHLYTICS-INSTALLATION-ID", ((o000OO) oooOo00.f38651OooO0o0).OooO0OO());
        return o000o0oo2;
    }

    public final void OooO0O0(o000O0Oo o000o0oo2, String str, String str2) {
        if (str2 != null) {
            o000o0oo2.OooO0OO(str, str2);
        }
    }

    public final Map<String, String> OooO0OO(OooOo00 oooOo00) {
        HashMap map = new HashMap();
        map.put("build_version", oooOo00.f38653OooO0oo);
        map.put("display_version", oooOo00.f38652OooO0oO);
        map.put("source", Integer.toString(oooOo00.f38645OooO));
        String str = oooOo00.f38650OooO0o;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    public final JSONObject OooO0Oo(o000OO0O o000oo0o2) {
        int i = o000oo0o2.f38582OooO00o;
        String strOooO00o = OooO00o.OooO00o("Settings response code was: ", i);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strOooO00o, null);
        }
        if (!(i == 200 || i == 201 || i == 202 || i == 203)) {
            StringBuilder sbOooO00o = o00000O0.OooO00o("Settings request failed; (status: ", i, ") from ");
            sbOooO00o.append(this.f38632OooO00o);
            Log.e("FirebaseCrashlytics", sbOooO00o.toString(), null);
            return null;
        }
        String str = o000oo0o2.f38583OooO0O0;
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Failed to parse settings JSON from ");
            sbOooO0o0.append(this.f38632OooO00o);
            Log.w("FirebaseCrashlytics", sbOooO0o0.toString(), e);
            Log.w("FirebaseCrashlytics", "Settings response " + str, null);
            return null;
        }
    }
}
