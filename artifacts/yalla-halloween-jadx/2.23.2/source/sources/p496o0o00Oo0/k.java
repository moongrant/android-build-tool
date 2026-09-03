package p496o0o00Oo0;

import android.widget.TextView;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000;
import com.code.android.util.o000O00;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.ui.activity.moment.postDetailCommentSonList.MomentReplyHeaderView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;
import p004OooO0oO.o0OoOo0;
import p405o0Oo0OOO.oOOO00;
import p415o0Oo0oO0.o00Ooo;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;
import p650o0ooo.d3;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyHeaderView f49651OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(MomentReplyHeaderView momentReplyHeaderView) {
        super(0);
        this.f49651OooO0Oo = momentReplyHeaderView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentReplyHeaderView momentReplyHeaderView = this.f49651OooO0Oo;
        MomentCommentDetailModel momentCommentDetailModel = momentReplyHeaderView.f26004OooO0oo;
        if (momentCommentDetailModel != null) {
            OooO00o.OooO0O0("103047");
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (Intrinsics.areEqual(o0OoOo0.OooO00o(), momentCommentDetailModel.getUserid())) {
                o000O00.OooO0O0(o0000.OooO0OO(o000000.send_reward_self));
            } else if (o00Ooo.OooO().OooOO0o()) {
                oOOO00 oooo00 = momentReplyHeaderView.f26002OooO0o0;
                SVGAView rewardSvga = oooo00.f45136OooOOOO;
                Intrinsics.checkNotNullExpressionValue(rewardSvga, "rewardSvga");
                TextView rewardCount = oooo00.f45135OooOOO0;
                Intrinsics.checkNotNullExpressionValue(rewardCount, "rewardCount");
                momentReplyHeaderView.OooO0Oo(momentCommentDetailModel, rewardSvga, rewardCount);
            } else {
                d3.OooO00o(momentReplyHeaderView.getActivity(), new j(momentReplyHeaderView, momentCommentDetailModel));
            }
        }
        return Unit.INSTANCE;
    }
}
