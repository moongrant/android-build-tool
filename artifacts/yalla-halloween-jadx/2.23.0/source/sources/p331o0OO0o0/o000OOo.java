package p331o0OO0o0;

import android.content.Intent;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.util.Log;
import androidx.activity.result.OooO0O0;
import androidx.fragment.app.Fragment;
import com.facebook.OooOO0;
import com.google.firebase.messaging.o00O0O;
import com.google.firebase.messaging.o00Ooo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p011OooOo0.OooOO0O;
import p011OooOo0.OooOOO;
import p011OooOo0.OooOOO0;
import p196o00o0Oo.o000O00O;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo0OO0o0/o000OOo;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "permissionx_release"}, k = 1, mv = {1, 5, 1})
public final class o000OOo extends Fragment {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final /* synthetic */ int f43179OooOO0o = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final OooO0O0<Intent> f43180OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o000000 f43181OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final OooO0O0<String[]> f43182OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o0Oo0oo f43183OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final OooO0O0<String> f43184OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final OooO0O0<Intent> f43185OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final OooO0O0<Intent> f43186OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final OooO0O0<Intent> f43187OooOO0O;

    public o000OOo() {
        OooO0O0<String[]> oooO0O0RegisterForActivityResult = registerForActivityResult(new OooOO0O(), new o0OO00O(this));
        Intrinsics.checkNotNullExpressionValue(oooO0O0RegisterForActivityResult, "registerForActivityResul…esult(grantResults)\n    }");
        this.f43182OooO0o = oooO0O0RegisterForActivityResult;
        OooO0O0<String> oooO0O0RegisterForActivityResult2 = registerForActivityResult(new OooOOO0(), new o000O00O(this));
        Intrinsics.checkNotNullExpressionValue(oooO0O0RegisterForActivityResult2, "registerForActivityResul…sionResult(granted)\n    }");
        this.f43184OooO0oO = oooO0O0RegisterForActivityResult2;
        OooO0O0<Intent> oooO0O0RegisterForActivityResult3 = registerForActivityResult(new OooOOO(), new OooOO0(this));
        Intrinsics.checkNotNullExpressionValue(oooO0O0RegisterForActivityResult3, "registerForActivityResul…wPermissionResult()\n    }");
        this.f43185OooO0oo = oooO0O0RegisterForActivityResult3;
        OooO0O0<Intent> oooO0O0RegisterForActivityResult4 = registerForActivityResult(new OooOOO(), new oo0o0Oo(this, 0));
        Intrinsics.checkNotNullExpressionValue(oooO0O0RegisterForActivityResult4, "registerForActivityResul…sPermissionResult()\n    }");
        this.f43180OooO = oooO0O0RegisterForActivityResult4;
        OooO0O0<Intent> oooO0O0RegisterForActivityResult5 = registerForActivityResult(new OooOOO(), new o00O0O(this));
        Intrinsics.checkNotNullExpressionValue(oooO0O0RegisterForActivityResult5, "registerForActivityResul…ePermissionResult()\n    }");
        this.f43186OooOO0 = oooO0O0RegisterForActivityResult5;
        OooO0O0<Intent> oooO0O0RegisterForActivityResult6 = registerForActivityResult(new OooOOO(), new o0O0O00(this));
        Intrinsics.checkNotNullExpressionValue(oooO0O0RegisterForActivityResult6, "registerForActivityResul…sPermissionResult()\n    }");
        this.f43187OooOO0O = oooO0O0RegisterForActivityResult6;
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult(new OooOOO(), new o00Ooo(this)), "registerForActivityResul…issions))\n        }\n    }");
    }

    public final boolean OooO0O0() {
        if (this.f43181OooO0Oo != null && this.f43183OooO0o0 != null) {
            return true;
        }
        Log.w("PermissionX", "PermissionBuilder and ChainTask should not be null at this time, so we can do nothing in this case.");
        return false;
    }

    public final void OooO0OO() {
        if (OooO0O0()) {
            o0Oo0oo o0oo0oo2 = null;
            o0Oo0oo o0oo0oo3 = null;
            o000000 o000000Var = null;
            if (Build.VERSION.SDK_INT < 26) {
                o0Oo0oo o0oo0oo4 = this.f43183OooO0o0;
                if (o0oo0oo4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("task");
                } else {
                    o0oo0oo2 = o0oo0oo4;
                }
                o0oo0oo2.finish();
                return;
            }
            if (requireActivity().getPackageManager().canRequestPackageInstalls()) {
                o0Oo0oo o0oo0oo5 = this.f43183OooO0o0;
                if (o0oo0oo5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("task");
                } else {
                    o0oo0oo3 = o0oo0oo5;
                }
                o0oo0oo3.finish();
                return;
            }
            o000000 o000000Var2 = this.f43181OooO0Oo;
            if (o000000Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                o000000Var2 = null;
            }
            o000000Var2.getClass();
            o000000 o000000Var3 = this.f43181OooO0Oo;
            if (o000000Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
            } else {
                o000000Var = o000000Var3;
            }
            o000000Var.getClass();
        }
    }

    public final void OooO0Oo() {
        if (OooO0O0()) {
            o0Oo0oo o0oo0oo2 = null;
            o0Oo0oo o0oo0oo3 = null;
            o000000 o000000Var = null;
            if (Build.VERSION.SDK_INT < 30) {
                o0Oo0oo o0oo0oo4 = this.f43183OooO0o0;
                if (o0oo0oo4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("task");
                } else {
                    o0oo0oo2 = o0oo0oo4;
                }
                o0oo0oo2.finish();
                return;
            }
            if (Environment.isExternalStorageManager()) {
                o0Oo0oo o0oo0oo5 = this.f43183OooO0o0;
                if (o0oo0oo5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("task");
                } else {
                    o0oo0oo3 = o0oo0oo5;
                }
                o0oo0oo3.finish();
                return;
            }
            o000000 o000000Var2 = this.f43181OooO0Oo;
            if (o000000Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                o000000Var2 = null;
            }
            o000000Var2.getClass();
            o000000 o000000Var3 = this.f43181OooO0Oo;
            if (o000000Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
            } else {
                o000000Var = o000000Var3;
            }
            o000000Var.getClass();
        }
    }

    public final void OooO0o() {
        if (OooO0O0()) {
            o000000 o000000Var = null;
            o0Oo0oo o0oo0oo2 = null;
            if (Settings.System.canWrite(getContext())) {
                o0Oo0oo o0oo0oo3 = this.f43183OooO0o0;
                if (o0oo0oo3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("task");
                } else {
                    o0oo0oo2 = o0oo0oo3;
                }
                o0oo0oo2.finish();
                return;
            }
            o000000 o000000Var2 = this.f43181OooO0Oo;
            if (o000000Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                o000000Var2 = null;
            }
            o000000Var2.getClass();
            o000000 o000000Var3 = this.f43181OooO0Oo;
            if (o000000Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
            } else {
                o000000Var = o000000Var3;
            }
            o000000Var.getClass();
        }
    }

    public final void OooO0o0() {
        if (OooO0O0()) {
            o000000 o000000Var = null;
            o0Oo0oo o0oo0oo2 = null;
            if (Settings.canDrawOverlays(getContext())) {
                o0Oo0oo o0oo0oo3 = this.f43183OooO0o0;
                if (o0oo0oo3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("task");
                } else {
                    o0oo0oo2 = o0oo0oo3;
                }
                o0oo0oo2.finish();
                return;
            }
            o000000 o000000Var2 = this.f43181OooO0Oo;
            if (o000000Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                o000000Var2 = null;
            }
            o000000Var2.getClass();
            o000000 o000000Var3 = this.f43181OooO0Oo;
            if (o000000Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
            } else {
                o000000Var = o000000Var3;
            }
            o000000Var.getClass();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (OooO0O0()) {
            o000000 o000000Var = this.f43181OooO0Oo;
            if (o000000Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                o000000Var = null;
            }
            o000000Var.getClass();
        }
    }
}
