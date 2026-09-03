package p383o0OOoOOO;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import kotlin.jvm.internal.Intrinsics;
import p526o0o0O0oO.o0O0O0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oo00o implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f38847Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f38848OoooO00;

    public /* synthetic */ oo00o(Object obj, int i) {
        this.f38847Oooo = i;
        this.f38848OoooO00 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.f38847Oooo) {
            case 0:
                Context context = ((FirebaseMessaging) this.f38848OoooO00).f19197OooO0Oo;
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
                o0O0O0Oo this$0 = (o0O0O0Oo) this.f38848OoooO00;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f43061OooO0o0.f49472OooO0OO.setDrawerLockMode(0);
                break;
        }
    }
}
