package p390o0OOooo;

import com.appsflyer.AppsFlyerLib;
import com.yalla.yalla.app.application.App;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000 {
    public static void OooO00o(String str, HashMap map) {
        if (map == null) {
            map = new HashMap();
        }
        try {
            AppsFlyerLib.getInstance().logEvent(App.f22232OooO0o.getApplicationContext(), str, map);
        } catch (Exception unused) {
        }
    }
}
