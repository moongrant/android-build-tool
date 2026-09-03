package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import p102o000oo.o00O0O;
import p102o000oo.o0OoOo0;
import p107o000ooO0.o00oO0o;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String f9823OooO00o = o0OoOo0.OooO0o0("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@NonNull Context context, @Nullable Intent intent) {
        if (intent == null) {
            return;
        }
        o0OoOo0.OooO0OO().OooO00o(f9823OooO00o, "Requesting diagnostics", new Throwable[0]);
        try {
            o00oO0o.OooO0O0(context).OooO00o(o00O0O.OooO0O0());
        } catch (IllegalStateException e) {
            o0OoOo0.OooO0OO().OooO0O0(f9823OooO00o, "WorkManager is not initialized", e);
        }
    }
}
