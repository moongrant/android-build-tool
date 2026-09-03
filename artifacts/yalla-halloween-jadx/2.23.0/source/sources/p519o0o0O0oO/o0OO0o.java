package p519o0o0O0oO;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import com.yalla.yalla.model.RecommendNewPostModel;
import com.yalla.yalla.ui.vm.moment.MomentFollowingTopUserVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p507o0o00ooo.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO0o extends Lambda implements Function3<LazyItemScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentFollowingTopUserVM f52723OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RecommendNewPostModel f52724OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO0o(MomentFollowingTopUserVM momentFollowingTopUserVM, RecommendNewPostModel recommendNewPostModel) {
        super(3);
        this.f52723OooO0Oo = momentFollowingTopUserVM;
        this.f52724OooO0o0 = recommendNewPostModel;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        LazyItemScope item = lazyItemScope;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-259800009, iIntValue, -1, "com.yalla.yalla.ui.dialog.FollowingUserMomentContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FollowingMomentTopUserDialog.kt:173)");
            }
            Unit unit = Unit.INSTANCE;
            MomentFollowingTopUserVM momentFollowingTopUserVM = this.f52723OooO0Oo;
            EffectsKt.LaunchedEffect(unit, new o0OO0o00(momentFollowingTopUserVM, this.f52724OooO0o0, null), composer2, 70);
            u0.OooO0O0(momentFollowingTopUserVM.getLoadMoreState().getValue(), null, composer2, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
