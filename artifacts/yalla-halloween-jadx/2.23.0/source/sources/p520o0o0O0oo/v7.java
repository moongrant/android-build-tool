package p520o0o0O0oo;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import com.code.android.util.o000OO00;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.ui.view.GiftView;
import kotlin.jvm.internal.Intrinsics;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o0Oo0oo;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes4.dex */
public final class v7 implements Observer<GiftView> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ x6 f53355OooO0Oo;

    public v7(x6 x6Var) {
        this.f53355OooO0Oo = x6Var;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(GiftView giftView) {
        GiftPropModel.CustomPropDetail customPropDetail;
        GiftView giftView2 = giftView;
        x6 x6Var = this.f53355OooO0Oo;
        GiftPropModel giftPropModel = x6Var.f53384OooOOo;
        boolean z = giftPropModel != null && Intrinsics.areEqual(giftPropModel, giftView2.getF30469OooO0o0());
        GiftView giftView3 = x6Var.f53385OooOOo0;
        if (giftView3 != null) {
            giftView3.setSelectedGift(false);
        }
        x6Var.f53384OooOOo = null;
        x6Var.f53385OooOOo0 = giftView2;
        if (giftView2 != null) {
            giftView2.setSelectedGift(true);
        }
        x6Var.f53384OooOOo = giftView2.getF30469OooO0o0();
        GiftPropModel f30469OooO0o0 = giftView2.getF30469OooO0o0();
        if ((f30469OooO0o0 != null && f30469OooO0o0.isAllSiteGift()) && x6Var.f53383OooOOOo > 17) {
            x6Var.OooOoO(1);
        }
        x6Var.OooOOo().f58238OooOo0O.setData(x6Var.f53384OooOOo);
        if (z) {
            return;
        }
        GiftPropModel giftPropModel2 = x6Var.f53384OooOOo;
        if (!(giftPropModel2 != null && giftPropModel2.isCustomMade())) {
            ConstraintLayout constraintLayout = x6Var.OooOOo().f58220OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "mBinding.customGiftWarnContainer");
            if (o000OO00.OooO0o0(constraintLayout)) {
                o0Oo0oo o0oo0ooOooO0Oo = o00Oo0.OooO0Oo();
                o0oo0ooOooO0Oo.getClass();
                o0oo0ooOooO0Oo.OooO0o("neverShowCustomMadeGiftWarn" + o000000O.OooOOo0().getValue(), true);
                ConstraintLayout constraintLayout2 = x6Var.OooOOo().f58220OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(constraintLayout2, "mBinding.customGiftWarnContainer");
                o000OO00.OooO0O0(constraintLayout2);
                return;
            }
            return;
        }
        GiftPropModel giftPropModel3 = x6Var.f53384OooOOo;
        if ((giftPropModel3 == null || (customPropDetail = giftPropModel3.getCustomPropDetail()) == null || customPropDetail.isFirstOpenCustomMade()) ? false : true) {
            o0Oo0oo o0oo0ooOooO0Oo2 = o00Oo0.OooO0Oo();
            o0oo0ooOooO0Oo2.getClass();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            if (o0oo0ooOooO0Oo2.OooO0O0("neverShowCustomMadeGiftWarn" + o000000O.OooOOo0().getValue(), false)) {
                return;
            }
            ConstraintLayout constraintLayout3 = x6Var.OooOOo().f58220OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(constraintLayout3, "mBinding.customGiftWarnContainer");
            o000OO00.OooOOOO(constraintLayout3);
        }
    }
}
