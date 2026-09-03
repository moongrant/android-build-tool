package p145o00Oo0;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.Intrinsics;
import p167o00Ooo.OooOOO0;
import p167o00Ooo.Oooo0;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O0O {
    public static o0000oo OooO00o(int i, int i2, int i3, int i4) {
        Oooo0 colorSpace;
        Bitmap bitmapCreateBitmap;
        if ((i4 & 4) != 0) {
            i3 = 0;
        }
        boolean z = (i4 & 8) != 0;
        if ((i4 & 16) != 0) {
            OooOOO0 oooOOO0 = OooOOO0.f32567OooO00o;
            colorSpace = OooOOO0.f32570OooO0Oo;
        } else {
            colorSpace = null;
        }
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        Bitmap.Config configOooO0O0 = OooOo.OooO0O0(i3);
        if (Build.VERSION.SDK_INT >= 26) {
            bitmapCreateBitmap = oo000o.OooO0OO(i, i2, i3, z, colorSpace);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, configOooO0O0);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(\n          …   bitmapConfig\n        )");
            bitmapCreateBitmap.setHasAlpha(z);
        }
        return new OooOo00(bitmapCreateBitmap);
    }
}
