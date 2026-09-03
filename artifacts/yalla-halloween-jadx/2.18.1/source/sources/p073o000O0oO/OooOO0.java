package p073o000O0oO;

import android.graphics.Path;
import android.view.animation.PathInterpolator;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class OooOO0 {
    @DoNotInline
    public static PathInterpolator OooO00o(float f, float f2) {
        return new PathInterpolator(f, f2);
    }

    @DoNotInline
    public static PathInterpolator OooO0O0(float f, float f2, float f3, float f4) {
        return new PathInterpolator(f, f2, f3, f4);
    }

    @DoNotInline
    public static PathInterpolator OooO0OO(Path path) {
        return new PathInterpolator(path);
    }
}
