package p484o0o00O;

import android.widget.ImageView;
import android.widget.TextView;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.ui.activity.moment.postDetailCommentSonList.MomentReplyHeaderView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p579o0oOoo.oOOOOo0O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oOo00OO0;
import p590o0oo0.OooOOOO;
import p641o0ooOOOO.w6;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentReplyHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentReplyHeaderView.kt\ncom/yalla/yalla/ui/activity/moment/postDetailCommentSonList/MomentReplyHeaderView$praise$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,429:1\n283#2,2:430\n*S KotlinDebug\n*F\n+ 1 MomentReplyHeaderView.kt\ncom/yalla/yalla/ui/activity/moment/postDetailCommentSonList/MomentReplyHeaderView$praise$1\n*L\n275#1:430,2\n*E\n"})
public final class o00000 extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyHeaderView f47714OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentCommentDetailModel f47715OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000(MomentReplyHeaderView momentReplyHeaderView, MomentCommentDetailModel momentCommentDetailModel) {
        super(1);
        this.f47714OooO0Oo = momentReplyHeaderView;
        this.f47715OooO0o0 = momentCommentDetailModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        Integer config = num;
        MomentReplyHeaderView momentReplyHeaderView = this.f47714OooO0Oo;
        TextView textView = momentReplyHeaderView.f26454OooO0o0.f59153OooO;
        MomentCommentDetailModel momentCommentDetailModel = this.f47715OooO0o0;
        textView.setText(OooOOOO.OooO0o(momentCommentDetailModel.getPraiseNum(), false));
        w6 w6Var = momentReplyHeaderView.f26454OooO0o0;
        w6Var.f59162OooOO0.setVisibility(0);
        int i = oOo00OO0.ic_moment_comment_praise_gray;
        ImageView imageView = w6Var.f59162OooOO0;
        imageView.setImageResource(i);
        if (momentCommentDetailModel.isPraise() && momentCommentDetailModel.getPraiseNum() > 0) {
            oOOOOo0O oooooo0o = oOOOOo0O.f56683OooO00o;
            Intrinsics.checkNotNullExpressionValue(config, "config");
            imageView.setImageResource(oOOOOo0O.OooO0O0(config.intValue()));
        }
        SVGAView sVGAView = w6Var.f59163OooOO0O;
        Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.praiseSvga");
        sVGAView.setVisibility(4);
        sVGAView.f10171OooOoo0 = new o000000(momentReplyHeaderView, momentCommentDetailModel, config);
        sVGAView.f10170OooOoo = new o000000O(momentReplyHeaderView);
        w6Var.f59153OooO.setTextColor((!momentCommentDetailModel.isPraise() || momentCommentDetailModel.getPraiseNum() <= 0) ? o0000.OooO00o(oO00O0o.color_333333_65) : o0000.OooO00o(oO00O0o.color_333333));
        return Unit.INSTANCE;
    }
}
