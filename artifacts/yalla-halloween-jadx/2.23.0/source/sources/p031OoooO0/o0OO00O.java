package p031OoooO0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v4.media.OooO00o;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.Locale;
import o000OO.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final RectF f1413OooO00o = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    @NonNull
    public static Matrix OooO00o(int i, @NonNull RectF rectF, @NonNull RectF rectF2, boolean z) {
        Matrix matrix = new Matrix();
        RectF rectF3 = f1413OooO00o;
        matrix.setRectToRect(rectF, rectF3, Matrix.ScaleToFit.FILL);
        matrix.postRotate(i);
        if (z) {
            matrix.postScale(-1.0f, 1.0f);
        }
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(rectF3, rectF2, Matrix.ScaleToFit.FILL);
        matrix.postConcat(matrix2);
        return matrix;
    }

    public static boolean OooO0O0(@NonNull Rect rect, @NonNull Size size) {
        return (rect.left == 0 && rect.top == 0 && rect.width() == size.getWidth() && rect.height() == size.getHeight()) ? false : true;
    }

    public static boolean OooO0OO(int i) {
        if (i == 90 || i == 270) {
            return true;
        }
        if (i == 0 || i == 180) {
            return false;
        }
        throw new IllegalArgumentException(OooO00o.OooO00o("Invalid rotation degrees: ", i));
    }

    public static boolean OooO0Oo(@NonNull Size size, boolean z, @NonNull Size size2) {
        float width;
        float width2;
        if (z) {
            width = size.getWidth() / size.getHeight();
            width2 = width;
        } else {
            width = (size.getWidth() + 1.0f) / (size.getHeight() - 1.0f);
            width2 = (size.getWidth() - 1.0f) / (size.getHeight() + 1.0f);
        }
        return width >= (((float) size2.getWidth()) - 1.0f) / (((float) size2.getHeight()) + 1.0f) && (((float) size2.getWidth()) + 1.0f) / (((float) size2.getHeight()) - 1.0f) >= width2;
    }

    @NonNull
    public static Size OooO0o(int i, @NonNull Size size) {
        OooOOO0.OooO0O0(i % 90 == 0, "Invalid rotation degrees: " + i);
        return OooO0OO(((i % 360) + 360) % 360) ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    @NonNull
    public static String OooO0o0(@NonNull Rect rect) {
        return String.format(Locale.US, "%s(%dx%d)", rect, Integer.valueOf(rect.width()), Integer.valueOf(rect.height()));
    }

    @NonNull
    public static RectF OooO0oO(@NonNull Size size) {
        float f = 0;
        return new RectF(f, f, size.getWidth() + 0, size.getHeight() + 0);
    }
}
