package p516o0o0O00o;

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
public final class o0OoOoOo extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ int f51665OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f51666OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ SubcomposeMeasureScope f51667OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ List<Placeable> f51668OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f51669OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ o0O0000O f51670OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ long f51671OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f51672OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f51673OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final /* synthetic */ int f51674OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final /* synthetic */ Function3<List<o0O00o00>, Composer, Integer, Unit> f51675OooOOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOoOo(int i, ArrayList arrayList, SubcomposeMeasureScope subcomposeMeasureScope, Function2 function2, o0O0000O o0o0000o2, int i2, long j, Ref.IntRef intRef, Ref.IntRef intRef2, Function3 function3, int i3) {
        super(1);
        this.f51666OooO0Oo = i;
        this.f51668OooO0o0 = arrayList;
        this.f51667OooO0o = subcomposeMeasureScope;
        this.f51669OooO0oO = function2;
        this.f51670OooO0oo = o0o0000o2;
        this.f51665OooO = i2;
        this.f51671OooOO0 = j;
        this.f51672OooOO0O = intRef;
        this.f51673OooOO0o = intRef2;
        this.f51675OooOOO0 = function3;
        this.f51674OooOOO = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Placeable.PlacementScope placementScope) {
        SubcomposeMeasureScope density;
        Ref.IntRef intRef;
        Ref.IntRef intRef2;
        Placeable.PlacementScope layout = placementScope;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        ArrayList tabPositions = new ArrayList();
        List<Placeable> list = this.f51668OooO0o0;
        int size = list.size();
        int i = this.f51666OooO0Oo;
        int width = i;
        int i2 = 0;
        while (true) {
            density = this.f51667OooO0o;
            if (i2 >= size) {
                break;
            }
            Placeable placeable = list.get(i2);
            Placeable.PlacementScope.placeRelative$default(layout, placeable, width, 0, 0.0f, 4, null);
            tabPositions.add(new o0O00o00(density.mo323toDpu2uoSUM(width), density.mo323toDpu2uoSUM(placeable.getWidth())));
            width += placeable.getWidth();
            i2++;
        }
        List<Measurable> listSubcompose = density.subcompose(o0O0O0O.Divider, this.f51669OooO0oO);
        long j = this.f51671OooOO0;
        int size2 = listSubcompose.size();
        int i3 = 0;
        while (true) {
            intRef = this.f51673OooOO0o;
            intRef2 = this.f51672OooOO0O;
            if (i3 >= size2) {
                break;
            }
            Measurable measurable = listSubcompose.get(i3);
            int i4 = intRef2.element;
            Placeable placeableMo2804measureBRTryo0 = measurable.mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j, i4, i4, 0, 0, 12, null));
            Placeable.PlacementScope.placeRelative$default(layout, placeableMo2804measureBRTryo0, 0, intRef.element - placeableMo2804measureBRTryo0.getHeight(), 0.0f, 4, null);
            i3++;
            j = j;
        }
        List<Measurable> listSubcompose2 = density.subcompose(o0O0O0O.Indicator, ComposableLambdaKt.composableLambdaInstance(256034543, true, new o0O000O(this.f51675OooOOO0, tabPositions, this.f51674OooOOO)));
        int size3 = listSubcompose2.size();
        int i5 = 0;
        while (i5 < size3) {
            Placeable.PlacementScope.placeRelative$default(layout, listSubcompose2.get(i5).mo2804measureBRTryo0(Constraints.INSTANCE.m3751fixedJhjzzOo(intRef2.element, intRef.element)), 0, 0, 0.0f, 4, null);
            i5++;
            intRef = intRef;
        }
        o0O0000O o0o0000o2 = this.f51670OooO0oo;
        o0o0000o2.getClass();
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
        Integer num = o0o0000o2.f51492OooO0OO;
        int i6 = this.f51665OooO;
        if (num == null || num.intValue() != i6) {
            o0o0000o2.f51492OooO0OO = Integer.valueOf(i6);
            o0O00o00 o0o00o01 = (o0O00o00) CollectionsKt.getOrNull(tabPositions, i6);
            if (o0o00o01 != null) {
                o0O00o00 o0o00o02 = (o0O00o00) CollectionsKt.last((List) tabPositions);
                int iMo320roundToPx0680j_4 = density.mo320roundToPx0680j_4(Dp.m3775constructorimpl(o0o00o02.f51521OooO00o + o0o00o02.f51522OooO0O0)) + i;
                int maxValue = iMo320roundToPx0680j_4 - o0o0000o2.f51490OooO00o.getMaxValue();
                BuildersKt__Builders_commonKt.launch$default(o0o0000o2.f51491OooO0O0, null, null, new o0O00000(o0o0000o2, RangesKt.coerceIn(density.mo320roundToPx0680j_4(o0o00o01.f51521OooO00o) - ((maxValue / 2) - (density.mo320roundToPx0680j_4(o0o00o01.f51522OooO0O0) / 2)), 0, RangesKt.coerceAtLeast(iMo320roundToPx0680j_4 - maxValue, 0)), null), 3, null);
            }
        }
        return Unit.INSTANCE;
    }
}
