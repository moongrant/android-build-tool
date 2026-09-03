package p556o0oOOooo;

import android.widget.ImageView;
import com.code.android.uikit.svga.SVGAView;
import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.ui.view.moment.MomentReplyItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p579o0oOoo.oOOOOo0O;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.x6;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nMomentReplyItemView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentReplyItemView.kt\ncom/yalla/yalla/ui/view/moment/MomentReplyItemView$praiseSon$1$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,417:1\n283#2,2:418\n*S KotlinDebug\n*F\n+ 1 MomentReplyItemView.kt\ncom/yalla/yalla/ui/view/moment/MomentReplyItemView$praiseSon$1$1\n*L\n256#1:418,2\n*E\n"})
public final class oO00OOo0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyItemView f56109OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Integer f56110OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentReplyModel f56111OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00OOo0(MomentReplyItemView momentReplyItemView, MomentReplyModel momentReplyModel, Integer num) {
        super(0);
        this.f56109OooO0Oo = momentReplyItemView;
        this.f56111OooO0o0 = momentReplyModel;
        this.f56110OooO0o = num;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentReplyItemView momentReplyItemView = this.f56109OooO0Oo;
        SVGAView sVGAView = momentReplyItemView.f31131OooO0Oo.f59283OooO0oO;
        Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.praiseSvgaSon");
        sVGAView.setVisibility(4);
        x6 x6Var = momentReplyItemView.f31131OooO0Oo;
        x6Var.f59281OooO0o.setVisibility(0);
        MomentReplyModel momentReplyModel = this.f56111OooO0o0;
        boolean zIsPraise = momentReplyModel.isPraise();
        ImageView imageView = x6Var.f59281OooO0o;
        if (!zIsPraise || momentReplyModel.getPraiseNum() <= 0) {
            imageView.setImageResource(oOo00OO0.ic_moment_comment_praise_gray);
        } else {
            oOOOOo0O oooooo0o = oOOOOo0O.f56683OooO00o;
            Integer config = this.f56110OooO0o;
            Intrinsics.checkNotNullExpressionValue(config, "config");
            imageView.setImageResource(oOOOOo0O.OooO0O0(config.intValue()));
        }
        return Unit.INSTANCE;
    }
}
