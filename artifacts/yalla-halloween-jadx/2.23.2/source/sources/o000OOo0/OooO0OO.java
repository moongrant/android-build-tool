package o000OOo0;

import android.opengl.Matrix;
import p080o000OoO.o000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float[] f34614OooO00o = new float[16];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float[] f34615OooO0O0 = new float[16];

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000O0<float[]> f34616OooO0OO = new o000O0<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f34617OooO0Oo;

    public static void OooO00o(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        float f3 = fArr2[10];
        fArr[0] = f3 / fSqrt;
        float f4 = fArr2[8];
        fArr[2] = f4 / fSqrt;
        fArr[8] = (-f4) / fSqrt;
        fArr[10] = f3 / fSqrt;
    }
}
