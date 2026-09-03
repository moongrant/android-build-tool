package com.google.android.gms.internal.measurement;

import android.graphics.Color;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0O0ooO {
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
