package Oooo000;

import androidx.compose.runtime.internal.StabilityInferred;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO0OO f797OooO00o = new OooO0OO();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final float[] f798OooO0O0;

    @StabilityInferred(parameters = 0)
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final float f799OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final float f800OooO0O0;

        public OooO00o(float f, float f2) {
            this.f799OooO00o = f;
            this.f800OooO0O0 = f2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return Intrinsics.areEqual((Object) Float.valueOf(this.f799OooO00o), (Object) Float.valueOf(oooO00o.f799OooO00o)) && Intrinsics.areEqual((Object) Float.valueOf(this.f800OooO0O0), (Object) Float.valueOf(oooO00o.f800OooO0O0));
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f800OooO0O0) + (Float.floatToIntBits(this.f799OooO00o) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("FlingResult(distanceCoefficient=");
            sbOooO0o0.append(this.f799OooO00o);
            sbOooO0o0.append(", velocityCoefficient=");
            return OooO0O0.OooO00o(sbOooO0o0, this.f800OooO0O0, ')');
        }
    }

    static {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float[] fArr = new float[101];
        f798OooO0O0 = fArr;
        float[] fArr2 = new float[101];
        float f9 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        float f10 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        for (int i = 0; i < 100; i++) {
            float f11 = i / 100;
            float f12 = 1.0f;
            while (true) {
                f = ((f12 - f9) / 2.0f) + f9;
                f2 = 1.0f - f;
                f3 = f * 3.0f * f2;
                f4 = f * f * f;
                float f13 = (((f * 0.35000002f) + (f2 * 0.175f)) * f3) + f4;
                if (Math.abs(f13 - f11) < 1.0E-5d) {
                    break;
                } else if (f13 > f11) {
                    f12 = f;
                } else {
                    f9 = f;
                }
            }
            float f14 = 0.5f;
            fArr[i] = (((f2 * 0.5f) + f) * f3) + f4;
            float f15 = 1.0f;
            while (true) {
                f5 = ((f15 - f10) / 2.0f) + f10;
                f6 = 1.0f - f5;
                f7 = f5 * 3.0f * f6;
                f8 = f5 * f5 * f5;
                float f16 = (((f6 * f14) + f5) * f7) + f8;
                if (Math.abs(f16 - f11) >= 1.0E-5d) {
                    if (f16 > f11) {
                        f15 = f5;
                    } else {
                        f10 = f5;
                    }
                    f14 = 0.5f;
                }
            }
            fArr2[i] = (((f5 * 0.35000002f) + (f6 * 0.175f)) * f7) + f8;
        }
        fArr2[100] = 1.0f;
        fArr[100] = fArr2[100];
    }

    @NotNull
    public final OooO00o OooO00o(float f) {
        float fOooO00o;
        float f2;
        float f3 = 100;
        int i = (int) (f3 * f);
        if (i < 100) {
            float f4 = i / f3;
            int i2 = i + 1;
            float f5 = i2 / f3;
            float[] fArr = f798OooO0O0;
            float f6 = fArr[i];
            f2 = (fArr[i2] - f6) / (f5 - f4);
            fOooO00o = Oooo000.OooO00o.OooO00o(f, f4, f2, f6);
        } else {
            fOooO00o = 1.0f;
            f2 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }
        return new OooO00o(fOooO00o, f2);
    }
}
