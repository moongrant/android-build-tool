package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p084o000Ooo0.o000oOoO;
import p085o000OooO.o0OOO0o;
import p093o000o0OO.o0ooOOo;
import p096o000o0o0.o0000O0O;

/* JADX INFO: loaded from: classes2.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String f8422OooO00o = o000oOoO.OooO0o0("ConstrntProxyUpdtRecvr");

    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Intent f8423OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ BroadcastReceiver.PendingResult f8424OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Context f8425OooO0o0;

        public OooO00o(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f8423OooO0Oo = intent;
            this.f8425OooO0o0 = context;
            this.f8424OooO0o = pendingResult;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BroadcastReceiver.PendingResult pendingResult = this.f8424OooO0o;
            Context context = this.f8425OooO0o0;
            Intent intent = this.f8423OooO0Oo;
            try {
                boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                o000oOoO.OooO0OO().OooO00o(ConstraintProxyUpdateReceiver.f8422OooO00o, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)), new Throwable[0]);
                o0ooOOo.OooO00o(context, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                o0ooOOo.OooO00o(context, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                o0ooOOo.OooO00o(context, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                o0ooOOo.OooO00o(context, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                pendingResult.finish();
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@NonNull Context context, @Nullable Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            ((o0000O0O) o0OOO0o.OooO0OO(context).f35161OooO0Oo).OooO00o(new OooO00o(intent, context, goAsync()));
        } else {
            o000oOoO.OooO0OO().OooO00o(f8422OooO00o, String.format("Ignoring unknown action %s", action), new Throwable[0]);
        }
    }
}
