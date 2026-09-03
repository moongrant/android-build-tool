package p669oO0Oo;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.yalla.yalla.model.room.RoomMemberTaskHostInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o000O0.OooO0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO0O0<RoomMemberTaskHostInfoModel> f60500OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO(OooO0O0<RoomMemberTaskHostInfoModel> oooO0O0) {
        super(4);
        this.f60500OooO0Oo = oooO0O0;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
        int i;
        LazyItemScope items = lazyItemScope;
        int iIntValue = num.intValue();
        Composer composer2 = composer;
        int iIntValue2 = num2.intValue();
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((iIntValue2 & 112) == 0) {
            i = (composer2.changed(iIntValue) ? 32 : 16) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((i & 721) == 144 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(217249988, iIntValue2, -1, "com.yalla.yalla.ui.dialog.room.ComposableSingletons$LiveRoomMemberTaskHostDialogKt.lambda-2.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LiveRoomMemberTaskHostDialog.kt:123)");
            }
            RoomMemberTaskHostInfoModel roomMemberTaskHostInfoModelOooO00o = this.f60500OooO0Oo.OooO00o(iIntValue);
            if (roomMemberTaskHostInfoModelOooO00o != null) {
                oo0o0O0.f60812OooO00o.OooO0OO(roomMemberTaskHostInfoModelOooO00o, composer2, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
