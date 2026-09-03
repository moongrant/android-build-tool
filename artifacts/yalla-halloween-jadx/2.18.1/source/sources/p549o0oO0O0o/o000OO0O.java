package p549o0oO0O0o;

import android.view.View;
import android.view.Window;
import androidx.core.view.OooOO0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p145o00Oo0.o00000O0;
import p145o00Oo0.o00000OO;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OO0O implements o000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final View f44603OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final Window f44604OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final OooOO0 f44605OooO0OO;

    public o000OO0O(@NotNull View view, @Nullable Window window) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f44603OooO00o = view;
        this.f44604OooO0O0 = window;
        this.f44605OooO0OO = window != null ? new OooOO0(window, view) : null;
    }

    @Override // p549o0oO0O0o.o000O
    public final void OooO00o(long j, boolean z, @NotNull Function1<? super o00000O0, o00000O0> transformColorForLightContent) {
        Intrinsics.checkNotNullParameter(transformColorForLightContent, "transformColorForLightContent");
        OooOO0 oooOO1 = this.f44605OooO0OO;
        if (oooOO1 != null) {
            oooOO1.f7865OooO00o.OooO0OO(z);
        }
        Window window = this.f44604OooO0O0;
        if (window == null) {
            return;
        }
        if (z) {
            OooOO0 oooOO2 = this.f44605OooO0OO;
            if (!(oooOO2 != null && oooOO2.f7865OooO00o.OooO00o())) {
                j = transformColorForLightContent.invoke(new o00000O0(j)).f32070OooO00o;
            }
        }
        window.setStatusBarColor(o00000OO.OooO0oO(j));
    }

    @Override // p549o0oO0O0o.o000O
    public final void OooO0O0(boolean z) {
        OooOO0 oooOO1 = this.f44605OooO0OO;
        if (oooOO1 == null) {
            return;
        }
        oooOO1.f7865OooO00o.OooO0OO(z);
    }
}
