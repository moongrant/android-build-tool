package p519o0o0O0oO;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import com.code.android.util.o0000;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p158o00OoOOO.oo000o;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class r4 extends Lambda implements Function3<MutableState<Boolean>, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f53131OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f53132OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(boolean z, Function0<Unit> function0) {
        super(3);
        this.f53131OooO0Oo = z;
        this.f53132OooO0o0 = function0;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(MutableState<Boolean> mutableState, Composer composer, Integer num) {
        String strOooO0OO;
        String strOooO0OO2;
        MutableState<Boolean> it = mutableState;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(it, "it");
        if ((iIntValue & 14) == 0) {
            iIntValue |= composer2.changed(it) ? 4 : 2;
        }
        int i = iIntValue;
        if ((i & 91) == 18 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1822011199, i, -1, "com.yalla.yalla.ui.dialog.UserAddPowerSeeRoomDialogUtil.showUserAddPowerSeeRoomDialog.<anonymous> (UserAddPowerSeeRoomDialogUtil.kt:15)");
            }
            if (this.f53131OooO0Oo) {
                strOooO0OO = o0000.OooO0OO(oO00OOo0.user_add_power_see_room_friend);
                strOooO0OO2 = o0000.OooO0OO(oO00OOo0.Add_Friend);
            } else {
                strOooO0OO = o0000.OooO0OO(oO00OOo0.user_add_power_see_room_follow);
                strOooO0OO2 = o0000.OooO0OO(oO00OOo0.Follow);
            }
            oo000o.OooO0Oo(it, null, strOooO0OO, null, false, false, null, null, strOooO0OO2, false, null, false, this.f53132OooO0o0, null, false, false, null, q4.f53109OooO0Oo, null, null, composer2, i & 14, 12582912, 913146);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
