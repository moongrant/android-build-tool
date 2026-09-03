package androidx.compose.foundation;

import androidx.compose.ui.draw.CacheDrawModifierNode;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B \u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bJ,\u0010\u001e\u001a\u00020\u001f*\u00020 2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002JI\u0010'\u001a\u00020\u001f*\u00020 2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010!\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010.R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R/\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006/"}, d2 = {"Landroidx/compose/foundation/BorderModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "widthParameter", "Landroidx/compose/ui/unit/Dp;", "brushParameter", "Landroidx/compose/ui/graphics/Brush;", "shapeParameter", "Landroidx/compose/ui/graphics/Shape;", "(FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "borderCache", "Landroidx/compose/foundation/BorderCache;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "brush", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "setBrush", "(Landroidx/compose/ui/graphics/Brush;)V", "drawWithCacheModifierNode", "Landroidx/compose/ui/draw/CacheDrawModifierNode;", "shape", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "setShape", "(Landroidx/compose/ui/graphics/Shape;)V", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "getWidth-D9Ej5fM", "()F", "setWidth-0680j_4", "(F)V", "F", "drawGenericBorder", "Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/draw/CacheDrawScope;", "outline", "Landroidx/compose/ui/graphics/Outline$Generic;", "fillArea", "", "strokeWidth", "", "drawRoundRectBorder", "Landroidx/compose/ui/graphics/Outline$Rounded;", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "borderSize", "Landroidx/compose/ui/geometry/Size;", "drawRoundRectBorder-JqoCqck", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Outline$Rounded;JJZF)Landroidx/compose/ui/draw/DrawResult;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderModifierNode\n+ 2 Border.kt\nandroidx/compose/foundation/BorderCache\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 5 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,512:1\n382#2,26:513\n408#2,4:540\n417#2,6:553\n423#2:580\n424#2,2:589\n1#3:539\n558#4,9:544\n567#4,8:581\n120#5,2:559\n173#5,6:561\n261#5,11:567\n122#5,2:578\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderModifierNode\n*L\n259#1:513,26\n259#1:540,4\n259#1:553,6\n259#1:580\n259#1:589,2\n259#1:539\n259#1:544,9\n259#1:581,8\n265#1:559,2\n277#1:561,6\n277#1:567,11\n265#1:578,2\n*E\n"})
public final class BorderModifierNode extends DelegatingNode {

    @Nullable
    private BorderCache borderCache;

    @NotNull
    private Brush brush;

    @NotNull
    private final CacheDrawModifierNode drawWithCacheModifierNode;

    @NotNull
    private Shape shape;
    private float width;

