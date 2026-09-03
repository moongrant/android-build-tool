package p462o0Ooo0o;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.OooO00o;
import androidx.fragment.app.o00000OO;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000Ooo {
    @NotNull
    public static final o00000OO OooO00o(@NotNull o00000OO o00000oo2, int i, @NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(o00000oo2, "<this>");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        o00000oo2.OooO0Oo(i, fragment, null, 1);
        o00000oo2.OooO0o0(fragment, Lifecycle.State.RESUMED);
        return o00000oo2;
    }

    @NotNull
    public static final o00000OO OooO0O0(@NotNull o00000OO o00000oo2, @NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(o00000oo2, "<this>");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        OooO00o oooO00o = (OooO00o) o00000oo2;
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == oooO00o.f8369OooOOOo) {
            oooO00o.OooO0O0(new o00000OO.OooO00o(4, fragment));
            o00000oo2.OooO0o0(fragment, Lifecycle.State.STARTED);
            return o00000oo2;
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Cannot hide Fragment attached to a different FragmentManager. Fragment ");
        sbOooO0o0.append(fragment.toString());
        sbOooO0o0.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sbOooO0o0.toString());
    }

    @NotNull
    public static final o00000OO OooO0OO(@NotNull o00000OO o00000oo2, @NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(o00000oo2, "<this>");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        OooO00o oooO00o = (OooO00o) o00000oo2;
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == oooO00o.f8369OooOOOo) {
            oooO00o.OooO0O0(new o00000OO.OooO00o(5, fragment));
            o00000oo2.OooO0o0(fragment, Lifecycle.State.RESUMED);
            return o00000oo2;
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Cannot show Fragment attached to a different FragmentManager. Fragment ");
        sbOooO0o0.append(fragment.toString());
        sbOooO0o0.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sbOooO0o0.toString());
    }
}
