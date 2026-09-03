package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.Objects;
import p102o000oo.o0OoOo0;
import p107o000ooO0.o00oO0o;

/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String f9816OooO00o = o0OoOo0.OooO0o0("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        o0OoOo0.OooO0OO().OooO00o(f9816OooO00o, String.format("Received intent %s", intent), new Throwable[0]);
        if (Build.VERSION.SDK_INT < 23) {
            String str = OooO00o.f9781Oooo;
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_RESCHEDULE");
            context.startService(intent2);
            return;
        }
        try {
            o00oO0o o00oo0oOooO0O0 = o00oO0o.OooO0O0(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            Objects.requireNonNull(o00oo0oOooO0O0);
            synchronized (o00oO0o.f29972OooOO0o) {
                try {
                    o00oo0oOooO0O0.f29973OooO = pendingResultGoAsync;
                    if (o00oo0oOooO0O0.f29981OooO0oo) {
                        pendingResultGoAsync.finish();
                        o00oo0oOooO0O0.f29973OooO = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e) {
            o0OoOo0.OooO0OO().OooO0O0(f9816OooO00o, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
