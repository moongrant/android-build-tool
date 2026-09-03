package p485o0o00O0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p509o0o0O0.o00OOOOo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O000 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentSendActivity f47882OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000(MomentSendActivity momentSendActivity) {
        super(2);
        this.f47882OooO0Oo = momentSendActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(995593087, iIntValue, -1, "com.yalla.yalla.ui.activity.moment.MomentSendActivity.initView.<anonymous> (MomentSendActivity.kt:415)");
            }
            int i = MomentSendActivity.f26175Oooo0OO;
            MomentSendActivity momentSendActivity = this.f47882OooO0Oo;
            o00OOOOo.OooO00o(momentSendActivity.OooOoo0().getToolbarRightText(), momentSendActivity.OooOoo0().getToolbarIsClickable(), new o0oOOo(momentSendActivity), new o0O0o(momentSendActivity), composer2, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
