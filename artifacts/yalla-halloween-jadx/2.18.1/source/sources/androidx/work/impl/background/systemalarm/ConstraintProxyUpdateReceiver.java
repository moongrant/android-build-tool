package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p102o000oo.o0OoOo0;
import p107o000ooO0.o00oO0o;
import p326o0O0ooO.o00O00;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String f9777OooO00o = o0OoOo0.OooO0o0("ConstrntProxyUpdtRecvr");

    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Intent f9778Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Context f9779Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ BroadcastReceiver.PendingResult f9780Oooo0oo;

        public OooO00o(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f9778Oooo0o = intent;
            this.f9779Oooo0oO = context;
            this.f9780Oooo0oo = pendingResult;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                boolean booleanExtra = this.f9778Oooo0o.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f9778Oooo0o.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f9778Oooo0o.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f9778Oooo0o.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                o0OoOo0.OooO0OO().OooO00o(ConstraintProxyUpdateReceiver.f9777OooO00o, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)), new Throwable[0]);
                o00O00.OooO00o(this.f9779Oooo0oO, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                o00O00.OooO00o(this.f9779Oooo0oO, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                o00O00.OooO00o(this.f9779Oooo0oO, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                o00O00.OooO00o(this.f9779Oooo0oO, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f9780Oooo0oo.finish();
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@NonNull Context context, @Nullable Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            ((o00O000.OooO0O0) o00oO0o.OooO0O0(context).f29977OooO0Oo).OooO00o(new OooO00o(intent, context, goAsync()));
        } else {
            o0OoOo0.OooO0OO().OooO00o(f9777OooO00o, String.format("Ignoring unknown action %s", action), new Throwable[0]);
        }
    }
}
