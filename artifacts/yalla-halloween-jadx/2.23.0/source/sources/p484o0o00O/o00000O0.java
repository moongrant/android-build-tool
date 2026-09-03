package p484o0o00O;

import android.widget.TextView;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.MomentLogActionType;
import com.yalla.yalla.model.MomentLogActionTypeCommentPraise;
import com.yalla.yalla.model.PraiseCommentResultModel;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.repository.WebEventRepository;
import com.yalla.yalla.ui.activity.moment.postDetailCommentSonList.MomentReplyHeaderView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p579o0oOoo.oOOOOo0O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oOo00OO0;
import p590o0oo0.OooOOOO;
import p641o0ooOOOO.w6;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000O0 extends Lambda implements Function1<PraiseCommentResultModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyHeaderView f47721OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentCommentDetailModel f47722OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O0(MomentReplyHeaderView momentReplyHeaderView, MomentCommentDetailModel momentCommentDetailModel) {
        super(1);
        this.f47721OooO0Oo = momentReplyHeaderView;
        this.f47722OooO0o0 = momentCommentDetailModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(PraiseCommentResultModel praiseCommentResultModel) {
        PraiseCommentResultModel praiseCommentResultModel2 = praiseCommentResultModel;
        MomentReplyHeaderView momentReplyHeaderView = this.f47721OooO0Oo;
        MomentDetailModel currentMomentDetail = momentReplyHeaderView.getActivity().OooOoO().getCurrentMomentDetail();
        if (currentMomentDetail != null) {
            boolean z = String.valueOf(currentMomentDetail.getUserId()).length() > 0;
            MomentCommentDetailModel momentCommentDetailModel = this.f47722OooO0o0;
            if (z) {
                MomentLogActionTypeCommentPraise momentLogActionTypeCommentPraise = new MomentLogActionTypeCommentPraise(null, null, null, 7, null);
                momentLogActionTypeCommentPraise.setObject_userid(String.valueOf(currentMomentDetail.getUserId()));
                momentLogActionTypeCommentPraise.setDiscoveryid(o0OoOo0.OooOOO0("", Long.valueOf(currentMomentDetail.getId())));
                momentLogActionTypeCommentPraise.setComment_id(o0OoOo0.OooOOO0("", Long.valueOf(momentCommentDetailModel.getId())));
                WebEventRepository webEventRepository = WebEventRepository.f24891OooO00o;
                MomentLogActionType momentLogActionType = MomentLogActionType.comment_praise;
                String json = momentLogActionTypeCommentPraise.toJson();
                String sessionId = currentMomentDetail.getSessionId();
                webEventRepository.getClass();
                WebEventRepository.OooO0o0(momentLogActionType, json, sessionId);
            }
            boolean zIsPraise = momentCommentDetailModel.isPraise();
            w6 w6Var = momentReplyHeaderView.f26454OooO0o0;
            if (zIsPraise) {
                w6Var.f59162OooOO0.setImageResource(oOo00OO0.ic_moment_comment_praise_gray);
            } else {
                SVGAView sVGAView = w6Var.f59163OooOO0O;
                oOOOOo0O oooooo0o = oOOOOo0O.f56683OooO00o;
                sVGAView.OooOO0O(oOOOOo0O.OooO0o(), momentReplyHeaderView.getActivity());
                w6Var.f59163OooOO0O.OooOO0o();
            }
            momentCommentDetailModel.setPraise(!momentCommentDetailModel.isPraise());
            momentCommentDetailModel.setPraiseNum(praiseCommentResultModel2 != null ? praiseCommentResultModel2.getNum() : 0L);
            w6Var.f59153OooO.setText(OooOOOO.OooO0o(momentCommentDetailModel.getPraiseNum(), false));
            boolean zIsPraise2 = momentCommentDetailModel.isPraise();
            TextView textView = w6Var.f59153OooO;
            if (zIsPraise2) {
                textView.setTextColor(o0000.OooO00o(oO00O0o.color_FE6C6C));
            } else {
                textView.setTextColor(o0000.OooO00o(oO00O0o.color_54000000));
            }
        }
        return Unit.INSTANCE;
    }
}