    public /* synthetic */ BorderModifierNode(float f, Brush brush, Shape shape, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, brush, shape);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x00da  */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [T, androidx.compose.ui.graphics.ImageBitmap] */
    /* JADX WARN: Type inference failed for: r12v5 */
    public final DrawResult drawGenericBorder(CacheDrawScope cacheDrawScope, final Brush brush, final Outline.Generic generic, boolean z, float f) {
        int iM1868getArgb8888_sVssgQ;
        ColorFilter colorFilterM1711tintxETnrds$default;
        boolean z2;
        ?? r12;
        Canvas canvas;
        if (z) {
            return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderModifierNode.drawGenericBorder.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                    invoke2(contentDrawScope);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ContentDrawScope onDrawWithContent) {
                    Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
                    onDrawWithContent.drawContent();
                    androidx.compose.ui.graphics.drawscope.OooO0O0.Oooo000(onDrawWithContent, generic.getPath(), brush, 0.0f, null, null, 0, 60, null);
                }
            });
        }
        if (brush instanceof SolidColor) {
            iM1868getArgb8888_sVssgQ = ImageBitmapConfig.INSTANCE.m1867getAlpha8_sVssgQ();
            colorFilterM1711tintxETnrds$default = ColorFilter.Companion.m1711tintxETnrds$default(ColorFilter.INSTANCE, ((SolidColor) brush).getValue(), 0, 2, null);
        } else {
            iM1868getArgb8888_sVssgQ = ImageBitmapConfig.INSTANCE.m1868getArgb8888_sVssgQ();
            colorFilterM1711tintxETnrds$default = null;
        }
        final Rect bounds = generic.getPath().getBounds();
        if (this.borderCache == null) {
            this.borderCache = new BorderCache(null, null, null, null, 15, null);
        }
        BorderCache borderCache = this.borderCache;
        Intrinsics.checkNotNull(borderCache);
        Path pathObtainPath = borderCache.obtainPath();
        pathObtainPath.reset();
        pathObtainPath.addRect(bounds);
        pathObtainPath.mo1570opN5in7k0(pathObtainPath, generic.getPath(), PathOperation.INSTANCE.m1934getDifferenceb3I0S0c());
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final long jIntSize = IntSizeKt.IntSize((int) Math.ceil(bounds.getWidth()), (int) Math.ceil(bounds.getHeight()));
        BorderCache borderCache2 = this.borderCache;
        Intrinsics.checkNotNull(borderCache2);
        ImageBitmap imageBitmap = borderCache2.imageBitmap;
        Canvas canvas2 = borderCache2.canvas;
        ImageBitmapConfig imageBitmapConfigM1860boximpl = imageBitmap != null ? ImageBitmapConfig.m1860boximpl(imageBitmap.mo1545getConfig_sVssgQ()) : null;
        if (!(imageBitmapConfigM1860boximpl == null ? false : ImageBitmapConfig.m1863equalsimpl0(imageBitmapConfigM1860boximpl.m1866unboximpl(), ImageBitmapConfig.INSTANCE.m1868getArgb8888_sVssgQ()))) {
            z2 = ImageBitmapConfig.m1862equalsimpl(iM1868getArgb8888_sVssgQ, imageBitmap != null ? ImageBitmapConfig.m1860boximpl(imageBitmap.mo1545getConfig_sVssgQ()) : null);
        }
        if (imageBitmap == null || canvas2 == null || Size.m1505getWidthimpl(cacheDrawScope.m1342getSizeNHjbRc()) > imageBitmap.getWidth() || Size.m1502getHeightimpl(cacheDrawScope.m1342getSizeNHjbRc()) > imageBitmap.getHeight() || !z2) {
            ImageBitmap imageBitmapM1873ImageBitmapx__hDU$default = ImageBitmapKt.m1873ImageBitmapx__hDU$default(IntSize.m3925getWidthimpl(jIntSize), IntSize.m3924getHeightimpl(jIntSize), iM1868getArgb8888_sVssgQ, false, null, 24, null);
            borderCache2.imageBitmap = imageBitmapM1873ImageBitmapx__hDU$default;
            Canvas Canvas = androidx.compose.ui.graphics.CanvasKt.Canvas(imageBitmapM1873ImageBitmapx__hDU$default);
            borderCache2.canvas = Canvas;
            r12 = imageBitmapM1873ImageBitmapx__hDU$default;
            canvas = Canvas;
        } else {
            r12 = imageBitmap;
            canvas = canvas2;
        }
        CanvasDrawScope canvasDrawScope = borderCache2.canvasDrawScope;
        if (canvasDrawScope == null) {
            canvasDrawScope = new CanvasDrawScope();
            borderCache2.canvasDrawScope = canvasDrawScope;
        }
        CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
        long jM3935toSizeozmzZPI = IntSizeKt.m3935toSizeozmzZPI(jIntSize);
        LayoutDirection layoutDirection = cacheDrawScope.getLayoutDirection();
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope2.getDrawParams();
        Density density = drawParams.getDensity();
        LayoutDirection layoutDirection2 = drawParams.getLayoutDirection();
        Canvas canvas3 = drawParams.getCanvas();
        long size = drawParams.getSize();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope2.getDrawParams();
        drawParams2.setDensity(cacheDrawScope);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m2113setSizeuvyYCjk(jM3935toSizeozmzZPI);
        canvas.save();
        long jM1696getBlack0d7_KjU = Color.INSTANCE.m1696getBlack0d7_KjU();
        BlendMode.Companion companion = BlendMode.INSTANCE;
        androidx.compose.ui.graphics.drawscope.OooO0O0.Oooo0OO(canvasDrawScope2, jM1696getBlack0d7_KjU, 0L, jM3935toSizeozmzZPI, 0.0f, null, null, companion.m1593getClear0nO6VwU(), 58, null);
        float f2 = -bounds.getLeft();
        float f3 = -bounds.getTop();
        canvasDrawScope2.getDrawContext().getTransform().translate(f2, f3);
        androidx.compose.ui.graphics.drawscope.OooO0O0.Oooo000(canvasDrawScope2, generic.getPath(), brush, 0.0f, new Stroke(f * 2, 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
        float f4 = 1;
        float fM1505getWidthimpl = (Size.m1505getWidthimpl(canvasDrawScope2.mo2108getSizeNHjbRc()) + f4) / Size.m1505getWidthimpl(canvasDrawScope2.mo2108getSizeNHjbRc());
        float fM1502getHeightimpl = (Size.m1502getHeightimpl(canvasDrawScope2.mo2108getSizeNHjbRc()) + f4) / Size.m1502getHeightimpl(canvasDrawScope2.mo2108getSizeNHjbRc());
        long jMo2107getCenterF1C5BW0 = canvasDrawScope2.mo2107getCenterF1C5BW0();
        DrawContext drawContext = canvasDrawScope2.getDrawContext();
        long jMo2114getSizeNHjbRc = drawContext.mo2114getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2121scale0AR0LA0(fM1505getWidthimpl, fM1502getHeightimpl, jMo2107getCenterF1C5BW0);
        androidx.compose.ui.graphics.drawscope.OooO0O0.Oooo000(canvasDrawScope2, pathObtainPath, brush, 0.0f, null, null, companion.m1593getClear0nO6VwU(), 28, null);
        drawContext.getCanvas().restore();
        drawContext.mo2115setSizeuvyYCjk(jMo2114getSizeNHjbRc);
        canvasDrawScope2.getDrawContext().getTransform().translate(-f2, -f3);
        canvas.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope2.getDrawParams();
        drawParams3.setDensity(density);
        drawParams3.setLayoutDirection(layoutDirection2);
        drawParams3.setCanvas(canvas3);
        drawParams3.m2113setSizeuvyYCjk(size);
        r12.prepareToDraw();
        objectRef.element = r12;
        final ColorFilter colorFilter = colorFilterM1711tintxETnrds$default;
        return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderModifierNode.drawGenericBorder.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ContentDrawScope onDrawWithContent) {
                Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
                onDrawWithContent.drawContent();
                float left = bounds.getLeft();
                float top = bounds.getTop();
                Ref.ObjectRef<ImageBitmap> objectRef2 = objectRef;
                long j = jIntSize;
                ColorFilter colorFilter2 = colorFilter;
                onDrawWithContent.getDrawContext().getTransform().translate(left, top);
                androidx.compose.ui.graphics.drawscope.OooO0O0.OooOoO(onDrawWithContent, objectRef2.element, 0L, j, 0L, 0L, 0.0f, null, colorFilter2, 0, 0, 890, null);
                onDrawWithContent.getDrawContext().getTransform().translate(-left, -top);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawRoundRectBorder-JqoCqck, reason: not valid java name */
    public final DrawResult m186drawRoundRectBorderJqoCqck(CacheDrawScope cacheDrawScope, final Brush brush, Outline.Rounded rounded, final long j, final long j2, final boolean z, final float f) {
        if (RoundRectKt.isSimple(rounded.getRoundRect())) {
            final long jM1486getTopLeftCornerRadiuskKHJgLs = rounded.getRoundRect().m1486getTopLeftCornerRadiuskKHJgLs();
            final float f2 = f / 2;
            final Stroke stroke = new Stroke(f, 0.0f, 0, 0, null, 30, null);
            return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderModifierNode$drawRoundRectBorder$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                    invoke2(contentDrawScope);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ContentDrawScope onDrawWithContent) {
                    Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
                    onDrawWithContent.drawContent();
                    if (z) {
                        androidx.compose.ui.graphics.drawscope.OooO0O0.Oooo0o0(onDrawWithContent, brush, 0L, 0L, jM1486getTopLeftCornerRadiuskKHJgLs, 0.0f, null, null, 0, 246, null);
                        return;
                    }
                    float fM1411getXimpl = CornerRadius.m1411getXimpl(jM1486getTopLeftCornerRadiuskKHJgLs);
                    float f3 = f2;
                    if (fM1411getXimpl >= f3) {
                        androidx.compose.ui.graphics.drawscope.OooO0O0.Oooo0o0(onDrawWithContent, brush, j, j2, BorderKt.m184shrinkKibmq7A(jM1486getTopLeftCornerRadiuskKHJgLs, f3), 0.0f, stroke, null, 0, 208, null);
                        return;
                    }
                    float f4 = f;
                    float fM1505getWidthimpl = Size.m1505getWidthimpl(onDrawWithContent.mo2108getSizeNHjbRc()) - f;
                    float fM1502getHeightimpl = Size.m1502getHeightimpl(onDrawWithContent.mo2108getSizeNHjbRc()) - f;
                    int iM1658getDifferencertfAjoo = ClipOp.INSTANCE.m1658getDifferencertfAjoo();
                    Brush brush2 = brush;
                    long j3 = jM1486getTopLeftCornerRadiuskKHJgLs;
                    DrawContext drawContext = onDrawWithContent.getDrawContext();
                    long jMo2114getSizeNHjbRc = drawContext.mo2114getSizeNHjbRc();
                    drawContext.getCanvas().save();
                    drawContext.getTransform().mo2117clipRectN_I0leg(f4, f4, fM1505getWidthimpl, fM1502getHeightimpl, iM1658getDifferencertfAjoo);
                    androidx.compose.ui.graphics.drawscope.OooO0O0.Oooo0o0(onDrawWithContent, brush2, 0L, 0L, j3, 0.0f, null, null, 0, 246, null);
                    drawContext.getCanvas().restore();
                    drawContext.mo2115setSizeuvyYCjk(jMo2114getSizeNHjbRc);
                }
            });
        }
        if (this.borderCache == null) {
            this.borderCache = new BorderCache(null, null, null, null, 15, null);
        }
        BorderCache borderCache = this.borderCache;
        Intrinsics.checkNotNull(borderCache);
        final Path pathCreateRoundRectPath = BorderKt.createRoundRectPath(borderCache.obtainPath(), rounded.getRoundRect(), f, z);
        return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderModifierNode$drawRoundRectBorder$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ContentDrawScope onDrawWithContent) {
                Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
                onDrawWithContent.drawContent();
                androidx.compose.ui.graphics.drawscope.OooO0O0.Oooo000(onDrawWithContent, pathCreateRoundRectPath, brush, 0.0f, null, null, 0, 60, null);
            }
        });
    }

    @NotNull
    public final Brush getBrush() {
        return this.brush;
    }

    @NotNull
    public final Shape getShape() {
        return this.shape;
    }

    /* JADX INFO: renamed from: getWidth-D9Ej5fM, reason: not valid java name and from getter */
    public final float getWidth() {
        return this.width;
    }

    public final void setBrush(@NotNull Brush value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(this.brush, value)) {
            return;
        }
        this.brush = value;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    public final void setShape(@NotNull Shape value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(this.shape, value)) {
            return;
        }
        this.shape = value;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    /* JADX INFO: renamed from: setWidth-0680j_4, reason: not valid java name */
    public final void m188setWidth0680j_4(float f) {
        if (Dp.m3770equalsimpl0(this.width, f)) {
            return;
        }
        this.width = f;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    private BorderModifierNode(float f, Brush brushParameter, Shape shapeParameter) {
        Intrinsics.checkNotNullParameter(brushParameter, "brushParameter");
        Intrinsics.checkNotNullParameter(shapeParameter, "shapeParameter");
        this.width = f;
        this.brush = brushParameter;
        this.shape = shapeParameter;
        this.drawWithCacheModifierNode = (CacheDrawModifierNode) delegate(DrawModifierKt.CacheDrawModifierNode(new Function1<CacheDrawScope, DrawResult>() { // from class: androidx.compose.foundation.BorderModifierNode$drawWithCacheModifierNode$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final DrawResult invoke(@NotNull CacheDrawScope CacheDrawModifierNode) {
                Intrinsics.checkNotNullParameter(CacheDrawModifierNode, "$this$CacheDrawModifierNode");
                float width = this.this$0.getWidth();
                CacheDrawModifierNode.getClass();
                if (!(androidx.compose.ui.unit.OooO00o.OooO0oo(CacheDrawModifierNode, width) >= 0.0f && Size.m1504getMinDimensionimpl(CacheDrawModifierNode.m1342getSizeNHjbRc()) > 0.0f)) {
                    return BorderKt.drawContentWithoutBorder(CacheDrawModifierNode);
                }
                float f2 = 2;
                float fMin = Math.min(Dp.m3770equalsimpl0(this.this$0.getWidth(), Dp.INSTANCE.m3783getHairlineD9Ej5fM()) ? 1.0f : (float) Math.ceil(androidx.compose.ui.unit.OooO00o.OooO0oo(CacheDrawModifierNode, this.this$0.getWidth())), (float) Math.ceil(Size.m1504getMinDimensionimpl(CacheDrawModifierNode.m1342getSizeNHjbRc()) / f2));
                float f3 = fMin / f2;
                long jOffset = OffsetKt.Offset(f3, f3);
                long jSize = SizeKt.Size(Size.m1505getWidthimpl(CacheDrawModifierNode.m1342getSizeNHjbRc()) - fMin, Size.m1502getHeightimpl(CacheDrawModifierNode.m1342getSizeNHjbRc()) - fMin);
                boolean z = f2 * fMin > Size.m1504getMinDimensionimpl(CacheDrawModifierNode.m1342getSizeNHjbRc());
                Outline outlineMo218createOutlinePq9zytI = this.this$0.getShape().mo218createOutlinePq9zytI(CacheDrawModifierNode.m1342getSizeNHjbRc(), CacheDrawModifierNode.getLayoutDirection(), CacheDrawModifierNode);
                if (outlineMo218createOutlinePq9zytI instanceof Outline.Generic) {
                    BorderModifierNode borderModifierNode = this.this$0;
                    return borderModifierNode.drawGenericBorder(CacheDrawModifierNode, borderModifierNode.getBrush(), (Outline.Generic) outlineMo218createOutlinePq9zytI, z, fMin);
                }
                if (outlineMo218createOutlinePq9zytI instanceof Outline.Rounded) {
                    BorderModifierNode borderModifierNode2 = this.this$0;
                    return borderModifierNode2.m186drawRoundRectBorderJqoCqck(CacheDrawModifierNode, borderModifierNode2.getBrush(), (Outline.Rounded) outlineMo218createOutlinePq9zytI, jOffset, jSize, z, fMin);
                }
                if (outlineMo218createOutlinePq9zytI instanceof Outline.Rectangle) {
                    return BorderKt.m183drawRectBorderNsqcLGU(CacheDrawModifierNode, this.this$0.getBrush(), jOffset, jSize, z, fMin);
                }
                throw new NoWhenBranchMatchedException();
            }
        }));
    }
}
