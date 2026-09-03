package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final boolean f8166OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final boolean f8167OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final boolean f8168OooO0OO;

    public static class OooO00o implements TypeEvaluator<Matrix> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final float[] f8169OooO00o = new float[9];

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final float[] f8170OooO0O0 = new float[9];

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Matrix f8171OooO0OO = new Matrix();

        @Override // android.animation.TypeEvaluator
        public final Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            float[] fArr = this.f8169OooO00o;
            matrix.getValues(fArr);
            float[] fArr2 = this.f8170OooO0O0;
            matrix2.getValues(fArr2);
            for (int i = 0; i < 9; i++) {
                float f2 = fArr2[i];
                float f3 = fArr[i];
                fArr2[i] = OooOo.OooO0o.OooO00o(f2, f3, f, f3);
            }
            Matrix matrix3 = this.f8171OooO0OO;
            matrix3.setValues(fArr2);
            return matrix3;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f8166OooO00o = true;
        f8167OooO0O0 = true;
        f8168OooO0OO = i >= 28;
    }
}
