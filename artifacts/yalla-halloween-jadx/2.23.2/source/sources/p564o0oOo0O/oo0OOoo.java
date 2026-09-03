package p564o0oOo0O;

import com.code.android.uikit.svga.SVGAView;
import com.yalla.yalla.ui.view.moment.MomentReplyItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p405o0Oo0OOO.oOOO00Oo;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentReplyItemView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentReplyItemView.kt\ncom/yalla/yalla/ui/view/moment/MomentReplyItemView$rewardSon$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,417:1\n283#2,2:418\n*S KotlinDebug\n*F\n+ 1 MomentReplyItemView.kt\ncom/yalla/yalla/ui/view/moment/MomentReplyItemView$rewardSon$1\n*L\n297#1:418,2\n*E\n"})
public final class oo0OOoo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyItemView f56386OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0OOoo(MomentReplyItemView momentReplyItemView) {
        super(0);
        this.f56386OooO0Oo = momentReplyItemView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentReplyItemView momentReplyItemView = this.f56386OooO0Oo;
        SVGAView rewardSvgaSon = momentReplyItemView.f30590OooO0Oo.f45152OooOO0O;
        Intrinsics.checkNotNullExpressionValue(rewardSvgaSon, "rewardSvgaSon");
        rewardSvgaSon.setVisibility(4);
        oOOO00Oo oooo00oo = momentReplyItemView.f30590OooO0Oo;
        oooo00oo.f45151OooOO0.setVisibility(0);
        oooo00oo.f45151OooOO0.setImageResource(o0Oo0oo.ic_moment_comment_reward_color);
        return Unit.INSTANCE;
    }
}
