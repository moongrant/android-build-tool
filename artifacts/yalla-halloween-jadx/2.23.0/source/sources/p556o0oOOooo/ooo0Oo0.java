package p556o0oOOooo;

import com.yalla.yalla.ui.fragment.moment.MomentDetailCommentFragment;
import com.yalla.yalla.ui.view.moment.MomentDetailCommentItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class ooo0Oo0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailCommentItemView f56161OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooo0Oo0(MomentDetailCommentItemView momentDetailCommentItemView) {
        super(0);
        this.f56161OooO0Oo = momentDetailCommentItemView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentDetailCommentItemView momentDetailCommentItemView = this.f56161OooO0Oo;
        MomentDetailCommentFragment fragment = momentDetailCommentItemView.getFragment();
        if (fragment != null) {
            fragment.replyComment(momentDetailCommentItemView.getItem());
        }
        return Unit.INSTANCE;
    }
}
