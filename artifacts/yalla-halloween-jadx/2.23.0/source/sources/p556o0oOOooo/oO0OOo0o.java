package p556o0oOOooo;

import android.widget.TextView;
import androidx.compose.runtime.Oooo0;
import androidx.fragment.app.FragmentActivity;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
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
public final class oO0OOo0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailCommentItemView f56135OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OOo0o(MomentDetailCommentItemView momentDetailCommentItemView) {
        super(0);
        this.f56135OooO0Oo = momentDetailCommentItemView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0OO000.OooO00o("103047");
        o000000O o000000o2 = o000000O.f46674OooO00o;
        String strOooO00o = Oooo0.OooO00o();
        MomentDetailCommentItemView momentDetailCommentItemView = this.f56135OooO0Oo;
        if (Intrinsics.areEqual(strOooO00o, momentDetailCommentItemView.getItem().getUserid())) {
            o000O00O.OooO0O0(o0000.OooO0OO(oO00OOo0.send_reward_self));
        } else if (o00Oo0.OooO().OooOO0o()) {
            MomentCommentDetailModel item = momentDetailCommentItemView.getItem();
            l6 l6Var = momentDetailCommentItemView.f31082OooO0Oo;
            SVGAView sVGAView = l6Var.f58360OooOo0o;
            Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.rewardSvga");
            TextView textView = l6Var.f58355OooOOoo;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.rewardCount");
            momentDetailCommentItemView.OooO0oo(item, sVGAView, textView);
        } else {
            MomentDetailCommentFragment fragment = momentDetailCommentItemView.getFragment();
            FragmentActivity activity = fragment != null ? fragment.getActivity() : null;
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.yalla.yalla.base.activity.BaseFragmentActivity");
            d3.OooO00o((BaseFragmentActivity) activity, new ooOOOOoo(momentDetailCommentItemView));
        }
        return Unit.INSTANCE;
    }
}
