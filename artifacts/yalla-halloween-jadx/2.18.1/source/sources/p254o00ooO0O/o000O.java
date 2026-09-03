package p254o00ooO0O;

import Oooo000.o00O0O;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class o000O {
    public static final int OooO00o() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public static void OooO0O0(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 != null) {
            return;
        }
        String string = obj.toString();
        throw new NullPointerException(o00O0O.OooO0O0(new StringBuilder(string.length() + 26), "null value in entry: ", string, "=null"));
    }
}
