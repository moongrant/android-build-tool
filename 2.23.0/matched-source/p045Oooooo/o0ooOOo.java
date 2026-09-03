package p045Oooooo;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.widget.o000O00;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import com.yalla.yalla.ui.activity.message.oo0o0Oo;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import p377o0OOoOo.o0000O;
import p640o0ooOOO0.oO00o000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0ooOOo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1999OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f2000OooO0o0;

    public /* synthetic */ o0ooOOo(Object obj, int i) {
        this.f1999OooO0Oo = i;
        this.f2000OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        int i = this.f1999OooO0Oo;
        final boolean z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        Object obj = this.f2000OooO0o0;
        switch (i) {
            case 0:
                o0000Ooo o0000ooo = (o0000Ooo) obj;
                o0000ooo.f1905OooO0oo.execute(new o000O00(o0000ooo, z ? 1 : 0));
                break;
            case 1:
                final Context context = ((FirebaseMessaging) obj).f20236OooO0Oo;
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                if (!applicationContext.getSharedPreferences("com.google.firebase.messaging", 0).getBoolean("proxy_notification_initialized", false)) {
                    try {
                        Context applicationContext2 = context.getApplicationContext();
                        PackageManager packageManager = applicationContext2.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext2.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
                            z = applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
                        }
                        break;
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    if (!PlatformVersion.isAtLeastQ()) {
                        Tasks.forResult(null);
                    } else {
                        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                        new Runnable() { // from class: com.google.firebase.messaging.o000000O
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
                    }
                    break;
                }
                break;
            default:
                PrivateChatActivity this$0 = (PrivateChatActivity) obj;
                int i2 = PrivateChatActivity.f25694Oooo000;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (!this$0.isDestroyed() && !this$0.isFinishing()) {
                    String strValueOf = String.valueOf(this$0.OooOo().getTargetId());
                    oo0o0Oo oo0o0oo = new oo0o0Oo(this$0, false);
                    LinkedHashMap linkedHashMapOooO00o = oO00o000.OooO00o();
                    linkedHashMapOooO00o.put("touserid", strValueOf);
                    OooO0OO.OooO0O0(null, o0000O.f44100OooOoo, o0000O.f44131Oooooo0, linkedHashMapOooO00o, oo0o0oo);
                    break;
                }
                break;
        }
    }
}
