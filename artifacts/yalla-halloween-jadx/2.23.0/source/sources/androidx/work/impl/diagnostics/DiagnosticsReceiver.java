package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import p084o000Ooo0.o000oOoO;
import p084o000Ooo0.o0OoOo0;
import p085o000OooO.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String f8467OooO00o = o000oOoO.OooO0o0("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@NonNull Context context, @Nullable Intent intent) {
        if (intent == null) {
            return;
        }
        String str = f8467OooO00o;
        o000oOoO.OooO0OO().OooO00o(str, "Requesting diagnostics", new Throwable[0]);
        try {
            o0OOO0o.OooO0OO(context).OooO00o(o0OoOo0.OooO00o());
        } catch (IllegalStateException e) {
            o000oOoO.OooO0OO().OooO0O0(str, "WorkManager is not initialized", e);
        }
    }
}
