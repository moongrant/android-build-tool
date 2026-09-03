package p507o0o00ooo;

import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import p184o00o00o.Oooo000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nScrollableTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollableTabRow.kt\ncom/yalla/yalla/ui/composable/common/ScrollableTabRowKt$pagerTabIndicatorOffset$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScrollableTabRow.kt\ncom/yalla/yalla/ui/composable/common/ScrollableTabRowKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,326:1\n1#2:327\n326#3:328\n174#4:329\n*S KotlinDebug\n*F\n+ 1 ScrollableTabRow.kt\ncom/yalla/yalla/ui/composable/common/ScrollableTabRowKt$pagerTabIndicatorOffset$1\n*L\n312#1:328\n312#1:329\n*E\n"})
public final class h1 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Oooo000 f49886OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ List<p1> f49887OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(Oooo000 oooo000, List<p1> list) {
        super(3);
        this.f49886OooO0Oo = oooo000;
        this.f49887OooO0o0 = list;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0066 A[PHI: r3
      0x0066: PHI (r3v3 java.lang.Integer) = (r3v2 java.lang.Integer), (r3v10 java.lang.Integer) binds: [B:12:0x004f, B:18:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        int iIntValue;
        float fM3808lerpMdfbLM;
        float fM3765constructorimpl;
        Modifier composed = modifier;
        Composer composer2 = composer;
        int iIntValue2 = num.intValue();
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer2.startReplaceableGroup(-875763571);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-875763571, iIntValue2, -1, "com.yalla.yalla.ui.composable.common.pagerTabIndicatorOffset.<anonymous> (ScrollableTabRow.kt:292)");
        }
        Oooo000 oooo000 = this.f49886OooO0Oo;
        if (oooo000.OooO0o() == 0) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
        } else {
            int iOooO0oO = oooo000.OooO0oO();
            List<p1> list = this.f49887OooO0o0;
            p1 p1Var = list.get(iOooO0oO);
            Integer num2 = (Integer) oooo000.f38647OooO0o.getValue();
            if (num2 == null) {
                Function0 function0 = (Function0) oooo000.f38649OooO0oO.getValue();
                num2 = function0 != null ? (Integer) function0.invoke() : null;
                if (num2 != null) {
                    iIntValue = num2.intValue();
                } else if (oooo000.isScrollInProgress() && Math.abs(oooo000.OooO0OO()) >= 0.001f) {
                    iIntValue = oooo000.OooO0OO() < 0.0f ? RangesKt.coerceAtLeast(oooo000.OooO0oO() - 1, 0) : RangesKt.coerceAtMost(oooo000.OooO0oO() + 1, oooo000.OooO0o() - 1);
                } else {
                    iIntValue = oooo000.OooO0oO();
                }
            } else {
                iIntValue = num2.intValue();
            }
            p1 p1Var2 = (p1) CollectionsKt.getOrNull(list, iIntValue);
            if (p1Var2 != null) {
                float fAbs = Math.abs(oooo000.OooO0OO() / Math.max(Math.abs(iIntValue - oooo000.OooO0oO()), 1));
                fM3808lerpMdfbLM = DpKt.m3808lerpMdfbLM(p1Var.f50173OooO00o, p1Var2.f50173OooO00o, fAbs);
                fM3765constructorimpl = Dp.m3765constructorimpl(Math.abs(DpKt.m3808lerpMdfbLM(p1Var.f50174OooO0O0, p1Var2.f50174OooO0O0, fAbs)));
            } else {
                fM3808lerpMdfbLM = p1Var.f50173OooO00o;
                fM3765constructorimpl = p1Var.f50174OooO0O0;
            }
            composed = SizeKt.m528width3ABfNKs(OffsetKt.m437offsetVpY3zN4$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(composed, 0.0f, 1, null), Alignment.INSTANCE.getBottomStart(), false, 2, null), fM3808lerpMdfbLM, 0.0f, 2, null), fM3765constructorimpl);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
        }
        return composed;
    }
}
