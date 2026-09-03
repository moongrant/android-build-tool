package com.google.gson.internal;

import android.graphics.Color;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OOO0o {
    public static int OooO00o(double d, int i, int i2) {
        int iRed = Color.red(i2);
        int iRed2 = Color.red(i);
        int iGreen = Color.green(i2);
        int iGreen2 = Color.green(i);
        int iBlue = Color.blue(i2);
        double d2 = 1.0d - d;
        return Color.rgb((int) ((((double) iRed2) * d) + (((double) iRed) * d2)), (int) ((((double) iGreen2) * d) + (((double) iGreen) * d2)), (int) ((d * ((double) Color.blue(i))) + (d2 * ((double) iBlue))));
    }

    public static Class OooO0O0(Class cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        return cls == Void.TYPE ? Void.class : cls;
    }
}
