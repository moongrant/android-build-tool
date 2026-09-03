package oOO00O;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(21)
public class o00000O0 extends o000000 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static boolean f60145OooO0Oo = true;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static boolean f60146OooO0o = true;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static boolean f60147OooO0o0 = true;

    @SuppressLint({"NewApi"})
    public void OooO0Oo(@NonNull View view, @Nullable Matrix matrix) {
        if (f60145OooO0Oo) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                f60145OooO0Oo = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void OooO0o(@NonNull View view, @NonNull Matrix matrix) {
        if (f60146OooO0o) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f60146OooO0o = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void OooO0o0(@NonNull View view, @NonNull Matrix matrix) {
        if (f60147OooO0o0) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f60147OooO0o0 = false;
            }
        }
    }
}
