package androidx.compose.foundation;

import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.qiniu.android.collect.ReportItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0007HÂ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\tHÂ\u0003J9\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0006\u0010\u0015\u001a\u00020\tJ\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001JF\u0010\u0018\u001a\u00020\u0003*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f¢\u0006\u0002\b\"H\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b#\u0010$R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006%"}, d2 = {"Landroidx/compose/foundation/BorderCache;", "", "imageBitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "canvasDrawScope", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "borderPath", "Landroidx/compose/ui/graphics/Path;", "(Landroidx/compose/ui/graphics/ImageBitmap;Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;Landroidx/compose/ui/graphics/Path;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "obtainPath", "toString", "", "drawBorderCache", "Landroidx/compose/ui/draw/CacheDrawScope;", "borderSize", "Landroidx/compose/ui/unit/IntSize;", "config", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", ReportItem.LogTypeBlock, "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "drawBorderCache-EMwLDEs", "(Landroidx/compose/ui/draw/CacheDrawScope;JILkotlin/jvm/functions/Function1;)Landroidx/compose/ui/graphics/ImageBitmap;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n*L\n1#1,512:1\n1#2:513\n558#3,17:514\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderCache\n*L\n409#1:514,17\n*E\n"})
final /* data */ class BorderCache {

    @Nullable
    private Path borderPath;

    @Nullable
    private Canvas canvas;

    @Nullable
    private CanvasDrawScope canvasDrawScope;

    @Nullable
    private ImageBitmap imageBitmap;

    public BorderCache() {
        this(null, null, null, null, 15, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final ImageBitmap getImageBitmap() {
        return this.imageBitmap;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final Canvas getCanvas() {
        return this.canvas;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final CanvasDrawScope getCanvasDrawScope() {
        return this.canvasDrawScope;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    private final Path getBorderPath() {
        return this.borderPath;
    }

    public static /* synthetic */ BorderCache copy$default(BorderCache borderCache, ImageBitmap imageBitmap, Canvas canvas, CanvasDrawScope canvasDrawScope, Path path, int i, Object obj) {
        if ((i & 1) != 0) {
            imageBitmap = borderCache.imageBitmap;
        }
        if ((i & 2) != 0) {
            canvas = borderCache.canvas;
        }
        if ((i & 4) != 0) {
            canvasDrawScope = borderCache.canvasDrawScope;
        }
        if ((i & 8) != 0) {
            path = borderCache.borderPath;
        }
        return borderCache.copy(imageBitmap, canvas, canvasDrawScope, path);
    }

    @NotNull
    public final BorderCache copy(@Nullable ImageBitmap imageBitmap, @Nullable Canvas canvas, @Nullable CanvasDrawScope canvasDrawScope, @Nullable Path borderPath) {
        return new BorderCache(imageBitmap, canvas, canvasDrawScope, borderPath);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    /* JADX WARN: Code duplicated, block: B:28:0x009b  */
    @NotNull
    /* JADX INFO: renamed from: drawBorderCache-EMwLDEs, reason: not valid java name */
    public final ImageBitmap m179drawBorderCacheEMwLDEs(@NotNull CacheDrawScope drawBorderCache, long j, int i, @NotNull Function1<? super DrawScope, Unit> block) {
        CanvasDrawScope canvasDrawScope;
        Intrinsics.checkNotNullParameter(drawBorderCache, "$this$drawBorderCache");
        Intrinsics.checkNotNullParameter(block, "block");
        ImageBitmap imageBitmapM1883ImageBitmapx__hDU$default = this.imageBitmap;
        Canvas Canvas = this.canvas;
        ImageBitmapConfig imageBitmapConfigM1870boximpl = imageBitmapM1883ImageBitmapx__hDU$default != null ? ImageBitmapConfig.m1870boximpl(imageBitmapM1883ImageBitmapx__hDU$default.mo1556getConfig_sVssgQ()) : null;
        boolean z = false;
        if (!(imageBitmapConfigM1870boximpl == null ? false : ImageBitmapConfig.m1873equalsimpl0(imageBitmapConfigM1870boximpl.m1876unboximpl(), ImageBitmapConfig.INSTANCE.m1878getArgb8888_sVssgQ()))) {
            if (ImageBitmapConfig.m1872equalsimpl(i, imageBitmapM1883ImageBitmapx__hDU$default != null ? ImageBitmapConfig.m1870boximpl(imageBitmapM1883ImageBitmapx__hDU$default.mo1556getConfig_sVssgQ()) : null)) {
            }
            if (imageBitmapM1883ImageBitmapx__hDU$default != null || Canvas == null || Size.m1516getWidthimpl(drawBorderCache.m1353getSizeNHjbRc()) > imageBitmapM1883ImageBitmapx__hDU$default.getWidth() || Size.m1513getHeightimpl(drawBorderCache.m1353getSizeNHjbRc()) > imageBitmapM1883ImageBitmapx__hDU$default.getHeight() || !z) {
                imageBitmapM1883ImageBitmapx__hDU$default = ImageBitmapKt.m1883ImageBitmapx__hDU$default(IntSize.m3935getWidthimpl(j), IntSize.m3934getHeightimpl(j), i, false, null, 24, null);
                this.imageBitmap = imageBitmapM1883ImageBitmapx__hDU$default;
                Canvas = androidx.compose.ui.graphics.CanvasKt.Canvas(imageBitmapM1883ImageBitmapx__hDU$default);
                this.canvas = Canvas;
            }
            canvasDrawScope = this.canvasDrawScope;
            if (canvasDrawScope == null) {
                canvasDrawScope = new CanvasDrawScope();
                this.canvasDrawScope = canvasDrawScope;
            }
            long jM3945toSizeozmzZPI = IntSizeKt.m3945toSizeozmzZPI(j);
            LayoutDirection layoutDirection = drawBorderCache.getLayoutDirection();
            CanvasDrawScope.DrawParams drawParams = canvasDrawScope.getDrawParams();
            Density density = drawParams.getDensity();
            LayoutDirection layoutDirection2 = drawParams.getLayoutDirection();
            Canvas canvas = drawParams.getCanvas();
            long size = drawParams.getSize();
            CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope.getDrawParams();
            drawParams2.setDensity(drawBorderCache);
            drawParams2.setLayoutDirection(layoutDirection);
            drawParams2.setCanvas(Canvas);
            drawParams2.m2123setSizeuvyYCjk(jM3945toSizeozmzZPI);
            Canvas.save();
            androidx.compose.ui.graphics.drawscope.OooO0O0.Oooo0OO(canvasDrawScope, Color.INSTANCE.m1707getBlack0d7_KjU(), 0L, jM3945toSizeozmzZPI, 0.0f, null, null, BlendMode.INSTANCE.m1604getClear0nO6VwU(), 58, null);
            block.invoke(canvasDrawScope);
            Canvas.restore();
            CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope.getDrawParams();
            drawParams3.setDensity(density);
            drawParams3.setLayoutDirection(layoutDirection2);
            drawParams3.setCanvas(canvas);
            drawParams3.m2123setSizeuvyYCjk(size);
            imageBitmapM1883ImageBitmapx__hDU$default.prepareToDraw();
            return imageBitmapM1883ImageBitmapx__hDU$default;
        }
        z = true;
        if (imageBitmapM1883ImageBitmapx__hDU$default != null) {
            imageBitmapM1883ImageBitmapx__hDU$default = ImageBitmapKt.m1883ImageBitmapx__hDU$default(IntSize.m3935getWidthimpl(j), IntSize.m3934getHeightimpl(j), i, false, null, 24, null);
            this.imageBitmap = imageBitmapM1883ImageBitmapx__hDU$default;
            Canvas = androidx.compose.ui.graphics.CanvasKt.Canvas(imageBitmapM1883ImageBitmapx__hDU$default);
            this.canvas = Canvas;
        } else {
            imageBitmapM1883ImageBitmapx__hDU$default = ImageBitmapKt.m1883ImageBitmapx__hDU$default(IntSize.m3935getWidthimpl(j), IntSize.m3934getHeightimpl(j), i, false, null, 24, null);
            this.imageBitmap = imageBitmapM1883ImageBitmapx__hDU$default;
            Canvas = androidx.compose.ui.graphics.CanvasKt.Canvas(imageBitmapM1883ImageBitmapx__hDU$default);
            this.canvas = Canvas;
        }
        canvasDrawScope = this.canvasDrawScope;
        if (canvasDrawScope == null) {
            canvasDrawScope = new CanvasDrawScope();
            this.canvasDrawScope = canvasDrawScope;
        }
        long jM3945toSizeozmzZPI2 = IntSizeKt.m3945toSizeozmzZPI(j);
        LayoutDirection layoutDirection3 = drawBorderCache.getLayoutDirection();
        CanvasDrawScope.DrawParams drawParams4 = canvasDrawScope.getDrawParams();
        Density density2 = drawParams4.getDensity();
        LayoutDirection layoutDirection4 = drawParams4.getLayoutDirection();
        Canvas canvas2 = drawParams4.getCanvas();
        long size2 = drawParams4.getSize();
        CanvasDrawScope.DrawParams drawParams5 = canvasDrawScope.getDrawParams();
        drawParams5.setDensity(drawBorderCache);
        drawParams5.setLayoutDirection(layoutDirection3);
        drawParams5.setCanvas(Canvas);
        drawParams5.m2123setSizeuvyYCjk(jM3945toSizeozmzZPI2);
        Canvas.save();
        androidx.compose.ui.graphics.drawscope.OooO0O0.Oooo0OO(canvasDrawScope, Color.INSTANCE.m1707getBlack0d7_KjU(), 0L, jM3945toSizeozmzZPI2, 0.0f, null, null, BlendMode.INSTANCE.m1604getClear0nO6VwU(), 58, null);
        block.invoke(canvasDrawScope);
        Canvas.restore();
        CanvasDrawScope.DrawParams drawParams6 = canvasDrawScope.getDrawParams();
        drawParams6.setDensity(density2);
        drawParams6.setLayoutDirection(layoutDirection4);
        drawParams6.setCanvas(canvas2);
        drawParams6.m2123setSizeuvyYCjk(size2);
        imageBitmapM1883ImageBitmapx__hDU$default.prepareToDraw();
        return imageBitmapM1883ImageBitmapx__hDU$default;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BorderCache)) {
            return false;
        }
        BorderCache borderCache = (BorderCache) other;
        return Intrinsics.areEqual(this.imageBitmap, borderCache.imageBitmap) && Intrinsics.areEqual(this.canvas, borderCache.canvas) && Intrinsics.areEqual(this.canvasDrawScope, borderCache.canvasDrawScope) && Intrinsics.areEqual(this.borderPath, borderCache.borderPath);
    }

    public int hashCode() {
        ImageBitmap imageBitmap = this.imageBitmap;
        int iHashCode = (imageBitmap == null ? 0 : imageBitmap.hashCode()) * 31;
        Canvas canvas = this.canvas;
        int iHashCode2 = (iHashCode + (canvas == null ? 0 : canvas.hashCode())) * 31;
        CanvasDrawScope canvasDrawScope = this.canvasDrawScope;
        int iHashCode3 = (iHashCode2 + (canvasDrawScope == null ? 0 : canvasDrawScope.hashCode())) * 31;
        Path path = this.borderPath;
        return iHashCode3 + (path != null ? path.hashCode() : 0);
    }

    @NotNull
    public final Path obtainPath() {
        Path path = this.borderPath;
        if (path != null) {
            return path;
        }
        Path Path = AndroidPath_androidKt.Path();
        this.borderPath = Path;
        return Path;
    }

    @NotNull
    public String toString() {
        return "BorderCache(imageBitmap=" + this.imageBitmap + ", canvas=" + this.canvas + ", canvasDrawScope=" + this.canvasDrawScope + ", borderPath=" + this.borderPath + ')';
    }

    public BorderCache(@Nullable ImageBitmap imageBitmap, @Nullable Canvas canvas, @Nullable CanvasDrawScope canvasDrawScope, @Nullable Path path) {
        this.imageBitmap = imageBitmap;
        this.canvas = canvas;
        this.canvasDrawScope = canvasDrawScope;
        this.borderPath = path;
    }

    public /* synthetic */ BorderCache(ImageBitmap imageBitmap, Canvas canvas, CanvasDrawScope canvasDrawScope, Path path, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : imageBitmap, (i & 2) != 0 ? null : canvas, (i & 4) != 0 ? null : canvasDrawScope, (i & 8) != 0 ? null : path);
    }
}
