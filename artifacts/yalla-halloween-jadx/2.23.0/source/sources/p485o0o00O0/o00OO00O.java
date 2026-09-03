package p485o0o00O0;

import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentSendCommentModel;
import com.yalla.yalla.ui.activity.moment.MomentReplyActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p140o00OOooo.OooOO0;
import p534o0o0Oo00.OooOOOO;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO00O extends Lambda implements Function1<OooOOOO, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyActivity f47850OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO00O(MomentReplyActivity momentReplyActivity) {
        super(1);
        this.f47850OooO0Oo = momentReplyActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(OooOOOO oooOOOO) {
        OooOOOO it = oooOOOO;
        Intrinsics.checkNotNullParameter(it, "it");
        int i = MomentReplyActivity.f26149OooOoO;
        MomentReplyActivity momentReplyActivity = this.f47850OooO0Oo;
        MomentDetailModel currentMomentDetail = momentReplyActivity.OooOoO().getCurrentMomentDetail();
        if (currentMomentDetail != null) {
            MomentSendCommentModel momentSendCommentModelInitSendContent = MomentSendCommentModel.INSTANCE.initSendContent(currentMomentDetail, momentReplyActivity.OooOoO().getCurrentComment(), momentReplyActivity.OooOoO().getCurrentReply(), momentReplyActivity.OooOoO().getReplyUserInfo(), it.OooO0OO());
            MomentDetailModel currentMomentDetail2 = momentReplyActivity.OooOoO().getCurrentMomentDetail();
            Long lValueOf = currentMomentDetail2 != null ? Long.valueOf(currentMomentDetail2.getId()) : null;
            OooOOO0.OooO("WRM 添加 \n\t currentMomentDetailId = " + lValueOf + " \n\t currentCommentId = " + momentReplyActivity.OooOoO().getCurrentCommentId() + " \n\t currentReplyId = " + momentReplyActivity.OooOoO().getCurrentReplyId() + " \n sendCommentOrReply sendModel = " + OooOO0.OooO00o(momentSendCommentModelInitSendContent));
            momentReplyActivity.OooOoO().sendCommentOrReply(momentSendCommentModelInitSendContent, new o00OOO00(it, momentSendCommentModelInitSendContent, momentReplyActivity));
        }
        return Unit.INSTANCE;
    }
}
