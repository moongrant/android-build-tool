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
import p405o0Oo0OOO.oOO0O0;
import p562o0oOo000.o0Oo0oo;
import p590o0oOooo0.z0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentDetailCommentItemView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentDetailCommentItemView.kt\ncom/yalla/yalla/ui/view/moment/MomentDetailCommentItemView$praise$1$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,702:1\n283#2,2:703\n*S KotlinDebug\n*F\n+ 1 MomentDetailCommentItemView.kt\ncom/yalla/yalla/ui/view/moment/MomentDetailCommentItemView$praise$1$1\n*L\n289#1:703,2\n*E\n"})
public final class oo00oO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailCommentItemView f56384OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Integer f56385OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo00oO(MomentDetailCommentItemView momentDetailCommentItemView, Integer num) {
        super(0);
        this.f56384OooO0Oo = momentDetailCommentItemView;
        this.f56385OooO0o0 = num;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentDetailCommentItemView momentDetailCommentItemView = this.f56384OooO0Oo;
        SVGAView praiseSvga = momentDetailCommentItemView.f30537OooO0Oo.f45062OooOOOO;
        Intrinsics.checkNotNullExpressionValue(praiseSvga, "praiseSvga");
        praiseSvga.setVisibility(4);
        oOO0O0 ooo0o0 = momentDetailCommentItemView.f30537OooO0Oo;
        ImageView praiseIv = ooo0o0.f45061OooOOO0;
        Intrinsics.checkNotNullExpressionValue(praiseIv, "praiseIv");
        o000O.OooOOOO(praiseIv);
        boolean zIsPraise = momentDetailCommentItemView.getItem().isPraise();
        ImageView imageView = ooo0o0.f45061OooOOO0;
        if (!zIsPraise || momentDetailCommentItemView.getItem().getPraiseNum() <= 0) {
            imageView.setImageResource(o0Oo0oo.ic_moment_comment_praise_gray);
        } else {
            z0 z0Var = z0.f57313OooO00o;
            Integer config = this.f56385OooO0o0;
            Intrinsics.checkNotNullExpressionValue(config, "$config");
            imageView.setImageResource(z0.OooO0O0(config.intValue()));
        }
        return Unit.INSTANCE;
    }
}
