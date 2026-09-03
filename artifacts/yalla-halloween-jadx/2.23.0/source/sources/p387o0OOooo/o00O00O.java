package p387o0OOooo;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p145o00Oo0O.o000oOoO;
import p579o0oOoo.oOO00;
import p579o0oOoo.oOO000;
import p579o0oOoo.oOO000o;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00O00O extends o000oOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Context f44375OooO0Oo;

    public o00O00O(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44375OooO0Oo = context;
    }

    @Override // p145o00Oo0O.Oooo0
    public final void run() {
        NotificationManager notificationManager = (NotificationManager) this.f44375OooO0Oo.getSystemService("notification");
        if (Build.VERSION.SDK_INT >= 26) {
            notificationManager.createNotificationChannelGroup(oOO000.OooO00o());
            NotificationChannel notificationChannelOooO00o = oOO000o.OooO00o();
            notificationChannelOooO00o.enableLights(true);
            notificationChannelOooO00o.setLightColor(-16711936);
            notificationChannelOooO00o.setShowBadge(true);
            notificationManager.createNotificationChannel(notificationChannelOooO00o);
            NotificationChannel notificationChannelOooO00o2 = oOO00.OooO00o();
            notificationChannelOooO00o2.enableLights(false);
            notificationChannelOooO00o2.setShowBadge(true);
            notificationChannelOooO00o2.enableVibration(false);
            notificationChannelOooO00o2.setVibrationPattern(null);
            notificationChannelOooO00o2.setSound(null, null);
            notificationManager.createNotificationChannel(notificationChannelOooO00o2);
        }
    }
}
