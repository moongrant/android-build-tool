package p650o0ooo;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.yalla.yalla.ui.vm.main.MainRoomVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0 extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MainRoomVM f58766OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0(MainRoomVM mainRoomVM) {
        super(3);
        this.f58766OooO0Oo = mainRoomVM;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
        BoxScope Background = boxScope;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(Background, "$this$Background");
        if ((iIntValue & 14) == 0) {
            iIntValue |= composer2.changed(Background) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1900017304, iIntValue, -1, "com.yalla.yalla.ui.dialog.MainDialogBindMoreAccount.ShowAnimation.<anonymous>.<anonymous>.<anonymous> (MainDialogBindMoreAccount.kt:86)");
            }
            oOo000o0.OooO0OO(oOo000o0.f59027OooO00o, Background, this.f58766OooO0Oo, composer2, (iIntValue & 14) | 448);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
