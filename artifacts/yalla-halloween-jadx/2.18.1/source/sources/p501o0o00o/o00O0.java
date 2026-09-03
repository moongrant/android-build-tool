package p501o0o00o;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yalla.yalla.common.ui.dialog.giftDialog.GiftCustomMadeWebManager;
import com.yalla.yalla.common.ui.view.BaseWebView;
import com.yalla.yalla.model.GiftPropModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p254o00ooO0O.oOO00O;
import p516o0o0O000.o00000OO;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0 extends Lambda implements Function1<GiftPropModel, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000 f41490Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0(o000 o000Var) {
        super(1);
        this.f41490Oooo0o = o000Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(GiftPropModel giftPropModel) {
        String strOooO0O0;
        String strOooO00o;
        GiftPropModel giftPropModel2 = giftPropModel;
        if (!this.f41490Oooo0o.OooOo00().f50852OooOo0.isShown() && Intrinsics.areEqual(giftPropModel2, this.f41490Oooo0o.f41410OooOo0O) && giftPropModel2 != null) {
            o000 o000Var = this.f41490Oooo0o;
            FrameLayout frameLayout = o000Var.OooOo00().f50852OooOo0;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "mBinding.overrideGiftContainer");
            oOO00O.OooO(frameLayout);
            GiftCustomMadeWebManager giftCustomMadeWebManager = (GiftCustomMadeWebManager) o000Var.f41405OooOOo0.getValue();
            giftCustomMadeWebManager.f20898OooO0oO = null;
            giftCustomMadeWebManager.f20899OooO0oo = false;
            o000000 o000000Var = new o000000(giftCustomMadeWebManager);
            if (giftCustomMadeWebManager.f20897OooO0o0) {
                giftCustomMadeWebManager.f20893OooO0O0.removeAllViews();
                oOO00O.OooO(giftCustomMadeWebManager.f20893OooO0O0);
                giftCustomMadeWebManager.f20893OooO0O0.addView(giftCustomMadeWebManager.f20894OooO0OO.f49675OooO00o);
                o000000Var.invoke();
                giftCustomMadeWebManager.f20895OooO0Oo = true;
            } else {
                giftCustomMadeWebManager.f20895OooO0Oo = true;
                giftCustomMadeWebManager.f20897OooO0o0 = true;
                giftCustomMadeWebManager.f20893OooO0O0.addView(giftCustomMadeWebManager.f20894OooO0OO.f49675OooO00o);
                o000000Var.invoke();
                ConstraintLayout constraintLayout = giftCustomMadeWebManager.f20894OooO0OO.f49675OooO00o;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.root");
                oOO00O.OooO0oO(constraintLayout, new o0Oo0oo(giftCustomMadeWebManager));
                View view = giftCustomMadeWebManager.f20894OooO0OO.f49676OooO0O0;
                Intrinsics.checkNotNullExpressionValue(view, "binding.bottomView");
                oOO00O.OooO0oO(view, o0OO00O.f41523Oooo0o);
                ScrollView scrollView = giftCustomMadeWebManager.f20894OooO0OO.f49680OooO0o0.f49665OooO00o;
                Intrinsics.checkNotNullExpressionValue(scrollView, "binding.vError.root");
                oOO00O.OooO00o(scrollView);
                giftCustomMadeWebManager.f20894OooO0OO.f49680OooO0o0.f49666OooO0O0.setOnClickListener(new oo0o0Oo(giftCustomMadeWebManager));
                giftCustomMadeWebManager.f20894OooO0OO.f49679OooO0o.setBackgroundColor(0);
                giftCustomMadeWebManager.f20894OooO0OO.f49679OooO0o.getSettings().setCacheMode(2);
                giftCustomMadeWebManager.f20894OooO0OO.f49679OooO0o.setLoadStateListener(new o0O0O00(giftCustomMadeWebManager));
                giftCustomMadeWebManager.f20894OooO0OO.f49679OooO0o.addJavascriptInterface(new o000OOo(giftCustomMadeWebManager, giftPropModel2), "Yalla");
                BaseWebView baseWebView = giftCustomMadeWebManager.f20894OooO0OO.f49679OooO0o;
                String explainUrl = giftPropModel2.getExplainUrl();
                if (explainUrl == null || (strOooO00o = o00000OO.OooO00o(explainUrl)) == null || (strOooO0O0 = o00000OO.OooO0O0(strOooO00o, "customGiftId", String.valueOf(giftPropModel2.getGiftId()))) == null) {
                    strOooO0O0 = "";
                }
                baseWebView.loadUrl(strOooO0O0);
            }
        }
        return Unit.INSTANCE;
    }
}
