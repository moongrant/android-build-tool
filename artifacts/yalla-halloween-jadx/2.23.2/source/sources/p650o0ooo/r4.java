package p650o0ooo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import com.code.android.util.o0000;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p207o00o0oO0.o000O0Oo;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class r4 extends Lambda implements Function3<MutableState<Boolean>, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f59148OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f59149OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(boolean z, Function0<Unit> function0) {
        super(3);
        this.f59148OooO0Oo = z;
        this.f59149OooO0o0 = function0;
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
                ComposerKt.traceEventStart(-1822011199, i, -1, "com.yalla.yalla.ui.dialog.UserAddPowerSeeRoomDialogUtil.showUserAddPowerSeeRoomDialog.<anonymous> (UserAddPowerSeeRoomDialogUtil.kt:16)");
            }
            if (this.f59148OooO0Oo) {
                strOooO0OO = o0000.OooO0OO(o000000.user_add_power_see_room_friend);
                strOooO0OO2 = o0000.OooO0OO(o000000.Add_Friend);
            } else {
                strOooO0OO = o0000.OooO0OO(o000000.user_add_power_see_room_follow);
                strOooO0OO2 = o0000.OooO0OO(o000000.Follow);
            }
            o000O0Oo.OooO0Oo(it, null, strOooO0OO, null, false, false, null, null, strOooO0OO2, false, null, false, this.f59149OooO0o0, null, false, false, null, q4.f59140OooO0Oo, null, null, composer2, i & 14, 12582912, 913146);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
