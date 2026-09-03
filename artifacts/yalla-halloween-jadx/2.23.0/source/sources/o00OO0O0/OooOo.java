package o00OO0O0;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import androidx.annotation.NonNull;
import androidx.compose.ui.graphics.o0o0Oo;
import java.security.MessageDigest;
import p129o00O0ooo.o0000oo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo extends OooOOO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final byte[] f37209OooO0O0 = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(p126o00O0oOo.o000OOo.f36731OooO00o);

    @Override // p126o00O0oOo.o000OOo
    public final void OooO00o(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f37209OooO0O0);
    }

    @Override // o00OO0O0.OooOOO
    public final Bitmap OooO0OO(@NonNull o0000oo o0000ooVar, @NonNull Bitmap bitmap, int i, int i2) {
        float width;
        float fOooO0O0;
        Paint paint = o0OO00O.f37239OooO00o;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float fOooO0O1 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            width = i2 / bitmap.getHeight();
            fOooO0O1 = o0o0Oo.OooO0O0(bitmap.getWidth(), width, i, 0.5f);
            fOooO0O0 = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            fOooO0O0 = o0o0Oo.OooO0O0(bitmap.getHeight(), width, i2, 0.5f);
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (fOooO0O1 + 0.5f), (int) (fOooO0O0 + 0.5f));
        Bitmap bitmapOooO0o0 = o0000ooVar.OooO0o0(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapOooO0o0.setHasAlpha(bitmap.hasAlpha());
        o0OO00O.OooO00o(bitmap, bitmapOooO0o0, matrix);
        return bitmapOooO0o0;
    }

    @Override // p126o00O0oOo.o000OOo
    public final boolean equals(Object obj) {
        return obj instanceof OooOo;
    }

    @Override // p126o00O0oOo.o000OOo
    public final int hashCode() {
        return -599754482;
    }
}
