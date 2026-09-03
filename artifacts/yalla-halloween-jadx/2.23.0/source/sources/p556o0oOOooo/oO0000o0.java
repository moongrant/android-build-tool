package p556o0oOOooo;

import com.yalla.yalla.ui.fragment.moment.MomentDetailCommentFragment;
import com.yalla.yalla.ui.view.moment.MomentDetailCommentItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p029Oooo0oo.oo0ooO;
import p377o0OOoOo.o0000OO0;

/* JADX INFO: loaded from: classes5.dex */
public final class oO0000o0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailCommentItemView f56092OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0000o0(MomentDetailCommentItemView momentDetailCommentItemView) {
        super(0);
        this.f56092OooO0Oo = momentDetailCommentItemView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentDetailCommentItemView momentDetailCommentItemView = this.f56092OooO0Oo;
        if (!momentDetailCommentItemView.f31087OooOO0) {
            momentDetailCommentItemView.f31087OooOO0 = true;
            MomentDetailCommentFragment fragment = momentDetailCommentItemView.getFragment();
            if (fragment != null) {
                fragment.getMomentVm().commentPraise(oo0ooO.OooO00o(momentDetailCommentItemView.getItem().getId()), momentDetailCommentItemView.getItem().isPraise() ? 1 : 0).observe(fragment.getViewLifecycleOwner(), new o0000OO0(new oO0000O(fragment, momentDetailCommentItemView), null, new oO0000Oo(momentDetailCommentItemView), false));
            }
        }
        return Unit.INSTANCE;
    }
}
