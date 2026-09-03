package p556o0oOOooo;

import android.widget.ImageView;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000;
import com.code.android.util.o000OO00;
import com.yalla.yalla.ui.fragment.moment.MomentDetailCommentFragment;
import com.yalla.yalla.ui.view.moment.MomentDetailCommentItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p579o0oOoo.oOOOOo0O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oOo00OO0;
import p590o0oo0.OooOOOO;
import p641o0ooOOOO.l6;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nMomentDetailCommentItemView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentDetailCommentItemView.kt\ncom/yalla/yalla/ui/view/moment/MomentDetailCommentItemView$praise$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,702:1\n283#2,2:703\n*S KotlinDebug\n*F\n+ 1 MomentDetailCommentItemView.kt\ncom/yalla/yalla/ui/view/moment/MomentDetailCommentItemView$praise$1\n*L\n287#1:703,2\n*E\n"})
public final class oO00000o extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailCommentItemView f56088OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00000o(MomentDetailCommentItemView momentDetailCommentItemView) {
        super(1);
        this.f56088OooO0Oo = momentDetailCommentItemView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        Integer config = num;
        MomentDetailCommentItemView momentDetailCommentItemView = this.f56088OooO0Oo;
        boolean z = false;
        momentDetailCommentItemView.f31082OooO0Oo.f58347OooOO0O.setText(OooOOOO.OooO0o(momentDetailCommentItemView.getItem().getPraiseNum(), false));
        l6 l6Var = momentDetailCommentItemView.f31082OooO0Oo;
        ImageView imageView = l6Var.f58350OooOOO0;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.praiseIv");
        o000OO00.OooOOOO(imageView);
        int i = oOo00OO0.ic_moment_comment_praise_gray;
        ImageView imageView2 = l6Var.f58350OooOOO0;
        imageView2.setImageResource(i);
        if (momentDetailCommentItemView.getItem().isPraise() && momentDetailCommentItemView.getItem().getPraiseNum() > 0) {
            oOOOOo0O oooooo0o = oOOOOo0O.f56683OooO00o;
            Intrinsics.checkNotNullExpressionValue(config, "config");
            imageView2.setImageResource(oOOOOo0O.OooO0O0(config.intValue()));
        }
        SVGAView sVGAView = l6Var.f58351OooOOOO;
        Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.praiseSvga");
        sVGAView.setVisibility(4);
        sVGAView.f10171OooOoo0 = new o(momentDetailCommentItemView, config);
        sVGAView.f10170OooOoo = new oO00000(momentDetailCommentItemView);
        l6Var.f58347OooOO0O.setTextColor((!momentDetailCommentItemView.getItem().isPraise() || momentDetailCommentItemView.getItem().getPraiseNum() <= 0) ? o0000.OooO00o(oO00O0o.color_333333_65) : o0000.OooO00o(oO00O0o.color_333333));
        ImageView imageView3 = l6Var.f58345OooO0oo;
        Intrinsics.checkNotNullExpressionValue(imageView3, "binding.hot");
        o000OO00.OooO0O0(imageView3);
        MomentDetailCommentFragment fragment = momentDetailCommentItemView.getFragment();
        if (fragment != null && fragment.getMSortType() == 0) {
            z = true;
        }
        if (z && momentDetailCommentItemView.getItem().getIsFeature() == 1) {
            Intrinsics.checkNotNullExpressionValue(imageView3, "binding.hot");
            o000OO00.OooOOOO(imageView3);
        }
        return Unit.INSTANCE;
    }
}
