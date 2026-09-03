package p292o0O0OoO;

import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import org.json.JSONObject;
import p286o0O0OOoO.o0OOO0o;
import p289o0O0Oo0.o0000;
import p298o0O0Oooo.o000;
import p298o0O0Oooo.o0000O;
import p298o0O0Oooo.o0000OO0;

/* JADX INFO: loaded from: classes3.dex */
public final class o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f41654OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000OO0 f41655OooO0O0;

    public o000oOoO(String str, o0000OO0 o0000oo1) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f41655OooO0O0 = o0000oo1;
        this.f41654OooO00o = str;
    }

    public static void OooO00o(o0000O o0000o2, o0OOO0o o0ooo0o2) {
        OooO0O0(o0000o2, "X-CRASHLYTICS-GOOGLE-APP-ID", o0ooo0o2.f41667OooO00o);
        OooO0O0(o0000o2, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        OooO0O0(o0000o2, "X-CRASHLYTICS-API-CLIENT-VERSION", "18.3.7");
        OooO0O0(o0000o2, "Accept", "application/json");
        OooO0O0(o0000o2, "X-CRASHLYTICS-DEVICE-MODEL", o0ooo0o2.f41668OooO0O0);
        OooO0O0(o0000o2, "X-CRASHLYTICS-OS-BUILD-VERSION", o0ooo0o2.f41669OooO0OO);
        OooO0O0(o0000o2, "X-CRASHLYTICS-OS-DISPLAY-VERSION", o0ooo0o2.f41670OooO0Oo);
        OooO0O0(o0000o2, "X-CRASHLYTICS-INSTALLATION-ID", ((o0000) o0ooo0o2.f41672OooO0o0).OooO0OO());
    }

    public static void OooO0O0(o0000O o0000o2, String str, String str2) {
        if (str2 != null) {
            o0000o2.f41713OooO0OO.put(str, str2);
        }
    }

    public static HashMap OooO0OO(o0OOO0o o0ooo0o2) {
        HashMap map = new HashMap();
        map.put("build_version", o0ooo0o2.f41674OooO0oo);
        map.put("display_version", o0ooo0o2.f41673OooO0oO);
        map.put("source", Integer.toString(o0ooo0o2.f41666OooO));
        String str = o0ooo0o2.f41671OooO0o;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    public final JSONObject OooO0Oo(o000 o000Var) {
        StringBuilder sb = new StringBuilder("Settings response code was: ");
        int i = o000Var.f41709OooO00o;
        sb.append(i);
        String string = sb.toString();
        o0OOO0o o0ooo0o2 = o0OOO0o.f41436OooO00o;
        o0ooo0o2.OooO0OO(string);
        boolean z = i == 200 || i == 201 || i == 202 || i == 203;
        String str = this.f41654OooO00o;
        if (!z) {
            String str2 = "Settings request failed; (status: " + i + ") from " + str;
            if (!o0ooo0o2.OooO00o(6)) {
                return null;
            }
            Log.e("FirebaseCrashlytics", str2, null);
            return null;
        }
        String str3 = o000Var.f41710OooO0O0;
        try {
            return new JSONObject(str3);
        } catch (Exception e) {
            o0ooo0o2.OooO0Oo("Failed to parse settings JSON from " + str, e);
            o0ooo0o2.OooO0Oo("Settings response " + str3, null);
            return null;
        }
    }
}
