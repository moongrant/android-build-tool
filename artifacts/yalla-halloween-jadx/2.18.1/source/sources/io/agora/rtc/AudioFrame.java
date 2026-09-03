package io.agora.rtc;

import OooO00o.OooO00o;
import java.nio.ByteBuffer;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes3.dex */
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
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("AgoraAudioFrame{samples=");
        sbOooO0o0.append(this.samples);
        sbOooO0o0.append(", numOfSamples=");
        sbOooO0o0.append(this.numOfSamples);
        sbOooO0o0.append(", bytesPerSample=");
        sbOooO0o0.append(this.bytesPerSample);
        sbOooO0o0.append(", channels=");
        sbOooO0o0.append(this.channels);
        sbOooO0o0.append(", samplesPerSec=");
        return o0O0ooO.OooO00o(sbOooO0o0, this.samplesPerSec, '}');
    }
}
