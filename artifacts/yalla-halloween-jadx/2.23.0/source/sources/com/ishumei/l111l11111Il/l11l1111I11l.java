package com.ishumei.l111l11111Il;

import android.content.ContentResolver;
import android.content.Context;
import android.os.SystemClock;
import android.provider.Settings;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class l11l1111I11l {
    public static String l1111l111111Il() {
        String str;
        try {
            Context context = com.ishumei.l1111l111111Il.l111l1111llIl.l1111l111111Il.l111l11111Il;
            return (context == null || (str = (String) com.ishumei.l111l1111llIl.l111l1111l1Il.l1111l111111Il(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9e919b8d90969bd18f8d9089969b9a8dd1ac9a8b8b9691988cdbac9a9c8a8d9a"), com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("989a8bac8b8d969198"), new Class[]{ContentResolver.class, String.class}, new Object[]{context.getContentResolver(), com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9e919b8d90969ba0969b")})) == null) ? "" : str;
        } catch (Exception unused) {
            return "";
        }
    }

    public static int l111l11111I1l() {
        Context context = com.ishumei.l1111l111111Il.l111l1111llIl.l1111l111111Il.l111l11111Il;
        if (context == null) {
            return -1;
        }
        try {
            return ((Integer) com.ishumei.l111l1111llIl.l111l1111l1Il.l1111l111111Il(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9e919b8d90969bd18f8d9089969b9a8dd1ac9a8b8b9691988cdbac868c8b9a92"), com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("989a8bb6918b"), new Class[]{ContentResolver.class, String.class}, new Object[]{context.getContentResolver(), com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("8c9c8d9a9a91a09d8d9698978b919a8c8c")})).intValue();
        } catch (SecurityException unused) {
            return -1001;
        } catch (Exception unused2) {
            return -1;
        }
    }

    public static int l111l11111Il() {
        Context context = com.ishumei.l1111l111111Il.l111l1111llIl.l1111l111111Il.l111l11111Il;
        if (context == null) {
            return 0;
        }
        return Settings.Secure.getInt(context.getContentResolver(), "mock_location", 0) != 0 ? 1 : 0;
    }

    public static long l111l11111lIl() {
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 11; i++) {
                arrayList.add(Long.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
            }
            Collections.sort(arrayList);
            return ((Long) arrayList.get(5)).longValue();
        } catch (Exception unused) {
            return System.currentTimeMillis() - SystemClock.elapsedRealtime();
        }
    }

    public static int l111l1111l1Il() {
        Context context = com.ishumei.l1111l111111Il.l111l1111llIl.l1111l111111Il.l111l11111Il;
        if (context == null) {
            return -1;
        }
        try {
            return Settings.Global.getInt(context.getContentResolver(), "wifi_connected_mac_randomization_enabled");
        } catch (Throwable unused) {
            return -1;
        }
    }

    private static long l111l1111llIl() {
        return System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }
}
