package p492o0o00OO0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.code.android.util.o0000;
import com.yalla.yalla.ui.activity.moment.MomentPowerSelectActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p195o00o0OO0.o00000OO;
import p516o0o0O00o.o0O0oo0o;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentPowerSelectActivity f49152OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0(MomentPowerSelectActivity momentPowerSelectActivity) {
        super(2);
        this.f49152OooO0Oo = momentPowerSelectActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-332902437, iIntValue, -1, "com.yalla.yalla.ui.activity.moment.MomentPowerSelectActivity.initView.<anonymous> (MomentPowerSelectActivity.kt:81)");
            }
            o0O0oo0o.OooO00o(o0000.OooO0OO(o000000.Share_with), 0.0f, 0L, Integer.valueOf(o0Oo0oo.icv_close), null, new oo00o(this.f49152OooO0Oo), null, null, null, composer2, 0, 470);
            o00000OO.OooO0O0(false, composer2, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
