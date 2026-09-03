package p564o0oOo0O;

import android.widget.TextView;
import com.code.android.uikit.svga.SVGAView;
import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.ui.view.moment.MomentReplyItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0o00O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyItemView f56350OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentReplyModel f56351OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o00O(MomentReplyItemView momentReplyItemView, MomentReplyModel momentReplyModel) {
        super(0);
        this.f56350OooO0Oo = momentReplyItemView;
        this.f56351OooO0o0 = momentReplyModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentReplyItemView momentReplyItemView = this.f56350OooO0Oo;
        SVGAView rewardSvgaSon = momentReplyItemView.f30590OooO0Oo.f45152OooOO0O;
        Intrinsics.checkNotNullExpressionValue(rewardSvgaSon, "rewardSvgaSon");
        TextView rewardCountSon = momentReplyItemView.f30590OooO0Oo.f45142OooO;
        Intrinsics.checkNotNullExpressionValue(rewardCountSon, "rewardCountSon");
        MomentReplyItemView.OooO0Oo(momentReplyItemView, this.f56351OooO0o0, rewardSvgaSon, rewardCountSon);
        return Unit.INSTANCE;
    }
}
