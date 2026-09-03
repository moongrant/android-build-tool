package o0OO;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO implements TypeEvaluator<Float> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public FloatEvaluator f37160OooO00o = new FloatEvaluator();

    @Override // android.animation.TypeEvaluator
    public final Float evaluate(float f, Float f2, Float f3) {
        float fFloatValue = this.f37160OooO00o.evaluate(f, (Number) f2, (Number) f3).floatValue();
        if (fFloatValue < 0.1f) {
            fFloatValue = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }
        return Float.valueOf(fFloatValue);
    }
}
