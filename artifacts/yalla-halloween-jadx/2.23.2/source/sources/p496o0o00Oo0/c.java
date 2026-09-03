package p496o0o00Oo0;

import com.code.android.uikit.svga.SVGAView;
import com.yalla.yalla.ui.activity.moment.postDetailCommentSonList.MomentReplyHeaderView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentReplyHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentReplyHeaderView.kt\ncom/yalla/yalla/ui/activity/moment/postDetailCommentSonList/MomentReplyHeaderView$praise$1$2\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,429:1\n283#2,2:430\n*S KotlinDebug\n*F\n+ 1 MomentReplyHeaderView.kt\ncom/yalla/yalla/ui/activity/moment/postDetailCommentSonList/MomentReplyHeaderView$praise$1$2\n*L\n286#1:430,2\n*E\n"})
public final class c extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyHeaderView f49640OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(MomentReplyHeaderView momentReplyHeaderView) {
        super(0);
        this.f49640OooO0Oo = momentReplyHeaderView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentReplyHeaderView momentReplyHeaderView = this.f49640OooO0Oo;
        SVGAView praiseSvga = momentReplyHeaderView.f26002OooO0o0.f45132OooOO0O;
        Intrinsics.checkNotNullExpressionValue(praiseSvga, "praiseSvga");
        praiseSvga.setVisibility(0);
        momentReplyHeaderView.f26002OooO0o0.f45131OooOO0.setVisibility(4);
        return Unit.INSTANCE;
    }
}
