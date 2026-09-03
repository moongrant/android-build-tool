package p396o0Oo00o0;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p182o00o000O.OooOO0O;
import p191o00o0O0.o00Oo0;
import p386o0OOooO.o0OOO0o;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooOo extends o00Oo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Context f43627OooO0Oo;

    public OooOo(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43627OooO0Oo = context;
    }

    @Override // p191o00o0O0.o00Oo0
    public final boolean OooO0O0() {
        return true;
    }

    @Override // p191o00o0O0.o00O0O
    public final void run() {
        Lazy lazy = o0OOO0o.f43500OooO0O0;
        String cloudFileHost = o0OOO0o.f43501OooO0OO + "/";
        Context appContext = this.f43627OooO0Oo;
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(cloudFileHost, "cloudFileHost");
        Context applicationContext = appContext.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        Intrinsics.checkNotNullParameter(applicationContext, "<set-?>");
        OooOO0O.f38411OooO0o0 = applicationContext;
        Intrinsics.checkNotNullParameter(cloudFileHost, "<set-?>");
        OooOO0O.f38410OooO0o = cloudFileHost;
    }
}
