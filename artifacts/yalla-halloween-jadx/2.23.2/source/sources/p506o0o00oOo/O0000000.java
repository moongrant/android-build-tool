package p506o0o00oOo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import com.code.android.util.o0000;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p207o00o0oO0.o000O0Oo;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class O0000000 extends Lambda implements Function3<MutableState<Boolean>, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f50384OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0000000(UserInfoActivity userInfoActivity) {
        super(3);
        this.f50384OooO0Oo = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(MutableState<Boolean> mutableState, Composer composer, Integer num) {
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
                ComposerKt.traceEventStart(-581127448, i, -1, "com.yalla.yalla.ui.activity.user.UserInfoActivity.showUnFollowDialog.<anonymous> (UserInfoActivity.kt:1508)");
            }
            int i2 = o000000.Unfollow;
            o000O0Oo.OooO0Oo(it, o0000.OooO0OO(i2), o0000.OooO0OO(o000000.unFollow_tips), null, false, false, null, null, o0000.OooO0OO(i2), false, null, false, new oo000000(this.f50384OooO0Oo), null, false, false, null, oo00.f50574OooO0Oo, null, null, composer2, i & 14, 12582912, 913144);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
