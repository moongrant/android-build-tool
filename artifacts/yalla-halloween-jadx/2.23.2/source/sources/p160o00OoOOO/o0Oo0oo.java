package p160o00OoOOO;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import androidx.annotation.NonNull;
import java.security.MessageDigest;
import p154o00Oo0oo.o0OOO0o;
import p156o00OoO00.OooOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0Oo0oo extends oo000o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final byte[] f38092OooO0O0 = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(o0OOO0o.f37833OooO00o);

    @Override // p154o00Oo0oo.o0OOO0o
    public final void OooO0O0(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f38092OooO0O0);
    }

    @Override // p160o00OoOOO.oo000o
    public final Bitmap OooO0OO(@NonNull OooOO0 oooOO1, @NonNull Bitmap bitmap, int i, int i2) {
        Paint paint = o0000.f38050OooO00o;
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return o0000.OooO0O0(oooOO1, bitmap, i, i2);
        }
        if (!Log.isLoggable("TransformationUtils", 2)) {
            return bitmap;
        }
        Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        return bitmap;
    }

    @Override // p154o00Oo0oo.o0OOO0o
    public final boolean equals(Object obj) {
        return obj instanceof o0Oo0oo;
    }

    @Override // p154o00Oo0oo.o0OOO0o
    public final int hashCode() {
        return -670243078;
    }
}
