package p492o0o00OO0;

import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentSendCommentModel;
import com.yalla.yalla.ui.activity.moment.MomentReplyActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p187o00o00o0.OooO;
import p522o0o0O0oO.oO00000o;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0OOO extends Lambda implements Function1<oO00000o, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyActivity f49169OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OOO(MomentReplyActivity momentReplyActivity) {
        super(1);
        this.f49169OooO0Oo = momentReplyActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(oO00000o oo00000o) {
        oO00000o it = oo00000o;
        Intrinsics.checkNotNullParameter(it, "it");
        int i = MomentReplyActivity.f25700OooOoO;
        MomentReplyActivity momentReplyActivity = this.f49169OooO0Oo;
        MomentDetailModel currentMomentDetail = momentReplyActivity.OooOoO().getCurrentMomentDetail();
        if (currentMomentDetail != null) {
            MomentSendCommentModel momentSendCommentModelInitSendContent = MomentSendCommentModel.INSTANCE.initSendContent(currentMomentDetail, momentReplyActivity.OooOoO().getCurrentComment(), momentReplyActivity.OooOoO().getCurrentReply(), momentReplyActivity.OooOoO().getReplyUserInfo(), it.OooO0OO());
            MomentDetailModel currentMomentDetail2 = momentReplyActivity.OooOoO().getCurrentMomentDetail();
            Long lValueOf = currentMomentDetail2 != null ? Long.valueOf(currentMomentDetail2.getId()) : null;
            o0000O00.OooO("WRM 添加 \n\t currentMomentDetailId = " + lValueOf + " \n\t currentCommentId = " + momentReplyActivity.OooOoO().getCurrentCommentId() + " \n\t currentReplyId = " + momentReplyActivity.OooOoO().getCurrentReplyId() + " \n sendCommentOrReply sendModel = " + OooO.OooO00o(momentSendCommentModelInitSendContent));
            momentReplyActivity.OooOoO().sendCommentOrReply(momentSendCommentModelInitSendContent, new o00OO0O0(it, momentSendCommentModelInitSendContent, momentReplyActivity));
        }
        return Unit.INSTANCE;
    }
}
