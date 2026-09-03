package p556o0oOOooo;

import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.ui.fragment.moment.MomentDetailCommentFragment;
import com.yalla.yalla.ui.view.moment.MomentDetailCommentItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p408o0Oo0o0O.o00Oo0;
import p464o0Oooo.o000000O;
import p519o0o0O0oO.d3;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.l6;

/* JADX INFO: loaded from: classes5.dex */
public final class oO0O0OoO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailCommentItemView f56132OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O0OoO(MomentDetailCommentItemView momentDetailCommentItemView) {
        super(0);
        this.f56132OooO0Oo = momentDetailCommentItemView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0OO000.OooO00o("103047");
        o000000O o000000o2 = o000000O.f46674OooO00o;
        Long l = (Long) o000000O.OooOOo0().getValue();
        MomentDetailCommentItemView momentDetailCommentItemView = this.f56132OooO0Oo;
        long userid = momentDetailCommentItemView.getItemSon().getUserid();
        if (l != null && l.longValue() == userid) {
            o000O00O.OooO0O0(o0000.OooO0OO(oO00OOo0.send_reward_self));
        } else if (o00Oo0.OooO().OooOO0o()) {
            MomentReplyModel itemSon = momentDetailCommentItemView.getItemSon();
            l6 l6Var = momentDetailCommentItemView.f31082OooO0Oo;
            SVGAView sVGAView = l6Var.f58356OooOo;
            Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.rewardSvgaSon");
            TextView textView = l6Var.f58358OooOo00;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.rewardCountSon");
            MomentDetailCommentItemView.OooO0o(momentDetailCommentItemView, itemSon, sVGAView, textView);
        } else {
            MomentDetailCommentFragment fragment = momentDetailCommentItemView.getFragment();
            FragmentActivity activity = fragment != null ? fragment.getActivity() : null;
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.yalla.yalla.base.activity.BaseFragmentActivity");
            d3.OooO00o((BaseFragmentActivity) activity, new oO000o00(momentDetailCommentItemView));
        }
        return Unit.INSTANCE;
    }
}
