package p112o000oooo;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.facebook.internal.AnalyticsEvents;
import o00O000.OooO00o;
import p102o000oo.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class oO0O000o extends oO0O00O<Boolean> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final String f30044OooO = o0OoOo0.OooO0o0("BatteryChrgTracker");

    public oO0O000o(@NonNull Context context, @NonNull OooO00o oooO00o) {
        super(context, oooO00o);
    }

    @Override // p112o000oooo.oO0O00o0
    public final Object OooO00o() {
        int intExtra;
        Intent intentRegisterReceiver = this.f30050OooO0O0.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (intentRegisterReceiver == null) {
            o0OoOo0.OooO0OO().OooO0O0(f30044OooO, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        if (Build.VERSION.SDK_INT < 23 ? intentRegisterReceiver.getIntExtra("plugged", 0) != 0 : !((intExtra = intentRegisterReceiver.getIntExtra(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, -1)) != 2 && intExtra != 5)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // p112o000oooo.oO0O00O
    public final IntentFilter OooO0o() {
        IntentFilter intentFilter = new IntentFilter();
        if (Build.VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            intentFilter.addAction("android.os.action.DISCHARGING");
        } else {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        return intentFilter;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p112o000oooo.oO0O00O
    public final void OooO0oO(@NonNull Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        byte b = 0;
        o0OoOo0.OooO0OO().OooO00o(f30044OooO, String.format("Received %s", action), new Throwable[0]);
        switch (action.hashCode()) {
            case -1886648615:
                if (!action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    b = -1;
                }
                break;
            case -54942926:
                if (!action.equals("android.os.action.DISCHARGING")) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 948344062:
                if (!action.equals("android.os.action.CHARGING")) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case 1019184907:
                if (!action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            OooO0OO(Boolean.FALSE);
            return;
        }
        if (b == 1) {
            OooO0OO(Boolean.FALSE);
        } else if (b == 2) {
            OooO0OO(Boolean.TRUE);
        } else {
            if (b != 3) {
                return;
            }
            OooO0OO(Boolean.TRUE);
        }
    }
}
