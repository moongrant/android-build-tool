package p564o0oOo0O;

import android.widget.ImageView;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o000O;
import com.yalla.yalla.ui.view.moment.MomentDetailCommentItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentDetailCommentItemView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentDetailCommentItemView.kt\ncom/yalla/yalla/ui/view/moment/MomentDetailCommentItemView$praise$1$2\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,702:1\n283#2,2:703\n*S KotlinDebug\n*F\n+ 1 MomentDetailCommentItemView.kt\ncom/yalla/yalla/ui/view/moment/MomentDetailCommentItemView$praise$1$2\n*L\n298#1:703,2\n*E\n"})
public final class o0oOOo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailCommentItemView f56379OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oOOo(MomentDetailCommentItemView momentDetailCommentItemView) {
        super(0);
        this.f56379OooO0Oo = momentDetailCommentItemView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentDetailCommentItemView momentDetailCommentItemView = this.f56379OooO0Oo;
        SVGAView praiseSvga = momentDetailCommentItemView.f30537OooO0Oo.f45062OooOOOO;
        Intrinsics.checkNotNullExpressionValue(praiseSvga, "praiseSvga");
        praiseSvga.setVisibility(0);
        ImageView praiseIv = momentDetailCommentItemView.f30537OooO0Oo.f45061OooOOO0;
        Intrinsics.checkNotNullExpressionValue(praiseIv, "praiseIv");
        o000O.OooO0OO(praiseIv);
        return Unit.INSTANCE;
    }
}
