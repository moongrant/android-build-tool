package p381o0OOoOOO;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OO00O {
    public static void OooO00o(Context context, boolean z, TaskCompletionSource taskCompletionSource) {
        try {
            if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                SharedPreferences.Editor editorEdit = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0).edit();
                editorEdit.putBoolean("proxy_notification_initialized", true);
                editorEdit.apply();
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (z) {
                    notificationManager.setNotificationDelegate("com.google.android.gms");
                } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                    notificationManager.setNotificationDelegate(null);
                }
            } else {
                Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
            }
        } finally {
            taskCompletionSource.trySetResult(null);
        }
    }
}
