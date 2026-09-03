package p556o0oOOooo;

import android.widget.TextView;
import com.code.android.uikit.svga.SVGAView;
import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.ui.view.moment.MomentReplyItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class oO00o0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyItemView f56115OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentReplyModel f56116OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00o0(MomentReplyItemView momentReplyItemView, MomentReplyModel momentReplyModel) {
        super(0);
        this.f56115OooO0Oo = momentReplyItemView;
        this.f56116OooO0o0 = momentReplyModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentReplyItemView momentReplyItemView = this.f56115OooO0Oo;
        SVGAView sVGAView = momentReplyItemView.f31131OooO0Oo.f59286OooOO0O;
        Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.rewardSvgaSon");
        TextView textView = momentReplyItemView.f31131OooO0Oo.f59276OooO;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.rewardCountSon");
        MomentReplyItemView.OooO0Oo(momentReplyItemView, this.f56116OooO0o0, sVGAView, textView);
        return Unit.INSTANCE;
    }
}
