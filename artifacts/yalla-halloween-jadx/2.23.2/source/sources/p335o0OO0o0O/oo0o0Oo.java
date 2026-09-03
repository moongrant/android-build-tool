package p335o0OO0o0O;

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
import p022Oooo00O.o000oOoO;

/* JADX INFO: loaded from: classes3.dex */
public final class oo0o0Oo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @JvmField
    @NotNull
    public final LinkedHashSet f42485OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public FragmentActivity f42486OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final Fragment f42487OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f42488OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @JvmField
    @NotNull
    public final Set<String> f42489OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @JvmField
    @NotNull
    public final LinkedHashSet f42490OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @JvmField
    @NotNull
    public final Set<String> f42491OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @JvmField
    @NotNull
    public final LinkedHashSet f42492OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @JvmField
    @NotNull
    public final LinkedHashSet f42493OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @JvmField
    @NotNull
    public final LinkedHashSet f42494OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @JvmField
    @Nullable
    public o000oOoO f42495OooOO0O;

    public oo0o0Oo(@Nullable FragmentActivity fragmentActivity, @Nullable Fragment fragment, @NotNull LinkedHashSet normalPermissions, @NotNull LinkedHashSet specialPermissions) {
        Intrinsics.checkNotNullParameter(normalPermissions, "normalPermissions");
        Intrinsics.checkNotNullParameter(specialPermissions, "specialPermissions");
        this.f42488OooO0OO = -1;
        this.f42490OooO0o = new LinkedHashSet();
        this.f42492OooO0oO = new LinkedHashSet();
        this.f42493OooO0oo = new LinkedHashSet();
        this.f42485OooO = new LinkedHashSet();
        new LinkedHashSet();
        this.f42494OooOO0 = new LinkedHashSet();
        if (fragmentActivity != null) {
            Intrinsics.checkNotNullParameter(fragmentActivity, "<set-?>");
            this.f42486OooO00o = fragmentActivity;
        }
        if (fragmentActivity == null && fragment != null) {
            FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "fragment.requireActivity()");
            Intrinsics.checkNotNullParameter(fragmentActivityRequireActivity, "<set-?>");
            this.f42486OooO00o = fragmentActivityRequireActivity;
        }
        this.f42487OooO0O0 = fragment;
        this.f42489OooO0Oo = normalPermissions;
        this.f42491OooO0o0 = specialPermissions;
    }

    @NotNull
    public final FragmentActivity OooO00o() {
        FragmentActivity fragmentActivity = this.f42486OooO00o;
        if (fragmentActivity != null) {
            return fragmentActivity;
        }
        Intrinsics.throwUninitializedPropertyAccessException("activity");
        return null;
    }

    public final FragmentManager OooO0O0() {
        Fragment fragment = this.f42487OooO0O0;
        FragmentManager childFragmentManager = fragment == null ? null : fragment.getChildFragmentManager();
        if (childFragmentManager != null) {
            return childFragmentManager;
        }
        FragmentManager supportFragmentManager = OooO00o().getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "activity.supportFragmentManager");
        return supportFragmentManager;
    }

    public final o0OO00O OooO0OO() {
        Fragment fragmentOooOoo = OooO0O0().OooOoo("InvisibleFragment");
        if (fragmentOooOoo != null) {
            return (o0OO00O) fragmentOooOoo;
        }
        o0OO00O o0oo00o2 = new o0OO00O();
        FragmentManager fragmentManagerOooO0O0 = OooO0O0();
        fragmentManagerOooO0O0.getClass();
        OooO00o oooO00o = new OooO00o(fragmentManagerOooO0O0);
        oooO00o.OooO0OO(0, o0oo00o2, "InvisibleFragment", 1);
        if (oooO00o.f6008OooO0oO) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        oooO00o.f5896OooOOOo.OooOoO0(oooO00o, true);
        return o0oo00o2;
    }

    public final int OooO0Oo() {
        return OooO00o().getApplicationInfo().targetSdkVersion;
    }

    public final void OooO0o0(@NotNull Set<String> permissions, @NotNull o0ooOOo chainTask) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(chainTask, "chainTask");
        o0OO00O o0oo00oOooO0OO = OooO0OO();
        Intrinsics.checkNotNullParameter(this, "permissionBuilder");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(chainTask, "chainTask");
        o0oo00oOooO0OO.f42476OooO0Oo = this;
        o0oo00oOooO0OO.f42478OooO0o0 = chainTask;
        Object[] array = permissions.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        o0oo00oOooO0OO.f42477OooO0o.OooO0O0(array);
    }
}
