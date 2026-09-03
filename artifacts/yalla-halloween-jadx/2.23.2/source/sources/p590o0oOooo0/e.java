package p590o0oOooo0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p650o0ooo.q2;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends Lambda implements Function3<MutableState<Boolean>, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ l f57112OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l lVar) {
        super(3);
        this.f57112OooO0Oo = lVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(MutableState<Boolean> mutableState, Composer composer, Integer num) {
        MutableState<Boolean> it = mutableState;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(it, "it");
        if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1977180760, iIntValue, -1, "com.yalla.yalla.util.MomentGiftSendUtil.<anonymous> (MomentGiftSendUtil.kt:56)");
            }
            q2 q2Var = q2.f59127OooO00o;
            l lVar = this.f57112OooO0Oo;
            q2Var.OooO00o(lVar.f57132OooO0OO.getHalfDialogWebPageInfo(), new d(lVar), composer2, 392);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
