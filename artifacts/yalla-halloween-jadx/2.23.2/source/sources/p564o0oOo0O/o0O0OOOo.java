package p564o0oOo0O;

import androidx.media3.session.o0000O00;
import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.ui.activity.moment.MomentReplyActivity;
import com.yalla.yalla.ui.view.moment.MomentReplyItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p384o0OOoo0O.o000oOoO;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0OOOo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyItemView f56346OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OOOo(MomentReplyItemView momentReplyItemView) {
        super(0);
        this.f56346OooO0Oo = momentReplyItemView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentReplyItemView momentReplyItemView = this.f56346OooO0Oo;
        MomentReplyModel momentReplyModel = momentReplyItemView.f30591OooO0o;
        if (momentReplyModel != null && !momentReplyItemView.f30594OooO0oo) {
            momentReplyItemView.f30594OooO0oo = true;
            MomentReplyActivity activity = momentReplyItemView.getActivity();
            if (activity != null) {
                activity.OooOoO().commentPraise(o0000O00.OooO00o(momentReplyModel.getId()), momentReplyModel.isPraise() ? 1 : 0).observe(activity, new o000oOoO(new o0O0OO0(activity, momentReplyModel, momentReplyItemView), null, new o0O0OOO0(momentReplyItemView), false));
            }
        }
        return Unit.INSTANCE;
    }
}
