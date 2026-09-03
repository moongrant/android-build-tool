package p485o0o00O0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.code.android.util.o0000;
import com.yalla.yalla.ui.activity.moment.MomentPowerSelectActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p149o00Oo0o0.o00000O;
import p507o0o00ooo.t1;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O00 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentPowerSelectActivity f47841OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O00(MomentPowerSelectActivity momentPowerSelectActivity) {
        super(2);
        this.f47841OooO0Oo = momentPowerSelectActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-332902437, iIntValue, -1, "com.yalla.yalla.ui.activity.moment.MomentPowerSelectActivity.initView.<anonymous> (MomentPowerSelectActivity.kt:80)");
            }
            t1.OooO00o(o0000.OooO0OO(oO00OOo0.Share_with), 0.0f, 0L, Integer.valueOf(oOo00OO0.icv_close), null, new o00O0(this.f47841OooO0Oo), null, null, null, composer2, 0, 470);
            o00000O.OooO0O0(false, composer2, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
