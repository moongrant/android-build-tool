package p590o0oOooo0;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Build;
import com.yalla.yalla.app.application.App;
import o000Oo0.o0OoOo0;
import p028Oooo0oO.o00Oo00;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public final class g0 {
    public static Notification.Builder OooO00o() {
        Notification.Builder builder;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            o0OoOo0.OooO00o();
            builder = f0.OooO00o(App.f22232OooO0o);
        } else {
            builder = new Notification.Builder(App.f22232OooO0o);
        }
        if (i >= 24) {
            builder.setGroupSummary(false).setGroup("Yalla");
        }
        return builder;
    }

    public static void OooO0O0(String str, String str2, String str3, String str4, Intent intent) {
        PendingIntent activity = PendingIntent.getActivity(App.f22232OooO0o, 0, intent, 335544320);
        Notification.Builder builderOooO00o = OooO00o();
        builderOooO00o.setContentTitle(str2).setContentText(str3).setTicker(str4).setDefaults(2).setSmallIcon(o0Oo0oo.icon_notification_small).setLargeIcon(BitmapFactory.decodeResource(App.f22232OooO0o.getResources(), o0Oo0oo.ic_logo)).setAutoCancel(true).setOngoing(false).setPriority(1).setContentIntent(activity);
        App.f22234OooO0oO.post(new o00Oo00(1, str, builderOooO00o));
    }
}
