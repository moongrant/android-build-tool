package p023Oooo00O;

import Oooo000.o000O00O;
import androidx.compose.runtime.Immutable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class o00000O0 implements o0000oo {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f1049OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f1047OooO00o = 0.4f;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f1048OooO0O0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f1050OooO0Oo = 1.0f;

    public o00000O0(float f) {
        this.f1049OooO0OO = f;
    }

    @Override // p023Oooo00O.o0000oo
    public final float OooO00o(float f) {
        float f2 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        if (f > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            float f3 = 1.0f;
            if (f < 1.0f) {
                while (true) {
                    float f4 = (f2 + f3) / 2;
                    float fOooO0O0 = OooO0O0(this.f1047OooO00o, this.f1049OooO0OO, f4);
                    if (Math.abs(f - fOooO0O0) < 0.001f) {
                        return OooO0O0(this.f1048OooO0O0, this.f1050OooO0Oo, f4);
                    }
                    if (fOooO0O0 < f) {
                        f2 = f4;
                    } else {
                        f3 = f4;
                    }
                }
            }
        }
        return f;
    }

    public final float OooO0O0(float f, float f2, float f3) {
        float f4 = 3;
        float f5 = 1 - f3;
        return (f3 * f3 * f3) + (f4 * f2 * f5 * f3 * f3) + (f * f4 * f5 * f5 * f3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof o00000O0) {
            o00000O0 o00000o1 = (o00000O0) obj;
            if (this.f1047OooO00o == o00000o1.f1047OooO00o) {
                if (this.f1048OooO0O0 == o00000o1.f1048OooO0O0) {
                    if (this.f1049OooO0OO == o00000o1.f1049OooO0OO) {
                        if (this.f1050OooO0Oo == o00000o1.f1050OooO0Oo) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f1050OooO0Oo) + o000O00O.OooO00o(this.f1049OooO0OO, o000O00O.OooO00o(this.f1048OooO0O0, Float.floatToIntBits(this.f1047OooO00o) * 31, 31), 31);
    }
}
