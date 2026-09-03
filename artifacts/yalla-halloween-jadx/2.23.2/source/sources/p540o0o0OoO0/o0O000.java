package p540o0o0OoO0;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.yalla.yalla.model.room.RoomMemberTaskHostInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p107o000ooO0.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O000 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOOOO<RoomMemberTaskHostInfoModel> f54724OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000(OooOOOO<RoomMemberTaskHostInfoModel> oooOOOO) {
        super(4);
        this.f54724OooO0Oo = oooOOOO;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
        LazyItemScope items = lazyItemScope;
        int iIntValue = num.intValue();
        Composer composer2 = composer;
        int iIntValue2 = num2.intValue();
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((iIntValue2 & 112) == 0) {
            iIntValue2 |= composer2.changed(iIntValue) ? 32 : 16;
        }
        if ((iIntValue2 & 721) == 144 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(217249988, iIntValue2, -1, "com.yalla.yalla.ui.dialog.room.ComposableSingletons$LiveRoomMemberTaskHostDialogKt.lambda-2.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LiveRoomMemberTaskHostDialog.kt:124)");
            }
            RoomMemberTaskHostInfoModel roomMemberTaskHostInfoModelOooO00o = this.f54724OooO0Oo.OooO00o(iIntValue);
            if (roomMemberTaskHostInfoModelOooO00o != null) {
                o0OO00OO.f54822OooO00o.OooO0OO(roomMemberTaskHostInfoModelOooO00o, composer2, 56);
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
