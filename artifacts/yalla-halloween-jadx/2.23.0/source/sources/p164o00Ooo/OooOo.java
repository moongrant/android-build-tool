package p164o00Ooo;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo extends Drawable {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final double f38516OooO00o = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f38517OooO0O0 = 0;

    public static float OooO00o(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        return (float) (((1.0d - f38516OooO00o) * ((double) f2)) + ((double) (f * 1.5f)));
    }
}
