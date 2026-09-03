package p520o0o0O0oo;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000;
import com.code.android.util.o000OO00;
import com.yalla.yalla.ui.dialog.giftDialog.GiftCustomMadeWebManager;
import com.yalla.yalla.ui.view.webView.BaseWebView;
import kotlin.jvm.internal.Intrinsics;
import p584o0oOooO0.oO00O0o;
import p641o0ooOOOO.a7;
import p641o0ooOOOO.x8;

/* JADX INFO: loaded from: classes4.dex */
public final class v5 implements BaseWebView.OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ GiftCustomMadeWebManager f53350OooO00o;

    public v5(GiftCustomMadeWebManager giftCustomMadeWebManager) {
        this.f53350OooO00o = giftCustomMadeWebManager;
    }

    @Override // com.yalla.yalla.ui.view.webView.BaseWebView.OooO0OO
    public final void OooO00o(int i) {
    }

    @Override // com.yalla.yalla.ui.view.webView.BaseWebView.OooO0OO
    public final void OooO0O0(boolean z) {
        GiftCustomMadeWebManager giftCustomMadeWebManager = this.f53350OooO00o;
        if (z) {
            giftCustomMadeWebManager.f27998OooO0OO.f59336OooO0OO.OooO0o();
            SVGAView sVGAView = giftCustomMadeWebManager.f27998OooO0OO.f59336OooO0OO;
            Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.svgaLoading");
            o000OO00.OooO0O0(sVGAView);
            TextView textView = giftCustomMadeWebManager.f27998OooO0OO.f59337OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvSaving");
            o000OO00.OooO0O0(textView);
            giftCustomMadeWebManager.f27998OooO0OO.f59334OooO00o.setBackgroundColor(0);
            View view = giftCustomMadeWebManager.f27998OooO0OO.f59335OooO0O0;
            Intrinsics.checkNotNullExpressionValue(view, "binding.bottomView");
            o000OO00.OooOOOO(view);
            giftCustomMadeWebManager.OooO0OO();
            return;
        }
        x8 x8Var = giftCustomMadeWebManager.f27998OooO0OO;
        SVGAView sVGAView2 = x8Var.f59336OooO0OO;
        Intrinsics.checkNotNullExpressionValue(sVGAView2, "binding.svgaLoading");
        o000OO00.OooO0O0(sVGAView2);
        TextView textView2 = x8Var.f59337OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvSaving");
        o000OO00.OooO0O0(textView2);
        a7 a7Var = x8Var.f59339OooO0o0;
        ScrollView scrollView = a7Var.f57486OooO00o;
        Intrinsics.checkNotNullExpressionValue(scrollView, "binding.vError.root");
        o000OO00.OooOOOO(scrollView);
        a7Var.f57486OooO00o.setBackgroundColor(o0000.OooO00o(oO00O0o.white));
        LinearLayout linearLayout = a7Var.f57488OooO0OO;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.vError.nodataLayoutVEmpty");
        o000OO00.OooO0O0(linearLayout);
        LinearLayout linearLayout2 = a7Var.f57490OooO0o0;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.vError.nodataLayoutVFirst");
        o000OO00.OooO0O0(linearLayout2);
        LinearLayout linearLayout3 = a7Var.f57489OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "binding.vError.nodataLayoutVError");
        o000OO00.OooOOOO(linearLayout3);
    }
}
