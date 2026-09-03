package p511o0o0O;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.util.o000O;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.ui.dialog.giftDialog.GiftCustomMadeWebManager;
import com.yalla.yalla.ui.view.webView.BaseWebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p405o0Oo0OOO.l0;
import p405o0Oo0OOO.oOOO0OO0;
import p590o0oOooo0.c1;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0 extends Lambda implements Function1<GiftPropModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00000OO f51007OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0(o00000OO o00000oo2) {
        super(1);
        this.f51007OooO0Oo = o00000oo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(GiftPropModel giftPropModel) {
        String strOooO0O0;
        String strOooO00o;
        GiftPropModel giftPropModel2 = giftPropModel;
        o00000OO o00000oo2 = this.f51007OooO0Oo;
        if (!o00000oo2.OooOOo0().f44518OooOOoo.isShown() && Intrinsics.areEqual(giftPropModel2, o00000oo2.f50968OooOOo) && giftPropModel2 != null) {
            FrameLayout overrideGiftContainer = o00000oo2.OooOOo0().f44518OooOOoo;
            Intrinsics.checkNotNullExpressionValue(overrideGiftContainer, "overrideGiftContainer");
            o000O.OooOOOO(overrideGiftContainer);
            GiftCustomMadeWebManager giftCustomMadeWebManagerOooOOo = o00000oo2.OooOOo();
            giftCustomMadeWebManagerOooOOo.f27530OooO0oO = null;
            giftCustomMadeWebManagerOooOOo.f27531OooO0oo = false;
            OooOO0O oooOO0O = new OooOO0O(giftCustomMadeWebManagerOooOOo);
            boolean z = giftCustomMadeWebManagerOooOOo.f27529OooO0o0;
            FrameLayout frameLayout = giftCustomMadeWebManagerOooOOo.f27525OooO0O0;
            l0 l0Var = giftCustomMadeWebManagerOooOOo.f27526OooO0OO;
            if (z) {
                frameLayout.removeAllViews();
                o000O.OooOOOO(frameLayout);
                frameLayout.addView(l0Var.f44106OooO00o);
                oooOO0O.invoke();
                giftCustomMadeWebManagerOooOOo.f27527OooO0Oo = true;
            } else {
                giftCustomMadeWebManagerOooOOo.f27527OooO0Oo = true;
                giftCustomMadeWebManagerOooOOo.f27529OooO0o0 = true;
                frameLayout.addView(l0Var.f44106OooO00o);
                oooOO0O.invoke();
                ConstraintLayout constraintLayout = l0Var.f44106OooO00o;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
                o000O.OooO(constraintLayout, new OooO0O0(giftCustomMadeWebManagerOooOOo));
                View bottomView = l0Var.f44107OooO0O0;
                Intrinsics.checkNotNullExpressionValue(bottomView, "bottomView");
                o000O.OooO(bottomView, OooO0OO.f50908OooO0Oo);
                oOOO0OO0 oooo0oo0 = l0Var.f44111OooO0o0;
                ScrollView scrollView = oooo0oo0.f45166OooO00o;
                Intrinsics.checkNotNullExpressionValue(scrollView, "getRoot(...)");
                o000O.OooO0O0(scrollView);
                oooo0oo0.f45167OooO0O0.setOnClickListener(new OooO0o(giftCustomMadeWebManagerOooOOo));
                BaseWebView baseWebView = l0Var.f44110OooO0o;
                baseWebView.setBackgroundColor(0);
                baseWebView.getSettings().setCacheMode(2);
                baseWebView.setLoadStateListener(new OooO(giftCustomMadeWebManagerOooOOo));
                baseWebView.addJavascriptInterface(new OooOO0(giftCustomMadeWebManagerOooOOo, giftPropModel2), "Yalla");
                String explainUrl = giftPropModel2.getExplainUrl();
                if (explainUrl == null || (strOooO00o = c1.OooO00o(explainUrl)) == null || (strOooO0O0 = c1.OooO0O0(strOooO00o, "customGiftId", String.valueOf(giftPropModel2.getGiftId()))) == null) {
                    strOooO0O0 = "";
                }
                baseWebView.loadUrl(strOooO0O0);
            }
        }
        return Unit.INSTANCE;
    }
}
