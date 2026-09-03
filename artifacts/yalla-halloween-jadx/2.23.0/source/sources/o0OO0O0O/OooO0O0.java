package o0OO0O0O;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class OooO0O0<T> {
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Bitmap OooO00o(int i, int i2, Object obj) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i3 = 1;
        options.inJustDecodeBounds = i > 0 && i2 > 0;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        Bitmap bitmapOooO0O0 = OooO0O0(obj, options);
        if (!options.inJustDecodeBounds) {
            return bitmapOooO0O0;
        }
        Intrinsics.checkNotNullParameter(options, "options");
        Pair pair = TuplesKt.to(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
        int iIntValue = ((Number) pair.component1()).intValue();
        int iIntValue2 = ((Number) pair.component2()).intValue();
        if (i2 > 0 && i > 0 && (iIntValue > i2 || iIntValue2 > i)) {
            int i4 = iIntValue / 2;
            int i5 = iIntValue2 / 2;
            while (i4 / i3 >= i2 && i5 / i3 >= i) {
                i3 *= 2;
            }
        }
        options.inSampleSize = i3;
        options.inJustDecodeBounds = false;
        return OooO0O0(obj, options);
    }

    @Nullable
    public abstract Bitmap OooO0O0(T t, @NotNull BitmapFactory.Options options);
}
