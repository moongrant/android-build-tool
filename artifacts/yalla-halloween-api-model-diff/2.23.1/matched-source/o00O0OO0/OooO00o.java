package o00O0OO0;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.RestrictTo;
import com.facebook.internal.AnalyticsEvents;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p115o00O00oO.o0Oo0oo;
import p119o00O0Oo0.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO00o extends OooO<Boolean> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(@NotNull Context context, @NotNull o00O0O taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
    }

    @Override // o00O0OO0.OooOO0O
    public final Object OooO00o() {
        Intent intentRegisterReceiver = this.f36253OooO0O0.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            o0Oo0oo.OooO0Oo().OooO0O0(OooO0O0.f36249OooO00o, "getInitialState - null intent received");
            return Boolean.FALSE;
        }
        int intExtra = intentRegisterReceiver.getIntExtra(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, -1);
        return Boolean.valueOf(intExtra == 2 || intExtra == 5);
    }

    @Override // o00O0OO0.OooO
    @NotNull
    public final IntentFilter OooO0o() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // o00O0OO0.OooO
    public final void OooO0oO(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        String action = intent.getAction();
        if (action == null) {
        }
        o0Oo0oo.OooO0Oo().OooO00o(OooO0O0.f36249OooO00o, "Received ".concat(action));
        switch (action.hashCode()) {
            case -1886648615:
                if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    OooO0OO(Boolean.FALSE);
                    break;
                }
                break;
            case -54942926:
                if (action.equals("android.os.action.DISCHARGING")) {
                    OooO0OO(Boolean.FALSE);
                    break;
                }
                break;
            case 948344062:
                if (action.equals("android.os.action.CHARGING")) {
                    OooO0OO(Boolean.TRUE);
                    break;
                }
                break;
            case 1019184907:
                if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                    OooO0OO(Boolean.TRUE);
                    break;
                }
                break;
        }
    }
}
