package p552o0oOOoOo;

import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.uikit.marquee.MarqueeText;
import com.code.android.util.o000OO00;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.gift.GiftPropMergeDetail;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.gift.GiftPropTypeMergeHead;
import com.yalla.yalla.ui.view.gift.GiftTipsViewMerge;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p417o0OoO0.o000O0;
import p417o0OoO0.o000O0o;
import p464o0Oooo.o000000O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oO00OOo0;
import p641o0ooOOOO.mb;

/* JADX INFO: loaded from: classes5.dex */
public final class o0OO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ GiftTipsViewMerge f55953OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f55954OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ GiftPropModel f55955OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO0(GiftTipsViewMerge giftTipsViewMerge, GiftPropModel giftPropModel, String str) {
        super(0);
        this.f55953OooO0Oo = giftTipsViewMerge;
        this.f55955OooO0o0 = giftPropModel;
        this.f55954OooO0o = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        GiftTipsViewMerge giftTipsViewMerge = this.f55953OooO0Oo;
        ImageView it = giftTipsViewMerge.f31008OooO0Oo.f58431OooO0Oo;
        GiftPropModel giftPropModel = this.f55955OooO0o0;
        if (giftPropModel.getExplainUrl().length() == 0) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            o000OO00.OooO0O0(it);
        } else {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            o000OO00.OooOOOO(it);
        }
        mb mbVar = giftTipsViewMerge.f31008OooO0Oo;
        MarqueeText it2 = mbVar.f58430OooO0OO;
        ConstraintLayout constraintLayout = mbVar.f58428OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.root");
        o000OO00.OooOOOO(constraintLayout);
        Intrinsics.checkNotNullExpressionValue(it2, "it");
        o000OO00.OooOOOO(it2);
        MarqueeText.OooOO0o(it2);
        GiftPropMergeDetail mergePropDetail = giftPropModel.getMergePropDetail();
        int iOooO0oO = o0OoOo0.OooO0oO(mergePropDetail != null ? Long.valueOf(mergePropDetail.getHeadType()) : null);
        int value = GiftPropTypeMergeHead.Send.getValue();
        ImageView imageView = mbVar.f58433OooO0o0;
        if (iOooO0oO == value) {
            imageView.setImageResource(oO00OOO.ic_gift_tips_merge_1);
            it2.setText(o000O0.OooO0O0(oO00OOo0.gift_tips_merge_send, giftTipsViewMerge));
            int iOooO00o = o000O0.OooO00o(oO00O0o.color_FFFFEA12, giftTipsViewMerge);
            o000000O o000000o2 = o000000O.f46674OooO00o;
            o000O0o.OooO0Oo(it2, iOooO00o, o0OoOo0.OooOOO((String) o000000O.OooOOoo().getValue(), ""));
        } else {
            int value2 = GiftPropTypeMergeHead.Receive.getValue();
            String str = this.f55954OooO0o;
            if (iOooO0oO == value2) {
                imageView.setImageResource(oO00OOO.ic_gift_tips_merge_1);
                it2.setText(o000O0.OooO0O0(oO00OOo0.gift_tips_merge_receive, giftTipsViewMerge));
                o000O0o.OooO0Oo(it2, o000O0.OooO00o(oO00O0o.color_FFFFEA12, giftTipsViewMerge), o0OoOo0.OooOOO(str, ""));
            } else if (iOooO0oO == GiftPropTypeMergeHead.SendAndReceive.getValue()) {
                imageView.setImageResource(oO00OOO.ic_gift_tips_merge_2);
                it2.setText(o000O0.OooO0O0(oO00OOo0.gift_tips_merge_sendAndReceive, giftTipsViewMerge));
                int i = oO00O0o.color_FFFFEA12;
                int iOooO00o2 = o000O0.OooO00o(i, giftTipsViewMerge);
                o000000O o000000o3 = o000000O.f46674OooO00o;
                o000O0o.OooO0Oo(it2, iOooO00o2, o0OoOo0.OooOOO((String) o000000O.OooOOoo().getValue(), ""));
                o000O0o.OooO0Oo(it2, o000O0.OooO00o(i, giftTipsViewMerge), o0OoOo0.OooOOO(str, ""));
            } else if (iOooO0oO == GiftPropTypeMergeHead.Default.getValue()) {
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.root");
                o000OO00.OooO0O0(constraintLayout);
            }
        }
        return Unit.INSTANCE;
    }
}
