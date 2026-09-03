package p531o0o0OOoo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p184o00o00o.OooOo00;
import p577o0oOoOoO.oOO00;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends Lambda implements Function4<OooOo00, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oOO00 f54531OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(oOO00 ooo00) {
        super(4);
        this.f54531OooO0Oo = ooo00;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(OooOo00 oooOo00, Integer num, Composer composer, Integer num2) {
        int i;
        OooOo00 HorizontalPager = oooOo00;
        int iIntValue = num.intValue();
        Composer composer2 = composer;
        int iIntValue2 = num2.intValue();
        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
        if ((iIntValue2 & 112) == 0) {
            i = (composer2.changed(iIntValue) ? 32 : 16) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((i & 721) == 144 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1244798364, iIntValue2, -1, "com.yalla.yalla.ui.screen.room.RoomUserActionRecordScreenContent.<anonymous>.<anonymous> (RoomUserActionRecordScreen.kt:152)");
            }
            oOO00 ooo00 = this.f54531OooO0Oo;
            if (iIntValue == 0) {
                composer2.startReplaceableGroup(-2067669311);
                z.OooO0OO(0, ooo00.getSearchText(), ooo00.f56340OooO0O0, ooo00.f56344OooO0o0, composer2, 4614);
                composer2.endReplaceableGroup();
            } else if (iIntValue == 1) {
                composer2.startReplaceableGroup(-2067669196);
                z.OooO0OO(1, ooo00.getSearchText(), ooo00.f56341OooO0OO, ooo00.f56343OooO0o, composer2, 4614);
                composer2.endReplaceableGroup();
            } else if (iIntValue != 2) {
                composer2.startReplaceableGroup(-2067668990);
                composer2.endReplaceableGroup();
            } else {
                composer2.startReplaceableGroup(-2067669095);
                z.OooO0OO(2, ooo00.getSearchText(), ooo00.f56342OooO0Oo, ooo00.f56345OooO0oO, composer2, 4614);
                composer2.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
