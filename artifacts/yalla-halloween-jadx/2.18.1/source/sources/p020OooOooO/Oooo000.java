package p020OooOooO;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo000 extends Drawable {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final double f391OooO00o = Math.cos(Math.toRadians(45.0d));

    public static float OooO00o(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        return (float) (((1.0d - f391OooO00o) * ((double) f2)) + ((double) f));
    }

    public static float OooO0O0(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        return (float) (((1.0d - f391OooO00o) * ((double) f2)) + ((double) (f * 1.5f)));
    }
}
