package coil.compose;

import androidx.compose.animation.OooOOO0;
import androidx.compose.animation.Oooo0;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.OooO0O0;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactorKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoo.o000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class ContentPainterModifier extends InspectorValueInfo implements LayoutModifier, DrawModifier {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Painter f8531OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Alignment f8532OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final ContentScale f8533OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f8534OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final ColorFilter f8535OooO0o0;

    public static final class OooO00o extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Placeable f8536OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Placeable placeable) {
            super(1);
            this.f8536OooO0Oo = placeable;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope.placeRelative$default(placementScope, this.f8536OooO0Oo, 0, 0, 0.0f, 4, null);
            return Unit.INSTANCE;
        }
    }

    public ContentPainterModifier(@NotNull final Painter painter, @NotNull final Alignment alignment, @NotNull final ContentScale contentScale, final float f, @Nullable final ColorFilter colorFilter) {
        super(InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: coil.compose.ContentPainterModifier$special$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(InspectorInfo inspectorInfo) {
                InspectorInfo inspectorInfo2 = inspectorInfo;
                OooOOO0.OooO00o(inspectorInfo2, "$this$null", "content").set("painter", painter);
                inspectorInfo2.getProperties().set("alignment", alignment);
                inspectorInfo2.getProperties().set("contentScale", contentScale);
                inspectorInfo2.getProperties().set("alpha", Float.valueOf(f));
                inspectorInfo2.getProperties().set("colorFilter", colorFilter);
                return Unit.INSTANCE;
            }
        } : InspectableValueKt.getNoInspectorInfo());
        this.f8531OooO00o = painter;
        this.f8532OooO0O0 = alignment;
        this.f8533OooO0OO = contentScale;
        this.f8534OooO0Oo = f;
        this.f8535OooO0o0 = colorFilter;
    }

    public final long OooO00o(long j) {
        if (Size.m1507isEmptyimpl(j)) {
            return Size.INSTANCE.m1514getZeroNHjbRc();
        }
        long intrinsicSize = this.f8531OooO00o.getIntrinsicSize();
        if (intrinsicSize == Size.INSTANCE.m1513getUnspecifiedNHjbRc()) {
            return j;
        }
        float fM1505getWidthimpl = Size.m1505getWidthimpl(intrinsicSize);
        if (!((Float.isInfinite(fM1505getWidthimpl) || Float.isNaN(fM1505getWidthimpl)) ? false : true)) {
            fM1505getWidthimpl = Size.m1505getWidthimpl(j);
        }
        float fM1502getHeightimpl = Size.m1502getHeightimpl(intrinsicSize);
        if (!((Float.isInfinite(fM1502getHeightimpl) || Float.isNaN(fM1502getHeightimpl)) ? false : true)) {
            fM1502getHeightimpl = Size.m1502getHeightimpl(j);
        }
        long jSize = SizeKt.Size(fM1505getWidthimpl, fM1502getHeightimpl);
        return ScaleFactorKt.m2872timesUQTWf7w(jSize, this.f8533OooO0OO.mo2785computeScaleFactorH7hwNQA(jSize, j));
    }

    public final long OooO0O0(long j) {
        float fM3735getMinWidthimpl;
        int iM3734getMinHeightimpl;
        float fCoerceIn;
        boolean zM3731getHasFixedWidthimpl = Constraints.m3731getHasFixedWidthimpl(j);
        boolean zM3730getHasFixedHeightimpl = Constraints.m3730getHasFixedHeightimpl(j);
        if (zM3731getHasFixedWidthimpl && zM3730getHasFixedHeightimpl) {
            return j;
        }
        boolean z = Constraints.m3729getHasBoundedWidthimpl(j) && Constraints.m3728getHasBoundedHeightimpl(j);
        long intrinsicSize = this.f8531OooO00o.getIntrinsicSize();
        if (intrinsicSize == Size.INSTANCE.m1513getUnspecifiedNHjbRc()) {
            return z ? Constraints.m3724copyZbe2FdA$default(j, Constraints.m3733getMaxWidthimpl(j), 0, Constraints.m3732getMaxHeightimpl(j), 0, 10, null) : j;
        }
        if (!z || (!zM3731getHasFixedWidthimpl && !zM3730getHasFixedHeightimpl)) {
            float fM1505getWidthimpl = Size.m1505getWidthimpl(intrinsicSize);
            float fM1502getHeightimpl = Size.m1502getHeightimpl(intrinsicSize);
            if ((Float.isInfinite(fM1505getWidthimpl) || Float.isNaN(fM1505getWidthimpl)) ? false : true) {
                int i = o000O0.f35501OooO0O0;
                fM3735getMinWidthimpl = RangesKt.coerceIn(fM1505getWidthimpl, Constraints.m3735getMinWidthimpl(j), Constraints.m3733getMaxWidthimpl(j));
            } else {
                fM3735getMinWidthimpl = Constraints.m3735getMinWidthimpl(j);
            }
            if ((Float.isInfinite(fM1502getHeightimpl) || Float.isNaN(fM1502getHeightimpl)) ? false : true) {
                int i2 = o000O0.f35501OooO0O0;
                fCoerceIn = RangesKt.coerceIn(fM1502getHeightimpl, Constraints.m3734getMinHeightimpl(j), Constraints.m3732getMaxHeightimpl(j));
            } else {
                iM3734getMinHeightimpl = Constraints.m3734getMinHeightimpl(j);
            }
            long jOooO00o = OooO00o(SizeKt.Size(fM3735getMinWidthimpl, fCoerceIn));
            return Constraints.m3724copyZbe2FdA$default(j, ConstraintsKt.m3747constrainWidthK40F9xA(j, MathKt.roundToInt(Size.m1505getWidthimpl(jOooO00o))), 0, ConstraintsKt.m3746constrainHeightK40F9xA(j, MathKt.roundToInt(Size.m1502getHeightimpl(jOooO00o))), 0, 10, null);
        }
        fM3735getMinWidthimpl = Constraints.m3733getMaxWidthimpl(j);
        iM3734getMinHeightimpl = Constraints.m3732getMaxHeightimpl(j);
        fCoerceIn = iM3734getMinHeightimpl;
        long jOooO00o2 = OooO00o(SizeKt.Size(fM3735getMinWidthimpl, fCoerceIn));
        return Constraints.m3724copyZbe2FdA$default(j, ConstraintsKt.m3747constrainWidthK40F9xA(j, MathKt.roundToInt(Size.m1505getWidthimpl(jOooO00o2))), 0, ConstraintsKt.m3746constrainHeightK40F9xA(j, MathKt.roundToInt(Size.m1502getHeightimpl(jOooO00o2))), 0, 10, null);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean all(Function1 function1) {
        return OooO0O0.OooO00o(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean any(Function1 function1) {
        return OooO0O0.OooO0O0(this, function1);
    }

    @Override // androidx.compose.ui.draw.DrawModifier
    public final void draw(@NotNull ContentDrawScope contentDrawScope) {
        long jOooO00o = OooO00o(contentDrawScope.mo2108getSizeNHjbRc());
        Alignment alignment = this.f8532OooO0O0;
        int i = o000O0.f35501OooO0O0;
        long jIntSize = IntSizeKt.IntSize(MathKt.roundToInt(Size.m1505getWidthimpl(jOooO00o)), MathKt.roundToInt(Size.m1502getHeightimpl(jOooO00o)));
        long jMo2108getSizeNHjbRc = contentDrawScope.mo2108getSizeNHjbRc();
        long jMo1326alignKFBX0sM = alignment.mo1326alignKFBX0sM(jIntSize, IntSizeKt.IntSize(MathKt.roundToInt(Size.m1505getWidthimpl(jMo2108getSizeNHjbRc)), MathKt.roundToInt(Size.m1502getHeightimpl(jMo2108getSizeNHjbRc))), contentDrawScope.getLayoutDirection());
        float fM3875component1impl = IntOffset.m3875component1impl(jMo1326alignKFBX0sM);
        float fM3876component2impl = IntOffset.m3876component2impl(jMo1326alignKFBX0sM);
        contentDrawScope.getDrawContext().getTransform().translate(fM3875component1impl, fM3876component2impl);
        this.f8531OooO00o.m2207drawx_KDEd0(contentDrawScope, jOooO00o, this.f8534OooO0Oo, this.f8535OooO0o0);
        contentDrawScope.getDrawContext().getTransform().translate(-fM3875component1impl, -fM3876component2impl);
        contentDrawScope.drawContent();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentPainterModifier)) {
            return false;
        }
        ContentPainterModifier contentPainterModifier = (ContentPainterModifier) obj;
        return Intrinsics.areEqual(this.f8531OooO00o, contentPainterModifier.f8531OooO00o) && Intrinsics.areEqual(this.f8532OooO0O0, contentPainterModifier.f8532OooO0O0) && Intrinsics.areEqual(this.f8533OooO0OO, contentPainterModifier.f8533OooO0OO) && Intrinsics.areEqual((Object) Float.valueOf(this.f8534OooO0Oo), (Object) Float.valueOf(contentPainterModifier.f8534OooO0Oo)) && Intrinsics.areEqual(this.f8535OooO0o0, contentPainterModifier.f8535OooO0o0);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return OooO0O0.OooO0OO(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return OooO0O0.OooO0Oo(this, obj, function2);
    }

    public final int hashCode() {
        int iOooO00o = Oooo0.OooO00o(this.f8534OooO0Oo, (this.f8533OooO0OO.hashCode() + ((this.f8532OooO0O0.hashCode() + (this.f8531OooO00o.hashCode() * 31)) * 31)) * 31, 31);
        ColorFilter colorFilter = this.f8535OooO0o0;
        return iOooO00o + (colorFilter == null ? 0 : colorFilter.hashCode());
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!(this.f8531OooO00o.getIntrinsicSize() != Size.INSTANCE.m1513getUnspecifiedNHjbRc())) {
            return intrinsicMeasurable.maxIntrinsicHeight(i);
        }
        int iMaxIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(Constraints.m3733getMaxWidthimpl(OooO0O0(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null))));
        return Math.max(MathKt.roundToInt(Size.m1502getHeightimpl(OooO00o(SizeKt.Size(i, iMaxIntrinsicHeight)))), iMaxIntrinsicHeight);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!(this.f8531OooO00o.getIntrinsicSize() != Size.INSTANCE.m1513getUnspecifiedNHjbRc())) {
            return intrinsicMeasurable.maxIntrinsicWidth(i);
        }
        int iMaxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(Constraints.m3732getMaxHeightimpl(OooO0O0(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null))));
        return Math.max(MathKt.roundToInt(Size.m1505getWidthimpl(OooO00o(SizeKt.Size(iMaxIntrinsicWidth, i)))), iMaxIntrinsicWidth);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo27measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j) {
        Placeable placeableMo2794measureBRTryo0 = measurable.mo2794measureBRTryo0(OooO0O0(j));
        return MeasureScope.CC.OooOOo0(measureScope, placeableMo2794measureBRTryo0.getWidth(), placeableMo2794measureBRTryo0.getHeight(), null, new OooO00o(placeableMo2794measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!(this.f8531OooO00o.getIntrinsicSize() != Size.INSTANCE.m1513getUnspecifiedNHjbRc())) {
            return intrinsicMeasurable.minIntrinsicHeight(i);
        }
        int iMinIntrinsicHeight = intrinsicMeasurable.minIntrinsicHeight(Constraints.m3733getMaxWidthimpl(OooO0O0(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null))));
        return Math.max(MathKt.roundToInt(Size.m1502getHeightimpl(OooO00o(SizeKt.Size(i, iMinIntrinsicHeight)))), iMinIntrinsicHeight);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!(this.f8531OooO00o.getIntrinsicSize() != Size.INSTANCE.m1513getUnspecifiedNHjbRc())) {
            return intrinsicMeasurable.minIntrinsicWidth(i);
        }
        int iMinIntrinsicWidth = intrinsicMeasurable.minIntrinsicWidth(Constraints.m3732getMaxHeightimpl(OooO0O0(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null))));
        return Math.max(MathKt.roundToInt(Size.m1505getWidthimpl(OooO00o(SizeKt.Size(iMinIntrinsicWidth, i)))), iMinIntrinsicWidth);
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.OooO00o.OooO00o(this, modifier);
    }

    @NotNull
    public final String toString() {
        return "ContentPainterModifier(painter=" + this.f8531OooO00o + ", alignment=" + this.f8532OooO0O0 + ", contentScale=" + this.f8533OooO0OO + ", alpha=" + this.f8534OooO0Oo + ", colorFilter=" + this.f8535OooO0o0 + ')';
    }
}
