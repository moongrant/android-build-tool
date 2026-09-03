package p054o00000oo;

import android.content.Context;
import android.content.res.Resources;
import com.appsflyer.AppsFlyerConversionListener;
import java.util.Map;
import p433o0OoOO0o.o0oO0Ooo;

/* JADX INFO: loaded from: classes.dex */
public final class o00O000 implements AppsFlyerConversionListener {
    public static String OooO00o(Context context, String str) {
        Resources resources;
        if (context == null || (resources = context.getResources()) == null) {
            return "";
        }
        Resources resources2 = context.getResources();
        int i = context.getApplicationContext().getApplicationInfo().icon;
        int identifier = resources2.getIdentifier(str, "string", i > 0 ? context.getResources().getResourcePackageName(i) : context.getPackageName());
        return identifier > 0 ? resources.getString(identifier) : "";
    }

    public static void OooO0O0(String str) {
        if (o0oO0Ooo.f39959OooO0oo == null ? false : o0oO0Ooo.f39959OooO0oo.f39964OooO0o) {
            throw new IllegalStateException(str);
        }
        o0oO0Ooo.OooO0OO().OooO0Oo(str);
    }

    public static void OooO0OO(String str, char[] cArr, int i) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            cArr[(i + i2) - 0] = str.charAt(i2);
        }
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAppOpenAttribution(Map map) {
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAttributionFailure(String str) {
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataFail(String str) {
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataSuccess(Map map) {
    }
}
