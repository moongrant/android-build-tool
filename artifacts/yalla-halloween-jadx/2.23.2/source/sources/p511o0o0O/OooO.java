package p511o0o0O;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000;
import com.code.android.util.o000O;
import com.yalla.yalla.ui.dialog.giftDialog.GiftCustomMadeWebManager;
import com.yalla.yalla.ui.view.webView.BaseWebView;
import kotlin.jvm.internal.Intrinsics;
import p405o0Oo0OOO.l0;
import p405o0Oo0OOO.oOOO0OO0;
import p562o0oOo000.o0OOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO implements BaseWebView.OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ GiftCustomMadeWebManager f50906OooO00o;

    public OooO(GiftCustomMadeWebManager giftCustomMadeWebManager) {
        this.f50906OooO00o = giftCustomMadeWebManager;
    }

    @Override // com.yalla.yalla.ui.view.webView.BaseWebView.OooO0OO
    public final void OooO00o(int i) {
    }

    @Override // com.yalla.yalla.ui.view.webView.BaseWebView.OooO0OO
    public final void OooO0O0(boolean z) {
        GiftCustomMadeWebManager giftCustomMadeWebManager = this.f50906OooO00o;
        if (z) {
            giftCustomMadeWebManager.f27526OooO0OO.f44108OooO0OO.OooO0o();
            SVGAView svgaLoading = giftCustomMadeWebManager.f27526OooO0OO.f44108OooO0OO;
            Intrinsics.checkNotNullExpressionValue(svgaLoading, "svgaLoading");
            o000O.OooO0O0(svgaLoading);
            TextView tvSaving = giftCustomMadeWebManager.f27526OooO0OO.f44109OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(tvSaving, "tvSaving");
            o000O.OooO0O0(tvSaving);
            giftCustomMadeWebManager.f27526OooO0OO.f44106OooO00o.setBackgroundColor(0);
            View bottomView = giftCustomMadeWebManager.f27526OooO0OO.f44107OooO0O0;
            Intrinsics.checkNotNullExpressionValue(bottomView, "bottomView");
            o000O.OooOOOO(bottomView);
            giftCustomMadeWebManager.OooO0OO();
            return;
        }
        l0 l0Var = giftCustomMadeWebManager.f27526OooO0OO;
        SVGAView svgaLoading2 = l0Var.f44108OooO0OO;
        Intrinsics.checkNotNullExpressionValue(svgaLoading2, "svgaLoading");
        o000O.OooO0O0(svgaLoading2);
        TextView tvSaving2 = l0Var.f44109OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(tvSaving2, "tvSaving");
        o000O.OooO0O0(tvSaving2);
        oOOO0OO0 oooo0oo0 = l0Var.f44111OooO0o0;
        ScrollView scrollView = oooo0oo0.f45166OooO00o;
        Intrinsics.checkNotNullExpressionValue(scrollView, "getRoot(...)");
        o000O.OooOOOO(scrollView);
        oooo0oo0.f45166OooO00o.setBackgroundColor(o0000.OooO00o(o0OOO0o.white));
        LinearLayout nodataLayoutVEmpty = oooo0oo0.f45168OooO0OO;
        Intrinsics.checkNotNullExpressionValue(nodataLayoutVEmpty, "nodataLayoutVEmpty");
        o000O.OooO0O0(nodataLayoutVEmpty);
        LinearLayout nodataLayoutVFirst = oooo0oo0.f45170OooO0o0;
        Intrinsics.checkNotNullExpressionValue(nodataLayoutVFirst, "nodataLayoutVFirst");
        o000O.OooO0O0(nodataLayoutVFirst);
        LinearLayout nodataLayoutVError = oooo0oo0.f45169OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(nodataLayoutVError, "nodataLayoutVError");
        o000O.OooOOOO(nodataLayoutVError);
    }
}
