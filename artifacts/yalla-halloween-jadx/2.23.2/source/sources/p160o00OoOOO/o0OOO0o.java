package p160o00OoOOO;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import androidx.annotation.NonNull;
import androidx.compose.ui.graphics.o00OOOOo;
import java.security.MessageDigest;
import p156o00OoO00.OooOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOO0o extends oo000o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final byte[] f38091OooO0O0 = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(p154o00Oo0oo.o0OOO0o.f37833OooO00o);

    @Override // p154o00Oo0oo.o0OOO0o
    public final void OooO0O0(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f38091OooO0O0);
    }

    @Override // p160o00OoOOO.oo000o
    public final Bitmap OooO0OO(@NonNull OooOO0 oooOO1, @NonNull Bitmap bitmap, int i, int i2) {
        float width;
        float fOooO00o;
        Paint paint = o0000.f38050OooO00o;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float fOooO00o2 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            width = i2 / bitmap.getHeight();
            fOooO00o2 = o00OOOOo.OooO00o(bitmap.getWidth(), width, i, 0.5f);
            fOooO00o = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            fOooO00o = o00OOOOo.OooO00o(bitmap.getHeight(), width, i2, 0.5f);
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (fOooO00o2 + 0.5f), (int) (fOooO00o + 0.5f));
        Bitmap bitmapOooO0o0 = oooOO1.OooO0o0(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapOooO0o0.setHasAlpha(bitmap.hasAlpha());
        o0000.OooO00o(bitmap, bitmapOooO0o0, matrix);
        return bitmapOooO0o0;
    }

    @Override // p154o00Oo0oo.o0OOO0o
    public final boolean equals(Object obj) {
        return obj instanceof o0OOO0o;
    }

    @Override // p154o00Oo0oo.o0OOO0o
    public final int hashCode() {
        return -599754482;
    }
}
