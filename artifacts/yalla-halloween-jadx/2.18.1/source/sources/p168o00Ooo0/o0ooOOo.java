package p168o00Ooo0;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Build;
import com.app.base.application.App;
import com.facebook.share.internal.ShareConstants;
import com.weieyu.yalla.R;
import net.sqlcipher.database.SQLiteDatabase;
import p113o00O00Oo.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class o0ooOOo {
    public static Notification.Builder OooO00o() {
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = i >= 26 ? new Notification.Builder(App.f11458Oooo0oO, "1") : new Notification.Builder(App.f11458Oooo0oO);
        if (i >= 24) {
            builder.setGroupSummary(false).setGroup("Yalla");
        }
        return builder;
    }

    public static void OooO0O0(Context context) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (Build.VERSION.SDK_INT >= 26) {
            notificationManager.createNotificationChannelGroup(new NotificationChannelGroup("Yalla", ""));
            NotificationChannel notificationChannel = new NotificationChannel("1", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, 3);
            notificationChannel.enableLights(true);
            notificationChannel.setLightColor(-16711936);
            notificationChannel.setShowBadge(true);
            notificationManager.createNotificationChannel(notificationChannel);
            NotificationChannel notificationChannel2 = new NotificationChannel("yalla_room", "room", 2);
            notificationChannel2.enableLights(false);
            notificationChannel2.setShowBadge(true);
            notificationChannel2.enableVibration(false);
            notificationChannel2.setVibrationPattern(null);
            notificationChannel2.setSound(null, null);
            notificationManager.createNotificationChannel(notificationChannel2);
        }
    }

    public static void OooO0OO(String str, String str2, String str3, String str4, Intent intent) {
        PendingIntent activity = PendingIntent.getActivity(App.f11458Oooo0oO, 0, intent, Build.VERSION.SDK_INT >= 23 ? 335544320 : SQLiteDatabase.CREATE_IF_NECESSARY);
        Notification.Builder builderOooO00o = OooO00o();
        builderOooO00o.setContentTitle(str2).setContentText(str3).setTicker(str4).setDefaults(2).setSmallIcon(R.drawable.icon_notification_small).setLargeIcon(BitmapFactory.decodeResource(App.f11458Oooo0oO.getResources(), R.drawable.ic_logo)).setAutoCancel(true).setOngoing(false).setPriority(1).setContentIntent(activity);
        App.f11459Oooo0oo.post(new OooOOO0(str, builderOooO00o, 1));
    }
}
