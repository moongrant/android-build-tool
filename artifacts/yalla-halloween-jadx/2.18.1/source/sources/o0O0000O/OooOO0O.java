package o0O0000O;

import android.content.Context;
import android.os.Debug;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O extends o0O00000.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f35047OooO00o;

    public OooOO0O(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f35047OooO00o = context;
    }

    @Override // o0O00000.OooO00o
    public final void OooO00o(@NotNull o0O00.OooO00o model) {
        Intrinsics.checkNotNullParameter(model, "model");
        boolean z = true;
        model.f35018OooO00o = ((this.f35047OooO00o.getApplicationContext().getApplicationInfo().flags & 2) != 0) && Debug.isDebuggerConnected();
        try {
            throw new Exception("");
        } catch (Exception e) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "e.stackTrace");
            int length = stackTrace.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                StackTraceElement stackTraceElement = stackTrace[i];
                i++;
                if (Intrinsics.areEqual(stackTraceElement.getClassName(), "com.android.internal.os.ZygoteInit") && (i2 = i2 + 1) == 2) {
                    model.f35023OooO0o0 = z;
                }
            }
            z = false;
            model.f35023OooO0o0 = z;
        }
    }
}
