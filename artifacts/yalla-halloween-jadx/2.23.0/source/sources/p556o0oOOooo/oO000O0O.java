package p556o0oOOooo;

import android.widget.ImageView;
import android.widget.TextView;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000;
import com.code.android.util.o000OO00;
import com.yalla.yalla.model.moment.MomentReplyModel;
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
@SourceDebugExtension({"SMAP\nMomentDetailCommentItemView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentDetailCommentItemView.kt\ncom/yalla/yalla/ui/view/moment/MomentDetailCommentItemView$praiseSon$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,702:1\n283#2,2:703\n*S KotlinDebug\n*F\n+ 1 MomentDetailCommentItemView.kt\ncom/yalla/yalla/ui/view/moment/MomentDetailCommentItemView$praiseSon$1\n*L\n538#1:703,2\n*E\n"})
public final class oO000O0O extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailCommentItemView f56094OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentReplyModel f56095OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000O0O(MomentDetailCommentItemView momentDetailCommentItemView, MomentReplyModel momentReplyModel) {
        super(1);
        this.f56094OooO0Oo = momentDetailCommentItemView;
        this.f56095OooO0o0 = momentReplyModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        Integer config = num;
        MomentDetailCommentItemView momentDetailCommentItemView = this.f56094OooO0Oo;
        TextView textView = momentDetailCommentItemView.f31082OooO0Oo.f58348OooOO0o;
        MomentReplyModel momentReplyModel = this.f56095OooO0o0;
        textView.setText(OooOOOO.OooO0o(momentReplyModel.getPraiseNum(), false));
        l6 l6Var = momentDetailCommentItemView.f31082OooO0Oo;
        ImageView imageView = l6Var.f58349OooOOO;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.praiseIvSon");
        o000OO00.OooOOOO(imageView);
        int i = oOo00OO0.ic_moment_comment_praise_gray;
        ImageView imageView2 = l6Var.f58349OooOOO;
        imageView2.setImageResource(i);
        if (momentReplyModel.isPraise() && momentReplyModel.getPraiseNum() > 0) {
            oOOOOo0O oooooo0o = oOOOOo0O.f56683OooO00o;
            Intrinsics.checkNotNullExpressionValue(config, "config");
            imageView2.setImageResource(oOOOOo0O.OooO0O0(config.intValue()));
        }
        SVGAView sVGAView = l6Var.f58352OooOOOo;
        Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.praiseSvgaSon");
        sVGAView.setVisibility(4);
        sVGAView.f10171OooOoo0 = new oO000(momentDetailCommentItemView, momentReplyModel, config);
        sVGAView.f10170OooOoo = new oO000O0(momentDetailCommentItemView);
        l6Var.f58348OooOO0o.setTextColor((!momentReplyModel.isPraise() || momentReplyModel.getPraiseNum() <= 0) ? o0000.OooO00o(oO00O0o.color_333333_65) : o0000.OooO00o(oO00O0o.color_333333));
        return Unit.INSTANCE;
    }
}
