package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPositionInLayoutKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.Alignment;
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
import kotlin.jvm.functions.Function0;
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
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aH\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u000bH\u0002\u001a@\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u000bH\u0002\u001a\u0017\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0082\b\u001a\u008c\u0001\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0014*\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006H\u0002\u001am\u0010\n\u001a\u00020\u0004*\u00020\u00152\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u0002012\u0006\u0010 \u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103\u001aä\u0001\u00104\u001a\u000205*\u00020\u00152\u0006\u00106\u001a\u00020\u00062\u0006\u0010(\u001a\u00020)2\u0006\u00107\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u00062\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020'2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010.\u001a\u0004\u0018\u00010/2\b\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010 \u001a\u00020\u00012\u0006\u0010*\u001a\u00020+2\u0006\u0010$\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032/\u0010?\u001a+\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\u000f0\u000b¢\u0006\u0002\bB\u0012\u0004\u0012\u00020C0@H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bD\u0010E\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006F"}, d2 = {"DEBUG", "", "createPagesAfterList", "", "Landroidx/compose/foundation/pager/MeasuredPage;", "currentLastPage", "", "pagesCount", "beyondBoundsPageCount", "pinnedPages", "getAndMeasure", "Lkotlin/Function1;", "createPagesBeforeList", "currentFirstPage", "debugLog", "", "generateMsg", "Lkotlin/Function0;", "", "calculatePagesOffsets", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "pages", "extraPagesBefore", "extraPagesAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "pagesScrollOffset", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "reverseLayout", "density", "Landroidx/compose/ui/unit/Density;", "spaceBetweenPages", "pageAvailableSize", "index", "childConstraints", "Landroidx/compose/ui/unit/Constraints;", "pagerItemProvider", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "visualPageOffset", "Landroidx/compose/ui/unit/IntOffset;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getAndMeasure-SGf7dI0", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;IJLandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;JLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZI)Landroidx/compose/foundation/pager/MeasuredPage;", "measurePager", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "pageCount", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "firstVisiblePage", "firstVisiblePageOffset", "scrollToBeConsumed", "", "constraints", "layout", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/MeasureResult;", "measurePager-ntgEbfI", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;ILandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;IIIIIIFJLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/Alignment$Horizontal;ZJIILjava/util/List;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/pager/PagerMeasureResult;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPagerMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerMeasure.kt\nandroidx/compose/foundation/pager/PagerMeasureKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,581:1\n578#1,4:582\n33#2,6:586\n33#2,6:592\n33#2,6:598\n33#2,4:607\n38#2:613\n171#2,13:615\n33#2,6:628\n33#2,6:634\n33#2,6:641\n33#2,6:647\n33#2,6:653\n36#3,3:604\n39#3,2:611\n41#3:614\n1#4:640\n*S KotlinDebug\n*F\n+ 1 PagerMeasure.kt\nandroidx/compose/foundation/pager/PagerMeasureKt\n*L\n65#1:582,4\n174#1:586,6\n302#1:592,6\n328#1:598,6\n368#1:607,4\n368#1:613\n373#1:615,13\n427#1:628,6\n452#1:634,6\n554#1:641,6\n561#1:647,6\n567#1:653,6\n368#1:604,3\n368#1:611,2\n368#1:614\n*E\n"})
public final class PagerMeasureKt {
    private static final boolean DEBUG = false;

