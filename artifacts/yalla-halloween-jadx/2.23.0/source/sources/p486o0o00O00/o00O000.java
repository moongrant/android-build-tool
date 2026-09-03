package p486o0o00O00;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.yalla.yalla.ui.activity.main.MainSearchActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p507o0o00ooo.t1;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O000 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MainSearchActivity f48300OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000(MainSearchActivity mainSearchActivity) {
        super(2);
        this.f48300OooO0Oo = mainSearchActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1621142074, iIntValue, -1, "com.yalla.yalla.ui.activity.main.MainSearchActivity.initView.<anonymous> (MainSearchActivity.kt:90)");
            }
            t1.OooO00o(null, 0.0f, 0L, null, null, null, ComposableLambdaKt.composableLambda(composer2, -125996508, true, new o00oOoo(this.f48300OooO0Oo)), null, null, composer2, 1572864, 447);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
