package p535o0o0Oo0;

import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.model.moment.MomentCommentResultModel;
import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.model.moment.MomentSendCommentModel;
import com.yalla.yalla.ui.vm.moment.MomentCommentsVM;
import com.yalla.yalla.ui.vm.moment.MomentReplyVM;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
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
public final class oO0 extends Lambda implements Function1<MomentCommentResultModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO00000o f53844OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f53845OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentSendCommentModel f53846OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MomentReplyVM f53847OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MomentCommentsVM f53848OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0(oO00000o oo00000o, MomentSendCommentModel momentSendCommentModel, MomentVideoVM momentVideoVM, MomentReplyVM momentReplyVM, MomentCommentsVM momentCommentsVM) {
        super(1);
        this.f53844OooO0Oo = oo00000o;
        this.f53846OooO0o0 = momentSendCommentModel;
        this.f53845OooO0o = momentVideoVM;
        this.f53847OooO0oO = momentReplyVM;
        this.f53848OooO0oo = momentCommentsVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MomentCommentResultModel momentCommentResultModel) {
        MomentCommentResultModel result = momentCommentResultModel;
        Intrinsics.checkNotNullParameter(result, "result");
        this.f53844OooO0Oo.OooO0O0();
        HashMap<String, oO000O0> map = oo0o0Oo.f56691OooO00o;
        MomentSendCommentModel momentSendCommentModel = this.f53846OooO0o0;
        oo0o0Oo.OooO0O0(Long.valueOf(o0OoOo0.OooO(0L, momentSendCommentModel.getDyid())), Long.valueOf(o0OoOo0.OooO(0L, momentSendCommentModel.getCid())), Long.valueOf(momentSendCommentModel.getLocalParentCid()), new oO000O0(0));
        MomentVideoVM momentVideoVM = this.f53845OooO0o;
        boolean z = momentVideoVM.getCurrentReply() != null;
        MomentReplyVM momentReplyVM = this.f53847OooO0oO;
        if (z) {
            o0000O00.OooO0O0("WRM 添加 二级回复 ");
            MomentReplyModel momentReplyModel = new MomentReplyModel();
            momentReplyModel.setLocalReplySonResultModel(result, momentSendCommentModel);
            MomentCommentDetailModel currentComment = momentVideoVM.getCurrentComment();
            if (currentComment != null) {
                currentComment.replyAdd(momentReplyModel);
            }
            momentReplyVM.addReply(momentReplyModel);
        } else {
            if (momentVideoVM.getCurrentComment() != null) {
                o0000O00.OooO0O0("WRM 添加 回复 ");
                MomentReplyModel momentReplyModel2 = new MomentReplyModel();
                momentReplyModel2.setLocalReplyResultModel(result, momentSendCommentModel);
                MomentCommentDetailModel currentComment2 = momentVideoVM.getCurrentComment();
                if (currentComment2 != null) {
                    currentComment2.replyAdd(momentReplyModel2);
                }
                momentReplyVM.addReply(momentReplyModel2);
            } else {
                if (momentSendCommentModel.getDyid().length() > 0) {
                    o0000O00.OooO0O0("WRM 添加 评论 ");
                    MomentCommentDetailModel momentCommentDetailModel = new MomentCommentDetailModel();
                    momentCommentDetailModel.setLocalCommentResultModel(result);
                    this.f53848OooO0oo.addComment(momentCommentDetailModel);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
