package p535o0o0Oo0;

import androidx.compose.runtime.MutableState;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.MomentLogActionType;
import com.yalla.yalla.model.MomentLogActionTypeCommentPraise;
import com.yalla.yalla.model.PraiseCommentResultModel;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentTypePraise;
import com.yalla.yalla.repository.WebEventRepository;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00000o extends Lambda implements Function1<PraiseCommentResultModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f53863OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentCommentDetailModel f53864OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f53865OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f53866OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00000o(MutableState<Boolean> mutableState, int i, MomentCommentDetailModel momentCommentDetailModel, MomentDetailModel momentDetailModel) {
        super(1);
        this.f53863OooO0Oo = mutableState;
        this.f53865OooO0o0 = i;
        this.f53864OooO0o = momentCommentDetailModel;
        this.f53866OooO0oO = momentDetailModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(PraiseCommentResultModel praiseCommentResultModel) {
        PraiseCommentResultModel praiseCommentResultModel2 = praiseCommentResultModel;
        this.f53863OooO0Oo.setValue(Boolean.valueOf(this.f53865OooO0o0 == 0));
        MomentCommentDetailModel momentCommentDetailModel = this.f53864OooO0o;
        momentCommentDetailModel.setPraise(!momentCommentDetailModel.isPraise());
        momentCommentDetailModel.setPraiseNum(praiseCommentResultModel2 != null ? praiseCommentResultModel2.getNum() : 0L);
        MomentDetailModel momentDetailModel = this.f53866OooO0oO;
        if (String.valueOf(momentDetailModel.getUserId()).length() > 0) {
            MomentLogActionTypeCommentPraise momentLogActionTypeCommentPraise = new MomentLogActionTypeCommentPraise(null, null, null, 7, null);
            momentLogActionTypeCommentPraise.setObject_userid(String.valueOf(momentDetailModel.getUserId()));
            momentLogActionTypeCommentPraise.setDiscoveryid(o0OoOo0.OooOOO0("", Long.valueOf(momentDetailModel.getId())));
            momentLogActionTypeCommentPraise.setComment_id(o0OoOo0.OooOOO0("", Long.valueOf(momentCommentDetailModel.getId())));
            WebEventRepository webEventRepository = WebEventRepository.f24430OooO00o;
            MomentLogActionType momentLogActionType = MomentLogActionType.comment_praise;
            String json = momentLogActionTypeCommentPraise.toJson();
            String sessionId = momentDetailModel.getSessionId();
            webEventRepository.getClass();
            WebEventRepository.OooO0o0(momentLogActionType, json, sessionId);
        }
        MomentTypePraise.Praise.getValue();
        return Unit.INSTANCE;
    }
}
