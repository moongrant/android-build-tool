package io.agora.rtc.audio;

/* JADX INFO: loaded from: classes5.dex */
public class AudioParams {
    public int channel;
    public int mode;
    public int sampleRate;
    public int samplesPerCall;

    public AudioParams(int i, int i2, int i3, int i4) {
        this.sampleRate = i;
        this.channel = i2;
        this.mode = i3;
        this.samplesPerCall = i4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioParams{sampleRate=");
        sb.append(this.sampleRate);
        sb.append(", channel=");
        sb.append(this.channel);
        sb.append(", mode=");
        sb.append(this.mode);
        sb.append(", samplesPerCall=");
        return androidx.compose.foundation.layout.OooO0O0.OooO00o(sb, this.samplesPerCall, '}');
    }
}
