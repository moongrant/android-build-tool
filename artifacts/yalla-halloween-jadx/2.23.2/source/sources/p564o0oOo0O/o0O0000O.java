package p564o0oOo0O;

import androidx.media3.session.o0000O00;
import com.yalla.yalla.ui.fragment.moment.MomentDetailCommentFragment;
import com.yalla.yalla.ui.view.moment.MomentDetailCommentItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p384o0OOoo0O.o000oOoO;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0000O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailCommentItemView f56324OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0000O(MomentDetailCommentItemView momentDetailCommentItemView) {
        super(0);
        this.f56324OooO0Oo = momentDetailCommentItemView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentDetailCommentItemView momentDetailCommentItemView = this.f56324OooO0Oo;
        if (!momentDetailCommentItemView.f30542OooOO0) {
            momentDetailCommentItemView.f30542OooOO0 = true;
            MomentDetailCommentFragment fragment = momentDetailCommentItemView.getFragment();
            if (fragment != null) {
                fragment.getMomentVm().commentPraise(o0000O00.OooO00o(momentDetailCommentItemView.getItem().getId()), momentDetailCommentItemView.getItem().isPraise() ? 1 : 0).observe(fragment.getViewLifecycleOwner(), new o000oOoO(new o0(fragment, momentDetailCommentItemView), null, new o0O00000(momentDetailCommentItemView), false));
            }
        }
        return Unit.INSTANCE;
    }
}
