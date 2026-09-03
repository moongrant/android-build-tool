package p496o0o00Oo0;

import com.code.android.uikit.svga.SVGAView;
import com.yalla.yalla.ui.activity.moment.postDetailCommentSonList.MomentReplyHeaderView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p405o0Oo0OOO.oOOO00;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentReplyHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentReplyHeaderView.kt\ncom/yalla/yalla/ui/activity/moment/postDetailCommentSonList/MomentReplyHeaderView$reward$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,429:1\n283#2,2:430\n*S KotlinDebug\n*F\n+ 1 MomentReplyHeaderView.kt\ncom/yalla/yalla/ui/activity/moment/postDetailCommentSonList/MomentReplyHeaderView$reward$1\n*L\n367#1:430,2\n*E\n"})
public final class h extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyHeaderView f49647OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(MomentReplyHeaderView momentReplyHeaderView) {
        super(0);
        this.f49647OooO0Oo = momentReplyHeaderView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentReplyHeaderView momentReplyHeaderView = this.f49647OooO0Oo;
        SVGAView rewardSvga = momentReplyHeaderView.f26002OooO0o0.f45136OooOOOO;
        Intrinsics.checkNotNullExpressionValue(rewardSvga, "rewardSvga");
        rewardSvga.setVisibility(4);
        oOOO00 oooo00 = momentReplyHeaderView.f26002OooO0o0;
        oooo00.f45134OooOOO.setVisibility(0);
        oooo00.f45134OooOOO.setImageResource(o0Oo0oo.ic_moment_comment_reward_color);
        return Unit.INSTANCE;
    }
}
