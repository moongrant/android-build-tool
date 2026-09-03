package p520o0o0O0oo;

import android.view.View;
import android.widget.ScrollView;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o000OO00;
import com.yalla.yalla.ui.dialog.giftDialog.GiftCustomMadeWebManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p466o0Oooo0o.oo00o;
import p641o0ooOOOO.x8;

/* JADX INFO: loaded from: classes4.dex */
public final class u5 extends oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ GiftCustomMadeWebManager f53343OooO0oO;

    public u5(GiftCustomMadeWebManager giftCustomMadeWebManager) {
        this.f53343OooO0oO = giftCustomMadeWebManager;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        GiftCustomMadeWebManager giftCustomMadeWebManager = this.f53343OooO0oO;
        SVGAView sVGAView = giftCustomMadeWebManager.f27998OooO0OO.f59336OooO0OO;
        Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.svgaLoading");
        o000OO00.OooOOOO(sVGAView);
        x8 x8Var = giftCustomMadeWebManager.f27998OooO0OO;
        x8Var.f59336OooO0OO.OooO0Oo();
        ScrollView scrollView = x8Var.f59339OooO0o0.f57486OooO00o;
        Intrinsics.checkNotNullExpressionValue(scrollView, "binding.vError.root");
        o000OO00.OooO0O0(scrollView);
        x8Var.f59338OooO0o.reload();
    }
}
