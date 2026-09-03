package p031OoooO0;

import android.opengl.Matrix;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0o {
    public static void OooO00o(@NonNull float[] fArr, float f) {
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
        Matrix.rotateM(fArr, 0, f, 0.0f, 0.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
    }
}
