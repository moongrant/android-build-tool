package io.agora.rtc.audio;

import OooO00o.OooO00o;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes3.dex */
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
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("AudioParams{sampleRate=");
        sbOooO0o0.append(this.sampleRate);
        sbOooO0o0.append(", channel=");
        sbOooO0o0.append(this.channel);
        sbOooO0o0.append(", mode=");
        sbOooO0o0.append(this.mode);
        sbOooO0o0.append(", samplesPerCall=");
        return o0O0ooO.OooO00o(sbOooO0o0, this.samplesPerCall, '}');
    }
}
