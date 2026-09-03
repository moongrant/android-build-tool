package p556o0oOOooo;

import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.MomentLogActionType;
import com.yalla.yalla.model.MomentLogActionTypeCommentPraise;
import com.yalla.yalla.model.PraiseCommentResultModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.repository.WebEventRepository;
import com.yalla.yalla.ui.activity.moment.MomentReplyActivity;
import com.yalla.yalla.ui.view.moment.MomentReplyItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p579o0oOoo.oOOOOo0O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oOo00OO0;
import p590o0oo0.OooOOOO;
import p641o0ooOOOO.x6;

/* JADX INFO: loaded from: classes5.dex */
public final class oOOoOOO0 extends Lambda implements Function1<PraiseCommentResultModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyActivity f56144OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentReplyItemView f56145OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentReplyModel f56146OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOoOOO0(MomentReplyActivity momentReplyActivity, MomentReplyModel momentReplyModel, MomentReplyItemView momentReplyItemView) {
        super(1);
        this.f56144OooO0Oo = momentReplyActivity;
        this.f56146OooO0o0 = momentReplyModel;
        this.f56145OooO0o = momentReplyItemView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(PraiseCommentResultModel praiseCommentResultModel) {
        PraiseCommentResultModel praiseCommentResultModel2 = praiseCommentResultModel;
        MomentReplyActivity momentReplyActivity = this.f56144OooO0Oo;
        MomentDetailModel currentMomentDetail = momentReplyActivity.OooOoO().getCurrentMomentDetail();
        if (currentMomentDetail != null) {
            boolean z = String.valueOf(currentMomentDetail.getUserId()).length() > 0;
            MomentReplyModel momentReplyModel = this.f56146OooO0o0;
            if (z) {
                MomentLogActionTypeCommentPraise momentLogActionTypeCommentPraise = new MomentLogActionTypeCommentPraise(null, null, null, 7, null);
                momentLogActionTypeCommentPraise.setObject_userid(String.valueOf(currentMomentDetail.getUserId()));
                momentLogActionTypeCommentPraise.setDiscoveryid(o0OoOo0.OooOOO0("", Long.valueOf(currentMomentDetail.getId())));
                momentLogActionTypeCommentPraise.setComment_id(o0OoOo0.OooOOO0("", Long.valueOf(momentReplyModel.getId())));
                WebEventRepository webEventRepository = WebEventRepository.f24891OooO00o;
                MomentLogActionType momentLogActionType = MomentLogActionType.comment_praise;
                String json = momentLogActionTypeCommentPraise.toJson();
                String sessionId = currentMomentDetail.getSessionId();
                webEventRepository.getClass();
                WebEventRepository.OooO0o0(momentLogActionType, json, sessionId);
            }
            boolean zIsPraise = momentReplyModel.isPraise();
            MomentReplyItemView momentReplyItemView = this.f56145OooO0o;
            if (zIsPraise) {
                momentReplyItemView.f31131OooO0Oo.f59281OooO0o.setImageResource(oOo00OO0.ic_moment_comment_praise_gray);
            } else {
                SVGAView sVGAView = momentReplyItemView.f31131OooO0Oo.f59283OooO0oO;
                oOOOOo0O oooooo0o = oOOOOo0O.f56683OooO00o;
                sVGAView.OooOO0O(oOOOOo0O.OooO0o(), momentReplyActivity);
                momentReplyItemView.f31131OooO0Oo.f59283OooO0oO.OooOO0o();
            }
            momentReplyModel.setPraise(!momentReplyModel.isPraise());
            momentReplyModel.setPraiseNum(praiseCommentResultModel2 != null ? praiseCommentResultModel2.getNum() : 0L);
            momentReplyItemView.f31131OooO0Oo.f59282OooO0o0.setText(OooOOOO.OooO0o(momentReplyModel.getPraiseNum(), false));
            boolean zIsPraise2 = momentReplyModel.isPraise();
            x6 x6Var = momentReplyItemView.f31131OooO0Oo;
            if (zIsPraise2) {
                x6Var.f59282OooO0o0.setTextColor(o0000.OooO00o(oO00O0o.color_333333));
            } else {
                x6Var.f59282OooO0o0.setTextColor(o0000.OooO00o(oO00O0o.color_333333_65));
            }
        }
        return Unit.INSTANCE;
    }
}
