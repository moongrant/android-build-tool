package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0000 {
    public static void OooO00o(Canvas canvas, @NotNull Rect rect, int i) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        canvas.mo1542clipRectN_I0leg(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), i);
    }

    public static void OooO0O0(Canvas canvas, @NotNull Rect rect, float f, float f2, boolean z, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(paint, "paint");
        canvas.drawArc(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), f, f2, z, paint);
    }

    public static void OooO0OO(Canvas canvas, @NotNull Rect rect, float f, float f2, boolean z, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(paint, "paint");
        canvas.drawArc(rect, DegreesKt.degrees(f), DegreesKt.degrees(f2), z, paint);
    }

    public static void OooO0Oo(Canvas canvas, @NotNull Rect rect, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(paint, "paint");
        canvas.drawOval(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
    }

    public static void OooO0o(Canvas canvas, float f, float f2) {
        canvas.skew(DegreesKt.degrees(f), DegreesKt.degrees(f2));
    }

    public static void OooO0o0(Canvas canvas, @NotNull Rect rect, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(paint, "paint");
        canvas.drawRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
    }

    public static /* synthetic */ void OooOOO(Canvas canvas, float f, float f2, float f3, float f4, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((i2 & 16) != 0) {
            i = ClipOp.INSTANCE.m1670getIntersectrtfAjoo();
        }
        canvas.mo1542clipRectN_I0leg(f, f2, f3, f4, i);
    }

    public static /* synthetic */ void OooOOO0(Canvas canvas, Path path, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i2 & 2) != 0) {
            i = ClipOp.INSTANCE.m1670getIntersectrtfAjoo();
        }
        canvas.mo1541clipPathmtrdDE(path, i);
    }

    public static /* synthetic */ void OooOOOO(Canvas canvas, Rect rect, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
        }
        if ((i2 & 2) != 0) {
            i = ClipOp.INSTANCE.m1670getIntersectrtfAjoo();
        }
        canvas.mo1543clipRectmtrdDE(rect, i);
    }

    public static /* synthetic */ void OooOOOo(Canvas canvas, ImageBitmap imageBitmap, long j, long j2, long j3, long j4, Paint paint, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImageRect-HPBpro0");
        }
        long jM3903getZeronOccac = (i & 2) != 0 ? IntOffset.INSTANCE.m3903getZeronOccac() : j;
        long jIntSize = (i & 4) != 0 ? IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight()) : j2;
        canvas.mo1547drawImageRectHPBpro0(imageBitmap, jM3903getZeronOccac, jIntSize, (i & 8) != 0 ? IntOffset.INSTANCE.m3903getZeronOccac() : j3, (i & 16) != 0 ? jIntSize : j4, paint);
    }

    public static /* synthetic */ void OooOOo0(Canvas canvas, float f, float f2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale");
        }
        if ((i & 2) != 0) {
            f2 = f;
        }
        canvas.scale(f, f2);
    }
}
