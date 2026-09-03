package p495o0o00Oo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p541o0o0OoOO.oOO00000;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO f49624OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(OooO oooO) {
        super(2);
        this.f49624OooO0Oo = oooO;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1548327165, iIntValue, -1, "com.yalla.yalla.ui.activity.room.live.RoomActivityProxy.initRoomSide.<anonymous> (RoomActivityProxy.kt:90)");
            }
            oOO00000.f55226OooO00o.OooO00o(this.f49624OooO0Oo.f49617OooO0OO, composer2, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
