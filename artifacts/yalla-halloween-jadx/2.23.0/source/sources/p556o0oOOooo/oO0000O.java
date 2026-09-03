package p556o0oOOooo;

import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.MomentLogActionType;
import com.yalla.yalla.model.MomentLogActionTypeCommentPraise;
import com.yalla.yalla.model.PraiseCommentResultModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.repository.WebEventRepository;
import com.yalla.yalla.ui.fragment.moment.MomentDetailCommentFragment;
import com.yalla.yalla.ui.view.moment.MomentDetailCommentItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p579o0oOoo.oOOOOo0O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oOo00OO0;
import p590o0oo0.OooOOOO;
import p641o0ooOOOO.l6;

/* JADX INFO: loaded from: classes5.dex */
public final class oO0000O extends Lambda implements Function1<PraiseCommentResultModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailCommentFragment f56089OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentDetailCommentItemView f56090OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0000O(MomentDetailCommentFragment momentDetailCommentFragment, MomentDetailCommentItemView momentDetailCommentItemView) {
        super(1);
        this.f56089OooO0Oo = momentDetailCommentFragment;
        this.f56090OooO0o0 = momentDetailCommentItemView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(PraiseCommentResultModel praiseCommentResultModel) {
        PraiseCommentResultModel praiseCommentResultModel2 = praiseCommentResultModel;
        MomentDetailCommentFragment momentDetailCommentFragment = this.f56089OooO0Oo;
        MomentDetailModel mPostDetailModel = momentDetailCommentFragment.getMPostDetailModel();
        if (mPostDetailModel != null) {
            boolean z = String.valueOf(mPostDetailModel.getUserId()).length() > 0;
            MomentDetailCommentItemView momentDetailCommentItemView = this.f56090OooO0o0;
            if (z) {
                MomentLogActionTypeCommentPraise momentLogActionTypeCommentPraise = new MomentLogActionTypeCommentPraise(null, null, null, 7, null);
                momentLogActionTypeCommentPraise.setObject_userid(String.valueOf(mPostDetailModel.getUserId()));
                momentLogActionTypeCommentPraise.setDiscoveryid(o0OoOo0.OooOOO0("", Long.valueOf(mPostDetailModel.getId())));
                momentLogActionTypeCommentPraise.setComment_id(o0OoOo0.OooOOO0("", Long.valueOf(momentDetailCommentItemView.getItem().getId())));
                WebEventRepository webEventRepository = WebEventRepository.f24891OooO00o;
                MomentLogActionType momentLogActionType = MomentLogActionType.comment_praise;
                String json = momentLogActionTypeCommentPraise.toJson();
                String sessionId = mPostDetailModel.getSessionId();
                webEventRepository.getClass();
                WebEventRepository.OooO0o0(momentLogActionType, json, sessionId);
            }
            boolean zIsPraise = momentDetailCommentItemView.getItem().isPraise();
            l6 l6Var = momentDetailCommentItemView.f31082OooO0Oo;
            if (zIsPraise) {
                l6Var.f58350OooOOO0.setImageResource(oOo00OO0.ic_moment_comment_praise_gray);
            } else {
                SVGAView sVGAView = l6Var.f58351OooOOOO;
                oOOOOo0O oooooo0o = oOOOOo0O.f56683OooO00o;
                sVGAView.OooOO0O(oOOOOo0O.OooO0o(), momentDetailCommentFragment.getViewLifecycleOwner());
                l6Var.f58351OooOOOO.OooOO0o();
            }
            momentDetailCommentItemView.getItem().setPraise(!momentDetailCommentItemView.getItem().isPraise());
            momentDetailCommentItemView.getItem().setPraiseNum(praiseCommentResultModel2 != null ? praiseCommentResultModel2.getNum() : 0L);
            l6Var.f58347OooOO0O.setText(OooOOOO.OooO0o(momentDetailCommentItemView.getItem().getPraiseNum(), false));
            l6Var.f58347OooOO0O.setTextColor(momentDetailCommentItemView.getItem().isPraise() ? o0000.OooO00o(oO00O0o.color_333333) : o0000.OooO00o(oO00O0o.color_333333_65));
        }
        return Unit.INSTANCE;
    }
}
