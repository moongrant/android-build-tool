package com.google.firebase.perf.util;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import p311o0O0oO0o.o0O0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static Boolean f20002OooO00o;

    public static boolean OooO00o(@NonNull Context context) {
        Boolean bool = f20002OooO00o;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean boolValueOf = Boolean.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            f20002OooO00o = boolValueOf;
            return boolValueOf.booleanValue();
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            o0O0O00.OooO0Oo().OooO00o("No perf logcat meta data found " + e.getMessage());
            return false;
        }
    }

    public static int OooO0O0(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }
}
