package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class bs {
    public static boolean AFInAppEventType(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return context.getPackageManager().isInstantApp();
        }
        try {
            context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
