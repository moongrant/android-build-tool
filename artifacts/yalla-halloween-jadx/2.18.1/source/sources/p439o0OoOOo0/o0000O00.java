package p439o0OoOOo0;

import android.graphics.Color;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O00 {
    public static int OooO00o(double d, int i, int i2) {
        int iRed = Color.red(i2);
        int iRed2 = Color.red(i);
        int iGreen = Color.green(i2);
        int iGreen2 = Color.green(i);
        int iBlue = Color.blue(i2);
        double d2 = 1.0d - d;
        return Color.rgb((int) ((((double) iRed2) * d) + (((double) iRed) * d2)), (int) ((((double) iGreen2) * d) + (((double) iGreen) * d2)), (int) ((d * ((double) Color.blue(i))) + (d2 * ((double) iBlue))));
    }
}
