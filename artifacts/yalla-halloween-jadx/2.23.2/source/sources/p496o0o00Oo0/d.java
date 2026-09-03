package p496o0o00Oo0;

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
import p405o0Oo0OOO.oOOO00;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p590o0oOooo0.z0;
import p605o0oo0O0O.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentReplyHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentReplyHeaderView.kt\ncom/yalla/yalla/ui/activity/moment/postDetailCommentSonList/MomentReplyHeaderView$praise$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,429:1\n283#2,2:430\n*S KotlinDebug\n*F\n+ 1 MomentReplyHeaderView.kt\ncom/yalla/yalla/ui/activity/moment/postDetailCommentSonList/MomentReplyHeaderView$praise$1\n*L\n275#1:430,2\n*E\n"})
public final class d extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyHeaderView f49641OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentCommentDetailModel f49642OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(MomentReplyHeaderView momentReplyHeaderView, MomentCommentDetailModel momentCommentDetailModel) {
        super(1);
        this.f49641OooO0Oo = momentReplyHeaderView;
        this.f49642OooO0o0 = momentCommentDetailModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        Integer num2 = num;
        MomentReplyHeaderView momentReplyHeaderView = this.f49641OooO0Oo;
        TextView textView = momentReplyHeaderView.f26002OooO0o0.f45122OooO;
        MomentCommentDetailModel momentCommentDetailModel = this.f49642OooO0o0;
        textView.setText(o0O0O0Oo.OooO0o(momentCommentDetailModel.getPraiseNum(), false));
        oOOO00 oooo00 = momentReplyHeaderView.f26002OooO0o0;
        oooo00.f45131OooOO0.setVisibility(0);
        int i = o0Oo0oo.ic_moment_comment_praise_gray;
        ImageView imageView = oooo00.f45131OooOO0;
        imageView.setImageResource(i);
        if (momentCommentDetailModel.isPraise() && momentCommentDetailModel.getPraiseNum() > 0) {
            z0 z0Var = z0.f57313OooO00o;
            Intrinsics.checkNotNull(num2);
            imageView.setImageResource(z0.OooO0O0(num2.intValue()));
        }
        SVGAView praiseSvga = oooo00.f45132OooOO0O;
        Intrinsics.checkNotNullExpressionValue(praiseSvga, "praiseSvga");
        praiseSvga.setVisibility(4);
        praiseSvga.f13231OooOoo0 = new b(momentReplyHeaderView, momentCommentDetailModel, num2);
        praiseSvga.f13230OooOoo = new c(momentReplyHeaderView);
        oooo00.f45122OooO.setTextColor((!momentCommentDetailModel.isPraise() || momentCommentDetailModel.getPraiseNum() <= 0) ? o0000.OooO00o(o0OOO0o.color_333333_65) : o0000.OooO00o(o0OOO0o.color_333333));
        return Unit.INSTANCE;
    }
}
