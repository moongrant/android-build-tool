package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p084o000Ooo0.o000oOoO;
import p085o000OooO.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String f8460OooO00o = o000oOoO.OooO0o0("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        o000oOoO.OooO0OO().OooO00o(f8460OooO00o, String.format("Received intent %s", intent), new Throwable[0]);
        try {
            o0OOO0o o0ooo0oOooO0OO = o0OOO0o.OooO0OO(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            o0ooo0oOooO0OO.getClass();
            synchronized (o0OOO0o.f35156OooOO0o) {
                try {
                    o0ooo0oOooO0OO.f35157OooO = pendingResultGoAsync;
                    if (o0ooo0oOooO0OO.f35165OooO0oo) {
                        pendingResultGoAsync.finish();
                        o0ooo0oOooO0OO.f35157OooO = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e) {
            o000oOoO.OooO0OO().OooO0O0(f8460OooO00o, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
