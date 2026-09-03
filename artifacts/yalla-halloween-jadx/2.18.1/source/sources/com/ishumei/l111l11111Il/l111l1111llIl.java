package com.ishumei.l111l11111Il;

import android.content.Context;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class l111l1111llIl {
    public static String l1111l111111Il() {
        int i;
        int i2;
        int i3;
        Context context = com.ishumei.l1111l111111Il.l111l1111llIl.l1111l111111Il.l111l11111Il;
        if (context == null) {
            return "";
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            i = displayMetrics.widthPixels;
            try {
                i2 = displayMetrics.heightPixels;
                try {
                    i3 = displayMetrics.densityDpi;
                } catch (Exception unused) {
                    i3 = 0;
                }
            } catch (Exception unused2) {
                i2 = 0;
                i3 = 0;
                return String.format(Locale.CHINA, "%d,%d,%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
            }
        } catch (Exception unused3) {
            i = 0;
        }
        return String.format(Locale.CHINA, "%d,%d,%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static void l1111l111111Il(com.ishumei.l1111l111111Il.l111l11111lIl l111l11111lil) {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            l111l11111lil.l111l1111l1Il(Long.valueOf(statFs.getAvailableBytes()));
            l111l11111lil.l111l1111llIl(Long.valueOf(statFs.getFreeBytes()));
            l111l11111lil.l111l1111lI1l(Long.valueOf(statFs.getTotalBytes()));
        } catch (Exception unused) {
        }
    }

    public static int l111l11111I1l() {
        try {
            return ((PowerManager) com.ishumei.l1111l111111Il.l111l1111llIl.l1111l111111Il.l111l11111Il.getSystemService("power")).isScreenOn() ? 1 : 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static String l111l11111lIl() {
        int i;
        int i2;
        Context context = com.ishumei.l1111l111111Il.l111l1111llIl.l1111l111111Il.l111l11111Il;
        if (context == null) {
            return "";
        }
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            i = displayMetrics.widthPixels;
            try {
                i2 = displayMetrics.heightPixels;
            } catch (Exception unused) {
                i2 = 0;
            }
        } catch (Exception unused2) {
            i = 0;
        }
        return String.format(Locale.CHINA, "%d,%d", Integer.valueOf(i), Integer.valueOf(i2));
    }
}
