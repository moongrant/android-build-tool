package o00O0OO0;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.Intrinsics;
import o00O0OOO.o0OoOo0;
import org.jetbrains.annotations.NotNull;
import p115o00O00oO.o0Oo0oo;
import p119o00O0Oo0.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(24)
public final class OooOOOO extends OooOO0O<o00O0O0O.OooO0O0> {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final ConnectivityManager f36263OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final OooOOO f36264OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(@NotNull Context context, @NotNull o00O0O taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Object systemService = this.f36257OooO0O0.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f36263OooO0o = (ConnectivityManager) systemService;
        this.f36264OooO0oO = new OooOOO(this);
    }

    @Override // o00O0OO0.OooOO0O
    public final o00O0O0O.OooO0O0 OooO00o() {
        return OooOo00.OooO00o(this.f36263OooO0o);
    }

    @Override // o00O0OO0.OooOO0O
    public final void OooO0Oo() {
        try {
            o0Oo0oo.OooO0Oo().OooO00o(OooOo00.f36266OooO00o, "Registering network callback");
            o0OoOo0.OooO00o(this.f36263OooO0o, this.f36264OooO0oO);
        } catch (IllegalArgumentException e) {
            o0Oo0oo.OooO0Oo().OooO0OO(OooOo00.f36266OooO00o, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            o0Oo0oo.OooO0Oo().OooO0OO(OooOo00.f36266OooO00o, "Received exception while registering network callback", e2);
        }
    }

    @Override // o00O0OO0.OooOO0O
    public final void OooO0o0() {
        try {
            o0Oo0oo.OooO0Oo().OooO00o(OooOo00.f36266OooO00o, "Unregistering network callback");
            o00O0OOO.Oooo0.OooO0OO(this.f36263OooO0o, this.f36264OooO0oO);
        } catch (IllegalArgumentException e) {
            o0Oo0oo.OooO0Oo().OooO0OO(OooOo00.f36266OooO00o, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            o0Oo0oo.OooO0Oo().OooO0OO(OooOo00.f36266OooO00o, "Received exception while unregistering network callback", e2);
        }
    }
}
