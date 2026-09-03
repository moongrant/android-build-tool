package p587o0oOooOO;

import androidx.compose.animation.OooOO0O;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class Oo0000 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ State<Function2<Composer, Integer, Unit>> f56737OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Oo0000(State<? extends Function2<? super Composer, ? super Integer, Unit>> state) {
        super(2);
        this.f56737OooO0Oo = state;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(434559869, iIntValue, -1, "com.yalla.yalla.ui.view.BottomSheetDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BottomSheetDialogProperties.kt:287)");
            }
            O0000000.OooO00o oooO00o = O0000000.f56719OooO0O0;
            if (OooOO0O.OooO00o(0, this.f56737OooO0Oo.getValue(), composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
