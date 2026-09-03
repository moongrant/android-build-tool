package p536o0o0Oo0o;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import com.yalla.yalla.ui.vm.moment.MomentUserListVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p507o0o00ooo.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOOoo00 extends Lambda implements Function3<LazyItemScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentUserListVM f55229OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOOoo00(MomentUserListVM momentUserListVM) {
        super(3);
        this.f55229OooO0Oo = momentUserListVM;
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
                ComposerKt.traceEventStart(460017398, iIntValue, -1, "com.yalla.yalla.ui.screen.user.UserMomentListContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UserMomentListScreen.kt:331)");
            }
            MomentUserListVM momentUserListVM = this.f55229OooO0Oo;
            EffectsKt.LaunchedEffect(momentUserListVM.getLoadMoreState().getValue(), new oOOO0OOO(momentUserListVM, null), composer2, 64);
            u0.OooO0O0(momentUserListVM.getLoadMoreState().getValue(), null, composer2, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
