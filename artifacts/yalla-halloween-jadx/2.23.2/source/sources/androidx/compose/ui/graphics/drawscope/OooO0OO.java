package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0OO {
    public static long OooO00o(DrawTransform drawTransform) {
        float f = 2;
        return OffsetKt.Offset(Size.m1516getWidthimpl(drawTransform.mo2129getSizeNHjbRc()) / f, Size.m1513getHeightimpl(drawTransform.mo2129getSizeNHjbRc()) / f);
    }

    public static /* synthetic */ void OooO0OO(DrawTransform drawTransform, Path path, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i2 & 2) != 0) {
            i = ClipOp.INSTANCE.m1670getIntersectrtfAjoo();
        }
        drawTransform.mo2126clipPathmtrdDE(path, i);
    }

    public static /* synthetic */ void OooO0Oo(DrawTransform drawTransform, float f, float f2, float f3, float f4, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((i2 & 1) != 0) {
            f = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f3 = Size.m1516getWidthimpl(drawTransform.mo2129getSizeNHjbRc());
        }
        if ((i2 & 8) != 0) {
            f4 = Size.m1513getHeightimpl(drawTransform.mo2129getSizeNHjbRc());
        }
        if ((i2 & 16) != 0) {
            i = ClipOp.INSTANCE.m1670getIntersectrtfAjoo();
        }
        drawTransform.mo2127clipRectN_I0leg(f, f2, f3, f4, i);
    }

    public static /* synthetic */ void OooO0o(DrawTransform drawTransform, float f, float f2, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale-0AR0LA0");
        }
        if ((i & 4) != 0) {
            j = drawTransform.mo2128getCenterF1C5BW0();
        }
        drawTransform.mo2131scale0AR0LA0(f, f2, j);
    }

    public static /* synthetic */ void OooO0o0(DrawTransform drawTransform, float f, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rotate-Uv8p0NA");
        }
        if ((i & 2) != 0) {
            j = drawTransform.mo2128getCenterF1C5BW0();
        }
        drawTransform.mo2130rotateUv8p0NA(f, j);
    }

    public static /* synthetic */ void OooO0oO(DrawTransform drawTransform, float f, float f2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translate");
        }
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        drawTransform.translate(f, f2);
    }
}
