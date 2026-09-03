package p224o00oOOOo;

import Oooo000.Oooo0;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.OooO0OO;
import p214o00oO0.o00OOOO0;
import p217o00oO00o.o00000OO;
import p219o00oO0O0.o0oOOo;
import p243o00oo00O.o000O000;

/* JADX INFO: loaded from: classes.dex */
public abstract class oOo0oooO implements o00000OO<Bitmap> {
    @Override // p217o00oO00o.o00000OO
    @NonNull
    public final o00OOOO0<Bitmap> OooO0O0(@NonNull Context context, @NonNull o00OOOO0<Bitmap> o00oooo1, int i, int i2) {
        if (!o000O000.OooOO0(i, i2)) {
            throw new IllegalArgumentException(Oooo0.OooO00o("Cannot apply transformation on width: ", i, " or height: ", i2, " less than or equal to zero and not Target.SIZE_ORIGINAL"));
        }
        o0oOOo o0oooo2 = OooO0OO.OooO0O0(context).f12373Oooo0oO;
        Bitmap bitmap = o00oooo1.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapOooO0OO = OooO0OO(o0oooo2, bitmap, i, i2);
        return bitmap.equals(bitmapOooO0OO) ? o00oooo1 : oO0O0O0o.OooO0O0(bitmapOooO0OO, o0oooo2);
    }

    public abstract Bitmap OooO0OO(@NonNull o0oOOo o0oooo2, @NonNull Bitmap bitmap, int i, int i2);
}
