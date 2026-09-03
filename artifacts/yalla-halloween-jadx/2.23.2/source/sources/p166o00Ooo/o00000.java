package p166o00Ooo;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class o00000 extends Drawable {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final double f38207OooO00o = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f38208OooO0O0 = 0;

    public static float OooO00o(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        return (float) (((1.0d - f38207OooO00o) * ((double) f2)) + ((double) (f * 1.5f)));
    }
}
