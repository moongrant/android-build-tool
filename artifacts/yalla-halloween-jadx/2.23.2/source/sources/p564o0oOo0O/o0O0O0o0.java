package p564o0oOo0O;

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
import p405o0Oo0OOO.oOOO00Oo;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p590o0oOooo0.z0;
import p605o0oo0O0O.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentReplyItemView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentReplyItemView.kt\ncom/yalla/yalla/ui/view/moment/MomentReplyItemView$praiseSon$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,417:1\n283#2,2:418\n*S KotlinDebug\n*F\n+ 1 MomentReplyItemView.kt\ncom/yalla/yalla/ui/view/moment/MomentReplyItemView$praiseSon$1\n*L\n254#1:418,2\n*E\n"})
public final class o0O0O0o0 extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyItemView f56340OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentReplyModel f56341OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O0o0(MomentReplyItemView momentReplyItemView, MomentReplyModel momentReplyModel) {
        super(1);
        this.f56340OooO0Oo = momentReplyItemView;
        this.f56341OooO0o0 = momentReplyModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        Integer num2 = num;
        MomentReplyItemView momentReplyItemView = this.f56340OooO0Oo;
        TextView textView = momentReplyItemView.f30590OooO0Oo.f45148OooO0o0;
        MomentReplyModel momentReplyModel = this.f56341OooO0o0;
        textView.setText(o0O0O0Oo.OooO0o(momentReplyModel.getPraiseNum(), false));
        oOOO00Oo oooo00oo = momentReplyItemView.f30590OooO0Oo;
        oooo00oo.f45147OooO0o.setVisibility(0);
        int i = o0Oo0oo.ic_moment_comment_praise_gray;
        ImageView imageView = oooo00oo.f45147OooO0o;
        imageView.setImageResource(i);
        if (momentReplyModel.isPraise() && momentReplyModel.getPraiseNum() > 0) {
            z0 z0Var = z0.f57313OooO00o;
            Intrinsics.checkNotNull(num2);
            imageView.setImageResource(z0.OooO0O0(num2.intValue()));
        }
        SVGAView praiseSvgaSon = oooo00oo.f45149OooO0oO;
        Intrinsics.checkNotNullExpressionValue(praiseSvgaSon, "praiseSvgaSon");
        praiseSvgaSon.setVisibility(4);
        praiseSvgaSon.f13231OooOoo0 = new o0O0oo0o(momentReplyItemView, momentReplyModel, num2);
        praiseSvgaSon.f13230OooOoo = new o0O0O0Oo(momentReplyItemView);
        oooo00oo.f45148OooO0o0.setTextColor((!momentReplyModel.isPraise() || momentReplyModel.getPraiseNum() <= 0) ? o0000.OooO00o(o0OOO0o.color_333333_65) : o0000.OooO00o(o0OOO0o.color_333333));
        return Unit.INSTANCE;
    }
}
