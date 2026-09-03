package p507o0o00ooo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import p184o00o00o.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO extends Lambda implements Function4<OooOo00, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function3<Integer, Composer, Integer, Unit> f50068OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f50069OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f50070OooO0o0 = 3072;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO(ComposableLambda composableLambda, int i) {
        super(4);
        this.f50068OooO0Oo = composableLambda;
        this.f50069OooO0o = i;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(OooOo00 oooOo00, Integer num, Composer composer, Integer num2) {
        int i;
        OooOo00 VerticalPager = oooOo00;
        int iIntValue = num.intValue();
        Composer composer2 = composer;
        int iIntValue2 = num2.intValue();
        Intrinsics.checkNotNullParameter(VerticalPager, "$this$VerticalPager");
        if ((iIntValue2 & 112) == 0) {
            i = (composer2.changed(iIntValue) ? 32 : 16) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((i & 721) == 144 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-639713702, iIntValue2, -1, "com.yalla.yalla.ui.composable.common.BannerComp.<anonymous> (BannerComp.kt:84)");
            }
            this.f50068OooO0Oo.invoke(Integer.valueOf(oOOO00o0.OooO0OO(iIntValue - LockFreeTaskQueueCore.MAX_CAPACITY_MASK, this.f50069OooO0o)), composer2, Integer.valueOf((this.f50070OooO0o0 >> 6) & 112));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
