package p078o000Oo0O;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(21)
public class o0000OO0 extends o0000O0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static boolean f34943OooO0Oo = true;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static boolean f34944OooO0o = true;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static boolean f34945OooO0o0 = true;

    @SuppressLint({"NewApi"})
    public void OooO0Oo(@NonNull View view, @Nullable Matrix matrix) {
        if (f34943OooO0Oo) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                f34943OooO0Oo = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void OooO0o(@NonNull View view, @NonNull Matrix matrix) {
        if (f34944OooO0o) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f34944OooO0o = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void OooO0o0(@NonNull View view, @NonNull Matrix matrix) {
        if (f34945OooO0o0) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f34945OooO0o0 = false;
            }
        }
    }
}
