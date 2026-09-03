package p556o0oOOooo;

import android.widget.TextView;
import com.code.android.uikit.svga.SVGAView;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.ui.view.moment.MomentDetailCommentItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p641o0ooOOOO.l6;

/* JADX INFO: loaded from: classes5.dex */
public final class ooOOOOoo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailCommentItemView f56160OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooOOOOoo(MomentDetailCommentItemView momentDetailCommentItemView) {
        super(0);
        this.f56160OooO0Oo = momentDetailCommentItemView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentDetailCommentItemView momentDetailCommentItemView = this.f56160OooO0Oo;
        MomentCommentDetailModel item = momentDetailCommentItemView.getItem();
        l6 l6Var = momentDetailCommentItemView.f31082OooO0Oo;
        SVGAView sVGAView = l6Var.f58360OooOo0o;
        Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.rewardSvga");
        TextView textView = l6Var.f58355OooOOoo;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.rewardCount");
        momentDetailCommentItemView.OooO0oo(item, sVGAView, textView);
        return Unit.INSTANCE;
    }
}
