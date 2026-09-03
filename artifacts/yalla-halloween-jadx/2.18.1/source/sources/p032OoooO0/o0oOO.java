package p032OoooO0;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o0oOO extends Lambda implements Function1<Float, Float> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oo00oO f3381Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oOO(oo00oO oo00oo) {
        super(1);
        this.f3381Oooo0o = oo00oo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Float invoke(Float f) {
        float fFloatValue = f.floatValue();
        float fOooO0O0 = this.f3381Oooo0o.OooO0O0() + fFloatValue;
        if (fOooO0O0 > this.f3381Oooo0o.OooO00o()) {
            fFloatValue = this.f3381Oooo0o.OooO00o() - this.f3381Oooo0o.OooO0O0();
        } else if (fOooO0O0 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            fFloatValue = -this.f3381Oooo0o.OooO0O0();
        }
        oo00oO oo00oo = this.f3381Oooo0o;
        oo00oo.OooO0Oo(oo00oo.OooO0O0() + fFloatValue);
        return Float.valueOf(fFloatValue);
    }
}
