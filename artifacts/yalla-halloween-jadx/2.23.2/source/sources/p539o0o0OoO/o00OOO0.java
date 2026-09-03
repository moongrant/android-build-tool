package p539o0o0OoO;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p230o00oOo0o.o0O0O00;
import p581o0oOoo.o0000O0O;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOO0 extends Lambda implements Function4<o0O0O00, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0000O0O f54575OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO0(o0000O0O o0000o0o2) {
        super(4);
        this.f54575OooO0Oo = o0000o0o2;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(o0O0O00 o0o0o00, Integer num, Composer composer, Integer num2) {
        o0O0O00 HorizontalPager = o0o0o00;
        int iIntValue = num.intValue();
        Composer composer2 = composer;
        int iIntValue2 = num2.intValue();
        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
        if ((iIntValue2 & 112) == 0) {
            iIntValue2 |= composer2.changed(iIntValue) ? 32 : 16;
        }
        if ((iIntValue2 & 721) == 144 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1244798364, iIntValue2, -1, "com.yalla.yalla.ui.screen.room.RoomUserActionRecordScreenContent.<anonymous>.<anonymous> (RoomUserActionRecordScreen.kt:153)");
            }
            o0000O0O o0000o0o2 = this.f54575OooO0Oo;
            if (iIntValue == 0) {
                composer2.startReplaceableGroup(-2067669311);
                o0oOO.OooO0OO(0, o0000o0o2.getSearchText(), o0000o0o2.f56589OooO0O0, o0000o0o2.f56593OooO0o0, composer2, 4614);
                composer2.endReplaceableGroup();
            } else if (iIntValue == 1) {
                composer2.startReplaceableGroup(-2067669196);
                o0oOO.OooO0OO(1, o0000o0o2.getSearchText(), o0000o0o2.f56590OooO0OO, o0000o0o2.f56592OooO0o, composer2, 4614);
                composer2.endReplaceableGroup();
            } else if (iIntValue != 2) {
                composer2.startReplaceableGroup(-2067668990);
                composer2.endReplaceableGroup();
            } else {
                composer2.startReplaceableGroup(-2067669095);
                o0oOO.OooO0OO(2, o0000o0o2.getSearchText(), o0000o0o2.f56591OooO0Oo, o0000o0o2.f56594OooO0oO, composer2, 4614);
                composer2.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
