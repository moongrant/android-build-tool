package o0OOOOO;

import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0OO {
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
}
