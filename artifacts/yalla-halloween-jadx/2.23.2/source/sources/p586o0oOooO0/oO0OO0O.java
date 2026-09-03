package p586o0oOooO0;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.OooO00o;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p527o0o0OO0o.o000O;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0OO0O {
    @NotNull
    public static final void OooO00o(@NotNull OooO00o oooO00o, int i, @NotNull o000O fragment) {
        Intrinsics.checkNotNullParameter(oooO00o, "<this>");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        oooO00o.OooO0OO(i, fragment, null, 1);
        oooO00o.OooOOO0(fragment, Lifecycle.State.RESUMED);
    }

    @NotNull
    public static final void OooO0O0(@NotNull OooO00o oooO00o, @NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(oooO00o, "<this>");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        oooO00o.OooOO0O(fragment);
        oooO00o.OooOOO0(fragment, Lifecycle.State.STARTED);
    }

    @NotNull
    public static final void OooO0OO(@NotNull OooO00o oooO00o, @NotNull o000O fragment) {
        Intrinsics.checkNotNullParameter(oooO00o, "<this>");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        oooO00o.OooOOO(fragment);
        oooO00o.OooOOO0(fragment, Lifecycle.State.RESUMED);
    }
}
