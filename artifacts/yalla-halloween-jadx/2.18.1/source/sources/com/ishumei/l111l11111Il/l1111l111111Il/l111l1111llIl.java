package com.ishumei.l111l11111Il.l1111l111111Il;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.facebook.internal.AnalyticsEvents;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class l111l1111llIl {
    private static final long l1111l111111Il = 150;
    private l111l1111lI1l l111l11111I1l;
    private final Context l111l11111lIl;

    public l111l1111llIl() {
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ad  */
    public l111l1111llIl(Context context) {
        l111l1111lI1l l11l1111il;
        this.l111l11111lIl = context;
        if (context != null) {
            String lowerCase = Build.MANUFACTURER.toLowerCase();
            if (lowerCase.contains("asus")) {
                l11l1111il = new l1111l111111Il(context);
            } else if (lowerCase.contains("huawei")) {
                l11l1111il = new l111l11111lIl(context);
            } else if (lowerCase.contains("lenovo")) {
                l11l1111il = new l111l11111I1l(context);
            } else if (lowerCase.contains("meizu")) {
                l11l1111il = new l111l11111Il(context);
            } else if (lowerCase.contains("nubia")) {
                l11l1111il = new l111l1111l1Il(context);
            } else if (lowerCase.contains("oneplus")) {
                l11l1111il = new l111l1111lIl(context);
            } else if (lowerCase.contains("oppo")) {
                l11l1111il = new l11l1111lIIl(context);
            } else if (lowerCase.contains("samsung")) {
                l11l1111il = new l11l1111I11l(context);
            } else if (lowerCase.contains("vivo")) {
                l11l1111il = new l11l1111I1l(context);
            } else if (lowerCase.contains("xiaomi")) {
                l11l1111il = new l11l1111I1ll(context);
            } else if (lowerCase.contains("zte")) {
                l11l1111il = new l11l1111Il(context);
            } else {
                l11l1111il = null;
            }
        } else {
            l11l1111il = null;
        }
        this.l111l11111I1l = l11l1111il;
    }

    private l111l1111lI1l l111l11111I1l() {
        if (this.l111l11111lIl == null) {
            return null;
        }
        String lowerCase = Build.MANUFACTURER.toLowerCase();
        if (lowerCase.contains("asus")) {
            return new l1111l111111Il(this.l111l11111lIl);
        }
        if (lowerCase.contains("huawei")) {
            return new l111l11111lIl(this.l111l11111lIl);
        }
        if (lowerCase.contains("lenovo")) {
            return new l111l11111I1l(this.l111l11111lIl);
        }
        if (lowerCase.contains("meizu")) {
            return new l111l11111Il(this.l111l11111lIl);
        }
        if (lowerCase.contains("nubia")) {
            return new l111l1111l1Il(this.l111l11111lIl);
        }
        if (lowerCase.contains("oneplus")) {
            return new l111l1111lIl(this.l111l11111lIl);
        }
        if (lowerCase.contains("oppo")) {
            return new l11l1111lIIl(this.l111l11111lIl);
        }
        if (lowerCase.contains("samsung")) {
            return new l11l1111I11l(this.l111l11111lIl);
        }
        if (lowerCase.contains("vivo")) {
            return new l11l1111I1l(this.l111l11111lIl);
        }
        if (lowerCase.contains("xiaomi")) {
            return new l11l1111I1ll(this.l111l11111lIl);
        }
        if (lowerCase.contains("zte")) {
            return new l11l1111Il(this.l111l11111lIl);
        }
        return null;
    }

    public static Map<String, Integer> l111l11111lIl() {
        HashMap map = new HashMap();
        Context context = com.ishumei.l1111l111111Il.l111l1111llIl.l1111l111111Il.l111l11111Il;
        if (context == null) {
            return map;
        }
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver == null) {
                return map;
            }
            int intExtra = intentRegisterReceiver.getIntExtra(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, 0);
            int intExtra2 = intentRegisterReceiver.getIntExtra("level", 0);
            int intExtra3 = intentRegisterReceiver.getIntExtra("scale", 100);
            int intExtra4 = intentRegisterReceiver.getIntExtra("temperature", 0);
            int intExtra5 = intentRegisterReceiver.getIntExtra("voltage", 0);
            map.put(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, Integer.valueOf(intExtra));
            map.put("level", Integer.valueOf(intExtra2));
            map.put("scale", Integer.valueOf(intExtra3));
            map.put("temp", Integer.valueOf(intExtra4));
            map.put("vol", Integer.valueOf(intExtra5));
        } catch (Exception unused) {
        }
        return map;
    }

    public final String l1111l111111Il() {
        l111l1111lI1l l111l1111li1l = this.l111l11111I1l;
        return l111l1111li1l == null ? "" : l111l1111li1l.l1111l111111Il(l1111l111111Il);
    }
}
