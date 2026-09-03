package p563o0oOo0;

import com.yalla.yalla.model.PostCommentDetailModel;
import com.yalla.yalla.model.ReportCommentDetailModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000oo extends Lambda implements Function1<ReportCommentDetailModel, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Function1<PostCommentDetailModel, Unit> f45024Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0000oo(Function1<? super PostCommentDetailModel, Unit> function1) {
        super(1);
        this.f45024Oooo0o = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ReportCommentDetailModel reportCommentDetailModel) {
        ReportCommentDetailModel reportCommentDetailModel2 = reportCommentDetailModel;
        if (reportCommentDetailModel2 != null) {
            PostCommentDetailModel postCommentDetailModel = new PostCommentDetailModel();
            postCommentDetailModel.setLoadPostCommentDetailModel(reportCommentDetailModel2.getId(), String.valueOf(reportCommentDetailModel2.getUserid()), reportCommentDetailModel2.getNickname(), reportCommentDetailModel2.getHeadurl(), reportCommentDetailModel2.getContent(), reportCommentDetailModel2.getCreateTime(), true);
            this.f45024Oooo0o.invoke(postCommentDetailModel);
        }
        return Unit.INSTANCE;
    }
}
