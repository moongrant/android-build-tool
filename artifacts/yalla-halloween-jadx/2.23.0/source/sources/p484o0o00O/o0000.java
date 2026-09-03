package p484o0o00O;

import com.code.android.uikit.svga.SVGAView;
import com.yalla.yalla.ui.activity.moment.postDetailCommentSonList.MomentReplyHeaderView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentReplyHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentReplyHeaderView.kt\ncom/yalla/yalla/ui/activity/moment/postDetailCommentSonList/MomentReplyHeaderView$reward$2\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,429:1\n283#2,2:430\n*S KotlinDebug\n*F\n+ 1 MomentReplyHeaderView.kt\ncom/yalla/yalla/ui/activity/moment/postDetailCommentSonList/MomentReplyHeaderView$reward$2\n*L\n372#1:430,2\n*E\n"})
public final class o0000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyHeaderView f47713OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000(MomentReplyHeaderView momentReplyHeaderView) {
        super(0);
        this.f47713OooO0Oo = momentReplyHeaderView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentReplyHeaderView momentReplyHeaderView = this.f47713OooO0Oo;
        SVGAView sVGAView = momentReplyHeaderView.f26454OooO0o0.f59167OooOOOO;
        Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.rewardSvga");
        sVGAView.setVisibility(0);
        momentReplyHeaderView.f26454OooO0o0.f59165OooOOO.setVisibility(4);
        return Unit.INSTANCE;
    }
}
