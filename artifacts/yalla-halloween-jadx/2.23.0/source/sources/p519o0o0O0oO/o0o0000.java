package p519o0o0O0oO;

import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000;
import com.code.android.util.o000OO00;
import com.yalla.yalla.ui.view.webView.BaseWebView;
import kotlin.jvm.internal.Intrinsics;
import p584o0oOooO0.oO00O0o;

/* JADX INFO: loaded from: classes4.dex */
public final class o0o0000 implements BaseWebView.OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o f52767OooO00o;

    public o0o0000(o oVar) {
        this.f52767OooO00o = oVar;
    }

    @Override // com.yalla.yalla.ui.view.webView.BaseWebView.OooO0OO
    public final void OooO00o(int i) {
    }

    @Override // com.yalla.yalla.ui.view.webView.BaseWebView.OooO0OO
    public final void OooO0O0(boolean z) {
        o oVar = this.f52767OooO00o;
        if (z) {
            oVar.OooOO0().f58871OooO0O0.OooO0o();
            SVGAView sVGAView = oVar.OooOO0().f58871OooO0O0;
            Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.svgaLoading");
            o000OO00.OooO0O0(sVGAView);
            oVar.OooOO0().f58870OooO00o.setBackgroundColor(0);
            return;
        }
        SVGAView sVGAView2 = oVar.OooOO0().f58871OooO0O0;
        Intrinsics.checkNotNullExpressionValue(sVGAView2, "binding.svgaLoading");
        o000OO00.OooO0O0(sVGAView2);
        ScrollView scrollView = oVar.OooOO0().f58872OooO0OO.f57486OooO00o;
        Intrinsics.checkNotNullExpressionValue(scrollView, "binding.vError.root");
        o000OO00.OooOOOO(scrollView);
        oVar.OooOO0().f58872OooO0OO.f57486OooO00o.setBackgroundColor(o0000.OooO00o(oO00O0o.white));
        LinearLayout linearLayout = oVar.OooOO0().f58872OooO0OO.f57488OooO0OO;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.vError.nodataLayoutVEmpty");
        o000OO00.OooO0O0(linearLayout);
        LinearLayout linearLayout2 = oVar.OooOO0().f58872OooO0OO.f57490OooO0o0;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.vError.nodataLayoutVFirst");
        o000OO00.OooO0O0(linearLayout2);
        LinearLayout linearLayout3 = oVar.OooOO0().f58872OooO0OO.f57489OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "binding.vError.nodataLayoutVError");
        o000OO00.OooOOOO(linearLayout3);
    }
}
