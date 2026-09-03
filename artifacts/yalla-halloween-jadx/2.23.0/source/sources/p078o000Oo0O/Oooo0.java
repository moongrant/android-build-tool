package p078o000Oo0O;

import OooOo.OooO0o;
import android.animation.TypeEvaluator;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 implements TypeEvaluator<float[]> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float[] f34927OooO00o;

    public Oooo0(float[] fArr) {
        this.f34927OooO00o = fArr;
    }

    @Override // android.animation.TypeEvaluator
    public final float[] evaluate(float f, float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        float[] fArr5 = this.f34927OooO00o;
        if (fArr5 == null) {
            fArr5 = new float[fArr3.length];
        }
        for (int i = 0; i < fArr5.length; i++) {
            float f2 = fArr3[i];
            fArr5[i] = OooO0o.OooO00o(fArr4[i], f2, f, f2);
        }
        return fArr5;
    }
}
