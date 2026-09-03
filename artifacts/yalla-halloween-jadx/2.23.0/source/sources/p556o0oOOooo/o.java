package p556o0oOOooo;

import android.widget.ImageView;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o000OO00;
import com.yalla.yalla.ui.view.moment.MomentDetailCommentItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p579o0oOoo.oOOOOo0O;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.l6;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nMomentDetailCommentItemView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentDetailCommentItemView.kt\ncom/yalla/yalla/ui/view/moment/MomentDetailCommentItemView$praise$1$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,702:1\n283#2,2:703\n*S KotlinDebug\n*F\n+ 1 MomentDetailCommentItemView.kt\ncom/yalla/yalla/ui/view/moment/MomentDetailCommentItemView$praise$1$1\n*L\n289#1:703,2\n*E\n"})
public final class o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailCommentItemView f56077OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Integer f56078OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(MomentDetailCommentItemView momentDetailCommentItemView, Integer num) {
        super(0);
        this.f56077OooO0Oo = momentDetailCommentItemView;
        this.f56078OooO0o0 = num;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentDetailCommentItemView momentDetailCommentItemView = this.f56077OooO0Oo;
        SVGAView sVGAView = momentDetailCommentItemView.f31082OooO0Oo.f58351OooOOOO;
        Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.praiseSvga");
        sVGAView.setVisibility(4);
        l6 l6Var = momentDetailCommentItemView.f31082OooO0Oo;
        ImageView imageView = l6Var.f58350OooOOO0;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.praiseIv");
        o000OO00.OooOOOO(imageView);
        boolean zIsPraise = momentDetailCommentItemView.getItem().isPraise();
        ImageView imageView2 = l6Var.f58350OooOOO0;
        if (!zIsPraise || momentDetailCommentItemView.getItem().getPraiseNum() <= 0) {
            imageView2.setImageResource(oOo00OO0.ic_moment_comment_praise_gray);
        } else {
            oOOOOo0O oooooo0o = oOOOOo0O.f56683OooO00o;
            Integer config = this.f56078OooO0o0;
            Intrinsics.checkNotNullExpressionValue(config, "config");
            imageView2.setImageResource(oOOOOo0O.OooO0O0(config.intValue()));
        }
        return Unit.INSTANCE;
    }
}
