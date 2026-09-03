package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import androidx.annotation.GuardedBy;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f20371OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("this")
    public String f20372OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("this")
    public String f20373OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @GuardedBy("this")
    public int f20374OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @GuardedBy("this")
    public int f20375OooO0o0 = 0;

    public o0O0O00(Context context) {
        this.f20371OooO00o = context;
    }

    public static String OooO0OO(p281o0O0O0oO.OooOO0 oooOO1) {
        oooOO1.OooO00o();
        String str = oooOO1.f41951OooO0OO.f41965OooO0o0;
        if (str != null) {
            return str;
        }
        oooOO1.OooO00o();
        String str2 = oooOO1.f41951OooO0OO.f41961OooO0O0;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(CertificateUtil.DELIMITER);
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public final synchronized String OooO00o() {
        if (this.f20372OooO0O0 == null) {
            OooO0o();
        }
        return this.f20372OooO0O0;
    }

    public final synchronized String OooO0O0() {
        if (this.f20373OooO0OO == null) {
            OooO0o();
        }
        return this.f20373OooO0OO;
    }

    public final PackageInfo OooO0Oo(String str) {
        try {
            return this.f20371OooO00o.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Failed to find package " + e);
            return null;
        }
    }

    public final synchronized void OooO0o() {
        PackageInfo packageInfoOooO0Oo = OooO0Oo(this.f20371OooO00o.getPackageName());
        if (packageInfoOooO0Oo != null) {
            this.f20372OooO0O0 = Integer.toString(packageInfoOooO0Oo.versionCode);
            this.f20373OooO0OO = packageInfoOooO0Oo.versionName;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0048 A[Catch: all -> 0x0080, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:10:0x001b, B:13:0x0025, B:15:0x002b, B:17:0x003d, B:19:0x0043, B:22:0x0048, B:24:0x005b, B:26:0x0061, B:29:0x0066, B:31:0x0073, B:33:0x0078, B:32:0x0076), top: B:42:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0066 A[Catch: all -> 0x0080, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:10:0x001b, B:13:0x0025, B:15:0x002b, B:17:0x003d, B:19:0x0043, B:22:0x0048, B:24:0x005b, B:26:0x0061, B:29:0x0066, B:31:0x0073, B:33:0x0078, B:32:0x0076), top: B:42:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0073 A[Catch: all -> 0x0080, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:10:0x001b, B:13:0x0025, B:15:0x002b, B:17:0x003d, B:19:0x0043, B:22:0x0048, B:24:0x005b, B:26:0x0061, B:29:0x0066, B:31:0x0073, B:33:0x0078, B:32:0x0076), top: B:42:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0076 A[Catch: all -> 0x0080, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:10:0x001b, B:13:0x0025, B:15:0x002b, B:17:0x003d, B:19:0x0043, B:22:0x0048, B:24:0x005b, B:26:0x0061, B:29:0x0066, B:31:0x0073, B:33:0x0078, B:32:0x0076), top: B:42:0x0001 }] */
    public final boolean OooO0o0() {
        int i;
        List<ResolveInfo> listQueryBroadcastReceivers;
        synchronized (this) {
            i = this.f20375OooO0o0;
            if (i == 0) {
                PackageManager packageManager = this.f20371OooO00o.getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i = 0;
                } else if (PlatformVersion.isAtLeastO()) {
                    Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent.setPackage("com.google.android.gms");
                    listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                    if (listQueryBroadcastReceivers != null) {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (PlatformVersion.isAtLeastO()) {
                            this.f20375OooO0o0 = 2;
                        } else {
                            this.f20375OooO0o0 = 1;
                        }
                        i = this.f20375OooO0o0;
                    } else {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (PlatformVersion.isAtLeastO()) {
                            this.f20375OooO0o0 = 2;
                        } else {
                            this.f20375OooO0o0 = 1;
                        }
                        i = this.f20375OooO0o0;
                    }
                } else {
                    Intent intent2 = new Intent("com.google.android.c2dm.intent.REGISTER");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent2, 0);
                    if (listQueryIntentServices == null || listQueryIntentServices.size() <= 0) {
                        Intent intent3 = new Intent("com.google.iid.TOKEN_REQUEST");
                        intent3.setPackage("com.google.android.gms");
                        listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent3, 0);
                        if (listQueryBroadcastReceivers != null || listQueryBroadcastReceivers.size() <= 0) {
                            Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                            if (PlatformVersion.isAtLeastO()) {
                                this.f20375OooO0o0 = 2;
                            } else {
                                this.f20375OooO0o0 = 1;
                            }
                            i = this.f20375OooO0o0;
                        } else {
                            this.f20375OooO0o0 = 2;
                            i = 2;
                        }
                    } else {
                        this.f20375OooO0o0 = 1;
                        i = 1;
                    }
                }
            }
        }
        return i != 0;
    }
}
