package p556o0oOOooo;

import com.code.android.uikit.svga.SVGAView;
import com.yalla.yalla.ui.view.moment.MomentReplyItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.x6;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nMomentReplyItemView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentReplyItemView.kt\ncom/yalla/yalla/ui/view/moment/MomentReplyItemView$rewardSon$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,417:1\n283#2,2:418\n*S KotlinDebug\n*F\n+ 1 MomentReplyItemView.kt\ncom/yalla/yalla/ui/view/moment/MomentReplyItemView$rewardSon$1\n*L\n297#1:418,2\n*E\n"})
public final class oO0OOO00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyItemView f56134OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OOO00(MomentReplyItemView momentReplyItemView) {
        super(0);
        this.f56134OooO0Oo = momentReplyItemView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentReplyItemView momentReplyItemView = this.f56134OooO0Oo;
        SVGAView sVGAView = momentReplyItemView.f31131OooO0Oo.f59286OooOO0O;
        Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.rewardSvgaSon");
        sVGAView.setVisibility(4);
        x6 x6Var = momentReplyItemView.f31131OooO0Oo;
        x6Var.f59285OooOO0.setVisibility(0);
        x6Var.f59285OooOO0.setImageResource(oOo00OO0.ic_moment_comment_reward_color);
        return Unit.INSTANCE;
    }
}
