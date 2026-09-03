package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0019\u0010\u0010\u001a\u00020\u0011*\u00020\u0012H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0015\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u001c\u0010\u001b\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0016H\u0016J)\u0010\u001d\u001a\u00020\u001e*\u00020\u001f2\u0006\u0010\u0018\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0012H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J\u001c\u0010$\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u001c\u0010%\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0016H\u0016J#\u0010&\u001a\u00020\u0011*\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)J#\u0010*\u001a\u00020\u0011*\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010)J#\u0010,\u001a\u00020\u0011*\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010)J#\u0010.\u001a\u00020\u0011*\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u0010)R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00060"}, d2 = {"Landroidx/compose/foundation/layout/AspectRatioNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "aspectRatio", "", "matchHeightConstraintsFirst", "", "(FZ)V", "getAspectRatio", "()F", "setAspectRatio", "(F)V", "getMatchHeightConstraintsFirst", "()Z", "setMatchHeightConstraintsFirst", "(Z)V", "findSize", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/unit/Constraints;", "findSize-ToXhtMw", "(J)J", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "maxIntrinsicWidth", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "tryMaxHeight", "enforceConstraints", "tryMaxHeight-JN-0ABg", "(JZ)J", "tryMaxWidth", "tryMaxWidth-JN-0ABg", "tryMinHeight", "tryMinHeight-JN-0ABg", "tryMinWidth", "tryMinWidth-JN-0ABg", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAspectRatio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,235:1\n1#2:236\n*E\n"})
final class AspectRatioNode extends Modifier.Node implements LayoutModifierNode {
    private float aspectRatio;
    private boolean matchHeightConstraintsFirst;

    public AspectRatioNode(float f, boolean z) {
        this.aspectRatio = f;
        this.matchHeightConstraintsFirst = z;
    }

