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
@SourceDebugExtension({"SMAP\nRowColumnMeasurementHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnMeasurementHelper.kt\nandroidx/compose/foundation/layout/RowColumnMeasurementHelper\n+ 2 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,331:1\n321#2:332\n321#2:333\n321#2:334\n320#2:335\n323#2:337\n321#2:338\n320#2:339\n323#2:340\n323#2:341\n322#2:342\n1#3:336\n*S KotlinDebug\n*F\n+ 1 RowColumnMeasurementHelper.kt\nandroidx/compose/foundation/layout/RowColumnMeasurementHelper\n*L\n111#1:332\n143#1:333\n144#1:334\n146#1:335\n181#1:337\n191#1:338\n230#1:339\n232#1:340\n235#1:341\n240#1:342\n*E\n"})
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
    public final RowColumnMeasureHelperResult m505measureWithoutPlacing_EkL_Y(@NotNull MeasureScope measureScope, long constraints, int startIndex, int endIndex) {
        int i;
        int i2;
        int iCoerceIn;
        int iMax;
        int i3;
        long j;
        int i4 = endIndex;
        Intrinsics.checkNotNullParameter(measureScope, "measureScope");
        long jM447constructorimpl = OrientationIndependentConstraints.m447constructorimpl(constraints, this.orientation);
        long jMo320roundToPx0680j_4 = measureScope.mo320roundToPx0680j_4(this.arrangementSpacing);
        int i5 = i4 - startIndex;
        long j2 = 0;
        int i6 = startIndex;
        long jMainAxisSize = 0;
        float f = 0.0f;
        int i7 = 0;
        int iMax2 = 0;
        int i8 = 0;
        boolean z = false;
        while (true) {
            boolean z2 = true;
            if (i6 >= i4) {
                break;
            }
            Measurable measurable = this.measurables.get(i6);
            RowColumnParentData rowColumnParentData = this.rowColumnParentData[i6];
            float weight = RowColumnImplKt.getWeight(rowColumnParentData);
            if (weight > 0.0f) {
                f += weight;
                i8++;
                i6 = i6;
                j = j2;
            } else {
                int iM3743getMaxWidthimpl = Constraints.m3743getMaxWidthimpl(jM447constructorimpl);
                Placeable placeableMo2804measureBRTryo0 = this.placeables[i6];
                if (placeableMo2804measureBRTryo0 == null) {
                    placeableMo2804measureBRTryo0 = measurable.mo2804measureBRTryo0(OrientationIndependentConstraints.m460toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m449copyyUG9Ft0$default(jM447constructorimpl, 0, iM3743getMaxWidthimpl == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) RangesKt.coerceAtLeast(((long) iM3743getMaxWidthimpl) - jMainAxisSize, j2), 0, 0, 8, null), this.orientation));
                }
                j = 0;
                int iMin = Math.min((int) jMo320roundToPx0680j_4, (int) RangesKt.coerceAtLeast((((long) iM3743getMaxWidthimpl) - jMainAxisSize) - ((long) mainAxisSize(placeableMo2804measureBRTryo0)), 0L));
                jMainAxisSize += (long) (mainAxisSize(placeableMo2804measureBRTryo0) + iMin);
                int iMax3 = Math.max(iMax2, crossAxisSize(placeableMo2804measureBRTryo0));
                if (!z && !RowColumnImplKt.isRelative(rowColumnParentData)) {
                    z2 = false;
                }
                this.placeables[i6] = placeableMo2804measureBRTryo0;
                i7 = iMin;
                iMax2 = iMax3;
                z = z2;
            }
            j2 = j;
            i6++;
        }
        long j3 = j2;
        if (i8 == 0) {
            jMainAxisSize -= (long) i7;
            i = i5;
            i2 = 0;
            iCoerceIn = 0;
        } else {
            long j4 = jMo320roundToPx0680j_4 * ((long) (i8 - 1));
            long jCoerceAtLeast = RangesKt.coerceAtLeast((((long) ((f <= 0.0f || Constraints.m3743getMaxWidthimpl(jM447constructorimpl) == Integer.MAX_VALUE) ? Constraints.m3745getMinWidthimpl(jM447constructorimpl) : Constraints.m3743getMaxWidthimpl(jM447constructorimpl))) - jMainAxisSize) - j4, j3);
            float f2 = f > 0.0f ? jCoerceAtLeast / f : 0.0f;
            Iterator<Integer> it = RangesKt.until(startIndex, endIndex).iterator();
            int iRoundToInt = 0;
            while (it.hasNext()) {
                iRoundToInt += MathKt.roundToInt(RowColumnImplKt.getWeight(this.rowColumnParentData[((IntIterator) it).nextInt()]) * f2);
            }
            long j5 = jCoerceAtLeast - ((long) iRoundToInt);
            int i9 = startIndex;
            int i10 = 0;
            while (i9 < i4) {
                if (this.placeables[i9] == null) {
                    Measurable measurable2 = this.measurables.get(i9);
                    RowColumnParentData rowColumnParentData2 = this.rowColumnParentData[i9];
                    float weight2 = RowColumnImplKt.getWeight(rowColumnParentData2);
                    if (!(weight2 > 0.0f)) {
                        throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                    }
                    int sign = MathKt.getSign(j5);
                    j5 -= (long) sign;
                    int iMax4 = Math.max(0, MathKt.roundToInt(weight2 * f2) + sign);
                    Placeable placeableMo2804measureBRTryo1 = measurable2.mo2804measureBRTryo0(OrientationIndependentConstraints.m460toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m445constructorimpl((!RowColumnImplKt.getFill(rowColumnParentData2) || iMax4 == Integer.MAX_VALUE) ? 0 : iMax4, iMax4, 0, Constraints.m3742getMaxHeightimpl(jM447constructorimpl)), this.orientation));
                    int iMainAxisSize = mainAxisSize(placeableMo2804measureBRTryo1) + i10;
                    iMax2 = Math.max(iMax2, crossAxisSize(placeableMo2804measureBRTryo1));
                    boolean z3 = z || RowColumnImplKt.isRelative(rowColumnParentData2);
                    this.placeables[i9] = placeableMo2804measureBRTryo1;
                    z = z3;
                    i10 = iMainAxisSize;
                }
                i9++;
                i5 = i5;
                i4 = endIndex;
                f2 = f2;
            }
            i = i5;
            i2 = 0;
            iCoerceIn = (int) RangesKt.coerceIn(((long) i10) + j4, 0L, ((long) Constraints.m3743getMaxWidthimpl(jM447constructorimpl)) - jMainAxisSize);
        }
        if (z) {
            int iMax5 = i2;
            iMax = iMax5;
            for (int i11 = startIndex; i11 < endIndex; i11++) {
                Placeable placeable = this.placeables[i11];
                Intrinsics.checkNotNull(placeable);
                CrossAxisAlignment crossAxisAlignment = RowColumnImplKt.getCrossAxisAlignment(this.rowColumnParentData[i11]);
                Integer numCalculateAlignmentLinePosition$foundation_layout_release = crossAxisAlignment != null ? crossAxisAlignment.calculateAlignmentLinePosition$foundation_layout_release(placeable) : null;
                if (numCalculateAlignmentLinePosition$foundation_layout_release != null) {
                    int iIntValue = numCalculateAlignmentLinePosition$foundation_layout_release.intValue();
                    if (iIntValue == Integer.MIN_VALUE) {
                        iIntValue = i2;
                    }
                    iMax5 = Math.max(iMax5, iIntValue);
                    int iCrossAxisSize = crossAxisSize(placeable);
                    int iIntValue2 = numCalculateAlignmentLinePosition$foundation_layout_release.intValue();
                    if (iIntValue2 == Integer.MIN_VALUE) {
                        iIntValue2 = crossAxisSize(placeable);
                    }
                    iMax = Math.max(iMax, iCrossAxisSize - iIntValue2);
                }
            }
            i3 = iMax5;
        } else {
            iMax = i2;
            i3 = iMax;
        }
        int iMax6 = Math.max((int) RangesKt.coerceAtLeast(jMainAxisSize + ((long) iCoerceIn), 0L), Constraints.m3745getMinWidthimpl(jM447constructorimpl));
        int iMax7 = (Constraints.m3742getMaxHeightimpl(jM447constructorimpl) == Integer.MAX_VALUE || this.crossAxisSize != SizeMode.Expand) ? Math.max(iMax2, Math.max(Constraints.m3744getMinHeightimpl(jM447constructorimpl), iMax + i3)) : Constraints.m3742getMaxHeightimpl(jM447constructorimpl);
        int i12 = i;
        int[] iArr = new int[i12];
        for (int i13 = i2; i13 < i12; i13++) {
            iArr[i13] = i2;
        }
        int[] iArr2 = new int[i12];
        for (int i14 = i2; i14 < i12; i14++) {
            Placeable placeable2 = this.placeables[i14 + startIndex];
            Intrinsics.checkNotNull(placeable2);
            iArr2[i14] = mainAxisSize(placeable2);
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
