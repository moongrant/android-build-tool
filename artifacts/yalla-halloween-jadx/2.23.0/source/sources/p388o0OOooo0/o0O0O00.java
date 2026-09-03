package p388o0OOooo0;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p136o00OOOo0.OooOO0;
import p145o00Oo0O.o000oOoO;
import p382o0OOoo0o.o0OoOo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0O0O00 extends o000oOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Context f44392OooO0Oo;

    public o0O0O00(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44392OooO0Oo = context;
    }

    @Override // p145o00Oo0O.o000oOoO
    public final boolean OooO0O0() {
        return true;
    }

    @Override // p145o00Oo0O.Oooo0
    public final void run() {
        Lazy lazy = o0OoOo0.f44301OooO0O0;
        String cloudFileHost = o0OoOo0.f44302OooO0OO + "/";
        Context appContext = this.f44392OooO0Oo;
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(cloudFileHost, "cloudFileHost");
        Context applicationContext = appContext.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "appContext.applicationContext");
        Intrinsics.checkNotNullParameter(applicationContext, "<set-?>");
        OooOO0.f37361OooO0o0 = applicationContext;
        Intrinsics.checkNotNullParameter(cloudFileHost, "<set-?>");
        OooOO0.f37360OooO0o = cloudFileHost;
    }
}
