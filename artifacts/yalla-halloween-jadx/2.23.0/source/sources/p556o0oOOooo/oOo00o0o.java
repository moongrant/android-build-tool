package p556o0oOOooo;

import android.widget.TextView;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.ui.activity.moment.MomentReplyActivity;
import com.yalla.yalla.ui.view.moment.MomentReplyItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p408o0Oo0o0O.o00Oo0;
import p464o0Oooo.o000000O;
import p519o0o0O0oO.d3;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.x6;

/* JADX INFO: loaded from: classes5.dex */
public final class oOo00o0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyItemView f56155OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo00o0o(MomentReplyItemView momentReplyItemView) {
        super(0);
        this.f56155OooO0Oo = momentReplyItemView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentReplyItemView momentReplyItemView = this.f56155OooO0Oo;
        MomentReplyModel momentReplyModel = momentReplyItemView.f31132OooO0o;
        if (momentReplyModel != null) {
            o0OO000.OooO00o("103047");
            o000000O o000000o2 = o000000O.f46674OooO00o;
            Long l = (Long) o000000O.OooOOo0().getValue();
            long userid = momentReplyModel.getUserid();
            if (l != null && l.longValue() == userid) {
                o000O00O.OooO0O0(o0000.OooO0OO(oO00OOo0.send_reward_self));
            } else if (o00Oo0.OooO().OooOO0o()) {
                x6 x6Var = momentReplyItemView.f31131OooO0Oo;
                SVGAView sVGAView = x6Var.f59286OooOO0O;
                Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.rewardSvgaSon");
                TextView textView = x6Var.f59276OooO;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.rewardCountSon");
                MomentReplyItemView.OooO0Oo(momentReplyItemView, momentReplyModel, sVGAView, textView);
            } else {
                MomentReplyActivity activity = momentReplyItemView.getActivity();
                if (activity != null) {
                    d3.OooO00o(activity, new oO00o0(momentReplyItemView, momentReplyModel));
                }
            }
        }
        return Unit.INSTANCE;
    }
}
