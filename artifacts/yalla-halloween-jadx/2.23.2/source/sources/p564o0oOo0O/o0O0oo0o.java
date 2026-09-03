package p564o0oOo0O;

import android.widget.ImageView;
import com.code.android.uikit.svga.SVGAView;
import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.ui.view.moment.MomentReplyItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p405o0Oo0OOO.oOOO00Oo;
import p562o0oOo000.o0Oo0oo;
import p590o0oOooo0.z0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentReplyItemView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentReplyItemView.kt\ncom/yalla/yalla/ui/view/moment/MomentReplyItemView$praiseSon$1$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,417:1\n283#2,2:418\n*S KotlinDebug\n*F\n+ 1 MomentReplyItemView.kt\ncom/yalla/yalla/ui/view/moment/MomentReplyItemView$praiseSon$1$1\n*L\n256#1:418,2\n*E\n"})
public final class o0O0oo0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyItemView f56353OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Integer f56354OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentReplyModel f56355OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0oo0o(MomentReplyItemView momentReplyItemView, MomentReplyModel momentReplyModel, Integer num) {
        super(0);
        this.f56353OooO0Oo = momentReplyItemView;
        this.f56355OooO0o0 = momentReplyModel;
        this.f56354OooO0o = num;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentReplyItemView momentReplyItemView = this.f56353OooO0Oo;
        SVGAView praiseSvgaSon = momentReplyItemView.f30590OooO0Oo.f45149OooO0oO;
        Intrinsics.checkNotNullExpressionValue(praiseSvgaSon, "praiseSvgaSon");
        praiseSvgaSon.setVisibility(4);
        oOOO00Oo oooo00oo = momentReplyItemView.f30590OooO0Oo;
        oooo00oo.f45147OooO0o.setVisibility(0);
        MomentReplyModel momentReplyModel = this.f56355OooO0o0;
        boolean zIsPraise = momentReplyModel.isPraise();
        ImageView imageView = oooo00oo.f45147OooO0o;
        if (!zIsPraise || momentReplyModel.getPraiseNum() <= 0) {
            imageView.setImageResource(o0Oo0oo.ic_moment_comment_praise_gray);
        } else {
            z0 z0Var = z0.f57313OooO00o;
            Integer config = this.f56354OooO0o;
            Intrinsics.checkNotNullExpressionValue(config, "$config");
            imageView.setImageResource(z0.OooO0O0(config.intValue()));
        }
        return Unit.INSTANCE;
    }
}
