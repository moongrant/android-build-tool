package p291o0O0OoO0;

import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import o0O0OOOo.OooO;
import org.json.JSONObject;
import p285o0O0OOoo.o000O000;
import p289o0O0Oo0o.OooOOOO;
import p289o0O0Oo0o.OooOo;
import p289o0O0Oo0o.OooOo00;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f42305OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOo00 f42306OooO0O0;

    public o000OOo(String str, OooOo00 oooOo00) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f42306OooO0O0 = oooOo00;
        this.f42305OooO00o = str;
    }

    public static void OooO00o(OooOOOO oooOOOO, o0000 o0000Var) {
        OooO0O0(oooOOOO, "X-CRASHLYTICS-GOOGLE-APP-ID", o0000Var.f42276OooO00o);
        OooO0O0(oooOOOO, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        OooO0O0(oooOOOO, "X-CRASHLYTICS-API-CLIENT-VERSION", "18.3.7");
        OooO0O0(oooOOOO, "Accept", "application/json");
        OooO0O0(oooOOOO, "X-CRASHLYTICS-DEVICE-MODEL", o0000Var.f42277OooO0O0);
        OooO0O0(oooOOOO, "X-CRASHLYTICS-OS-BUILD-VERSION", o0000Var.f42278OooO0OO);
        OooO0O0(oooOOOO, "X-CRASHLYTICS-OS-DISPLAY-VERSION", o0000Var.f42279OooO0Oo);
        OooO0O0(oooOOOO, "X-CRASHLYTICS-INSTALLATION-ID", ((o000O000) o0000Var.f42281OooO0o0).OooO0OO());
    }

    public static void OooO0O0(OooOOOO oooOOOO, String str, String str2) {
        if (str2 != null) {
            oooOOOO.f42272OooO0OO.put(str, str2);
        }
    }

    public static HashMap OooO0OO(o0000 o0000Var) {
        HashMap map = new HashMap();
        map.put("build_version", o0000Var.f42283OooO0oo);
        map.put("display_version", o0000Var.f42282OooO0oO);
        map.put("source", Integer.toString(o0000Var.f42275OooO));
        String str = o0000Var.f42280OooO0o;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    public final JSONObject OooO0Oo(OooOo oooOo) {
        StringBuilder sb = new StringBuilder("Settings response code was: ");
        int i = oooOo.f42273OooO00o;
        sb.append(i);
        String string = sb.toString();
        OooO oooO = OooO.f42075OooO00o;
        oooO.OooO0OO(string);
        boolean z = i == 200 || i == 201 || i == 202 || i == 203;
        String str = this.f42305OooO00o;
        if (!z) {
            String str2 = "Settings request failed; (status: " + i + ") from " + str;
            if (!oooO.OooO00o(6)) {
                return null;
            }
            Log.e("FirebaseCrashlytics", str2, null);
            return null;
        }
        String str3 = oooOo.f42274OooO0O0;
        try {
            return new JSONObject(str3);
        } catch (Exception e) {
            oooO.OooO0Oo("Failed to parse settings JSON from " + str, e);
            oooO.OooO0Oo("Settings response " + str3, null);
            return null;
        }
    }
}
