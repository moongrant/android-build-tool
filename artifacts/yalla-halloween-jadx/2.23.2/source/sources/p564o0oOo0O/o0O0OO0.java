package p564o0oOo0O;

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
import p405o0Oo0OOO.oOOO00Oo;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p590o0oOooo0.z0;
import p605o0oo0O0O.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0OO0 extends Lambda implements Function1<PraiseCommentResultModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyActivity f56342OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentReplyItemView f56343OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentReplyModel f56344OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OO0(MomentReplyActivity momentReplyActivity, MomentReplyModel momentReplyModel, MomentReplyItemView momentReplyItemView) {
        super(1);
        this.f56342OooO0Oo = momentReplyActivity;
        this.f56344OooO0o0 = momentReplyModel;
        this.f56343OooO0o = momentReplyItemView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(PraiseCommentResultModel praiseCommentResultModel) {
        PraiseCommentResultModel praiseCommentResultModel2 = praiseCommentResultModel;
        MomentReplyActivity momentReplyActivity = this.f56342OooO0Oo;
        MomentDetailModel currentMomentDetail = momentReplyActivity.OooOoO().getCurrentMomentDetail();
        if (currentMomentDetail != null) {
            boolean z = String.valueOf(currentMomentDetail.getUserId()).length() > 0;
            MomentReplyModel momentReplyModel = this.f56344OooO0o0;
            if (z) {
                MomentLogActionTypeCommentPraise momentLogActionTypeCommentPraise = new MomentLogActionTypeCommentPraise(null, null, null, 7, null);
                momentLogActionTypeCommentPraise.setObject_userid(String.valueOf(currentMomentDetail.getUserId()));
                momentLogActionTypeCommentPraise.setDiscoveryid(o0OoOo0.OooOOO0("", Long.valueOf(currentMomentDetail.getId())));
                momentLogActionTypeCommentPraise.setComment_id(o0OoOo0.OooOOO0("", Long.valueOf(momentReplyModel.getId())));
                WebEventRepository webEventRepository = WebEventRepository.f24430OooO00o;
                MomentLogActionType momentLogActionType = MomentLogActionType.comment_praise;
                String json = momentLogActionTypeCommentPraise.toJson();
                String sessionId = currentMomentDetail.getSessionId();
                webEventRepository.getClass();
                WebEventRepository.OooO0o0(momentLogActionType, json, sessionId);
            }
            boolean zIsPraise = momentReplyModel.isPraise();
            MomentReplyItemView momentReplyItemView = this.f56343OooO0o;
            if (zIsPraise) {
                momentReplyItemView.f30590OooO0Oo.f45147OooO0o.setImageResource(o0Oo0oo.ic_moment_comment_praise_gray);
            } else {
                SVGAView sVGAView = momentReplyItemView.f30590OooO0Oo.f45149OooO0oO;
                z0 z0Var = z0.f57313OooO00o;
                sVGAView.OooOO0O(z0.OooO0o(), momentReplyActivity);
                momentReplyItemView.f30590OooO0Oo.f45149OooO0oO.OooOO0o();
            }
            momentReplyModel.setPraise(!momentReplyModel.isPraise());
            momentReplyModel.setPraiseNum(praiseCommentResultModel2 != null ? praiseCommentResultModel2.getNum() : 0L);
            momentReplyItemView.f30590OooO0Oo.f45148OooO0o0.setText(o0O0O0Oo.OooO0o(momentReplyModel.getPraiseNum(), false));
            boolean zIsPraise2 = momentReplyModel.isPraise();
            oOOO00Oo oooo00oo = momentReplyItemView.f30590OooO0Oo;
            if (zIsPraise2) {
                oooo00oo.f45148OooO0o0.setTextColor(o0000.OooO00o(o0OOO0o.color_333333));
            } else {
                oooo00oo.f45148OooO0o0.setTextColor(o0000.OooO00o(o0OOO0o.color_333333_65));
            }
        }
        return Unit.INSTANCE;
    }
}
