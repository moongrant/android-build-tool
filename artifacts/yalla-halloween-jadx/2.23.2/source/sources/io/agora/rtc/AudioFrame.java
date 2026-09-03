package io.agora.rtc;

import androidx.compose.foundation.layout.OooO0O0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public class AudioFrame {
    public int bytesPerSample;
    public int channels;
    public int numOfSamples;
    public ByteBuffer samples;
    public int samplesPerSec;

    public AudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        this.samples = byteBuffer;
        this.numOfSamples = i;
        this.bytesPerSample = i2;
        this.channels = i3;
        this.samplesPerSec = i4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AgoraAudioFrame{samples=");
        sb.append(this.samples);
        sb.append(", numOfSamples=");
        sb.append(this.numOfSamples);
        sb.append(", bytesPerSample=");
        sb.append(this.bytesPerSample);
        sb.append(", channels=");
        sb.append(this.channels);
        sb.append(", samplesPerSec=");
        return OooO0O0.OooO00o(sb, this.samplesPerSec, '}');
    }
}
