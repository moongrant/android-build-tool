package p501o0o00o;

import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.dialog.giftDialog.GiftBlindWebManager;
import com.yalla.yalla.common.ui.view.BaseWebView;
import com.yalla.yalla.common.ui.view.SVGAView;
import kotlin.jvm.internal.Intrinsics;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.oOO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O implements BaseWebView.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ GiftBlindWebManager f41498OooO00o;

    public o00O0O(GiftBlindWebManager giftBlindWebManager) {
        this.f41498OooO00o = giftBlindWebManager;
    }

    @Override // com.yalla.yalla.common.ui.view.BaseWebView.OooO0o
    public final void OooO00o(int i) {
    }

    @Override // com.yalla.yalla.common.ui.view.BaseWebView.OooO0o
    public final void OooO0O0(boolean z) {
        if (z) {
            this.f41498OooO00o.f20888OooO0OO.f49624OooO0OO.OooO0Oo();
            SVGAView sVGAView = this.f41498OooO00o.f20888OooO0OO.f49624OooO0OO;
            Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.svgaLoading");
            oOO00O.OooO00o(sVGAView);
            this.f41498OooO00o.f20888OooO0OO.f49622OooO00o.setBackgroundColor(0);
            return;
        }
        GiftBlindWebManager giftBlindWebManager = this.f41498OooO00o;
        SVGAView sVGAView2 = giftBlindWebManager.f20888OooO0OO.f49624OooO0OO;
        Intrinsics.checkNotNullExpressionValue(sVGAView2, "binding.svgaLoading");
        oOO00O.OooO00o(sVGAView2);
        ScrollView scrollView = giftBlindWebManager.f20888OooO0OO.f49625OooO0Oo.f49665OooO00o;
        Intrinsics.checkNotNullExpressionValue(scrollView, "binding.vError.root");
        oOO00O.OooO(scrollView);
        giftBlindWebManager.f20888OooO0OO.f49625OooO0Oo.f49665OooO00o.setBackgroundColor(o000O0O0.OooO00o(R.color.white));
        LinearLayout linearLayout = giftBlindWebManager.f20888OooO0OO.f49625OooO0Oo.f49668OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.vError.nodataLayoutVEmpty");
        oOO00O.OooO00o(linearLayout);
        LinearLayout linearLayout2 = giftBlindWebManager.f20888OooO0OO.f49625OooO0Oo.f49669OooO0o;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.vError.nodataLayoutVFirst");
        oOO00O.OooO00o(linearLayout2);
        LinearLayout linearLayout3 = giftBlindWebManager.f20888OooO0OO.f49625OooO0Oo.f49670OooO0o0;
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "binding.vError.nodataLayoutVError");
        oOO00O.OooO(linearLayout3);
    }
}
