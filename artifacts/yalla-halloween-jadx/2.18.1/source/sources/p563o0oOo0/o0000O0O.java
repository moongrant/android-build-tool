package p563o0oOo0;

import com.yalla.yalla.common.db.table.MomentMessage;
import com.yalla.yalla.model.PostCommentDetailModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000O0O extends Lambda implements Function1<PostCommentDetailModel, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0000O00.OooO0O0 f45017Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ MomentMessage f45018Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O0O(o0000O00.OooO0O0 oooO0O0, MomentMessage momentMessage) {
        super(1);
        this.f45017Oooo0o = oooO0O0;
        this.f45018Oooo0oO = momentMessage;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(PostCommentDetailModel postCommentDetailModel) {
        PostCommentDetailModel it = postCommentDetailModel;
        Intrinsics.checkNotNullParameter(it, "it");
        o0000O00.OooO0O0 oooO0O0 = this.f45017Oooo0o;
        MomentMessage.CommentReportFeedback commentReportFeedback = this.f45018Oooo0oO.getCommentReportFeedback();
        Long momentId = commentReportFeedback != null ? commentReportFeedback.getMomentId() : null;
        MomentMessage.CommentReportFeedback commentReportFeedback2 = this.f45018Oooo0oO.getCommentReportFeedback();
        oooO0O0.OooO00o(momentId, commentReportFeedback2 != null ? commentReportFeedback2.getCommentId() : null, it);
        return Unit.INSTANCE;
    }
}
