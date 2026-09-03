package p496o0o00o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.yalla.yalla.ui.activity.user.UserWelfareMallActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p537o0o0OoO.o0oOo0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0OO0O extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserWelfareMallActivity f49167OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OO0O(UserWelfareMallActivity userWelfareMallActivity) {
        super(2);
        this.f49167OooO0Oo = userWelfareMallActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1781868867, iIntValue, -1, "com.yalla.yalla.ui.activity.user.UserWelfareMallActivity.initComposeView.<anonymous> (UserWelfareMallActivity.kt:125)");
            }
            o0oOo0O0.OooO00o(UserWelfareMallActivity.OooOo(this.f49167OooO0Oo), composer2, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
