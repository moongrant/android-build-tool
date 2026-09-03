package p556o0oOOooo;

import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.ui.activity.moment.MomentReplyActivity;
import com.yalla.yalla.ui.view.moment.MomentReplyItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p029Oooo0oo.oo0ooO;
import p377o0OOoOo.o0000OO0;

/* JADX INFO: loaded from: classes5.dex */
public final class oO00o00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyItemView f56117OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00o00(MomentReplyItemView momentReplyItemView) {
        super(0);
        this.f56117OooO0Oo = momentReplyItemView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentReplyItemView momentReplyItemView = this.f56117OooO0Oo;
        MomentReplyModel momentReplyModel = momentReplyItemView.f31132OooO0o;
        if (momentReplyModel != null && !momentReplyItemView.f31135OooO0oo) {
            momentReplyItemView.f31135OooO0oo = true;
            MomentReplyActivity activity = momentReplyItemView.getActivity();
            if (activity != null) {
                activity.OooOoO().commentPraise(oo0ooO.OooO00o(momentReplyModel.getId()), momentReplyModel.isPraise() ? 1 : 0).observe(activity, new o0000OO0(new oOOoOOO0(activity, momentReplyModel, momentReplyItemView), null, new oO00o000(momentReplyItemView), false));
            }
        }
        return Unit.INSTANCE;
    }
}
