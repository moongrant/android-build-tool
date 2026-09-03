package p077o000Oo;

import Oooo000.OooO00o;
import android.view.animation.Interpolator;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import p167o00Ooo.OooOO0;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO implements Interpolator {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float[] f28314OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f28315OooO0O0;

    public OooO(float[] fArr) {
        this.f28314OooO00o = fArr;
        this.f28315OooO0O0 = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            return ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }
        float[] fArr = this.f28314OooO00o;
        int iMin = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.f28315OooO0O0;
        float fOooO00o = OooOO0.OooO00o(iMin, f2, f, f2);
        float[] fArr2 = this.f28314OooO00o;
        return OooO00o.OooO00o(fArr2[iMin + 1], fArr2[iMin], fOooO00o, fArr2[iMin]);
    }
}
