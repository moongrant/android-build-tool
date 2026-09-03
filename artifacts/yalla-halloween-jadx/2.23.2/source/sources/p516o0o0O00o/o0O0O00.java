package p516o0o0O00o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O00 extends Lambda implements Function4<p230o00oOo0o.o0O0O00, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function3<Integer, Composer, Integer, Unit> f51544OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f51545OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f51546OooO0o0 = 3072;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O00(ComposableLambda composableLambda, int i) {
        super(4);
        this.f51544OooO0Oo = composableLambda;
        this.f51545OooO0o = i;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(p230o00oOo0o.o0O0O00 o0o0o00, Integer num, Composer composer, Integer num2) {
        p230o00oOo0o.o0O0O00 VerticalPager = o0o0o00;
        int iIntValue = num.intValue();
        Composer composer2 = composer;
        int iIntValue2 = num2.intValue();
        Intrinsics.checkNotNullParameter(VerticalPager, "$this$VerticalPager");
        if ((iIntValue2 & 112) == 0) {
            iIntValue2 |= composer2.changed(iIntValue) ? 32 : 16;
        }
        if ((iIntValue2 & 721) == 144 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-639713702, iIntValue2, -1, "com.yalla.yalla.ui.composable.common.BannerComp.<anonymous> (BannerComp.kt:85)");
            }
            this.f51544OooO0Oo.invoke(Integer.valueOf(o00000.OooO0OO(iIntValue - LockFreeTaskQueueCore.MAX_CAPACITY_MASK, this.f51545OooO0o)), composer2, Integer.valueOf((this.f51546OooO0o0 >> 6) & 112));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
