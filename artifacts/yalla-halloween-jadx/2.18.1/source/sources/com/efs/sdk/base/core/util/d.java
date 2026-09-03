package com.efs.sdk.base.core.util;

import android.util.Log;
import com.efs.sdk.base.core.controller.ControllerCenter;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static void a(String str, String str2) {
        if (ControllerCenter.getGlobalEnvStruct().isDebug()) {
            Log.i(str, str2);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        if (ControllerCenter.getGlobalEnvStruct().isDebug()) {
            if (th == null) {
                Log.e(str, str2);
            } else {
                Log.e(str, str2, th);
            }
        }
    }

    public static void a(String str, String str2, Throwable th) {
        if (ControllerCenter.getGlobalEnvStruct().isDebug()) {
            if (th == null) {
                Log.w(str, str2);
            } else {
                Log.w(str, str2, th);
            }
        }
    }
}
