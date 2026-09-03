package p556o0oOOooo;

import android.widget.ImageView;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o000OO00;
import com.yalla.yalla.ui.view.moment.MomentDetailCommentItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nMomentDetailCommentItemView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentDetailCommentItemView.kt\ncom/yalla/yalla/ui/view/moment/MomentDetailCommentItemView$rewardSon$2\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,702:1\n283#2,2:703\n*S KotlinDebug\n*F\n+ 1 MomentDetailCommentItemView.kt\ncom/yalla/yalla/ui/view/moment/MomentDetailCommentItemView$rewardSon$2\n*L\n586#1:703,2\n*E\n"})
public final class oO000Oo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailCommentItemView f56097OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000Oo(MomentDetailCommentItemView momentDetailCommentItemView) {
        super(0);
        this.f56097OooO0Oo = momentDetailCommentItemView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentDetailCommentItemView momentDetailCommentItemView = this.f56097OooO0Oo;
        SVGAView sVGAView = momentDetailCommentItemView.f31082OooO0Oo.f58356OooOo;
        Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.rewardSvgaSon");
        sVGAView.setVisibility(0);
        ImageView imageView = momentDetailCommentItemView.f31082OooO0Oo.f58359OooOo0O;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.rewardIvSon");
        o000OO00.OooO0OO(imageView);
        return Unit.INSTANCE;
    }
}
