package p484o0o00O;

import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.ui.activity.moment.postDetailCommentSonList.MomentReplyHeaderView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p029Oooo0oo.oo0ooO;
import p377o0OOoOo.o0000OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyHeaderView f47723OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000OO(MomentReplyHeaderView momentReplyHeaderView) {
        super(0);
        this.f47723OooO0Oo = momentReplyHeaderView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentReplyHeaderView momentReplyHeaderView = this.f47723OooO0Oo;
        MomentCommentDetailModel momentCommentDetailModel = momentReplyHeaderView.f26456OooO0oo;
        if (momentCommentDetailModel != null && !momentReplyHeaderView.f26451OooO) {
            momentReplyHeaderView.f26451OooO = true;
            momentReplyHeaderView.getActivity().OooOoO().commentPraise(oo0ooO.OooO00o(momentCommentDetailModel.getId()), momentCommentDetailModel.isPraise() ? 1 : 0).observe(momentReplyHeaderView.getActivity(), new o0000OO0(new o00000O0(momentReplyHeaderView, momentCommentDetailModel), null, new o00000O(momentReplyHeaderView), false));
        }
        return Unit.INSTANCE;
    }
}
