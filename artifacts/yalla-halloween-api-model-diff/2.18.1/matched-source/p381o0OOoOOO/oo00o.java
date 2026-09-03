package p381o0OOoOOO;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import kotlin.jvm.internal.Intrinsics;
import p524o0o0O0oO.o0O0oo0o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oo00o implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f38827Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f38828Oooo0oO;

    public /* synthetic */ oo00o(Object obj, int i) {
        this.f38827Oooo0o = i;
        this.f38828Oooo0oO = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.f38827Oooo0o) {
            case 0:
                Context context = ((FirebaseMessaging) this.f38828Oooo0oO).f19178OooO0Oo;
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                if (!applicationContext.getSharedPreferences("com.google.firebase.messaging", 0).getBoolean("proxy_notification_initialized", false)) {
                    try {
                        Context applicationContext2 = context.getApplicationContext();
                        PackageManager packageManager = applicationContext2.getPackageManager();
                        z = (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext2.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled") : true;
                        break;
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    if (!PlatformVersion.isAtLeastQ()) {
                        Tasks.forResult(null);
                    } else {
                        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                        o00OO00O.OooO00o(context, z, taskCompletionSource);
                        taskCompletionSource.getTask();
                    }
                    break;
                }
                break;
            default:
                o0O0oo0o this$0 = (o0O0oo0o) this.f38828Oooo0oO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f43090OooO0o0.f49535OooO0OO.setDrawerLockMode(0);
                break;
        }
    }
}
