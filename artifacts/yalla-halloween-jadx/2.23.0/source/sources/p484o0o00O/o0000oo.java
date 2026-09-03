package p484o0o00O;

import android.widget.TextView;
import androidx.compose.runtime.Oooo0;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.ui.activity.moment.postDetailCommentSonList.MomentReplyHeaderView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p408o0Oo0o0O.o00Oo0;
import p464o0Oooo.o000000O;
import p519o0o0O0oO.d3;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.w6;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000oo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyHeaderView f47737OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000oo(MomentReplyHeaderView momentReplyHeaderView) {
        super(0);
        this.f47737OooO0Oo = momentReplyHeaderView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentReplyHeaderView momentReplyHeaderView = this.f47737OooO0Oo;
        MomentCommentDetailModel momentCommentDetailModel = momentReplyHeaderView.f26456OooO0oo;
        if (momentCommentDetailModel != null) {
            o0OO000.OooO00o("103047");
            o000000O o000000o2 = o000000O.f46674OooO00o;
            if (Intrinsics.areEqual(Oooo0.OooO00o(), momentCommentDetailModel.getUserid())) {
                o000O00O.OooO0O0(o0000.OooO0OO(oO00OOo0.send_reward_self));
            } else if (o00Oo0.OooO().OooOO0o()) {
                w6 w6Var = momentReplyHeaderView.f26454OooO0o0;
                SVGAView sVGAView = w6Var.f59167OooOOOO;
                Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.rewardSvga");
                TextView textView = w6Var.f59166OooOOO0;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.rewardCount");
                momentReplyHeaderView.OooO0Oo(momentCommentDetailModel, sVGAView, textView);
            } else {
                d3.OooO00o(momentReplyHeaderView.getActivity(), new o0000O00(momentReplyHeaderView, momentCommentDetailModel));
            }
        }
        return Unit.INSTANCE;
    }
}
