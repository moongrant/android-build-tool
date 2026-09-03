package p484o0o00O;

import com.code.android.uikit.svga.SVGAView;
import com.yalla.yalla.ui.activity.moment.postDetailCommentSonList.MomentReplyHeaderView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentReplyHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentReplyHeaderView.kt\ncom/yalla/yalla/ui/activity/moment/postDetailCommentSonList/MomentReplyHeaderView$praise$1$2\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,429:1\n283#2,2:430\n*S KotlinDebug\n*F\n+ 1 MomentReplyHeaderView.kt\ncom/yalla/yalla/ui/activity/moment/postDetailCommentSonList/MomentReplyHeaderView$praise$1$2\n*L\n286#1:430,2\n*E\n"})
public final class o000000O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyHeaderView f47719OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000O(MomentReplyHeaderView momentReplyHeaderView) {
        super(0);
        this.f47719OooO0Oo = momentReplyHeaderView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentReplyHeaderView momentReplyHeaderView = this.f47719OooO0Oo;
        SVGAView sVGAView = momentReplyHeaderView.f26454OooO0o0.f59163OooOO0O;
        Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.praiseSvga");
        sVGAView.setVisibility(0);
        momentReplyHeaderView.f26454OooO0o0.f59162OooOO0.setVisibility(4);
        return Unit.INSTANCE;
    }
}
