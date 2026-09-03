package p579o0oOoo;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Build;
import androidx.camera.core.impl.o00OOO00;
import com.yalla.yalla.app.application.App;
import p028Oooo0oO.o0o0Oo;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes5.dex */
public final class oOO0O0 {
    public static Notification.Builder OooO00o() {
        Notification.Builder builder;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            o00OOO00.OooO00o();
            builder = oOO0O00O.OooO00o(App.f22702OooO0o);
        } else {
            builder = new Notification.Builder(App.f22702OooO0o);
        }
        if (i >= 24) {
            builder.setGroupSummary(false).setGroup("Yalla");
        }
        return builder;
    }

    public static void OooO0O0(String str, String str2, String str3, String str4, Intent intent) {
        PendingIntent activity = PendingIntent.getActivity(App.f22702OooO0o, 0, intent, 335544320);
        Notification.Builder builderOooO00o = OooO00o();
        builderOooO00o.setContentTitle(str2).setContentText(str3).setTicker(str4).setDefaults(2).setSmallIcon(oOo00OO0.icon_notification_small).setLargeIcon(BitmapFactory.decodeResource(App.f22702OooO0o.getResources(), oOo00OO0.ic_logo)).setAutoCancel(true).setOngoing(false).setPriority(1).setContentIntent(activity);
        App.f22704OooO0oO.post(new o0o0Oo(1, str, builderOooO00o));
    }
}
