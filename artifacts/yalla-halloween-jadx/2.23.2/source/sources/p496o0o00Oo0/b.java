package p496o0o00Oo0;

import android.widget.ImageView;
import com.code.android.uikit.svga.SVGAView;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.ui.activity.moment.postDetailCommentSonList.MomentReplyHeaderView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p405o0Oo0OOO.oOOO00;
import p562o0oOo000.o0Oo0oo;
import p590o0oOooo0.z0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentReplyHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentReplyHeaderView.kt\ncom/yalla/yalla/ui/activity/moment/postDetailCommentSonList/MomentReplyHeaderView$praise$1$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,429:1\n283#2,2:430\n*S KotlinDebug\n*F\n+ 1 MomentReplyHeaderView.kt\ncom/yalla/yalla/ui/activity/moment/postDetailCommentSonList/MomentReplyHeaderView$praise$1$1\n*L\n277#1:430,2\n*E\n"})
public final class b extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyHeaderView f49637OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Integer f49638OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentCommentDetailModel f49639OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(MomentReplyHeaderView momentReplyHeaderView, MomentCommentDetailModel momentCommentDetailModel, Integer num) {
        super(0);
        this.f49637OooO0Oo = momentReplyHeaderView;
        this.f49639OooO0o0 = momentCommentDetailModel;
        this.f49638OooO0o = num;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentReplyHeaderView momentReplyHeaderView = this.f49637OooO0Oo;
        SVGAView praiseSvga = momentReplyHeaderView.f26002OooO0o0.f45132OooOO0O;
        Intrinsics.checkNotNullExpressionValue(praiseSvga, "praiseSvga");
        praiseSvga.setVisibility(4);
        oOOO00 oooo00 = momentReplyHeaderView.f26002OooO0o0;
        oooo00.f45131OooOO0.setVisibility(0);
        MomentCommentDetailModel momentCommentDetailModel = this.f49639OooO0o0;
        boolean zIsPraise = momentCommentDetailModel.isPraise();
        ImageView imageView = oooo00.f45131OooOO0;
        if (!zIsPraise || momentCommentDetailModel.getPraiseNum() <= 0) {
            imageView.setImageResource(o0Oo0oo.ic_moment_comment_praise_gray);
        } else {
            z0 z0Var = z0.f57313OooO00o;
            Integer config = this.f49638OooO0o;
            Intrinsics.checkNotNullExpressionValue(config, "$config");
            imageView.setImageResource(z0.OooO0O0(config.intValue()));
        }
        return Unit.INSTANCE;
    }
}
