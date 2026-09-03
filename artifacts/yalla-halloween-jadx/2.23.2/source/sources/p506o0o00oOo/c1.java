package p506o0o00oOo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import com.yalla.yalla.ui.activity.user.UserWelfareMallActivity;
import com.yalla.yalla.ui.screen.user.vip.VipScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p553o0oOOoOO.oO000o00;

/* JADX INFO: loaded from: classes4.dex */
public final class c1 extends Lambda implements Function3<MutableState<Boolean>, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserWelfareMallActivity f50397OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(UserWelfareMallActivity userWelfareMallActivity) {
        super(3);
        this.f50397OooO0Oo = userWelfareMallActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(MutableState<Boolean> mutableState, Composer composer, Integer num) {
        MutableState<Boolean> it = mutableState;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(it, "it");
        if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(816363398, iIntValue, -1, "com.yalla.yalla.ui.activity.user.UserWelfareMallActivity.initComposeView.<anonymous> (UserWelfareMallActivity.kt:103)");
            }
            UserWelfareMallActivity userWelfareMallActivity = this.f50397OooO0Oo;
            oO000o00.OooO00o(UserWelfareMallActivity.OooOo(userWelfareMallActivity).getShowProfilePreViewDialog(), UserWelfareMallActivity.OooOo(userWelfareMallActivity).getCurrentUserWelfareModel(), UserWelfareMallActivity.OooOo(userWelfareMallActivity).getShowBuyDialog(), composer2, 64);
            VipScreen.INSTANCE.BuyConfirmDialog(UserWelfareMallActivity.OooOo(userWelfareMallActivity), a1.f50391OooO0Oo, new b1(userWelfareMallActivity), composer2, 3128);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
