package p112o000oooo;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.facebook.internal.AnalyticsEvents;
import java.util.Objects;
import o00O000.OooO00o;
import p102o000oo.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class oO0O00 extends oO0O00O<Boolean> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final String f30043OooO = o0OoOo0.OooO0o0("BatteryNotLowTracker");

    public oO0O00(@NonNull Context context, @NonNull OooO00o oooO00o) {
        super(context, oooO00o);
    }

    @Override // p112o000oooo.oO0O00o0
    public final Object OooO00o() {
        Intent intentRegisterReceiver = this.f30050OooO0O0.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return Boolean.valueOf(intentRegisterReceiver.getIntExtra(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, -1) == 1 || ((float) intentRegisterReceiver.getIntExtra("level", -1)) / ((float) intentRegisterReceiver.getIntExtra("scale", -1)) > 0.15f);
        }
        o0OoOo0.OooO0OO().OooO0O0(f30043OooO, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }

    @Override // p112o000oooo.oO0O00O
    public final IntentFilter OooO0o() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // p112o000oooo.oO0O00O
    public final void OooO0oO(@NonNull Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        o0OoOo0.OooO0OO().OooO00o(f30043OooO, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        Objects.requireNonNull(action);
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            OooO0OO(Boolean.TRUE);
        } else if (action.equals("android.intent.action.BATTERY_LOW")) {
            OooO0OO(Boolean.FALSE);
        }
    }
}
