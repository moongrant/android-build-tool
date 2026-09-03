package p564o0oOo0O;

import com.code.android.uikit.svga.SVGAView;
import com.yalla.yalla.ui.view.moment.MomentReplyItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentReplyItemView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentReplyItemView.kt\ncom/yalla/yalla/ui/view/moment/MomentReplyItemView$praiseSon$1$2\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,417:1\n283#2,2:418\n*S KotlinDebug\n*F\n+ 1 MomentReplyItemView.kt\ncom/yalla/yalla/ui/view/moment/MomentReplyItemView$praiseSon$1$2\n*L\n269#1:418,2\n*E\n"})
public final class o0O0O0Oo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyItemView f56339OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O0Oo(MomentReplyItemView momentReplyItemView) {
        super(0);
        this.f56339OooO0Oo = momentReplyItemView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentReplyItemView momentReplyItemView = this.f56339OooO0Oo;
        SVGAView praiseSvgaSon = momentReplyItemView.f30590OooO0Oo.f45149OooO0oO;
        Intrinsics.checkNotNullExpressionValue(praiseSvgaSon, "praiseSvgaSon");
        praiseSvgaSon.setVisibility(0);
        momentReplyItemView.f30590OooO0Oo.f45147OooO0o.setVisibility(4);
        return Unit.INSTANCE;
    }
}
