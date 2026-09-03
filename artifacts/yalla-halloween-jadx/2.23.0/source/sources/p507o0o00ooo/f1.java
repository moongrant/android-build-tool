package p507o0o00ooo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nScrollableTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollableTabRow.kt\ncom/yalla/yalla/ui/composable/common/ScrollableTabRowKt$ScrollableTabRow$2$1$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,326:1\n33#2,6:327\n33#2,6:333\n33#2,6:339\n*S KotlinDebug\n*F\n+ 1 ScrollableTabRow.kt\ncom/yalla/yalla/ui/composable/common/ScrollableTabRowKt$ScrollableTabRow$2$1$2\n*L\n108#1:327,6\n116#1:333,6\n127#1:339,6\n*E\n"})
public final class f1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ int f49859OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49860OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ SubcomposeMeasureScope f49861OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ List<Placeable> f49862OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f49863OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ c1 f49864OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ long f49865OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f49866OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f49867OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final /* synthetic */ int f49868OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final /* synthetic */ Function3<List<p1>, Composer, Integer, Unit> f49869OooOOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(int i, ArrayList arrayList, SubcomposeMeasureScope subcomposeMeasureScope, Function2 function2, c1 c1Var, int i2, long j, Ref.IntRef intRef, Ref.IntRef intRef2, Function3 function3, int i3) {
        super(1);
        this.f49860OooO0Oo = i;
        this.f49862OooO0o0 = arrayList;
        this.f49861OooO0o = subcomposeMeasureScope;
        this.f49863OooO0oO = function2;
        this.f49864OooO0oo = c1Var;
        this.f49859OooO = i2;
        this.f49865OooOO0 = j;
        this.f49866OooOO0O = intRef;
        this.f49867OooOO0o = intRef2;
        this.f49869OooOOO0 = function3;
        this.f49868OooOOO = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Placeable.PlacementScope placementScope) {
        SubcomposeMeasureScope density;
        Ref.IntRef intRef;
        Ref.IntRef intRef2;
        Placeable.PlacementScope layout = placementScope;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        ArrayList tabPositions = new ArrayList();
        List<Placeable> list = this.f49862OooO0o0;
        int size = list.size();
        int i = this.f49860OooO0Oo;
        int width = i;
        int i2 = 0;
        while (true) {
            density = this.f49861OooO0o;
            if (i2 >= size) {
                break;
            }
            Placeable placeable = list.get(i2);
            Placeable.PlacementScope.placeRelative$default(layout, placeable, width, 0, 0.0f, 4, null);
            tabPositions.add(new p1(density.mo321toDpu2uoSUM(width), density.mo321toDpu2uoSUM(placeable.getWidth())));
            width += placeable.getWidth();
            i2++;
        }
        List<Measurable> listSubcompose = density.subcompose(r1.Divider, this.f49863OooO0oO);
        long j = this.f49865OooOO0;
        int size2 = listSubcompose.size();
        int i3 = 0;
        while (true) {
            intRef = this.f49867OooOO0o;
            intRef2 = this.f49866OooOO0O;
            if (i3 >= size2) {
                break;
            }
            Measurable measurable = listSubcompose.get(i3);
            int i4 = intRef2.element;
            Placeable placeableMo2794measureBRTryo0 = measurable.mo2794measureBRTryo0(Constraints.m3724copyZbe2FdA$default(j, i4, i4, 0, 0, 12, null));
            Placeable.PlacementScope.placeRelative$default(layout, placeableMo2794measureBRTryo0, 0, intRef.element - placeableMo2794measureBRTryo0.getHeight(), 0.0f, 4, null);
            i3++;
            j = j;
        }
        List<Measurable> listSubcompose2 = density.subcompose(r1.Indicator, ComposableLambdaKt.composableLambdaInstance(256034543, true, new e1(this.f49869OooOOO0, tabPositions, this.f49868OooOOO)));
        int size3 = listSubcompose2.size();
        int i5 = 0;
        while (i5 < size3) {
            Placeable.PlacementScope.placeRelative$default(layout, listSubcompose2.get(i5).mo2794measureBRTryo0(Constraints.INSTANCE.m3741fixedJhjzzOo(intRef2.element, intRef.element)), 0, 0, 0.0f, 4, null);
            i5++;
            intRef = intRef;
        }
        c1 c1Var = this.f49864OooO0oo;
        c1Var.getClass();
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
        Integer num = c1Var.f49797OooO0OO;
        int i6 = this.f49859OooO;
        if (num == null || num.intValue() != i6) {
            c1Var.f49797OooO0OO = Integer.valueOf(i6);
            p1 p1Var = (p1) CollectionsKt.getOrNull(tabPositions, i6);
            if (p1Var != null) {
                p1 p1Var2 = (p1) CollectionsKt.last((List) tabPositions);
                int iMo318roundToPx0680j_4 = density.mo318roundToPx0680j_4(Dp.m3765constructorimpl(p1Var2.f50173OooO00o + p1Var2.f50174OooO0O0)) + i;
                int maxValue = iMo318roundToPx0680j_4 - c1Var.f49795OooO00o.getMaxValue();
                BuildersKt__Builders_commonKt.launch$default(c1Var.f49796OooO0O0, null, null, new b1(c1Var, RangesKt.coerceIn(density.mo318roundToPx0680j_4(p1Var.f50173OooO00o) - ((maxValue / 2) - (density.mo318roundToPx0680j_4(p1Var.f50174OooO0O0) / 2)), 0, RangesKt.coerceAtLeast(iMo318roundToPx0680j_4 - maxValue, 0)), null), 3, null);
            }
        }
        return Unit.INSTANCE;
    }
}
