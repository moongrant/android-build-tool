package p564o0oOo0O;

import androidx.media3.session.o0000O00;
import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.ui.fragment.moment.MomentDetailCommentFragment;
import com.yalla.yalla.ui.view.moment.MomentDetailCommentItemView;
import com.yalla.yalla.ui.vm.moment.MomentDetailActivityVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p384o0OOoo0O.o000oOoO;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailCommentItemView f56318OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentReplyModel f56319OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00(MomentDetailCommentItemView momentDetailCommentItemView, MomentReplyModel momentReplyModel) {
        super(0);
        this.f56318OooO0Oo = momentDetailCommentItemView;
        this.f56319OooO0o0 = momentReplyModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentDetailCommentItemView momentDetailCommentItemView = this.f56318OooO0Oo;
        if (!momentDetailCommentItemView.f30544OooOO0o) {
            momentDetailCommentItemView.f30544OooOO0o = true;
            MomentDetailCommentFragment fragment = momentDetailCommentItemView.getFragment();
            if (fragment != null) {
                MomentDetailActivityVM momentVm = fragment.getMomentVm();
                MomentReplyModel momentReplyModel = this.f56319OooO0o0;
                momentVm.commentPraise(o0000O00.OooO00o(momentReplyModel.getId()), momentReplyModel.isPraise() ? 1 : 0).observe(fragment.getViewLifecycleOwner(), new o000oOoO(new o0O000Oo(fragment, momentReplyModel, momentDetailCommentItemView), null, new o0O000o0(momentDetailCommentItemView), false));
            }
        }
        return Unit.INSTANCE;
    }
}
