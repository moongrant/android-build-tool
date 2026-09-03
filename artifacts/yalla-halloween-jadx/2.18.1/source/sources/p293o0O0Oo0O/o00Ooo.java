package p293o0O0Oo0O;

import androidx.annotation.Nullable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f35776OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f35777OooO0O0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o00Ooo.class != obj.getClass()) {
            return false;
        }
        o00Ooo o00ooo2 = (o00Ooo) obj;
        return this.f35776OooO00o == o00ooo2.f35776OooO00o && Float.compare(o00ooo2.f35777OooO0O0, this.f35777OooO0O0) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f35777OooO0O0) + ((527 + this.f35776OooO00o) * 31);
    }
}
