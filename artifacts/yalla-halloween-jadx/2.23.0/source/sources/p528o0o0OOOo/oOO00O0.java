package p528o0o0OOOo;

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
import p402o0Oo0OOO.o000O;
import p534o0o0Oo00.OooOOOO;
import p534o0o0Oo00.o000oOoO;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO00O0 extends Lambda implements Function1<MomentCommentResultModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOOOO f54129OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f54130OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentSendCommentModel f54131OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MomentReplyVM f54132OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MomentCommentsVM f54133OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO00O0(OooOOOO oooOOOO, MomentSendCommentModel momentSendCommentModel, MomentVideoVM momentVideoVM, MomentReplyVM momentReplyVM, MomentCommentsVM momentCommentsVM) {
        super(1);
        this.f54129OooO0Oo = oooOOOO;
        this.f54131OooO0o0 = momentSendCommentModel;
        this.f54130OooO0o = momentVideoVM;
        this.f54132OooO0oO = momentReplyVM;
        this.f54133OooO0oo = momentCommentsVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MomentCommentResultModel momentCommentResultModel) {
        MomentCommentResultModel result = momentCommentResultModel;
        Intrinsics.checkNotNullParameter(result, "result");
        this.f54129OooO0Oo.OooO0O0();
        HashMap<String, o000oOoO> map = o000O.f44463OooO00o;
        MomentSendCommentModel momentSendCommentModel = this.f54131OooO0o0;
        o000O.OooO0O0(Long.valueOf(o0OoOo0.OooO(0L, momentSendCommentModel.getDyid())), Long.valueOf(o0OoOo0.OooO(0L, momentSendCommentModel.getCid())), Long.valueOf(momentSendCommentModel.getLocalParentCid()), new o000oOoO(0));
        MomentVideoVM momentVideoVM = this.f54130OooO0o;
        boolean z = momentVideoVM.getCurrentReply() != null;
        MomentReplyVM momentReplyVM = this.f54132OooO0oO;
        if (z) {
            OooOOO0.OooO0O0("WRM 添加 二级回复 ");
            MomentReplyModel momentReplyModel = new MomentReplyModel();
            momentReplyModel.setLocalReplySonResultModel(result, momentSendCommentModel);
            MomentCommentDetailModel currentComment = momentVideoVM.getCurrentComment();
            if (currentComment != null) {
                currentComment.replyAdd(momentReplyModel);
            }
            momentReplyVM.addReply(momentReplyModel);
        } else {
            if (momentVideoVM.getCurrentComment() != null) {
                OooOOO0.OooO0O0("WRM 添加 回复 ");
                MomentReplyModel momentReplyModel2 = new MomentReplyModel();
                momentReplyModel2.setLocalReplyResultModel(result, momentSendCommentModel);
                MomentCommentDetailModel currentComment2 = momentVideoVM.getCurrentComment();
                if (currentComment2 != null) {
                    currentComment2.replyAdd(momentReplyModel2);
                }
                momentReplyVM.addReply(momentReplyModel2);
            } else {
                if (momentSendCommentModel.getDyid().length() > 0) {
                    OooOOO0.OooO0O0("WRM 添加 评论 ");
                    MomentCommentDetailModel momentCommentDetailModel = new MomentCommentDetailModel();
                    momentCommentDetailModel.setLocalCommentResultModel(result);
                    this.f54133OooO0oo.addComment(momentCommentDetailModel);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
