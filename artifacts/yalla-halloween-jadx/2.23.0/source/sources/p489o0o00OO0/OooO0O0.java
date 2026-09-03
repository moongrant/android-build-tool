package p489o0o00OO0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p533o0o0Oo0.o000O00O;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f48471OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(OooO0OO oooO0OO) {
        super(2);
        this.f48471OooO0Oo = oooO0OO;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1548327165, iIntValue, -1, "com.yalla.yalla.ui.activity.room.live.RoomActivityProxy.initRoomSide.<anonymous> (RoomActivityProxy.kt:89)");
            }
            o000O00O.f54710OooO00o.OooO00o(this.f48471OooO0Oo.f48475OooO0OO, composer2, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
