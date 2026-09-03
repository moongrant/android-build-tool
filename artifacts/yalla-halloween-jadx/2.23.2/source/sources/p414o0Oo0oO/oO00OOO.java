package p414o0Oo0oO;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p475o0Ooooo0.o0O00oO0;
import p477o0o00.OooO0O0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oO00OOO extends OooO0O0 {
    public oO00OOO() {
        super("user_table");
    }

    public final int OooOO0O() {
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        return OooO0OO("bindMoreAccountCount" + o0O00oO0.OooOOo0().getValue(), 0);
    }

    public final int OooOO0o() {
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        return OooO0OO("bindMoreAccountMaxCount" + o0O00oO0.OooOOo0().getValue(), 0);
    }

    public final int OooOOO() {
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        return OooO0OO("leavePage" + o0O00oO0.OooOOo0().getValue(), 3);
    }

    @NotNull
    public final String OooOOO0() {
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        return OooO0o0("lastSignInTime" + o0O00oO0.OooOOo0().getValue(), "");
    }

    public final boolean OooOOOO() {
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        return OooO0O0("privateChatNotice" + o0O00oO0.OooOOo0().getValue(), false);
    }

    public final void OooOOOo(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        OooO("lastSignInTime" + o0O00oO0.OooOOo0().getValue(), value);
    }

    public final void OooOOo0(int i) {
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        OooO0oO(i, "leavePage" + o0O00oO0.OooOOo0().getValue());
    }
}
