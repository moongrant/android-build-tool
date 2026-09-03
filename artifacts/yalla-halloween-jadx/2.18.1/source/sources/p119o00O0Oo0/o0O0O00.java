package p119o00O0Oo0;

import android.graphics.Bitmap;
import android.os.Build;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0O00 {
    @NotNull
    public static final Bitmap.Config OooO00o() {
        return Build.VERSION.SDK_INT >= 26 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }
}
