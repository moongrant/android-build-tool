package androidx.media3.ui;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO {
    public static String OooO00o(@ColorInt int i) {
        return o00.OooOOO("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(((double) Color.alpha(i)) / 255.0d));
    }
}
