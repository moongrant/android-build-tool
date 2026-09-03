package p485o0o00O0;

import androidx.lifecycle.LifecycleOwnerKt;
import com.code.android.util.OooOOO;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.model.moment.MomentCommentResultModel;
import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.model.moment.MomentSendCommentModel;
import com.yalla.yalla.ui.activity.moment.MomentReplyActivity;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p402o0Oo0OOO.o000O;
import p534o0o0Oo00.OooOOOO;
import p534o0o0Oo00.o000oOoO;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOO00 extends Lambda implements Function1<MomentCommentResultModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOOOO f47855OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentReplyActivity f47856OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentSendCommentModel f47857OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO00(OooOOOO oooOOOO, MomentSendCommentModel momentSendCommentModel, MomentReplyActivity momentReplyActivity) {
        super(1);
        this.f47855OooO0Oo = oooOOOO;
        this.f47857OooO0o0 = momentSendCommentModel;
        this.f47856OooO0o = momentReplyActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MomentCommentResultModel momentCommentResultModel) {
        MomentCommentResultModel result = momentCommentResultModel;
        Intrinsics.checkNotNullParameter(result, "result");
        this.f47855OooO0Oo.OooO0O0();
        HashMap<String, o000oOoO> map = o000O.f44463OooO00o;
        MomentSendCommentModel momentSendCommentModel = this.f47857OooO0o0;
        o000O.OooO0O0(Long.valueOf(o0OoOo0.OooO(0L, momentSendCommentModel.getDyid())), Long.valueOf(o0OoOo0.OooO(0L, momentSendCommentModel.getCid())), Long.valueOf(momentSendCommentModel.getLocalParentCid()), new o000oOoO(0));
        MomentReplyActivity momentReplyActivity = this.f47856OooO0o;
        if (momentReplyActivity.OooOoO().getCurrentReply() != null) {
            OooOOO0.OooO0O0("WRM 添加 二级回复 ");
            MomentReplyModel momentReplyModel = new MomentReplyModel();
            momentReplyModel.setLocalReplySonResultModel(result, momentSendCommentModel);
            MomentCommentDetailModel currentComment = momentReplyActivity.OooOoO().getCurrentComment();
            if (currentComment != null) {
                currentComment.replyAdd(momentReplyModel);
            }
            if (momentReplyActivity.OooOo().f10111OooOOoo.isEmpty()) {
                momentReplyActivity.OooOo().f10111OooOOoo.add(momentReplyModel);
            } else {
                momentReplyActivity.OooOo().f10111OooOOoo.add(0, momentReplyModel);
            }
            OooOOO.OooO0OO(LifecycleOwnerKt.getLifecycleScope(momentReplyActivity), new oo0O(momentReplyActivity, null));
        } else {
            if (momentReplyActivity.OooOoO().getCurrentComment() != null) {
                OooOOO0.OooO0O0("WRM 添加 回复 ");
                MomentReplyModel momentReplyModel2 = new MomentReplyModel();
                momentReplyModel2.setLocalReplyResultModel(result, momentSendCommentModel);
                MomentCommentDetailModel currentComment2 = momentReplyActivity.OooOoO().getCurrentComment();
                if (currentComment2 != null) {
                    currentComment2.replyAdd(momentReplyModel2);
                }
                if (momentReplyActivity.OooOo().f10111OooOOoo.isEmpty()) {
                    momentReplyActivity.OooOo().f10111OooOOoo.add(momentReplyModel2);
                } else {
                    momentReplyActivity.OooOo().f10111OooOOoo.add(0, momentReplyModel2);
                }
                OooOOO.OooO0OO(LifecycleOwnerKt.getLifecycleScope(momentReplyActivity), new o00OO(momentReplyActivity, null));
            } else {
                if (momentSendCommentModel.getDyid().length() > 0) {
                    OooOOO0.OooO0O0("WRM 添加 评论 ");
                    new MomentCommentDetailModel().setLocalCommentResultModel(result);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
