package p558o0oOOooo;

import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.uikit.marquee.MarqueeText;
import com.code.android.util.o000O;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.gift.GiftPropMergeDetail;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.gift.GiftPropTypeMergeHead;
import com.yalla.yalla.ui.view.gift.GiftTipsViewMerge;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p405o0Oo0OOO.b3;
import p423o0OoO0OO.o00O0O0O;
import p423o0OoO0OO.o00O0OOO;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;
import p562o0oOo000.o0O0O00;
import p562o0oOo000.o0OOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O00O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ GiftTipsViewMerge f56207OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f56208OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ GiftPropModel f56209OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O00O(GiftTipsViewMerge giftTipsViewMerge, GiftPropModel giftPropModel, String str) {
        super(0);
        this.f56207OooO0Oo = giftTipsViewMerge;
        this.f56209OooO0o0 = giftPropModel;
        this.f56208OooO0o = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        GiftTipsViewMerge giftTipsViewMerge = this.f56207OooO0Oo;
        ImageView imageView = giftTipsViewMerge.f30463OooO0Oo.f43742OooO0Oo;
        GiftPropModel giftPropModel = this.f56209OooO0o0;
        if (giftPropModel.getExplainUrl().length() == 0) {
            Intrinsics.checkNotNull(imageView);
            o000O.OooO0O0(imageView);
        } else {
            Intrinsics.checkNotNull(imageView);
            o000O.OooOOOO(imageView);
        }
        b3 b3Var = giftTipsViewMerge.f30463OooO0Oo;
        MarqueeText marqueeText = b3Var.f43741OooO0OO;
        ConstraintLayout constraintLayout = b3Var.f43739OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        o000O.OooOOOO(constraintLayout);
        Intrinsics.checkNotNull(marqueeText);
        o000O.OooOOOO(marqueeText);
        MarqueeText.OooOO0o(marqueeText);
        GiftPropMergeDetail mergePropDetail = giftPropModel.getMergePropDetail();
        int iOooO0oO = o0OoOo0.OooO0oO(mergePropDetail != null ? Long.valueOf(mergePropDetail.getHeadType()) : null);
        int value = GiftPropTypeMergeHead.Send.getValue();
        ImageView imageView2 = b3Var.f43744OooO0o0;
        if (iOooO0oO == value) {
            imageView2.setImageResource(o0O0O00.ic_gift_tips_merge_1);
            marqueeText.setText(o00O0OOO.OooO0O0(o000000.gift_tips_merge_send, giftTipsViewMerge));
            int iOooO00o = o00O0OOO.OooO00o(o0OOO0o.color_FFFFEA12, giftTipsViewMerge);
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            o00O0O0O.OooO0Oo(marqueeText, iOooO00o, o0OoOo0.OooOOO((String) o0O00oO0.OooOOoo().getValue(), ""));
        } else {
            int value2 = GiftPropTypeMergeHead.Receive.getValue();
            String str = this.f56208OooO0o;
            if (iOooO0oO == value2) {
                imageView2.setImageResource(o0O0O00.ic_gift_tips_merge_1);
                marqueeText.setText(o00O0OOO.OooO0O0(o000000.gift_tips_merge_receive, giftTipsViewMerge));
                o00O0O0O.OooO0Oo(marqueeText, o00O0OOO.OooO00o(o0OOO0o.color_FFFFEA12, giftTipsViewMerge), o0OoOo0.OooOOO(str, ""));
            } else if (iOooO0oO == GiftPropTypeMergeHead.SendAndReceive.getValue()) {
                imageView2.setImageResource(o0O0O00.ic_gift_tips_merge_2);
                marqueeText.setText(o00O0OOO.OooO0O0(o000000.gift_tips_merge_sendAndReceive, giftTipsViewMerge));
                int i = o0OOO0o.color_FFFFEA12;
                int iOooO00o2 = o00O0OOO.OooO00o(i, giftTipsViewMerge);
                o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
                o00O0O0O.OooO0Oo(marqueeText, iOooO00o2, o0OoOo0.OooOOO((String) o0O00oO0.OooOOoo().getValue(), ""));
                o00O0O0O.OooO0Oo(marqueeText, o00O0OOO.OooO00o(i, giftTipsViewMerge), o0OoOo0.OooOOO(str, ""));
            } else if (iOooO0oO == GiftPropTypeMergeHead.Default.getValue()) {
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
                o000O.OooO0O0(constraintLayout);
            }
        }
        return Unit.INSTANCE;
    }
}
