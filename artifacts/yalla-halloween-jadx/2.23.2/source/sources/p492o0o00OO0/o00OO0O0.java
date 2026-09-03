package p492o0o00OO0;

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
import p522o0o0O0oO.oO00000o;
import p522o0o0O0oO.oO000O0;
import p583o0oOoo00.oo0o0Oo;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO0O0 extends Lambda implements Function1<MomentCommentResultModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO00000o f49173OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentReplyActivity f49174OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentSendCommentModel f49175OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO0O0(oO00000o oo00000o, MomentSendCommentModel momentSendCommentModel, MomentReplyActivity momentReplyActivity) {
        super(1);
        this.f49173OooO0Oo = oo00000o;
        this.f49175OooO0o0 = momentSendCommentModel;
        this.f49174OooO0o = momentReplyActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MomentCommentResultModel momentCommentResultModel) {
        MomentCommentResultModel result = momentCommentResultModel;
        Intrinsics.checkNotNullParameter(result, "result");
        this.f49173OooO0Oo.OooO0O0();
        HashMap<String, oO000O0> map = oo0o0Oo.f56691OooO00o;
        MomentSendCommentModel momentSendCommentModel = this.f49175OooO0o0;
        oo0o0Oo.OooO0O0(Long.valueOf(o0OoOo0.OooO(0L, momentSendCommentModel.getDyid())), Long.valueOf(o0OoOo0.OooO(0L, momentSendCommentModel.getCid())), Long.valueOf(momentSendCommentModel.getLocalParentCid()), new oO000O0(0));
        MomentReplyActivity momentReplyActivity = this.f49174OooO0o;
        if (momentReplyActivity.OooOoO().getCurrentReply() != null) {
            o0000O00.OooO0O0("WRM 添加 二级回复 ");
            MomentReplyModel momentReplyModel = new MomentReplyModel();
            momentReplyModel.setLocalReplySonResultModel(result, momentSendCommentModel);
            MomentCommentDetailModel currentComment = momentReplyActivity.OooOoO().getCurrentComment();
            if (currentComment != null) {
                currentComment.replyAdd(momentReplyModel);
            }
            if (momentReplyActivity.OooOo().f13189OooOOoo.isEmpty()) {
                momentReplyActivity.OooOo().f13189OooOOoo.add(momentReplyModel);
            } else {
                momentReplyActivity.OooOo().f13189OooOOoo.add(0, momentReplyModel);
            }
            OooOOO.OooO0OO(LifecycleOwnerKt.getLifecycleScope(momentReplyActivity), new o00OO000(momentReplyActivity, null));
        } else {
            if (momentReplyActivity.OooOoO().getCurrentComment() != null) {
                o0000O00.OooO0O0("WRM 添加 回复 ");
                MomentReplyModel momentReplyModel2 = new MomentReplyModel();
                momentReplyModel2.setLocalReplyResultModel(result, momentSendCommentModel);
                MomentCommentDetailModel currentComment2 = momentReplyActivity.OooOoO().getCurrentComment();
                if (currentComment2 != null) {
                    currentComment2.replyAdd(momentReplyModel2);
                }
                if (momentReplyActivity.OooOo().f13189OooOOoo.isEmpty()) {
                    momentReplyActivity.OooOo().f13189OooOOoo.add(momentReplyModel2);
                } else {
                    momentReplyActivity.OooOo().f13189OooOOoo.add(0, momentReplyModel2);
                }
                OooOOO.OooO0OO(LifecycleOwnerKt.getLifecycleScope(momentReplyActivity), new o00OO00O(momentReplyActivity, null));
            } else {
                if (momentSendCommentModel.getDyid().length() > 0) {
                    o0000O00.OooO0O0("WRM 添加 评论 ");
                    new MomentCommentDetailModel().setLocalCommentResultModel(result);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
