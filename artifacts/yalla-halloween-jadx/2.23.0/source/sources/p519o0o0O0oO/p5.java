package p519o0o0O0oO;

import android.view.View;
import com.yalla.yalla.ui.dialog.WelcomeDialog;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p466o0Oooo0o.oo00o;

/* JADX INFO: loaded from: classes4.dex */
public final class p5 extends oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ WelcomeDialog f53089OooO0oO;

    public p5(WelcomeDialog welcomeDialog) {
        this.f53089OooO0oO = welcomeDialog;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f53089OooO0oO.dismiss();
    }
}
