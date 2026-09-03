package p232o00oOoO0;

import android.view.View;
import android.view.Window;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.core.view.o0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class o000 implements o000O0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final View f39896OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final Window f39897OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final o0 f39898OooO0OO;

    public o000(@NotNull View view, @Nullable Window window) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f39896OooO00o = view;
        this.f39897OooO0O0 = window;
        this.f39898OooO0OO = window != null ? new o0(view, window) : null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001d  */
    @Override // p232o00oOoO0.o000O0o
    public final void OooO00o(long j, boolean z, @NotNull Function1<? super Color, Color> transformColorForLightContent) {
        boolean z2;
        Intrinsics.checkNotNullParameter(transformColorForLightContent, "transformColorForLightContent");
        OooO0O0(z);
        Window window = this.f39897OooO0O0;
        if (window == null) {
            return;
        }
        if (z) {
            o0 o0Var = this.f39898OooO0OO;
            if (o0Var != null) {
                z2 = o0Var.f5420OooO00o.OooO0OO();
            }
            if (!z2) {
                j = transformColorForLightContent.invoke(Color.m1671boximpl(j)).m1691unboximpl();
            }
        }
        window.setStatusBarColor(ColorKt.m1735toArgb8_81llA(j));
    }

    @Override // p232o00oOoO0.o000O0o
    public final void OooO0O0(boolean z) {
        o0 o0Var = this.f39898OooO0OO;
        if (o0Var == null) {
            return;
        }
        o0Var.OooO00o(z);
    }

    public final void OooO0OO() {
        o0 o0Var = this.f39898OooO0OO;
        if (o0Var == null) {
            return;
        }
        o0Var.f5420OooO00o.OooO0Oo(true);
    }
}
