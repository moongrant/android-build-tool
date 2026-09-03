package p674oooo00o;

import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import p084o000Ooo0.o000oOoO;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class oO0O00o0 extends oO0O000<Boolean> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final String f60994OooO = o000oOoO.OooO0o0("StorageNotLowTracker");

    @Override // p674oooo00o.oO0O000o
    public final Object OooO00o() {
        Intent intentRegisterReceiver = this.f60982OooO0O0.registerReceiver(null, OooO0o());
        if (intentRegisterReceiver == null || intentRegisterReceiver.getAction() == null) {
            return Boolean.TRUE;
        }
        String action = intentRegisterReceiver.getAction();
        action.getClass();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            return Boolean.FALSE;
        }
        if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return Boolean.TRUE;
        }
        return null;
    }

    @Override // p674oooo00o.oO0O000
    public final IntentFilter OooO0o() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // p674oooo00o.oO0O000
    public final void OooO0oO(@NonNull Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        o000oOoO.OooO0OO().OooO00o(f60994OooO, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            OooO0OO(Boolean.FALSE);
        } else if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            OooO0OO(Boolean.TRUE);
        }
    }
}
