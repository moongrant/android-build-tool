package p496o0o00Oo0;

import android.widget.TextView;
import com.code.android.uikit.svga.SVGAView;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.ui.activity.moment.postDetailCommentSonList.MomentReplyHeaderView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyHeaderView f49649OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentCommentDetailModel f49650OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(MomentReplyHeaderView momentReplyHeaderView, MomentCommentDetailModel momentCommentDetailModel) {
        super(0);
        this.f49649OooO0Oo = momentReplyHeaderView;
        this.f49650OooO0o0 = momentCommentDetailModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentReplyHeaderView momentReplyHeaderView = this.f49649OooO0Oo;
        SVGAView rewardSvga = momentReplyHeaderView.f26002OooO0o0.f45136OooOOOO;
        Intrinsics.checkNotNullExpressionValue(rewardSvga, "rewardSvga");
        TextView rewardCount = momentReplyHeaderView.f26002OooO0o0.f45135OooOOO0;
        Intrinsics.checkNotNullExpressionValue(rewardCount, "rewardCount");
        momentReplyHeaderView.OooO0Oo(this.f49650OooO0o0, rewardSvga, rewardCount);
        return Unit.INSTANCE;
    }
}
