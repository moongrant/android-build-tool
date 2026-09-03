package p556o0oOOooo;

import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000;
import com.yalla.yalla.model.RewardCommentResultModel;
import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.ui.fragment.moment.MomentDetailCommentFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p464o0Oooo.o000000O;
import p559o0oOo00.OooOOO;
import p584o0oOooO0.oO00O0o;
import p587o0oOooo.o0OO000;
import p590o0oo0.OooOOOO;

/* JADX INFO: loaded from: classes5.dex */
public final class oO00O0o0 extends Lambda implements Function1<RewardCommentResultModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SVGAView f56101OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentReplyModel f56102OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentDetailCommentFragment f56103OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ TextView f56104OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00O0o0(SVGAView sVGAView, MomentDetailCommentFragment momentDetailCommentFragment, MomentReplyModel momentReplyModel, TextView textView) {
        super(1);
        this.f56101OooO0Oo = sVGAView;
        this.f56103OooO0o0 = momentDetailCommentFragment;
        this.f56102OooO0o = momentReplyModel;
        this.f56104OooO0oO = textView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RewardCommentResultModel rewardCommentResultModel) {
        RewardCommentResultModel rewardCommentResultModel2 = rewardCommentResultModel;
        o0OO000.OooO00o("203024");
        MomentDetailCommentFragment momentDetailCommentFragment = this.f56103OooO0o0;
        LifecycleOwner viewLifecycleOwner = momentDetailCommentFragment.getViewLifecycleOwner();
        SVGAView sVGAView = this.f56101OooO0Oo;
        sVGAView.OooOO0O("svga/anim_moment_reward.svga", viewLifecycleOwner);
        sVGAView.OooOO0o();
        MomentReplyModel momentReplyModel = this.f56102OooO0o;
        momentReplyModel.setSendProp(true);
        momentReplyModel.setPropNum(rewardCommentResultModel2 != null ? rewardCommentResultModel2.getTotalPropNum() : 0L);
        o000000O o000000o2 = o000000O.f46674OooO00o;
        o000000O.OooO0O0().setValue(Long.valueOf(rewardCommentResultModel2 != null ? rewardCommentResultModel2.getCoinBalance() : 0L));
        String strOooO0o = OooOOOO.OooO0o(momentReplyModel.getPropNum(), false);
        TextView textView = this.f56104OooO0oO;
        textView.setText(strOooO0o);
        textView.setTextColor(o0000.OooO00o(momentReplyModel.isSendProp() ? oO00O0o.color_333333 : oO00O0o.color_333333_65));
        int i = OooOOO.f56177OooO0O0;
        OooOOO.OooO00o.OooO00o(momentDetailCommentFragment.getContext(), textView);
        return Unit.INSTANCE;
    }
}
