package p101o000oOoo;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
public class oO00OOO extends oOOoOOO0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static boolean f29751OooO0o0 = true;

    @SuppressLint({"NewApi"})
    public float OooO0OO(@NonNull View view) {
        if (f29751OooO0o0) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f29751OooO0o0 = false;
            }
        }
        return view.getAlpha();
    }

    @SuppressLint({"NewApi"})
    public void OooO0Oo(@NonNull View view, float f) {
        if (f29751OooO0o0) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f29751OooO0o0 = false;
            }
        }
        view.setAlpha(f);
    }
}
