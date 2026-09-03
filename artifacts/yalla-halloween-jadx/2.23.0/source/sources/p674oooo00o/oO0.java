package p674oooo00o;

import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.facebook.internal.AnalyticsEvents;
import p084o000Ooo0.o000oOoO;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class oO0 extends oO0O000<Boolean> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final String f60976OooO = o000oOoO.OooO0o0("BatteryNotLowTracker");

    @Override // p674oooo00o.oO0O000o
    public final Object OooO00o() {
        Intent intentRegisterReceiver = this.f60982OooO0O0.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return Boolean.valueOf(intentRegisterReceiver.getIntExtra(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, -1) == 1 || ((float) intentRegisterReceiver.getIntExtra("level", -1)) / ((float) intentRegisterReceiver.getIntExtra("scale", -1)) > 0.15f);
        }
        o000oOoO.OooO0OO().OooO0O0(f60976OooO, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }

    @Override // p674oooo00o.oO0O000
    public final IntentFilter OooO0o() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // p674oooo00o.oO0O000
    public final void OooO0oO(@NonNull Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        o000oOoO.OooO0OO().OooO00o(f60976OooO, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            OooO0OO(Boolean.TRUE);
        } else if (action.equals("android.intent.action.BATTERY_LOW")) {
            OooO0OO(Boolean.FALSE);
        }
    }
}
