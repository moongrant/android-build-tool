package p564o0oOo0O;

import android.widget.TextView;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000;
import com.code.android.util.o000O00;
import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.ui.activity.moment.MomentReplyActivity;
import com.yalla.yalla.ui.view.moment.MomentReplyItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;
import p405o0Oo0OOO.oOOO00Oo;
import p415o0Oo0oO0.o00Ooo;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;
import p650o0ooo.d3;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0o0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyItemView f56348OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o0(MomentReplyItemView momentReplyItemView) {
        super(0);
        this.f56348OooO0Oo = momentReplyItemView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentReplyItemView momentReplyItemView = this.f56348OooO0Oo;
        MomentReplyModel momentReplyModel = momentReplyItemView.f30591OooO0o;
        if (momentReplyModel != null) {
            OooO00o.OooO0O0("103047");
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            Long l = (Long) o0O00oO0.OooOOo0().getValue();
            long userid = momentReplyModel.getUserid();
            if (l != null && l.longValue() == userid) {
                o000O00.OooO0O0(o0000.OooO0OO(o000000.send_reward_self));
            } else if (o00Ooo.OooO().OooOO0o()) {
                oOOO00Oo oooo00oo = momentReplyItemView.f30590OooO0Oo;
                SVGAView rewardSvgaSon = oooo00oo.f45152OooOO0O;
                Intrinsics.checkNotNullExpressionValue(rewardSvgaSon, "rewardSvgaSon");
                TextView rewardCountSon = oooo00oo.f45142OooO;
                Intrinsics.checkNotNullExpressionValue(rewardCountSon, "rewardCountSon");
                MomentReplyItemView.OooO0Oo(momentReplyItemView, momentReplyModel, rewardSvgaSon, rewardCountSon);
            } else {
                MomentReplyActivity activity = momentReplyItemView.getActivity();
                if (activity != null) {
                    d3.OooO00o(activity, new o0O0o00O(momentReplyItemView, momentReplyModel));
                }
            }
        }
        return Unit.INSTANCE;
    }
}
