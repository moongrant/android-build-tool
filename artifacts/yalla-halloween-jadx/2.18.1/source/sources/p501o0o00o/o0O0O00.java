package p501o0o00o;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.dialog.giftDialog.GiftCustomMadeWebManager;
import com.yalla.yalla.common.ui.view.BaseWebView;
import com.yalla.yalla.common.ui.view.SVGAView;
import kotlin.jvm.internal.Intrinsics;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.oOO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O00 implements BaseWebView.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ GiftCustomMadeWebManager f41521OooO00o;

    public o0O0O00(GiftCustomMadeWebManager giftCustomMadeWebManager) {
        this.f41521OooO00o = giftCustomMadeWebManager;
    }

    @Override // com.yalla.yalla.common.ui.view.BaseWebView.OooO0o
    public final void OooO00o(int i) {
    }

    @Override // com.yalla.yalla.common.ui.view.BaseWebView.OooO0o
    public final void OooO0O0(boolean z) {
        if (z) {
            this.f41521OooO00o.f20894OooO0OO.f49677OooO0OO.OooO0Oo();
            SVGAView sVGAView = this.f41521OooO00o.f20894OooO0OO.f49677OooO0OO;
            Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.svgaLoading");
            oOO00O.OooO00o(sVGAView);
            TextView textView = this.f41521OooO00o.f20894OooO0OO.f49678OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvSaving");
            oOO00O.OooO00o(textView);
            this.f41521OooO00o.f20894OooO0OO.f49675OooO00o.setBackgroundColor(0);
            View view = this.f41521OooO00o.f20894OooO0OO.f49676OooO0O0;
            Intrinsics.checkNotNullExpressionValue(view, "binding.bottomView");
            oOO00O.OooO(view);
            this.f41521OooO00o.OooO0OO();
            return;
        }
        GiftCustomMadeWebManager giftCustomMadeWebManager = this.f41521OooO00o;
        SVGAView sVGAView2 = giftCustomMadeWebManager.f20894OooO0OO.f49677OooO0OO;
        Intrinsics.checkNotNullExpressionValue(sVGAView2, "binding.svgaLoading");
        oOO00O.OooO00o(sVGAView2);
        TextView textView2 = giftCustomMadeWebManager.f20894OooO0OO.f49678OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvSaving");
        oOO00O.OooO00o(textView2);
        ScrollView scrollView = giftCustomMadeWebManager.f20894OooO0OO.f49680OooO0o0.f49665OooO00o;
        Intrinsics.checkNotNullExpressionValue(scrollView, "binding.vError.root");
        oOO00O.OooO(scrollView);
        giftCustomMadeWebManager.f20894OooO0OO.f49680OooO0o0.f49665OooO00o.setBackgroundColor(o000O0O0.OooO00o(R.color.white));
        LinearLayout linearLayout = giftCustomMadeWebManager.f20894OooO0OO.f49680OooO0o0.f49668OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.vError.nodataLayoutVEmpty");
        oOO00O.OooO00o(linearLayout);
        LinearLayout linearLayout2 = giftCustomMadeWebManager.f20894OooO0OO.f49680OooO0o0.f49669OooO0o;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.vError.nodataLayoutVFirst");
        oOO00O.OooO00o(linearLayout2);
        LinearLayout linearLayout3 = giftCustomMadeWebManager.f20894OooO0OO.f49680OooO0o0.f49670OooO0o0;
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "binding.vError.nodataLayoutVError");
        oOO00O.OooO(linearLayout3);
    }
}
