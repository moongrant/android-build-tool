package com.code.android.util;

import android.content.res.Resources;
import com.google.android.gms.measurement.internal.zzab;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static zzab f13415OooO00o;

    public static String OooO00o(String str, Resources resources) {
        Exception e;
        String str2;
        try {
            InputStream inputStreamOpen = resources.getAssets().open(str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int i = inputStreamOpen.read();
                if (i != -1) {
                    byteArrayOutputStream.write(i);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    inputStreamOpen.close();
                    str2 = new String(byteArray, "UTF-8");
                    try {
                        return str2.replaceAll("\\r\\n", "\n");
                    } catch (Exception e2) {
                        e = e2;
                    }
                }
                e.printStackTrace();
                return str2;
            }
        } catch (Exception e3) {
            e = e3;
            str2 = null;
        }
    }

    public static final int OooO0O0() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    public static final int OooO0OO() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }
}
