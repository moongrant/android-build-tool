package p129o00O0oOo;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.os.Build;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ThreadLocal<PathMeasure> f31141OooO00o = new OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final ThreadLocal<Path> f31142OooO0O0 = new OooO0O0();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final ThreadLocal<Path> f31143OooO0OO = new OooO0OO();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final ThreadLocal<float[]> f31144OooO0Oo = new OooO0o();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final float f31146OooO0o0 = (float) (Math.sqrt(2.0d) / 2.0d);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static float f31145OooO0o = -1.0f;

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
        PathMeasure pathMeasure = f31141OooO00o.get();
        Path path2 = f31142OooO0O0.get();
        Path path3 = f31143OooO0OO.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f2 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            com.airbnb.lottie.OooO0o.OooO00o();
            return;
        }
        if (length < 1.0f || Math.abs((f2 - f) - 1.0f) < 0.01d) {
            com.airbnb.lottie.OooO0o.OooO00o();
            return;
        }
        float f4 = f * length;
        float f5 = f2 * length;
        float f6 = f3 * length;
        float fMin = Math.min(f4, f5) + f6;
        float fMax = Math.max(f4, f5) + f6;
        if (fMin >= length && fMax >= length) {
            fMin = o000O0.OooO0Oo(fMin, length);
            fMax = o000O0.OooO0Oo(fMax, length);
        }
        if (fMin < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            fMin = o000O0.OooO0Oo(fMin, length);
        }
        if (fMax < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            fMax = o000O0.OooO0Oo(fMax, length);
        }
        if (fMin == fMax) {
            path.reset();
            com.airbnb.lottie.OooO0o.OooO00o();
            return;
        }
        if (fMin >= fMax) {
            fMin -= length;
        }
        path2.reset();
        pathMeasure.getSegment(fMin, fMax, path2, true);
        if (fMax > length) {
            path3.reset();
            pathMeasure.getSegment(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, fMax % length, path3, true);
            path2.addPath(path3);
        } else if (fMin < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            path3.reset();
            pathMeasure.getSegment(fMin + length, length, path3, true);
            path2.addPath(path3);
        }
        path.set(path2);
        com.airbnb.lottie.OooO0o.OooO00o();
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
        if (f31145OooO0o == -1.0f) {
            f31145OooO0o = Resources.getSystem().getDisplayMetrics().density;
        }
        return f31145OooO0o;
    }

    public static float OooO0Oo(Matrix matrix) {
        float[] fArr = f31144OooO0Oo.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = f31146OooO0o0;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static void OooO0o(Canvas canvas, RectF rectF, Paint paint, int i) {
        if (Build.VERSION.SDK_INT < 23) {
            canvas.saveLayer(rectF, paint, i);
        } else {
            canvas.saveLayer(rectF, paint);
        }
        com.airbnb.lottie.OooO0o.OooO00o();
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
