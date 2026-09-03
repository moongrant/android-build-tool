package androidx.camera.core;

import android.graphics.Bitmap;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.nio.ByteBuffer;
import p028Oooo0oO.o00O0O0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ImageProcessingUtil {
    static {
        System.loadLibrary("image_processing_util_jni");
    }

    @Nullable
    public static OooOOO0 OooO00o(@NonNull OooOo00 oooOo00, @NonNull byte[] bArr) {
        o000OO.OooOOO0.OooO00o(oooOo00.OooO0OO() == 256);
        bArr.getClass();
        Surface surface = oooOo00.getSurface();
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            o00O0O0.OooO0O0("ImageProcessingUtil", "Failed to enqueue JPEG image.");
            return null;
        }
        OooOOO0 oooOOO0OooO0O0 = oooOo00.OooO0O0();
        if (oooOOO0OooO0O0 == null) {
            o00O0O0.OooO0O0("ImageProcessingUtil", "Failed to get acquire JPEG image.");
        }
        return oooOOO0OooO0O0;
    }

    public static void OooO0O0(@NonNull Bitmap bitmap, @NonNull ByteBuffer byteBuffer, int i) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, bitmap.getRowBytes(), i, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    public static void OooO0OO(@NonNull Bitmap bitmap, @NonNull ByteBuffer byteBuffer, int i) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    public static void OooO0Oo(@NonNull byte[] bArr, @NonNull Surface surface) {
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            o00O0O0.OooO0O0("ImageProcessingUtil", "Failed to enqueue JPEG image.");
        }
    }

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, boolean z);

    private static native int nativeWriteJpegToSurface(@NonNull byte[] bArr, @NonNull Surface surface);
}
