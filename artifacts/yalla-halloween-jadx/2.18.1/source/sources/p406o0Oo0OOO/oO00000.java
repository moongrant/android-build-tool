package p406o0Oo0OOO;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.util.Log;
import androidx.activity.result.OooO0O0;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o0O0O0o0.OooO0OO;
import org.jetbrains.annotations.NotNull;
import p011OooOOoo.OooOO0;
import p011OooOOoo.OooOO0O;
import p011OooOOoo.OooOOO0;
import p142o00OOooO.OooOOO;
import p142o00OOooO.OooOOOO;
import p142o00OOooO.OooOo00;
import p143o00OOooo.oo0O;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo0Oo0OOO/oO00000;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "permissionx_release"}, k = 1, mv = {1, 5, 1})
public final class oO00000 extends Fragment {

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public static final /* synthetic */ int f39104OoooOO0 = 0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final OooO0O0<String> f39105Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public oO00000o f39106Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public o0oo0000 f39107Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final OooO0O0<String[]> f39108Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public final OooO0O0<Intent> f39109OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public final OooO0O0<Intent> f39110OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public final OooO0O0<Intent> f39111OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @NotNull
    public final OooO0O0<Intent> f39112OoooO0O;

    public oO00000() {
        int i = 1;
        OooO0O0<String[]> oooO0O0RegisterForActivityResult = registerForActivityResult(new OooOO0(), new com.facebook.OooOO0(this, i));
        Intrinsics.checkNotNullExpressionValue(oooO0O0RegisterForActivityResult, "registerForActivityResul…esult(grantResults)\n    }");
        this.f39108Oooo0oo = oooO0O0RegisterForActivityResult;
        int i2 = 4;
        OooO0O0<String> oooO0O0RegisterForActivityResult2 = registerForActivityResult(new OooOO0O(), new OooO0OO(this, i2));
        Intrinsics.checkNotNullExpressionValue(oooO0O0RegisterForActivityResult2, "registerForActivityResul…sionResult(granted)\n    }");
        this.f39105Oooo = oooO0O0RegisterForActivityResult2;
        OooO0O0<Intent> oooO0O0RegisterForActivityResult3 = registerForActivityResult(new OooOOO0(), new oo0O(this, i));
        Intrinsics.checkNotNullExpressionValue(oooO0O0RegisterForActivityResult3, "registerForActivityResul…wPermissionResult()\n    }");
        this.f39111OoooO00 = oooO0O0RegisterForActivityResult3;
        OooO0O0<Intent> oooO0O0RegisterForActivityResult4 = registerForActivityResult(new OooOOO0(), new OooOOO(this, i2));
        Intrinsics.checkNotNullExpressionValue(oooO0O0RegisterForActivityResult4, "registerForActivityResul…sPermissionResult()\n    }");
        this.f39110OoooO0 = oooO0O0RegisterForActivityResult4;
        OooO0O0<Intent> oooO0O0RegisterForActivityResult5 = registerForActivityResult(new OooOOO0(), new p142o00OOooO.OooOOO0(this, i));
        Intrinsics.checkNotNullExpressionValue(oooO0O0RegisterForActivityResult5, "registerForActivityResul…ePermissionResult()\n    }");
        this.f39112OoooO0O = oooO0O0RegisterForActivityResult5;
        int i3 = 2;
        OooO0O0<Intent> oooO0O0RegisterForActivityResult6 = registerForActivityResult(new OooOOO0(), new OooOOOO(this, i3));
        Intrinsics.checkNotNullExpressionValue(oooO0O0RegisterForActivityResult6, "registerForActivityResul…sPermissionResult()\n    }");
        this.f39109OoooO = oooO0O0RegisterForActivityResult6;
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult(new OooOOO0(), new OooOo00(this, i3)), "registerForActivityResul…issions))\n        }\n    }");
    }

    public final boolean OooO00o() {
        if (this.f39106Oooo0o != null && this.f39107Oooo0oO != null) {
            return true;
        }
        Log.w("PermissionX", "PermissionBuilder and ChainTask should not be null at this time, so we can do nothing in this case.");
        return false;
    }

    public final void OooO0O0() {
        if (OooO00o()) {
            o0oo0000 o0oo0000Var = null;
            o0oo0000 o0oo0000Var2 = null;
            oO00000o oo00000o = null;
            if (Build.VERSION.SDK_INT < 26) {
                o0oo0000 o0oo0000Var3 = this.f39107Oooo0oO;
                if (o0oo0000Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("task");
                } else {
                    o0oo0000Var = o0oo0000Var3;
                }
                o0oo0000Var.OooO0O0();
                return;
            }
            if (requireActivity().getPackageManager().canRequestPackageInstalls()) {
                o0oo0000 o0oo0000Var4 = this.f39107Oooo0oO;
                if (o0oo0000Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("task");
                } else {
                    o0oo0000Var2 = o0oo0000Var4;
                }
                o0oo0000Var2.OooO0O0();
                return;
            }
            oO00000o oo00000o2 = this.f39106Oooo0o;
            if (oo00000o2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                oo00000o2 = null;
            }
            Objects.requireNonNull(oo00000o2);
            oO00000o oo00000o3 = this.f39106Oooo0o;
            if (oo00000o3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
            } else {
                oo00000o = oo00000o3;
            }
            Objects.requireNonNull(oo00000o);
        }
    }

    public final void OooO0OO() {
        if (OooO00o()) {
            o0oo0000 o0oo0000Var = null;
            o0oo0000 o0oo0000Var2 = null;
            oO00000o oo00000o = null;
            if (Build.VERSION.SDK_INT < 30) {
                o0oo0000 o0oo0000Var3 = this.f39107Oooo0oO;
                if (o0oo0000Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("task");
                } else {
                    o0oo0000Var = o0oo0000Var3;
                }
                o0oo0000Var.OooO0O0();
                return;
            }
            if (Environment.isExternalStorageManager()) {
                o0oo0000 o0oo0000Var4 = this.f39107Oooo0oO;
                if (o0oo0000Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("task");
                } else {
                    o0oo0000Var2 = o0oo0000Var4;
                }
                o0oo0000Var2.OooO0O0();
                return;
            }
            oO00000o oo00000o2 = this.f39106Oooo0o;
            if (oo00000o2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                oo00000o2 = null;
            }
            Objects.requireNonNull(oo00000o2);
            oO00000o oo00000o3 = this.f39106Oooo0o;
            if (oo00000o3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
            } else {
                oo00000o = oo00000o3;
            }
            Objects.requireNonNull(oo00000o);
        }
    }

    public final void OooO0Oo() {
        if (OooO00o()) {
            o0oo0000 o0oo0000Var = null;
            o0oo0000 o0oo0000Var2 = null;
            oO00000o oo00000o = null;
            if (Build.VERSION.SDK_INT < 23) {
                o0oo0000 o0oo0000Var3 = this.f39107Oooo0oO;
                if (o0oo0000Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("task");
                } else {
                    o0oo0000Var = o0oo0000Var3;
                }
                o0oo0000Var.OooO0O0();
                return;
            }
            if (Settings.canDrawOverlays(getContext())) {
                o0oo0000 o0oo0000Var4 = this.f39107Oooo0oO;
                if (o0oo0000Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("task");
                } else {
                    o0oo0000Var2 = o0oo0000Var4;
                }
                o0oo0000Var2.OooO0O0();
                return;
            }
            oO00000o oo00000o2 = this.f39106Oooo0o;
            if (oo00000o2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                oo00000o2 = null;
            }
            Objects.requireNonNull(oo00000o2);
            oO00000o oo00000o3 = this.f39106Oooo0o;
            if (oo00000o3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
            } else {
                oo00000o = oo00000o3;
            }
            Objects.requireNonNull(oo00000o);
        }
    }

    public final void OooO0o(@NotNull oO00000o permissionBuilder, @NotNull o0oo0000 chainTask) {
        Intrinsics.checkNotNullParameter(permissionBuilder, "permissionBuilder");
        Intrinsics.checkNotNullParameter(chainTask, "chainTask");
        this.f39106Oooo0o = permissionBuilder;
        this.f39107Oooo0oO = chainTask;
        if (Build.VERSION.SDK_INT < 30 || Environment.isExternalStorageManager()) {
            OooO0OO();
        } else {
            this.f39112OoooO0O.OooO0O0(new Intent("android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION"));
        }
    }

    public final void OooO0o0() {
        if (OooO00o()) {
            o0oo0000 o0oo0000Var = null;
            o0oo0000 o0oo0000Var2 = null;
            oO00000o oo00000o = null;
            if (Build.VERSION.SDK_INT < 23) {
                o0oo0000 o0oo0000Var3 = this.f39107Oooo0oO;
                if (o0oo0000Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("task");
                } else {
                    o0oo0000Var = o0oo0000Var3;
                }
                o0oo0000Var.OooO0O0();
                return;
            }
            if (Settings.System.canWrite(getContext())) {
                o0oo0000 o0oo0000Var4 = this.f39107Oooo0oO;
                if (o0oo0000Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("task");
                } else {
                    o0oo0000Var2 = o0oo0000Var4;
                }
                o0oo0000Var2.OooO0O0();
                return;
            }
            oO00000o oo00000o2 = this.f39106Oooo0o;
            if (oo00000o2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                oo00000o2 = null;
            }
            Objects.requireNonNull(oo00000o2);
            oO00000o oo00000o3 = this.f39106Oooo0o;
            if (oo00000o3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
            } else {
                oo00000o = oo00000o3;
            }
            Objects.requireNonNull(oo00000o);
        }
    }

    public final void OooO0oO(@NotNull oO00000o permissionBuilder, @NotNull o0oo0000 chainTask) {
        Intrinsics.checkNotNullParameter(permissionBuilder, "permissionBuilder");
        Intrinsics.checkNotNullParameter(chainTask, "chainTask");
        this.f39106Oooo0o = permissionBuilder;
        this.f39107Oooo0oO = chainTask;
        if (Build.VERSION.SDK_INT < 23 || Settings.canDrawOverlays(getContext())) {
            OooO0Oo();
            return;
        }
        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
        intent.setData(Uri.parse(Intrinsics.stringPlus("package:", requireActivity().getPackageName())));
        this.f39111OoooO00.OooO0O0(intent);
    }

    public final void OooO0oo(@NotNull oO00000o permissionBuilder, @NotNull o0oo0000 chainTask) {
        Intrinsics.checkNotNullParameter(permissionBuilder, "permissionBuilder");
        Intrinsics.checkNotNullParameter(chainTask, "chainTask");
        this.f39106Oooo0o = permissionBuilder;
        this.f39107Oooo0oO = chainTask;
        if (Build.VERSION.SDK_INT < 23 || Settings.System.canWrite(getContext())) {
            OooO0o0();
            return;
        }
        Intent intent = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS");
        intent.setData(Uri.parse(Intrinsics.stringPlus("package:", requireActivity().getPackageName())));
        this.f39110OoooO0.OooO0O0(intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (OooO00o()) {
            oO00000o oo00000o = this.f39106Oooo0o;
            if (oo00000o == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                oo00000o = null;
            }
            Objects.requireNonNull(oo00000o);
        }
    }
}
