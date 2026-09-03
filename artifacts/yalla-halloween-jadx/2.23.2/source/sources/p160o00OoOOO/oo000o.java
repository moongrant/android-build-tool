package p160o00OoOOO;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.OooO;
import com.bumptech.glide.OooO0OO;
import p046Oooooo0.o0O00o0;
import p144o00Oo.o00oOoo;
import p154o00Oo0oo.o000000;
import p156o00OoO00.OooOO0;
import p174o00OooOo.o00OO0O0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oo000o implements o000000<Bitmap> {
    @Override // p154o00Oo0oo.o000000
    @NonNull
    public final o00oOoo OooO00o(@NonNull OooO oooO, @NonNull o00oOoo o00oooo2, int i, int i2) {
        if (!o00OO0O0.OooO0oo(i, i2)) {
            throw new IllegalArgumentException(o0O00o0.OooO00o("Cannot apply transformation on width: ", i, " or height: ", i2, " less than or equal to zero and not Target.SIZE_ORIGINAL"));
        }
        OooOO0 oooOO1 = OooO0OO.OooO0O0(oooO).f12944OooO0o0;
        Bitmap bitmap = (Bitmap) o00oooo2.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapOooO0OO = OooO0OO(oooOO1, bitmap, i, i2);
        return bitmap.equals(bitmapOooO0OO) ? o00oooo2 : o00Ooo.OooO0O0(bitmapOooO0OO, oooOO1);
    }

    public abstract Bitmap OooO0OO(@NonNull OooOO0 oooOO1, @NonNull Bitmap bitmap, int i, int i2);
}
