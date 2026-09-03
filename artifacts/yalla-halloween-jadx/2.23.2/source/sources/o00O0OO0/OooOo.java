package o00O0OO0;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p115o00O00oO.o0Oo0oo;
import p119o00O0Oo0.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo extends OooO<o00O0O0O.OooO0O0> {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final ConnectivityManager f36265OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(@NotNull Context context, @NotNull o00O0O taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Object systemService = this.f36257OooO0O0.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f36265OooO0oO = (ConnectivityManager) systemService;
    }

    @Override // o00O0OO0.OooOO0O
    public final Object OooO00o() {
        return OooOo00.OooO00o(this.f36265OooO0oO);
    }

    @Override // o00O0OO0.OooO
    @NotNull
    public final IntentFilter OooO0o() {
        return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }

    @Override // o00O0OO0.OooO
    public final void OooO0oO(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (Intrinsics.areEqual(intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
            o0Oo0oo.OooO0Oo().OooO00o(OooOo00.f36266OooO00o, "Network broadcast received");
            OooO0OO(OooOo00.OooO00o(this.f36265OooO0oO));
        }
    }
}
