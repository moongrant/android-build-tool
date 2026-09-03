package p516o0o0O00o;

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
import p230o00oOo0o.o000000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nScrollableTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollableTabRow.kt\ncom/yalla/yalla/ui/composable/common/ScrollableTabRowKt$pagerTabIndicatorOffset$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScrollableTabRow.kt\ncom/yalla/yalla/ui/composable/common/ScrollableTabRowKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,326:1\n1#2:327\n326#3:328\n174#4:329\n*S KotlinDebug\n*F\n+ 1 ScrollableTabRow.kt\ncom/yalla/yalla/ui/composable/common/ScrollableTabRowKt$pagerTabIndicatorOffset$1\n*L\n312#1:328\n312#1:329\n*E\n"})
public final class o0O000o0 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000000 f51503OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ List<o0O00o00> f51504OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000o0(o000000 o000000Var, List<o0O00o00> list) {
        super(3);
        this.f51503OooO0Oo = o000000Var;
        this.f51504OooO0o0 = list;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0066 A[PHI: r3
      0x0066: PHI (r3v3 java.lang.Integer) = (r3v2 java.lang.Integer), (r3v10 java.lang.Integer) binds: [B:12:0x004f, B:18:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        int iIntValue;
        float fM3818lerpMdfbLM;
        float fM3775constructorimpl;
        Modifier composed = modifier;
        Composer composer2 = composer;
        int iIntValue2 = num.intValue();
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer2.startReplaceableGroup(-875763571);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-875763571, iIntValue2, -1, "com.yalla.yalla.ui.composable.common.pagerTabIndicatorOffset.<anonymous> (ScrollableTabRow.kt:294)");
        }
        o000000 o000000Var = this.f51503OooO0Oo;
        if (o000000Var.OooO0o() == 0) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
        } else {
            int iOooO0oO = o000000Var.OooO0oO();
            List<o0O00o00> list = this.f51504OooO0o0;
            o0O00o00 o0o00o01 = list.get(iOooO0oO);
            Integer num2 = (Integer) o000000Var.f39756OooO0o.getValue();
            if (num2 == null) {
                Function0 function0 = (Function0) o000000Var.f39758OooO0oO.getValue();
                num2 = function0 != null ? (Integer) function0.invoke() : null;
                if (num2 != null) {
                    iIntValue = num2.intValue();
                } else if (o000000Var.isScrollInProgress() && Math.abs(o000000Var.OooO0OO()) >= 0.001f) {
                    iIntValue = o000000Var.OooO0OO() < 0.0f ? RangesKt.coerceAtLeast(o000000Var.OooO0oO() - 1, 0) : RangesKt.coerceAtMost(o000000Var.OooO0oO() + 1, o000000Var.OooO0o() - 1);
                } else {
                    iIntValue = o000000Var.OooO0oO();
                }
            } else {
                iIntValue = num2.intValue();
            }
            o0O00o00 o0o00o02 = (o0O00o00) CollectionsKt.getOrNull(list, iIntValue);
            if (o0o00o02 != null) {
                float fAbs = Math.abs(o000000Var.OooO0OO() / Math.max(Math.abs(iIntValue - o000000Var.OooO0oO()), 1));
                fM3818lerpMdfbLM = DpKt.m3818lerpMdfbLM(o0o00o01.f51521OooO00o, o0o00o02.f51521OooO00o, fAbs);
                fM3775constructorimpl = Dp.m3775constructorimpl(Math.abs(DpKt.m3818lerpMdfbLM(o0o00o01.f51522OooO0O0, o0o00o02.f51522OooO0O0, fAbs)));
            } else {
                fM3818lerpMdfbLM = o0o00o01.f51521OooO00o;
                fM3775constructorimpl = o0o00o01.f51522OooO0O0;
            }
            composed = SizeKt.m530width3ABfNKs(OffsetKt.m439offsetVpY3zN4$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(composed, 0.0f, 1, null), Alignment.INSTANCE.getBottomStart(), false, 2, null), fM3818lerpMdfbLM, 0.0f, 2, null), fM3775constructorimpl);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
        }
        return composed;
    }
}
