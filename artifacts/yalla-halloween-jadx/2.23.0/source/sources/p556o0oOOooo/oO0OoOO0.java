package p556o0oOOooo;

import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.ui.fragment.moment.MomentDetailCommentFragment;
import com.yalla.yalla.ui.view.moment.MomentDetailCommentItemView;
import com.yalla.yalla.ui.vm.moment.MomentDetailActivityVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p029Oooo0oo.oo0ooO;
import p377o0OOoOo.o0000OO0;

/* JADX INFO: loaded from: classes5.dex */
public final class oO0OoOO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailCommentItemView f56138OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentReplyModel f56139OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OoOO0(MomentDetailCommentItemView momentDetailCommentItemView, MomentReplyModel momentReplyModel) {
        super(0);
        this.f56138OooO0Oo = momentDetailCommentItemView;
        this.f56139OooO0o0 = momentReplyModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentDetailCommentItemView momentDetailCommentItemView = this.f56138OooO0Oo;
        if (!momentDetailCommentItemView.f31089OooOO0o) {
            momentDetailCommentItemView.f31089OooOO0o = true;
            MomentDetailCommentFragment fragment = momentDetailCommentItemView.getFragment();
            if (fragment != null) {
                MomentDetailActivityVM momentVm = fragment.getMomentVm();
                MomentReplyModel momentReplyModel = this.f56139OooO0o0;
                momentVm.commentPraise(oo0ooO.OooO00o(momentReplyModel.getId()), momentReplyModel.isPraise() ? 1 : 0).observe(fragment.getViewLifecycleOwner(), new o0000OO0(new oO0Ooooo(fragment, momentReplyModel, momentDetailCommentItemView), null, new oO0o0o(momentDetailCommentItemView), false));
            }
        }
        return Unit.INSTANCE;
    }
}
