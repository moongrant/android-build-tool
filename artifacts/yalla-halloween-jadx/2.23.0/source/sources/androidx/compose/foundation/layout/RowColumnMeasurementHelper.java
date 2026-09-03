package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001Br\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012*\u0010\u0004\u001a&\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015ø\u0001\u0000¢\u0006\u0002\u0010\u0017J2\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00162\b\u0010-\u001a\u0004\u0018\u00010)2\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\b2\u0006\u00100\u001a\u00020\u0006H\u0002J(\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u00072\u0006\u00104\u001a\u000205H\u0002J3\u00106\u001a\u0002072\u0006\u00104\u001a\u0002052\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b<\u0010=J&\u0010>\u001a\u00020\n2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u0002072\u0006\u0010B\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\bJ\n\u0010\r\u001a\u00020\u0006*\u00020\u0016J\n\u0010C\u001a\u00020\u0006*\u00020\u0016R5\u0010\u0004\u001a&\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000b\u001a\u00020\fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001b\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0018\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u0015X\u0082\u0004¢\u0006\u0004\n\u0002\u0010*\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006D"}, d2 = {"Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;", "", "orientation", "Landroidx/compose/foundation/layout/LayoutOrientation;", "arrangement", "Lkotlin/Function5;", "", "", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/Density;", "", "arrangementSpacing", "Landroidx/compose/ui/unit/Dp;", "crossAxisSize", "Landroidx/compose/foundation/layout/SizeMode;", "crossAxisAlignment", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "placeables", "", "Landroidx/compose/ui/layout/Placeable;", "(Landroidx/compose/foundation/layout/LayoutOrientation;Lkotlin/jvm/functions/Function5;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;Ljava/util/List;[Landroidx/compose/ui/layout/Placeable;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getArrangement", "()Lkotlin/jvm/functions/Function5;", "getArrangementSpacing-D9Ej5fM", "()F", "F", "getCrossAxisAlignment", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCrossAxisSize", "()Landroidx/compose/foundation/layout/SizeMode;", "getMeasurables", "()Ljava/util/List;", "getOrientation", "()Landroidx/compose/foundation/layout/LayoutOrientation;", "getPlaceables", "()[Landroidx/compose/ui/layout/Placeable;", "[Landroidx/compose/ui/layout/Placeable;", "rowColumnParentData", "Landroidx/compose/foundation/layout/RowColumnParentData;", "[Landroidx/compose/foundation/layout/RowColumnParentData;", "getCrossAxisPosition", "placeable", "parentData", "crossAxisLayoutSize", "layoutDirection", "beforeCrossAxisAlignmentLine", "mainAxisPositions", "mainAxisLayoutSize", "childrenMainAxisSize", "measureScope", "Landroidx/compose/ui/layout/MeasureScope;", "measureWithoutPlacing", "Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "startIndex", "endIndex", "measureWithoutPlacing-_EkL_-Y", "(Landroidx/compose/ui/layout/MeasureScope;JII)Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;", "placeHelper", "placeableScope", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "measureResult", "crossAxisOffset", "mainAxisSize", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRowColumnMeasurementHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnMeasurementHelper.kt\nandroidx/compose/foundation/layout/RowColumnMeasurementHelper\n+ 2 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,325:1\n321#2:326\n321#2:327\n321#2:328\n320#2:329\n323#2:331\n321#2:332\n320#2:333\n323#2:334\n323#2:335\n322#2:336\n1#3:330\n*S KotlinDebug\n*F\n+ 1 RowColumnMeasurementHelper.kt\nandroidx/compose/foundation/layout/RowColumnMeasurementHelper\n*L\n111#1:326\n142#1:327\n143#1:328\n145#1:329\n179#1:331\n189#1:332\n225#1:333\n226#1:334\n229#1:335\n234#1:336\n*E\n"})
public final class RowColumnMeasurementHelper {

    @NotNull
    private final Function5<Integer, int[], LayoutDirection, Density, int[], Unit> arrangement;
    private final float arrangementSpacing;

    @NotNull
    private final CrossAxisAlignment crossAxisAlignment;

    @NotNull
    private final SizeMode crossAxisSize;

    @NotNull
    private final List<Measurable> measurables;

    @NotNull
    private final LayoutOrientation orientation;

    @NotNull
    private final Placeable[] placeables;

    @NotNull
    private final RowColumnParentData[] rowColumnParentData;

    public /* synthetic */ RowColumnMeasurementHelper(LayoutOrientation layoutOrientation, Function5 function5, float f, SizeMode sizeMode, CrossAxisAlignment crossAxisAlignment, List list, Placeable[] placeableArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(layoutOrientation, function5, f, sizeMode, crossAxisAlignment, list, placeableArr);
    }

    private final int getCrossAxisPosition(Placeable placeable, RowColumnParentData parentData, int crossAxisLayoutSize, LayoutDirection layoutDirection, int beforeCrossAxisAlignmentLine) {
        CrossAxisAlignment crossAxisAlignment;
        if (parentData == null || (crossAxisAlignment = parentData.getCrossAxisAlignment()) == null) {
            crossAxisAlignment = this.crossAxisAlignment;
        }
        int iCrossAxisSize = crossAxisLayoutSize - crossAxisSize(placeable);
        if (this.orientation == LayoutOrientation.Horizontal) {
            layoutDirection = LayoutDirection.Ltr;
        }
        return crossAxisAlignment.align$foundation_layout_release(iCrossAxisSize, layoutDirection, placeable, beforeCrossAxisAlignmentLine);
    }

    private final int[] mainAxisPositions(int mainAxisLayoutSize, int[] childrenMainAxisSize, int[] mainAxisPositions, MeasureScope measureScope) {
        this.arrangement.invoke(Integer.valueOf(mainAxisLayoutSize), childrenMainAxisSize, measureScope.getLayoutDirection(), measureScope, mainAxisPositions);
        return mainAxisPositions;
    }

    public final int crossAxisSize(@NotNull Placeable placeable) {
        Intrinsics.checkNotNullParameter(placeable, "<this>");
        return this.orientation == LayoutOrientation.Horizontal ? placeable.getHeight() : placeable.getWidth();
    }

    @NotNull
    public final Function5<Integer, int[], LayoutDirection, Density, int[], Unit> getArrangement() {
        return this.arrangement;
    }

    /* JADX INFO: renamed from: getArrangementSpacing-D9Ej5fM, reason: not valid java name and from getter */
    public final float getArrangementSpacing() {
        return this.arrangementSpacing;
    }

    @NotNull
    public final CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    @NotNull
    public final SizeMode getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @NotNull
    public final List<Measurable> getMeasurables() {
        return this.measurables;
    }

    @NotNull
    public final LayoutOrientation getOrientation() {
        return this.orientation;
    }

    @NotNull
    public final Placeable[] getPlaceables() {
        return this.placeables;
    }

    public final int mainAxisSize(@NotNull Placeable placeable) {
        Intrinsics.checkNotNullParameter(placeable, "<this>");
        return this.orientation == LayoutOrientation.Horizontal ? placeable.getWidth() : placeable.getHeight();
    }

    @NotNull
    /* JADX INFO: renamed from: measureWithoutPlacing-_EkL_-Y, reason: not valid java name */
    public final RowColumnMeasureHelperResult m503measureWithoutPlacing_EkL_Y(@NotNull MeasureScope measureScope, long constraints, int startIndex, int endIndex) {
        int i;
        int iMax;
        int iCoerceAtMost;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(measureScope, "measureScope");
        long jM445constructorimpl = OrientationIndependentConstraints.m445constructorimpl(constraints, this.orientation);
        int iMo318roundToPx0680j_4 = measureScope.mo318roundToPx0680j_4(this.arrangementSpacing);
        int i4 = endIndex - startIndex;
        float f = 0.0f;
        int i5 = 0;
        int i6 = startIndex;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        float f2 = 0.0f;
        while (true) {
            i = Integer.MAX_VALUE;
            if (i6 >= endIndex) {
                break;
            }
            Measurable measurable = this.measurables.get(i6);
            RowColumnParentData rowColumnParentData = this.rowColumnParentData[i6];
            float weight = RowColumnImplKt.getWeight(rowColumnParentData);
            if (weight > f) {
                f2 += weight;
                i9++;
                i6 = i6;
                i5 = i5;
            } else {
                int iM3733getMaxWidthimpl = Constraints.m3733getMaxWidthimpl(jM445constructorimpl);
                Placeable placeableMo2794measureBRTryo0 = this.placeables[i6];
                if (placeableMo2794measureBRTryo0 == null) {
                    placeableMo2794measureBRTryo0 = measurable.mo2794measureBRTryo0(OrientationIndependentConstraints.m458toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m447copyyUG9Ft0$default(jM445constructorimpl, 0, iM3733getMaxWidthimpl == Integer.MAX_VALUE ? Integer.MAX_VALUE : iM3733getMaxWidthimpl - i10, 0, 0, 8, null), this.orientation));
                }
                int iMin = Math.min(iMo318roundToPx0680j_4, (iM3733getMaxWidthimpl - i10) - mainAxisSize(placeableMo2794measureBRTryo0));
                int iMainAxisSize = mainAxisSize(placeableMo2794measureBRTryo0) + iMin + i10;
                int iMax2 = Math.max(i8, crossAxisSize(placeableMo2794measureBRTryo0));
                int i12 = (i11 != 0 || RowColumnImplKt.isRelative(rowColumnParentData)) ? 1 : i5;
                this.placeables[i6] = placeableMo2794measureBRTryo0;
                i7 = iMin;
                i10 = iMainAxisSize;
                i8 = iMax2;
                i11 = i12;
            }
            i6++;
            i5 = i5;
            f = 0.0f;
        }
        int i13 = i5;
        int i14 = i8;
        if (i9 == 0) {
            i10 -= i7;
            iMax = i14;
            iCoerceAtMost = i13;
        } else {
            int i15 = (i9 - 1) * iMo318roundToPx0680j_4;
            int iM3735getMinWidthimpl = (((f2 <= 0.0f || Constraints.m3733getMaxWidthimpl(jM445constructorimpl) == Integer.MAX_VALUE) ? Constraints.m3735getMinWidthimpl(jM445constructorimpl) : Constraints.m3733getMaxWidthimpl(jM445constructorimpl)) - i10) - i15;
            float f3 = f2 > 0.0f ? iM3735getMinWidthimpl / f2 : 0.0f;
            Iterator<Integer> it = RangesKt.until(startIndex, endIndex).iterator();
            int iRoundToInt = i13;
            while (it.hasNext()) {
                iRoundToInt += MathKt.roundToInt(RowColumnImplKt.getWeight(this.rowColumnParentData[((IntIterator) it).nextInt()]) * f3);
            }
            int i16 = iM3735getMinWidthimpl - iRoundToInt;
            int i17 = startIndex;
            iMax = i14;
            int i18 = i13;
            while (i17 < endIndex) {
                if (this.placeables[i17] == null) {
                    Measurable measurable2 = this.measurables.get(i17);
                    RowColumnParentData rowColumnParentData2 = this.rowColumnParentData[i17];
                    float weight2 = RowColumnImplKt.getWeight(rowColumnParentData2);
                    if ((weight2 > 0.0f ? 1 : i13) == 0) {
                        throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                    }
                    int sign = MathKt.getSign(i16);
                    int i19 = i16 - sign;
                    int iMax3 = Math.max(i13, MathKt.roundToInt(weight2 * f3) + sign);
                    Placeable placeableMo2794measureBRTryo1 = measurable2.mo2794measureBRTryo0(OrientationIndependentConstraints.m458toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m443constructorimpl((!RowColumnImplKt.getFill(rowColumnParentData2) || iMax3 == i) ? i13 : iMax3, iMax3, i13, Constraints.m3732getMaxHeightimpl(jM445constructorimpl)), this.orientation));
                    int iMainAxisSize2 = mainAxisSize(placeableMo2794measureBRTryo1) + i18;
                    iMax = Math.max(iMax, crossAxisSize(placeableMo2794measureBRTryo1));
                    int i20 = (i11 != 0 || RowColumnImplKt.isRelative(rowColumnParentData2)) ? 1 : i13;
                    this.placeables[i17] = placeableMo2794measureBRTryo1;
                    i11 = i20;
                    i16 = i19;
                    i18 = iMainAxisSize2;
                }
                i17++;
                i = Integer.MAX_VALUE;
            }
            iCoerceAtMost = RangesKt.coerceAtMost(i18 + i15, Constraints.m3733getMaxWidthimpl(jM445constructorimpl) - i10);
        }
        if (i11 != 0) {
            int iMax4 = i13;
            int iMax5 = iMax4;
            for (int i21 = startIndex; i21 < endIndex; i21++) {
                Placeable placeable = this.placeables[i21];
                Intrinsics.checkNotNull(placeable);
                CrossAxisAlignment crossAxisAlignment = RowColumnImplKt.getCrossAxisAlignment(this.rowColumnParentData[i21]);
                Integer numCalculateAlignmentLinePosition$foundation_layout_release = crossAxisAlignment != null ? crossAxisAlignment.calculateAlignmentLinePosition$foundation_layout_release(placeable) : null;
                if (numCalculateAlignmentLinePosition$foundation_layout_release != null) {
                    int iIntValue = numCalculateAlignmentLinePosition$foundation_layout_release.intValue();
                    if (iIntValue == Integer.MIN_VALUE) {
                        iIntValue = i13;
                    }
                    iMax4 = Math.max(iMax4, iIntValue);
                    int iCrossAxisSize = crossAxisSize(placeable);
                    int iIntValue2 = numCalculateAlignmentLinePosition$foundation_layout_release.intValue();
                    if (iIntValue2 == Integer.MIN_VALUE) {
                        iIntValue2 = crossAxisSize(placeable);
                    }
                    iMax5 = Math.max(iMax5, iCrossAxisSize - iIntValue2);
                }
            }
            int i22 = iMax5;
            i3 = iMax4;
            i2 = i22;
        } else {
            i2 = i13;
            i3 = i2;
        }
        int iMax6 = Math.max(i10 + iCoerceAtMost, Constraints.m3735getMinWidthimpl(jM445constructorimpl));
        int iMax7 = (Constraints.m3732getMaxHeightimpl(jM445constructorimpl) == Integer.MAX_VALUE || this.crossAxisSize != SizeMode.Expand) ? Math.max(iMax, Math.max(Constraints.m3734getMinHeightimpl(jM445constructorimpl), i2 + i3)) : Constraints.m3732getMaxHeightimpl(jM445constructorimpl);
        int[] iArr = new int[i4];
        for (int i23 = i13; i23 < i4; i23++) {
            iArr[i23] = i13;
        }
        int[] iArr2 = new int[i4];
        for (int i24 = i13; i24 < i4; i24++) {
            Placeable placeable2 = this.placeables[i24 + startIndex];
            Intrinsics.checkNotNull(placeable2);
            iArr2[i24] = mainAxisSize(placeable2);
        }
        return new RowColumnMeasureHelperResult(iMax7, iMax6, startIndex, endIndex, i3, mainAxisPositions(iMax6, iArr2, iArr, measureScope));
    }

    public final void placeHelper(@NotNull Placeable.PlacementScope placeableScope, @NotNull RowColumnMeasureHelperResult measureResult, int crossAxisOffset, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(placeableScope, "placeableScope");
        Intrinsics.checkNotNullParameter(measureResult, "measureResult");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        int endIndex = measureResult.getEndIndex();
        for (int startIndex = measureResult.getStartIndex(); startIndex < endIndex; startIndex++) {
            Placeable placeable = this.placeables[startIndex];
            Intrinsics.checkNotNull(placeable);
            int[] mainAxisPositions = measureResult.getMainAxisPositions();
            Object parentData = this.measurables.get(startIndex).getParentData();
            int crossAxisPosition = getCrossAxisPosition(placeable, parentData instanceof RowColumnParentData ? (RowColumnParentData) parentData : null, measureResult.getCrossAxisSize(), layoutDirection, measureResult.getBeforeCrossAxisAlignmentLine()) + crossAxisOffset;
            if (this.orientation == LayoutOrientation.Horizontal) {
                Placeable.PlacementScope.place$default(placeableScope, placeable, mainAxisPositions[startIndex - measureResult.getStartIndex()], crossAxisPosition, 0.0f, 4, null);
            } else {
                Placeable.PlacementScope.place$default(placeableScope, placeable, crossAxisPosition, mainAxisPositions[startIndex - measureResult.getStartIndex()], 0.0f, 4, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private RowColumnMeasurementHelper(LayoutOrientation orientation, Function5<? super Integer, ? super int[], ? super LayoutDirection, ? super Density, ? super int[], Unit> arrangement, float f, SizeMode crossAxisSize, CrossAxisAlignment crossAxisAlignment, List<? extends Measurable> measurables, Placeable[] placeables) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(arrangement, "arrangement");
        Intrinsics.checkNotNullParameter(crossAxisSize, "crossAxisSize");
        Intrinsics.checkNotNullParameter(crossAxisAlignment, "crossAxisAlignment");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        Intrinsics.checkNotNullParameter(placeables, "placeables");
        this.orientation = orientation;
        this.arrangement = arrangement;
        this.arrangementSpacing = f;
        this.crossAxisSize = crossAxisSize;
        this.crossAxisAlignment = crossAxisAlignment;
        this.measurables = measurables;
        this.placeables = placeables;
        int size = measurables.size();
        RowColumnParentData[] rowColumnParentDataArr = new RowColumnParentData[size];
        for (int i = 0; i < size; i++) {
            rowColumnParentDataArr[i] = RowColumnImplKt.getRowColumnParentData(this.measurables.get(i));
        }
        this.rowColumnParentData = rowColumnParentDataArr;
    }
}
