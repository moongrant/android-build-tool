package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import oo00o.o00000O0;
import p115o00O00oO.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String f11545OooO00o = o0Oo0oo.OooO0o("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        o0Oo0oo.OooO0Oo().OooO00o(f11545OooO00o, "Received intent " + intent);
        try {
            o00000O0 o00000o0OooO0Oo = o00000O0.OooO0Oo(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            o00000o0OooO0Oo.getClass();
            synchronized (o00000O0.f60217OooOOO0) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = o00000o0OooO0Oo.f60218OooO;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    o00000o0OooO0Oo.f60218OooO = pendingResultGoAsync;
                    if (o00000o0OooO0Oo.f60226OooO0oo) {
                        pendingResultGoAsync.finish();
                        o00000o0OooO0Oo.f60218OooO = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e) {
            o0Oo0oo.OooO0Oo().OooO0OO(f11545OooO00o, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
