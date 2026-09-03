package p506o0o00oOo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p650o0ooo.q2;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO000 extends Lambda implements Function3<MutableState<Boolean>, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f50515OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO000(UserInfoActivity userInfoActivity) {
        super(3);
        this.f50515OooO0Oo = userInfoActivity;
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
                ComposerKt.traceEventStart(-450448260, iIntValue, -1, "com.yalla.yalla.ui.activity.user.UserInfoActivity.initComposeView.<anonymous> (UserInfoActivity.kt:170)");
            }
            q2 q2Var = q2.f59127OooO00o;
            UserInfoActivity userInfoActivity = this.f50515OooO0Oo;
            q2Var.OooO00o(userInfoActivity.OooOooo().getHalfDialogWebPageInfo(), new oOO0000(userInfoActivity), composer2, 392);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
