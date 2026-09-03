package p395o0Oo00o;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.Oooo000;
import kotlin.jvm.internal.Intrinsics;
import o00000O.OooOOOO;
import org.jetbrains.annotations.NotNull;
import p191o00o0O0.o00Oo0;
import p590o0oOooo0.b0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooOOO extends o00Oo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Context f43623OooO0Oo;

    public OooOOO(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43623OooO0Oo = context;
    }

    @Override // p191o00o0O0.o00O0O
    public final void run() {
        NotificationManager notificationManager = (NotificationManager) this.f43623OooO0Oo.getSystemService("notification");
        if (Build.VERSION.SDK_INT >= 26) {
            notificationManager.createNotificationChannelGroup(Oooo000.OooO00o());
            NotificationChannel notificationChannelOooO00o = b0.OooO00o();
            notificationChannelOooO00o.enableLights(true);
            notificationChannelOooO00o.setLightColor(-16711936);
            notificationChannelOooO00o.setShowBadge(true);
            notificationManager.createNotificationChannel(notificationChannelOooO00o);
            NotificationChannel notificationChannelOooO00o2 = OooOOOO.OooO00o();
            notificationChannelOooO00o2.enableLights(false);
            notificationChannelOooO00o2.setShowBadge(true);
            notificationChannelOooO00o2.enableVibration(false);
            notificationChannelOooO00o2.setVibrationPattern(null);
            notificationChannelOooO00o2.setSound(null, null);
            notificationManager.createNotificationChannel(notificationChannelOooO00o2);
        }
    }
}
