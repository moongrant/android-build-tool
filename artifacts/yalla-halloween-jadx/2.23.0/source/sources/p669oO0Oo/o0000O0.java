package p669oO0Oo;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.Dp;
import com.code.android.util.OooOO0;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p577o0oOoOoO.oOO000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nLiveRoomMemberTaskHostDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomMemberTaskHostDialog.kt\ncom/yalla/yalla/ui/dialog/room/ComposableSingletons$LiveRoomMemberTaskHostDialogKt$lambda-2$1$3$1$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,487:1\n154#2:488\n154#2:489\n*S KotlinDebug\n*F\n+ 1 LiveRoomMemberTaskHostDialog.kt\ncom/yalla/yalla/ui/dialog/room/ComposableSingletons$LiveRoomMemberTaskHostDialogKt$lambda-2$1$3$1$1$1\n*L\n120#1:488\n122#1:489\n*E\n"})
public final class o0000O0 extends Lambda implements Function3<LazyItemScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oOO000 f60445OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O0(oOO000 ooo000) {
        super(3);
        this.f60445OooO0Oo = ooo000;
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
                ComposerKt.traceEventStart(-228861459, iIntValue, -1, "com.yalla.yalla.ui.dialog.room.ComposableSingletons$LiveRoomMemberTaskHostDialogKt.lambda-2.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LiveRoomMemberTaskHostDialog.kt:117)");
            }
            oo0o0O0 oo0o0o0 = oo0o0O0.f60812OooO00o;
            oo0o0O0.OooO0oO(oo0o0o0, composer2, 6);
            OooOO0.OooO0o(Dp.m3765constructorimpl(24), null, composer2, 6, 2);
            oo0o0O0.OooO0o(oo0o0o0, this.f60445OooO0Oo, composer2, 56);
            OooOO0.OooO0o(Dp.m3765constructorimpl(16), null, composer2, 6, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
