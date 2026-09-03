package p484o0o00O;

import android.widget.TextView;
import com.code.android.uikit.svga.SVGAView;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.ui.activity.moment.postDetailCommentSonList.MomentReplyHeaderView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyHeaderView f47733OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentCommentDetailModel f47734OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O00(MomentReplyHeaderView momentReplyHeaderView, MomentCommentDetailModel momentCommentDetailModel) {
        super(0);
        this.f47733OooO0Oo = momentReplyHeaderView;
        this.f47734OooO0o0 = momentCommentDetailModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentReplyHeaderView momentReplyHeaderView = this.f47733OooO0Oo;
        SVGAView sVGAView = momentReplyHeaderView.f26454OooO0o0.f59167OooOOOO;
        Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.rewardSvga");
        TextView textView = momentReplyHeaderView.f26454OooO0o0.f59166OooOOO0;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.rewardCount");
        momentReplyHeaderView.OooO0Oo(this.f47734OooO0o0, sVGAView, textView);
        return Unit.INSTANCE;
    }
}
