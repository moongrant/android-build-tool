package p338o0OO0o0O;

import Oooo000.OooO00o;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.FloatRange;
import androidx.annotation.RestrictTo;
import p077o000Oo.OooO0O0;
import p077o000Oo.OooO0OO;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final LinearInterpolator f37972OooO00o = new LinearInterpolator();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO0OO f37973OooO0O0 = new OooO0OO();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO0O0 f37974OooO0OO = new OooO0O0();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final p077o000Oo.OooO0o f37975OooO0Oo = new p077o000Oo.OooO0o();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final DecelerateInterpolator f37976OooO0o0 = new DecelerateInterpolator();

    public static float OooO00o(float f, float f2, @FloatRange(from = 0.0d, to = 1.0d) float f3, @FloatRange(from = 0.0d, to = 1.0d) float f4, @FloatRange(from = 0.0d, to = 1.0d) float f5) {
        if (f5 < f3) {
            return f;
        }
        return f5 > f4 ? f2 : OooO00o.OooO00o(f2, f, (f5 - f3) / (f4 - f3), f);
    }

    public static int OooO0O0(int i, int i2, float f) {
        return Math.round(f * (i2 - i)) + i;
    }
}
