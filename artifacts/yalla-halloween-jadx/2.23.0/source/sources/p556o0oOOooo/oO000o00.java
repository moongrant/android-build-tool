package p556o0oOOooo;

import android.widget.TextView;
import com.code.android.uikit.svga.SVGAView;
import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.ui.view.moment.MomentDetailCommentItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p641o0ooOOOO.l6;

/* JADX INFO: loaded from: classes5.dex */
public final class oO000o00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailCommentItemView f56099OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000o00(MomentDetailCommentItemView momentDetailCommentItemView) {
        super(0);
        this.f56099OooO0Oo = momentDetailCommentItemView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentDetailCommentItemView momentDetailCommentItemView = this.f56099OooO0Oo;
        MomentReplyModel itemSon = momentDetailCommentItemView.getItemSon();
        l6 l6Var = momentDetailCommentItemView.f31082OooO0Oo;
        SVGAView sVGAView = l6Var.f58356OooOo;
        Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.rewardSvgaSon");
        TextView textView = l6Var.f58358OooOo00;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.rewardCountSon");
        MomentDetailCommentItemView.OooO0o(momentDetailCommentItemView, itemSon, sVGAView, textView);
        return Unit.INSTANCE;
    }
}
