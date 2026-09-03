package o00O0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o {
    public static float OooO00o(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static float OooO0O0(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static int OooO0OO(int i, float f, int i2) {
        int i3 = (i >> 24) & 255;
        int i4 = (i >> 16) & 255;
        int i5 = (i >> 8) & 255;
        int i6 = i & 255;
        return (i6 + ((int) (f * ((i2 & 255) - i6)))) | ((i3 + ((int) ((((i2 >> 24) & 255) - i3) * f))) << 24) | ((i4 + ((int) ((((i2 >> 16) & 255) - i4) * f))) << 16) | ((i5 + ((int) ((((i2 >> 8) & 255) - i5) * f))) << 8);
    }

    public static int OooO0Oo(int i, float f, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((i >> 24) & 255) / 255.0f;
        float f3 = ((i2 >> 24) & 255) / 255.0f;
        float fOooO00o = OooO00o(((i >> 16) & 255) / 255.0f);
        float fOooO00o2 = OooO00o(((i >> 8) & 255) / 255.0f);
        float fOooO00o3 = OooO00o((i & 255) / 255.0f);
        float fOooO00o4 = OooO00o(((i2 >> 16) & 255) / 255.0f);
        float fOooO00o5 = OooO00o(((i2 >> 8) & 255) / 255.0f);
        float fOooO00o6 = OooO00o((i2 & 255) / 255.0f);
        float fOooO00o7 = OooOo.OooO0o.OooO00o(f3, f2, f, f2);
        float fOooO00o8 = OooOo.OooO0o.OooO00o(fOooO00o4, fOooO00o, f, fOooO00o);
        float fOooO00o9 = OooOo.OooO0o.OooO00o(fOooO00o5, fOooO00o2, f, fOooO00o2);
        float fOooO00o10 = OooOo.OooO0o.OooO00o(fOooO00o6, fOooO00o3, f, fOooO00o3);
        float fOooO0O0 = OooO0O0(fOooO00o8) * 255.0f;
        float fOooO0O1 = OooO0O0(fOooO00o9) * 255.0f;
        return Math.round(OooO0O0(fOooO00o10) * 255.0f) | (Math.round(fOooO0O0) << 16) | (Math.round(fOooO00o7 * 255.0f) << 24) | (Math.round(fOooO0O1) << 8);
    }

    public static Class OooO0o0(Class cls) {
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
