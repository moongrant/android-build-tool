package o00O0OO0;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p115o00O00oO.o0Oo0oo;
import p119o00O0Oo0.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class Oooo000 extends OooO<Boolean> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(@NotNull Context context, @NotNull o00O0O taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    @Override // o00O0OO0.OooOO0O
    public final Object OooO00o() {
        boolean z;
        Intent intentRegisterReceiver = this.f36257OooO0O0.registerReceiver(null, OooO0o());
        if (intentRegisterReceiver != null && intentRegisterReceiver.getAction() != null) {
            String action = intentRegisterReceiver.getAction();
            if (action != null) {
                int iHashCode = action.hashCode();
                if (iHashCode != -1181163412) {
                    z = iHashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK");
                } else {
                    action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                }
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // o00O0OO0.OooO
    @NotNull
    public final IntentFilter OooO0o() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // o00O0OO0.OooO
    public final void OooO0oO(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (intent.getAction() == null) {
            return;
        }
        o0Oo0oo.OooO0Oo().OooO00o(Oooo0.f36267OooO00o, "Received " + intent.getAction());
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode == -1181163412) {
                if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                    OooO0OO(Boolean.FALSE);
                }
            } else if (iHashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                OooO0OO(Boolean.TRUE);
            }
        }
    }
}
