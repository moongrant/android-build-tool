package p516o0o0O00o;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nScrollableTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollableTabRow.kt\ncom/yalla/yalla/ui/composable/common/ScrollableTabRowKt$ScrollableTabRow$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,326:1\n154#2:327\n151#3,3:328\n33#3,4:331\n154#3,2:335\n38#3:337\n156#3:338\n33#3,6:339\n*S KotlinDebug\n*F\n+ 1 ScrollableTabRow.kt\ncom/yalla/yalla/ui/composable/common/ScrollableTabRowKt$ScrollableTabRow$2$1\n*L\n90#1:327\n94#1:328,3\n94#1:331,4\n94#1:335,2\n94#1:337\n94#1:338\n98#1:339,6\n*E\n"})
public final class o0O000Oo extends Lambda implements Function2<SubcomposeMeasureScope, Constraints, MeasureResult> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ Function3<List<o0O00o00>, Composer, Integer, Unit> f51496OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ float f51497OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f51498OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f51499OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o0O0000O f51500OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f51501OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ int f51502OooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0O000Oo(float f, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function3, o0O0000O o0o0000o2, int i, Function3<? super List<o0O00o00>, ? super Composer, ? super Integer, Unit> function4, int i2) {
        super(2);
        this.f51497OooO0Oo = f;
        this.f51499OooO0o0 = function2;
        this.f51498OooO0o = function3;
        this.f51500OooO0oO = o0o0000o2;
        this.f51501OooO0oo = i;
        this.f51496OooO = function4;
        this.f51502OooOO0 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
        SubcomposeMeasureScope SubcomposeLayout = subcomposeMeasureScope;
        long value = constraints.getValue();
        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
        int iMo320roundToPx0680j_4 = SubcomposeLayout.mo320roundToPx0680j_4(Dp.m3775constructorimpl(0));
        int iMo320roundToPx0680j_5 = SubcomposeLayout.mo320roundToPx0680j_4(this.f51497OooO0Oo);
        long jM3734copyZbe2FdA$default = Constraints.m3734copyZbe2FdA$default(value, iMo320roundToPx0680j_4, 0, 0, 0, 14, null);
        List<Measurable> listSubcompose = SubcomposeLayout.subcompose(o0O0O0O.Tabs, this.f51499OooO0o0);
        ArrayList arrayList = new ArrayList(listSubcompose.size());
        int size = listSubcompose.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(listSubcompose.get(i).mo2804measureBRTryo0(jM3734copyZbe2FdA$default));
        }
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = iMo320roundToPx0680j_5 * 2;
        Ref.IntRef intRef2 = new Ref.IntRef();
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Placeable placeable = (Placeable) arrayList.get(i2);
            intRef.element = placeable.getWidth() + intRef.element;
            intRef2.element = Math.max(intRef2.element, placeable.getHeight());
        }
        return MeasureScope.CC.OooOOo0(SubcomposeLayout, intRef.element, intRef2.element, null, new o0OoOoOo(iMo320roundToPx0680j_5, arrayList, SubcomposeLayout, this.f51498OooO0o, this.f51500OooO0oO, this.f51501OooO0oo, value, intRef, intRef2, this.f51496OooO, this.f51502OooOO0), 4, null);
    }
}
