package p496o0o00o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.yalla.yalla.ui.activity.user.UserWelfareRecordActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p537o0o0OoO.o0O0OOOo;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0o0000 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserWelfareRecordActivity f49175OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0o0000(UserWelfareRecordActivity userWelfareRecordActivity) {
        super(2);
        this.f49175OooO0Oo = userWelfareRecordActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1427375962, iIntValue, -1, "com.yalla.yalla.ui.activity.user.UserWelfareRecordActivity.initComposeView.<anonymous> (UserWelfareRecordActivity.kt:87)");
            }
            UserWelfareRecordActivity userWelfareRecordActivity = this.f49175OooO0Oo;
            o0O0OOOo.OooO00o(userWelfareRecordActivity.f27384OooOo00, userWelfareRecordActivity.f27383OooOo0, userWelfareRecordActivity.f27385OooOo0O, composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
