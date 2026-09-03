package p674oooo00o;

import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.facebook.internal.AnalyticsEvents;
import p084o000Ooo0.o000oOoO;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class oOo000o0 extends oO0O000<Boolean> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final String f61000OooO = o000oOoO.OooO0o0("BatteryChrgTracker");

    @Override // p674oooo00o.oO0O000o
    public final Object OooO00o() {
        Intent intentRegisterReceiver = this.f60982OooO0O0.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            o000oOoO.OooO0OO().OooO0O0(f61000OooO, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        int intExtra = intentRegisterReceiver.getIntExtra(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, -1);
        return Boolean.valueOf(intExtra == 2 || intExtra == 5);
    }

    @Override // p674oooo00o.oO0O000
    public final IntentFilter OooO0o() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    @Override // p674oooo00o.oO0O000
    public final void OooO0oO(@NonNull Intent intent) {
        String action = intent.getAction();
        if (action == null) {
        }
        byte b = 1;
        o000oOoO.OooO0OO().OooO00o(f61000OooO, String.format("Received %s", action), new Throwable[0]);
        switch (action.hashCode()) {
            case -1886648615:
                b = !action.equals("android.intent.action.ACTION_POWER_DISCONNECTED") ? (byte) -1 : (byte) 0;
                break;
            case -54942926:
                if (!action.equals("android.os.action.DISCHARGING")) {
                    b = -1;
                }
                break;
            case 948344062:
                b = !action.equals("android.os.action.CHARGING") ? (byte) -1 : (byte) 2;
                break;
            case 1019184907:
                b = !action.equals("android.intent.action.ACTION_POWER_CONNECTED") ? (byte) -1 : (byte) 3;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                OooO0OO(Boolean.FALSE);
                break;
            case 1:
                OooO0OO(Boolean.FALSE);
                break;
            case 2:
                OooO0OO(Boolean.TRUE);
                break;
            case 3:
                OooO0OO(Boolean.TRUE);
                break;
        }
    }
}
