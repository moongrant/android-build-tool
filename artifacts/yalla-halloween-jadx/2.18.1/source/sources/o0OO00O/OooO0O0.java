package o0OO00O;

import androidx.compose.runtime.internal.StabilityInferred;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import o0000O0O.o00oO0o;
import o00O0O.OooO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooO00o[] f37207OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f37208OooO0O0;

    public OooO0O0() {
        OooO00o[] oooO00oArr = new OooO00o[20];
        for (int i = 0; i < 20; i++) {
            oooO00oArr[i] = null;
        }
        this.f37207OooO00o = oooO00oArr;
    }

    public final void OooO00o(long j, long j2) {
        int i = (this.f37208OooO0O0 + 1) % 20;
        this.f37208OooO0O0 = i;
        this.f37207OooO00o[i] = new OooO00o(j2, j);
    }

    public final long OooO0O0() {
        int i;
        OooO00o[] oooO00oArr = this.f37207OooO00o;
        int i2 = this.f37208OooO0O0;
        OooO00o oooO00o = oooO00oArr[i2];
        if (oooO00o == null) {
            return o00oO0o.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        }
        int i3 = 1;
        OooO00o oooO00o2 = oooO00o;
        long j = Long.MAX_VALUE;
        float f = Float.NaN;
        float f2 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        boolean z = true;
        long j2 = Long.MAX_VALUE;
        float f3 = Float.NaN;
        float f4 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        int i4 = 0;
        boolean z2 = true;
        while (true) {
            i2 = (i2 + i3) % 20;
            OooO00o oooO00o3 = this.f37207OooO00o[i2];
            if (oooO00o3 != null) {
                long j3 = oooO00o.f37206OooO0O0;
                long j4 = oooO00o3.f37206OooO0O0;
                long j5 = j3 - j4;
                long jAbs = Math.abs(j4 - oooO00o2.f37206OooO0O0);
                if (j5 > 100) {
                    oooO00o2 = oooO00o;
                } else {
                    if (jAbs > 40) {
                        j = Long.MAX_VALUE;
                        f = Float.NaN;
                        f2 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                        z = true;
                        j2 = Long.MAX_VALUE;
                        f3 = Float.NaN;
                        f4 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                        z2 = true;
                    }
                    long j6 = -j5;
                    float fOooO0OO = OooO.OooO0OO(oooO00o3.f37205OooO00o);
                    if (j == Long.MAX_VALUE || Float.isNaN(f)) {
                        j = j6;
                    } else if (j6 != j) {
                        float f5 = (fOooO0OO - f) / ((j6 - j) * 0.001f);
                        float fAbs = (Math.abs(f5) * (f5 - OooO0OO.OooO00o(f2))) + f2;
                        if (z) {
                            f2 = fAbs * 0.5f;
                            z = false;
                        } else {
                            f2 = fAbs;
                        }
                        j = j6;
                    }
                    float fOooO0Oo = OooO.OooO0Oo(oooO00o3.f37205OooO00o);
                    if (j2 == Long.MAX_VALUE || Float.isNaN(f3)) {
                        j2 = j6;
                    } else if (j6 != j2) {
                        float f6 = (fOooO0Oo - f3) / ((j6 - j2) * 0.001f);
                        float fAbs2 = (Math.abs(f6) * (f6 - OooO0OO.OooO00o(f4))) + f4;
                        if (z2) {
                            fAbs2 *= 0.5f;
                            z2 = false;
                        }
                        j2 = j6;
                        f4 = fAbs2;
                    }
                    i4++;
                    oooO00o2 = oooO00o;
                    f3 = fOooO0Oo;
                    f = fOooO0OO;
                }
            }
            i = i4;
            if (i2 == this.f37208OooO0O0 || i >= 20) {
                break;
            }
            i4 = i;
            i3 = 1;
        }
        return i < 3 ? o00oO0o.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) : o00oO0o.OooO00o(OooO0OO.OooO00o(f2), OooO0OO.OooO00o(f4));
    }
}
