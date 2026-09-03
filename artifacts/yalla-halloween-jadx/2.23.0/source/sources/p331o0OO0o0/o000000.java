package p331o0OO0o0;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.OooO00o;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class o000000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @JvmField
    @NotNull
    public final LinkedHashSet f43168OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public FragmentActivity f43169OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final Fragment f43170OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f43171OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @JvmField
    @NotNull
    public final Set<String> f43172OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @JvmField
    @NotNull
    public final LinkedHashSet f43173OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @JvmField
    @NotNull
    public final Set<String> f43174OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @JvmField
    @NotNull
    public final LinkedHashSet f43175OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @JvmField
    @NotNull
    public final LinkedHashSet f43176OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @JvmField
    @NotNull
    public final LinkedHashSet f43177OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @JvmField
    @Nullable
    public o0O0O00 f43178OooOO0O;

    public o000000(@Nullable FragmentActivity fragmentActivity, @Nullable Fragment fragment, @NotNull LinkedHashSet normalPermissions, @NotNull LinkedHashSet specialPermissions) {
        Intrinsics.checkNotNullParameter(normalPermissions, "normalPermissions");
        Intrinsics.checkNotNullParameter(specialPermissions, "specialPermissions");
        this.f43171OooO0OO = -1;
        this.f43173OooO0o = new LinkedHashSet();
        this.f43175OooO0oO = new LinkedHashSet();
        this.f43176OooO0oo = new LinkedHashSet();
        this.f43168OooO = new LinkedHashSet();
        new LinkedHashSet();
        this.f43177OooOO0 = new LinkedHashSet();
        if (fragmentActivity != null) {
            Intrinsics.checkNotNullParameter(fragmentActivity, "<set-?>");
            this.f43169OooO00o = fragmentActivity;
        }
        if (fragmentActivity == null && fragment != null) {
            FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "fragment.requireActivity()");
            Intrinsics.checkNotNullParameter(fragmentActivityRequireActivity, "<set-?>");
            this.f43169OooO00o = fragmentActivityRequireActivity;
        }
        this.f43170OooO0O0 = fragment;
        this.f43172OooO0Oo = normalPermissions;
        this.f43174OooO0o0 = specialPermissions;
    }

    @NotNull
    public final FragmentActivity OooO00o() {
        FragmentActivity fragmentActivity = this.f43169OooO00o;
        if (fragmentActivity != null) {
            return fragmentActivity;
        }
        Intrinsics.throwUninitializedPropertyAccessException("activity");
        return null;
    }

    public final FragmentManager OooO0O0() {
        Fragment fragment = this.f43170OooO0O0;
        FragmentManager childFragmentManager = fragment == null ? null : fragment.getChildFragmentManager();
        if (childFragmentManager != null) {
            return childFragmentManager;
        }
        FragmentManager supportFragmentManager = OooO00o().getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "activity.supportFragmentManager");
        return supportFragmentManager;
    }

    public final o000OOo OooO0OO() {
        Fragment fragmentOooOoo = OooO0O0().OooOoo("InvisibleFragment");
        if (fragmentOooOoo != null) {
            return (o000OOo) fragmentOooOoo;
        }
        o000OOo o000ooo2 = new o000OOo();
        FragmentManager fragmentManagerOooO0O0 = OooO0O0();
        fragmentManagerOooO0O0.getClass();
        OooO00o oooO00o = new OooO00o(fragmentManagerOooO0O0);
        oooO00o.OooO0OO(0, o000ooo2, "InvisibleFragment", 1);
        oooO00o.OooO();
        return o000ooo2;
    }

    public final int OooO0Oo() {
        return OooO00o().getApplicationInfo().targetSdkVersion;
    }

    public final void OooO0o0(@NotNull Set<String> permissions, @NotNull o0Oo0oo chainTask) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(chainTask, "chainTask");
        o000OOo o000oooOooO0OO = OooO0OO();
        Intrinsics.checkNotNullParameter(this, "permissionBuilder");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(chainTask, "chainTask");
        o000oooOooO0OO.f43181OooO0Oo = this;
        o000oooOooO0OO.f43183OooO0o0 = chainTask;
        Object[] array = permissions.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        o000oooOooO0OO.f43182OooO0o.OooO0O0(array);
    }
}
