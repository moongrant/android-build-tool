package p186o00o00oO;

import android.view.View;
import android.view.Window;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.core.view.o0oOOo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O00OO implements oo00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final View f38691OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final Window f38692OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final o0oOOo f38693OooO0OO;

    public o00O00OO(@NotNull View view, @Nullable Window window) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f38691OooO00o = view;
        this.f38692OooO0O0 = window;
        this.f38693OooO0OO = window != null ? new o0oOOo(view, window) : null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001d  */
    @Override // p186o00o00oO.oo00o
    public final void OooO00o(long j, boolean z, @NotNull Function1<? super Color, Color> transformColorForLightContent) {
        boolean z2;
        Intrinsics.checkNotNullParameter(transformColorForLightContent, "transformColorForLightContent");
        OooO0O0(z);
        Window window = this.f38692OooO0O0;
        if (window == null) {
            return;
        }
        if (z) {
            o0oOOo o0oooo = this.f38693OooO0OO;
            if (o0oooo != null) {
                z2 = o0oooo.f5453OooO00o.OooO0OO();
            }
            if (!z2) {
                j = transformColorForLightContent.invoke(Color.m1660boximpl(j)).m1680unboximpl();
            }
        }
        window.setStatusBarColor(ColorKt.m1724toArgb8_81llA(j));
    }

    @Override // p186o00o00oO.oo00o
    public final void OooO0O0(boolean z) {
        o0oOOo o0oooo = this.f38693OooO0OO;
        if (o0oooo == null) {
            return;
        }
        o0oooo.OooO00o(z);
    }

    public final void OooO0OO() {
        o0oOOo o0oooo = this.f38693OooO0OO;
        if (o0oooo == null) {
            return;
        }
        o0oooo.f5453OooO00o.OooO0Oo(true);
    }
}
