package p564o0oOo0O;

import android.widget.ImageView;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o000O;
import com.yalla.yalla.model.moment.MomentReplyModel;
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
@SourceDebugExtension({"SMAP\nMomentDetailCommentItemView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentDetailCommentItemView.kt\ncom/yalla/yalla/ui/view/moment/MomentDetailCommentItemView$praiseSon$1$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,702:1\n283#2,2:703\n*S KotlinDebug\n*F\n+ 1 MomentDetailCommentItemView.kt\ncom/yalla/yalla/ui/view/moment/MomentDetailCommentItemView$praiseSon$1$1\n*L\n540#1:703,2\n*E\n"})
public final class o0O000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailCommentItemView f56320OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Integer f56321OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentReplyModel f56322OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000(MomentDetailCommentItemView momentDetailCommentItemView, MomentReplyModel momentReplyModel, Integer num) {
        super(0);
        this.f56320OooO0Oo = momentDetailCommentItemView;
        this.f56322OooO0o0 = momentReplyModel;
        this.f56321OooO0o = num;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentDetailCommentItemView momentDetailCommentItemView = this.f56320OooO0Oo;
        SVGAView praiseSvgaSon = momentDetailCommentItemView.f30537OooO0Oo.f45063OooOOOo;
        Intrinsics.checkNotNullExpressionValue(praiseSvgaSon, "praiseSvgaSon");
        praiseSvgaSon.setVisibility(4);
        oOO0O0 ooo0o0 = momentDetailCommentItemView.f30537OooO0Oo;
        ImageView praiseIvSon = ooo0o0.f45060OooOOO;
        Intrinsics.checkNotNullExpressionValue(praiseIvSon, "praiseIvSon");
        o000O.OooOOOO(praiseIvSon);
        MomentReplyModel momentReplyModel = this.f56322OooO0o0;
        boolean zIsPraise = momentReplyModel.isPraise();
        ImageView imageView = ooo0o0.f45060OooOOO;
        if (!zIsPraise || momentReplyModel.getPraiseNum() <= 0) {
            imageView.setImageResource(o0Oo0oo.ic_moment_comment_praise_gray);
        } else {
            z0 z0Var = z0.f57313OooO00o;
            Integer config = this.f56321OooO0o;
            Intrinsics.checkNotNullExpressionValue(config, "$config");
            imageView.setImageResource(z0.OooO0O0(config.intValue()));
        }
        return Unit.INSTANCE;
    }
}
