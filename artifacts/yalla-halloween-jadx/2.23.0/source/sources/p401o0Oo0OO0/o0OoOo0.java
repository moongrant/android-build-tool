package p401o0Oo0OO0;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.OooO00o;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p508o0o0O.OooOO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OoOo0 {
    @NotNull
    public static final void OooO00o(@NotNull OooO00o oooO00o, int i, @NotNull OooOO0O fragment) {
        Intrinsics.checkNotNullParameter(oooO00o, "<this>");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        oooO00o.OooO0OO(i, fragment, null, 1);
        oooO00o.OooOOO(fragment, Lifecycle.State.RESUMED);
    }

    @NotNull
    public static final void OooO0O0(@NotNull OooO00o oooO00o, @NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(oooO00o, "<this>");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        oooO00o.OooOO0o(fragment);
        oooO00o.OooOOO(fragment, Lifecycle.State.STARTED);
    }

    @NotNull
    public static final void OooO0OO(@NotNull OooO00o oooO00o, @NotNull OooOO0O fragment) {
        Intrinsics.checkNotNullParameter(oooO00o, "<this>");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        oooO00o.OooOOOO(fragment);
        oooO00o.OooOOO(fragment, Lifecycle.State.RESUMED);
    }
}
