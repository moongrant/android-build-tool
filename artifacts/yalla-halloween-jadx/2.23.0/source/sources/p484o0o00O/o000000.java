package p484o0o00O;

import android.widget.ImageView;
import com.code.android.uikit.svga.SVGAView;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.ui.activity.moment.postDetailCommentSonList.MomentReplyHeaderView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p579o0oOoo.oOOOOo0O;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.w6;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentReplyHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentReplyHeaderView.kt\ncom/yalla/yalla/ui/activity/moment/postDetailCommentSonList/MomentReplyHeaderView$praise$1$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,429:1\n283#2,2:430\n*S KotlinDebug\n*F\n+ 1 MomentReplyHeaderView.kt\ncom/yalla/yalla/ui/activity/moment/postDetailCommentSonList/MomentReplyHeaderView$praise$1$1\n*L\n277#1:430,2\n*E\n"})
public final class o000000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyHeaderView f47716OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Integer f47717OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentCommentDetailModel f47718OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000(MomentReplyHeaderView momentReplyHeaderView, MomentCommentDetailModel momentCommentDetailModel, Integer num) {
        super(0);
        this.f47716OooO0Oo = momentReplyHeaderView;
        this.f47718OooO0o0 = momentCommentDetailModel;
        this.f47717OooO0o = num;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentReplyHeaderView momentReplyHeaderView = this.f47716OooO0Oo;
        SVGAView sVGAView = momentReplyHeaderView.f26454OooO0o0.f59163OooOO0O;
        Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.praiseSvga");
        sVGAView.setVisibility(4);
        w6 w6Var = momentReplyHeaderView.f26454OooO0o0;
        w6Var.f59162OooOO0.setVisibility(0);
        MomentCommentDetailModel momentCommentDetailModel = this.f47718OooO0o0;
        boolean zIsPraise = momentCommentDetailModel.isPraise();
        ImageView imageView = w6Var.f59162OooOO0;
        if (!zIsPraise || momentCommentDetailModel.getPraiseNum() <= 0) {
            imageView.setImageResource(oOo00OO0.ic_moment_comment_praise_gray);
        } else {
            oOOOOo0O oooooo0o = oOOOOo0O.f56683OooO00o;
            Integer config = this.f47717OooO0o;
            Intrinsics.checkNotNullExpressionValue(config, "config");
            imageView.setImageResource(oOOOOo0O.OooO0O0(config.intValue()));
        }
        return Unit.INSTANCE;
    }
}
