package io.agora.rtc.live;

import com.uc.crashsdk.export.LogType;
import com.yalla.yalla.common.model.ShopVehicleListModel;

/* JADX INFO: loaded from: classes3.dex */
public class LiveInjectStreamConfig {
    public int width = 0;
    public int height = 0;
    public int videoGop = 30;
    public int videoFramerate = 15;
    public int videoBitrate = ShopVehicleListModel.VehicleTagType_Vip400;
    public AudioSampleRateType audioSampleRate = AudioSampleRateType.TYPE_44100;
    public int audioBitrate = 48;
    public int audioChannels = 1;

    public enum AudioSampleRateType {
        TYPE_32000(LogType.UNEXP_KNOWN_REASON),
        TYPE_44100(44100),
        TYPE_48000(48000);

        private int value;

        AudioSampleRateType(int i) {
            this.value = i;
        }

        public static int getValue(AudioSampleRateType audioSampleRateType) {
            return audioSampleRateType.value;
        }
    }
}
