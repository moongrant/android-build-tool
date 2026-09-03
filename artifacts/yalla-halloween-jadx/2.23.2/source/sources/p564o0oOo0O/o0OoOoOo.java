package p564o0oOo0O;

import android.widget.ImageView;
import android.widget.TextView;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000;
import com.code.android.util.o000O;
import com.yalla.yalla.model.moment.MomentReplyModel;
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
@SourceDebugExtension({"SMAP\nMomentDetailCommentItemView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentDetailCommentItemView.kt\ncom/yalla/yalla/ui/view/moment/MomentDetailCommentItemView$praiseSon$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,702:1\n283#2,2:703\n*S KotlinDebug\n*F\n+ 1 MomentDetailCommentItemView.kt\ncom/yalla/yalla/ui/view/moment/MomentDetailCommentItemView$praiseSon$1\n*L\n538#1:703,2\n*E\n"})
public final class o0OoOoOo extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailCommentItemView f56374OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentReplyModel f56375OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOoOo(MomentDetailCommentItemView momentDetailCommentItemView, MomentReplyModel momentReplyModel) {
        super(1);
        this.f56374OooO0Oo = momentDetailCommentItemView;
        this.f56375OooO0o0 = momentReplyModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        Integer num2 = num;
        MomentDetailCommentItemView momentDetailCommentItemView = this.f56374OooO0Oo;
        TextView textView = momentDetailCommentItemView.f30537OooO0Oo.f45059OooOO0o;
        MomentReplyModel momentReplyModel = this.f56375OooO0o0;
        textView.setText(o0O0O0Oo.OooO0o(momentReplyModel.getPraiseNum(), false));
        oOO0O0 ooo0o0 = momentDetailCommentItemView.f30537OooO0Oo;
        ImageView praiseIvSon = ooo0o0.f45060OooOOO;
        Intrinsics.checkNotNullExpressionValue(praiseIvSon, "praiseIvSon");
        o000O.OooOOOO(praiseIvSon);
        int i = o0Oo0oo.ic_moment_comment_praise_gray;
        ImageView imageView = ooo0o0.f45060OooOOO;
        imageView.setImageResource(i);
        if (momentReplyModel.isPraise() && momentReplyModel.getPraiseNum() > 0) {
            z0 z0Var = z0.f57313OooO00o;
            Intrinsics.checkNotNull(num2);
            imageView.setImageResource(z0.OooO0O0(num2.intValue()));
        }
        SVGAView praiseSvgaSon = ooo0o0.f45063OooOOOo;
        Intrinsics.checkNotNullExpressionValue(praiseSvgaSon, "praiseSvgaSon");
        praiseSvgaSon.setVisibility(4);
        praiseSvgaSon.f13231OooOoo0 = new o0O000(momentDetailCommentItemView, momentReplyModel, num2);
        praiseSvgaSon.f13230OooOoo = new o0O000O(momentDetailCommentItemView);
        ooo0o0.f45059OooOO0o.setTextColor((!momentReplyModel.isPraise() || momentReplyModel.getPraiseNum() <= 0) ? o0000.OooO00o(o0OOO0o.color_333333_65) : o0000.OooO00o(o0OOO0o.color_333333));
        return Unit.INSTANCE;
    }
}
