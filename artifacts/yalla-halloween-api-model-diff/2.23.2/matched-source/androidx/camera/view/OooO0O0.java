package androidx.camera.view;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import o000OO.OooOOO0;
import p028Oooo0oO.o00O0O0;
import p031OoooO0.OooOo;
import p031OoooO0.o0OO00O;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final PreviewView.ScaleType f4111OooO = PreviewView.ScaleType.FILL_CENTER;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Size f4112OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Rect f4113OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f4114OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Matrix f4115OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f4116OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f4117OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f4118OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public PreviewView.ScaleType f4119OooO0oo = f4111OooO;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f4120OooO00o;

        static {
            int[] iArr = new int[PreviewView.ScaleType.values().length];
            f4120OooO00o = iArr;
            try {
                iArr[PreviewView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4120OooO00o[PreviewView.ScaleType.FILL_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4120OooO00o[PreviewView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4120OooO00o[PreviewView.ScaleType.FILL_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4120OooO00o[PreviewView.ScaleType.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4120OooO00o[PreviewView.ScaleType.FILL_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Nullable
    public final void OooO00o(int i, Size size) {
        if (OooO0o()) {
            Matrix matrix = new Matrix();
            OooO0OO(i, size).invert(matrix);
            Matrix matrix2 = new Matrix();
            matrix2.setRectToRect(new RectF(0.0f, 0.0f, this.f4112OooO00o.getWidth(), this.f4112OooO00o.getHeight()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
            matrix.postConcat(matrix2);
        }
    }

    public final Size OooO0O0() {
        return o0OO00O.OooO0OO(this.f4114OooO0OO) ? new Size(this.f4113OooO0O0.height(), this.f4113OooO0O0.width()) : new Size(this.f4113OooO0O0.width(), this.f4113OooO0O0.height());
    }

    public final Matrix OooO0OO(int i, Size size) {
        Matrix.ScaleToFit scaleToFit;
        RectF rectF;
        OooOOO0.OooO0o(null, OooO0o());
        if (o0OO00O.OooO0Oo(size, true, OooO0O0())) {
            rectF = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
        } else {
            RectF rectF2 = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
            Size sizeOooO0O0 = OooO0O0();
            RectF rectF3 = new RectF(0.0f, 0.0f, sizeOooO0O0.getWidth(), sizeOooO0O0.getHeight());
            Matrix matrix = new Matrix();
            PreviewView.ScaleType scaleType = this.f4119OooO0oo;
            switch (OooO00o.f4120OooO00o[scaleType.ordinal()]) {
                case 1:
                case 2:
                    scaleToFit = Matrix.ScaleToFit.CENTER;
                    break;
                case 3:
                case 4:
                    scaleToFit = Matrix.ScaleToFit.END;
                    break;
                case 5:
                case 6:
                    scaleToFit = Matrix.ScaleToFit.START;
                    break;
                default:
                    o00O0O0.OooO0O0("PreviewTransform", "Unexpected crop rect: " + scaleType);
                    scaleToFit = Matrix.ScaleToFit.FILL;
                    break;
            }
            if (scaleType == PreviewView.ScaleType.FIT_CENTER || scaleType == PreviewView.ScaleType.FIT_START || scaleType == PreviewView.ScaleType.FIT_END) {
                matrix.setRectToRect(rectF3, rectF2, scaleToFit);
            } else {
                matrix.setRectToRect(rectF2, rectF3, scaleToFit);
                matrix.invert(matrix);
            }
            matrix.mapRect(rectF3);
            if (i == 1) {
                float width = size.getWidth() / 2.0f;
                float f = width + width;
                rectF = new RectF(f - rectF3.right, rectF3.top, f - rectF3.left, rectF3.bottom);
            } else {
                rectF = rectF3;
            }
        }
        Matrix matrixOooO00o = o0OO00O.OooO00o(this.f4114OooO0OO, new RectF(this.f4113OooO0O0), rectF, false);
        if (this.f4116OooO0o && this.f4118OooO0oO) {
            if (o0OO00O.OooO0OO(this.f4114OooO0OO)) {
                matrixOooO00o.preScale(1.0f, -1.0f, this.f4113OooO0O0.centerX(), this.f4113OooO0O0.centerY());
            } else {
                matrixOooO00o.preScale(-1.0f, 1.0f, this.f4113OooO0O0.centerX(), this.f4113OooO0O0.centerY());
            }
        }
        return matrixOooO00o;
    }

    @VisibleForTesting
    public final Matrix OooO0Oo() {
        OooOOO0.OooO0o(null, OooO0o());
        RectF rectF = new RectF(0.0f, 0.0f, this.f4112OooO00o.getWidth(), this.f4112OooO00o.getHeight());
        return o0OO00O.OooO00o(!this.f4118OooO0oO ? this.f4114OooO0OO : -OooOo.OooO0O0(this.f4117OooO0o0), rectF, rectF, false);
    }

    public final boolean OooO0o() {
        return (this.f4113OooO0O0 == null || this.f4112OooO00o == null || !(!this.f4118OooO0oO || this.f4117OooO0o0 != -1)) ? false : true;
    }

    public final RectF OooO0o0(int i, Size size) {
        OooOOO0.OooO0o(null, OooO0o());
        Matrix matrixOooO0OO = OooO0OO(i, size);
        RectF rectF = new RectF(0.0f, 0.0f, this.f4112OooO00o.getWidth(), this.f4112OooO00o.getHeight());
        matrixOooO0OO.mapRect(rectF);
        return rectF;
    }
}
