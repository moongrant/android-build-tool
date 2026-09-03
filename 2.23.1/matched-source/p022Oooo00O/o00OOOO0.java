package p022Oooo00O;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.opensource.svgaplayer.OooO0OO;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicInteger;
import p045Oooooo.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00OOOO0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f650OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f651OooO0o0;

    public /* synthetic */ o00OOOO0(Object obj, int i) {
        this.f650OooO0Oo = i;
        this.f651OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final boolean z;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        int i = this.f650OooO0Oo;
        Object obj = this.f651OooO0o0;
        switch (i) {
            case 0:
                for (o0oO0O0o o0oo0o0o2 : (LinkedHashSet) obj) {
                    o0oo0o0o2.OooO0O0().OooOO0o(o0oo0o0o2);
                }
                break;
            case 1:
                ((o00Oo0) obj).OooO00o();
                break;
            case 2:
                final Context context = ((FirebaseMessaging) obj).f19769OooO0Oo;
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
                    if (PlatformVersion.isAtLeastQ()) {
                        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                        new Runnable() { // from class: com.google.firebase.messaging.o000OOo
                            @Override // java.lang.Runnable
                            public final void run() {
                                Context context2 = context;
                                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                                try {
                                    if (Binder.getCallingUid() == context2.getApplicationInfo().uid) {
                                        Context applicationContext3 = context2.getApplicationContext();
                                        if (applicationContext3 == null) {
                                            applicationContext3 = context2;
                                        }
                                        SharedPreferences.Editor editorEdit = applicationContext3.getSharedPreferences("com.google.firebase.messaging", 0).edit();
                                        editorEdit.putBoolean("proxy_notification_initialized", true);
                                        editorEdit.apply();
                                        NotificationManager notificationManager = (NotificationManager) context2.getSystemService(NotificationManager.class);
                                        if (z) {
                                            notificationManager.setNotificationDelegate("com.google.android.gms");
                                        } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                                            notificationManager.setNotificationDelegate(null);
                                        }
                                    } else {
                                        Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context2.getPackageName());
                                    }
                                } finally {
                                    taskCompletionSource2.trySetResult(null);
                                }
                            }
                        }.run();
                        taskCompletionSource.getTask();
                    } else {
                        Tasks.forResult(null);
                    }
                    break;
                }
                break;
            default:
                OooO0OO.OooO0O0 oooO0O0 = (OooO0OO.OooO0O0) obj;
                AtomicInteger atomicInteger = OooO0OO.f20773OooO0OO;
                if (oooO0O0 != null) {
                    oooO0O0.onError();
                }
                break;
        }
    }
}
