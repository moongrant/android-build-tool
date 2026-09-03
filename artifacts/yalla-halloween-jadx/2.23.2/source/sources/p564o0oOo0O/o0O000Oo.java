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
import com.yalla.yalla.ui.fragment.moment.MomentDetailCommentFragment;
import com.yalla.yalla.ui.view.moment.MomentDetailCommentItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p590o0oOooo0.z0;
import p605o0oo0O0O.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O000Oo extends Lambda implements Function1<PraiseCommentResultModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailCommentFragment f56326OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentDetailCommentItemView f56327OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentReplyModel f56328OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000Oo(MomentDetailCommentFragment momentDetailCommentFragment, MomentReplyModel momentReplyModel, MomentDetailCommentItemView momentDetailCommentItemView) {
        super(1);
        this.f56326OooO0Oo = momentDetailCommentFragment;
        this.f56328OooO0o0 = momentReplyModel;
        this.f56327OooO0o = momentDetailCommentItemView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(PraiseCommentResultModel praiseCommentResultModel) {
        PraiseCommentResultModel praiseCommentResultModel2 = praiseCommentResultModel;
        MomentDetailCommentFragment momentDetailCommentFragment = this.f56326OooO0Oo;
        MomentDetailModel mPostDetailModel = momentDetailCommentFragment.getMPostDetailModel();
        if (mPostDetailModel != null) {
            boolean z = String.valueOf(mPostDetailModel.getUserId()).length() > 0;
            MomentReplyModel momentReplyModel = this.f56328OooO0o0;
            if (z) {
                MomentLogActionTypeCommentPraise momentLogActionTypeCommentPraise = new MomentLogActionTypeCommentPraise(null, null, null, 7, null);
                momentLogActionTypeCommentPraise.setObject_userid(String.valueOf(mPostDetailModel.getUserId()));
                momentLogActionTypeCommentPraise.setDiscoveryid(o0OoOo0.OooOOO0("", Long.valueOf(mPostDetailModel.getId())));
                momentLogActionTypeCommentPraise.setComment_id(o0OoOo0.OooOOO0("", Long.valueOf(momentReplyModel.getId())));
                WebEventRepository webEventRepository = WebEventRepository.f24430OooO00o;
                MomentLogActionType momentLogActionType = MomentLogActionType.comment_praise;
                String json = momentLogActionTypeCommentPraise.toJson();
                String sessionId = mPostDetailModel.getSessionId();
                webEventRepository.getClass();
                WebEventRepository.OooO0o0(momentLogActionType, json, sessionId);
            }
            boolean zIsPraise = momentReplyModel.isPraise();
            MomentDetailCommentItemView momentDetailCommentItemView = this.f56327OooO0o;
            if (zIsPraise) {
                momentDetailCommentItemView.f30537OooO0Oo.f45060OooOOO.setImageResource(o0Oo0oo.ic_moment_comment_praise_gray);
            } else {
                SVGAView sVGAView = momentDetailCommentItemView.f30537OooO0Oo.f45063OooOOOo;
                z0 z0Var = z0.f57313OooO00o;
                sVGAView.OooOO0O(z0.OooO0o(), momentDetailCommentFragment.getViewLifecycleOwner());
                momentDetailCommentItemView.f30537OooO0Oo.f45063OooOOOo.OooOO0o();
            }
            momentReplyModel.setPraise(!momentReplyModel.isPraise());
            momentReplyModel.setPraiseNum(praiseCommentResultModel2 != null ? praiseCommentResultModel2.getNum() : 0L);
            momentDetailCommentItemView.f30537OooO0Oo.f45059OooOO0o.setText(o0O0O0Oo.OooO0o(momentReplyModel.getPraiseNum(), false));
            momentDetailCommentItemView.f30537OooO0Oo.f45059OooOO0o.setTextColor(o0000.OooO00o(momentReplyModel.isPraise() ? o0OOO0o.color_333333 : o0OOO0o.color_333333_65));
        }
        return Unit.INSTANCE;
    }
}
