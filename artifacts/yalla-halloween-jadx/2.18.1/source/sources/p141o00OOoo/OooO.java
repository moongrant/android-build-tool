package p141o00OOoo;

import com.app.base.application.App;
import com.appsflyer.AppsFlyerLib;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class OooO {
    public static void OooO00o(String str, Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        try {
            AppsFlyerLib.getInstance().logEvent(App.f11458Oooo0oO.getApplicationContext(), str, map);
        } catch (Exception unused) {
        }
    }
}
