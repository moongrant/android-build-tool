package o0O0o;

import android.opengl.Matrix;
import p245o00oo0o.o0O00000;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float[] f42367OooO00o = new float[16];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float[] f42368OooO0O0 = new float[16];

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0O00000<float[]> f42369OooO0OO = new o0O00000<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f42370OooO0Oo;

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
