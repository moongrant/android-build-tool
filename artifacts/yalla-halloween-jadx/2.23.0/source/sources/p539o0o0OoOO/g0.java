package p539o0o0OoOO;

import androidx.compose.animation.OooOO0O;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class g0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ State<Function2<Composer, Integer, Unit>> f55544OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g0(State<? extends Function2<? super Composer, ? super Integer, Unit>> state) {
        super(2);
        this.f55544OooO0Oo = state;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(434559869, iIntValue, -1, "com.yalla.yalla.ui.view.BottomSheetDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BottomSheetDialogProperties.kt:286)");
            }
            d0.OooO00o oooO00o = d0.f55510OooO0O0;
            if (OooOO0O.OooO00o(0, this.f55544OooO0Oo.getValue(), composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
