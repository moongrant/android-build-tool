package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.Collections;
import kotlin.jvm.internal.Intrinsics;
import oo00o.o00000O0;
import p115o00O00oO.o0OO00O;
import p115o00O00oO.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String f11554OooO00o = o0Oo0oo.OooO0o("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@NonNull Context context, @Nullable Intent intent) {
        if (intent == null) {
            return;
        }
        o0Oo0oo o0oo0ooOooO0Oo = o0Oo0oo.OooO0Oo();
        String str = f11554OooO00o;
        o0oo0ooOooO0Oo.OooO00o(str, "Requesting diagnostics");
        try {
            o00000O0 o00000o0OooO0Oo = o00000O0.OooO0Oo(context);
            Intrinsics.checkNotNullParameter(DiagnosticsWorker.class, "workerClass");
            o0OO00O o0oo00oOooO00o = new o0OO00O.OooO00o(DiagnosticsWorker.class).OooO00o();
            o00000o0OooO0Oo.getClass();
            o00000o0OooO0Oo.OooO00o(Collections.singletonList(o0oo00oOooO00o));
        } catch (IllegalStateException e) {
            o0Oo0oo.OooO0Oo().OooO0OO(str, "WorkManager is not initialized", e);
        }
    }
}
