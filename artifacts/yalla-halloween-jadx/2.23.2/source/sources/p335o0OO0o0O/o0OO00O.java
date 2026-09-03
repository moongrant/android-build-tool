package p335o0OO0o0O;

import android.content.Intent;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.util.Log;
import androidx.activity.result.OooO00o;
import androidx.activity.result.OooO0O0;
import androidx.fragment.app.Fragment;
import androidx.media3.session.oo0o0Oo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p011OooOo0.OooOO0O;
import p011OooOo0.OooOOO;
import p011OooOo0.OooOOO0;
import p022Oooo00O.o0O0o0;
import p022Oooo00O.o0O0o000;
import p246o00oo0Oo.o0000O00;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo0OO0o0O/o0OO00O;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "permissionx_release"}, k = 1, mv = {1, 5, 1})
public final class o0OO00O extends Fragment {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final /* synthetic */ int f42474OooOO0o = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final OooO0O0<Intent> f42475OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public oo0o0Oo f42476OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final OooO0O0<String[]> f42477OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o0ooOOo f42478OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final OooO0O0<String> f42479OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final OooO0O0<Intent> f42480OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final OooO0O0<Intent> f42481OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final OooO0O0<Intent> f42482OooOO0O;

    public o0OO00O() {
        OooO0O0<String[]> oooO0O0RegisterForActivityResult = registerForActivityResult(new OooOO0O(), new o0OOO0o(this));
        Intrinsics.checkNotNullExpressionValue(oooO0O0RegisterForActivityResult, "registerForActivityResul…esult(grantResults)\n    }");
        this.f42477OooO0o = oooO0O0RegisterForActivityResult;
        OooO0O0<String> oooO0O0RegisterForActivityResult2 = registerForActivityResult(new OooOOO0(), new androidx.media3.session.o0OO00O(this));
        Intrinsics.checkNotNullExpressionValue(oooO0O0RegisterForActivityResult2, "registerForActivityResul…sionResult(granted)\n    }");
        this.f42479OooO0oO = oooO0O0RegisterForActivityResult2;
        OooO0O0<Intent> oooO0O0RegisterForActivityResult3 = registerForActivityResult(new OooOOO(), new OooO00o() { // from class: o0OO0o0O.o0Oo0oo
            @Override // androidx.activity.result.OooO00o
            public final void onActivityResult(Object obj) {
                int i = o0OO00O.f42474OooOO0o;
                o0OO00O this$0 = this.f42484OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0o0();
            }
        });
        Intrinsics.checkNotNullExpressionValue(oooO0O0RegisterForActivityResult3, "registerForActivityResul…wPermissionResult()\n    }");
        this.f42480OooO0oo = oooO0O0RegisterForActivityResult3;
        OooO0O0<Intent> oooO0O0RegisterForActivityResult4 = registerForActivityResult(new OooOOO(), new o0000O00(this));
        Intrinsics.checkNotNullExpressionValue(oooO0O0RegisterForActivityResult4, "registerForActivityResul…sPermissionResult()\n    }");
        this.f42475OooO = oooO0O0RegisterForActivityResult4;
        OooO0O0<Intent> oooO0O0RegisterForActivityResult5 = registerForActivityResult(new OooOOO(), new o0O0o000(this));
        Intrinsics.checkNotNullExpressionValue(oooO0O0RegisterForActivityResult5, "registerForActivityResul…ePermissionResult()\n    }");
        this.f42481OooOO0 = oooO0O0RegisterForActivityResult5;
        OooO0O0<Intent> oooO0O0RegisterForActivityResult6 = registerForActivityResult(new OooOOO(), new oo0o0Oo(this));
        Intrinsics.checkNotNullExpressionValue(oooO0O0RegisterForActivityResult6, "registerForActivityResul…sPermissionResult()\n    }");
        this.f42482OooOO0O = oooO0O0RegisterForActivityResult6;
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult(new OooOOO(), new o0O0o0(this)), "registerForActivityResul…issions))\n        }\n    }");
    }

    public final boolean OooO0O0() {
        if (this.f42476OooO0Oo != null && this.f42478OooO0o0 != null) {
            return true;
        }
        Log.w("PermissionX", "PermissionBuilder and ChainTask should not be null at this time, so we can do nothing in this case.");
        return false;
    }

    public final void OooO0OO() {
        if (OooO0O0()) {
            o0ooOOo o0ooooo = null;
            o0ooOOo o0ooooo2 = null;
            oo0o0Oo oo0o0oo = null;
            if (Build.VERSION.SDK_INT < 26) {
                o0ooOOo o0ooooo3 = this.f42478OooO0o0;
                if (o0ooooo3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("task");
                } else {
                    o0ooooo = o0ooooo3;
                }
                o0ooooo.finish();
                return;
            }
            if (requireActivity().getPackageManager().canRequestPackageInstalls()) {
                o0ooOOo o0ooooo4 = this.f42478OooO0o0;
                if (o0ooooo4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("task");
                } else {
                    o0ooooo2 = o0ooooo4;
                }
                o0ooooo2.finish();
                return;
            }
            oo0o0Oo oo0o0oo2 = this.f42476OooO0Oo;
            if (oo0o0oo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                oo0o0oo2 = null;
            }
            oo0o0oo2.getClass();
            oo0o0Oo oo0o0oo3 = this.f42476OooO0Oo;
            if (oo0o0oo3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
            } else {
                oo0o0oo = oo0o0oo3;
            }
            oo0o0oo.getClass();
        }
    }

    public final void OooO0Oo() {
        if (OooO0O0()) {
            o0ooOOo o0ooooo = null;
            o0ooOOo o0ooooo2 = null;
            oo0o0Oo oo0o0oo = null;
            if (Build.VERSION.SDK_INT < 30) {
                o0ooOOo o0ooooo3 = this.f42478OooO0o0;
                if (o0ooooo3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("task");
                } else {
                    o0ooooo = o0ooooo3;
                }
                o0ooooo.finish();
                return;
            }
            if (Environment.isExternalStorageManager()) {
                o0ooOOo o0ooooo4 = this.f42478OooO0o0;
                if (o0ooooo4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("task");
                } else {
                    o0ooooo2 = o0ooooo4;
                }
                o0ooooo2.finish();
                return;
            }
            oo0o0Oo oo0o0oo2 = this.f42476OooO0Oo;
            if (oo0o0oo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                oo0o0oo2 = null;
            }
            oo0o0oo2.getClass();
            oo0o0Oo oo0o0oo3 = this.f42476OooO0Oo;
            if (oo0o0oo3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
            } else {
                oo0o0oo = oo0o0oo3;
            }
            oo0o0oo.getClass();
        }
    }

    public final void OooO0o() {
        if (OooO0O0()) {
            oo0o0Oo oo0o0oo = null;
            o0ooOOo o0ooooo = null;
            if (Settings.System.canWrite(getContext())) {
                o0ooOOo o0ooooo2 = this.f42478OooO0o0;
                if (o0ooooo2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("task");
                } else {
                    o0ooooo = o0ooooo2;
                }
                o0ooooo.finish();
                return;
            }
            oo0o0Oo oo0o0oo2 = this.f42476OooO0Oo;
            if (oo0o0oo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                oo0o0oo2 = null;
            }
            oo0o0oo2.getClass();
            oo0o0Oo oo0o0oo3 = this.f42476OooO0Oo;
            if (oo0o0oo3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
            } else {
                oo0o0oo = oo0o0oo3;
            }
            oo0o0oo.getClass();
        }
    }

    public final void OooO0o0() {
        if (OooO0O0()) {
            oo0o0Oo oo0o0oo = null;
            o0ooOOo o0ooooo = null;
            if (Settings.canDrawOverlays(getContext())) {
                o0ooOOo o0ooooo2 = this.f42478OooO0o0;
                if (o0ooooo2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("task");
                } else {
                    o0ooooo = o0ooooo2;
                }
                o0ooooo.finish();
                return;
            }
            oo0o0Oo oo0o0oo2 = this.f42476OooO0Oo;
            if (oo0o0oo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                oo0o0oo2 = null;
            }
            oo0o0oo2.getClass();
            oo0o0Oo oo0o0oo3 = this.f42476OooO0Oo;
            if (oo0o0oo3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
            } else {
                oo0o0oo = oo0o0oo3;
            }
            oo0o0oo.getClass();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (OooO0O0()) {
            oo0o0Oo oo0o0oo = this.f42476OooO0Oo;
            if (oo0o0oo == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                oo0o0oo = null;
            }
            oo0o0oo.getClass();
        }
    }
}