    /* JADX INFO: renamed from: findSize-ToXhtMw, reason: not valid java name */
    private final long m404findSizeToXhtMw(long j) {
        if (this.matchHeightConstraintsFirst) {
            long jM406tryMaxHeightJN0ABg$default = m406tryMaxHeightJN0ABg$default(this, j, false, 1, null);
            IntSize.Companion companion = IntSize.INSTANCE;
            if (!IntSize.m3923equalsimpl0(jM406tryMaxHeightJN0ABg$default, companion.m3930getZeroYbymL2g())) {
                return jM406tryMaxHeightJN0ABg$default;
            }
            long jM408tryMaxWidthJN0ABg$default = m408tryMaxWidthJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m3923equalsimpl0(jM408tryMaxWidthJN0ABg$default, companion.m3930getZeroYbymL2g())) {
                return jM408tryMaxWidthJN0ABg$default;
            }
            long jM410tryMinHeightJN0ABg$default = m410tryMinHeightJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m3923equalsimpl0(jM410tryMinHeightJN0ABg$default, companion.m3930getZeroYbymL2g())) {
                return jM410tryMinHeightJN0ABg$default;
            }
            long jM412tryMinWidthJN0ABg$default = m412tryMinWidthJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m3923equalsimpl0(jM412tryMinWidthJN0ABg$default, companion.m3930getZeroYbymL2g())) {
                return jM412tryMinWidthJN0ABg$default;
            }
            long jM405tryMaxHeightJN0ABg = m405tryMaxHeightJN0ABg(j, false);
            if (!IntSize.m3923equalsimpl0(jM405tryMaxHeightJN0ABg, companion.m3930getZeroYbymL2g())) {
                return jM405tryMaxHeightJN0ABg;
            }
            long jM407tryMaxWidthJN0ABg = m407tryMaxWidthJN0ABg(j, false);
            if (!IntSize.m3923equalsimpl0(jM407tryMaxWidthJN0ABg, companion.m3930getZeroYbymL2g())) {
                return jM407tryMaxWidthJN0ABg;
            }
            long jM409tryMinHeightJN0ABg = m409tryMinHeightJN0ABg(j, false);
            if (!IntSize.m3923equalsimpl0(jM409tryMinHeightJN0ABg, companion.m3930getZeroYbymL2g())) {
                return jM409tryMinHeightJN0ABg;
            }
            long jM411tryMinWidthJN0ABg = m411tryMinWidthJN0ABg(j, false);
            if (!IntSize.m3923equalsimpl0(jM411tryMinWidthJN0ABg, companion.m3930getZeroYbymL2g())) {
                return jM411tryMinWidthJN0ABg;
            }
        } else {
            long jM408tryMaxWidthJN0ABg$default2 = m408tryMaxWidthJN0ABg$default(this, j, false, 1, null);
            IntSize.Companion companion2 = IntSize.INSTANCE;
            if (!IntSize.m3923equalsimpl0(jM408tryMaxWidthJN0ABg$default2, companion2.m3930getZeroYbymL2g())) {
                return jM408tryMaxWidthJN0ABg$default2;
            }
            long jM406tryMaxHeightJN0ABg$default2 = m406tryMaxHeightJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m3923equalsimpl0(jM406tryMaxHeightJN0ABg$default2, companion2.m3930getZeroYbymL2g())) {
                return jM406tryMaxHeightJN0ABg$default2;
            }
            long jM412tryMinWidthJN0ABg$default2 = m412tryMinWidthJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m3923equalsimpl0(jM412tryMinWidthJN0ABg$default2, companion2.m3930getZeroYbymL2g())) {
                return jM412tryMinWidthJN0ABg$default2;
            }
            long jM410tryMinHeightJN0ABg$default2 = m410tryMinHeightJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m3923equalsimpl0(jM410tryMinHeightJN0ABg$default2, companion2.m3930getZeroYbymL2g())) {
                return jM410tryMinHeightJN0ABg$default2;
            }
            long jM407tryMaxWidthJN0ABg2 = m407tryMaxWidthJN0ABg(j, false);
            if (!IntSize.m3923equalsimpl0(jM407tryMaxWidthJN0ABg2, companion2.m3930getZeroYbymL2g())) {
                return jM407tryMaxWidthJN0ABg2;
            }
            long jM405tryMaxHeightJN0ABg2 = m405tryMaxHeightJN0ABg(j, false);
            if (!IntSize.m3923equalsimpl0(jM405tryMaxHeightJN0ABg2, companion2.m3930getZeroYbymL2g())) {
                return jM405tryMaxHeightJN0ABg2;
            }
            long jM411tryMinWidthJN0ABg2 = m411tryMinWidthJN0ABg(j, false);
            if (!IntSize.m3923equalsimpl0(jM411tryMinWidthJN0ABg2, companion2.m3930getZeroYbymL2g())) {
                return jM411tryMinWidthJN0ABg2;
            }
            long jM409tryMinHeightJN0ABg2 = m409tryMinHeightJN0ABg(j, false);
            if (!IntSize.m3923equalsimpl0(jM409tryMinHeightJN0ABg2, companion2.m3930getZeroYbymL2g())) {
                return jM409tryMinHeightJN0ABg2;
            }
        }
        return IntSize.INSTANCE.m3930getZeroYbymL2g();
    }

    /* JADX INFO: renamed from: tryMaxHeight-JN-0ABg, reason: not valid java name */
    private final long m405tryMaxHeightJN0ABg(long j, boolean z) {
        int iRoundToInt;
        int iM3732getMaxHeightimpl = Constraints.m3732getMaxHeightimpl(j);
        if (iM3732getMaxHeightimpl != Integer.MAX_VALUE && (iRoundToInt = MathKt.roundToInt(iM3732getMaxHeightimpl * this.aspectRatio)) > 0) {
            long jIntSize = IntSizeKt.IntSize(iRoundToInt, iM3732getMaxHeightimpl);
            if (!z || ConstraintsKt.m3748isSatisfiedBy4WqzIAM(j, jIntSize)) {
                return jIntSize;
            }
        }
        return IntSize.INSTANCE.m3930getZeroYbymL2g();
    }

    /* JADX INFO: renamed from: tryMaxHeight-JN-0ABg$default, reason: not valid java name */
    public static /* synthetic */ long m406tryMaxHeightJN0ABg$default(AspectRatioNode aspectRatioNode, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioNode.m405tryMaxHeightJN0ABg(j, z);
    }

    /* JADX INFO: renamed from: tryMaxWidth-JN-0ABg, reason: not valid java name */
    private final long m407tryMaxWidthJN0ABg(long j, boolean z) {
        int iRoundToInt;
        int iM3733getMaxWidthimpl = Constraints.m3733getMaxWidthimpl(j);
        if (iM3733getMaxWidthimpl != Integer.MAX_VALUE && (iRoundToInt = MathKt.roundToInt(iM3733getMaxWidthimpl / this.aspectRatio)) > 0) {
            long jIntSize = IntSizeKt.IntSize(iM3733getMaxWidthimpl, iRoundToInt);
            if (!z || ConstraintsKt.m3748isSatisfiedBy4WqzIAM(j, jIntSize)) {
                return jIntSize;
            }
        }
        return IntSize.INSTANCE.m3930getZeroYbymL2g();
    }

    /* JADX INFO: renamed from: tryMaxWidth-JN-0ABg$default, reason: not valid java name */
    public static /* synthetic */ long m408tryMaxWidthJN0ABg$default(AspectRatioNode aspectRatioNode, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioNode.m407tryMaxWidthJN0ABg(j, z);
    }

    /* JADX INFO: renamed from: tryMinHeight-JN-0ABg, reason: not valid java name */
    private final long m409tryMinHeightJN0ABg(long j, boolean z) {
        int iM3734getMinHeightimpl = Constraints.m3734getMinHeightimpl(j);
        int iRoundToInt = MathKt.roundToInt(iM3734getMinHeightimpl * this.aspectRatio);
        if (iRoundToInt > 0) {
            long jIntSize = IntSizeKt.IntSize(iRoundToInt, iM3734getMinHeightimpl);
            if (!z || ConstraintsKt.m3748isSatisfiedBy4WqzIAM(j, jIntSize)) {
                return jIntSize;
            }
        }
        return IntSize.INSTANCE.m3930getZeroYbymL2g();
    }

    /* JADX INFO: renamed from: tryMinHeight-JN-0ABg$default, reason: not valid java name */
    public static /* synthetic */ long m410tryMinHeightJN0ABg$default(AspectRatioNode aspectRatioNode, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioNode.m409tryMinHeightJN0ABg(j, z);
    }

    /* JADX INFO: renamed from: tryMinWidth-JN-0ABg, reason: not valid java name */
    private final long m411tryMinWidthJN0ABg(long j, boolean z) {
        int iM3735getMinWidthimpl = Constraints.m3735getMinWidthimpl(j);
        int iRoundToInt = MathKt.roundToInt(iM3735getMinWidthimpl / this.aspectRatio);
        if (iRoundToInt > 0) {
            long jIntSize = IntSizeKt.IntSize(iM3735getMinWidthimpl, iRoundToInt);
            if (!z || ConstraintsKt.m3748isSatisfiedBy4WqzIAM(j, jIntSize)) {
                return jIntSize;
            }
        }
        return IntSize.INSTANCE.m3930getZeroYbymL2g();
    }

    /* JADX INFO: renamed from: tryMinWidth-JN-0ABg$default, reason: not valid java name */
    public static /* synthetic */ long m412tryMinWidthJN0ABg$default(AspectRatioNode aspectRatioNode, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioNode.m411tryMinWidthJN0ABg(j, z);
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final boolean getMatchHeightConstraintsFirst() {
        return this.matchHeightConstraintsFirst;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return i != Integer.MAX_VALUE ? MathKt.roundToInt(i / this.aspectRatio) : measurable.maxIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return i != Integer.MAX_VALUE ? MathKt.roundToInt(i * this.aspectRatio) : measurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo248measure3p2s80s(@NotNull MeasureScope measure, @NotNull Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long jM404findSizeToXhtMw = m404findSizeToXhtMw(j);
        if (!IntSize.m3923equalsimpl0(jM404findSizeToXhtMw, IntSize.INSTANCE.m3930getZeroYbymL2g())) {
            j = Constraints.INSTANCE.m3741fixedJhjzzOo(IntSize.m3925getWidthimpl(jM404findSizeToXhtMw), IntSize.m3924getHeightimpl(jM404findSizeToXhtMw));
        }
        final Placeable placeableMo2794measureBRTryo0 = measurable.mo2794measureBRTryo0(j);
        return MeasureScope.CC.OooOOo0(measure, placeableMo2794measureBRTryo0.getWidth(), placeableMo2794measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.AspectRatioNode$measure$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                Placeable.PlacementScope.placeRelative$default(layout, placeableMo2794measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return i != Integer.MAX_VALUE ? MathKt.roundToInt(i / this.aspectRatio) : measurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return i != Integer.MAX_VALUE ? MathKt.roundToInt(i * this.aspectRatio) : measurable.minIntrinsicWidth(i);
    }

    public final void setAspectRatio(float f) {
        this.aspectRatio = f;
    }

    public final void setMatchHeightConstraintsFirst(boolean z) {
        this.matchHeightConstraintsFirst = z;
    }
}
