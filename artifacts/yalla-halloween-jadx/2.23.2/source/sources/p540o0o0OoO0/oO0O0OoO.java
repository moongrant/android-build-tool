package p540o0o0OoO0;

import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O0OoO extends Lambda implements Function3<LazyGridItemScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f54976OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O0OoO(MixedRoomActivity mixedRoomActivity) {
        super(3);
        this.f54976OooO0Oo = mixedRoomActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(LazyGridItemScope lazyGridItemScope, Composer composer, Integer num) {
        LazyGridItemScope item = lazyGridItemScope;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1003043122, iIntValue, -1, "com.yalla.yalla.ui.dialog.room.LiveRoomMenuContent.<anonymous>.<anonymous>.<anonymous> (LiveRoomMenuDialog.kt:102)");
            }
            oO000Oo.OooO0oO(this.f54976OooO0Oo, composer2, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
