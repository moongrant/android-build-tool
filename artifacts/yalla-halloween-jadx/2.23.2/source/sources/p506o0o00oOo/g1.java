package p506o0o00oOo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.yalla.yalla.ui.activity.user.UserWelfareRecordActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p553o0oOOoOO.ooOOOOoo;

/* JADX INFO: loaded from: classes4.dex */
public final class g1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserWelfareRecordActivity f50410OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(UserWelfareRecordActivity userWelfareRecordActivity) {
        super(2);
        this.f50410OooO0Oo = userWelfareRecordActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1427375962, iIntValue, -1, "com.yalla.yalla.ui.activity.user.UserWelfareRecordActivity.initComposeView.<anonymous> (UserWelfareRecordActivity.kt:88)");
            }
            UserWelfareRecordActivity userWelfareRecordActivity = this.f50410OooO0Oo;
            ooOOOOoo.OooO00o(userWelfareRecordActivity.f26919OooOo00, userWelfareRecordActivity.f26918OooOo0, userWelfareRecordActivity.f26920OooOo0O, composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
