package o0OOOOO;

import com.twitter.sdk.android.core.models.o0OoOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class Oooo000 {
    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    public static boolean OooO00o(com.twitter.sdk.android.core.models.OooO0o oooO0o) {
        Object obj;
        boolean z;
        if (!"player".equals(oooO0o.f22051OooO0O0) && !"vine".equals(oooO0o.f22051OooO0O0)) {
            return false;
        }
        com.twitter.sdk.android.core.models.OooO0OO oooO0OO = oooO0o.f22050OooO00o;
        oooO0OO.getClass();
        try {
            obj = oooO0OO.f22049OooO00o.get("site");
        } catch (ClassCastException unused) {
            obj = null;
        }
        o0OoOo0 o0oooo0 = (o0OoOo0) obj;
        if (o0oooo0 != null) {
            try {
                if (Long.parseLong(o0oooo0.f22204OooO00o) == 586671909) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (NumberFormatException unused2) {
            }
        } else {
            z = false;
        }
        return z;
    }
}
