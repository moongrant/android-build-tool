package p564o0oOo0O;

import android.widget.ImageView;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o000O;
import com.yalla.yalla.ui.view.moment.MomentDetailCommentItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p405o0Oo0OOO.oOO0O0;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentDetailCommentItemView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentDetailCommentItemView.kt\ncom/yalla/yalla/ui/view/moment/MomentDetailCommentItemView$rewardSon$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,702:1\n283#2,2:703\n*S KotlinDebug\n*F\n+ 1 MomentDetailCommentItemView.kt\ncom/yalla/yalla/ui/view/moment/MomentDetailCommentItemView$rewardSon$1\n*L\n581#1:703,2\n*E\n"})
public final class o0O00OOO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailCommentItemView f56333OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00OOO(MomentDetailCommentItemView momentDetailCommentItemView) {
        super(0);
        this.f56333OooO0Oo = momentDetailCommentItemView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentDetailCommentItemView momentDetailCommentItemView = this.f56333OooO0Oo;
        SVGAView rewardSvgaSon = momentDetailCommentItemView.f30537OooO0Oo.f45067OooOo;
        Intrinsics.checkNotNullExpressionValue(rewardSvgaSon, "rewardSvgaSon");
        rewardSvgaSon.setVisibility(4);
        oOO0O0 ooo0o0 = momentDetailCommentItemView.f30537OooO0Oo;
        ImageView rewardIvSon = ooo0o0.f45070OooOo0O;
        Intrinsics.checkNotNullExpressionValue(rewardIvSon, "rewardIvSon");
        o000O.OooOOOO(rewardIvSon);
        ooo0o0.f45070OooOo0O.setImageResource(o0Oo0oo.ic_moment_comment_reward_color);
        return Unit.INSTANCE;
    }
}
