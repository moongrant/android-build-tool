package o0O00O;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO implements TypeEvaluator<Float> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final FloatEvaluator f41666OooO00o = new FloatEvaluator();

    @Override // android.animation.TypeEvaluator
    public final Float evaluate(float f, Float f2, Float f3) {
        float fFloatValue = this.f41666OooO00o.evaluate(f, (Number) f2, (Number) f3).floatValue();
        if (fFloatValue < 0.1f) {
            fFloatValue = 0.0f;
        }
        return Float.valueOf(fFloatValue);
    }
}
