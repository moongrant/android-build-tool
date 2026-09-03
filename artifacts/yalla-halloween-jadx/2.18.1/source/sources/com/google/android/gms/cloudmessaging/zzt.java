package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes2.dex */
public final class zzt {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f15091OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("this")
    public int f15092OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("this")
    public int f15093OooO0OO = 0;

    public zzt(Context context) {
        this.f15091OooO00o = context;
    }

    public final synchronized int zza() {
        PackageInfo packageInfo;
        if (this.f15092OooO0O0 == 0) {
            try {
                packageInfo = Wrappers.packageManager(this.f15091OooO00o).getPackageInfo("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e) {
                String strValueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 23);
                sb.append("Failed to find package ");
                sb.append(strValueOf);
                Log.w("Metadata", sb.toString());
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f15092OooO0O0 = packageInfo.versionCode;
            }
        }
        return this.f15092OooO0O0;
    }

    public final synchronized int zzb() {
        int i = this.f15093OooO0OO;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.f15091OooO00o.getPackageManager();
        if (Wrappers.packageManager(this.f15091OooO00o).checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i2 = 1;
        if (!PlatformVersion.isAtLeastO()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                this.f15093OooO0OO = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.f15093OooO0OO = 2;
            return 2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (PlatformVersion.isAtLeastO()) {
            this.f15093OooO0OO = 2;
            i2 = 2;
        } else {
            this.f15093OooO0OO = 1;
        }
        return i2;
    }
}
