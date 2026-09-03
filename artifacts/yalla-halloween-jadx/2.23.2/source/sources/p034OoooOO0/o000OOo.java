package p034OoooOO0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v4.media.OooO00o;
import android.util.Rational;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.Oooo0;
import androidx.camera.core.impl.oo0O;
import java.util.HashMap;
import java.util.Map;
import kotlin.ULong;
import o000OO.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o000OOo {
    @NonNull
    public static HashMap OooO00o(@NonNull Rect rect, boolean z, @NonNull Rational rational, @IntRange(from = ULong.MIN_VALUE, to = 359) int i, int i2, int i3, @NonNull HashMap map) {
        RectF rectF;
        OooOOO0.OooO0O0(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF2 = new RectF(rect);
        HashMap map2 = new HashMap();
        RectF rectF3 = new RectF(rect);
        for (Map.Entry entry : map.entrySet()) {
            Matrix matrix = new Matrix();
            RectF rectF4 = new RectF(0.0f, 0.0f, ((oo0O) entry.getValue()).OooO0Oo().getWidth(), ((oo0O) entry.getValue()).OooO0Oo().getHeight());
            matrix.setRectToRect(rectF4, rectF2, Matrix.ScaleToFit.CENTER);
            map2.put((Oooo0) entry.getKey(), matrix);
            RectF rectF5 = new RectF();
            matrix.mapRect(rectF5, rectF4);
            rectF3.intersect(rectF5);
        }
        Rational rational2 = (i == 90 || i == 270) ? rational == null ? rational : new Rational(rational.getDenominator(), rational.getNumerator()) : new Rational(rational.getNumerator(), rational.getDenominator());
        if (i2 != 3) {
            Matrix matrix2 = new Matrix();
            RectF rectF6 = new RectF(0.0f, 0.0f, rational2.getNumerator(), rational2.getDenominator());
            if (i2 == 0) {
                matrix2.setRectToRect(rectF6, rectF3, Matrix.ScaleToFit.START);
            } else if (i2 == 1) {
                matrix2.setRectToRect(rectF6, rectF3, Matrix.ScaleToFit.CENTER);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException(OooO00o.OooO00o("Unexpected scale type: ", i2));
                }
                matrix2.setRectToRect(rectF6, rectF3, Matrix.ScaleToFit.END);
            }
            RectF rectF7 = new RectF();
            matrix2.mapRect(rectF7, rectF6);
            boolean z2 = (i3 == 1) ^ z;
            boolean z3 = i == 0 && !z2;
            boolean z4 = i == 90 && z2;
            if (z3 || z4) {
                rectF3 = rectF7;
            } else {
                boolean z5 = i == 0 && z2;
                boolean z6 = i == 270 && !z2;
                if (z5 || z6) {
                    float fCenterX = rectF3.centerX();
                    float f = fCenterX + fCenterX;
                    rectF = new RectF(f - rectF7.right, rectF7.top, f - rectF7.left, rectF7.bottom);
                } else {
                    boolean z7 = i == 90 && !z2;
                    boolean z8 = i == 180 && z2;
                    if (z7 || z8) {
                        float fCenterY = rectF3.centerY();
                        float f2 = fCenterY + fCenterY;
                        rectF = new RectF(rectF7.left, f2 - rectF7.bottom, rectF7.right, f2 - rectF7.top);
                    } else {
                        boolean z9 = i == 180 && !z2;
                        boolean z10 = i == 270 && z2;
                        if (!z9 && !z10) {
                            throw new IllegalArgumentException("Invalid argument: mirrored " + z2 + " rotation " + i);
                        }
                        float fCenterY2 = rectF3.centerY();
                        float f3 = fCenterY2 + fCenterY2;
                        RectF rectF8 = new RectF(rectF7.left, f3 - rectF7.bottom, rectF7.right, f3 - rectF7.top);
                        float fCenterX2 = rectF3.centerX();
                        float f4 = fCenterX2 + fCenterX2;
                        rectF7 = new RectF(f4 - rectF8.right, rectF8.top, f4 - rectF8.left, rectF8.bottom);
                        rectF3 = rectF7;
                    }
                }
                rectF3 = rectF;
            }
        }
        HashMap map3 = new HashMap();
        RectF rectF9 = new RectF();
        Matrix matrix3 = new Matrix();
        for (Map.Entry entry2 : map2.entrySet()) {
            ((Matrix) entry2.getValue()).invert(matrix3);
            matrix3.mapRect(rectF9, rectF3);
            Rect rect2 = new Rect();
            rectF9.round(rect2);
            map3.put((Oooo0) entry2.getKey(), rect2);
        }
        return map3;
    }
}
