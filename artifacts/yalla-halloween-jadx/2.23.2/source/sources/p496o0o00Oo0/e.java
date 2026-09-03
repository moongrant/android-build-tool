package p496o0o00Oo0;

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
import p405o0Oo0OOO.oOOO00;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p590o0oOooo0.z0;
import p605o0oo0O0O.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends Lambda implements Function1<PraiseCommentResultModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyHeaderView f49643OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentCommentDetailModel f49644OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(MomentReplyHeaderView momentReplyHeaderView, MomentCommentDetailModel momentCommentDetailModel) {
        super(1);
        this.f49643OooO0Oo = momentReplyHeaderView;
        this.f49644OooO0o0 = momentCommentDetailModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(PraiseCommentResultModel praiseCommentResultModel) {
        PraiseCommentResultModel praiseCommentResultModel2 = praiseCommentResultModel;
        MomentReplyHeaderView momentReplyHeaderView = this.f49643OooO0Oo;
        MomentDetailModel currentMomentDetail = momentReplyHeaderView.getActivity().OooOoO().getCurrentMomentDetail();
        if (currentMomentDetail != null) {
            boolean z = String.valueOf(currentMomentDetail.getUserId()).length() > 0;
            MomentCommentDetailModel momentCommentDetailModel = this.f49644OooO0o0;
            if (z) {
                MomentLogActionTypeCommentPraise momentLogActionTypeCommentPraise = new MomentLogActionTypeCommentPraise(null, null, null, 7, null);
                momentLogActionTypeCommentPraise.setObject_userid(String.valueOf(currentMomentDetail.getUserId()));
                momentLogActionTypeCommentPraise.setDiscoveryid(o0OoOo0.OooOOO0("", Long.valueOf(currentMomentDetail.getId())));
                momentLogActionTypeCommentPraise.setComment_id(o0OoOo0.OooOOO0("", Long.valueOf(momentCommentDetailModel.getId())));
                WebEventRepository webEventRepository = WebEventRepository.f24430OooO00o;
                MomentLogActionType momentLogActionType = MomentLogActionType.comment_praise;
                String json = momentLogActionTypeCommentPraise.toJson();
                String sessionId = currentMomentDetail.getSessionId();
                webEventRepository.getClass();
                WebEventRepository.OooO0o0(momentLogActionType, json, sessionId);
            }
            boolean zIsPraise = momentCommentDetailModel.isPraise();
            oOOO00 oooo00 = momentReplyHeaderView.f26002OooO0o0;
            if (zIsPraise) {
                oooo00.f45131OooOO0.setImageResource(o0Oo0oo.ic_moment_comment_praise_gray);
            } else {
                SVGAView sVGAView = oooo00.f45132OooOO0O;
                z0 z0Var = z0.f57313OooO00o;
                sVGAView.OooOO0O(z0.OooO0o(), momentReplyHeaderView.getActivity());
                oooo00.f45132OooOO0O.OooOO0o();
            }
            momentCommentDetailModel.setPraise(!momentCommentDetailModel.isPraise());
            momentCommentDetailModel.setPraiseNum(praiseCommentResultModel2 != null ? praiseCommentResultModel2.getNum() : 0L);
            oooo00.f45122OooO.setText(o0O0O0Oo.OooO0o(momentCommentDetailModel.getPraiseNum(), false));
            boolean zIsPraise2 = momentCommentDetailModel.isPraise();
            TextView textView = oooo00.f45122OooO;
            if (zIsPraise2) {
                textView.setTextColor(o0000.OooO00o(o0OOO0o.color_FE6C6C));
            } else {
                textView.setTextColor(o0000.OooO00o(o0OOO0o.color_54000000));
            }
        }
        return Unit.INSTANCE;
    }
}
