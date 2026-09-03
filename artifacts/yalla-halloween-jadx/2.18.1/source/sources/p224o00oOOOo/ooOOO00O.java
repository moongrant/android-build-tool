package p224o00oOOOo;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import androidx.annotation.NonNull;
import java.security.MessageDigest;
import p217o00oO00o.o000000;
import p219o00oO0O0.o0oOOo;

/* JADX INFO: loaded from: classes.dex */
public final class ooOOO00O extends oOo0oooO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final byte[] f33851OooO0O0 = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(o000000.f33631OooO00o);

    @Override // p217o00oO00o.o000000
    public final void OooO00o(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f33851OooO0O0);
    }

    @Override // p224o00oOOOo.oOo0oooO
    public final Bitmap OooO0OO(@NonNull o0oOOo o0oooo2, @NonNull Bitmap bitmap, int i, int i2) {
        Paint paint = oOO000.f33835OooO00o;
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return oOO000.OooO0O0(o0oooo2, bitmap, i, i2);
        }
        if (!Log.isLoggable("TransformationUtils", 2)) {
            return bitmap;
        }
        Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        return bitmap;
    }

    @Override // p217o00oO00o.o000000
    public final boolean equals(Object obj) {
        return obj instanceof ooOOO00O;
    }

    @Override // p217o00oO00o.o000000
    public final int hashCode() {
        return -670243078;
    }
}
