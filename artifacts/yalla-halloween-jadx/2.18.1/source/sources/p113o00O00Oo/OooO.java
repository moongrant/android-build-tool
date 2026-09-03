package p113o00O00Oo;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p119o00O0Oo0.Oooo000;

/* JADX INFO: loaded from: classes.dex */
public final class OooO implements OooO0O0 {
    @Override // p113o00O00Oo.OooO0O0
    public final void OooO00o(int i) {
    }

    @Override // p113o00O00Oo.OooO0O0
    public final void OooO0O0(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        bitmap.recycle();
    }

    @Override // p113o00O00Oo.OooO0O0
    @NotNull
    public final Bitmap OooO0OO(int i, int i2, @NotNull Bitmap.Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return OooO0Oo(i, i2, config);
    }

    @Override // p113o00O00Oo.OooO0O0
    @NotNull
    public final Bitmap OooO0Oo(int i, int i2, @NotNull Bitmap.Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        if (!(!Oooo000.OooO0Oo(config))) {
            throw new IllegalArgumentException("Cannot create a mutable hardware bitmap.".toString());
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, config);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(width, height, config)");
        return bitmapCreateBitmap;
    }
}
