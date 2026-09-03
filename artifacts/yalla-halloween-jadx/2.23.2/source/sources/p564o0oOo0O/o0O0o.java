package p564o0oOo0O;

import android.widget.ImageView;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000;
import com.code.android.util.o000O;
import com.yalla.yalla.ui.fragment.moment.MomentDetailCommentFragment;
import com.yalla.yalla.ui.view.moment.MomentDetailCommentItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p405o0Oo0OOO.oOO0O0;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p590o0oOooo0.z0;
import p605o0oo0O0O.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentDetailCommentItemView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentDetailCommentItemView.kt\ncom/yalla/yalla/ui/view/moment/MomentDetailCommentItemView$praise$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,702:1\n283#2,2:703\n*S KotlinDebug\n*F\n+ 1 MomentDetailCommentItemView.kt\ncom/yalla/yalla/ui/view/moment/MomentDetailCommentItemView$praise$1\n*L\n287#1:703,2\n*E\n"})
public final class o0O0o extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailCommentItemView f56347OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o(MomentDetailCommentItemView momentDetailCommentItemView) {
        super(1);
        this.f56347OooO0Oo = momentDetailCommentItemView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        Integer num2 = num;
        MomentDetailCommentItemView momentDetailCommentItemView = this.f56347OooO0Oo;
        boolean z = false;
        momentDetailCommentItemView.f30537OooO0Oo.f45058OooOO0O.setText(o0O0O0Oo.OooO0o(momentDetailCommentItemView.getItem().getPraiseNum(), false));
        oOO0O0 ooo0o0 = momentDetailCommentItemView.f30537OooO0Oo;
        ImageView praiseIv = ooo0o0.f45061OooOOO0;
        Intrinsics.checkNotNullExpressionValue(praiseIv, "praiseIv");
        o000O.OooOOOO(praiseIv);
        int i = o0Oo0oo.ic_moment_comment_praise_gray;
        ImageView imageView = ooo0o0.f45061OooOOO0;
        imageView.setImageResource(i);
        if (momentDetailCommentItemView.getItem().isPraise() && momentDetailCommentItemView.getItem().getPraiseNum() > 0) {
            z0 z0Var = z0.f57313OooO00o;
            Intrinsics.checkNotNull(num2);
            imageView.setImageResource(z0.OooO0O0(num2.intValue()));
        }
        SVGAView praiseSvga = ooo0o0.f45062OooOOOO;
        Intrinsics.checkNotNullExpressionValue(praiseSvga, "praiseSvga");
        praiseSvga.setVisibility(4);
        praiseSvga.f13231OooOoo0 = new oo00oO(momentDetailCommentItemView, num2);
        praiseSvga.f13230OooOoo = new o0oOOo(momentDetailCommentItemView);
        ooo0o0.f45058OooOO0O.setTextColor((!momentDetailCommentItemView.getItem().isPraise() || momentDetailCommentItemView.getItem().getPraiseNum() <= 0) ? o0000.OooO00o(o0OOO0o.color_333333_65) : o0000.OooO00o(o0OOO0o.color_333333));
        ImageView hot = ooo0o0.f45056OooO0oo;
        Intrinsics.checkNotNullExpressionValue(hot, "hot");
        o000O.OooO0O0(hot);
        MomentDetailCommentFragment fragment = momentDetailCommentItemView.getFragment();
        if (fragment != null && fragment.getMSortType() == 0) {
            z = true;
        }
        if (z && momentDetailCommentItemView.getItem().getIsFeature() == 1) {
            Intrinsics.checkNotNullExpressionValue(hot, "hot");
            o000O.OooOOOO(hot);
        }
        return Unit.INSTANCE;
    }
}
