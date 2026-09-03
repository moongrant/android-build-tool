package p496o0o00Oo0;

import androidx.media3.session.o0000O00;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.ui.activity.moment.postDetailCommentSonList.MomentReplyHeaderView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p384o0OOoo0O.o000oOoO;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyHeaderView f49646OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(MomentReplyHeaderView momentReplyHeaderView) {
        super(0);
        this.f49646OooO0Oo = momentReplyHeaderView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentReplyHeaderView momentReplyHeaderView = this.f49646OooO0Oo;
        MomentCommentDetailModel momentCommentDetailModel = momentReplyHeaderView.f26004OooO0oo;
        if (momentCommentDetailModel != null && !momentReplyHeaderView.f25999OooO) {
            momentReplyHeaderView.f25999OooO = true;
            momentReplyHeaderView.getActivity().OooOoO().commentPraise(o0000O00.OooO00o(momentCommentDetailModel.getId()), momentCommentDetailModel.isPraise() ? 1 : 0).observe(momentReplyHeaderView.getActivity(), new o000oOoO(new e(momentReplyHeaderView, momentCommentDetailModel), null, new f(momentReplyHeaderView), false));
        }
        return Unit.INSTANCE;
    }
}
