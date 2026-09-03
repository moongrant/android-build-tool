package p406o0Oo0OOO;

import androidx.activity.result.OooO0O0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.OooO00o;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p074o000O0oo.OooOOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class oO00000o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @JvmField
    @NotNull
    public Set<String> f39113OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public FragmentActivity f39114OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public Fragment f39115OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f39116OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @JvmField
    @NotNull
    public Set<String> f39117OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @JvmField
    @NotNull
    public Set<String> f39118OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @JvmField
    @NotNull
    public Set<String> f39119OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @JvmField
    @NotNull
    public Set<String> f39120OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @JvmField
    @NotNull
    public Set<String> f39121OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @JvmField
    @NotNull
    public Set<String> f39122OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @JvmField
    @NotNull
    public Set<String> f39123OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @JvmField
    @Nullable
    public OooOOO0 f39124OooOO0o;

    public oO00000o(@Nullable FragmentActivity fragmentActivity, @Nullable Fragment fragment, @NotNull Set<String> normalPermissions, @NotNull Set<String> specialPermissions) {
        Intrinsics.checkNotNullParameter(normalPermissions, "normalPermissions");
        Intrinsics.checkNotNullParameter(specialPermissions, "specialPermissions");
        this.f39116OooO0OO = -1;
        this.f39118OooO0o = new LinkedHashSet();
        this.f39120OooO0oO = new LinkedHashSet();
        this.f39121OooO0oo = new LinkedHashSet();
        this.f39113OooO = new LinkedHashSet();
        this.f39122OooOO0 = new LinkedHashSet();
        this.f39123OooOO0O = new LinkedHashSet();
        if (fragmentActivity != null) {
            Intrinsics.checkNotNullParameter(fragmentActivity, "<set-?>");
            this.f39114OooO00o = fragmentActivity;
        }
        if (fragmentActivity == null && fragment != null) {
            FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "fragment.requireActivity()");
            Intrinsics.checkNotNullParameter(fragmentActivityRequireActivity, "<set-?>");
            this.f39114OooO00o = fragmentActivityRequireActivity;
        }
        this.f39115OooO0O0 = fragment;
        this.f39117OooO0Oo = normalPermissions;
        this.f39119OooO0o0 = specialPermissions;
    }

    @NotNull
    public final FragmentActivity OooO00o() {
        FragmentActivity fragmentActivity = this.f39114OooO00o;
        if (fragmentActivity != null) {
            return fragmentActivity;
        }
        Intrinsics.throwUninitializedPropertyAccessException("activity");
        return null;
    }

    public final FragmentManager OooO0O0() {
        Fragment fragment = this.f39115OooO0O0;
        FragmentManager childFragmentManager = fragment == null ? null : fragment.getChildFragmentManager();
        if (childFragmentManager != null) {
            return childFragmentManager;
        }
        FragmentManager supportFragmentManager = OooO00o().getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "activity.supportFragmentManager");
        return supportFragmentManager;
    }

    public final oO00000 OooO0OO() {
        Fragment fragmentOooo00O = OooO0O0().Oooo00O("InvisibleFragment");
        if (fragmentOooo00O != null) {
            return (oO00000) fragmentOooo00O;
        }
        oO00000 oo00000 = new oO00000();
        OooO00o oooO00o = new OooO00o(OooO0O0());
        oooO00o.OooO0Oo(0, oo00000, "InvisibleFragment", 1);
        oooO00o.OooOO0();
        return oo00000;
    }

    public final int OooO0Oo() {
        return OooO00o().getApplicationInfo().targetSdkVersion;
    }

    public final void OooO0o0(@NotNull Set<String> permissions, @NotNull o0oo0000 chainTask) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(chainTask, "chainTask");
        oO00000 oo00000OooO0OO = OooO0OO();
        Intrinsics.checkNotNullParameter(this, "permissionBuilder");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(chainTask, "chainTask");
        oo00000OooO0OO.f39106Oooo0o = this;
        oo00000OooO0OO.f39107Oooo0oO = chainTask;
        OooO0O0<String[]> oooO0O0 = oo00000OooO0OO.f39108Oooo0oo;
        Object[] array = permissions.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        oooO0O0.OooO0O0(array);
    }
}
