package p564o0oOo0O;

import android.widget.TextView;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000;
import com.yalla.yalla.model.RewardCommentResultModel;
import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.ui.activity.moment.MomentReplyActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o0OOO0o;
import p566o0oOo0OO.o0O000O;
import p605o0oo0O0O.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oOo0O0 extends Lambda implements Function1<RewardCommentResultModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SVGAView f56380OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentReplyModel f56381OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentReplyActivity f56382OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ TextView f56383OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oOo0O0(SVGAView sVGAView, MomentReplyActivity momentReplyActivity, MomentReplyModel momentReplyModel, TextView textView) {
        super(1);
        this.f56380OooO0Oo = sVGAView;
        this.f56382OooO0o0 = momentReplyActivity;
        this.f56381OooO0o = momentReplyModel;
        this.f56383OooO0oO = textView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RewardCommentResultModel rewardCommentResultModel) {
        RewardCommentResultModel rewardCommentResultModel2 = rewardCommentResultModel;
        OooO00o.OooO0O0("203024");
        SVGAView sVGAView = this.f56380OooO0Oo;
        MomentReplyActivity momentReplyActivity = this.f56382OooO0o0;
        sVGAView.OooOO0O("svga/anim_moment_reward.svga", momentReplyActivity);
        sVGAView.OooOO0o();
        MomentReplyModel momentReplyModel = this.f56381OooO0o;
        momentReplyModel.setSendProp(true);
        momentReplyModel.setPropNum(rewardCommentResultModel2 != null ? rewardCommentResultModel2.getTotalPropNum() : 0L);
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        o0O00oO0.OooO0O0().setValue(Long.valueOf(rewardCommentResultModel2 != null ? rewardCommentResultModel2.getCoinBalance() : 0L));
        String strOooO0o = o0O0O0Oo.OooO0o(momentReplyModel.getPropNum(), false);
        TextView textView = this.f56383OooO0oO;
        textView.setText(strOooO0o);
        textView.setTextColor(o0000.OooO00o(momentReplyModel.isSendProp() ? o0OOO0o.color_333333 : o0OOO0o.color_333333_65));
        int i = o0O000O.f56394OooO0O0;
        o0O000O.OooO00o.OooO00o(momentReplyActivity, textView);
        return Unit.INSTANCE;
    }
}
