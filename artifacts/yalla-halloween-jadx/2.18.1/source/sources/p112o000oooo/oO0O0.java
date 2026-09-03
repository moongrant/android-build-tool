package p112o000oooo;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.Objects;
import o00O000.OooO00o;
import p102o000oo.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class oO0O0 extends oO0O00O<Boolean> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final String f30042OooO = o0OoOo0.OooO0o0("StorageNotLowTracker");

    public oO0O0(@NonNull Context context, @NonNull OooO00o oooO00o) {
        super(context, oooO00o);
    }

    @Override // p112o000oooo.oO0O00o0
    public final Object OooO00o() {
        Context context = this.f30050OooO0O0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        Intent intentRegisterReceiver = context.registerReceiver(null, intentFilter);
        if (intentRegisterReceiver == null || intentRegisterReceiver.getAction() == null) {
            return Boolean.TRUE;
        }
        String action = intentRegisterReceiver.getAction();
        Objects.requireNonNull(action);
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            return Boolean.FALSE;
        }
        if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return Boolean.TRUE;
        }
        return null;
    }

    @Override // p112o000oooo.oO0O00O
    public final IntentFilter OooO0o() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // p112o000oooo.oO0O00O
    public final void OooO0oO(@NonNull Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        o0OoOo0.OooO0OO().OooO00o(f30042OooO, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        Objects.requireNonNull(action);
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            OooO0OO(Boolean.FALSE);
        } else if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            OooO0OO(Boolean.TRUE);
        }
    }
}
