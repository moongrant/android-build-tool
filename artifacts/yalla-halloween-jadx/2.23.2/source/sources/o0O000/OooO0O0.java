package o0O000;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final LinearInterpolator f40880OooO00o = new LinearInterpolator();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final p064o0000oO0.OooOO0 f40881OooO0O0 = new p064o0000oO0.OooOO0();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final p064o0000oO0.OooO f40882OooO0OO = new p064o0000oO0.OooO();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final p064o0000oO0.OooOO0O f40883OooO0Oo = new p064o0000oO0.OooOO0O();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final DecelerateInterpolator f40884OooO0o0 = new DecelerateInterpolator();

    public static float OooO00o(float f, float f2, float f3, float f4, float f5) {
        if (f5 <= f3) {
            return f;
        }
        return f5 >= f4 ? f2 : OooOo.OooO0o.OooO00o(f2, f, (f5 - f3) / (f4 - f3), f);
    }

    public static int OooO0O0(int i, int i2, float f) {
        return Math.round(f * (i2 - i)) + i;
    }
}
