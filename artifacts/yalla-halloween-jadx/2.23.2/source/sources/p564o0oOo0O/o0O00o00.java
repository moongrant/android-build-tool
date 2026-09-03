package p564o0oOo0O;

import android.widget.TextView;
import com.code.android.uikit.svga.SVGAView;
import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.ui.view.moment.MomentDetailCommentItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p405o0Oo0OOO.oOO0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00o00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailCommentItemView f56335OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00o00(MomentDetailCommentItemView momentDetailCommentItemView) {
        super(0);
        this.f56335OooO0Oo = momentDetailCommentItemView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentDetailCommentItemView momentDetailCommentItemView = this.f56335OooO0Oo;
        MomentReplyModel itemSon = momentDetailCommentItemView.getItemSon();
        oOO0O0 ooo0o0 = momentDetailCommentItemView.f30537OooO0Oo;
        SVGAView rewardSvgaSon = ooo0o0.f45067OooOo;
        Intrinsics.checkNotNullExpressionValue(rewardSvgaSon, "rewardSvgaSon");
        TextView rewardCountSon = ooo0o0.f45069OooOo00;
        Intrinsics.checkNotNullExpressionValue(rewardCountSon, "rewardCountSon");
        momentDetailCommentItemView.OooO0oo(itemSon, rewardSvgaSon, rewardCountSon);
        return Unit.INSTANCE;
    }
}
