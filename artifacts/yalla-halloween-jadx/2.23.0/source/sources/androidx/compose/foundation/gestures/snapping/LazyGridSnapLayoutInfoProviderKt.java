package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.SplineBasedDecayKt;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.grid.LazyGridItemInfo;
import androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007\u001a\u0014\u0010\u000b\u001a\u00020\u0001*\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0000\u001a\u0014\u0010\u000f\u001a\u00020\u0001*\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0010"}, d2 = {"singleAxisViewportSize", "", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "getSingleAxisViewportSize", "(Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;)I", "SnapLayoutInfoProvider", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "lazyGridState", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "positionInLayout", "Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;", "offsetOnMainAxis", "Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "sizeOnMainAxis", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LazyGridSnapLayoutInfoProviderKt {
    @ExperimentalFoundationApi
    @NotNull
    public static final SnapLayoutInfoProvider SnapLayoutInfoProvider(@NotNull final LazyGridState lazyGridState, @NotNull final SnapPositionInLayout positionInLayout) {
        Intrinsics.checkNotNullParameter(lazyGridState, "lazyGridState");
        Intrinsics.checkNotNullParameter(positionInLayout, "positionInLayout");
        return new SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt.SnapLayoutInfoProvider.1
            private final LazyGridLayoutInfo getLayoutInfo() {
                return lazyGridState.getLayoutInfo();
            }

            private final List<LazyGridItemInfo> getSingleAxisItems() {
                List<LazyGridItemInfo> visibleItemsInfo = lazyGridState.getLayoutInfo().getVisibleItemsInfo();
                LazyGridState lazyGridState2 = lazyGridState;
                ArrayList arrayList = new ArrayList(visibleItemsInfo.size());
                int size = visibleItemsInfo.size();
                for (int i = 0; i < size; i++) {
                    LazyGridItemInfo lazyGridItemInfo = visibleItemsInfo.get(i);
                    LazyGridItemInfo lazyGridItemInfo2 = lazyGridItemInfo;
                    boolean z = true;
                    if (lazyGridState2.getLayoutInfo().getOrientation() != Orientation.Horizontal ? lazyGridItemInfo2.getColumn() != 0 : lazyGridItemInfo2.getRow() != 0) {
                        z = false;
                    }
                    if (z) {
                        arrayList.add(lazyGridItemInfo);
                    }
                }
                return arrayList;
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateApproachOffset(@NotNull Density density, float f) {
                Intrinsics.checkNotNullParameter(density, "<this>");
                float fCoerceAtLeast = RangesKt.coerceAtLeast(Math.abs(DecayAnimationSpecKt.calculateTargetValue(SplineBasedDecayKt.splineBasedDecay(density), 0.0f, f)) - calculateSnapStepSize(density), 0.0f);
                return (fCoerceAtLeast > 0.0f ? 1 : (fCoerceAtLeast == 0.0f ? 0 : -1)) == 0 ? fCoerceAtLeast : fCoerceAtLeast * Math.signum(f);
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnapStepSize(@NotNull Density density) {
                int iM3925getWidthimpl;
                Intrinsics.checkNotNullParameter(density, "<this>");
                if (!(!getSingleAxisItems().isEmpty())) {
                    return 0.0f;
                }
                int i = 0;
                if (getLayoutInfo().getOrientation() == Orientation.Vertical) {
                    List<LazyGridItemInfo> singleAxisItems = getSingleAxisItems();
                    int size = singleAxisItems.size();
                    iM3925getWidthimpl = 0;
                    while (i < size) {
                        iM3925getWidthimpl += IntSize.m3924getHeightimpl(singleAxisItems.get(i).getSize());
                        i++;
                    }
                } else {
                    List<LazyGridItemInfo> singleAxisItems2 = getSingleAxisItems();
                    int size2 = singleAxisItems2.size();
                    iM3925getWidthimpl = 0;
                    while (i < size2) {
                        iM3925getWidthimpl += IntSize.m3925getWidthimpl(singleAxisItems2.get(i).getSize());
                        i++;
                    }
                }
                return iM3925getWidthimpl / getSingleAxisItems().size();
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnappingOffset(@NotNull Density density, float f) {
                Intrinsics.checkNotNullParameter(density, "<this>");
                List<LazyGridItemInfo> visibleItemsInfo = getLayoutInfo().getVisibleItemsInfo();
                SnapPositionInLayout snapPositionInLayout = positionInLayout;
                int size = visibleItemsInfo.size();
                float f2 = Float.NEGATIVE_INFINITY;
                float f3 = Float.POSITIVE_INFINITY;
                for (int i = 0; i < size; i++) {
                    LazyGridItemInfo lazyGridItemInfo = visibleItemsInfo.get(i);
                    float fCalculateDistanceToDesiredSnapPosition = SnapPositionInLayoutKt.calculateDistanceToDesiredSnapPosition(density, LazyGridSnapLayoutInfoProviderKt.getSingleAxisViewportSize(getLayoutInfo()), getLayoutInfo().getBeforeContentPadding(), getLayoutInfo().getAfterContentPadding(), LazyGridSnapLayoutInfoProviderKt.sizeOnMainAxis(lazyGridItemInfo, getLayoutInfo().getOrientation()), LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(lazyGridItemInfo, getLayoutInfo().getOrientation()), lazyGridItemInfo.getIndex(), snapPositionInLayout);
                    if (fCalculateDistanceToDesiredSnapPosition <= 0.0f && fCalculateDistanceToDesiredSnapPosition > f2) {
                        f2 = fCalculateDistanceToDesiredSnapPosition;
                    }
                    if (fCalculateDistanceToDesiredSnapPosition >= 0.0f && fCalculateDistanceToDesiredSnapPosition < f3) {
                        f3 = fCalculateDistanceToDesiredSnapPosition;
                    }
                }
                return SnapFlingBehaviorKt.calculateFinalOffset(f, f2, f3);
            }
        };
    }

    public static /* synthetic */ SnapLayoutInfoProvider SnapLayoutInfoProvider$default(LazyGridState lazyGridState, SnapPositionInLayout snapPositionInLayout, int i, Object obj) {
        if ((i & 2) != 0) {
            snapPositionInLayout = SnapPositionInLayout.INSTANCE.getCenterToCenter();
        }
        return SnapLayoutInfoProvider(lazyGridState, snapPositionInLayout);
    }

    public static final int getSingleAxisViewportSize(@NotNull LazyGridLayoutInfo lazyGridLayoutInfo) {
        Intrinsics.checkNotNullParameter(lazyGridLayoutInfo, "<this>");
        return lazyGridLayoutInfo.getOrientation() == Orientation.Vertical ? IntSize.m3924getHeightimpl(lazyGridLayoutInfo.mo588getViewportSizeYbymL2g()) : IntSize.m3925getWidthimpl(lazyGridLayoutInfo.mo588getViewportSizeYbymL2g());
    }

    public static final int offsetOnMainAxis(@NotNull LazyGridItemInfo lazyGridItemInfo, @NotNull Orientation orientation) {
        Intrinsics.checkNotNullParameter(lazyGridItemInfo, "<this>");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return orientation == Orientation.Vertical ? IntOffset.m3884getYimpl(lazyGridItemInfo.getOffset()) : IntOffset.m3883getXimpl(lazyGridItemInfo.getOffset());
    }

    public static final int sizeOnMainAxis(@NotNull LazyGridItemInfo lazyGridItemInfo, @NotNull Orientation orientation) {
        Intrinsics.checkNotNullParameter(lazyGridItemInfo, "<this>");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return orientation == Orientation.Vertical ? IntSize.m3924getHeightimpl(lazyGridItemInfo.getSize()) : IntSize.m3925getWidthimpl(lazyGridItemInfo.getSize());
    }
}
