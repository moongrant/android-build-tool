package o00OOO0;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import java.io.Closeable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f37433OooO00o = new OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO0O0 f37434OooO0O0 = new OooO0O0();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO0OO f37435OooO0OO = new OooO0OO();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO0o f37436OooO0Oo = new OooO0o();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final float f37438OooO0o0 = (float) (Math.sqrt(2.0d) / 2.0d);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static float f37437OooO0o = -1.0f;

    public class OooO00o extends ThreadLocal<PathMeasure> {
        @Override // java.lang.ThreadLocal
        public final PathMeasure initialValue() {
            return new PathMeasure();
        }
    }

    public class OooO0O0 extends ThreadLocal<Path> {
        @Override // java.lang.ThreadLocal
        public final Path initialValue() {
            return new Path();
        }
    }

    public class OooO0OO extends ThreadLocal<Path> {
        @Override // java.lang.ThreadLocal
        public final Path initialValue() {
            return new Path();
        }
    }

    public class OooO0o extends ThreadLocal<float[]> {
        @Override // java.lang.ThreadLocal
        public final float[] initialValue() {
            return new float[4];
        }
    }

    public static void OooO00o(Path path, float f, float f2, float f3) {
        PathMeasure pathMeasure = f37433OooO00o.get();
        Path path2 = f37434OooO0O0.get();
        Path path3 = f37435OooO0OO.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            com.airbnb.lottie.OooO0OO.OooO00o();
            return;
        }
        if (length < 1.0f || Math.abs((f2 - f) - 1.0f) < 0.01d) {
            com.airbnb.lottie.OooO0OO.OooO00o();
            return;
        }
        float f4 = f * length;
        float f5 = f2 * length;
        float f6 = f3 * length;
        float fMin = Math.min(f4, f5) + f6;
        float fMax = Math.max(f4, f5) + f6;
        if (fMin >= length && fMax >= length) {
            fMin = OooOOO.OooO0OO(fMin, length);
            fMax = OooOOO.OooO0OO(fMax, length);
        }
        if (fMin < 0.0f) {
            fMin = OooOOO.OooO0OO(fMin, length);
        }
        if (fMax < 0.0f) {
            fMax = OooOOO.OooO0OO(fMax, length);
        }
        if (fMin == fMax) {
            path.reset();
            com.airbnb.lottie.OooO0OO.OooO00o();
            return;
        }
        if (fMin >= fMax) {
            fMin -= length;
        }
        path2.reset();
        pathMeasure.getSegment(fMin, fMax, path2, true);
        if (fMax > length) {
            path3.reset();
            pathMeasure.getSegment(0.0f, fMax % length, path3, true);
            path2.addPath(path3);
        } else if (fMin < 0.0f) {
            path3.reset();
            pathMeasure.getSegment(fMin + length, length, path3, true);
            path2.addPath(path3);
        }
        path.set(path2);
        com.airbnb.lottie.OooO0OO.OooO00o();
    }

    public static void OooO0O0(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static float OooO0OO() {
        if (f37437OooO0o == -1.0f) {
            f37437OooO0o = Resources.getSystem().getDisplayMetrics().density;
        }
        return f37437OooO0o;
    }

    public static float OooO0Oo(Matrix matrix) {
        float[] fArr = f37436OooO0Oo.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = f37438OooO0o0;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static Bitmap OooO0o0(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }
}
