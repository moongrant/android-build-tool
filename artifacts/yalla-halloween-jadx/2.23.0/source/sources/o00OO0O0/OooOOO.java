package o00OO0O0;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import p046Oooooo0.o0O00o0;
import p126o00O0oOo.o00000OO;
import p127o00O0oo.o0000;
import p532o0o0Oo.o0000oo;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooOOO implements o00000OO<Bitmap> {
    @Override // p126o00O0oOo.o00000OO
    @NonNull
    public final o0000 OooO0O0(@NonNull com.bumptech.glide.OooO oooO, @NonNull o0000 o0000Var, int i, int i2) {
        if (!o0000oo.OooO(i, i2)) {
            throw new IllegalArgumentException(o0O00o0.OooO00o("Cannot apply transformation on width: ", i, " or height: ", i2, " less than or equal to zero and not Target.SIZE_ORIGINAL"));
        }
        p129o00O0ooo.o0000oo o0000ooVar = com.bumptech.glide.OooO0OO.OooO0O0(oooO).f9853OooO0o0;
        Bitmap bitmap = (Bitmap) o0000Var.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapOooO0OO = OooO0OO(o0000ooVar, bitmap, i, i2);
        return bitmap.equals(bitmapOooO0OO) ? o0000Var : OooOOO0.OooO0OO(bitmapOooO0OO, o0000ooVar);
    }

    public abstract Bitmap OooO0OO(@NonNull p129o00O0ooo.o0000oo o0000ooVar, @NonNull Bitmap bitmap, int i, int i2);
}
