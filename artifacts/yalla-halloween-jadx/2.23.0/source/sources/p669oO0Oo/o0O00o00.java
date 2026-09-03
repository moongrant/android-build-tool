package p669oO0Oo;

import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00o00 extends Lambda implements Function3<LazyGridItemScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f60669OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00o00(MixedRoomActivity mixedRoomActivity) {
        super(3);
        this.f60669OooO0Oo = mixedRoomActivity;
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
            o0O00OOO.OooO0oO(this.f60669OooO0Oo, composer2, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
