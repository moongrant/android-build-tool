package p650o0ooo;

import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000;
import com.code.android.util.o000O;
import com.yalla.yalla.ui.view.webView.BaseWebView;
import kotlin.jvm.internal.Intrinsics;
import p562o0oOo000.o0OOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oO0O0o implements BaseWebView.OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0O0OO0 f58734OooO00o;

    public o0oO0O0o(o0O0OO0 o0o0oo0) {
        this.f58734OooO00o = o0o0oo0;
    }

    @Override // com.yalla.yalla.ui.view.webView.BaseWebView.OooO0OO
    public final void OooO00o(int i) {
    }

    @Override // com.yalla.yalla.ui.view.webView.BaseWebView.OooO0OO
    public final void OooO0O0(boolean z) {
        o0O0OO0 o0o0oo0 = this.f58734OooO00o;
        if (z) {
            o0o0oo0.OooOO0().f43867OooO0O0.OooO0o();
            SVGAView svgaLoading = o0o0oo0.OooOO0().f43867OooO0O0;
            Intrinsics.checkNotNullExpressionValue(svgaLoading, "svgaLoading");
            o000O.OooO0O0(svgaLoading);
            o0o0oo0.OooOO0().f43866OooO00o.setBackgroundColor(0);
            return;
        }
        SVGAView svgaLoading2 = o0o0oo0.OooOO0().f43867OooO0O0;
        Intrinsics.checkNotNullExpressionValue(svgaLoading2, "svgaLoading");
        o000O.OooO0O0(svgaLoading2);
        ScrollView scrollView = o0o0oo0.OooOO0().f43868OooO0OO.f45166OooO00o;
        Intrinsics.checkNotNullExpressionValue(scrollView, "getRoot(...)");
        o000O.OooOOOO(scrollView);
        o0o0oo0.OooOO0().f43868OooO0OO.f45166OooO00o.setBackgroundColor(o0000.OooO00o(o0OOO0o.white));
        LinearLayout nodataLayoutVEmpty = o0o0oo0.OooOO0().f43868OooO0OO.f45168OooO0OO;
        Intrinsics.checkNotNullExpressionValue(nodataLayoutVEmpty, "nodataLayoutVEmpty");
        o000O.OooO0O0(nodataLayoutVEmpty);
        LinearLayout nodataLayoutVFirst = o0o0oo0.OooOO0().f43868OooO0OO.f45170OooO0o0;
        Intrinsics.checkNotNullExpressionValue(nodataLayoutVFirst, "nodataLayoutVFirst");
        o000O.OooO0O0(nodataLayoutVFirst);
        LinearLayout nodataLayoutVError = o0o0oo0.OooOO0().f43868OooO0OO.f45169OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(nodataLayoutVError, "nodataLayoutVError");
        o000O.OooOOOO(nodataLayoutVError);
    }
}
