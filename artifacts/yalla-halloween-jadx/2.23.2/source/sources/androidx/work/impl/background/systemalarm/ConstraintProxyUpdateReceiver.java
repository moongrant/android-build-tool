package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o00O0OOO.o00O0O;
import oo00o.o00000O0;
import p022Oooo00O.o00O00OO;
import p115o00O00oO.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String f11504OooO00o = o0Oo0oo.OooO0o("ConstrntProxyUpdtRecvr");

    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Intent f11505OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ BroadcastReceiver.PendingResult f11506OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Context f11507OooO0o0;

        public OooO00o(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f11505OooO0Oo = intent;
            this.f11507OooO0o0 = context;
            this.f11506OooO0o = pendingResult;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BroadcastReceiver.PendingResult pendingResult = this.f11506OooO0o;
            Context context = this.f11507OooO0o0;
            Intent intent = this.f11505OooO0Oo;
            try {
                boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                o0Oo0oo.OooO0Oo().OooO00o(ConstraintProxyUpdateReceiver.f11504OooO00o, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                o00O0O.OooO00o(context, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                o00O0O.OooO00o(context, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                o00O0O.OooO00o(context, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                o00O0O.OooO00o(context, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                pendingResult.finish();
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@NonNull Context context, @Nullable Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            o0Oo0oo.OooO0Oo().OooO00o(f11504OooO00o, o00O00OO.OooO00o("Ignoring unknown action ", action));
        } else {
            ((p119o00O0Oo0.o00O0O) o00000O0.OooO0Oo(context).f60222OooO0Oo).OooO00o(new OooO00o(intent, context, goAsync()));
        }
    }
}
