package p556o0oOOooo;

import android.widget.ImageView;
import android.widget.TextView;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000;
import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.ui.view.moment.MomentReplyItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p579o0oOoo.oOOOOo0O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oOo00OO0;
import p590o0oo0.OooOOOO;
import p641o0ooOOOO.x6;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nMomentReplyItemView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentReplyItemView.kt\ncom/yalla/yalla/ui/view/moment/MomentReplyItemView$praiseSon$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,417:1\n283#2,2:418\n*S KotlinDebug\n*F\n+ 1 MomentReplyItemView.kt\ncom/yalla/yalla/ui/view/moment/MomentReplyItemView$praiseSon$1\n*L\n254#1:418,2\n*E\n"})
public final class oO00Oo0 extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyItemView f56112OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentReplyModel f56113OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00Oo0(MomentReplyItemView momentReplyItemView, MomentReplyModel momentReplyModel) {
        super(1);
        this.f56112OooO0Oo = momentReplyItemView;
        this.f56113OooO0o0 = momentReplyModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        Integer config = num;
        MomentReplyItemView momentReplyItemView = this.f56112OooO0Oo;
        TextView textView = momentReplyItemView.f31131OooO0Oo.f59282OooO0o0;
        MomentReplyModel momentReplyModel = this.f56113OooO0o0;
        textView.setText(OooOOOO.OooO0o(momentReplyModel.getPraiseNum(), false));
        x6 x6Var = momentReplyItemView.f31131OooO0Oo;
        x6Var.f59281OooO0o.setVisibility(0);
        int i = oOo00OO0.ic_moment_comment_praise_gray;
        ImageView imageView = x6Var.f59281OooO0o;
        imageView.setImageResource(i);
        if (momentReplyModel.isPraise() && momentReplyModel.getPraiseNum() > 0) {
            oOOOOo0O oooooo0o = oOOOOo0O.f56683OooO00o;
            Intrinsics.checkNotNullExpressionValue(config, "config");
            imageView.setImageResource(oOOOOo0O.OooO0O0(config.intValue()));
        }
        SVGAView sVGAView = x6Var.f59283OooO0oO;
        Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.praiseSvgaSon");
        sVGAView.setVisibility(4);
        sVGAView.f10171OooOoo0 = new oO00OOo0(momentReplyItemView, momentReplyModel, config);
        sVGAView.f10170OooOoo = new oO00Oo00(momentReplyItemView);
        x6Var.f59282OooO0o0.setTextColor((!momentReplyModel.isPraise() || momentReplyModel.getPraiseNum() <= 0) ? o0000.OooO00o(oO00O0o.color_333333_65) : o0000.OooO00o(oO00O0o.color_333333));
        return Unit.INSTANCE;
    }
}
