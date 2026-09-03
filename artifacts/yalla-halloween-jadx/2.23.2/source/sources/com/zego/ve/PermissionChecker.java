package com.zego.ve;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class PermissionChecker {
    public static boolean checkSelfPermission(Context context, String str) {
        if (context == null) {
            return false;
        }
        try {
            return ((Integer) Class.forName("android.content.Context").getMethod("checkSelfPermission", String.class).invoke(context, str)).intValue() == 0;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }
}
