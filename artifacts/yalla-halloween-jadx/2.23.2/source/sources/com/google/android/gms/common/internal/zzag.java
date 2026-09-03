package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.wrappers.Wrappers;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzag {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Object f14674OooO00o = new Object();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("sLock")
    public static boolean f14675OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public static String f14676OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static int f14677OooO0Oo;

    public static void OooO00o(Context context) {
        synchronized (f14674OooO00o) {
            if (f14675OooO0O0) {
                return;
            }
            f14675OooO0O0 = true;
            try {
                Bundle bundle = Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle == null) {
                    return;
                }
                f14676OooO0OO = bundle.getString("com.google.app.id");
                f14677OooO0Oo = bundle.getInt("com.google.android.gms.version");
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("MetadataValueReader", "This should never happen.", e);
            }
        }
    }

    public static int zza(Context context) {
        OooO00o(context);
        return f14677OooO0Oo;
    }

    @Nullable
    public static String zzb(Context context) {
        OooO00o(context);
        return f14676OooO0OO;
    }
}
