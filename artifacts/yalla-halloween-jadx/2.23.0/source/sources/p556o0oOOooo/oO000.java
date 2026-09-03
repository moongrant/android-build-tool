package p556o0oOOooo;

import android.widget.ImageView;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o000OO00;
import com.yalla.yalla.model.moment.MomentReplyModel;
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
@SourceDebugExtension({"SMAP\nMomentDetailCommentItemView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentDetailCommentItemView.kt\ncom/yalla/yalla/ui/view/moment/MomentDetailCommentItemView$praiseSon$1$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,702:1\n283#2,2:703\n*S KotlinDebug\n*F\n+ 1 MomentDetailCommentItemView.kt\ncom/yalla/yalla/ui/view/moment/MomentDetailCommentItemView$praiseSon$1$1\n*L\n540#1:703,2\n*E\n"})
public final class oO000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailCommentItemView f56084OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Integer f56085OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentReplyModel f56086OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000(MomentDetailCommentItemView momentDetailCommentItemView, MomentReplyModel momentReplyModel, Integer num) {
        super(0);
        this.f56084OooO0Oo = momentDetailCommentItemView;
        this.f56086OooO0o0 = momentReplyModel;
        this.f56085OooO0o = num;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentDetailCommentItemView momentDetailCommentItemView = this.f56084OooO0Oo;
        SVGAView sVGAView = momentDetailCommentItemView.f31082OooO0Oo.f58352OooOOOo;
        Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.praiseSvgaSon");
        sVGAView.setVisibility(4);
        l6 l6Var = momentDetailCommentItemView.f31082OooO0Oo;
        ImageView imageView = l6Var.f58349OooOOO;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.praiseIvSon");
        o000OO00.OooOOOO(imageView);
        MomentReplyModel momentReplyModel = this.f56086OooO0o0;
        boolean zIsPraise = momentReplyModel.isPraise();
        ImageView imageView2 = l6Var.f58349OooOOO;
        if (!zIsPraise || momentReplyModel.getPraiseNum() <= 0) {
            imageView2.setImageResource(oOo00OO0.ic_moment_comment_praise_gray);
        } else {
            oOOOOo0O oooooo0o = oOOOOo0O.f56683OooO00o;
            Integer config = this.f56085OooO0o;
            Intrinsics.checkNotNullExpressionValue(config, "config");
            imageView2.setImageResource(oOOOOo0O.OooO0O0(config.intValue()));
        }
        return Unit.INSTANCE;
    }
}
