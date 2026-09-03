package com.google.android.gms.common.wrappers;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public class InstantApps {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static Context f15292OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public static Boolean f15293OooO0O0;

    @KeepForSdk
    public static synchronized boolean isInstantApp(@NonNull Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f15292OooO00o;
        if (context2 != null && (bool = f15293OooO0O0) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f15293OooO0O0 = null;
        if (PlatformVersion.isAtLeastO()) {
            f15293OooO0O0 = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f15293OooO0O0 = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f15293OooO0O0 = Boolean.FALSE;
            }
        }
        f15292OooO00o = applicationContext;
        return f15293OooO0O0.booleanValue();
    }
}
