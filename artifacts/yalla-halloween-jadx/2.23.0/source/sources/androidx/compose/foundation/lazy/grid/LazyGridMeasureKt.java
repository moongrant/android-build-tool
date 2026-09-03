package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aP\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\bH\u0083\bø\u0001\u0000\u001a\u008c\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002\u001aè\u0001\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012/\u00101\u001a+\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u0002040\b¢\u0006\u0002\b5\u0012\u0004\u0012\u00020602H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b7\u00108\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00069"}, d2 = {"calculateExtraItems", "", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "pinnedItems", "", "measuredItemProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;", "itemConstraints", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Constraints;", "filter", "", "calculateItemsOffsets", "", "lines", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "itemsBefore", "itemsAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "firstLineScrollOffset", "isVertical", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "reverseLayout", "density", "Landroidx/compose/ui/unit/Density;", "measureLazyGrid", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "itemsCount", "measuredLineProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenLines", "firstVisibleLineIndex", "firstVisibleLineScrollOffset", "scrollToBeConsumed", "", "constraints", "placementAnimator", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "spanLayoutProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "layout", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/MeasureResult;", "measureLazyGrid-ZRKPzZ8", "(ILandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;IIIIIIFJZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;Ljava/util/List;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n*L\n1#1,416:1\n310#1,3:423\n313#1,12:430\n326#1:443\n310#1,3:444\n313#1,12:451\n326#1:464\n33#2,6:417\n33#2,4:426\n38#2:442\n33#2,4:447\n38#2:463\n33#2,4:468\n38#2:474\n33#2,6:476\n132#2,3:482\n33#2,4:485\n135#2,2:489\n38#2:491\n137#2:492\n33#2,6:493\n33#2,6:499\n33#2,6:505\n36#3,3:465\n39#3,2:472\n41#3:475\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt\n*L\n210#1:423,3\n210#1:430,12\n210#1:443\n217#1:444,3\n217#1:451,12\n217#1:464\n138#1:417,6\n210#1:426,4\n210#1:442\n217#1:447,4\n217#1:463\n290#1:468,4\n290#1:474\n312#1:476,6\n353#1:482,3\n353#1:485,4\n353#1:489,2\n353#1:491\n353#1:492\n396#1:493,6\n403#1:499,6\n408#1:505,6\n290#1:465,3\n290#1:472,2\n290#1:475\n*E\n"})
public final class LazyGridMeasureKt {
    @ExperimentalFoundationApi
    private static final List<LazyGridMeasuredItem> calculateExtraItems(List<Integer> list, LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider, Function1<? super Integer, Constraints> function1, Function1<? super Integer, Boolean> function2) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            int iIntValue = list.get(i).intValue();
            if (function2.invoke(Integer.valueOf(iIntValue)).booleanValue()) {
                LazyGridMeasuredItem lazyGridMeasuredItemM612getAndMeasure3p2s80s$default = LazyGridMeasuredItemProvider.m612getAndMeasure3p2s80s$default(lazyGridMeasuredItemProvider, iIntValue, 0, function1.invoke(Integer.valueOf(iIntValue)).getValue(), 2, null);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lazyGridMeasuredItemM612getAndMeasure3p2s80s$default);
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    private static final List<LazyGridMeasuredItem> calculateItemsOffsets(List<LazyGridMeasuredLine> list, List<LazyGridMeasuredItem> list2, List<LazyGridMeasuredItem> list3, int i, int i2, int i3, int i4, int i5, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z2, Density density) {
        int i6 = z ? i2 : i;
        boolean z3 = i3 < Math.min(i6, i4);
        if (z3) {
            if (!(i5 == 0)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        int size = list.size();
        int length = 0;
        for (int i7 = 0; i7 < size; i7++) {
            length += list.get(i7).getItems().length;
        }
        ArrayList arrayList = new ArrayList(length);
        if (z3) {
            if (!(list2.isEmpty() && list3.isEmpty())) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            int size2 = list.size();
            int[] iArr = new int[size2];
            for (int i8 = 0; i8 < size2; i8++) {
                iArr[i8] = list.get(calculateItemsOffsets$reverseAware(i8, z2, size2)).getMainAxisSize();
            }
            int[] iArr2 = new int[size2];
            for (int i9 = 0; i9 < size2; i9++) {
                iArr2[i9] = 0;
            }
            if (z) {
                if (vertical == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                vertical.arrange(density, i6, iArr, iArr2);
            } else {
                if (horizontal == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                horizontal.arrange(density, i6, iArr, LayoutDirection.Ltr, iArr2);
            }
            IntRange indices = ArraysKt.getIndices(iArr2);
            IntProgression intProgressionReversed = indices;
            if (z2) {
                intProgressionReversed = RangesKt___RangesKt.reversed(indices);
            }
            int first = intProgressionReversed.getFirst();
            int last = intProgressionReversed.getLast();
            int step = intProgressionReversed.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    int mainAxisSize = iArr2[first];
                    LazyGridMeasuredLine lazyGridMeasuredLine = list.get(calculateItemsOffsets$reverseAware(first, z2, size2));
                    if (z2) {
                        mainAxisSize = (i6 - mainAxisSize) - lazyGridMeasuredLine.getMainAxisSize();
                    }
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList, lazyGridMeasuredLine.position(mainAxisSize, i, i2));
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
        } else {
            int size3 = list2.size();
            int i10 = i5;
            int i11 = 0;
            while (i11 < size3) {
                LazyGridMeasuredItem lazyGridMeasuredItem = list2.get(i11);
                int mainAxisSizeWithSpacings = i10 - lazyGridMeasuredItem.getMainAxisSizeWithSpacings();
                lazyGridMeasuredItem.position(mainAxisSizeWithSpacings, 0, i, i2, (48 & 16) != 0 ? -1 : 0, (48 & 32) != 0 ? -1 : 0);
                arrayList.add(lazyGridMeasuredItem);
                i11++;
                i10 = mainAxisSizeWithSpacings;
            }
            int size4 = list.size();
            int mainAxisSizeWithSpacings2 = i5;
            for (int i12 = 0; i12 < size4; i12++) {
                LazyGridMeasuredLine lazyGridMeasuredLine2 = list.get(i12);
                CollectionsKt__MutableCollectionsKt.addAll(arrayList, lazyGridMeasuredLine2.position(mainAxisSizeWithSpacings2, i, i2));
                mainAxisSizeWithSpacings2 += lazyGridMeasuredLine2.getMainAxisSizeWithSpacings();
            }
            int mainAxisSizeWithSpacings3 = mainAxisSizeWithSpacings2;
            int i13 = 0;
            for (int size5 = list3.size(); i13 < size5; size5 = size5) {
                LazyGridMeasuredItem lazyGridMeasuredItem2 = list3.get(i13);
                lazyGridMeasuredItem2.position(mainAxisSizeWithSpacings3, 0, i, i2, (48 & 16) != 0 ? -1 : 0, (48 & 32) != 0 ? -1 : 0);
                arrayList.add(lazyGridMeasuredItem2);
                mainAxisSizeWithSpacings3 += lazyGridMeasuredItem2.getMainAxisSizeWithSpacings();
                i13++;
            }
        }
        return arrayList;
    }

    private static final int calculateItemsOffsets$reverseAware(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: measureLazyGrid-ZRKPzZ8, reason: not valid java name */
    public static final LazyGridMeasureResult m609measureLazyGridZRKPzZ8(int i, @NotNull LazyGridMeasuredLineProvider measuredLineProvider, @NotNull LazyGridMeasuredItemProvider measuredItemProvider, int i2, int i3, int i4, int i5, int i6, int i7, float f, long j, boolean z, @Nullable Arrangement.Vertical vertical, @Nullable Arrangement.Horizontal horizontal, boolean z2, @NotNull Density density, @NotNull LazyGridItemPlacementAnimator placementAnimator, @NotNull LazyGridSpanLayoutProvider spanLayoutProvider, @NotNull List<Integer> pinnedItems, @NotNull Function3<? super Integer, ? super Integer, ? super Function1<? super Placeable.PlacementScope, Unit>, ? extends MeasureResult> layout) {
        int i8;
        int i9;
        int i10;
        int i11;
        int iM3747constrainWidthK40F9xA;
        LazyGridMeasuredItem[] items;
        LazyGridMeasuredItem lazyGridMeasuredItem;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(measuredLineProvider, "measuredLineProvider");
        Intrinsics.checkNotNullParameter(measuredItemProvider, "measuredItemProvider");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(placementAnimator, "placementAnimator");
        Intrinsics.checkNotNullParameter(spanLayoutProvider, "spanLayoutProvider");
        Intrinsics.checkNotNullParameter(pinnedItems, "pinnedItems");
        Intrinsics.checkNotNullParameter(layout, "layout");
        if (!(i3 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i <= 0) {
            return new LazyGridMeasureResult(null, 0, false, 0.0f, layout.invoke(Integer.valueOf(Constraints.m3735getMinWidthimpl(j)), Integer.valueOf(Constraints.m3734getMinHeightimpl(j)), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$measureLazyGrid$1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Placeable.PlacementScope invoke) {
                    Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }
            }), CollectionsKt.emptyList(), -i3, i2 + i4, 0, z2, z ? Orientation.Vertical : Orientation.Horizontal, i4, i5);
        }
        int iRoundToInt = MathKt.roundToInt(f);
        int i14 = i7 - iRoundToInt;
        if (i6 == 0 && i14 < 0) {
            iRoundToInt += i14;
            i14 = 0;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        int i15 = -i3;
        int i16 = i15 + (i5 < 0 ? i5 : 0);
        int mainAxisSizeWithSpacings = i14 + i16;
        int i17 = i6;
        while (mainAxisSizeWithSpacings < 0 && i17 > 0) {
            int i18 = i17 - 1;
            LazyGridMeasuredLine andMeasure = measuredLineProvider.getAndMeasure(i18);
            arrayDeque.add(0, andMeasure);
            mainAxisSizeWithSpacings += andMeasure.getMainAxisSizeWithSpacings();
            i17 = i18;
        }
        if (mainAxisSizeWithSpacings < i16) {
            iRoundToInt += mainAxisSizeWithSpacings;
            mainAxisSizeWithSpacings = i16;
        }
        int i19 = mainAxisSizeWithSpacings - i16;
        int i20 = i2 + i4;
        int i21 = i15;
        int iCoerceAtLeast = RangesKt.coerceAtLeast(i20, 0);
        int i22 = -i19;
        int size = arrayDeque.size();
        int mainAxisSizeWithSpacings2 = i22;
        int i23 = i17;
        for (int i24 = 0; i24 < size; i24++) {
            i23++;
            mainAxisSizeWithSpacings2 = ((LazyGridMeasuredLine) arrayDeque.get(i24)).getMainAxisSizeWithSpacings() + mainAxisSizeWithSpacings2;
        }
        int mainAxisSizeWithSpacings3 = i19;
        int i25 = i20;
        int i26 = mainAxisSizeWithSpacings2;
        int i27 = i23;
        while (i27 < i && (i26 < iCoerceAtLeast || i26 <= 0 || arrayDeque.isEmpty())) {
            int i28 = iCoerceAtLeast;
            LazyGridMeasuredLine andMeasure2 = measuredLineProvider.getAndMeasure(i27);
            if (andMeasure2.isEmpty()) {
                break;
            }
            int mainAxisSizeWithSpacings4 = andMeasure2.getMainAxisSizeWithSpacings() + i26;
            if (mainAxisSizeWithSpacings4 <= i16) {
                i12 = i16;
                i13 = mainAxisSizeWithSpacings4;
                if (((LazyGridMeasuredItem) ArraysKt.last(andMeasure2.getItems())).getIndex() != i - 1) {
                    mainAxisSizeWithSpacings3 -= andMeasure2.getMainAxisSizeWithSpacings();
                    i17 = i27 + 1;
                }
                i27++;
                iCoerceAtLeast = i28;
                i26 = i13;
                i16 = i12;
            } else {
                i12 = i16;
                i13 = mainAxisSizeWithSpacings4;
            }
            arrayDeque.add(andMeasure2);
            i27++;
            iCoerceAtLeast = i28;
            i26 = i13;
            i16 = i12;
        }
        if (i26 < i2) {
            int i29 = i2 - i26;
            i26 += i29;
            int mainAxisSizeWithSpacings5 = mainAxisSizeWithSpacings3 - i29;
            while (mainAxisSizeWithSpacings5 < i3 && i17 > 0) {
                int i30 = i17 - 1;
                LazyGridMeasuredLine andMeasure3 = measuredLineProvider.getAndMeasure(i30);
                arrayDeque.add(0, andMeasure3);
                mainAxisSizeWithSpacings5 += andMeasure3.getMainAxisSizeWithSpacings();
                i17 = i30;
            }
            i8 = 0;
            iRoundToInt += i29;
            if (mainAxisSizeWithSpacings5 < 0) {
                iRoundToInt += mainAxisSizeWithSpacings5;
                i26 += mainAxisSizeWithSpacings5;
                i9 = 0;
            } else {
                i9 = mainAxisSizeWithSpacings5;
            }
        } else {
            int i31 = mainAxisSizeWithSpacings3;
            i8 = 0;
            i9 = i31;
        }
        int i32 = i26;
        float f2 = (MathKt.getSign(MathKt.roundToInt(f)) != MathKt.getSign(iRoundToInt) || Math.abs(MathKt.roundToInt(f)) < Math.abs(iRoundToInt)) ? f : iRoundToInt;
        if ((i9 >= 0 ? 1 : i8) == 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i33 = -i9;
        LazyGridMeasuredLine lazyGridMeasuredLine = (LazyGridMeasuredLine) arrayDeque.first();
        LazyGridMeasuredItem lazyGridMeasuredItem2 = (LazyGridMeasuredItem) ArraysKt.firstOrNull(lazyGridMeasuredLine.getItems());
        int index = lazyGridMeasuredItem2 != null ? lazyGridMeasuredItem2.getIndex() : i8;
        LazyGridMeasuredLine lazyGridMeasuredLine2 = (LazyGridMeasuredLine) arrayDeque.lastOrNull();
        int index2 = (lazyGridMeasuredLine2 == null || (items = lazyGridMeasuredLine2.getItems()) == null || (lazyGridMeasuredItem = (LazyGridMeasuredItem) ArraysKt.lastOrNull(items)) == null) ? i8 : lazyGridMeasuredItem.getIndex();
        int size2 = pinnedItems.size();
        List listEmptyList = null;
        int i34 = i9;
        List listEmptyList2 = null;
        int i35 = 0;
        while (i35 < size2) {
            int i36 = size2;
            int iIntValue = pinnedItems.get(i35).intValue();
            if (iIntValue >= 0 && iIntValue < index) {
                LazyGridMeasuredItem lazyGridMeasuredItemM612getAndMeasure3p2s80s$default = LazyGridMeasuredItemProvider.m612getAndMeasure3p2s80s$default(measuredItemProvider, iIntValue, 0, measuredLineProvider.m615itemConstraintsOenEA2s(iIntValue), 2, null);
                List arrayList = listEmptyList2 == null ? new ArrayList() : listEmptyList2;
                arrayList.add(lazyGridMeasuredItemM612getAndMeasure3p2s80s$default);
                listEmptyList2 = arrayList;
            }
            i35++;
            f2 = f2;
            i34 = i34;
            i25 = i25;
            index2 = index2;
            index = index;
            i33 = i33;
            i32 = i32;
            i21 = i21;
            size2 = i36;
        }
        int i37 = i25;
        int i38 = index2;
        int i39 = index;
        int i40 = i33;
        int i41 = i32;
        float f3 = f2;
        int i42 = i21;
        int i43 = i34;
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        List list = listEmptyList2;
        int size3 = pinnedItems.size();
        int i44 = 0;
        while (i44 < size3) {
            int iIntValue2 = pinnedItems.get(i44).intValue();
            int i45 = i38;
            if (i45 + 1 <= iIntValue2 && iIntValue2 < i) {
                LazyGridMeasuredItem lazyGridMeasuredItemM612getAndMeasure3p2s80s$default2 = LazyGridMeasuredItemProvider.m612getAndMeasure3p2s80s$default(measuredItemProvider, iIntValue2, 0, measuredLineProvider.m615itemConstraintsOenEA2s(iIntValue2), 2, null);
                if (listEmptyList == null) {
                    listEmptyList = new ArrayList();
                }
                List list2 = listEmptyList;
                list2.add(lazyGridMeasuredItemM612getAndMeasure3p2s80s$default2);
                listEmptyList = list2;
            }
            i44++;
            size3 = size3;
            i38 = i45;
        }
        int i46 = i38;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list3 = listEmptyList;
        if (i3 > 0 || i5 < 0) {
            int size4 = arrayDeque.size();
            int i47 = i43;
            int i48 = 0;
            while (i48 < size4) {
                int mainAxisSizeWithSpacings6 = ((LazyGridMeasuredLine) arrayDeque.get(i48)).getMainAxisSizeWithSpacings();
                if (i47 == 0 || mainAxisSizeWithSpacings6 > i47 || i48 == CollectionsKt.getLastIndex(arrayDeque)) {
                    break;
                }
                i47 -= mainAxisSizeWithSpacings6;
                i48++;
                lazyGridMeasuredLine = (LazyGridMeasuredLine) arrayDeque.get(i48);
            }
            i10 = i47;
        } else {
            i10 = i43;
        }
        LazyGridMeasuredLine lazyGridMeasuredLine3 = lazyGridMeasuredLine;
        if (z) {
            iM3747constrainWidthK40F9xA = Constraints.m3733getMaxWidthimpl(j);
            i11 = i41;
        } else {
            i11 = i41;
            iM3747constrainWidthK40F9xA = ConstraintsKt.m3747constrainWidthK40F9xA(j, i11);
        }
        int iM3746constrainHeightK40F9xA = z ? ConstraintsKt.m3746constrainHeightK40F9xA(j, i11) : Constraints.m3732getMaxHeightimpl(j);
        int i49 = i11;
        final List<LazyGridMeasuredItem> listCalculateItemsOffsets = calculateItemsOffsets(arrayDeque, list, list3, iM3747constrainWidthK40F9xA, iM3746constrainHeightK40F9xA, i11, i2, i40, z, vertical, horizontal, z2, density);
        placementAnimator.onMeasured((int) f3, iM3747constrainWidthK40F9xA, iM3746constrainHeightK40F9xA, listCalculateItemsOffsets, measuredItemProvider, spanLayoutProvider, z);
        boolean z3 = i46 != i + (-1) || i49 > i2;
        MeasureResult measureResultInvoke = layout.invoke(Integer.valueOf(iM3747constrainWidthK40F9xA), Integer.valueOf(iM3746constrainHeightK40F9xA), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$measureLazyGrid$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Placeable.PlacementScope invoke) {
                Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
                List<LazyGridMeasuredItem> list4 = listCalculateItemsOffsets;
                int size5 = list4.size();
                for (int i50 = 0; i50 < size5; i50++) {
                    list4.get(i50).place(invoke);
                }
            }
        });
        if (!list.isEmpty() || !list3.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(listCalculateItemsOffsets.size());
            int size5 = listCalculateItemsOffsets.size();
            int i50 = 0;
            while (i50 < size5) {
                LazyGridMeasuredItem lazyGridMeasuredItem3 = listCalculateItemsOffsets.get(i50);
                int index3 = lazyGridMeasuredItem3.getIndex();
                int i51 = i39;
                if (i51 <= index3 && index3 <= i46) {
                    arrayList2.add(lazyGridMeasuredItem3);
                }
                i50++;
                i39 = i51;
            }
            listCalculateItemsOffsets = arrayList2;
        }
        return new LazyGridMeasureResult(lazyGridMeasuredLine3, i10, z3, f3, measureResultInvoke, listCalculateItemsOffsets, i42, i37, i, z2, z ? Orientation.Vertical : Orientation.Horizontal, i4, i5);
    }
}
