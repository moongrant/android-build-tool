package p506o0o00oOo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.yalla.yalla.ui.activity.user.UserWelfareMallActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p553o0oOOoOO.oO00OOOo;

/* JADX INFO: loaded from: classes4.dex */
public final class d1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserWelfareMallActivity f50401OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(UserWelfareMallActivity userWelfareMallActivity) {
        super(2);
        this.f50401OooO0Oo = userWelfareMallActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(953291860, iIntValue, -1, "com.yalla.yalla.ui.activity.user.UserWelfareMallActivity.initComposeView.<anonymous> (UserWelfareMallActivity.kt:123)");
            }
            UserWelfareMallActivity userWelfareMallActivity = this.f50401OooO0Oo;
            oO00OOOo.OooO00o(((Number) userWelfareMallActivity.f26910OooOo0O.getValue()).longValue(), ((Number) userWelfareMallActivity.f26911OooOo0o.getValue()).longValue(), ((Boolean) userWelfareMallActivity.f26907OooOo.getValue()).booleanValue(), composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
