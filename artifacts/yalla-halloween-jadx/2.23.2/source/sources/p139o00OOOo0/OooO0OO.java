package p139o00OOOo0;

import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final byte[] f37471OooO00o = {60, -28, 116, 20, 125, -126, -107, -104, -94, -115, -71, 108, 116, -19, 118, 34, 99, 116, 115, -95, -1, -35, 59, -114, -78, -60, -63, 20, -124, -107, -118, 84};

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
