package p466o0OooO0;

import androidx.annotation.Nullable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O00 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o000O00 f40530OooO0Oo = new o000O00(1.0f, 1.0f);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f40531OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f40532OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f40533OooO0OO;

    public o000O00(float f, float f2) {
        o00000O0.OooO00o(f > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        o00000O0.OooO00o(f2 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        this.f40531OooO00o = f;
        this.f40532OooO0O0 = f2;
        this.f40533OooO0OO = Math.round(f * 1000.0f);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o000O00.class != obj.getClass()) {
            return false;
        }
        o000O00 o000o01 = (o000O00) obj;
        return this.f40531OooO00o == o000o01.f40531OooO00o && this.f40532OooO0O0 == o000o01.f40532OooO0O0;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f40532OooO0O0) + ((Float.floatToRawIntBits(this.f40531OooO00o) + 527) * 31);
    }

    public final String toString() {
        return o000OOo0.OooOO0O("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f40531OooO00o), Float.valueOf(this.f40532OooO0O0));
    }
}
