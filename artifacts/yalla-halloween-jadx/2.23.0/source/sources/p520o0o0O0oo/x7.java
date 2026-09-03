package p520o0o0O0oo;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.util.o000OO00;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.ui.dialog.giftDialog.GiftCustomMadeWebManager;
import com.yalla.yalla.ui.view.webView.BaseWebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p579o0oOoo.oOo0o00;
import p641o0ooOOOO.a7;
import p641o0ooOOOO.x8;

/* JADX INFO: loaded from: classes4.dex */
public final class x7 extends Lambda implements Function1<GiftPropModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ x6 f53411OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(x6 x6Var) {
        super(1);
        this.f53411OooO0Oo = x6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(GiftPropModel giftPropModel) {
        String strOooO0O0;
        String strOooO00o;
        GiftPropModel giftPropModel2 = giftPropModel;
        x6 x6Var = this.f53411OooO0Oo;
        if (!x6Var.OooOOo().f58234OooOOoo.isShown() && Intrinsics.areEqual(giftPropModel2, x6Var.f53384OooOOo) && giftPropModel2 != null) {
            FrameLayout frameLayout = x6Var.OooOOo().f58234OooOOoo;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "mBinding.overrideGiftContainer");
            o000OO00.OooOOOO(frameLayout);
            GiftCustomMadeWebManager giftCustomMadeWebManagerOooOOoo = x6Var.OooOOoo();
            giftCustomMadeWebManagerOooOOoo.f28002OooO0oO = null;
            giftCustomMadeWebManagerOooOOoo.f28003OooO0oo = false;
            x5 x5Var = new x5(giftCustomMadeWebManagerOooOOoo);
            boolean z = giftCustomMadeWebManagerOooOOoo.f28001OooO0o0;
            FrameLayout frameLayout2 = giftCustomMadeWebManagerOooOOoo.f27997OooO0O0;
            x8 x8Var = giftCustomMadeWebManagerOooOOoo.f27998OooO0OO;
            if (z) {
                frameLayout2.removeAllViews();
                o000OO00.OooOOOO(frameLayout2);
                frameLayout2.addView(x8Var.f59334OooO00o);
                x5Var.invoke();
                giftCustomMadeWebManagerOooOOoo.f27999OooO0Oo = true;
            } else {
                giftCustomMadeWebManagerOooOOoo.f27999OooO0Oo = true;
                giftCustomMadeWebManagerOooOOoo.f28001OooO0o0 = true;
                frameLayout2.addView(x8Var.f59334OooO00o);
                x5Var.invoke();
                ConstraintLayout constraintLayout = x8Var.f59334OooO00o;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.root");
                o000OO00.OooO(constraintLayout, new s5(giftCustomMadeWebManagerOooOOoo));
                View view = x8Var.f59335OooO0O0;
                Intrinsics.checkNotNullExpressionValue(view, "binding.bottomView");
                o000OO00.OooO(view, t5.f53339OooO0Oo);
                a7 a7Var = x8Var.f59339OooO0o0;
                ScrollView scrollView = a7Var.f57486OooO00o;
                Intrinsics.checkNotNullExpressionValue(scrollView, "binding.vError.root");
                o000OO00.OooO0O0(scrollView);
                a7Var.f57487OooO0O0.setOnClickListener(new u5(giftCustomMadeWebManagerOooOOoo));
                BaseWebView baseWebView = x8Var.f59338OooO0o;
                baseWebView.setBackgroundColor(0);
                baseWebView.getSettings().setCacheMode(2);
                baseWebView.setLoadStateListener(new v5(giftCustomMadeWebManagerOooOOoo));
                baseWebView.addJavascriptInterface(new w5(giftCustomMadeWebManagerOooOOoo, giftPropModel2), "Yalla");
                String explainUrl = giftPropModel2.getExplainUrl();
                if (explainUrl == null || (strOooO00o = oOo0o00.OooO00o(explainUrl)) == null || (strOooO0O0 = oOo0o00.OooO0O0(strOooO00o, "customGiftId", String.valueOf(giftPropModel2.getGiftId()))) == null) {
                    strOooO0O0 = "";
                }
                baseWebView.loadUrl(strOooO0O0);
            }
        }
        return Unit.INSTANCE;
    }
}
