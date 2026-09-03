package o00OO00O;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.WorkerThread;
import coil.size.Scale;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import p130o00O0oo.o000O0Oo;
import p130o00O0oo.o000O0o;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo000 {
    /* JADX WARN: Code duplicated, block: B:15:0x0027  */
    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e9  */
    @WorkerThread
    @NotNull
    public static Bitmap OooO00o(@NotNull Drawable drawable, @NotNull Bitmap.Config config, @NotNull o000O0Oo o000o0oo2, @NotNull Scale scale, boolean z) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap.Config config2;
        boolean z2;
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap3 = ((BitmapDrawable) drawable).getBitmap();
            Bitmap.Config config3 = bitmap3.getConfig();
            if (config == null) {
                config2 = Bitmap.Config.ARGB_8888;
            } else {
                if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
                    config2 = Bitmap.Config.ARGB_8888;
                } else {
                    config2 = config;
                }
            }
            if (config3 == config2) {
                if (z) {
                    z2 = true;
                } else {
                    if (p124o00O0o00.OooOOO.OooO00o(bitmap3.getWidth(), bitmap3.getHeight(), o000O0o.OooO00o(o000o0oo2) ? bitmap3.getWidth() : OooOo00.OooO0Oo(o000o0oo2.f36771OooO00o, scale), o000O0o.OooO00o(o000o0oo2) ? bitmap3.getHeight() : OooOo00.OooO0Oo(o000o0oo2.f36772OooO0O0, scale), scale) == 1.0d) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    return bitmap3;
                }
            }
        }
        Drawable drawableMutate = drawable.mutate();
        Bitmap.Config[] configArr = OooOo00.f37081OooO00o;
        boolean z3 = drawableMutate instanceof BitmapDrawable;
        BitmapDrawable bitmapDrawable = z3 ? (BitmapDrawable) drawableMutate : null;
        int intrinsicWidth = (bitmapDrawable == null || (bitmap2 = bitmapDrawable.getBitmap()) == null) ? drawableMutate.getIntrinsicWidth() : bitmap2.getWidth();
        int i = ConstantsKt.MINIMUM_BLOCK_SIZE;
        if (intrinsicWidth <= 0) {
            intrinsicWidth = 512;
        }
        BitmapDrawable bitmapDrawable2 = z3 ? (BitmapDrawable) drawableMutate : null;
        int intrinsicHeight = (bitmapDrawable2 == null || (bitmap = bitmapDrawable2.getBitmap()) == null) ? drawableMutate.getIntrinsicHeight() : bitmap.getHeight();
        if (intrinsicHeight > 0) {
            i = intrinsicHeight;
        }
        double dOooO00o = p124o00O0o00.OooOOO.OooO00o(intrinsicWidth, i, o000O0o.OooO00o(o000o0oo2) ? intrinsicWidth : OooOo00.OooO0Oo(o000o0oo2.f36771OooO00o, scale), o000O0o.OooO00o(o000o0oo2) ? i : OooOo00.OooO0Oo(o000o0oo2.f36772OooO0O0, scale), scale);
        int iRoundToInt = MathKt.roundToInt(((double) intrinsicWidth) * dOooO00o);
        int iRoundToInt2 = MathKt.roundToInt(dOooO00o * ((double) i));
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
                config = Bitmap.Config.ARGB_8888;
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iRoundToInt, iRoundToInt2, config);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(width, height, config)");
        Rect bounds = drawableMutate.getBounds();
        int i2 = bounds.left;
        int i3 = bounds.top;
        int i4 = bounds.right;
        int i5 = bounds.bottom;
        drawableMutate.setBounds(0, 0, iRoundToInt, iRoundToInt2);
        drawableMutate.draw(new Canvas(bitmapCreateBitmap));
        drawableMutate.setBounds(i2, i3, i4, i5);
        return bitmapCreateBitmap;
    }
}
