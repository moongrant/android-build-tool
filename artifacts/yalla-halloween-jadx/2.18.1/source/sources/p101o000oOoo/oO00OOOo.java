package p101o000oOoo;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class oO00OOOo extends oO00OOO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static boolean f29752OooO0o = true;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static boolean f29753OooO0oO = true;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static boolean f29754OooO0oo = true;

    @SuppressLint({"NewApi"})
    public void OooO0o(@NonNull View view, @NonNull Matrix matrix) {
        if (f29753OooO0oO) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f29753OooO0oO = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void OooO0o0(@NonNull View view, @Nullable Matrix matrix) {
        if (f29752OooO0o) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                f29752OooO0o = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void OooO0oO(@NonNull View view, @NonNull Matrix matrix) {
        if (f29754OooO0oo) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f29754OooO0oo = false;
            }
        }
    }
}
