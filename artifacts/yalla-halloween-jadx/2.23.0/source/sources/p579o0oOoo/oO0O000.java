package p579o0oOoo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p519o0o0O0oO.q2;

/* JADX INFO: loaded from: classes5.dex */
public final class oO0O000 extends Lambda implements Function3<MutableState<Boolean>, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO0O0O00 f56566OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O000(oO0O0O00 oo0o0o00) {
        super(3);
        this.f56566OooO0Oo = oo0o0o00;
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
                ComposerKt.traceEventStart(1977180760, iIntValue, -1, "com.yalla.yalla.util.MomentGiftSendUtil.<anonymous> (MomentGiftSendUtil.kt:55)");
            }
            q2 q2Var = q2.f53094OooO00o;
            oO0O0O00 oo0o0o00 = this.f56566OooO0Oo;
            q2Var.OooO00o(oo0o0o00.f56575OooO0OO.getHalfDialogWebPageInfo(), new oO0(oo0o0o00), composer2, 392);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
