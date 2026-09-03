package p381o0OOoOOO;

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
import p351o0OOOOo.OooOOO;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0oOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f38837OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("this")
    public String f38838OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("this")
    public String f38839OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @GuardedBy("this")
    public int f38840OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @GuardedBy("this")
    public int f38841OooO0o0 = 0;

    public oo0oOO0(Context context) {
        this.f38837OooO00o = context;
    }

    public static String OooO0O0(OooOOO oooOOO) {
        oooOOO.OooO00o();
        String str = oooOOO.f38265OooO0OO.f38287OooO0o0;
        if (str != null) {
            return str;
        }
        oooOOO.OooO00o();
        String str2 = oooOOO.f38265OooO0OO.f38283OooO0O0;
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
        if (this.f38838OooO0O0 == null) {
            OooO0o0();
        }
        return this.f38838OooO0O0;
    }

    public final PackageInfo OooO0OO(String str) {
        try {
            return this.f38837OooO00o.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Failed to find package " + e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0049 A[Catch: all -> 0x0080, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000b, B:10:0x001c, B:13:0x0026, B:15:0x002c, B:17:0x003e, B:19:0x0044, B:22:0x0049, B:24:0x005b, B:26:0x0061, B:29:0x0066, B:31:0x0073, B:33:0x0078, B:32:0x0076), top: B:42:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0066 A[Catch: all -> 0x0080, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000b, B:10:0x001c, B:13:0x0026, B:15:0x002c, B:17:0x003e, B:19:0x0044, B:22:0x0049, B:24:0x005b, B:26:0x0061, B:29:0x0066, B:31:0x0073, B:33:0x0078, B:32:0x0076), top: B:42:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0073 A[Catch: all -> 0x0080, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000b, B:10:0x001c, B:13:0x0026, B:15:0x002c, B:17:0x003e, B:19:0x0044, B:22:0x0049, B:24:0x005b, B:26:0x0061, B:29:0x0066, B:31:0x0073, B:33:0x0078, B:32:0x0076), top: B:42:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0076 A[Catch: all -> 0x0080, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000b, B:10:0x001c, B:13:0x0026, B:15:0x002c, B:17:0x003e, B:19:0x0044, B:22:0x0049, B:24:0x005b, B:26:0x0061, B:29:0x0066, B:31:0x0073, B:33:0x0078, B:32:0x0076), top: B:42:0x0001 }] */
    public final boolean OooO0Oo() {
        int i;
        List<ResolveInfo> listQueryBroadcastReceivers;
        synchronized (this) {
            i = this.f38841OooO0o0;
            if (i == 0) {
                PackageManager packageManager = this.f38837OooO00o.getPackageManager();
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
                            this.f38841OooO0o0 = 2;
                        } else {
                            this.f38841OooO0o0 = 1;
                        }
                        i = this.f38841OooO0o0;
                    } else {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (PlatformVersion.isAtLeastO()) {
                            this.f38841OooO0o0 = 2;
                        } else {
                            this.f38841OooO0o0 = 1;
                        }
                        i = this.f38841OooO0o0;
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
                                this.f38841OooO0o0 = 2;
                            } else {
                                this.f38841OooO0o0 = 1;
                            }
                            i = this.f38841OooO0o0;
                        } else {
                            this.f38841OooO0o0 = 2;
                            i = 2;
                        }
                    } else {
                        this.f38841OooO0o0 = 1;
                        i = 1;
                    }
                }
            }
        }
        return i != 0;
    }

    public final synchronized void OooO0o0() {
        PackageInfo packageInfoOooO0OO = OooO0OO(this.f38837OooO00o.getPackageName());
        if (packageInfoOooO0OO != null) {
            this.f38838OooO0O0 = Integer.toString(packageInfoOooO0OO.versionCode);
            this.f38839OooO0OO = packageInfoOooO0OO.versionName;
        }
    }
}
