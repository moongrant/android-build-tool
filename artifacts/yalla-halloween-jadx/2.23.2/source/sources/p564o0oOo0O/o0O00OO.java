package p564o0oOo0O;

import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000;
import com.code.android.util.o000O00;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.ui.fragment.moment.MomentDetailCommentFragment;
import com.yalla.yalla.ui.view.moment.MomentDetailCommentItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;
import p004OooO0oO.o0OoOo0;
import p405o0Oo0OOO.oOO0O0;
import p415o0Oo0oO0.o00Ooo;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;
import p650o0ooo.d3;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailCommentItemView f56332OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00OO(MomentDetailCommentItemView momentDetailCommentItemView) {
        super(0);
        this.f56332OooO0Oo = momentDetailCommentItemView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooO00o.OooO0O0("103047");
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        String strOooO00o = o0OoOo0.OooO00o();
        MomentDetailCommentItemView momentDetailCommentItemView = this.f56332OooO0Oo;
        if (Intrinsics.areEqual(strOooO00o, momentDetailCommentItemView.getItem().getUserid())) {
            o000O00.OooO0O0(o0000.OooO0OO(o000000.send_reward_self));
        } else if (o00Ooo.OooO().OooOO0o()) {
            MomentCommentDetailModel item = momentDetailCommentItemView.getItem();
            oOO0O0 ooo0o0 = momentDetailCommentItemView.f30537OooO0Oo;
            SVGAView rewardSvga = ooo0o0.f45071OooOo0o;
            Intrinsics.checkNotNullExpressionValue(rewardSvga, "rewardSvga");
            TextView rewardCount = ooo0o0.f45066OooOOoo;
            Intrinsics.checkNotNullExpressionValue(rewardCount, "rewardCount");
            momentDetailCommentItemView.OooO0oO(item, rewardSvga, rewardCount);
        } else {
            MomentDetailCommentFragment fragment = momentDetailCommentItemView.getFragment();
            FragmentActivity activity = fragment != null ? fragment.getActivity() : null;
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.yalla.yalla.base.activity.BaseFragmentActivity");
            d3.OooO00o((BaseFragmentActivity) activity, new o0O00O(momentDetailCommentItemView));
        }
        return Unit.INSTANCE;
    }
}
