package o00OO0O0;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import androidx.annotation.NonNull;
import java.security.MessageDigest;
import p129o00O0ooo.o0000oo;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo000 extends OooOOO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final byte[] f37212OooO0O0 = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(p126o00O0oOo.o000OOo.f36731OooO00o);

    @Override // p126o00O0oOo.o000OOo
    public final void OooO00o(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f37212OooO0O0);
    }

    @Override // o00OO0O0.OooOOO
    public final Bitmap OooO0OO(@NonNull o0000oo o0000ooVar, @NonNull Bitmap bitmap, int i, int i2) {
        Paint paint = o0OO00O.f37239OooO00o;
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return o0OO00O.OooO0O0(o0000ooVar, bitmap, i, i2);
        }
        if (!Log.isLoggable("TransformationUtils", 2)) {
            return bitmap;
        }
        Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        return bitmap;
    }

    @Override // p126o00O0oOo.o000OOo
    public final boolean equals(Object obj) {
        return obj instanceof Oooo000;
    }

    @Override // p126o00O0oOo.o000OOo
    public final int hashCode() {
        return -670243078;
    }
}