    private static final List<MeasuredPage> calculatePagesOffsets(LazyLayoutMeasureScope lazyLayoutMeasureScope, List<MeasuredPage> list, List<MeasuredPage> list2, List<MeasuredPage> list3, int i, int i2, int i3, int i4, int i5, Orientation orientation, boolean z, Density density, int i6, int i7) {
        int i8 = i7 + i6;
        int i9 = orientation == Orientation.Vertical ? i2 : i;
        boolean z2 = i3 < Math.min(i9, i4);
        if (z2) {
            if (!(i5 == 0)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        ArrayList arrayList = new ArrayList(list3.size() + list2.size() + list.size());
        if (z2) {
            if (!(list2.isEmpty() && list3.isEmpty())) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            int size = list.size();
            int[] iArr = new int[size];
            for (int i10 = 0; i10 < size; i10++) {
                iArr[i10] = i7;
            }
            int[] iArr2 = new int[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr2[i11] = 0;
            }
            Arrangement.HorizontalOrVertical horizontalOrVerticalM395spacedBy0680j_4 = Arrangement.Absolute.INSTANCE.m395spacedBy0680j_4(lazyLayoutMeasureScope.mo323toDpu2uoSUM(i7));
            if (orientation == Orientation.Vertical) {
                horizontalOrVerticalM395spacedBy0680j_4.arrange(density, i9, iArr, iArr2);
            } else {
                horizontalOrVerticalM395spacedBy0680j_4.arrange(density, i9, iArr, LayoutDirection.Ltr, iArr2);
            }
            IntRange indices = ArraysKt.getIndices(iArr2);
            IntProgression intProgressionReversed = indices;
            if (z) {
                intProgressionReversed = RangesKt___RangesKt.reversed(indices);
            }
            int first = intProgressionReversed.getFirst();
            int last = intProgressionReversed.getLast();
            int step = intProgressionReversed.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    int size2 = iArr2[first];
                    MeasuredPage measuredPage = list.get(calculatePagesOffsets$reverseAware(first, z, size));
                    if (z) {
                        size2 = (i9 - size2) - measuredPage.getSize();
                    }
                    measuredPage.position(size2, i, i2);
                    arrayList.add(measuredPage);
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
        } else {
            int size3 = list2.size();
            int i12 = i5;
            for (int i13 = 0; i13 < size3; i13++) {
                MeasuredPage measuredPage2 = list2.get(i13);
                i12 -= i8;
                measuredPage2.position(i12, i, i2);
                arrayList.add(measuredPage2);
            }
            int size4 = list.size();
            int i14 = i5;
            for (int i15 = 0; i15 < size4; i15++) {
                MeasuredPage measuredPage3 = list.get(i15);
                measuredPage3.position(i14, i, i2);
                arrayList.add(measuredPage3);
                i14 += i8;
            }
            int size5 = list3.size();
            for (int i16 = 0; i16 < size5; i16++) {
                MeasuredPage measuredPage4 = list3.get(i16);
                measuredPage4.position(i14, i, i2);
                arrayList.add(measuredPage4);
                i14 += i8;
            }
        }
        return arrayList;
    }

    private static final int calculatePagesOffsets$reverseAware(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    private static final List<MeasuredPage> createPagesAfterList(int i, int i2, int i3, List<Integer> list, Function1<? super Integer, MeasuredPage> function1) {
        int iMin = Math.min(i3 + i, i2 - 1);
        int i4 = i + 1;
        ArrayList arrayList = null;
        if (i4 <= iMin) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(i4)));
                if (i4 == iMin) {
                    break;
                }
                i4++;
            }
        }
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            int iIntValue = list.get(i5).intValue();
            if (iMin + 1 <= iIntValue && iIntValue < i2) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(iIntValue)));
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    private static final List<MeasuredPage> createPagesBeforeList(int i, int i2, List<Integer> list, Function1<? super Integer, MeasuredPage> function1) {
        int iMax = Math.max(0, i - i2);
        int i3 = i - 1;
        ArrayList arrayList = null;
        if (iMax <= i3) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(i3)));
                if (i3 == iMax) {
                    break;
                }
                i3--;
            }
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            int iIntValue = list.get(i4).intValue();
            if (iIntValue < iMax) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(iIntValue)));
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    private static final void debugLog(Function0<String> function0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getAndMeasure-SGf7dI0, reason: not valid java name */
    public static final MeasuredPage m692getAndMeasureSGf7dI0(LazyLayoutMeasureScope lazyLayoutMeasureScope, int i, long j, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, long j2, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z, int i2) {
        return new MeasuredPage(i, i2, lazyLayoutMeasureScope.mo634measure0kLqBqw(i, j), j2, pagerLazyLayoutItemProvider.getKey(i), orientation, horizontal, vertical, layoutDirection, z, null);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x030e A[LOOP:5: B:100:0x030c->B:101:0x030e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x0339  */
    /* JADX WARN: Code duplicated, block: B:112:0x0340  */
    /* JADX WARN: Code duplicated, block: B:113:0x0344  */
    /* JADX WARN: Code duplicated, block: B:116:0x0350  */
    /* JADX WARN: Code duplicated, block: B:119:0x037b  */
    /* JADX WARN: Code duplicated, block: B:120:0x037d  */
    /* JADX WARN: Code duplicated, block: B:122:0x038d  */
    /* JADX WARN: Code duplicated, block: B:127:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:129:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:134:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:135:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:138:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:139:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:141:0x0400  */
    /* JADX WARN: Code duplicated, block: B:144:0x0437  */
    /* JADX WARN: Code duplicated, block: B:146:0x043c A[LOOP:6: B:142:0x0404->B:146:0x043c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:148:0x0445  */
    /* JADX WARN: Code duplicated, block: B:155:0x0470  */
    /* JADX WARN: Code duplicated, block: B:158:0x0492  */
    /* JADX WARN: Code duplicated, block: B:175:0x0442 A[EDGE_INSN: B:175:0x0442->B:147:0x0442 BREAK  A[LOOP:6: B:142:0x0404->B:146:0x043c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x03bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x025a  */
    /* JADX WARN: Code duplicated, block: B:80:0x025e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0260  */
    /* JADX WARN: Code duplicated, block: B:83:0x0263  */
    /* JADX WARN: Code duplicated, block: B:88:0x0273  */
    /* JADX WARN: Code duplicated, block: B:90:0x027b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:98:0x02c3 A[LOOP:4: B:97:0x02c1->B:98:0x02c3, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: measurePager-ntgEbfI, reason: not valid java name */
    public static final PagerMeasureResult m693measurePagerntgEbfI(@NotNull final LazyLayoutMeasureScope measurePager, int i, @NotNull final PagerLazyLayoutItemProvider pagerItemProvider, int i2, int i3, int i4, int i5, int i6, int i7, float f, long j, @NotNull final Orientation orientation, @Nullable final Alignment.Vertical vertical, @Nullable final Alignment.Horizontal horizontal, final boolean z, final long j2, final int i8, int i9, @NotNull List<Integer> pinnedPages, @NotNull Function3<? super Integer, ? super Integer, ? super Function1<? super Placeable.PlacementScope, Unit>, ? extends MeasureResult> layout) {
        int i10;
        int i11;
        int i12;
        ArrayDeque arrayDeque;
        int i13;
        int i14;
        int i15;
        int i16;
        float f2;
        boolean z2;
        MeasuredPage measuredPage;
        int size;
        int i17;
        int i18;
        MeasuredPage measuredPage2;
        int i19;
        int i20;
        List<MeasuredPage> listCreatePagesBeforeList;
        int size2;
        int iMax;
        int i21;
        MeasuredPage measuredPage3;
        ArrayDeque arrayDeque2;
        List<MeasuredPage> listCreatePagesAfterList;
        int size3;
        int iMax2;
        int i22;
        boolean z3;
        Orientation orientation2;
        int i23;
        int iM3757constrainWidthK40F9xA;
        int iM3756constrainHeightK40F9xA;
        final List<MeasuredPage> listCalculatePagesOffsets;
        ArrayList arrayList;
        int size4;
        int i24;
        List<MeasuredPage> list;
        MeasuredPage measuredPage4;
        MeasuredPage measuredPage5;
        boolean z4;
        int i25;
        MeasuredPage measuredPage6;
        float f3;
        int lastIndex;
        boolean z5;
        boolean z6;
        MeasuredPage measuredPage7;
        int i26;
        MeasuredPage measuredPage8;
        float f4;
        MeasuredPage measuredPage9;
        int i27;
        float f5;
        boolean z7;
        int iMax3;
        ArrayDeque arrayDeque3;
        Intrinsics.checkNotNullParameter(measurePager, "$this$measurePager");
        Intrinsics.checkNotNullParameter(pagerItemProvider, "pagerItemProvider");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(pinnedPages, "pinnedPages");
        Intrinsics.checkNotNullParameter(layout, "layout");
        int i28 = 0;
        if (!(i3 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int iCoerceAtLeast = RangesKt.coerceAtLeast(i8 + i5, 0);
        if (i <= 0) {
            return new PagerMeasureResult(CollectionsKt.emptyList(), 0, i8, i5, i4, orientation, -i3, i2 + i4, false, 0.0f, null, null, 0, false, layout.invoke(Integer.valueOf(Constraints.m3745getMinWidthimpl(j)), Integer.valueOf(Constraints.m3744getMinHeightimpl(j)), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$2
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Placeable.PlacementScope invoke) {
                    Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }
            }));
        }
        Orientation orientation3 = Orientation.Vertical;
        final long jConstraints$default = ConstraintsKt.Constraints$default(0, orientation == orientation3 ? Constraints.m3743getMaxWidthimpl(j) : i8, 0, orientation != orientation3 ? Constraints.m3742getMaxHeightimpl(j) : i8, 5, null);
        int i29 = i6;
        if (i29 >= i) {
            i29 = i - 1;
            i10 = 0;
        } else {
            i10 = i7;
        }
        int iRoundToInt = MathKt.roundToInt(f);
        int i30 = i10 - iRoundToInt;
        if (i29 == 0 && i30 < 0) {
            iRoundToInt += i30;
            i30 = 0;
        }
        int i31 = iRoundToInt;
        ArrayDeque arrayDeque4 = new ArrayDeque();
        int i32 = -i3;
        int i33 = i32 + (i5 < 0 ? i5 : 0);
        int i34 = i30 + i33;
        int iMax4 = 0;
        while (i34 < 0 && i29 > 0) {
            int i35 = i29 - 1;
            int i36 = i28;
            int i37 = iCoerceAtLeast;
            MeasuredPage measuredPageM692getAndMeasureSGf7dI0 = m692getAndMeasureSGf7dI0(measurePager, i35, jConstraints$default, pagerItemProvider, j2, orientation, horizontal, vertical, measurePager.getLayoutDirection(), z, i8);
            arrayDeque4.add(i36, measuredPageM692getAndMeasureSGf7dI0);
            iMax4 = Math.max(iMax4, measuredPageM692getAndMeasureSGf7dI0.getCrossAxisSize());
            i34 += i37;
            i28 = i36;
            iCoerceAtLeast = i37;
            i29 = i35;
        }
        int i38 = i34;
        int i39 = i28;
        int i40 = iCoerceAtLeast;
        if (i38 < i33) {
            i31 += i38;
            i11 = i33;
        } else {
            i11 = i38;
        }
        int i41 = i11 - i33;
        int i42 = i2;
        int i43 = i42 + i4;
        int iCoerceAtLeast2 = RangesKt.coerceAtLeast(i43, i39);
        int size5 = arrayDeque4.size();
        int i44 = i29;
        int i45 = -i41;
        for (int i46 = i39; i46 < size5; i46++) {
            i44++;
            i45 += i40;
        }
        int i47 = i;
        int i48 = i29;
        int i49 = i41;
        int i50 = i45;
        while (true) {
            if (i44 >= i47) {
                i42 = i2;
                break;
            }
            if (i50 >= iCoerceAtLeast2 && i50 > 0 && !arrayDeque4.isEmpty()) {
                break;
            }
            int i51 = i44;
            int i52 = i47;
            ArrayDeque arrayDeque5 = arrayDeque4;
            int i53 = iCoerceAtLeast2;
            int i54 = i43;
            int i55 = iMax4;
            int i56 = i40;
            MeasuredPage measuredPageM692getAndMeasureSGf7dI1 = m692getAndMeasureSGf7dI0(measurePager, i44, jConstraints$default, pagerItemProvider, j2, orientation, horizontal, vertical, measurePager.getLayoutDirection(), z, i8);
            i50 += i56;
            if (i50 > i33 || i51 == i52 - 1) {
                iMax3 = Math.max(i55, measuredPageM692getAndMeasureSGf7dI1.getCrossAxisSize());
                arrayDeque3 = arrayDeque5;
                arrayDeque3.add(measuredPageM692getAndMeasureSGf7dI1);
            } else {
                i49 -= i56;
                arrayDeque3 = arrayDeque5;
                iMax3 = i55;
                i48 = i51 + 1;
            }
            i44 = i51 + 1;
            i42 = i2;
            i47 = i52;
            iCoerceAtLeast2 = i53;
            i43 = i54;
            iMax4 = iMax3;
            arrayDeque4 = arrayDeque3;
            i40 = i56;
        }
        if (i50 < i42) {
            int i57 = i42 - i50;
            i50 += i57;
            int iMax5 = iMax4;
            int i58 = i49 - i57;
            while (i58 < i3 && i48 > 0) {
                i48--;
                int i59 = i44;
                ArrayDeque arrayDeque6 = arrayDeque4;
                MeasuredPage measuredPageM692getAndMeasureSGf7dI2 = m692getAndMeasureSGf7dI0(measurePager, i48, jConstraints$default, pagerItemProvider, j2, orientation, horizontal, vertical, measurePager.getLayoutDirection(), z, i8);
                arrayDeque6.add(0, measuredPageM692getAndMeasureSGf7dI2);
                iMax5 = Math.max(iMax5, measuredPageM692getAndMeasureSGf7dI2.getCrossAxisSize());
                i58 += i40;
                arrayDeque4 = arrayDeque6;
                i44 = i59;
            }
            i12 = i44;
            i49 = i58;
            i13 = iMax5;
            arrayDeque = arrayDeque4;
            i31 += i57;
            if (i49 < 0) {
                i50 += i49;
                i14 = i31 + i49;
                i15 = i48;
                i16 = 0;
            }
            if (MathKt.getSign(MathKt.roundToInt(f)) == MathKt.getSign(i14) || Math.abs(MathKt.roundToInt(f)) < Math.abs(i14)) {
                f2 = f;
            } else {
                f2 = i14;
            }
            if (i16 >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            int i60 = -i16;
            measuredPage = (MeasuredPage) arrayDeque.first();
            if (i3 <= 0 || i5 < 0) {
                size = arrayDeque.size();
                i17 = i16;
                i18 = 0;
                while (i18 < size && i17 != 0 && i40 <= i17 && i18 != CollectionsKt.getLastIndex(arrayDeque)) {
                    i17 -= i40;
                    i18++;
                    measuredPage = (MeasuredPage) arrayDeque.get(i18);
                }
                measuredPage2 = measuredPage;
                i19 = i17;
            } else {
                measuredPage2 = measuredPage;
                i19 = i16;
            }
            int i61 = i13;
            i20 = i50;
            listCreatePagesBeforeList = createPagesBeforeList(i15, i9, pinnedPages, new Function1<Integer, MeasuredPage>() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$extraPagesBefore$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ MeasuredPage invoke(Integer num) {
                    return invoke(num.intValue());
                }

                @NotNull
                public final MeasuredPage invoke(int i62) {
                    LazyLayoutMeasureScope lazyLayoutMeasureScope = measurePager;
                    return PagerMeasureKt.m692getAndMeasureSGf7dI0(lazyLayoutMeasureScope, i62, jConstraints$default, pagerItemProvider, j2, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z, i8);
                }
            });
            size2 = listCreatePagesBeforeList.size();
            iMax = i61;
            for (i21 = 0; i21 < size2; i21++) {
                iMax = Math.max(iMax, listCreatePagesBeforeList.get(i21).getCrossAxisSize());
            }
            measuredPage3 = measuredPage2;
            arrayDeque2 = arrayDeque;
            listCreatePagesAfterList = createPagesAfterList(((MeasuredPage) arrayDeque.last()).getIndex(), i47, i9, pinnedPages, new Function1<Integer, MeasuredPage>() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$extraPagesAfter$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ MeasuredPage invoke(Integer num) {
                    return invoke(num.intValue());
                }

                @NotNull
                public final MeasuredPage invoke(int i62) {
                    LazyLayoutMeasureScope lazyLayoutMeasureScope = measurePager;
                    return PagerMeasureKt.m692getAndMeasureSGf7dI0(lazyLayoutMeasureScope, i62, jConstraints$default, pagerItemProvider, j2, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z, i8);
                }
            });
            size3 = listCreatePagesAfterList.size();
            iMax2 = iMax;
            for (i22 = 0; i22 < size3; i22++) {
                iMax2 = Math.max(iMax2, listCreatePagesAfterList.get(i22).getCrossAxisSize());
            }
            if (!Intrinsics.areEqual(measuredPage3, arrayDeque2.first()) && listCreatePagesBeforeList.isEmpty() && listCreatePagesAfterList.isEmpty()) {
                z3 = true;
            } else {
                z3 = false;
            }
            orientation2 = Orientation.Vertical;
            if (orientation == orientation2) {
                i23 = iMax2;
            } else {
                i23 = i20;
            }
            iM3757constrainWidthK40F9xA = ConstraintsKt.m3757constrainWidthK40F9xA(j, i23);
            if (orientation == orientation2) {
                iMax2 = i20;
            }
            iM3756constrainHeightK40F9xA = ConstraintsKt.m3756constrainHeightK40F9xA(j, iMax2);
            listCalculatePagesOffsets = calculatePagesOffsets(measurePager, arrayDeque2, listCreatePagesBeforeList, listCreatePagesAfterList, iM3757constrainWidthK40F9xA, iM3756constrainHeightK40F9xA, i20, i2, i60, orientation, z, measurePager, i5, i8);
            if (z3) {
                list = listCalculatePagesOffsets;
            } else {
                arrayList = new ArrayList(listCalculatePagesOffsets.size());
                size4 = listCalculatePagesOffsets.size();
                for (i24 = 0; i24 < size4; i24++) {
                    measuredPage4 = listCalculatePagesOffsets.get(i24);
                    measuredPage5 = measuredPage4;
                    if (measuredPage5.getIndex() >= ((MeasuredPage) arrayDeque2.first()).getIndex() || measuredPage5.getIndex() > ((MeasuredPage) arrayDeque2.last()).getIndex()) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (z4) {
                        arrayList.add(measuredPage4);
                    }
                }
                list = arrayList;
            }
            if (orientation == Orientation.Vertical) {
                i25 = iM3756constrainHeightK40F9xA;
            } else {
                i25 = iM3757constrainWidthK40F9xA;
            }
            if (list.isEmpty()) {
                measuredPage7 = null;
                z6 = true;
            } else {
                measuredPage6 = list.get(0);
                MeasuredPage measuredPage10 = measuredPage6;
                f3 = -Math.abs(SnapPositionInLayoutKt.calculateDistanceToDesiredSnapPosition(measurePager, i25, i3, i4, i8, measuredPage10.getOffset(), measuredPage10.getIndex(), PagerStateKt.getSnapAlignmentStartToStart()));
                lastIndex = CollectionsKt.getLastIndex(list);
                z5 = true;
                if (1 <= lastIndex) {
                    i26 = 1;
                    measuredPage8 = measuredPage6;
                    f4 = f3;
                    while (true) {
                        measuredPage9 = list.get(i26);
                        MeasuredPage measuredPage11 = measuredPage9;
                        i27 = i26;
                        z6 = z5;
                        f5 = -Math.abs(SnapPositionInLayoutKt.calculateDistanceToDesiredSnapPosition(measurePager, i25, i3, i4, i8, measuredPage11.getOffset(), measuredPage11.getIndex(), PagerStateKt.getSnapAlignmentStartToStart()));
                        if (Float.compare(f4, f5) < 0) {
                            f4 = f5;
                            measuredPage8 = measuredPage9;
                        }
                        if (i27 != lastIndex) {
                            break;
                        }
                        i26 = i27 + 1;
                        z5 = z6;
                    }
                    measuredPage7 = measuredPage8;
                } else {
                    z6 = true;
                    measuredPage7 = measuredPage6;
                }
            }
            MeasuredPage measuredPage12 = measuredPage7;
            MeasureResult measureResultInvoke = layout.invoke(Integer.valueOf(iM3757constrainWidthK40F9xA), Integer.valueOf(iM3756constrainHeightK40F9xA), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$6
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
                    List<MeasuredPage> list2 = listCalculatePagesOffsets;
                    int size6 = list2.size();
                    for (int i62 = 0; i62 < size6; i62++) {
                        list2.get(i62).place(invoke);
                    }
                }
            });
            if (i12 >= i || i20 > i2) {
                z7 = z6;
            } else {
                z7 = false;
            }
            return new PagerMeasureResult(list, i, i8, i5, i4, orientation, i32, i43, z, f2, measuredPage3, measuredPage12, i19, z7, measureResultInvoke);
        }
        i12 = i44;
        arrayDeque = arrayDeque4;
        i13 = iMax4;
        i14 = i31;
        i15 = i48;
        i16 = i49;
        if (MathKt.getSign(MathKt.roundToInt(f)) == MathKt.getSign(i14)) {
            f2 = f;
        } else {
            f2 = f;
        }
        if (i16 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i62 = -i16;
        measuredPage = (MeasuredPage) arrayDeque.first();
        if (i3 <= 0) {
            size = arrayDeque.size();
            i17 = i16;
            i18 = 0;
            while (i18 < size) {
                i17 -= i40;
                i18++;
                measuredPage = (MeasuredPage) arrayDeque.get(i18);
            }
            measuredPage2 = measuredPage;
            i19 = i17;
        } else {
            size = arrayDeque.size();
            i17 = i16;
            i18 = 0;
            while (i18 < size) {
                i17 -= i40;
                i18++;
                measuredPage = (MeasuredPage) arrayDeque.get(i18);
            }
            measuredPage2 = measuredPage;
            i19 = i17;
        }
        int i63 = i13;
        i20 = i50;
        listCreatePagesBeforeList = createPagesBeforeList(i15, i9, pinnedPages, new Function1<Integer, MeasuredPage>() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$extraPagesBefore$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ MeasuredPage invoke(Integer num) {
                return invoke(num.intValue());
            }

            @NotNull
            public final MeasuredPage invoke(int i64) {
                LazyLayoutMeasureScope lazyLayoutMeasureScope = measurePager;
                return PagerMeasureKt.m692getAndMeasureSGf7dI0(lazyLayoutMeasureScope, i64, jConstraints$default, pagerItemProvider, j2, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z, i8);
            }
        });
        size2 = listCreatePagesBeforeList.size();
        iMax = i63;
        while (i21 < size2) {
            iMax = Math.max(iMax, listCreatePagesBeforeList.get(i21).getCrossAxisSize());
        }
        measuredPage3 = measuredPage2;
        arrayDeque2 = arrayDeque;
        listCreatePagesAfterList = createPagesAfterList(((MeasuredPage) arrayDeque.last()).getIndex(), i47, i9, pinnedPages, new Function1<Integer, MeasuredPage>() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$extraPagesAfter$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ MeasuredPage invoke(Integer num) {
                return invoke(num.intValue());
            }

            @NotNull
            public final MeasuredPage invoke(int i64) {
                LazyLayoutMeasureScope lazyLayoutMeasureScope = measurePager;
                return PagerMeasureKt.m692getAndMeasureSGf7dI0(lazyLayoutMeasureScope, i64, jConstraints$default, pagerItemProvider, j2, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z, i8);
            }
        });
        size3 = listCreatePagesAfterList.size();
        iMax2 = iMax;
        while (i22 < size3) {
            iMax2 = Math.max(iMax2, listCreatePagesAfterList.get(i22).getCrossAxisSize());
        }
        if (!Intrinsics.areEqual(measuredPage3, arrayDeque2.first())) {
            z3 = false;
        } else {
            z3 = false;
        }
        orientation2 = Orientation.Vertical;
        if (orientation == orientation2) {
            i23 = iMax2;
        } else {
            i23 = i20;
        }
        iM3757constrainWidthK40F9xA = ConstraintsKt.m3757constrainWidthK40F9xA(j, i23);
        if (orientation == orientation2) {
            iMax2 = i20;
        }
        iM3756constrainHeightK40F9xA = ConstraintsKt.m3756constrainHeightK40F9xA(j, iMax2);
        listCalculatePagesOffsets = calculatePagesOffsets(measurePager, arrayDeque2, listCreatePagesBeforeList, listCreatePagesAfterList, iM3757constrainWidthK40F9xA, iM3756constrainHeightK40F9xA, i20, i2, i62, orientation, z, measurePager, i5, i8);
        if (z3) {
            list = listCalculatePagesOffsets;
        } else {
            arrayList = new ArrayList(listCalculatePagesOffsets.size());
            size4 = listCalculatePagesOffsets.size();
            while (i24 < size4) {
                measuredPage4 = listCalculatePagesOffsets.get(i24);
                measuredPage5 = measuredPage4;
                if (measuredPage5.getIndex() >= ((MeasuredPage) arrayDeque2.first()).getIndex()) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                if (z4) {
                    arrayList.add(measuredPage4);
                }
            }
            list = arrayList;
        }
        if (orientation == Orientation.Vertical) {
            i25 = iM3756constrainHeightK40F9xA;
        } else {
            i25 = iM3757constrainWidthK40F9xA;
        }
        if (list.isEmpty()) {
            measuredPage7 = null;
            z6 = true;
        } else {
            measuredPage6 = list.get(0);
            MeasuredPage measuredPage13 = measuredPage6;
            f3 = -Math.abs(SnapPositionInLayoutKt.calculateDistanceToDesiredSnapPosition(measurePager, i25, i3, i4, i8, measuredPage13.getOffset(), measuredPage13.getIndex(), PagerStateKt.getSnapAlignmentStartToStart()));
            lastIndex = CollectionsKt.getLastIndex(list);
            z5 = true;
            if (1 <= lastIndex) {
                i26 = 1;
                measuredPage8 = measuredPage6;
                f4 = f3;
                while (true) {
                    measuredPage9 = list.get(i26);
                    MeasuredPage measuredPage14 = measuredPage9;
                    i27 = i26;
                    z6 = z5;
                    f5 = -Math.abs(SnapPositionInLayoutKt.calculateDistanceToDesiredSnapPosition(measurePager, i25, i3, i4, i8, measuredPage14.getOffset(), measuredPage14.getIndex(), PagerStateKt.getSnapAlignmentStartToStart()));
                    if (Float.compare(f4, f5) < 0) {
                        f4 = f5;
                        measuredPage8 = measuredPage9;
                    }
                    if (i27 != lastIndex) {
                        break;
                        break;
                    }
                    i26 = i27 + 1;
                    z5 = z6;
                }
                measuredPage7 = measuredPage8;
            } else {
                z6 = true;
                measuredPage7 = measuredPage6;
            }
        }
        MeasuredPage measuredPage15 = measuredPage7;
        MeasureResult measureResultInvoke2 = layout.invoke(Integer.valueOf(iM3757constrainWidthK40F9xA), Integer.valueOf(iM3756constrainHeightK40F9xA), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$6
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
                List<MeasuredPage> list2 = listCalculatePagesOffsets;
                int size6 = list2.size();
                for (int i64 = 0; i64 < size6; i64++) {
                    list2.get(i64).place(invoke);
                }
            }
        });
        if (i12 >= i) {
            z7 = z6;
        } else {
            z7 = z6;
        }
        return new PagerMeasureResult(list, i, i8, i5, i4, orientation, i32, i43, z, f2, measuredPage3, measuredPage15, i19, z7, measureResultInvoke2);
    }
}
