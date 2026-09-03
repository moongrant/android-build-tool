package coil.compose;

import androidx.compose.animation.OooOOO0;
import androidx.compose.animation.o0OoOo0;
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
import p121o00O0Ooo.o000Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class ContentPainterModifier extends InspectorValueInfo implements LayoutModifier, DrawModifier {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Painter f11621OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Alignment f11622OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final ContentScale f11623OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f11624OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final ColorFilter f11625OooO0o0;

    public static final class OooO00o extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Placeable f11626OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Placeable placeable) {
            super(1);
            this.f11626OooO0Oo = placeable;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope.placeRelative$default(placementScope, this.f11626OooO0Oo, 0, 0, 0.0f, 4, null);
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
        this.f11621OooO00o = painter;
        this.f11622OooO0O0 = alignment;
        this.f11623OooO0OO = contentScale;
        this.f11624OooO0Oo = f;
        this.f11625OooO0o0 = colorFilter;
    }

    public final long OooO00o(long j) {
        if (Size.m1518isEmptyimpl(j)) {
            return Size.INSTANCE.m1525getZeroNHjbRc();
        }
        long intrinsicSize = this.f11621OooO00o.getIntrinsicSize();
        if (intrinsicSize == Size.INSTANCE.m1524getUnspecifiedNHjbRc()) {
            return j;
        }
        float fM1516getWidthimpl = Size.m1516getWidthimpl(intrinsicSize);
        if (!((Float.isInfinite(fM1516getWidthimpl) || Float.isNaN(fM1516getWidthimpl)) ? false : true)) {
            fM1516getWidthimpl = Size.m1516getWidthimpl(j);
        }
        float fM1513getHeightimpl = Size.m1513getHeightimpl(intrinsicSize);
        if (!((Float.isInfinite(fM1513getHeightimpl) || Float.isNaN(fM1513getHeightimpl)) ? false : true)) {
            fM1513getHeightimpl = Size.m1513getHeightimpl(j);
        }
        long jSize = SizeKt.Size(fM1516getWidthimpl, fM1513getHeightimpl);
        return ScaleFactorKt.m2882timesUQTWf7w(jSize, this.f11623OooO0OO.mo2795computeScaleFactorH7hwNQA(jSize, j));
    }

    public final long OooO0O0(long j) {
        float fM3745getMinWidthimpl;
        int iM3744getMinHeightimpl;
        float fCoerceIn;
        boolean zM3741getHasFixedWidthimpl = Constraints.m3741getHasFixedWidthimpl(j);
        boolean zM3740getHasFixedHeightimpl = Constraints.m3740getHasFixedHeightimpl(j);
        if (zM3741getHasFixedWidthimpl && zM3740getHasFixedHeightimpl) {
            return j;
        }
        boolean z = Constraints.m3739getHasBoundedWidthimpl(j) && Constraints.m3738getHasBoundedHeightimpl(j);
        long intrinsicSize = this.f11621OooO00o.getIntrinsicSize();
        if (intrinsicSize == Size.INSTANCE.m1524getUnspecifiedNHjbRc()) {
            return z ? Constraints.m3734copyZbe2FdA$default(j, Constraints.m3743getMaxWidthimpl(j), 0, Constraints.m3742getMaxHeightimpl(j), 0, 10, null) : j;
        }
        if (!z || (!zM3741getHasFixedWidthimpl && !zM3740getHasFixedHeightimpl)) {
            float fM1516getWidthimpl = Size.m1516getWidthimpl(intrinsicSize);
            float fM1513getHeightimpl = Size.m1513getHeightimpl(intrinsicSize);
            if ((Float.isInfinite(fM1516getWidthimpl) || Float.isNaN(fM1516getWidthimpl)) ? false : true) {
                int i = o000Oo0.f36480OooO0O0;
                fM3745getMinWidthimpl = RangesKt.coerceIn(fM1516getWidthimpl, Constraints.m3745getMinWidthimpl(j), Constraints.m3743getMaxWidthimpl(j));
            } else {
                fM3745getMinWidthimpl = Constraints.m3745getMinWidthimpl(j);
            }
            if ((Float.isInfinite(fM1513getHeightimpl) || Float.isNaN(fM1513getHeightimpl)) ? false : true) {
                int i2 = o000Oo0.f36480OooO0O0;
                fCoerceIn = RangesKt.coerceIn(fM1513getHeightimpl, Constraints.m3744getMinHeightimpl(j), Constraints.m3742getMaxHeightimpl(j));
            } else {
                iM3744getMinHeightimpl = Constraints.m3744getMinHeightimpl(j);
            }
            long jOooO00o = OooO00o(SizeKt.Size(fM3745getMinWidthimpl, fCoerceIn));
            return Constraints.m3734copyZbe2FdA$default(j, ConstraintsKt.m3757constrainWidthK40F9xA(j, MathKt.roundToInt(Size.m1516getWidthimpl(jOooO00o))), 0, ConstraintsKt.m3756constrainHeightK40F9xA(j, MathKt.roundToInt(Size.m1513getHeightimpl(jOooO00o))), 0, 10, null);
        }
        fM3745getMinWidthimpl = Constraints.m3743getMaxWidthimpl(j);
        iM3744getMinHeightimpl = Constraints.m3742getMaxHeightimpl(j);
        fCoerceIn = iM3744getMinHeightimpl;
        long jOooO00o2 = OooO00o(SizeKt.Size(fM3745getMinWidthimpl, fCoerceIn));
        return Constraints.m3734copyZbe2FdA$default(j, ConstraintsKt.m3757constrainWidthK40F9xA(j, MathKt.roundToInt(Size.m1516getWidthimpl(jOooO00o2))), 0, ConstraintsKt.m3756constrainHeightK40F9xA(j, MathKt.roundToInt(Size.m1513getHeightimpl(jOooO00o2))), 0, 10, null);
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
        long jOooO00o = OooO00o(contentDrawScope.mo2118getSizeNHjbRc());
        Alignment alignment = this.f11622OooO0O0;
        int i = o000Oo0.f36480OooO0O0;
        long jIntSize = IntSizeKt.IntSize(MathKt.roundToInt(Size.m1516getWidthimpl(jOooO00o)), MathKt.roundToInt(Size.m1513getHeightimpl(jOooO00o)));
        long jMo2118getSizeNHjbRc = contentDrawScope.mo2118getSizeNHjbRc();
        long jMo1337alignKFBX0sM = alignment.mo1337alignKFBX0sM(jIntSize, IntSizeKt.IntSize(MathKt.roundToInt(Size.m1516getWidthimpl(jMo2118getSizeNHjbRc)), MathKt.roundToInt(Size.m1513getHeightimpl(jMo2118getSizeNHjbRc))), contentDrawScope.getLayoutDirection());
        float fM3885component1impl = IntOffset.m3885component1impl(jMo1337alignKFBX0sM);
        float fM3886component2impl = IntOffset.m3886component2impl(jMo1337alignKFBX0sM);
        contentDrawScope.getDrawContext().getTransform().translate(fM3885component1impl, fM3886component2impl);
        this.f11621OooO00o.m2217drawx_KDEd0(contentDrawScope, jOooO00o, this.f11624OooO0Oo, this.f11625OooO0o0);
        contentDrawScope.getDrawContext().getTransform().translate(-fM3885component1impl, -fM3886component2impl);
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
        return Intrinsics.areEqual(this.f11621OooO00o, contentPainterModifier.f11621OooO00o) && Intrinsics.areEqual(this.f11622OooO0O0, contentPainterModifier.f11622OooO0O0) && Intrinsics.areEqual(this.f11623OooO0OO, contentPainterModifier.f11623OooO0OO) && Intrinsics.areEqual((Object) Float.valueOf(this.f11624OooO0Oo), (Object) Float.valueOf(contentPainterModifier.f11624OooO0Oo)) && Intrinsics.areEqual(this.f11625OooO0o0, contentPainterModifier.f11625OooO0o0);
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
        int iOooO00o = o0OoOo0.OooO00o(this.f11624OooO0Oo, (this.f11623OooO0OO.hashCode() + ((this.f11622OooO0O0.hashCode() + (this.f11621OooO00o.hashCode() * 31)) * 31)) * 31, 31);
        ColorFilter colorFilter = this.f11625OooO0o0;
        return iOooO00o + (colorFilter == null ? 0 : colorFilter.hashCode());
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!(this.f11621OooO00o.getIntrinsicSize() != Size.INSTANCE.m1524getUnspecifiedNHjbRc())) {
            return intrinsicMeasurable.maxIntrinsicHeight(i);
        }
        int iMaxIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(Constraints.m3743getMaxWidthimpl(OooO0O0(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null))));
        return Math.max(MathKt.roundToInt(Size.m1513getHeightimpl(OooO00o(SizeKt.Size(i, iMaxIntrinsicHeight)))), iMaxIntrinsicHeight);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!(this.f11621OooO00o.getIntrinsicSize() != Size.INSTANCE.m1524getUnspecifiedNHjbRc())) {
            return intrinsicMeasurable.maxIntrinsicWidth(i);
        }
        int iMaxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(Constraints.m3742getMaxHeightimpl(OooO0O0(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null))));
        return Math.max(MathKt.roundToInt(Size.m1516getWidthimpl(OooO00o(SizeKt.Size(iMaxIntrinsicWidth, i)))), iMaxIntrinsicWidth);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo27measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j) {
        Placeable placeableMo2804measureBRTryo0 = measurable.mo2804measureBRTryo0(OooO0O0(j));
        return MeasureScope.CC.OooOOo0(measureScope, placeableMo2804measureBRTryo0.getWidth(), placeableMo2804measureBRTryo0.getHeight(), null, new OooO00o(placeableMo2804measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!(this.f11621OooO00o.getIntrinsicSize() != Size.INSTANCE.m1524getUnspecifiedNHjbRc())) {
            return intrinsicMeasurable.minIntrinsicHeight(i);
        }
        int iMinIntrinsicHeight = intrinsicMeasurable.minIntrinsicHeight(Constraints.m3743getMaxWidthimpl(OooO0O0(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null))));
        return Math.max(MathKt.roundToInt(Size.m1513getHeightimpl(OooO00o(SizeKt.Size(i, iMinIntrinsicHeight)))), iMinIntrinsicHeight);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!(this.f11621OooO00o.getIntrinsicSize() != Size.INSTANCE.m1524getUnspecifiedNHjbRc())) {
            return intrinsicMeasurable.minIntrinsicWidth(i);
        }
        int iMinIntrinsicWidth = intrinsicMeasurable.minIntrinsicWidth(Constraints.m3742getMaxHeightimpl(OooO0O0(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null))));
        return Math.max(MathKt.roundToInt(Size.m1516getWidthimpl(OooO00o(SizeKt.Size(iMinIntrinsicWidth, i)))), iMinIntrinsicWidth);
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.OooO00o.OooO00o(this, modifier);
    }

    @NotNull
    public final String toString() {
        return "ContentPainterModifier(painter=" + this.f11621OooO00o + ", alignment=" + this.f11622OooO0O0 + ", contentScale=" + this.f11623OooO0OO + ", alpha=" + this.f11624OooO0Oo + ", colorFilter=" + this.f11625OooO0o0 + ')';
    }
}
